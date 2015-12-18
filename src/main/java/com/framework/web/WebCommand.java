package com.framework.web;

import org.openqa.selenium.By;
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
		
		switch (pageElement.locatorType) {
		case XPATH:
			webElement=driver.findElement(By.xpath(pageElement.getValue()));
			break;
		case ID:
			webElement=driver.findElement(By.id(pageElement.getValue()));
			break;
			
		default:
			break;
		}
		return webElement;
	}
	
	public void click(PageElement pageElement){
		TestLogger.log("Click "+pageElement.getName());
		getWebElement(pageElement).click();
	}
	
	public void type(PageElement pageElement,String value){
		TestLogger.log("Type "+value+ " in "+pageElement.getName());
		getWebElement(pageElement).sendKeys(value);
	}
	
	public void goTo(String url){
		driver.get(url);
	}
}
