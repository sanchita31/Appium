package com.automation.appium.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.appium.Action.ManagerInitializerAction;

public class First extends ManagerInitializerAction {
	
	
	@Test(priority = 1)
	public void LoginIntoApp() throws IOException  {
		System.out.println("Sarting the test");
		//genActios.swipeLeft();
		//genActios.swipeRight();
		//genActios.swipeRight();
		login.appLogin();
		
		//ap.scheduleAppointment();
		
		service.selectSkinCare();
		genActios.swipeUp();
		ap.scheduleAppointment();
		
		
	
		
	
}
	
	
	
}
