package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		
		Actions A = new Actions(driver);
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.id("draggable"));
		
		WebElement t = driver.findElement(By.id("droppable"));
		
		
		A.dragAndDrop(s, t).perform();
		
		
		

	}

}
