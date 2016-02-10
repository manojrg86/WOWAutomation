package com.wowautomation.steps;

import java.util.Date;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.wowautomation.entity.User;
import com.wowautomation.page.Page;

public class NavigationSteps extends Page {
	
	
	@Given("user lands on home page")
	public void gotoHomePage(){
		homePage().goToHomePage();
	}

	@When("user register as parent")
	public void registerParent(){
		User user =new User();
		String timeStamp=new Date().getTime()+"";
		user.email=timeStamp+"_email@fake.com";
		user.password="password";
		user.userName=timeStamp+"_email";
		
		loginPage().registerParent(user);

	}
	
	@When("user register as student")
	public void registerStudent(){
		User user =new User();
		String timeStamp=new Date().getTime()+"";
		user.email=timeStamp+"_email@fake.com";
		user.password="password";
		user.userName=timeStamp+"_email";
		
		loginPage().registerStudent(user);
	}

	@Then("verify user landing page")
	public void verifyLandingPage(){
		System.out.println("verify user landing page");

	}
}
