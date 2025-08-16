package day_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flip{
    static WebDriver driver;
    static Properties props;

    public static void main(String[] args) throws Exception {
        loadConfig();
        setupDriver();
        loginFlipkart();
        searchMultipleProducts();
        driver.quit();
    }

    // Load properties file
    public static void loadConfig() throws IOException {
        props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Asish\\OneDrive\\Desktop\\multi.txt");
        props.load(fis);
    }

    // Setup Chrome driver
    public static void setupDriver() {
        System.setProperty("webdriver.chrome.driver", props.getProperty("chromedriver.path"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Login Flipkart (manual OTP entry)
    public static void loginFlipkart() throws InterruptedException {
        driver.get("https://www.flipkart.com/account/login?ret=/");

        // Enter mobile/email in login page (unique locator using name='loginId')
        driver.findElement(By.name("loginId"))
              .sendKeys(props.getProperty("flipkart.email"));

        // Click Request OTP button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println("👉 Please enter OTP manually in the browser...");

        // Give you 40 seconds to enter OTP manually
        Thread.sleep(40000);
    }

    // Search multiple products and print results
    public static void searchMultipleProducts() throws InterruptedException {
        List<String> products = Arrays.asList("laptop", "headphones", "wireless mouse");

        for (String product : products) {
            // Locate the search bar (top navbar, not login input)
            WebElement searchBox = driver.findElement(By.className("Pke_EE"));
            searchBox.clear();
            searchBox.sendKeys(product);

            // Click search button
            driver.findElement(By.className("_2iLD__")).click();
            Thread.sleep(3000);

            System.out.println("=== Results for: " + product + " ===");

            // Get first 5 product names & prices
            List<WebElement> productNames = driver.findElements(By.className("KzDlHZ")); // product title
            List<WebElement> productPrices = driver.findElements(By.className("Nx9bqj")); // product price

            for (int i = 0; i < Math.min(5, productNames.size()); i++) {
                String name = productNames.get(i).getText();
                String price = (i < productPrices.size()) ? productPrices.get(i).getText() : "N/A";
                System.out.println((i + 1) + ". " + name + " - " + price);
            }

            System.out.println();
            Thread.sleep(2000);
        }
    }
}
