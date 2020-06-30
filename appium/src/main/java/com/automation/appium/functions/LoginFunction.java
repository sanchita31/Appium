package com.automation.appium.functions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.automation.appium.WebElements.LoginElement;
import com.automation.appium.generic.ExcelReader;
import com.aventstack.extentreports.MediaEntityBuilder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginFunction extends LoginElement 
{
	By passId = By.id("et_password");
	By userId = By.id("com.massageenvy.consumer.android.qa:id/inputlayout_email_address");
	
	
	public LoginFunction(AndroidDriver driver) 
	{
		
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	ExcelReader excel = new ExcelReader();
	
		public void appLogin() throws IOException, InterruptedException, InvalidFormatException {
			
			
			List<String> userCred  = excel.getDetails("DataSheet", "Login");
			String username = userCred.get(0).toString().trim();
			String passs = userCred.get(1).toString().trim();

			
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				System.out.println("Entering appLogin method");
				test = extent.createTest("appLogin");
				test.pass("Home Page", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("appLogin")).build());
				
				
				horizontalSwipeByPercentage(1.1, 0.05, 0.5);
				System.out.println("1st");
				
			
				horizontalSwipeByPercentage(1.1, 0.05, 0.5);
				System.out.println("2nd");
				
				driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Get Started\")").click();
				//Thread.sleep(5000);
				
				//horizontalSwipeByPercentage(1.7, .3, .3);
				
				profile.click();
				test.pass("Profile Page", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("appLogin")).build());
				
				login.click();
				test.pass("Login click", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("appLogin")).build());
				
				System.out.println("To enter username now");
				userName.clear();
				MobileElement eleU = (MobileElement) userName;
				eleU.setValue(username);
				
				//Thread.sleep(2000);
				
				System.out.println("To enter Password now");
				Thread.sleep(5000);
				passWord.setValue(passs);
				
			//	MobileElement passbox = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.massageenvy.consumer.android.qa:id/et_password\")");
			//	passbox.
				
				//System.out.println("Password Box Name - " + passbox.sendKeys("Test1234!"));
				
				//passWord.click();
				//(driver).pressKeyCode(AndroidKeyCode.KEYCODE_T);
				//(driver).pressKeyCode(AndroidKeyCode.KEYCODE_E);
				//(driver).pressKeyCode(AndroidKeyCode.KEYCODE_S);
				//(driver).pressKeyCode(AndroidKeyCode.KEYCODE_T);
				
				//MobileElement eleU2 = (MobileElement) passWord;
				//eleU2.setValue(passs);
				//passWord.click();
				//passWord.setValue(passs);
				
				System.out.println("Entered");
				Thread.sleep(5000);
				
					//test.pass("Credential Entered", MediaEntityBuilder.
							//createScreenCaptureFromPath(reportLog("appLogin")).build());
				
				login.click();
				test.pass("Login Clicked", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("appLogin")).build());
				Thread.sleep(2000);
				
				MobileElement ele3 = (MobileElement) driver.findElementByAccessibilityId("Book");
				ele3.click();
				Thread.sleep(1000);
				System.out.println("Book Icon clicked");
				test.pass("Book clicked", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("appLogin")).build());
				
				
				/*
				 * //Validation for the navigation Home tab below
				 * 
				 * WebElement home=driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Home\")");
				 * int numb=4; 
				 * StringBuilder sb = new StringBuilder();
				 * sb.append((home).getText().toString()+ " ");
				 * 
				 * if(!home.getText().equalsIgnoreCase("HOME")) {
				 * System.out.println("HOME is expected"); } else {
				 * System.out.println("Home is expected"); test.pass("Home Icon Displayed",
				 * MediaEntityBuilder.createScreenCaptureFromPath(reportLog("selectSkinCare")).
				 * build());
				 * 
				 * }
				 */	
				
				
		}
		
				
		public void appCalc() {
			try {
				two.click();
				plus.click();
				//clickElement(three);
				equals.click();
				
			}catch(Exception e) {
				Assert.fail("Failed to login", e);
			}
		}
		
		public void appCBigbaskt() throws IOException {
			test = extent.createTest("appCBigbaskt");
			try {
				
				tapByCoordinates1();
				
				//test.log(Status.PASS, "AppLogin Success");
				//String Path = reportLog("HomeScreen");
				test.pass("Login Page after tap", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("HomeScreen")).build());
				System.out.println("Done");
				
				verticalSwipeByPercentages(0.6, 0.3, 0.5);
				
				verticalSwipeByPercentages(0.6, 0.5, 0.3);
				verticalSwipeByPercentages(0.6, 0.3, 0.5);
				
				//String Path1 = reportLog("HomeScreen");
				test.pass("After Swiped", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("swipedVertical")).build());
				
				myAccount.click();
				
				//enterText(a, "");
				
				inputEmail.clear();
				inputEmail.sendKeys("7755990179");
				//String Path2 = reportLog("HomeScreen");
				test.pass("Passed", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("HomeScreen")).build());
				//horizontalSwipeByPercentage(0.6, 0.3, 0.2);
				//MobileElement ele = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc='Product Image'])[4]/.."));
				//tapByCoordinates(95,236);
				
				Thread.sleep(5000);
				//searchHomeView.setValue("fruits");
			/*	MobileElement element = (MobileElement) driver.findElementById("com.bigbasket.mobileapp:id/searchView");
				
				element.click();*/
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].value='Test';", searchHomeView);
				//element.setT
				driver.navigate().back();
				searchHomeView.sendKeys("fruits");
				
				/*searchIcon.click();
				search.sendKeys("Fruits");*/
			}catch(Exception e) {
				//System.out.println("Fail");
				//Assert.fail("Failed to login", e);
				test.fail("Failed", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Login")).build());
			}
		}
	}
