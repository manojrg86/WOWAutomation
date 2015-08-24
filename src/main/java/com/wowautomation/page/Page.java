package com.wowautomation.page;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.webelements.PageObject;

public class Page extends PageObject {

	public Page(final boolean openPageUrl) throws Exception {
		super(null,openPageUrl ? SeleniumTestsContextManager.getThreadContext().getAppURL() : null);
		// TODO Auto-generated constructor stub
	}

	public Page() throws Exception{
		super(null,null);
	}
	public LoginPage LoginPage() throws Exception{
		return new LoginPage();
	}
	
	public HomePage HomePage() throws Exception{
		return new HomePage();
	}
}
