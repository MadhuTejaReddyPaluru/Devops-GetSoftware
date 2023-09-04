package HyderLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperclass {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\WebElements\\Hyper links.html");
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		
		System.out.println(tags.size());
		
		driver.findElement(By.xpath("/html/body/p/font/i[1]/a")).click();

	}

}
