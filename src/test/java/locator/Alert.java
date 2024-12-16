package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","<file_path_chromedriver>");
        WebDriver driver = new ChromeDriver();

        // driver.manage().window().setSize(new Dimension(390, 844));

        //setup link website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("name")).sendKeys("albert");

        driver.findElement(By.id("alertbtn")).click();

        System.out.println(driver.switchTo().alert().getText());

        System.out.println();

        Thread.sleep(2000);

    }
}
