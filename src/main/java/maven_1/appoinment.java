package maven_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class appoinment {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.fortishealthcare.com");

        WebElement location = driver.findElement(By.id("locations"));
        Select select = new Select(location);
        select.selectByVisibleText("Noida");

        driver.findElement(By.xpath("//*[@id=\"block-fortisbottomnavigationblock\"]/nav/div/ul/li[2]/a/img")).click();

        Thread.sleep(3000); 

        driver.findElement(By.xpath("//*[@id=\"block-fortis-content\"]/div/div/div/ul/li[1]/div[2]/a[2]")).click();

        Thread.sleep(3000); 

        driver.findElement(By.xpath("//*[@id=\"block-fortisbottomnavigationblock\"]/nav/div/ul/li[1]/a")).click();

        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/form/div[2]/div[1]/input"));
        firstName.clear();
        firstName.sendKeys("Ashish");

        WebElement lastName = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/form/div[3]/div[1]/input"));
        lastName.clear();
        lastName.sendKeys("Kumar");

        WebElement mobile = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/form/div[4]/input"));
        mobile.clear();
        mobile.sendKeys("7679092187");

        WebElement email = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/form/div[6]/input"));
        email.clear();
        email.sendKeys("asishwork1107@gmail.com");

        Select hospitalDropdown = new Select(driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/form/div[8]/select")));
        hospitalDropdown.selectByVisibleText("Fortis Hospital, Noida");

        WebElement comment = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/form/div[10]/div/textarea"));
        comment.clear();
        comment.sendKeys("This is a test automation booking");
        
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/form/input[1]")).click();

        Thread.sleep(5000);

        //driver.quit();
    }
}
