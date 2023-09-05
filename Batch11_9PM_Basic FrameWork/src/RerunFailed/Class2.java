package RerunFailed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class2 {
	
	
  @Test
  public void I() {
	  
	  String S = "India";
	  
	 Assert.assertEquals(S, "India");
	 System.out.println("My Country Name is : " +S);
  }
  
  
  @Test
  public void In() {
	  
	  String S = "Indonesia";
	  
	 Assert.assertEquals(S, "Indonesia");
	 System.out.println("My Country Name is : " +S);
  }
  
  
  @Test
  public void J() {
	  
	  String S = "Japan";
	  
	 Assert.assertEquals(S, "Japan");
	 System.out.println("My Country Name is : " +S);
  }
  
  @Test
  public void C() {
	  
	  String S = "Canada";
	  
	 Assert.assertEquals(S, "Canada");
	 System.out.println("My Country Name is : " +S);
  }
  
  
}
