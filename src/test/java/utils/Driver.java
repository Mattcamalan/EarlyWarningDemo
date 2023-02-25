package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;

    private Driver(){}

    public static WebDriver driver(){
        String driverName=PropertyReader.uiPropertyReaderByKey("browser");
        if(driver==null||((RemoteWebDriver) driver).getSessionId()==null) {
            if ("chrome".equals(driverName)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if ("firefox".equals(driverName)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if ("ie".equals(driverName)) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            } else {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }

        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
