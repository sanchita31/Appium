package com.automation.appium.Test;

import java.io.IOException;
import java.net.URL;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.appium.Action.BrowserAction;
import com.automation.appium.Action.ManagerInitializerAction;
//import com.beust.jcommander.Parameters;


public class First extends ManagerInitializerAction {
	

	@Test(priority = 1)
	public void LoginIntoApp() throws IOException, InvalidFormatException, InterruptedException 
	{
	
		System.out.println("Sarting the test");
		login.appLogin();
		System.out.println("Sarting with Skin Care");
		service.selectSkinCare();
		chempeel.selectChemPeel();
		acne.selectacne();
		micro.selectmicro();
		
		//System.out.println("Sarting the Ionic test");
		
		
	
	}}

	
	
	
