package day_4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;
public class gmail {

	    public static void main(String[] args) throws InterruptedException {
	    	

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver chromeDriver = new ChromeDriver();
	        ChromeDriver chromeDriver2 = new ChromeDriver();
			chromeDriver2.get("https://www.selenium.dev/");
	        PrintOptions printOptions = new PrintOptions();
	        printOptions.setOrientation(PrintOptions.Orientation.LANDSCAPE);
	        PrintOptions.Orientation current_orientation = printOptions.getOrientation();
	        
	    }}
