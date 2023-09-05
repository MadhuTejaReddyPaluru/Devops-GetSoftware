package Scannerclass;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Scan3 {
  @Test
  public void scanning() {
	  
	Scanner read = new Scanner(System.in);
	
	System.out.println("Enter data as User name age: ");
	
	int uage = read.nextInt();
	
	System.out.println("The Enter User name age is : " +(2*uage));
	
	
  }
}
