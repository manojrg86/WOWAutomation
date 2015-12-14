package com.framework.core;


public class SeleniumTestContext {

	public static ThreadLocal<SeleniumTestContext> thread = new ThreadLocal<SeleniumTestContext>() {
		protected  SeleniumTestContext initialValue() {
			return new SeleniumTestContext();
		}
	};
	
	public SeleniumTestContext() {
		// TODO Auto-generated constructor stub
	}
}
