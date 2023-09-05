package Annotations1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;

public class Anno2 {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("One");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Two");
  }

}
