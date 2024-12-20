package com.coursewebautomation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coursewebautomation.abstractcomponents.AbstractComponent;


public class CartPage extends AbstractComponent {
    WebDriver driver;

    // add some dummy textewrwrf
    public CartPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".cartSection h3")
    List<WebElement> listProduct;

    @FindBy(css = ".totalRow button")
    WebElement checkoutButton;

    By cartSection = By.cssSelector(".cartSection h3");

    public List<WebElement> getProductCheckout(){
        waitForVisibilityElement(cartSection);
        return listProduct;
    }

    public Boolean verifyCheckoutProduct(String productName) throws InterruptedException{
        
        List<WebElement> listProduct = getProductCheckout();

        Boolean match = listProduct.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));

        return match;
    }

    public void goToCheckoutPage(){
        checkoutButton.click();
    }
}
