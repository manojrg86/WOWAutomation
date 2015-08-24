package com.wowautomation.page;

public class HomePage extends Page {

	public HomePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomePage goToHomePage(){
		getDriver().get("http://52.11.22.184:8080/login");
		return this;
	}
}
