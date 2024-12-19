package stepdefenitions;

import java.io.IOException;

import org.testng.Assert;

import com.coursewebautomation.pageobjects.CartPage;
import com.coursewebautomation.pageobjects.CheckoutPage;
import com.coursewebautomation.pageobjects.ConfirmationPage;
import com.coursewebautomation.pageobjects.LandingPage;
import com.coursewebautomation.pageobjects.ProductListPage;

import components.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenitionImpl extends BaseTest {
    public LandingPage landingPage;

    @Given("Buyer landing to ecommerce")
    public void landingPage() throws IOException{
        landingPage = lauchApplication();
    }

    @Given("^Buyer logged to website email (.+) and password (.+)")
    public void buyerLogin(String userEmail, String password){
        landingPage.loginApplication(userEmail, password);
    }

    @When("^I add product (.+) to Create")
    public void buyerAddProduct(String productName) throws InterruptedException{
        // scenario add product
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.addProduct(productName);
        landingPage.goToCart();

        // scenario cartpage
        CartPage cartPage = new CartPage(driver);
        Boolean match = cartPage.verifyCheckoutProduct(productName);
        Assert.assertTrue(match);
        cartPage.goToCheckoutPage();
    }

    @And("^I checkout (.+) and submit order")
    public void buyerCheckoutProduct(String productName) throws Exception{
        // scenario checkout
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.selectCountry("Indonesia");
        checkoutPage.submitOrder();

    }

    @Then("{string} message is displayed on confirmation page")
    public void verifyConfirmationMessage(String message) throws InterruptedException{
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        Assert.assertTrue(confirmationPage.getConfirmationMessage().equals(message));
    }
}
