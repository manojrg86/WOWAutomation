package com.wowautomation.page;

import org.openqa.selenium.By;

import com.seleniumtests.core.CustomAssertion;
import com.seleniumtests.helper.WaitHelper;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.CheckBoxElement;
import com.seleniumtests.webelements.LinkElement;
import com.seleniumtests.webelements.TextFieldElement;
import com.wowautomation.entity.User;

public class LoginPage extends Page {

	public LoginPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextFieldElement emailTextBox=new TextFieldElement("Email Text box", By.id("userName"));
	public TextFieldElement passwordTextBox=new TextFieldElement("Password Text box", By.id("password"));
	public ButtonElement signInButton=new ButtonElement("Sign in button", By.xpath("//button[contains(.,'Sign in')]"));
	public LinkElement logoutLink=new LinkElement("Logout link", By.xpath("//a[contains(.,'Log out')]"));
	public LinkElement registerLink=new LinkElement("Register link", By.xpath("//a[contains(.,'Register')]"));
	public LinkElement registerParentLink=new LinkElement("Parent link", By.xpath("//li[@class='dropdown open']//a[contains(.,'Parent')]"));
	public LinkElement registerStudentLink=new LinkElement("Student link", By.xpath("//li[@class='dropdown open']//a[contains(.,'Student')]"));
	public TextFieldElement firstNameTextBox=new TextFieldElement("First Name Text box", By.id("firstname"));
	public TextFieldElement lastNameTextBox=new TextFieldElement("Last Name Text box", By.id("lastname"));
	public TextFieldElement userNameTextBox=new TextFieldElement("user Name Text box", By.id("username"));
	public TextFieldElement registerEmailTextBox=new TextFieldElement("Email Text box", By.id("email"));
	public TextFieldElement confirmEmailTextBox=new TextFieldElement("confirm email Text box", By.id("confirmemail"));
	public TextFieldElement registerPasswordTextBox=new TextFieldElement("password Text box", By.id("password"));
	public TextFieldElement confirmpasswordTextBox=new TextFieldElement("confirm password Text box", By.id("confirmpassword"));
	public ButtonElement signUpButton=new ButtonElement("Sign up button", By.xpath("//button[contains(.,'Sign Up')]"));
	public CheckBoxElement policy=new CheckBoxElement("policy checkbox", By.id("policy"));
	public CheckBoxElement terms=new CheckBoxElement("terms checkbox", By.id("terms"));



	public LoginPage login(User user){
		emailTextBox.sendKeys(user.email);
		passwordTextBox.sendKeys(user.password);
		signInButton.click();
		WaitHelper.waitForSeconds(5);
		CustomAssertion.assertTrue(logoutLink.isDisplayed(), "Logout is not displayed");
		return this;
	}
	
	public LoginPage registerParent(User user){
		registerLink.click();
		WaitHelper.waitForSeconds(2);
		registerParentLink.click();
		firstNameTextBox.sendKeys(user.firstName);
		lastNameTextBox.sendKeys(user.lastName);
		userNameTextBox.sendKeys(user.userName);
		registerEmailTextBox.sendKeys(user.email);
		confirmEmailTextBox.sendKeys(user.email);
		registerPasswordTextBox.sendKeys(user.password);
		confirmpasswordTextBox.sendKeys(user.password);
		policy.click();
		terms.click();
		signUpButton.click();
		WaitHelper.waitForSeconds(5);
		CustomAssertion.assertTrue(logoutLink.isDisplayed(), "Logout is not displayed");
		return this;
	}
	
	public LoginPage registerStudent(User user){
		registerLink.click();
		WaitHelper.waitForSeconds(2);
		registerStudentLink.click();
		firstNameTextBox.sendKeys(user.firstName);
		lastNameTextBox.sendKeys(user.lastName);
		userNameTextBox.sendKeys(user.userName);
		registerEmailTextBox.sendKeys(user.email);
		confirmEmailTextBox.sendKeys(user.email);
		registerPasswordTextBox.sendKeys(user.password);
		confirmpasswordTextBox.sendKeys(user.password);
		policy.click();
		terms.click();
		signUpButton.click();
		WaitHelper.waitForSeconds(5);
		CustomAssertion.assertTrue(logoutLink.isDisplayed(), "Logout is not displayed");
		return this;
	}
}
