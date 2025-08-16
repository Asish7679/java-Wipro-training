package day_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jobportal {
    public static void main(String[] args) throws InterruptedException, IOException {
        
        
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Asish\\OneDrive\\Desktop\\sample.txt");
        props.load(fis);
       
        String email = props.getProperty("naukri.email");
        String password = props.getProperty("naukri.password");
        String resumePath = props.getProperty("resume.path");
        String chromeDriverPath = props.getProperty("chromedriver.path");
       
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.naukri.com/nlogin/login");
     
        driver.findElement(By.id("usernameField")).sendKeys(email);
        driver.findElement(By.id("passwordField")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();
        
        Thread.sleep(5000); 
       
        driver.get("https://www.naukri.com/mnjuser/profile");
        Thread.sleep(5000);
      
        WebElement uploadBtn = driver.findElement(By.id("attachCV"));
        uploadBtn.sendKeys(resumePath);
        
        System.out.println("Resume Uploaded Successfully!");
        
        Thread.sleep(6000);
       // driver.quit();
    }
}
