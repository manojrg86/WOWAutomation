package com.wowautomation.page;

public class HomePage extends Page {

	public HomePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomePage goToHomePage(){
		getDriver().get("http://52.25.99.82:8080/login");
		return this;
	}
}
