package com.automation.appium.functions;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.appium.WebElements.LoginElement;
import com.automation.appium.generic.ExcelReader;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginFunction extends LoginElement{
	
	public LoginFunction(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	ExcelReader excel = new ExcelReader();
		public void appLogin() {
			try {
				
				List<String> userCred  = excel.getDetails("DataSheet", "Login");
				
				String username = userCred.get(0).toString().trim();
				String pass = userCred.get(1).toString().trim();
				
				clickElement(profile);
				reportLog("appLogin");
				
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
		
		public void appCBigbaskt() {
			try {
				tapByCoordinates1();
				verticalSwipeByPercentages(0.6, 0.3, 0.5);
				horizontalSwipeByPercentage(0.6, 0.3, 0.2);
				//MobileElement ele = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc='Product Image'])[4]/.."));
				tapByCoordinates(95,236);
				Thread.sleep(5000);
				//searchHomeView.setValue("fruits");
			/*	MobileElement element = (MobileElement) driver.findElementById("com.bigbasket.mobileapp:id/searchView");
				
				element.click();*/
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].value='Test';", searchHomeView);
				//element.setT
				driver.navigate().back();
				searchHomeView.sendKeys("fruits");
				
				/*searchIcon.click();
				search.sendKeys("Fruits");*/
			}catch(Exception e) {
				Assert.fail("Failed to login", e);
			}
		}
	}
