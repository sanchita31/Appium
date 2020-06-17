package com.automation.appium.functions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.automation.appium.WebElements.ServicesElement;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ServicesFunction extends ServicesElement{
	
	public ServicesFunction(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

		/*public void selectService() {
			
			clickElement(skinCare);
			clickElement(customizedFacials);
			
		}*/
	    ExtentTest test;
		public void selectSkinCare() throws IOException {
			
			try {
				System.out.println("Entering SkinCare Flow");
				
				skinCare.click();
				
				//clickElement(skinCare);
				
				test.pass("Skincare Service Screen", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Skincare Service Screen")).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				clickElement(customizedFacials);
				test.pass("Customized Facial Screen", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Customized Facial Screen")).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				clickElement(facialSixty);
				test.pass("60min Facial Selected", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("60min Facial Selected")).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				clickElement(firstenhance);
				test.pass("Select the enhancement", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Select the enhancement")).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement(next);
			
			//swipeUp();
			
			clickElement(readyToSchedule);
			clickElement(cont);
			clickElement(therapist);
						
		}
	}
