package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario 
{
	
	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
		Assert.assertEquals("Hello", "Hello world");
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test(priority=-2)
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test(priority=-1)
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	
}
