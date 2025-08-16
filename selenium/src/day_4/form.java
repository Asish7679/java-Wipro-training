package day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class form {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://360homedecor.uk/book-appointment");
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.id("choose_branch"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("360");

        WebElement dropdown1 = driver.findElement(By.id("choose_style"));
        Select select1 = new Select(dropdown1);
        select1.selectByVisibleText("Luxury");

        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.clear();
        firstName.sendKeys("Ashish");

        WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.clear();
        lastName.sendKeys("Kumar");

        WebElement city = driver.findElement(By.id("apt_city"));
        city.clear();
        city.sendKeys("Asansol");

        WebElement phone = driver.findElement(By.id("phone_number"));
        phone.clear();
        phone.sendKeys("7679092187");

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("asisih@gmail.com");

        WebElement uploadInput = driver.findElement(By.id("layoutFiles"));
        uploadInput.sendKeys("C:\\Users\\Asish\\Downloads\\Asish_kumar.pdf");
        WebElement checkbox = driver.findElement(By.id("privacyPolicy"));
        checkbox.click();

    	WebElement book = driver
				.findElement(By.xpath("//*[@id=\"appointment_form\"]/div[10]/button"));
		book.click();


       // Thread.sleep(2000);
       // driver.quit();
    }
}
