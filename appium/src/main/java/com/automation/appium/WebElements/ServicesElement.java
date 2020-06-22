package com.automation.appium.WebElements;

import org.openqa.selenium.WebDriver;

import com.automation.appium.Action.ActionDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ServicesElement extends ActionDriver{
	public ServicesElement(AndroidDriver driver) {
		super(driver);
	}
	
	//services Section Section
	
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[1]")
	public AndroidElement massage ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[2]")
	public AndroidElement totalBodyStretch ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[3]")
	public AndroidElement rapidTensionRelief ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]")
	public AndroidElement skinCare ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_name'])[1]")
	public AndroidElement customizedFacials ;
	
	//Select Facial- 60 mins
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_boost_selection_count'])[1]")
	public AndroidElement facialSixty ;
	
	//Select first enhancement
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_boost_selection_count'])[1]")
	public AndroidElement firstenhance ;
	
	//Click on the next link
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/action_next'])")
	public AndroidElement next ;
	
	//Click on the yes for restrictions
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/schedule_button'])")
	public AndroidElement readyToSchedule ;

	//Click on continue
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/continue_button'])")
	public AndroidElement cont ;
	
	//Select 2nd therapist
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/btn_select'])[2]")
	public AndroidElement therapist;

	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/btn_change_password']")
	public AndroidElement scheduleAppointment;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[2]")
	public AndroidElement acneService ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[3]")
	public AndroidElement chemicalPeel ;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]")
	public AndroidElement microDerm ;

}
