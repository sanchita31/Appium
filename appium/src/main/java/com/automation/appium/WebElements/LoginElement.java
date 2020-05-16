package com.automation.appium.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.appium.Action.ActionDriver;

public class LoginElement extends ActionDriver{
	public LoginElement(WebDriver driver) {
		super(driver);
	}
	//Profile Section
	@FindBy(id="navigation_profile")
	public WebElement profile ;
	
	
	//Login Section 	
	@FindBy(id="et_email_address")
	public WebElement userName ;
	
	@FindBy(xpath="et_password")
	public WebElement password ;
	
	@FindBy(xpath="btn_login")
	public WebElement login ;

}
