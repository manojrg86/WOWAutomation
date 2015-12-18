package com.framework.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.framework.utils.TestLogger;

public class WebCommand {

	private WebDriver driver;

	public WebCommand(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getWebElement(PageElement pageElement){
		WebElement webElement=null;
		return webElement;
	}
	
	public void click(PageElement pageElement){
		TestLogger.log("Click "+pageElement.name);
		getWebElement(pageElement).click();
	}
	
	public void type(PageElement pageElement,String value){
		TestLogger.log("Type "+value+ "in "+pageElement.name);
		getWebElement(pageElement).sendKeys(value);
	}
	
	public void goTo(String url){
		driver.get(url);
	}
}
