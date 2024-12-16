package com.coursewebautomation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v129.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coursewebautomation.abstractcomponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
    WebDriver driver;

    public LandingPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(id="userPassword")
    WebElement userPassword;

    @FindBy(id="login")
    WebElement login;



    public void loginApplication(String email, String password){
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);

        login.click();
    }

    public void goTo(){
        driver.get("https://rahulshettyacademy.com/client");
    }
    

}
