package Xpath1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contains1 {
  @Test
  public void Startscheck() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  
	  driver.findElement(By.xpath("//input[contains(@type, 'ex')]")).sendKeys("selenium");
	  driver.findElement(By.xpath("//input[contains(@type, 'ss')]")).sendKeys("selenium");
	  
	  driver.findElement(By.xpath("//input[contains(@type, 'it')]")).click();
	  
	  System.out.println(driver.findElement(By.xpath("//li[text()='Welcome selenium']")).getText());
	  
	  

  }
}
