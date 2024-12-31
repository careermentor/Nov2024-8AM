package testNGDemo;

import org.testng.annotations.Test;

public class TestScenario9 
{
	
	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test(groups="Regression")
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test(groups="Sanity")
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	
}
