package CheckList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListClass2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\WebElements\\Country Name.Htm");
		
		WebElement checklist = driver.findElement(By.id("Dropdown"));
		
		List<WebElement> checkvalues   =     driver.findElements(By.tagName("option"));
		
		
		
		int count = checkvalues.size();
		
		//System.out.println(count);
		
		Select s = new Select(checklist);
		
		
		for (int i =0; i<count ;i++)
		{
		
			if(checkvalues.get(i).getText().startsWith("An"))
			{
				s.selectByIndex(i);
			}
		
		}
		
		
		
		
		
		

	}

}
