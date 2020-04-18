package com.automation.appium.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.appium.WebElements.LoginElement;

public class LoginFunction extends LoginElement{
	
	public LoginFunction(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

}
