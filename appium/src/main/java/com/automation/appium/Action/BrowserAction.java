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
	

	
	static void setUp() throws InterruptedException {/*
		System.out.println("Starting........TestNGWith Parameter");
		String path = System.getProperty("user.dir");
		WebDriverManager .chromedriver().setup();
        driver = new ChromeDriver();     
		System.out.println("user dir "+ path+"\\chromedriver");
		String baseUrl = "https://www.amazon.in/";
		Thread.sleep(5000);
		System.out.println("Opned........Browser");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		
	*/}
	
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
		
		driver.findElement(By.id("navigation_profile")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn_login")).click();
	
		//WebElement username =driver.findElement(By.id("et_email_address"));
		//WebElement password =driver.findElement(By.id("et_password"));
		
		WebElement username=driver.findElement(By.id("et_email_address"));
        WebElement password=driver.findElement(By.id("et_password"));
		
		username.sendKeys("febchem@gmail.com");
		password.sendKeys("Test1234!");
	
		driver.findElement(By.id("btn_login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn_schedule_appointment")).click();
		Thread.sleep(1000);
		//WebElement service=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView\n" + 
		//		""));
		//service.click();
		
		WebElement service=driver.findElement(By.xpath("(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_group'])[4]"));
		try {
			service.click();
		} catch (Exception e) {
			
			
			System.out.println(e);
		}
		//(//*[@resource-id='com.massageenvy.consumer.android.debug:id/tv_service_name'])[1]
	}
	
	@BeforeTest
	public void start() throws InterruptedException, MalformedURLException {
		System.out.println("In method BeforeTest");
		AppStartup();
		System.out.println("Exiting methdod BeforeTest");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
		System.out.println("Closing Browser Thankyou !!!!");
	}
  

}
