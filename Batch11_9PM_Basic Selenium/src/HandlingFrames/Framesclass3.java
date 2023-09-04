package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesclass3 {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		driver.findElement(By.name("Submit")).click();
		
		
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu"))); //moving into the frame based on WebElement
		
		driver.switchTo().defaultContent();//coming out of any frame
		
		String checktext = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		System.out.println(checktext);
		
		
	}

}
