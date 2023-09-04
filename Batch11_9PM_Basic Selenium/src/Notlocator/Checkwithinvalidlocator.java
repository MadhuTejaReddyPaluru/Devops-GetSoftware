package Notlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkwithinvalidlocator {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hai");//invalid value as it contains spaces
		
		driver.findElement(By.name("email")).sendKeys("hai");
		
		

	}

}
