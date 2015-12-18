package com.framework.web;

import com.framework.core.SeleniumTestContext;

public class PageObject {

	public WebCommand command(){
		return SeleniumTestContext.get().getWebCommand();
	}
}
