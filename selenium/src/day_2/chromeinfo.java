package day_2;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class chromeinfo {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

				       
				        ChromeDriver driver = new ChromeDriver();

				      
				        driver.manage().window().maximize();

				        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

				        System.out.println("Browser Name: " + caps.getBrowserName());
				        System.out.println("Browser Version: " + caps.getBrowserVersion());
				        System.out.println("Platform: " + caps.getPlatformName());

				        driver.quit();

				       
		
}}
