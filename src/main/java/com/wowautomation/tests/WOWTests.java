package com.wowautomation.tests;

import org.testng.annotations.Test;

import com.seleniumtests.core.SeleniumTestPlan;
import com.wowautomation.entity.User;
import com.wowautomation.page.Page;

public class WOWTests extends SeleniumTestPlan {
	
	@Test
	public void LoginTest() throws Exception{
		
		User user =new User();
		user.email="jacksurname@fake.com";
		user.password="password";
		
		new Page(true).HomePage()
		.goToHomePage()
		.LoginPage()
		.login(user);
	}
	
	@Test
	public void ParenetRegistrationTest() throws Exception{
		
		User user =new User();
		user.email="jacksurname@fake.com";
		user.password="password";
		
		new Page(true).HomePage()
		.goToHomePage()
		.LoginPage()
		.registerParent(user);
	}
	
	@Test
	public void StudentRegistrationTest() throws Exception{
		
		User user =new User();
		user.email="jacksurname@fake.com";
		user.password="password";
		
		new Page(true).HomePage()
		.goToHomePage()
		.LoginPage()
		.registerStudent(user);
	}
}
