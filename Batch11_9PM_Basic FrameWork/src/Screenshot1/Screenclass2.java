package Screenshot1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenclass2 {
  @Test
  public void screen() throws IOException {
	  
      System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File target = new File ("C:\\My Personal\\Batches\\Batch12_Automation_12 PM IST\\Selenium Softwares\\Evidences\\Screen" +time() +".jpg");
	  
	  FileHandler.copy(source, target);
	  
	  driver.findElement(By.xpath("//input[@name='txtPassword']//preceding::input[1]")).sendKeys("selenium");
	  driver.findElement(By.xpath("//input[@name='txtUserName']//following::input[1]")).sendKeys("selenium");
	  
      File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
      File target1 = new File ("C:\\My Personal\\Batches\\Batch12_Automation_12 PM IST\\Selenium Softwares\\Evidences\\Screen" +time() +".jpg");
	  
	  FileHandler.copy(source1, target1);
	  
	  	  
  }
  
  static String time()
  {
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddHHmmss");  
	   LocalDateTime now = LocalDateTime.now();  
	   return dtf.format(now);  
  }
}
