package org.wipro.automation.fb.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="ddfdata")
	public Object[][] testdata()
	{
		//String data1 = "user1";
		//Object data2[] = {"user1","pass1"};
		Object data3[][] = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return data3;
	}
	
	@DataProvider(name="ddfdata1")
	public Object[][] testdata1()
	{
		//String data1 = "user1";
		//Object data2[] = {"user1","pass1"};
		Object data3[][] = {{"santosh","modi"},{"robel","desta"},{"soleil","burgess"}};
		return data3;
	}
	
}
