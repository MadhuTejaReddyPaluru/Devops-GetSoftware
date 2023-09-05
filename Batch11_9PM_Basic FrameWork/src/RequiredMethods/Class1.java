package RequiredMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
	
	
  @Test
  public void Ch() {
	  
	  String S = "China";
	  
	 Assert.assertEquals(S, "China");
	 System.out.println("My Country Name is : " +S);
  }
  
  
  @Test
  public void P() {
	  
	  String S = "Pakistan";
	  
	 Assert.assertEquals(S, "Pakistan");
	 System.out.println("My Country Name is : " +S);
  }
  
  
  @Test
  public void A() {
	  
	  String S = "Afgannisthan";
	  
	 Assert.assertEquals(S, "Afgannisthan");
	 System.out.println("My Country Name is : " +S);
  }
  
  @Test
  public void SA() {
	  
	  String S = "South Africa";
	  
	 Assert.assertEquals(S, "South Africa");
	 System.out.println("My Country Name is : " +S);
  }
  
  @Test
  public void Z() {
	  
	  String S = "Zimbabwe";
	  
	 Assert.assertEquals(S, "Zimbabwe");
	 System.out.println("My Country Name is : " +S);
  }
  
  
}
