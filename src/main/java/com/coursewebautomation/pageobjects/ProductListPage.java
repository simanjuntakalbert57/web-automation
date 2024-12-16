package com.coursewebautomation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v129.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coursewebautomation.abstractcomponents.AbstractComponent;

public class ProductListPage extends AbstractComponent {
    WebDriver driver;
    WebElement product;

    public ProductListPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".mb-3")
    List<WebElement>products;

    @FindBy(css = "..ng-animating")
    WebElement loadingAnimation;

    By productsBy = By.cssSelector(".mb-3");
    By cartButton = By.cssSelector(".card-body button:last-of-type");
    By toastContainer = By.id("toast-container");

    public List<WebElement> getProductList(){
        waitForVisibilityElement(productsBy);
        return products;
    }

    public WebElement getProductByName(String productName){
        WebElement product = getProductList().stream().filter(prod -> 
        prod.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);

        return product;
    }

    public void addProduct(String productName) throws InterruptedException{
        product = getProductByName(productName);
        product.findElement(cartButton).click();

        Thread.sleep(2000);

        waitForVisibilityElement(toastContainer);
        // waitForInvisibilityElement(toastContainer);
    }
}
