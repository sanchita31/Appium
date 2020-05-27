package com.automation.appium.Test;

import org.testng.annotations.Test;

import com.automation.appium.Action.ManagerInitializerAction;

public class Calc extends ManagerInitializerAction {
	
	
	@Test(priority = 0)
	public void calc()  {
		
		login.appCBigbaskt();
		System.out.println("Executed");
		
	}
	
	
}
