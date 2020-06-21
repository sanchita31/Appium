package com.automation.appium.functions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.appium.WebElements.LoginElement;
import com.automation.appium.generic.ExcelReader;
import com.automation.appium.generic.Report;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginFunction extends LoginElement
{
	By passId = By.id("et_password");
	By userId = By.id("et_email_address");
	
	
	public LoginFunction(AndroidDriver<AndroidElement> driver) 
	{
		
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	ExcelReader excel = new ExcelReader();
	
		public void appLogin(String udid) throws IOException {
			
			try {
				System.out.println("Entering appLogin method");
				test = extent.createTest("appLogin");
				
				test.pass("Home Page", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Home Page")).build());
				
				clickElement(profile);
				test.pass("Profile Page", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Profile Page")).build());
				
				//reportLog("appLogin");
				clickElement(login);
				test.pass("Login click", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Login click")).build());
				
			//	userName.clear();
				List<String> userCred  = excel.getDetails("DataSheet", "Login");
				
				String username = userCred.get(0).toString().trim();
				String pass = userCred.get(1).toString().trim();
				
			
				//clickElement(login);
				Thread.sleep(5000);
				
				//login.click();
				
				//enterTextByAdb(userName, username, udid);
				//enterText(userId ,username);
				//enterTextSendKeys(userName,username);
				
				
				//alertElement1.sendKeys(pass); 
				//alertElement1.sendKeys(pass);
				

				/*AndroidElement alertElement = driver.findElementById("et_email_address");
				alertElement.sendKeys(username);*/
				userName.setValue(username);
				Thread.sleep(5000);
				test.pass("username ", MediaEntityBuilder.
					createScreenCaptureFromPath(reportLog("username")).build());
				
				try
				{
					//enterTextByAdb(password, pass, udid);
					//enterText(passId ,pass);
					//enterTextSendKeys(password,pass);					
					password.setValue(pass);
					/*AndroidElement alertElement1 =  driver.findElementById("et_password");
					alertElement1.sendKeys(pass);*/
					
					Thread.sleep(5000);
					test.pass("password ", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("password")).build());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				//userName.sendKeys(username);
				//password.sendKeys(pass);
				clickElement(login);
				//login.click();
				Thread.sleep(5000);
		
				clickElement(bookIcon);
				
			}catch(Exception e) {
				
				test.fail("Failed Login", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Failed Login")).build());
				//e.printStackTrace();
				//Assert.fail("Failed to login", e);
			}
		}
		
		
		public void appCalc() {
			try {
				two.click();
				plus.click();
				clickElement(three);
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
