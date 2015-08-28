package com.wowautomation.page;

public class HomePage extends Page {

	public HomePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomePage goToHomePage(){
		getDriver().manage().window().maximize();
		return this;
	}
}
