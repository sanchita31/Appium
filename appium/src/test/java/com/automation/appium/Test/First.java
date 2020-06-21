package com.automation.appium.Test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.appium.Action.ManagerInitializerAction;
//import com.beust.jcommander.Parameters;

public class First extends ManagerInitializerAction {
	
	
	@Test(priority = 1)
	@Parameters({"udid"})
	public void LoginIntoApp(String udid) throws IOException  {
	
		System.out.println("Sarting the test");
		
		
		//login.appLogin(udid);
		login.appLogin(udid);
		
		//ap.scheduleAppointment();
		
		service.selectSkinCare();
		genActios.swipeUp();
		ap.scheduleAppointment();
		
		
	
		
	
}
	
	
	
}
