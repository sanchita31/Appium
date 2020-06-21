package com.automation.appium.functions;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.automation.appium.WebElements.ServicesElement;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ServicesFunction extends ServicesElement{
	
	public ServicesFunction(AndroidDriver<AndroidElement> driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

		/*public void selectService() {
			
			clickElement(skinCare);
			clickElement(customizedFacials);
			
		}*/
		public void selectSkinCare() throws IOException {
			
			try {
				test = extent.createTest("skincare");
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
			

				
				try {
					tapByCoordinates1();
					
					//test.log(Status.PASS, "AppLogin Success");
					//String Path = reportLog("HomeScreen");
					test.pass("restrictions before scroll", MediaEntityBuilder.
							createScreenCaptureFromPath(reportLog("restrictions before scroll")).build());
					System.out.println("Done");
					
					verticalSwipeByPercentages(0.6, 0.3, 0.5);
					
					verticalSwipeByPercentages(0.6, 0.5, 0.3);
					//String Path1 = reportLog("HomeScreen");
					test.pass("After Swiped", MediaEntityBuilder.
							createScreenCaptureFromPath(reportLog("swipedVertical")).build());
					

//swipeUp();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			try {
				clickElement(readyToSchedule);
				test.pass("ready to schedule", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("ready to schedule")).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				clickElement(cont);
				test.pass("Calender", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Calender")).build());
				Thread.sleep(5000);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				clickElement(therapist);
				test.pass("Therapist", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Therapist")).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
				try {
					tapByCoordinates1();
					
					//test.log(Status.PASS, "AppLogin Success");
					//String Path = reportLog("HomeScreen");
					test.pass("review and book", MediaEntityBuilder.
							createScreenCaptureFromPath(reportLog("review and book")).build());
					System.out.println("Done");
					
					verticalSwipeByPercentages(0.6, 0.3, 0.5);
					
					
					verticalSwipeByPercentages(0.6, 0.5, 0.3);
					//String Path1 = reportLog("HomeScreen");
					test.pass("After Swiped", MediaEntityBuilder.
							createScreenCaptureFromPath(reportLog("swipedVertical")).build());
				} 
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				try {
					test.pass("Schedule Appointment", MediaEntityBuilder.
							createScreenCaptureFromPath(reportLog("Schedule Appointment")).build());
					clickElement(scheduleAppointment);
					
					System.out.println("Confirmation screen");
					test.pass("Confirmation screen", MediaEntityBuilder.
							createScreenCaptureFromPath(reportLog("Confirmation screen")).build());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
}



