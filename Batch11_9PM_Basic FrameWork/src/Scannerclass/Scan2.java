package Scannerclass;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Scan2 {
  @Test
  public void scanning() {
	  
	Scanner read = new Scanner(System.in);
	
	System.out.println("Enter data as User name: ");
	
	String uname = read.nextLine();
	
	System.out.println("The Enter User name is : " +uname);
	
	
  }
}
