import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Locator2 {
public static void main(String[] args) throws InterruptedException {
    // Setup seleniumchromedriver
        System.setProperty("webdriver.chrome.driver","<file_path_chromedriver>");
        WebDriver driver = new ChromeDriver();  

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Static Dropdown
        // get dropdown
        // pilih option yang ingin di implementasikan

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropdown);
        // dropdown.getAllSelectedOptions();
        System.out.println("all option" +  dropdown.getAllSelectedOptions().size());
        System.out.println("pertama" +  dropdown.getFirstSelectedOption().getText());

        // dropdown by index
        dropdown.selectByIndex(3);
        System.out.println("pertama" +  dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //Static dropdown 2
        //*[@id = 'divAdult']/child::div/*[@class='pax-add pax-enabled'][1]
        //id = hrefIncAdt

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000);

        //Looping while dan for
        // int index = 0;

        // do {
        //     driver.findElement(By.id("hrefIncAdt")).click();
        //     index++;

        // } while (index < 5);

        // while (index < 5) {
        //     driver.findElement(By.id("hrefIncAdt")).click();
        //     index++;
        // }

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();

        Thread.sleep(2000);

        //Handle dynamic drodown
        //(//*[@id='dropdownGroup1']//div[@class='dropdownDiv']//ul[1]/li/a[@value='DEL'])[1]
        /// 
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        
        List<WebElement> options = driver.findElements(By.xpath("//*[@id='dropdownGroup1']//div[@class='dropdownDiv']//ul[1]/li"));

        for (WebElement webElement : options) {
            System.out.println("link"+webElement.getText());
            if (webElement.getText().equalsIgnoreCase("Delhi (DEL)")) {
                System.out.println("sudah ketemu");
                webElement.click();
                break;
            }
        }



        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[@value = 'AIP'])[2]")).click();

        Thread.sleep(2000);

        //Handle suggestion
        driver.findElement(By.xpath("//*[@id='autosuggest'][1]")).sendKeys("ind");

        Thread.sleep(3000);

        List<WebElement> country =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement webElement : country) {
            System.out.println("Ini adalah" + webElement.getText());
            if (webElement.getText().equals("India")) {
                System.out.println("sudah ketemu");
                webElement.click();
                break;
            }
        }

        Thread.sleep(3000);


        //Checkbox
        //*[@id*='friendsandfamily']

        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

        //Radio button
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@name='ctl00' and @id='ctl00_mainContent_rbtnl_Trip_1']")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();

        Thread.sleep(3000);

        /*
         * case pertama
         * kalau one way opacity adalah 0.5
         * 
         * case kedua
         * kalau round trip opacity adalah 1.0
         */

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        String element = driver.findElement(By.xpath("//*[@name= 'ctl00$mainContent$view_date2']/parent::div")).getDomAttribute("style");

        if (element.contains("0.5")) {
            System.out.println("its disabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip' and @id='ctl00_mainContent_rbtnl_Trip_1']")).click();

        String element1 = driver.findElement(By.xpath("//*[@name= 'ctl00$mainContent$view_date2']/parent::div")).getDomAttribute("style");

        System.out.println("albert1"+element1);
        if (element1.contains("1")) {
            System.out.println("its enabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        Thread.sleep(2000);
    

        driver.close();
    }
}
