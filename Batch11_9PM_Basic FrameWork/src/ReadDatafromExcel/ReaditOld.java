package ReadDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReaditOld {
  @Test
  public void readingdata() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\Test Data\\Data.xls");
	  
	  
	  HSSFWorkbook wb = new HSSFWorkbook(fis);
	  
	  HSSFSheet sh = wb.getSheet("Greetings");
	  
	  String first = sh.getRow(0).getCell(0).getStringCellValue();
	  
	  System.out.println(first);
	  
	  String value = sh.getRow(4).getCell(1).getStringCellValue();
	  
	  System.out.println(value);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
