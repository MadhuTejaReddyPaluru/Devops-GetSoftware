package TestNGPack;

import org.testng.annotations.Test;

public class PriorityClass3 {
	
	
  @Test      (priority = 512)              //fifth
  public void M() {
	  
	  System.out.println("Hai I am Method M-fifth");
	  

  }
  
  
	
  @Test    (priority = 400)                   //fourth
  public void K() {
	  
	  System.out.println("Hai I am Method K-fourth");

  }
  
  
	
  @Test    (priority = 672)                  //sixth
  public void I() {
	  
	  System.out.println("Hai I am Method I-sixth");

  }
  
  
	
  @Test         (priority = 38)             //third
  public void M1() {
	  
	  System.out.println("Hai I am Method M1-third");

  }
  
  
	
  @Test        (priority = 700)          //seventh
  public void A() {
	  
	  System.out.println("Hai I am Method A-seventh");

  }
  
  
	
  @Test  (priority = 11)             //first
  public void b() {
	  
	  System.out.println("Hai I am Method b-first");

  }
  
  
	
  @Test            (priority = 11)      //eigth
  public void j() {
	  
	  System.out.println("Hai I am Method j-eigth");

  }
  
  
	
  @Test            (priority = 23)       //second
  public void B() {
	  
	  System.out.println("Hai I am Method B-second");

  }
  
  
  
}
