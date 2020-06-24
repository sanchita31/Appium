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
	public LoginElement(AndroidDriver driver)
	{
		super(driver);
	}
	//Profile Section
	
	@AndroidFindBy(id="navigation_profile")
	public AndroidElement profile ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/icon'])[3]")
	public AndroidElement bookIcon ;
	
	//Login Section 	
	@AndroidFindBy(id="et_email_address")
	public AndroidElement userName ;
	
	@AndroidFindBy(id="et_password")
	public AndroidElement passWord ;
	
	@AndroidFindBy(id="btn_login")
	public AndroidElement login ;

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
	
	@FindBy(xpath="(//android.widget.ImageView[@content-desc='Product Image'])[4]/..")
	public WebElement searchIcon ;
	
	@FindBy(id="com.bigbasket.mobileapp:id/homePageSearchBox")
	public WebElement searchHomeBox ;
	
	@FindBy(id="com.bigbasket.mobileapp:id/searchView")
	public WebElement searchHomeView ;
	
	
	
	@FindBy(id="com.bigbasket.mobileapp:id/searchView")
	public WebElement search ;
	
	@FindBy(id="action_my_account")
	public WebElement myAccount ;
	
	@FindBy(id="com.bigbasket.mobileapp:id/textInputEmail")
	public WebElement inputEmail ;
	
	@FindBy(id="action_my_account")
	public WebElement a ;

}
