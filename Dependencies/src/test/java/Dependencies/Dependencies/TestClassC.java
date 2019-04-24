package Dependencies.Dependencies;

import org.testng.annotations.Test;

public class TestClassC {
	@Test(dependsOnGroups= {"smoke","regression"})
	public void classC_testCase1()
	{
	System.out.println("Class C , Test case 1 Executed");	
	}
	@Test
	public void classC_testCase2()
	{
	System.out.println("Class C , Test case 2 Executed");	
	}
	@Test(groups= "smoke")
	public void classC_testCase3()
	{
	System.out.println("Class C , Test case 3 Executed");	
	}
}
