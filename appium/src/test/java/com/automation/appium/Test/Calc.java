package com.automation.appium.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.appium.Action.ManagerInitializerAction;
import com.automation.appium.generic.Report;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Calc extends ManagerInitializerAction {
	
	Report reportExtent = new Report();
	
	
	@Test(priority = 0)
	public void calc() throws IOException  {
		
		login.appCBigbaskt();
		System.out.println("Executed");
		
	}
	
	
}
