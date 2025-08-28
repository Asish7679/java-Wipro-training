package cucumberbbd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Amazon {

    WebDriver driver;

    @Given("I launch the browser")
    public void i_launch_the_browser() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open the login page")
    public void i_open_the_login_page() {
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }

    @When("I enter valid UserName and password")
    public void i_enter_valid_username_and_password() {
        WebElement username = driver.findElement(By.id("ap_email"));
        username.sendKeys("anurag.das.crhs@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click() ;  
        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("Anurag@2003");
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Then("I should be navigated to the home page")
    public void i_should_be_navigated_to_the_home_page() {
        if (driver.findElement(By.id("nav-search-submit-button")).isDisplayed()) {
        	    System.out.println("Login successful - Home page opened");
        } else {
            System.out.println("Login failed");
        }

        driver.quit();  
    }
}
