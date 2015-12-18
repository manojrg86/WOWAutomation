package com.wowautomation.page;

import com.framework.web.PageObject;

public class Page extends PageObject {


	public LoginPage LoginPage(){
		return new LoginPage();
	}
	
	public HomePage HomePage(){
		return new HomePage();
	}
}
