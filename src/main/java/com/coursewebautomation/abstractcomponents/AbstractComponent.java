package com.coursewebautomation.abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

    WebDriver driver;
    public AbstractComponent(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(css = "[routerlink*='cart']")
    WebElement cartButton;

    @FindBy(css="[routerlink='/dashboard/myorders']")
    WebElement cartOrders;

    By orderHeader = By.cssSelector("[routerlink='/dashboard/myorders']");

    public void waitForVisibilityElement(By findBy){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    public void goToCart(){
        cartButton.click();
    }

    public void goToOrderPage() throws InterruptedException{
        waitForVisibilityElement(orderHeader);
        cartOrders.click();
    }
}
