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
        FileInputStream inputFile = new FileInputStream("/Users/bytedance/CourseQAAutomation/coursewebautomation/src/main/resources/GlobalData.properties");

        properties.load(inputFile);
        String browserName = properties.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","/Users/bytedance/CourseQAAutomation/Web Automation/chromedriver");
            driver = new ChromeDriver();
           
        }else if (browserName.equals("firefox")) {
            //set firefox
        }else if (browserName.equals("edge")) {
            // set edge
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;
    }

    public LandingPage launchApplication() throws IOException{
        driver = initializeDriver();

        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();

        return landingPage;

    }
}
