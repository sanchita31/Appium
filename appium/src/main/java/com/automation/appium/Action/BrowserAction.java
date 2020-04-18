package com.automation.appium.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserAction {
	
public static	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
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
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
		System.out.println("Closing Browser Thankyou !!!!");
	}
  

}
