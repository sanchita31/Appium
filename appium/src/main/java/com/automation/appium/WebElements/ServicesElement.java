package com.automation.appium.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.appium.Action.ActionDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ServicesElement extends ActionDriver{
	public ServicesElement(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	//services Section Section
	
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[1]")
	public MobileElement massage ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[2]")
	public MobileElement totalBodyStretch ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[3]")
	public MobileElement rapidTensionRelief ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]")
	public MobileElement skinCare ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_name'])[1]")
	public MobileElement customizedFacials ;
	
	//Select Facial- 60 mins
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_boost_selection_count'])[1]")
	public MobileElement facialSixty ;
	
	//Select first enhancement
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_boost_selection_count'])[1]")
	public MobileElement firstenhance ;
	
	//Click on the next link
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/action_next'])")
	public MobileElement next ;
	
	//Click on the yes for restrictions
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/schedule_button'])")
	public MobileElement readyToSchedule ;

	//Click on continue
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/continue_button'])")
	public MobileElement cont ;
	
	//Select 2nd therapist
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/btn_select'])[2]")
	public MobileElement therapist;
	
	
	
	
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[2]")
	public MobileElement acneService ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[3]")
	public MobileElement chemicalPeel ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]")
	public MobileElement microDerm ;

}
