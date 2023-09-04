package CheckBox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxclass1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\WebElements\\Country Check box.html");
		
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		
		
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		

	}

}
