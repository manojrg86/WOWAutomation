package com.wowautomation.tests;

import org.testng.annotations.Test;

import com.seleniumtests.core.SeleniumTestPlan;
import com.wowautomation.page.Page;

public class WOWTests extends SeleniumTestPlan {
	
	@Test
	public void LoginTest() throws Exception{
		new Page().HomePage()
		.goToHomePage()
		.LoginPage();
	}

}
