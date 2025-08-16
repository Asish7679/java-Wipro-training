package day_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Automation {

	    public static void main(String[] args) throws InterruptedException {
	    	

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver chromeDriver = new ChromeDriver();
	        chromeDriver.get("https:/www.google.com");
	        WebElement searchBox=chromeDriver.findElement(By.name("q"));
	        searchBox.sendKeys("Selenium dev");
	        searchBox.submit();
	        Thread.sleep(20000);
	        chromeDriver.quit();
	    }}
