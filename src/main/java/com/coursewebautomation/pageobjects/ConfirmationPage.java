package com.coursewebautomation.pageobjects;

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

    /*
     *  String confirmationPage = driver.findElement(By.cssSelector(".hero-primary")).getText();
     */

    @FindBy(css = ".hero-primary")
    WebElement headerConfirmation;

    By heroPrimary = By.cssSelector(".hero-primary");

    public String getConfirmationMessage() throws InterruptedException{
        waitForVisibilityElement(heroPrimary);
        return headerConfirmation.getText();
    }


}
