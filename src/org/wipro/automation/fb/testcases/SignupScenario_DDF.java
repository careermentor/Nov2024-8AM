package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.basePkg.InitiateBrowser;
import org.wipro.automation.fb.dataGenerator.TestDataGenerator;
import org.wipro.automation.fb.pages.SignPage;

public class SignupScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="ddfdata1",dataProviderClass=TestDataGenerator.class)
	public void tc02_validcred_signupfunc(String fname, String lname) throws Exception
	{
		SignPage sign = new SignPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname(fname);
		sign.enter_lastnamename(lname);
		sign.select_dob_day("28");
		sign.click_male();
		sign.enter_username("user123@gmail.com");
		sign.enter_password("pass1234");
		sign.click_signupbttn();
	}
	
}
