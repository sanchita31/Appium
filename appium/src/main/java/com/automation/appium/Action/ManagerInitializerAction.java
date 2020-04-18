package com.automation.appium.Action;

import org.testng.annotations.BeforeMethod;

import com.automation.appium.functions.LoginFunction;

public class ManagerInitializerAction extends BrowserAction {
	
	protected LoginFunction loginFunction ;
	
	
	@BeforeMethod
	public void initialize() {
		loginFunction = new LoginFunction(driver);
		
	}

}
