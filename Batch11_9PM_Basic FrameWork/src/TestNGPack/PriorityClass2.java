package TestNGPack;

import org.testng.annotations.Test;

public class PriorityClass2 {
	
	
  @Test      (priority = 5)              //fifth
  public void M() {
	  
	  System.out.println("Hai I am Method M-fifth");

  }
  
  
	
  @Test    (priority = 4)                   //fourth
  public void K() {
	  
	  System.out.println("Hai I am Method K-fourth");

  }
  
  
	
  @Test    (priority = 6)                  //sixth
  public void I() {
	  
	  System.out.println("Hai I am Method I-sixth");

  }
  
  
	
  @Test         (priority = 3)             //third
  public void M1() {
	  
	  System.out.println("Hai I am Method M1-third");

  }
  
  
	
  @Test        (priority = 7)          //seventh
  public void A() {
	  
	  System.out.println("Hai I am Method A-seventh");

  }
  
  
	
  @Test  (priority = 1)             //first
  public void b() {
	  
	  System.out.println("Hai I am Method b-first");

  }
  
  
	
  @Test            (priority = 8)      //eigth
  public void j() {
	  
	  System.out.println("Hai I am Method j-eigth");

  }
  
  
	
  @Test            (priority = 2)       //second
  public void B() {
	  
	  System.out.println("Hai I am Method B-second");

  }
  
  
  
}
