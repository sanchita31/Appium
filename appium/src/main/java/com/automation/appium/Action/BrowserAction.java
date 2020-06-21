package com.automation.appium.Action;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.automation.appium.generic.Report;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserAction {
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
    
	
//public static	AppiumDriver<MobileElement> driver;
	public static AndroidDriver<WebElement> driver;
	
	static void AppStartup() throws InterruptedException, MalformedURLException {
		System.out.println("Starting........TestNGWith Parameter");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreUnimportantViews", true);
		cap.setCapability("disableAndroidWatchers", true);
		//cap.setCapability("", true);
		cap.setCapability("deviceName", "OPPO A5");
		cap.setCapability("udid", "SOBAUSGA8LZPHUTK");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("noReset","true");
		cap.setCapability("autoGrantPermissions","true");
	
		//cap.setCapability("appPackage", "com.massageenvy.consumer.android.pwa.qa");
		//cap.setCapability("appActivity", "io.ionic.starter.MainActivity");
		
		cap.setCapability("appPackage", "com.massageenvy.consumer.android.debug");
		cap.setCapability("appActivity", "com.massageenvy.consumer.ui.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		System.out.println("App started");
		ExtentTest test = extent.createTest("browser");
		test.log(Status.PASS, "browserStep");
		Thread.sleep(5000);
		
		
	}
	
	static void AppStartup1() throws InterruptedException, MalformedURLException {
		System.out.println("Starting........TestNGWith Parameter");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO A5");
		cap.setCapability("udid", "SOBAUSGA8LZPHUTK");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformValue", "8.1.0");
		cap.setCapability("automationName", "uiautomator1");
		cap.setCapability("noReset","true");
		cap.setCapability("autoGrantPermissions","true");
		/*cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		*/
		
		//cap.setCapability("appPackage", "com.massageenvy.consumer.android.pwa.qa");
	    //cap.setCapability("appActivity", "io.ionic.starter.MainActivity");
		
		cap.setCapability("appPackage", "com.massageenvy.consumer.android.debug");
	    cap.setCapability("appActivity", "com.massageenvy.consumer.ui.MainActivity");	
		
		//cap.setCapability("appPackage", "com.bigbasket.mobileapp");
		//cap.setCapability("appActivity", "com.bigbasket.mobileapp.activity.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		//driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("App started");
		Thread.sleep(5000);
		
	}
	
	@BeforeSuite
	public void beforeSuite() {
		extent = Report.getInstance("ReportView");
		/*extent = new ExtentReports();
		extent.attachReporter(htmlReporter);*/
	}
	
	@BeforeTest
	public void start() throws InterruptedException, MalformedURLException {
		AppStartup();
		System.out.println("App started successfully");
	}
	
	@AfterTest
	public void closeApp() {
		driver.close(); 
		System.out.println("Closing Browser Thankyou !!!!");
	}
	
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		
		
		extent.flush();
		System.out.println("Flush");
	}
	
	
}
  


