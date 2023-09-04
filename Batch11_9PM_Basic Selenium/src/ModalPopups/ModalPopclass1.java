package ModalPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalPopclass1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_modal");
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		driver.findElement(By.id("myBtn")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().activeElement();  //navigates to modal popup
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("close")).click();
		
		
		
		
		
		

	}

}
