package com.automation.appium.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.appium.WebElements.LoginElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginFunction extends LoginElement{
	
	public LoginFunction(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

		public void appLogin() {
			try {
				String username = "febchem@gmail.com";
				String pass = "Test1234!";
				
				clickElement(profile);
				
				
				//clickElement(login);
				Thread.sleep(5000);
				
				clickElement(login);
				
				//login.click();
				
				userName.sendKeys(username);
				password.sendKeys(pass);
				
				login.click();
				Thread.sleep(5000);
		
				clickElement(bookIcon);
				
			}catch(Exception e) {
				Assert.fail("Failed to login", e);
			}
		}
		
		
		public void appCalc() {
			try {
				two.click();
				plus.click();
				clickElement(three);
				equals.click();
				
			}catch(Exception e) {
				Assert.fail("Failed to login", e);
			}
		}
	}
