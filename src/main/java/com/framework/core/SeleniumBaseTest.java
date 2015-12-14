package com.framework.core;

import org.testng.annotations.BeforeMethod;

public class SeleniumBaseTest {
	
	@BeforeMethod(alwaysRun=true)
	public void setUp(){
		SeleniumTestContext.get().getWebdriver().manage().window().maximize();
	}

}
