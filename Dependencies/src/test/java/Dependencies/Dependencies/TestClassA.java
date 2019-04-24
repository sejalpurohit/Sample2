package Dependencies.Dependencies;

import org.testng.annotations.Test;

@Test(groups = {"regression"}, priority =-1)
public class TestClassA {
	@Test(priority=1)
	public void classA_testCase1() {
		System.out.println("Class A  , Test case 1 Executed");
		
	}
	@Test(dependsOnMethods = {"classA_testCase1"})
	public void classA_testCase2() {
		System.out.println("Class A, Test case 2 Executed");
		
	}
	@Test(dependsOnMethods = {"classA_testCase2"})
	public void classA_testCase3() {
		System.out.println("Class A , Test case 3 Executed");	
	}

}
