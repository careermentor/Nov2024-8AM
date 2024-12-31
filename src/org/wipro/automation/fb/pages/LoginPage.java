package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesPkg.ReadPropFile;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("login_username_name"))).sendKeys(uname);
		
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelement("login_password_id"))).sendKeys(pass);
		
	}
	
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.readelement("login_loginbttn_css"))).click();
		
	}
	
}
