package com.automation.appium.functions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.appium.Action.ManagerInitializerAction;
import com.automation.appium.generic.Report;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;


public class IonicAppLoginFunction {
	public static AndroidDriver<AndroidElement> driver ;
	
	//public static AndroidDriver<WebElement> driver11;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		initConfig();
		ionicStart();	
	}
	
public static void initConfig() throws MalformedURLException, InterruptedException
 {
	DesiredCapabilities caps = new DesiredCapabilities();
//	caps.setCapability("device", "OPPO A5");
//	caps.setCapability("devicename", "SOBAUSGA8LZPHUTK");
//	caps.setCapability("platformVersion", "8.1.0");
//	caps.setCapability("platformName", "Android");
//	caps.setCapability("browserName", "Chrome");
//	caps.setCapability("autoGrantPermissions", "true");
	
	caps.setCapability("device", "OPPO A5s");
	caps.setCapability("platformName", "Android");
	caps.setCapability("udid", "SOBAUSGA8LZPHUTK");
	//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SOBAUSGA8LZPHUTK");
	caps.setCapability("platformVersion", "8.1.0");
	caps.setCapability("browserName", "Chrome");
	//ChromeOptions options=new ChromeOptions();
	//options.setExperimentalOption("androidPackage", "com.android.chrome");
	//caps.setCapability(ChromeOptions.CAPABILITY, options);
	
	URL url = new URL("http://127.0.0.1:4725/wd/hub");
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, caps);
	driver = new AndroidDriver(url,caps);
	
	driver.get("www.google.com"); 
	
	//driver11.get("https://wwwstg.massageenvy.com/scheduling/css/profile/login");
	
 }


public static void ionicStart() throws InterruptedException, MalformedURLException
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("airport@gmail.com");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234!");
	Thread.sleep(1000);
 }


}
