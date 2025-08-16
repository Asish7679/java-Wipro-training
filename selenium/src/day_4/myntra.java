package day_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {

	static WebDriver driver;
	static Properties props;

	public static void main(String[] args) throws Exception {
		loadConfig();
		setupDriver();
		loginFlipkart();
		searchMultipleProducts();
		driver.quit();
	}

	public static void loadConfig() throws IOException {
		props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Asish\\OneDrive\\Desktop\\multi.txt");
		props.load(fis);
	}

	public static void setupDriver() {
		System.setProperty("webdriver.chrome.driver", props.getProperty("chromedriver.path"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void loginFlipkart() throws InterruptedException {
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"))
				.sendKeys(props.getProperty("flipkart.email"));
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(30000);
	}

	public static void searchMultipleProducts() throws InterruptedException {
        List<String> products = Arrays.asList("laptop", "headphones", "wireless mouse");

        for (String product : products) {
            WebElement searchBox =driver.findElement(By.xpath("//*[@type='text']"));
                    searchBox.sendKeys(props.getProperty("product"));
            searchBox.clear();
            searchBox.sendKeys(product);

            driver.findElement(By.className("KzDlHZ")).click();
            

            driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button/svg"));

            Thread.sleep(2000);
        }
    }
}
