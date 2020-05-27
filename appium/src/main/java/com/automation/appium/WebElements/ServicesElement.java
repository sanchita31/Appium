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
	public WebElement massage ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[2]")
	public WebElement totalBodyStretch ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[3]")
	public WebElement rapidTensionRelief ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]")
	public WebElement skinCare ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_name'])[1]")
	public WebElement customizedFacials ;
	
	//Select Facial- 60 mins
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_boost_selection_count'])[1]")
	public WebElement facialSixty ;
	
	//Select first enhancement
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_boost_selection_count'])[1]")
	public WebElement firstenhance ;
	
	//Click on the next link
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/action_next'])")
	public WebElement next ;
	
	//Click on the yes for restrictions
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/schedule_button'])")
	public WebElement readyToSchedule ;

	//Click on continue
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/continue_button'])")
	public WebElement cont ;
	
	//Select 2nd therapist
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/btn_select'])[2]")
	public WebElement therapist;
	
	
	
	
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[2]")
	public WebElement acneService ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[3]")
	public WebElement chemicalPeel ;
	
	@FindBy(xpath="(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]")
	public WebElement microDerm ;

}
