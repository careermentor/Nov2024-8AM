package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.basePkg.InitiateBrowser;
import org.wipro.automation.fb.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_validcred_loginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1234");
		login.click_loginbttn();
		
		//because "this.driver" is null
	}
	
}
