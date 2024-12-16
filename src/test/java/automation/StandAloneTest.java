package automation;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.coursewebautomation.pageobjects.CartPage;
import com.coursewebautomation.pageobjects.CheckoutPage;
import com.coursewebautomation.pageobjects.ConfirmationPage;
import com.coursewebautomation.pageobjects.LandingPage;
import com.coursewebautomation.pageobjects.ProductListPage;

public class StandAloneTest {
    public static void main(String[] args) throws InterruptedException {
         // Setup seleniumchromedriver
        System.setProperty("webdriver.chrome.driver","/Users/bytedance/CourseQAAutomation/Web Automation/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        

        

        //Scenario login
        // driver.findElement(By.id("userEmail")).sendKeys("simanjuntakalbert57@gmail.com");
        // driver.findElement(By.id("userPassword")).sendKeys("XBf@rWNvByn!#K8");

        // driver.findElement(By.id("login")).click();

        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();
        landingPage.loginApplication("simanjuntakalbert57@gmail.com", "XBf@rWNvByn!#K8");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String productName = "ZARA COAT 3";
        //verify list product is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

        
        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

        WebElement product = products.stream().filter(prod -> 
        prod.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);

        product.findElement(By.cssSelector(".card-body button:last-of-type")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();

        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cartSection h3")));

        List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));

        Boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));

        Assert.assertTrue(match);

        driver.findElement(By.cssSelector(".totalRow button")).click();

        Actions action = new Actions(driver);

        action.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"ind").build().perform();

        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

        String destination = "Indonesia";

        List<WebElement> countries = driver.findElements(By.xpath("//span[@class='ng-star-inserted']"));

        WebElement country = countries.stream().filter(cont -> cont.getText().equalsIgnoreCase(destination)).findFirst().orElse(null);

        country.click();

        driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();

        driver.findElement(By.cssSelector(".action__submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".hero-primary")));

        String confirmationMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
        
        Assert.assertTrue(confirmationMessage.equals("THANKYOU FOR THE ORDER."));

        driver.quit();

    }
}
