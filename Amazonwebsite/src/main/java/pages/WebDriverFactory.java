package pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverFactory {
	
	private static WebDriver driver = null;
    private static final String AMAZON="https://www.amazon.com/";
    
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebDriverFactory.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeClass
    public void intializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
        driver = new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver", "/Users/mohammadmuntakim1/Downloads/geckodriver");
//        driver = new FirefoxDriver();
        
        driver.get(AMAZON);
    }
    
    @AfterClass
    public void tearDown() {
        if(driver != null) {
            driver.manage().deleteAllCookies();
            driver.close();
        }
    }
}

