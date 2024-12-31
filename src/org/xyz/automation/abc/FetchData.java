package org.xyz.automation.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchData 
{
	WebDriver driver;

	@Test
	public void launchBrowser()
	{
		
		//Step1
		driver= new ChromeDriver();  //launch the chrome browser
		
		String ExpURL = "https://www.facebook.com";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL);  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL); 
		
		System.out.println("Stop");
		//Step2
		
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUername = "Email address or phone number";
		
		String Actusername = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(Actusername);
		
		sa.assertEquals(Actusername, ExpUername);
		
		//Step3
		
		String Exploginbttn = "Log in";
		String ActLoginbttn = driver.findElement(By.name("login")).getText();
				
		System.out.println(ActLoginbttn);
		
		sa.assertEquals(ActLoginbttn, Exploginbttn);
		
		Point loginloc= driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		System.out.println(driver.getPageSource());
		
		sa.assertAll();
		
	}
	
}

