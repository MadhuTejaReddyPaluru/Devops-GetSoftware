package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
		
		Actions A = new Actions(driver);
		Thread.sleep(2000);
		
		//A.contextClick(driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[4]"))).perform();
		
		A.contextClick(driver.findElement(By.linkText("Images"))).perform();
		
		
		

	}

}
