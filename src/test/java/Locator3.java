import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","<file_path_chromedriver>");
        WebDriver driver = new ChromeDriver();  

        driver.get("https://www.spicejet.com/");

        driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@data-testid = 'undefined-month-December-2024']/child::div[3]/child::div[2]/child::*[@data-testid='undefined-calendar-day-4']")).click();

        driver.findElement(By.xpath("//*[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']")).click();

        Thread.sleep(2000);

        String date = driver.findElement(By.xpath("//*[@data-testid='departure-date-dropdown-label-test-id']/child::div[2]/child::div[1]")).getText();

        //check enabled date

        System.out.println("tanggal"+date);
        if (date.contains("November")) {
            Assert.assertTrue(false);
            System.out.println("ini adalah di calendar bulan 12");
        }else{
            Assert.assertTrue(true);
            System.out.println("ngak muncul nih");
        }

        
        Thread.sleep(2000);


    }
}
