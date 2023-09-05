package Scrolling1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Scrollclass3 {
  @Test
  public void scrollupanddown() throws InterruptedException {
	  
 System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	  
	Thread.sleep(1000);
	  

	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 6000)");
	 
	
	 Thread.sleep(1000);
	  driver.findElement(By.linkText("China")).click();
	  
	  
  }
}
