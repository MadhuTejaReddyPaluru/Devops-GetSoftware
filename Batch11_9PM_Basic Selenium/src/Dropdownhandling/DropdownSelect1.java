package Dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect1 {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		driver.findElement(By.name("Submit")).click();
		
		
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu"))); //moving into the frame based on WebElement
		
		
		
		WebElement dd = driver.findElement(By.id("loc_code"));
		
		List<WebElement> ddvalues = dd.findElements(By.tagName("option"));
		
		//int totalele = ddvalues.size();
		//System.out.println(totalele);
		
		Select s = new Select(dd);
		
		Thread.sleep(3000);
		
		s.selectByIndex(1);
		
		
		
		
		
	}

}
