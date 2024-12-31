package org.xyz.automation.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalendarDemo 
{
	WebDriver driver;

	@Test
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();  //launch the chrome browser
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".commonModal__close")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@aria-label='Sat Jan 11 2025']")).click();
	}
		
}
