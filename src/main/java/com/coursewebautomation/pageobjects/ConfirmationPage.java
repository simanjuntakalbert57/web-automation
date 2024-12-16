package com.coursewebautomation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coursewebautomation.abstractcomponents.AbstractComponent;

public class ConfirmationPage extends AbstractComponent {
    WebDriver driver;

    public ConfirmationPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".hero-primary")
    WebElement headerConfirmation;

    By heroPrimary = By.cssSelector(".hero-primary");

    /*
     *  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".hero-primary")));

        String confirmationMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
     */

    public String getConfirmationMessage(){
        waitForVisibilityElement(heroPrimary);
        String confirmationMessage = headerConfirmation.getText();

        return confirmationMessage;
    }
}
