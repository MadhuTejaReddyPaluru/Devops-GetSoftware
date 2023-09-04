package RadioButton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\WebElements\\Gender Radio  Button.html");
		
		
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		

	}

}
