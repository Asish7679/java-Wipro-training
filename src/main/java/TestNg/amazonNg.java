package TestNg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class amazonNg {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Setup Reports");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Launch Browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class- Open Application");
        driver.get("https://www.amazon.in");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Login if required");
    }

    @Test(priority = 1)
    public void testSearch() {
        System.out.println("Test - search Product");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - Logout if required");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Close Application");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Close Browser");
        driver.quit();
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Generate Reports");
    }
}
