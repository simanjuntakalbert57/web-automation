package com.coursewebautomation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;
    /*
     * 1. Menyimpan element
     * 2. Hanya untuk melakukan action
     * 3. Disarankan tidak digunakan untuk melakukan assertion
     */

    /*
     *  driver.findElement(By.id("userEmail")).sendKeys("simanjuntakalbert57@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("XBf@rWNvByn!#K8");

        driver.findElement(By.id("login")).click();
     */

    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userPassword")
    WebElement userPassword;

    @FindBy(id = "login")
    WebElement login;

    public void loginApplication(String username, String password){
        userEmail.sendKeys(username);
        userPassword.sendKeys(password);

        login.click();
    }
}
