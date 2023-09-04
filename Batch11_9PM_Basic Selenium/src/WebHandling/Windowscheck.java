package WebHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowscheck {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		System.out.println("After Launhing Home Page Title is : " +driver.getTitle());
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM")).click();
		
		System.out.println("After Clicking on Link,  Title is : " +driver.getTitle());
		
		//driver.close();
		
		        Set<String> totalwin = driver.getWindowHandles();
		        
		        System.out.println(totalwin.size());
		        
		       List<String> listwindows = new ArrayList<String>(totalwin);
		       
		       Thread.sleep(3000);
		       
		    driver.switchTo().window(listwindows.get(0));
		    Thread.sleep(3000);
		       
		    driver.switchTo().window(listwindows.get(1));
		    System.out.println("After Navigating to child window  : " +driver.getTitle());
		    Thread.sleep(3000);
		       
		    driver.switchTo().window(listwindows.get(0));
		    Thread.sleep(3000);
		       
		    driver.switchTo().window(listwindows.get(1));
		    Thread.sleep(3000);
		    
		    Actions A = new Actions(driver);
		    
		    A.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a"))).perform();
		    Thread.sleep(3000);
		    driver.switchTo().window(listwindows.get(0));
		    
		    driver.quit();
		       

	}

}
