package com.automation.appium.Action;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserAction {
	
public static	AppiumDriver<MobileElement> driver;
	
	
	static void AppStartup() throws InterruptedException, MalformedURLException {
		System.out.println("Starting........TestNGWith Parameter");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO A5");
		cap.setCapability("udid", "SOBAUSGA8LZPHUTK");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("noReset","true");
		cap.setCapability("autoGrantPermissions","true");
		cap.setCapability("appPackage", "com.massageenvy.consumer.android.debug");
		cap.setCapability("appActivity", "com.massageenvy.consumer.ui.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("App started");
		Thread.sleep(5000);
		
		
	}
	
	static void AppStartup1() throws InterruptedException, MalformedURLException {
		System.out.println("Starting........TestNGWith Parameter");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "One Plus 5");
		cap.setCapability("udid", "4079254e");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformValue", "9.0.11");
		cap.setCapability("automationName", "uiautomator1");
		/*cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		*/
		
		cap.setCapability("appPackage", "com.bigbasket.mobileapp");
		cap.setCapability("appActivity", "com.bigbasket.mobileapp.activity.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("App started");
		Thread.sleep(5000);
		
	}
	
	@BeforeTest
	public void start() throws InterruptedException, MalformedURLException {
		AppStartup1();
		System.out.println("App started successfully");
	}
	
	@AfterTest
	public void closeApp() {
		driver.close(); 
		System.out.println("Closing Browser Thankyou !!!!");
	}
  

}
