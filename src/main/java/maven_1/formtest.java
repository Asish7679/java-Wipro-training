package maven_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formtest {
	 public static void main(String[] args) throws InterruptedException {
		
		         WebDriver driver = new ChromeDriver();
		         driver.manage().window().maximize();
		         driver.get("https://demoqa.com/automation-practice-form");

		         driver.findElement(By.id("firstName")).sendKeys("John");
		         driver.findElement(By.id("lastName")).sendKeys("Cina");
		         driver.findElement(By.id("userEmail")).sendKeys("john.cina@example.com");
		         driver.findElement(By.id("userNumber")).sendKeys("9876543210");

		         driver.findElement(By.xpath("//label[text()='Male']")).click();


		         WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
		         subjectsInput.sendKeys("English");
		         subjectsInput.sendKeys(Keys.DOWN, Keys.ENTER);  

		         driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();

		         driver.findElement(By.id("uploadPicture"))
		               .sendKeys("C:\\Users\\Asish\\Downloads\\Asish_kumar.pdf");

		        
		         driver.findElement(By.id("currentAddress"))
		               .sendKeys("123 Main St, Sample City");

		         WebElement stateInput = driver.findElement(
		             By.cssSelector("#state input")
		         );
		         stateInput.sendKeys("NCR");
		         stateInput.sendKeys(Keys.ENTER);

		         WebElement cityInput = driver.findElement(
		             By.cssSelector("#city input")
		         );
		         cityInput.sendKeys("Delhi");
		         cityInput.sendKeys(Keys.ENTER);
		         
		         Thread.sleep(2000);

		         driver.findElement(By.id("submit")).click();

	 }
	        
	        
}

