package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Cricket Score");
		
		Actions Act = new Actions(driver);
		
		Thread.sleep(2000);
		
		Act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		Act.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		Thread.sleep(2000);		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		Act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		
		
		

	}

}
