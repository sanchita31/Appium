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
	public MobileElement profile ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/icon'])[3]")
	public MobileElement bookIcon ;
	
	//Login Section 	
	@FindBy(id="et_email_address")
	public MobileElement userName ;
	
	@FindBy(id="et_password")
	public MobileElement password ;
	
	@FindBy(id="btn_login")
	public MobileElement login ;

	@FindBy(id="com.oneplus.calculator:id/digit_2")
	public MobileElement two ;
	
	@FindBy(id="com.oneplus.calculator:id/digit_3")
	public MobileElement three ;
	
	@FindBy(id="com.oneplus.calculator:id/op_add")
	public MobileElement plus ;
	
	
	@FindBy(id="com.oneplus.calculator:id/eq")
	public MobileElement equals ;
	
	@FindBy(id="com.oneplus.calculator:id/digit_5")
	public MobileElement five ;
	
	@FindBy(xpath="(//android.widget.ImageView[@content-desc='Product Image'])[4]/..")
	public MobileElement searchIcon ;
	
	@FindBy(id="com.bigbasket.mobileapp:id/homePageSearchBox")
	public MobileElement searchHomeBox ;
	
	@FindBy(id="com.bigbasket.mobileapp:id/searchView")
	public MobileElement searchHomeView ;
	
	
	
	@FindBy(id="com.bigbasket.mobileapp:id/searchView")
	public MobileElement search ;
	
	@FindBy(id="action_my_account")
	public MobileElement myAccount ;
	
	@FindBy(id="com.bigbasket.mobileapp:id/textInputEmail")
	public MobileElement inputEmail ;
	
	@FindBy(id="action_my_account")
	public MobileElement a ;

}
