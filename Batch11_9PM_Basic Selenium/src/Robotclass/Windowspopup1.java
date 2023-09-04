package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowspopup1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		driver.findElement(By.name("Submit")).click();
		
		
		Actions A = new Actions(driver);
		
		A.moveToElement(driver.findElement(By.xpath("//*[@id=\"pim\"]/a/span"))).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		
		//driver.findElement(By.id("photofile")).click();
		Thread.sleep(2000);
		
		A.moveToElement(driver.findElement(By.id("photofile"))).click().perform();
		
		StringSelection s = new StringSelection("C:\\Users\\manoh\\OneDrive\\Desktop\\IC.jpg");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Robot ro = new Robot();
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
