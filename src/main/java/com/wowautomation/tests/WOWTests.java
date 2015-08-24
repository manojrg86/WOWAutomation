package com.wowautomation.tests;

import com.seleniumtests.core.SeleniumTestPlan;
import com.wowautomation.page.Page;

public class WOWTests extends SeleniumTestPlan {
	
	public void LoginTest() throws Exception{
		new Page().getLoginPage();
	}

}
