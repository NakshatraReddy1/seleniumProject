package pack;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = {"Sanity Test"})
	public void method1()
	
	{
	System.out.println("Sanity test 1");	
	
	
	}
	@Test(groups = {"Sanity Test"})
	public void method2()
	{
		System.out.println("Sanity test 2");		
	}
	@Test(groups = {"Regression Test"})
	public void method3()
	
	{
	System.out.println("Regression test 1");	
	}
	@Test(groups = {"Regression Test"})
	public void method4()
	{
		System.out.println("Regression test 2");		
	}
  @Test
  public void method5()
  {
	  System.out.println("Load Test");	  
  }
}
