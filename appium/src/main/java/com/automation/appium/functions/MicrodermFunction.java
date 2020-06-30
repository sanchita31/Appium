package com.automation.appium.functions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.appium.WebElements.ServicesElement;
import com.automation.appium.generic.Report;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MicrodermFunction extends ServicesElement {

	public MicrodermFunction(AndroidDriver driver) {

		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * public void selectService() {
	 * 
	 * clickElement(skinCare); clickElement(customizedFacials);
	 * 
	 * }
	 */

	public void selectmicro() throws IOException, InterruptedException {

		test = extent.createTest("selectmicro");
		System.out.println("Entering Microderm Flow via Service Function");
		// test = extent.createTest("selectSkinCare");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {
			Thread.sleep(2000);

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SKIN CARE\")").click();
			// clickElement(skinCare);
			Thread.sleep(1000);
			test.pass("Skincare Service Screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(1000);

		try {
			System.out.println("Microderm Infusion is displayed");
			driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"MICRODERM \")").click();
			Thread.sleep(1000);
			// clickElement(customizedFacials);
			test.pass("Microderm Infusion Screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			
			Thread.sleep(1000);
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Select\")").click();			
			// clickElement(facialSixty);
			Thread.sleep(1000);
			System.out.println("Microderm Infusion Selected");
			
			test.pass("Microderm Selected",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("Enhancement to add");
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"ADD ENHANCEMENT\")").click();
			// clickElement(firstenhance);
			
			System.out.println("Enhancement ");
			test.pass("Select the enhancement",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Next to be clicked");
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		// clickElement(next);

		try {
			System.out.println("Next is clicked");

			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			System.out.println("Restrictions before scroll");
			test.pass("restrictions before scroll",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
			System.out.println("Done");

			
			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			
			System.out.println("Tap1 done");
			
			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Tap2 done");
			
			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			
			
			System.out.println("Final Tap done");
			
			// String Path1 = reportLog("HomeScreen");
			test.pass("After Vertical Swiped",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("swipedVertical")).build());

			//swipeUp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			
			System.out.println("Ready ro schedule button displayed");

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"I am ready to schedule\")").click();
			// readyToSchedule.click();
			// clickElement(readyToSchedule);
			System.out.println("Calender displayed");
			test.pass("Calender is displayed",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			

			WebElement cont=driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Continue\")");
			cont.click();
			// clickElement(cont);
			test.pass("Matchmaking screen", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
			Thread.sleep(5000);
			
			System.out.println("Therapists are displayed");
			test.pass("Therapist", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Select\")").click();
			// clickElement(therapist);
			System.out.println("Review and Book");
			test.pass("Review and Book", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
	

			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			System.out.println("Before vertical swipe");
			test.pass("review and book",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			System.out.println("Tap 1");
			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Tap 2");
			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Final Tap Done");
			
			// String Path1 = reportLog("HomeScreen");
			test.pass("After Vertical Swiped",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("about to click schdeule appointment");

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Schedule Appointment\")").click();

		Thread.sleep(1000);

		// tapByCoordinates(198,1160);
		// scheduleAppointment.click();
		// clickElement(scheduleAppointment);

		try {

			System.out.println("Confirmation screen");
			test.pass("Confirmation screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"DONE\")").click();
		try {

			Thread.sleep(1000);
			System.out.println("Booking Screen");
			test.pass("Booking Screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectmicro")).build());

	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
