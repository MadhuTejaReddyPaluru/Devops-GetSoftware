package ReadDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class MutipleRead {
  @Test
  public void multiread() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("C:\\My Personal\\Batches\\Batch10_Automation_9 PM IST\\Selenium Softwares\\Test Data\\Data.xlsx");
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  
	  XSSFSheet sh = wb.getSheet("Names");
	  
	  int noofrows = sh.getLastRowNum();
	  
	 // System.out.println(noofrows);
	  
	  for(int i=0; i<=noofrows ; i++)
	  {
		System.out.println((sh.getRow(i).getCell(0).getStringCellValue()));
		
		}
	  
	  ArrayList<String> al = new  ArrayList<String>();
	  
	  for(int i=0; i<=noofrows ; i++)
	  {
		 al.add(sh.getRow(i).getCell(0).getStringCellValue());
		
	  }
	  
	  System.out.println(al);
	  
	  
	  
  }
}
