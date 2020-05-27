package com.automation.appium.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.appium.Action.ActionDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IconsElement extends ActionDriver{
	public IconsElement(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	//appointment Section Section
	
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/icon'])[1]")
	public WebElement homeIcon ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/icon'])[2]")
	public WebElement profileIcon ;
	

	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/icon'])[3]")
	public WebElement bookIcon ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/icon'])[4]")
	public WebElement locationIcon ;


}
