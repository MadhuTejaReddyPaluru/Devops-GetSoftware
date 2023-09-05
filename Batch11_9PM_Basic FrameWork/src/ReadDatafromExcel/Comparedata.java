package ReadDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Comparedata {
  @Test
  public void datacompare() throws IOException {
	  
 System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  
	  driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	  driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	  
	  driver.findElement(By.name("Submit")).click();
	  
	  
	  driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
	  
	  WebElement dd = driver.findElement(By.id("loc_code"));
	  
	  List<WebElement>  dv = driver.findElements(By.tagName("option"));
	//  System.out.println(dv.size());
	 // for (int i =0 ; i <dv.size();i++)
	 // {
	//	  System.out.println(dv.get(i).getText());
	//  }
	  
	 // System.out.println("-------------------Getting data from Excel------------------");
	  FileInputStream fis = new FileInputStream("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\Test Data\\Data.xlsx");
	  
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  
	  XSSFSheet sht = wb.getSheet("ExcelDD");
	//  System.out.println(sht.getLastRowNum());
	 // for(int i = 0; i<sht.getLastRowNum(); i++)
	 // {
	  
	 // String s = sht.getRow(i).getCell(0).getStringCellValue();
	//  System.out.println(s);
	  
	//  }
	  
	  if(dv.size() == sht.getLastRowNum()+1)
	  {
		  for(int k = 0; k<dv.size();k++)
		  {
			  String APPDATA = dv.get(k).getText();
			  String EXCELDATA = sht.getRow(k).getCell(0).getStringCellValue();
			  //System.out.println(APPDATA);
			  //System.out.println(EXCELDATA);
			  if(APPDATA.equals(EXCELDATA))
			  {
				System.out.println("APP Data " +APPDATA +" is equal to Excel Data " +EXCELDATA );
			  }
		  }
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
