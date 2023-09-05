package WriteDataintoExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritngData {
  @Test
  public void excelwrite() throws IOException {
	  
 FileInputStream fis = new FileInputStream("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\Test Data\\Data.xlsx");
	  
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  
	  XSSFSheet sht = wb.getSheet("Enterdata");
	  
	  XSSFRow r0 = sht.createRow(0);
	  
	  XSSFCell r0c0 = r0.createCell(0);
	  
	  r0c0.setCellValue("Welcome to India");
	  
	  XSSFRow r18 = sht.createRow(18);
	  
	  XSSFCell r18c2 = r18.createCell(2);
	  
	  r18c2.setCellValue("Cricket won");
	  
	  FileOutputStream fos = new FileOutputStream("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\Test Data\\Data.xlsx");	  
	  
	  wb.write(fos);
	  
  }
}
