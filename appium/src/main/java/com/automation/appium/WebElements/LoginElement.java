package com.automation.appium.WebElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.appium.Action.ActionDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginElement extends ActionDriver
{
	public LoginElement(AndroidDriver<AndroidElement> driver)
	{
		super(driver);
	}
	//Profile Section
	
	@FindBy(id="navigation_profile")
	public WebElement profile ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/icon'])[3]")
	public WebElement bookIcon ;
	
	//Login Section 	
	@AndroidFindBy(id="et_email_address")
	public WebElement userName ;
	
	@AndroidFindBy(id="et_password")
	public MobileElement passWord ;
	
	@AndroidFindBy(id="btn_login")
	public WebElement login ;

	@AndroidFindBy(id="com.oneplus.calculator:id/digit_2")
	public WebElement two ;
	
	@AndroidFindBy(id="com.oneplus.calculator:id/digit_3")
	public AndroidElement three ;
	
	@AndroidFindBy(id="com.oneplus.calculator:id/op_add")
	public AndroidElement plus ;
	
	
	@AndroidFindBy(id="com.oneplus.calculator:id/eq")
	public AndroidElement equals ;
	
	@AndroidFindBy(id="com.oneplus.calculator:id/digit_5")
	public AndroidElement five ;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@content-desc='Product Image'])[4]/..")
	public AndroidElement searchIcon ;
	
	@AndroidFindBy(id="com.bigbasket.mobileapp:id/homePageSearchBox")
	public AndroidElement searchHomeBox ;
	
	@AndroidFindBy(id="com.bigbasket.mobileapp:id/searchView")
	public AndroidElement searchHomeView ;
	
	
	
	@AndroidFindBy(id="com.bigbasket.mobileapp:id/searchView")
	public AndroidElement search ;
	
	@AndroidFindBy(id="action_my_account")
	public AndroidElement myAccount ;
	
	@AndroidFindBy(id="com.bigbasket.mobileapp:id/textInputEmail")
	public AndroidElement inputEmail ;
	
	@AndroidFindBy(id="action_my_account")
	public AndroidElement a ;

}
