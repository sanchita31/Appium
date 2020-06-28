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
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserAction {
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;

//public static	AppiumDriver<MobileElement> driver;
	public static AndroidDriver<AndroidElement> driver;

	static void AppStartup() throws InterruptedException, MalformedURLException {
		System.out.println("Starting........TestNGWith Parameter");

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("ignoreUnimportantViews", true);
		cap.setCapability("disableAndroidWatchers", true);
		cap.setCapability("skipDeviceInitialization", true);
		cap.setCapability("skipServerInstallation", true);
		cap.setCapability("", true);

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A5");
		cap.setCapability(MobileCapabilityType.UDID, "SOBAUSGA8LZPHUTK");
		//cap.setCapability(MobileCapabilityType.UDID, "97615d5d0906");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9 PKQ1.190319.001");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator1");
		
		cap.setCapability(MobileCapabilityType.NO_RESET,"true");
		cap.setCapability("autoGrantPermissions", "true");

		// cap.setCapability("skipDeviceInitialization",true);
		// cap.setCapability("skipServerInstallation", true);
		// cap.setCapability("ignoreUnimportantViews", true);
		 cap.setCapability("appPackage", "com.massageenvy.consumer.android.qa");
		 //cap.setCapability("appActivity", "io.ionic.starter.MainActivity");

		//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.massageenvy.consumer.android.qa");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.massageenvy.consumer.ui.SplashActivity");

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
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "One plus");
		cap.setCapability(MobileCapabilityType.UDID, "4079254e");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0.0");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator1");
		// cap.setCapability(MobileCapabilityType.NO_RESET,"true");
		// cap.setCapability("autoGrantPermissions","true");
		// cap.setCapability(MobileCapabilityType.APP, "D:\\SW And ImpDocs\\ME.apk");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.massageenvy.consumer.android.qa");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.massageenvy.consumer.ui.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		try {
			driver = new AndroidDriver(url, cap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("App started");
		ExtentTest test = extent.createTest("browser");
		test.log(Status.PASS, "browserStep");
		Thread.sleep(5000);

	}

	@BeforeSuite
	public void beforeSuite() {
		extent = Report.getInstance("ReportView");
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
