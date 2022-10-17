package pack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class SoftasertionDemo {
	
  @Test(priority = 0)
  public void softassert() {
	  SoftAssert obj=new SoftAssert();
	  System.out.println("======================================");
		System.out.println("Test1 start");
		obj.assertEquals(12,13);
		obj.assertAll();
		System.out.println("Test1 complete");
		
		System.out.println("Test1 complete");
		System.out.println("Test1 complete");
  }
  @Test(priority = 1)
  public void hardassert(){
	  System.out.println("======================================");
		System.out.println("Test2 start");
		Assert.assertEquals(13,13);
		System.out.println("Test2 complete");  
  }
}
  
  
	  
  
		
		
	  
	  
  

