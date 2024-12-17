package stepDefenitions;

import java.io.IOException;

import org.testng.Assert;

import com.coursewebautomation.pageobjects.CartPage;
import com.coursewebautomation.pageobjects.CheckoutPage;
import com.coursewebautomation.pageobjects.ConfirmationPage;
import com.coursewebautomation.pageobjects.LandingPage;
import com.coursewebautomation.pageobjects.OrderPage;
import com.coursewebautomation.pageobjects.ProductListPage;

import components.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenitionsImpl extends BaseTest {
    public LandingPage landingPage;

    @Given("Buyer landing to ecommerce")
    public void landingPage() throws IOException{
        landingPage = launchApplication();
    }

    @Given("^Buyer logged to website email (.+) and password (.+)$")
    public void buyerLogin(String username, String password){
        landingPage.loginApplication(username, password);
    }

    @When("^I add product (.+) to Create$")
    public void buyerAddProduct(String productName) throws InterruptedException{
       ProductListPage productListPage = new ProductListPage(driver);
       productListPage.addProduct(productName);
       landingPage.goToCart();
       CartPage cartPage = new CartPage(driver);
       Boolean match = cartPage.verifyCheckoutProduct(productName);
       Assert.assertTrue(match);
       cartPage.goToCheckoutPage();
    }

    @And("^I checkout (.+) and submit order$")
    public void checkoutProduct(String productName){
       CheckoutPage checkoutPage = new CheckoutPage(driver);
       checkoutPage.selectCountry("Indonesia");
       checkoutPage.submitOrder();
    }

    @Then("{string} message is displayed on confirmation page")
    public void verifyConfirmationMessage(String message){
       ConfirmationPage confirmationMessage = new ConfirmationPage(driver);
       Assert.assertTrue(confirmationMessage.getConfirmationMessage().equals(message));
    }

    @When("I go to {string}")
    public void redirectHeader(String destination){
        if (destination.equals("OrderPage")) {
            landingPage.goToOrders();
        }
    }

    @Then("^Verify (.+) exist in order history$")
    public void verifyProductOrder(String productName){
        OrderPage orderPage = new OrderPage(driver);
        Assert.assertTrue(orderPage.verifyOrderDisplay(productName));
    }
}
