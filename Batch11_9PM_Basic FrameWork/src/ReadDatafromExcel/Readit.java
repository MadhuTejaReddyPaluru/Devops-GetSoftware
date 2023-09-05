package ReadDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readit {
  @Test
  public void readingdata() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\Test Data\\Data.xlsx");
	  
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  
	  XSSFSheet sh = wb.getSheet("Greetings");
	  
	  String first = sh.getRow(0).getCell(0).getStringCellValue();
	  
	  System.out.println(first);
	  
	  String value = sh.getRow(4).getCell(1).getStringCellValue();
	  
	  System.out.println(value);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
