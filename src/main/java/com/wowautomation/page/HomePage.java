package com.wowautomation.page;

public class HomePage extends Page {

	public HomePage(){
		super();
		// TODO Auto-generated constructor stub
	}

	public HomePage goToHomePage(){
		command().goTo("http://ec2-52-11-22-184.us-west-2.compute.amazonaws.com/login#");
		return this;
	}
}
