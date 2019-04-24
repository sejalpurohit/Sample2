package Dependencies.Dependencies;

import org.testng.annotations.Test;

public class TestClassB {
@Test(groups = {"smoke"} , dependsOnGroups= {"regression"})
public void classB_testCase1()
{
System.out.println("Class B , Test case 1 Executed");	
}
@Test
public void classB_testCase2()
{
System.out.println("Class B , Test case 2 Executed");	
}
@Test(groups= "smoke")
public void classB_testCase3()
{
System.out.println("Class B , Test case 3 Executed");	
}
}
