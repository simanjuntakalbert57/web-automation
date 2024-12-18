package com.coursewebautomation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coursewebautomation.abstractcomponents.AbstractComponent;

public class OrderPage extends AbstractComponent{
    WebDriver driver;

    @FindBy(css = "tr td:nth-child(3)")
    private List<WebElement> cardProducts;

    By listOrder = By.cssSelector("tr td:nth-child(3)");

    public OrderPage(WebDriver driver){
            super(driver);
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }

    public Boolean verifyOrderDisplay(String productName){
        waitForVisibilityElement(listOrder);
        Boolean match = cardProducts.stream().anyMatch(product -> product.getText().equalsIgnoreCase(productName));
        return match;
    }
}
