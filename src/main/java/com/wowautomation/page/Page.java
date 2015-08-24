package com.wowautomation.page;

import com.seleniumtests.webelements.PageObject;

public class Page extends PageObject {

	public Page() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginPage LoginPage() throws Exception{
		return new LoginPage();
	}
	
	public HomePage HomePage() throws Exception{
		return new HomePage();
	}
}
