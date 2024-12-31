package org.xyz.automation.abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DifferentControl 
{
	WebDriver driver;

	@Test
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();  //launch the chrome browser
		driver.manage().window().maximize();
		
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement a = driver.findElement(By.name("fld_username"));
		
		a.sendKeys("John");
		
		driver.findElement(By.xpath("//*[@value='home']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);
		//gen.selectByValue("2");  
		gen.selectByVisibleText("Male");
		
		driver.findElement(By.id("datepicker")).sendKeys("07/18/1981");
		driver.findElement(By.xpath("//a[text()='18']")).click();
		
		boolean beforechekbox = driver.findElement(By.name("terms")).isSelected();
		System.out.println(beforechekbox);
		driver.findElement(By.name("terms")).click();
		
		boolean afterchekbox = driver.findElement(By.name("terms")).isSelected();
		System.out.println(afterchekbox);
		
		//driver.findElement(By.className("displayPopup")).click();
		//driver.findElement(By.className("close")).click();
		
		boolean actlinkstatus = driver.findElement(By.className("displayPopup")).isEnabled();
		Assert.assertEquals(actlinkstatus, true);
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "California"));
		
		st.selectByVisibleText("Arizona");
		
	}
		
}
