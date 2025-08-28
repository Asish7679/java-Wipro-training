package maven_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

    static WebDriver driver;
    static Properties props;

    public static void main(String[] args) throws Exception {
        loadConfig();
        setupDriver();
        loginAmazon();
        searchMultipleProducts();
        driver.quit();
    }

    public static void loadConfig() throws IOException {
        props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Asish\\OneDrive\\Desktop\\multi.txt");
        props.load(fis);
    }

    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();  
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void loginAmazon() throws InterruptedException {
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");


        driver.findElement(By.id("ap_email")).sendKeys(props.getProperty("amazon.email"));
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ap_password")).sendKeys(props.getProperty("amazon.password"));
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
    }

    public static void searchMultipleProducts() throws InterruptedException {
    	List<String> products = new ArrayList<>();
    	products.add("laptop");
    	products.add("headphones");
    	products.add("wireless mouse");

        for (String product : products) {
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(product);

            driver.findElement(By.id("nav-search-submit-button")).click();
            Thread.sleep(2000);
        }
    }
}
