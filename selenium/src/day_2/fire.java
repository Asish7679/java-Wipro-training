package day_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Capabilities;

public class fire {
    public static void main(String[] args) {
       
       // System.setProperty("webdriver.gecko.driver", 
         //   "C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

        System.out.println("Browser Name: " + caps.getBrowserName());
        System.out.println("Browser Version: " + caps.getBrowserVersion());
        System.out.println("Platform: " + caps.getPlatformName());

        driver.quit();

        //driver.get("https://www.google.com");

        //driver.close();
    }
}
