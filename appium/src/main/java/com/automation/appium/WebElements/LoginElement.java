package com.automation.appium.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.appium.Action.ActionDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginElement extends ActionDriver{
	public LoginElement(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	//Profile Section
	@FindBy(id="navigation_profile")
	public WebElement profile ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/icon'])[3]")
	public WebElement bookIcon ;
	
	//Login Section 	
	@FindBy(id="et_email_address")
	public WebElement userName ;
	
	@FindBy(id="et_password")
	public WebElement password ;
	
	@FindBy(id="btn_login")
	public WebElement login ;

	@FindBy(id="com.oneplus.calculator:id/digit_2")
	public WebElement two ;
	
	@FindBy(id="com.oneplus.calculator:id/digit_3")
	public WebElement three ;
	
	@FindBy(id="com.oneplus.calculator:id/op_add")
	public WebElement plus ;
	
	
	@FindBy(id="com.oneplus.calculator:id/eq")
	public WebElement equals ;
	
	@FindBy(id="com.oneplus.calculator:id/digit_5")
	public WebElement five ;

}
