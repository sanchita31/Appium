package com.automation.appium.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.appium.WebElements.LoginElement;
import com.automation.appium.WebElements.ServicesElement;

public class ServicesFunction extends ServicesElement{
	
	public ServicesFunction(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

		public void selectService() {
			
			clickElement(skinCare);
			clickElement(customizedFacials);
			
		}
	}
