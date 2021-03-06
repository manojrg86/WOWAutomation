package com.wowautomation.page;

import com.automation.framework.web.PageElement;
import com.automation.framework.web.PageElement.LocatorType;
import com.wowautomation.entity.User;

public class LoginPage extends Page {

	public LoginPage(){
		super();
		// TODO Auto-generated constructor stub
	}

	public PageElement emailTextBox=new PageElement("Email Text box","userName",LocatorType.ID);
	public PageElement passwordTextBox=new PageElement("Password Text box", "password",LocatorType.ID);
	public PageElement signInButton=new PageElement("Sign in button", "//button[contains(.,'Sign in')]",LocatorType.XPATH);
	public PageElement logoutLink=new PageElement("Logout link", "//a[contains(.,'Log out')]",LocatorType.XPATH);
	public PageElement registerLink=new PageElement("Register link", "//a[contains(.,'Register')]",LocatorType.XPATH);
	public PageElement registerParentLink=new PageElement("Parent link","//li[@class='dropdown open']//a[contains(.,'Parent')]",LocatorType.XPATH);
	public PageElement registerStudentLink=new PageElement("Student link","//li[@class='dropdown open']//a[contains(.,'Student')]",LocatorType.XPATH);
	public PageElement firstNameTextBox=new PageElement("First Name Text box","firstname",LocatorType.ID);
	public PageElement lastNameTextBox=new PageElement("Last Name Text box","lastname",LocatorType.ID);
	public PageElement userNameTextBox=new PageElement("user Name Text box", "username",LocatorType.ID);
	public PageElement registerEmailTextBox=new PageElement("Email Text box", "email",LocatorType.ID);
	public PageElement confirmEmailTextBox=new PageElement("confirm email Text box","confirmemail",LocatorType.ID);
	public PageElement registerPasswordTextBox=new PageElement("password Text box", "password",LocatorType.ID);
	public PageElement confirmpasswordTextBox=new PageElement("confirm password Text box", "confirmpassword",LocatorType.ID);
	PageElement age = new PageElement("age", "belowThirteen",LocatorType.ID);

	
	PageElement birthday = new PageElement("Birthday", "birthDate",LocatorType.ID);
	PageElement gender = new PageElement("Gender", "gender1",LocatorType.ID);
	PageElement marital = new PageElement("Marital Status","maritalStatus2",LocatorType.ID);
	PageElement noOfKids = new PageElement("Number of Children","noOfChildren",LocatorType.ID);
	PageElement ethnic = new PageElement("Ethnic Groups", "ethnicity",LocatorType.ID);
	PageElement annualIncome = new PageElement("annual income","annualIncome",LocatorType.ID);
	PageElement edLevel = new PageElement("Education Level","educationLevel",LocatorType.ID);
	PageElement occupation = new PageElement("Occupation","occupation",LocatorType.ID);
	
	public PageElement signUpButton=new PageElement("Sign up button", "//button[contains(.,'Sign Up')]",LocatorType.XPATH);
	public PageElement policy=new PageElement("policy checkbox", "policy",LocatorType.ID);
	public PageElement terms=new PageElement("terms checkbox", "terms",LocatorType.ID);



	public LoginPage login(User user){
		command().type(emailTextBox,user.email);
		command().type(passwordTextBox,user.password);
		command().click(signInButton);
		return this;
	}
	
	public LoginPage registerParent(User user){
		command().click(registerLink);
		command().click(registerParentLink);
		command().type(firstNameTextBox,user.firstName);
		command().type(lastNameTextBox,user.lastName);
		command().type(userNameTextBox,user.userName);
		command().type(registerEmailTextBox,user.email);
		command().type(confirmEmailTextBox,user.email);
		command().type(registerPasswordTextBox,user.password);
		command().type(confirmpasswordTextBox,user.password);
		
		command().type(birthday,"11/11/1999");
		
		command().type(occupation,"Janitor");
		command().selectUsingIndex(edLevel, 3); 
		command().type(annualIncome,"10000");
		command().selectUsingIndex(ethnic,1);
		command().click(gender);
		command().click(marital);
		command().type(noOfKids,"3");
		
		command().click(terms);		
		command().click(policy);
		command().click(signUpButton);
		
		command().click(terms);		
		command().click(policy);
		command().click(signUpButton);

		
		return this;
	}
	
	public LoginPage registerStudent(User user){
		command().click(registerLink);
		command().click(registerStudentLink);
		command().selectUsingIndex(age, 2);
		command().type(firstNameTextBox,user.firstName);
		command().type(lastNameTextBox,user.lastName);
		command().type(userNameTextBox,user.userName);
		command().type(registerEmailTextBox,user.email);
		command().type(confirmEmailTextBox,user.email);
		command().type(registerPasswordTextBox,user.password);
		command().type(confirmpasswordTextBox,user.password);
		command().click(policy);
		command().click(terms);
		command().click(signUpButton);

		return this;
	}
}
