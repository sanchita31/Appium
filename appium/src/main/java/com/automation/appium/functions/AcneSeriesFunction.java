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

public class AcneSeriesFunction extends ServicesElement {

	public AcneSeriesFunction(AndroidDriver driver) {

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

	public void selectacne() throws IOException, InterruptedException {

		test = extent.createTest("selectacne");
		System.out.println("Entering Microderm Flow via Service Function");
		// test = extent.createTest("selectSkinCare");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {
			Thread.sleep(1000);
			
			System.out.println("Services Selection Screen");

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SKIN CARE\")").click();
			// clickElement(skinCare);
			Thread.sleep(1000);
			test.pass("Skincare Services Screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("To Click Acne Series");

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"ACNE SERVICES\")").click();
			Thread.sleep(1000);
			// clickElement(customizedFacials);
			test.pass("Acne Sereies Screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("To select Acne Facial Series");
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Select\")").click();			
			// clickElement(facialSixty);
			Thread.sleep(1000);
			test.pass("Acne Series Information",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			

			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			
			System.out.println("Acne Series Information");
			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			System.out.println("Tap1 done");
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Tap2 done");			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);		
			System.out.println("Final Tap done");
			
			// String Path1 = reportLog("HomeScreen");
			
			System.out.println("After swipped vertically");
			test.pass("After Vertical Swiped",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("swipedVertical")).build());

			//swipeUp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Continue\")").click();
			// readyToSchedule.click();
			// clickElement(readyToSchedule);
			test.pass("restrictions",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		try {
			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			System.out.println("Restrictions for Acne");

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

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"I am ready to schedule\")").click();
			// readyToSchedule.click();
			// clickElement(readyToSchedule);
			System.out.println("Calender Displayed");
			test.pass("Calender",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			WebElement cont=driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Continue\")");
			cont.click();
			
			// clickElement(cont);
			test.pass("Matchmaking Screen", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
			Thread.sleep(5000);
			
			System.out.println("Therapist Displayed");
			test.pass("Therapist", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
			
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
			System.out.println("Review and Book Screen");
			test.pass("Review and Book", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			
			System.out.println("Before Swipped Vertical");

			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			
			verticalSwipeByPercentages(0.6, 0.3, 0.5);
		
			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			
			System.out.println("Final Tap done");
			// String Path1 = reportLog("HomeScreen");
			test.pass("After Vertical Swiped",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
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

			System.out.println("Confirmation screen");
			test.pass("Confirmation screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Click on Done");
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"DONE\")").click();
		try {
			System.out.println("Acne Flow over landing on Booking Page");
			test.pass("Book Screen",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectacne")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
