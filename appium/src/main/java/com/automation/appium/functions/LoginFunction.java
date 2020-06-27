package com.automation.appium.functions;

import java.io.IOException;
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
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginFunction extends LoginElement 
{
	By passId = By.id("et_password");
	By userId = By.id("et_email_address");
	
	
	public LoginFunction(AndroidDriver driver) 
	{
		
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	ExcelReader excel = new ExcelReader();
	
	
		public void appLogin(String udid) throws IOException, InterruptedException, InvalidFormatException {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		
				System.out.println("Entering appLogin method");
				test = extent.createTest("appLogin");
				test.pass("Home Page", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Home Page")).build());
				
				clickElement(profile);
				test.pass("Profile Page", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Profile Page")).build());
				
				clickElement(login);
				test.pass("Login click", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Login click")).build());
				
				List<String> userCred  = excel.getDetails("DataSheet", "Login");
				String username = userCred.get(0).toString().trim();
				String passs = userCred.get(1).toString().trim();
				
				
				
				Thread.sleep(5000);
				
				tapByCoordinates(225, 440); 
				userName.clear();
				MobileElement ele =(MobileElement)driver.findElement(userId);
				ele.setValue("febchem@gmail.com");
				
				tapByCoordinates(110, 607);
				System.out.println("To enter Password now ");
				MobileElement ele1 = (MobileElement)driver.findElement(passId);
				ele1.setValue("Test1234!");
				System.out.println("Entered");
				
				clickElement(login);
				
				/*
				 * try { WebDriverWait wait = new WebDriverWait(driver, 10);
				 * wait.until(ExpectedConditions.visibilityOf(userName)); tapByCoordinates(110,
				 * 607); Thread.sleep(2000); enterTextSendKeys(password, pass);
				 * 
				 * tapByCoordinates(225, 440); enterTextSendKeys(userName, username);
				 * 
				 * Thread.sleep(2000); } catch (Exception e) { // TODO Auto-generated catch
				 * block e.printStackTrace(); System.out.println(e); }
				 */
				
				//tapByCoordinates(110, 607);
				//Thread.sleep(2000);
				
				
				/*
				 * tapByCoordinates(225, 440); userName.clear(); setValue(userName, username);
				 * System.out.println("Taking snapshot for username entered");
				 * 
				 * //test.pass("snapshotusername ",
				 * MediaEntityBuilder.createScreenCaptureFromPath(reportLog("snapshotusername"))
				 * .build());
				 * 
				 * Thread.sleep(2000); tapByCoordinates(110, 607);
				 * System.out.println("To enter Password now");
				 * //passWord.sendKeys("Test1234!"); //enterTextSendKeys(passWord, "Test1234!");
				 * 
				 * 
				 * //driver.findElement(passId).sendKeys("Test1234!");
				 */			
				
				
				
				
				//List<AndroidElement> passWordSize = driver.findElements(By.id("et_password"));
				//System.out.println(passWordSize.size());
				//passWord.replaceValue("Test1234!");
				//driver.getKeyboard().sendKeys("Test1234!");
				
				//driver.getKeyboard().pressKey("a");
				//driver.getKeyboard().releaseKey("a");
				
				/*
				 * try { setValue(passWord, passs); } catch (IOException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */
				//test.pass("snapshotpassword ", MediaEntityBuilder.createScreenCaptureFromPath(reportLog("snapshotpassword")).build());
				
				Thread.sleep(5000);
			
				//clickElement(login);
				//enterText(password, pass);
				
					//driver.findElement(passId).sendKeys("Test1234!");
					
				

				
				//driver.findElement(passId).sendKeys(pass);
				//setValue(password, "Test1234!");
				
				//Thread.sleep(5000);
				
			
				
				//tapByCoordinates(225, 440);
				
				//driver.findElement(userId).sendKeys(username);
				//driver.findElement(userId).sendKeys(Keys.TAB);
				//setValue(userName, username);
					
				/*
				 * test.pass("snapshotpassword ", MediaEntityBuilder.
				 * createScreenCaptureFromPath(reportLog("snapshotpassword")).build());
				 */
				
				
				//clickElement(login);
				
				//login.click();
				Thread.sleep(5000);
				bookIcon.click();
				//clickElement(bookIcon);
				
		}

				
				
	
			
			/*catch(Exception e) {
				
				test.fail("Failed Login", MediaEntityBuilder.
						createScreenCaptureFromPath(reportLog("Failed Login")).build());
				//e.printStackTrace();
				//Assert.fail("Failed to login", e);
			}*/
			
		
				
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
