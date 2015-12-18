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

	private String name = null;
	private String value = null;
	LocatorType locatorType=null;
	
	public PageElement(String name, String value,LocatorType type) {
		this.name = name;
		this.value = value;
		this.locatorType= type;	
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

}
