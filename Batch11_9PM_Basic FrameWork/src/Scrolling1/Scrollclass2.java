package Scrolling1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Scrollclass2 {
  @Test
  public void scrollupanddown() throws InterruptedException {
	  
 System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	  
	Thread.sleep(1000);
	  

	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();" , driver.findElement(By.linkText("Amazon App Download")) );
	 
	 
	 
	 ((JavascriptExecutor)driver).executeScript("arguments[0].click();" , driver.findElement(By.linkText("Amazon App Download")) );
	 
	
	
	  
	  
  }
}
