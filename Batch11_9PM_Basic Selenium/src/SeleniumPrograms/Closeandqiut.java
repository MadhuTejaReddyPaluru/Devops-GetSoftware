package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closeandqiut {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		driver.findElement(By.name("Submit")).click();
		
		//driver.close();//closes the current and one window only.
		
		driver.quit();//closes all the windows at once
		
		
		

	}

}
