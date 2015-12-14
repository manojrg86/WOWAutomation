/*
 * Copyright 2015 www.seleniumtests.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.framework.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.seleniumtests.core.TestLogging;
import com.seleniumtests.driver.BrowserType;
import com.seleniumtests.driver.ScreenshotUtil;
import com.seleniumtests.driver.WebUIDriver;
import com.seleniumtests.helper.ContextHelper;
import com.seleniumtests.helper.WaitHelper;
import com.thoughtworks.selenium.webdriven.JavascriptLibrary;

/**
 * Provides methods to interact with a web page. All HTML element (ButtonElement, LinkElement, TextFieldElement, etc.)
 * extends from this class.
 */
public class PageElement {

	public static enum LocatorType {
		ID,
		NAME,
		CLASS_NAME,
		LINK_TEXT,
		PARTIAL_LINK_TEXT,
		CSS_SELECTOR,
		TAG_NAME,
		XPATH,
	};

	public String name = null;
	public String value = null;
	LocatorType locatorType=null;
	
	public PageElement(String name, String value,LocatorType type) {
		this.name = name;
		this.value = value;
		this.locatorType= type;	
	}
}
