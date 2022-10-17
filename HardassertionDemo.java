package pack;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(ListenersDemo.class)
public class HardassertionDemo {
	
	//HardAssertion:
	//HardAssertion is an assertion its throws an exception immediately upon failue of assertion
	//If any one of the method is fail rest of the methods/statements will not be executed
	//if any validation fails it will not continue the rest of the script once the script 
	//it means single validation fail script will not execute/Continue
	
	

	
	  //softassert...
	//if any validation fails it will continue the rest of the script once the script is complete it will fails the test.
	//it means single validation fail script will failed at last but execution will not stop
	//do not forget to call assertall() method at last.
	  @Test(priority = 0)
	  public void hardassert(){
		  System.out.println("======================================");
			System.out.println("Test2 start");
			Assert.assertEquals(12,13);
			System.out.println("Test2 complete");  
	  }
	  @Test(priority = 1)
	  public void softassert() {
		  SoftAssert obj=new SoftAssert();
		  System.out.println("======================================");
			System.out.println("Test1 start");
			obj.assertEquals(12,13);
			
			System.out.println("Test1 complete");
			System.out.println("Test12 complete");
			System.out.println("Test13 complete");
			obj.assertEquals(10, 10);
			System.out.println("Test14 complete");
			
			obj.assertAll();
			//assertAll(): assertAll() method is called to throw all the exceptions 
			//caught during the process of Selenium test automation execution. 
			//Soft Asserts are not included by default in the TestNG framework.
			//You have to include the package org. testng.
	}
}
