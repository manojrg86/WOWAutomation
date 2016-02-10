package com.wowautomation.page;

import com.automation.framework.web.PageObject;

public class Page extends PageObject {


	public LoginPage loginPage(){
		return new LoginPage();
	}
	
	public HomePage homePage(){
		return new HomePage();
	}
}
