package com.automation.appium.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.appium.Action.ActionDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ServicesElement extends ActionDriver
{
	public ServicesElement(AndroidDriver<AndroidElement> driver)
	{
		super(driver);
	}
	
	//services Section 
	
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[1]")
	public WebElement massage ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[2]")
	public WebElement totalBodyStretch ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[3]")
	public WebElement rapidTensionRelief ;
	
	

	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]")
	public MobileElement skinCare ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_name'])[1]")
	public WebElement customizedFacials ;
	
	//Select Facial- 60 mins
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_boost_selection_count'])[1]")
	public WebElement facialSixty ;
	
	//Select first enhancement
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_boost_selection_count'])[1]")
	public WebElement firstenhance ;
	
	//Click on the next link
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/action_next'])")
	public WebElement next ;
	
	//Click on the yes for restrictions
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/schedule_button'])")
	public WebElement readyToSchedule ;

	//Click on continue
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/continue_button'])")
	public WebElement cont ;
	
	//Select 2nd therapist
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/btn_select'])[2]")
	public WebElement therapist;

	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/btn_change_password']")
	public WebElement scheduleAppointment;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[2]")
	public WebElement acneService ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[3]")
	public WebElement chemicalPeel ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]")
	public WebElement microDerm ;

}
