package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.basePkg.InitiateBrowser;
import org.wipro.automation.fb.pages.SignPage;
import org.wipro.automation.fb.utilitiesPkg.ReadPropFile;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc02_validcred_signupfunc() throws Exception
	{
		SignPage sign = new SignPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname(ReadPropFile.readconfig("signup_firstname"));
		sign.enter_lastnamename("Thomas");
		sign.select_dob_day("28");
		sign.click_male();
		sign.enter_username("user123@gmail.com");
		sign.enter_password("pass1234");
		sign.click_signupbttn();
	}
	
}
