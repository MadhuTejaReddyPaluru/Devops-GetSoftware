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

public class Windowspopup2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		
		Robot ro = new Robot();
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_A);
		ro.keyPress(KeyEvent.VK_D);
		ro.keyPress(KeyEvent.VK_M);
		ro.keyPress(KeyEvent.VK_I);
		ro.keyPress(KeyEvent.VK_N);
		
		
		ro.keyPress(KeyEvent.VK_TAB);
		
		
		ro.keyPress(KeyEvent.VK_A);
		ro.keyPress(KeyEvent.VK_D);
		ro.keyPress(KeyEvent.VK_M);
		ro.keyPress(KeyEvent.VK_I);
		ro.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(2000);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
