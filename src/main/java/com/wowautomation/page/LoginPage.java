package com.wowautomation.page;

import org.openqa.selenium.By;

import com.seleniumtests.core.CustomAssertion;
import com.seleniumtests.helper.WaitHelper;
import com.seleniumtests.webelements.ButtonElement;
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
	public LinkElement registerParentLink=new LinkElement("Parent link", By.xpath("//a[contains(.,'Parent')]"));
	public TextFieldElement firstNameTextBox=new TextFieldElement("First Name Text box", By.id("firstName"));
	public TextFieldElement lastNameTextBox=new TextFieldElement("Last Name Text box", By.id("latsName"));

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
		registerParentLink.click();
		emailTextBox.sendKeys(user.email);
		passwordTextBox.sendKeys(user.password);
		firstNameTextBox.sendKeys(user.firstName);
		lastNameTextBox.sendKeys(user.lastName);
		signInButton.click();
		WaitHelper.waitForSeconds(5);
		CustomAssertion.assertTrue(logoutLink.isDisplayed(), "Logout is not displayed");
		return this;
	}
	
	public LoginPage registerStudent(User user){
		emailTextBox.sendKeys(user.email);
		passwordTextBox.sendKeys(user.password);
		signInButton.click();
		WaitHelper.waitForSeconds(5);
		CustomAssertion.assertTrue(logoutLink.isDisplayed(), "Logout is not displayed");
		return this;
	}
}
