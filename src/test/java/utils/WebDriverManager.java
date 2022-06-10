package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private static WebDriver driver;

    public void setUp(){
        initializeDriver(ConfigReader.readProperty("browser"));
        driver.get(ConfigReader.readProperty("url"));
    }

    public void initializeDriver(String browser){
        driver = null;
        switch (browser.toLowerCase()){
            case "chrome":
                io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "ie":
                io.github.bonigarcia.wdm.WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                System.out.println("Wrong browser name was entered");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void closeDriver(){
        driver.close();
    }

}
