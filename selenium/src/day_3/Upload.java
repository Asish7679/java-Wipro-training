package day_3;

import java.io.File;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Upload {
 
	public static void main(String[] args)
	{
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		try
		{
			driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
			File uploadFile=new File("C:\\Users\\Asish\\Downloads\\Asish_kumar.pdf");
			WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());
			driver.findElement(By.id("dummyUpload typ-14Bold")).click();
			//driver.findElement(By.id("")).click();
			String resultText= driver.findElement(By.id("resume-name-inline")).getText();
			
			System.out.println("Uploaded: " +resultText);
		}
		finally
		{
			driver.quit();
		}
		
	}
 
}