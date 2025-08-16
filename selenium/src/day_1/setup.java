package day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class setup {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			      /*  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			       
			        WebDriver driver = new ChromeDriver();

			      
			        driver.manage().window().maximize();

			       
			        driver.get("https://www.google.com");
			        
			        System.out.println("Page Title: " + driver.getTitle());

			        
			        driver.quit();
	*/
			        
			        System.setProperty("webdriver.edge.driver", "C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\edgedriver_win64 (1)\\msedgedriver.exe");
			        WebDriver edgeDriver = new EdgeDriver();
			        edgeDriver.manage().window().maximize();
			        edgeDriver.get("https://www.google.com");
			        edgeDriver.get("https://www.youtube.com");
			       
			        //System.out.println("Edge Title: " + edgeDriver.getTitle());
			        edgeDriver.close();
			    }
			}

