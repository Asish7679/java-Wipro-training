package day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager; 

public class ecommerce {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        
        WebDriverManager.chromedriver().setup();   
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }

    @Test(groups = {"smoke"})
    public void testTitle() {
        System.out.println("Smoke Test - Title Check");
        System.out.println("Page Title: " + driver.getTitle());
    }

    @Test(groups = {"regression"})
    public void testSearch() {
        System.out.println("Regression Test - Search");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
