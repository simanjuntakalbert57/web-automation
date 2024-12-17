package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.coursewebautomation.pageobjects.CartPage;
import com.coursewebautomation.pageobjects.CheckoutPage;
import com.coursewebautomation.pageobjects.ConfirmationPage;
import com.coursewebautomation.pageobjects.LandingPage;
import com.coursewebautomation.pageobjects.ProductListPage;


public class StandAloneTestPO {
    public static void main(String[] args) throws InterruptedException {
        // data
        String productName = "ZARA COAT 3";     
        String coutryString = "Indonesia";

        // Setup seleniumchromedriver
        System.setProperty("webdriver.chrome.driver","/Users/bytedance/CourseQAAutomation/Web Automation/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client");

        // scenario login
        LandingPage landingPage = new LandingPage(driver);
        landingPage.loginApplication("simanjuntakalbert57@gmail.com", "XBf@rWNvByn!#K8");

        // scenario add product
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.addProduct(productName);
        landingPage.goToCart();

        // scenario cartpage
        CartPage cartPage = new CartPage(driver);
        Boolean match = cartPage.verifyCheckoutProduct(productName);
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
}
