package day_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
public class tab {


			public static void main(String[] args) {
				
				        
				        System.setProperty("webdriver.edge.driver", "C:\\Users\\Asish\\OneDrive\\Desktop\\selenium wipro\\edgedriver_win64 (1)\\msedgedriver.exe");
				        WebDriver edgeDriver = new EdgeDriver();
				        edgeDriver.manage().window().maximize();
				        edgeDriver.get("https://www.google.com");
				        edgeDriver.switchTo().newWindow(WindowType.TAB);
				       
				        edgeDriver.get("https://www.youtube.com");
				        edgeDriver.switchTo().newWindow(WindowType.WINDOW);
				        edgeDriver.get("https://www.chatgpt.com");
				        
				       
				        //System.out.println("Edge Title: " + edgeDriver.getTitle());
				        edgeDriver.close();
				    }
				}
