package com.automation.appium.functions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
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

public class ServicesFunction extends ServicesElement {

	public ServicesFunction(AndroidDriver driver) {

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

	public void selectSkinCare() throws IOException, InterruptedException {
		

		test = extent.createTest("selectSkinCare");
		System.out.println("Entering SkinCare Flow via service function");
		// test = extent.createTest("selectSkinCare");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {
			Thread.sleep(1000);
			
			List<MobileElement> l = new ArrayList<MobileElement>();
			l = driver.findElements(By.id("tv_service_group"));
			int n = l.size();
			StringBuilder sb  = new StringBuilder();
						
			for(int i=0; i<n ; i++) 
			{
			 sb.append(l.get(i).getText().toString()+" , ");
			}
							
			System.out.println(sb.toString());
			
			if(!l.get(0).getText().equalsIgnoreCase("MASAGE")) {
			System.out.println("MASAGE is expected");
				//fail cond
			
			
			test.fail("MASAGE is expected",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
			}else if(!l.get(1).getText().equalsIgnoreCase("TOTAL BODY STRETCH")) {
				
				System.out.println("TBS is not avilable");
				//fail cond
			}else if(!l.get(2).getText().equalsIgnoreCase("RAPID TENSION RELIEF")) {
				System.out.println("RTR is not avilable");
				//fail cond
			}else if(!l.get(3).getText().equalsIgnoreCase("SKIN CARE")) {
				System.out.println("SC is not avilable");
				//fail cond
			}else {
				System.out.println("Elelemts present :");
				l.toString();
				test.pass(sb.toString(),
						MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());	
			}
			
			System.out.println("Skincare service clicked");

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SKIN CARE\")").click();
			// clickElement(skinCare);
			Thread.sleep(1000);
			System.out.println("Skincare Services Displayed");
			test.pass("Skincare Services Displayed",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try {
			
			System.out.println("Customized Facials is clicked");

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"CUSTOMIZED FACIALS\")").click();
			//Thread.sleep(1000);
			System.out.println("60Min Customized facial to be clicked");
			// clickElement(customizedFacials);
			test.pass("60Min Customized facial",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			
		
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Select\")").click();
			Thread.sleep(1000);
			//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Select\").instance(2)").click();
			//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Select\")").click();
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(2))");
			// clickElement(facialSixty);
			System.out.println("Enhancements Displayed");
			test.pass("Enhancements",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"ADD ENHANCEMENT\")").click();
			// clickElement(firstenhance);
			test.pass("Enhancement Added",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Next to be clicked");
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		// clickElement(next);
		try {

			System.out.println("Restrictions before Scroll");
			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			test.pass("Restrictions before scroll",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
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
			test.pass("ready to scheduled",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());

			//swipeUp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			
			System.out.println("Click on Reday To Schedule");

			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"I am ready to schedule\")").click();
			// readyToSchedule.click();
			// clickElement(readyToSchedule);
			
			System.out.println("Calender Displayed");
			test.pass("Calender",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			WebElement cont=driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Continue\")");
			cont.click();
	
			// clickElement(cont);
			test.pass("Match Making", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
		
			Thread.sleep(5000);
			test.pass("Therapist", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
			
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
			test.pass("Review and Book", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			

			// test.log(Status.PASS, "AppLogin Success");
			// String Path = reportLog("HomeScreen");
			test.pass("review and book scroll",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
			

			verticalSwipeByPercentages(0.6, 0.3, 0.5);
			System.out.println("Tap 1");
			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Tap 2");
			
			verticalSwipeByPercentages(0.6, 0.5, 0.3);
			System.out.println("Final Tap Done");
			Thread.sleep(1000);
			
			// String Path1 = reportLog("HomeScreen");
			test.pass("Schedule Appointment is displayed",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
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
			test.pass("Confirmation",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"DONE\")").click();
		try {
			System.out.println("User lands on Booing Screen");

			//Thread.sleep(1000);
			test.pass("User lands on Booking Page",
					MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).build());

					} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
