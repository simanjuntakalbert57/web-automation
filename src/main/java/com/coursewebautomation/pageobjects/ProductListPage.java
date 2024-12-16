package com.coursewebautomation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
    
    WebDriver driver;
    WebElement product;

    public ProductListPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }

    /*
     * //Scenario productlist
        String productName = "ZARA COAT 3";
        //verify list product is visible
       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

        
        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

        WebElement product = products.stream().filter(prod -> 
        prod.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);

        product.findElement(By.cssSelector(".card-body button:last-of-type")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
     */

    @FindBy(css = ".mb-3")
    List<WebElement> productList;

    By cartButton = By.cssSelector(".card-body button:last-of-type");
    By titleProduct = By.cssSelector("b");


    public List<WebElement> getProductList() throws InterruptedException{
        Thread.sleep(2000);
        return productList;
    }

    public WebElement getProductByName(String productName) throws InterruptedException{
        WebElement product = getProductList().stream().filter(prod -> 
        prod.findElement(titleProduct).getText().equals(productName)).findFirst().orElse(null);

        return product;
    }

    public void addProduct(String productName) throws InterruptedException{
        product = getProductByName(productName);

        product.findElement(cartButton).click();

        Thread.sleep(2000);

    }
}
