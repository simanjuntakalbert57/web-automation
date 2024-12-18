package automation;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
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


public class StandAloneTestPO extends BaseTest {
    String coutryString = "Indonesia";

    @Test(dataProvider = "getData")
    public void submitOrder(HashMap<String, String>inputMap) throws InterruptedException, IOException{

        // scenario login
        LandingPage landingPage = lauchApplication();
        landingPage.loginApplication(inputMap.get("email"), inputMap.get("password"));

        // scenario add product
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.addProduct(inputMap.get("productName"));
        landingPage.goToCart();

        // scenario cartpage
        CartPage cartPage = new CartPage(driver);
        Boolean match = cartPage.verifyCheckoutProduct(inputMap.get("productName"));
        Assert.assertTrue(match);
        cartPage.goToCheckoutPage();

        // scenario checkout
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.selectCountry(coutryString);
        checkoutPage.submitOrder();

        // scenario confirmation page
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        Assert.assertTrue(confirmationPage.getConfirmationMessage().equals("THANKYOU FOR THE ORDER."));

        driver.quit();
    }

    @Test(dependsOnMethods = {"submitOrder"}, dataProvider = "getData")
    public void OrderHistory(HashMap<String, String>inputMap) throws IOException, InterruptedException{  

        // scenario login
        LandingPage landingPage = lauchApplication();
        landingPage.loginApplication(inputMap.get("email"), inputMap.get("password"));
        OrderPage orderPage = new OrderPage(driver);

        landingPage.goToOrderPage();
        Assert.assertTrue(orderPage.verifyOrderDisplay(inputMap.get("productName")));
    }

    @DataProvider
    public Object[][] getData(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("email", "simanjuntakalbert57@gmail.com");
        map.put("password", "XBf@rWNvByn!#K8");
        map.put("productName", "ADIDAS ORIGINAL");

        return new Object[][] {{map}};
    }
}
