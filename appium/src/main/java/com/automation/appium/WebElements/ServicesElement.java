package com.automation.appium.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.appium.Action.ActionDriver;

public class ServicesElement extends ActionDriver{
	public ServicesElement(WebDriver driver) {
		super(driver);
	}
	
	//services Section Section
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]")
	public WebElement skinCare ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_name'])[1]")
	public WebElement customizedFacials ;
	

}
