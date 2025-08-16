package day_4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
    
        /*driver.get("https://360homedecor.uk/home");
        driver.findElement(By.xpath("//*[@id=\"check_login\"]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"existed_user_login\"]/div[5]/button")).click();
        */
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        
        
        Alert alrt=driver.switchTo().alert();
        alrt.sendKeys("hello");
        System.out.println(alrt.getText());
        
        Thread.sleep(2000);
       // alrt.accept();
        alrt.dismiss();
        Thread.sleep(3000);
        //driver.quit();
    
 

	}

}
