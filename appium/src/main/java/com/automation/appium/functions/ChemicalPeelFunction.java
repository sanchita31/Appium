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

public class ChemicalPeelFunction extends ServicesElement {

	public ChemicalPeelFunction(AndroidDriver driver) {

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

	public void selectChemPeel() throws IOException, InterruptedException {

		test = extent.createTest("selectChemPeel");
		System.out.println("Entering Chemical Peel Flow via Service Function");
		// test = extent.createTest("selectSkinCare");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {
			Thread.sleep(2000);

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SKIN CARE\")").click();
			// clickElement(skinCare);
			Thread.sleep(2000);
			test.pass("Skincare Service Screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(1000);

		try {

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"CHEMICAL PEEL\")").click();
			Thread.sleep(1000);
			// clickElement(customizedFacials);
			test.pass("Customized Facial Screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
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
			test.pass("60min Facial Selected",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"ADD ENHANCEMENT\")").click();
			// clickElement(firstenhance);
			test.pass("Select the enhancement",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		// clickElement(next);

		try {
			tapByCoordinates1();

			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			test.pass("restrictions before scroll",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
			System.out.println("Done");

			
			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			
			System.out.println("Tap1 done");
			
			tapByCoordinates1();
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Tap2 done");
			
			tapByCoordinates1();
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			
			
			System.out.println("Final Tap done");
			
			// String Path1 = reportLog("HomeScreen");
			test.pass("After Swiped",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("swipedVertical")).build());

			//swipeUp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"I am ready to schedule\")").click();
			// readyToSchedule.click();
			// clickElement(readyToSchedule);
			test.pass("ready to schedule",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			WebElement cont=driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Continue\")");
			cont.click();
			
			// clickElement(cont);
			test.pass("Calender", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
			Thread.sleep(5000);
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
			test.pass("Therapist", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			tapByCoordinates1();

			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			test.pass("review and book",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
			System.out.println("Done");

			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			tapByCoordinates1();
			
			Thread.sleep(3000);
			
			System.out.println("Final Tap done");
			// String Path1 = reportLog("HomeScreen");
			test.pass("After Swiped",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("about to click schdeule appointment");

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Schedule Appointment\")").click();

		Thread.sleep(5000);

		// tapByCoordinates(198,1160);
		// scheduleAppointment.click();
		// clickElement(scheduleAppointment);

		try {

			Thread.sleep(1000);
			test.pass("Schedule Appointment",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());

			System.out.println("Confirmation screen");
			test.pass("Confirmation screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"DONE\")").click();
		try {

			Thread.sleep(1000);
			test.pass("Schedule Appointment",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());

			System.out.println("My Appointment");
			test.pass("Confirmation screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
