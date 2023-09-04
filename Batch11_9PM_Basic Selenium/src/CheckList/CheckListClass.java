package CheckList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListClass {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\WebElements\\Country Name.Htm");
		
		WebElement checklist = driver.findElement(By.id("Dropdown"));
		
		List<WebElement> checkvalues   =     driver.findElements(By.tagName("option"));
		
		int count = checkvalues.size();
		
		//System.out.println(count);
		
		Select s = new Select(checklist);
		
		s.selectByIndex(12);
		s.selectByIndex(24);
		s.selectByIndex(31);
		s.selectByIndex(100);
		
		s.selectByVisibleText(" Poland");
		
		
		
		
		
		

	}

}
