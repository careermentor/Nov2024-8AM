package org.xyz.automation.abc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardMouse_AlertFrames 
{
	WebDriver driver;

	@Test
	public void handleframes() throws Exception
	{
		
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		CaptureScreenshot.results(driver,"handleframes");
	}
	
	@Test(enabled=true)
	public void handlealerts() throws Exception
	{
		
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.results(driver,"handlealerts");
	}
	
	@Test(enabled=false)
	public void handlemouse_mphasis() throws Exception
	{
		
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://www.mphasis.com/home.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Industries']"))).perform();
		
		
		
		//Thread.sleep(5000);
		
		act.click(driver.findElement(By.xpath("//a[text()='Careers']"))).perform();
		
		
		Set<String> wind_id = driver.getWindowHandles();
		System.out.println(wind_id);
		
		Iterator<String> itr = wind_id.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win1);
	
	}
	
	@Test(enabled=false)
	public void handlemouse_universalOrlando() throws Exception
	{
		
		driver= new ChromeDriver();  //launch the chrome browser
		
		//driver.get("https://www.universalorlando.com/web/en/us");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		
		//act.click(driver.findElement(By.xpath("//span[text()='Shop Merch']"))).perform();
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()='Shop Merch']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> wind_id = driver.getWindowHandles();
		System.out.println(wind_id);
		
		Iterator<String> itr = wind_id.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		
	}
	@Test(enabled=false)
	public void handleKeyboard()
	{
		
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass12345").perform();
		//t.sendKeys(Keys.ENTER).perform();
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
	
	}
		
}
