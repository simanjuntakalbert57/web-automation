package automation;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.coursewebautomation.pageobjects.CartPage;
import com.coursewebautomation.pageobjects.CheckoutPage;
import com.coursewebautomation.pageobjects.ConfirmationPage;
import com.coursewebautomation.pageobjects.LandingPage;
import com.coursewebautomation.pageobjects.OrderPage;
import com.coursewebautomation.pageobjects.ProductListPage;

import components.BaseTest;

public class StandAloneNGTest extends BaseTest{
    String productName = "ZARA COAT 3";


    @Test(dataProvider = "getData")
    public void createOrder(HashMap<String, String> input) throws InterruptedException, IOException {
        // Setup seleniumchromedriver
      

       LandingPage landingPage = launchApplication();

    //    landingPage.loginApplication("simanjuntakalbert57@gmail.com", "XBf@rWNvByn!#K8");

       landingPage.loginApplication(input.get("email"), input.get("password"));

       ProductListPage productListPage = new ProductListPage(driver);

       productListPage.addProduct(input.get("productName"));

       landingPage.goToCart();   
       
       CartPage cartPage = new CartPage(driver);

       Boolean match = cartPage.verifyCheckoutProduct(input.get("productName"));

       Assert.assertTrue(match);

       cartPage.goToCheckoutPage();

       CheckoutPage checkoutPage = new CheckoutPage(driver);
       checkoutPage.selectCountry("Indonesia");
       checkoutPage.submitOrder();

       ConfirmationPage confirmationMessage = new ConfirmationPage(driver);
       
       Assert.assertTrue(confirmationMessage.getConfirmationMessage().equals("THANKYOU FOR THE ORDER."));

       driver.close();

   }

   @Test(dependsOnMethods = {"createOrder"})
   public void OrderHistory() throws IOException{
        LandingPage landingPage = launchApplication();
        landingPage.loginApplication("simanjuntakalbert57@gmail.com", "XBf@rWNvByn!#K8");
        OrderPage orderPage = new OrderPage(driver);
        landingPage.goToOrders();
        Assert.assertTrue(orderPage.verifyOrderDisplay(productName));
   }

   @DataProvider
   public Object[][] getData(){
        HashMap<String, String> map= new HashMap<String, String>();
        map.put("email", "simanjuntakalbert57@gmail.com");
        map.put("password", "XBf@rWNvByn!#K8");
        map.put("productName", "ZARA COAT 3");

        return new Object[][] {{map}};
   }

}
