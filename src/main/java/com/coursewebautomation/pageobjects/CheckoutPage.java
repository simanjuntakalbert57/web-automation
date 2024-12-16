package com.coursewebautomation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coursewebautomation.abstractcomponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent {
    WebDriver driver;

    public CheckoutPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="[placeholder='Select Country']")
    WebElement inputCountry;

    @FindBy(xpath ="//span[@class='ng-star-inserted']")
    List<WebElement> countryInserted;

    @FindBy(css=".action__submit")
    WebElement submitButton;

    By listCountries = By.cssSelector(".ta-results");

    public WebElement getSelectedCountry(String countryName){
        WebElement country = countryInserted.stream().filter(cont -> cont.getText().equalsIgnoreCase(countryName)).findFirst().orElse(null);

        return country;
    }

    public void selectCountry(String countryName){
        Actions action = new Actions(driver);
        action.sendKeys(inputCountry,countryName).build().perform();
        waitForVisibilityElement(listCountries);
        getSelectedCountry(countryName).click();  
    }

    public void submitOrder(){
        submitButton.click();
    }
    
    
}
