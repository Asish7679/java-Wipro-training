package day_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiLogin {
    
    static WebDriver driver;
    static Properties props;

    public static void main(String[] args) throws IOException, InterruptedException {
     
        props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Asish\\OneDrive\\Desktop\\multi.txt");
        props.load(fis);

        System.setProperty("webdriver.chrome.driver", props.getProperty("chromedriver.path"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginGmail();
        logintech();

        driver.quit();
    }

    public static void loginGmail() throws InterruptedException {
        driver.get("https://mail.google.com/");
        driver.findElement(By.id("identifierId")).sendKeys(props.getProperty("gmail.email"));
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(props.getProperty("gmail.password"));
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(5000);
        System.out.println("Logged into Gmail");
    }
  
    public static void logintech() throws InterruptedException {
        driver.get("https://one.techademy.com/main/Wipro");
        driver.findElement(By.xpath("//*[@id=\':r1:\']")).sendKeys(props.getProperty("techacademy.email"));
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys(props.getProperty("techadademy.password"));
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/main/div/form/div[4]/button")).click();
        Thread.sleep(5000);
        System.out.println("logged in Techacdemy");
    }

}
