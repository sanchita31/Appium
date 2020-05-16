package com.automation.appium.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.appium.WebElements.AppointmentElement;
import com.automation.appium.WebElements.LoginElement;

public class AppointmentFunction extends AppointmentElement {

	public AppointmentFunction(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void scheduleAppointment() {
		clickElement(scheduleAppointment);
	}
}
