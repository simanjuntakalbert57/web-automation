import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
    public static void main(String[] args) throws InterruptedException {
        // Setup seleniumchromedriver
        System.setProperty("webdriver.chrome.driver","<file_path_chromedriver>");
        WebDriver driver = new ChromeDriver();

        // driver.manage().window().setSize(new Dimension(390, 844));

        //setup link website
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Get by Id and name
        driver.findElement(By.id("inputUsername")).sendKeys("after office");
        driver.findElement(By.name("inputPassword")).sendKeys("password");

        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();

        // Get by class
        //<button class="submit signInBtn" type="submit" xpath="1">Sign In</button>
        driver.findElement(By.className("signInBtn")).click();

        //Get by css element
        // driver.findElement(By.cssSelector("p.error"));

        Thread.sleep(1000);
        System.out.println("error ini"+driver.findElement(By.cssSelector("p.error")).getText());

        // Get by linktext
        driver.findElement(By.linkText("Forgot your password?")).click();

        //Get by xpath
        driver.findElement(By.xpath("//*[@placeholder = 'Name']")).sendKeys("after office");

        driver.findElement(By.xpath("//*[@placeholder = 'Email']")).sendKeys("after office");

        driver.findElement(By.xpath("//form/input[3]")).sendKeys("08314141");

        driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();;

        Thread.sleep(1000);
        System.out.println("Hasil" + driver.findElement(By.xpath("p.infoMsg")));

        Thread.sleep(1000);

        driver.close();
    }
}
