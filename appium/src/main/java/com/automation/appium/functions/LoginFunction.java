package com.automation.appium.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.appium.WebElements.LoginElement;

public class LoginFunction extends LoginElement{
	
	public LoginFunction(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

		public void appLogin() {
			try {
				String username = "febchem@gmail.com";
				String pass = "Test1234!";
				
				userName.sendKeys(username);
				password.sendKeys(pass);
				
				login.click();
				
			}catch(Exception e) {
				Assert.fail("Failed to login", e);
			}
		}
	}
