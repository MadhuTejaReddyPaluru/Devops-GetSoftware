package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverclass {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		driver.findElement(By.name("Submit")).click();
		
	
		
		Actions A = new Actions(driver);
		
		A.moveToElement(driver.findElement(By.xpath("//*[@id=\"report\"]/a/span"))).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"report\"]/ul/li[2]/a/span")).click();
		
		
		
		

	}

}
