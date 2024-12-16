package automation;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.coursewebautomation.pageobjects.LandingPage;
import com.coursewebautomation.pageobjects.ProductListPage;


public class StandAloneTestPO {
    public static void main(String[] args) throws InterruptedException {
         // Setup seleniumchromedriver
        System.setProperty("webdriver.chrome.driver","/Users/bytedance/CourseQAAutomation/Web Automation/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/client");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String productName = "ZARA COAT 3"; 

        
        //Scenario login
        // driver.findElement(By.id("userEmail")).sendKeys("simanjuntakalbert57@gmail.com");
        // driver.findElement(By.id("userPassword")).sendKeys("XBf@rWNvByn!#K8");

        // driver.findElement(By.id("login")).click();

        // String userEmail = "simanjuntakalbert57"+randInt+"@gmail.com";

        //token -> never expired
        //login utk token 

        /*
         * 1. Preconditin di automation , add scenario untuk menambahkan/ increase barang -> seller side -> sebuah API utk increate stock (2000)
         * 2. then run automation for checkout -> buyer side -> e2e test (2)
         */

        LandingPage landingPage = new LandingPage(driver);
        landingPage.loginApplication("simanjuntakalbert57@gmail.com", "XBf@rWNvByn!#K8");


    


        //Scenario productlist
        // String productName = "ZARA COAT 3";
        // //verify list product is visible
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

        
        // List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

        // WebElement product = products.stream().filter(prod -> 
        // prod.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);

        // product.findElement(By.cssSelector(".card-body button:last-of-type")).click();

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));

        // wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));

        ProductListPage productListPage = new ProductListPage(driver);
        
        productListPage.addProduct(productName);

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();

        
        // scenario cartpage
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cartSection h3")));

        List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));

        Boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));

        Assert.assertTrue(match);

        driver.findElement(By.cssSelector(".totalRow button")).click();

        // scenario checkout
        Actions action = new Actions(driver);

        action.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"ind").build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

        // driver.findElement(By.xpath("//*[@class='ta-results list-group ng-star-inserted']/child::button[2]")).click();


        /*
         * Melakukan looping untuk mencari negara yang diinginkan
         * 
         * String country = Indonesia
         * if (element.gettext() == "indonesia")
         * element.click()
         */

        String couString = "Indonesia";

        List<WebElement> countries = driver.findElements(By.xpath("//span[@class='ng-star-inserted']"));

        System.out.println(countries.size());

        WebElement country = countries.stream().filter(cont -> cont.getText().equalsIgnoreCase(couString)).findFirst().orElse(null);

        country.click();

        driver.findElement(By.cssSelector(".action__submit")).click();


        // Scenario confirmation page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".hero-primary")));

        String confirmationPage = driver.findElement(By.cssSelector(".hero-primary")).getText();

        Assert.assertTrue(confirmationPage.equals("THANKYOU FOR THE ORDER."));


        driver.quit();

    }
}
