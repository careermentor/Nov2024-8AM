package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesPkg.ReadPropFile;

public class MenuThemesPage 
{

	WebDriver driver;
	
	public MenuThemesPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
	
	public void click_exporeparks() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("home_menu_exploreparks_xpath"))).click();
		
	}
	
}
