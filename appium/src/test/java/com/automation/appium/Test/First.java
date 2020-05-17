package com.automation.appium.Test;

import org.testng.annotations.Test;

import com.automation.appium.Action.ManagerInitializerAction;

public class First extends ManagerInitializerAction {
	
	
	@Test(priority = 1)
	public void LoginIntoApp()  {
		System.out.println("Sarting the test");
		
		login.appLogin();
		ap.scheduleAppointment();
		service.selectService();
		
	
}
	
	
	
}
