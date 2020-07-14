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
			System.out.println("Services Displayed");
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SKIN CARE\")").click();
			// clickElement(skinCare);
			
			test.pass("Chemical Peel",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try {
			System.out.println("Chemical Peel is Displayed");
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"CHEMICAL PEEL\")").click();
			//Thread.sleep(1000);
			// clickElement(customizedFacials);
			test.pass("Select a Chemical Peel",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Select\")").click();			
			// clickElement(facialSixty);
			Thread.sleep(1000);
			
			System.out.println("Enhancements Displayed");
			test.pass("Select the enhancement",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"ADD ENHANCEMENT\")").click();
			// clickElement(firstenhance);
			
			System.out.println("Enhancement Added");
			
			test.pass("Enhancement Added",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Click on Next");
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		// clickElement(next);

		try {

			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			System.out.println("Chemical Peel Restictions are Displayed");
			test.pass("restrictions before scroll",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
			System.out.println("Done");
			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			System.out.println("Tap1 done");

			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Tap2 done");
			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
				
			System.out.println("Final Tap done");
			
			// String Path1 = reportLog("HomeScreen");
			test.pass("Ready to schedule",
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
			test.pass("Calender",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("Calender Displayed");
			WebElement cont=driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Continue\")");
			cont.click();
			
			// clickElement(cont);
			test.pass("MatchMaking Screen", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
			Thread.sleep(2000);
			test.pass("Therapist", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Select\")").click();
			// clickElement(therapist);
			
		
		

		try {
			System.out.println("Review and Book Screen");

			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			test.pass("review and book",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			System.out.println("Tap 1");
			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Tap 2");
			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Final Tap Done");
			
			
		
			// String Path1 = reportLog("HomeScreen");
			test.pass("Schedule Appointment",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("To click schdeule appointment");

		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Schedule Appointment\")").click();

		Thread.sleep(1000);

		// tapByCoordinates(198,1160);
		// scheduleAppointment.click();
		// clickElement(scheduleAppointment);

		try {

			//Thread.sleep(1000);
			System.out.println("Confirmation Screen");
			test.pass("Confirmation",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Click on Done");
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"DONE\")").click();
		try {

			Thread.sleep(1000);

			System.out.println("Chemical Peel flow done landing to Booking Screen");
			test.pass("Booking Screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectChemPeel")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
