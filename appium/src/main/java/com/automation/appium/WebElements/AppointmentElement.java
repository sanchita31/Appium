package com.automation.appium.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.appium.Action.ActionDriver;

public class AppointmentElement extends ActionDriver{
	public AppointmentElement(WebDriver driver) {
		super(driver);
	}
	//appointment Section Section
	@FindBy(id="btn_schedule_appointment")
	public WebElement scheduleAppointment ;
	

}
