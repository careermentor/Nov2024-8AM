package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.fb.utilitiesPkg.ReadPropFile;

public class SignPage 
{

	WebDriver driver;
	
	public SignPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("login_createnewaccount_xpath"))).click();
		
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_firstname_name"))).sendKeys(fname);
		
	}
	

	public void enter_lastnamename(String lname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_lastname_name"))).sendKeys(lname);
		
	}
	
	public void select_dob_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFile.readelement("signup_dob_day_name"))));
		
		dob_day.selectByVisibleText(day);
		
	}
	
	public void click_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("signup_gender_male_xpath"))).click();
		
	}
	
	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_username_name"))).sendKeys(uname);
		
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_password_name"))).sendKeys(pass);
		
	}
	
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_signupbttn_name"))).click();
		
	}
	
}
