package com.automation.appium.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.appium.WebElements.AppointmentElement;
import com.automation.appium.WebElements.LoginElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppointmentFunction extends AppointmentElement {

	public AppointmentFunction(AndroidDriver<WebElement> driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void scheduleAppointment() {
		//swipeLeft();
		clickElement(scheduleAppointment);
	}
}
