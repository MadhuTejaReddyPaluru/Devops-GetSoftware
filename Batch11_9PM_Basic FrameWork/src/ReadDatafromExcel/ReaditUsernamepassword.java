package ReadDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReaditUsernamepassword {
  @Test
  public void readingdata() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\Test Data\\Data.xlsx");
	  
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  
	  XSSFSheet sh = wb.getSheet("UserDetails");
	  
	  String UN = sh.getRow(1).getCell(0).getStringCellValue();
	  
	  System.out.println(UN);
	  
	  String PWD = sh.getRow(1).getCell(1).getStringCellValue();
	  
	  System.out.println(PWD);
	  
	  String SUB = sh.getRow(1).getCell(2).getStringCellValue();
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  
	  driver.findElement(By.name("txtUserName")).sendKeys(UN);
	  driver.findElement(By.name("txtPassword")).sendKeys(PWD);
	  
	  driver.findElement(By.name(SUB)).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
