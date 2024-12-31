package org.xyz.automation.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	{
		
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://api.universalparks.com/oidc/Account/Login");
	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();	
	}
	
	@Test(enabled=true)
	public void loginfunc()
	{
		
		//driver.findElement(By.id("email")).sendKeys("user1");
		
		//driver.findElement(By.id("email")).clear();
		
		//driver.findElement(By.id("email")).sendKeys("user2");
		
	//	Actions act = new Actions(driver);
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.name("Username")).sendKeys("user1");
		
		//driver.findElement(By.name("pass")).sendKeys("pass1234");
		
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@Test(enabled=false)
	public void signupfunc()
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("user1");
		
	}
	
}
