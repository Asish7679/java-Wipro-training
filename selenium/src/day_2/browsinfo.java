package day_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Capabilities;

public class browsinfo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver",
            "C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\edgedriver_win64 (1)\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

        System.out.println("Browser Name: " + caps.getBrowserName());
        System.out.println("Browser Version: " + caps.getBrowserVersion());
        System.out.println("Platform: " + caps.getPlatformName());

        driver.quit();
    }
}
