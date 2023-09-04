package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		String hometitle = driver.getTitle();
		
		if(hometitle.equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Home Title has been Validated");
		}
		else
		{
			System.out.println("Incorrect Home Title");
		}
		
		//System.out.println(hometitle);
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		driver.findElement(By.name("Submit")).click();
		
		
		String logintitle = driver.getTitle();
		
		//System.out.println(logintitle);
		
		String checktext = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		
		//System.out.println(checktext);
		
		if (checktext.equals("Welcome selenium"))
		{
			System.out.println("Login Page successfully loaded");
		}
		else
		{
			System.out.println("Page not loaded");
		}

	}

}
