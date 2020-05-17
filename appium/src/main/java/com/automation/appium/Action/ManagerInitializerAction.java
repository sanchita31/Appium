package com.automation.appium.Action;

import org.testng.annotations.BeforeMethod;

import com.automation.appium.functions.AppointmentFunction;
import com.automation.appium.functions.LoginFunction;
import com.automation.appium.functions.ServicesFunction;

public class ManagerInitializerAction extends BrowserAction {
	
	protected LoginFunction login ;
	protected AppointmentFunction ap ;
	protected ServicesFunction service ;
	protected ActionDriver genActios ;
	
	
	
	@BeforeMethod
	public void initialize() {
		login = new LoginFunction(driver);
		ap = new AppointmentFunction(driver);
		service = new ServicesFunction(driver);
		genActios = new ActionDriver(driver);
		
	}

}
