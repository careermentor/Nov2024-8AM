package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.basePkg.InitiateBrowser;
import org.wipro.automation.fb.pages.MenuThemesPage;

public class ExploreThemes_Scenaio extends InitiateBrowser
{

	@Test
	public void validate_themeparks_menu() throws Exception
	{
		MenuThemesPage menu = new MenuThemesPage(driver);
		
		menu.click_exporeparks();
	}
	
}
