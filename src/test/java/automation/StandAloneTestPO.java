package automation;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.coursewebautomation.pageobjects.CartPage;
import com.coursewebautomation.pageobjects.CheckoutPage;
import com.coursewebautomation.pageobjects.ConfirmationPage;
import com.coursewebautomation.pageobjects.LandingPage;
import com.coursewebautomation.pageobjects.ProductListPage;

import components.BaseTest;

public class StandAloneTestPO extends BaseTest{
    // public static void main(String[] args) throws InterruptedException {
    //      // Setup seleniumchromedriver
    //     String productName = "ZARA COAT 3";
         
    //     // System.setProperty("webdriver.chrome.driver","/Users/bytedance/CourseQAAutomation/Web Automation/chromedriver");
    //     // WebDriver driver = new ChromeDriver();
    //     // driver.manage().window().maximize();

    //     // LandingPage landingPage = new LandingPage(driver);
    //     // landingPage.goTo();

    //     LandingPage landingPage = launchApplication();

    //     landingPage.loginApplication("simanjuntakalbert57@gmail.com", "XBf@rWNvByn!#K8");


    //     ProductListPage productListPage = new ProductListPage(driver);

    //     productListPage.addProduct(productName);

    //     landingPage.goToCart();   
        
    //     CartPage cartPage = new CartPage(driver);

    //     Boolean match = cartPage.verifyCheckoutProduct(productName);

    //     Assert.assertTrue(match);

    //     cartPage.goToCheckoutPage();

    //     CheckoutPage checkoutPage = new CheckoutPage(driver);
    //     checkoutPage.selectCountry("Indonesia");
    //     checkoutPage.submitOrder();

    //     ConfirmationPage confirmationMessage = new ConfirmationPage(driver);
        
    //     Assert.assertTrue(confirmationMessage.getConfirmationMessage().equals("THANKYOU FOR THE ORDER."));

    //     driver.close();

    // }


    @Test
    public void createOrder() throws InterruptedException, IOException {
        // Setup seleniumchromedriver
       String productName = "ZARA COAT 3";

       LandingPage landingPage = launchApplication();

       landingPage.loginApplication("simanjuntakalbert57@gmail.com", "XBf@rWNvByn!#K8");

       ProductListPage productListPage = new ProductListPage(driver);

       productListPage.addProduct(productName);

       landingPage.goToCart();   
       
       CartPage cartPage = new CartPage(driver);

       Boolean match = cartPage.verifyCheckoutProduct(productName);

       Assert.assertTrue(match);

       cartPage.goToCheckoutPage();

       CheckoutPage checkoutPage = new CheckoutPage(driver);
       checkoutPage.selectCountry("Indonesia");
       checkoutPage.submitOrder();

       ConfirmationPage confirmationMessage = new ConfirmationPage(driver);
       
       Assert.assertTrue(confirmationMessage.getConfirmationMessage().equals("THANKYOU FOR THE ORDER."));

       driver.close();

   }
}
