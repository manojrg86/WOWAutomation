package com.framework.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		getWebElement(pageElement).click();
	}
	
	public void type(PageElement pageElement,String value){
		getWebElement(pageElement).sendKeys(value);
	}
}
