package com.automation.appium.Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.appium.Action.ManagerInitializerAction;
//import com.beust.jcommander.Parameters;

public class First extends ManagerInitializerAction {
	
	
	@Test(priority = 1)
	@Parameters({"udid"})
	public void LoginIntoApp(String udid) throws IOException, InvalidFormatException, InterruptedException 
	{
	
		System.out.println("Sarting the test");
		login.appLogin(udid);
		System.out.println("Sarting with Skin Care");
		service.selectSkinCare(udid);
		//genActios.swipeUp();
		//ap.scheduleAppointment();
		
		
	
		
	
}
	
	
	
}
