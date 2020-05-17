package com.automation.appium.functions;

import org.openqa.selenium.support.PageFactory;

import com.automation.appium.WebElements.ServicesElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ServicesFunction extends ServicesElement{
	
	public ServicesFunction(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

		public void selectService() {
			
			clickElement(skinCare);
			clickElement(customizedFacials);
			
		}
	}
