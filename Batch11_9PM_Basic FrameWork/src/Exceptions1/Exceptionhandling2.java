package Exceptions1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exceptionhandling2 {
  @Test
  public void ehandling() {
	  
	  
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
	  

		int x = 40;

	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	  
	  try {
		  
		 
	  driver.findElement(By.name("sshdfgh")).sendKeys("sdgdhdh");
	  
	  if(x==40)
	  {
		  System.out.println("The Value of X is : " +x);
	  }
	  
	  
	  }
	  
	  catch (Exception e)
	  {
		  System.out.println("Seems Element Not found so getting the error");
	  }
	  
	  driver.findElement(By.name("Submit")).click();
	  
	  
	 
	  
	  
	  
  }
}
