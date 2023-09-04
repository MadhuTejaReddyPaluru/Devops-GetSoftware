package WebPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Alert A = driver.switchTo().alert();
		Thread.sleep(3000);
		
		//A.accept();  //to click on OK
		A.dismiss();  // to click on Cancel
		

	}

}
