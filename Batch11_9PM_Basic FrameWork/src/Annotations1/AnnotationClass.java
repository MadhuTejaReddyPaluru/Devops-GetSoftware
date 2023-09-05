package Annotations1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationClass {
	
 @BeforeTest
 public void BT() {
	  System.out.println("Hai I am Before Test");
  }
 
 @Test
 public void TESTCASE01()
 {
	 
	 int a =10;
	 int b= 12;
	 System.out.println(a+b);
	 
 }

  @AfterMethod
  public void AM() {
	  System.out.println("Hai I am After Method");
  }
  
  @BeforeMethod
  public void BM() {
	  System.out.println("Hai I am Before Method");
  }

  @BeforeSuite
  public void BS() {
	  System.out.println("Hai I am Before Suite");
  }

  @BeforeClass
  public void BC() {
	  
	  System.out.println("Hai I am Before Class");
  }

  @AfterClass
  public void AC() {
	  
	  System.out.println("Hai I am After Class");
  }

 

  @AfterTest
  public void AT() {
	  System.out.println("Hai I am After Test");
  }

 

  @AfterSuite
  public void AS() {
	  System.out.println("Hai I am After Suite");
  }

}
