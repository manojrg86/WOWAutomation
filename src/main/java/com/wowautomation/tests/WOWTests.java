package com.wowautomation.tests;

import java.util.Date;

import org.testng.annotations.Test;

import com.seleniumtests.core.SeleniumTestPlan;
import com.wowautomation.entity.User;
import com.wowautomation.page.Page;

public class WOWTests extends SeleniumTestPlan {
	
	@Test(groups={"LoginTest","Test"})
	public void LoginTest() throws Exception{
		
		User user =new User();
		user.email="jacksurname@fake.com";
		user.password="password";
		
		new Page(true).HomePage()
		.goToHomePage()
		.LoginPage()
		.login(user);
	}
	
	@Test(groups={"ParentRegistrationTest","Test"})
	public void ParentRegistrationTest() throws Exception{
		
		User user =new User();
		String timeStamp=new Date().getTime()+"";
		user.email=timeStamp+"_email@fake.com";
		user.password="password";
		user.userName=timeStamp+"_email";
		
		new Page(true).HomePage()
		.goToHomePage()
		.LoginPage()
		.registerParent(user);
	}
	
	@Test(groups={"StudentRegistrationTest","Test"})
	public void StudentRegistrationTest() throws Exception{
		
		User user =new User();
		String timeStamp=new Date().getTime()+"";
		user.email=timeStamp+"_email@fake.com";
		user.password="password";
		user.userName=timeStamp+"_email";
		
		new Page(true).HomePage()
		.goToHomePage()
		.LoginPage()
		.registerStudent(user);
	}
}
