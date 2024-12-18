package components;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.coursewebautomation.pageobjects.LandingPage;

public class BaseTest {

    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException{
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("src/main/java/com/coursewebautomation/resources/GlobalData.properties");
        properties.load(inputStream);
        String browserName = properties.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","/Users/bytedance/CourseQAAutomation/Web Automation/chromedriver");
            driver = new ChromeDriver();
            System.out.println("ini chromedriver");
            return driver;
        }else if (browserName.equals("firefox")) {
            System.out.println("ini firefox");

        }else{
            System.out.println("ini edge");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;
    }

    public LandingPage lauchApplication() throws IOException{
        driver = initializeDriver();

        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();

        return landingPage;
    }
}
