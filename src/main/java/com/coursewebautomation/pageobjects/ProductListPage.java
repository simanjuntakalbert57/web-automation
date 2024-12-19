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
