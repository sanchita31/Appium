package com.automation.appium.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.appium.Action.ActionDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppointmentElement extends ActionDriver{
	public AppointmentElement(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	//appointment Section Section
	@FindBy(id="btn_schedule_appointment")
	public MobileElement scheduleAppointment ;
	

}
