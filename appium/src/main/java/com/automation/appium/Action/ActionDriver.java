package com.automation.appium.Action;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.automation.appium.generic.ExcelReader;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ActionDriver extends BrowserAction{
	
	//BrowserAction b = new BrowserAction();
	public AndroidDriver<AndroidElement> driver;
	
	public ActionDriver(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	
	JavascriptExecutor exe = (JavascriptExecutor) driver;

	public String reportLog(String message) throws IOException {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File srFfile = sc.getScreenshotAs(OutputType.FILE);
		String userDir = System.getProperty("user.dir");

		LocalDateTime ld = LocalDateTime.now();
		int s = ld.getSecond();
		int ns = ld.getNano();
		String fileName = message+String.valueOf(s) + String.valueOf(ns);
		String filePath = userDir + File.separator +"target"+File.separator + "screenshots"+File.separator +fileName+".png";
		File f = new File(filePath);
		File destFile = new File(f.toString());
		System.out.println("Output file is :" + destFile);
		FileUtil.copyFile(srFfile, destFile);
		
		return filePath;
	}

	public void isElementDisplayed(WebElement ele) {

		if (ele.isDisplayed()) {
			System.out.println("Element is available for operation");
		} else {
			Assert.fail("Element not avilable");
		}
	}

	public void clickElement(WebElement ele) {

		try {
			isElementDisplayed(ele);
			ele.click();
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}
	
	public void jsClick(MobileElement ele) {

		try {
			exe.executeScript("", ele);
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}

	public void swipeDown() {

		try {
			exe.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}

	public void swipeUp() {

		try {
			exe.executeScript("mobile: scroll", ImmutableMap.of("direction", "up"));
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}

	public void swipeLeft() {

		try {
			exe.executeScript("mobile: scroll", ImmutableMap.of("direction", "left"));
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}

	public void swipeRight() {

		try {
			exe.executeScript("mobile: scroll", ImmutableMap.of("direction", "right"));
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}
	
	//private AndroidDriver androidDriver;
	
	public void tapByCoordinates () {
		//androidDriver = (AndroidDriver) driver;
		AndroidTouchAction ata = new AndroidTouchAction(driver);
		ata.tap(TapOptions.tapOptions().withPosition(PointOption.point(500, 500)));
		System.err.println("Succesfully tapped on the cordinates");
    }
	
	public void tapByCoordinates1 () {
		
		new TouchAction(driver)
        .tap(PointOption.point(500, 500))
        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).perform();
    }
	
	
	//Vertical Swipe by percentages
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
 
        new TouchAction(driver)
                .press(PointOption.point(anchor, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(anchor, endPoint))
                .release().perform();
    }
    
    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
    	Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
 
        new TouchAction(driver)
                .press(PointOption.point(anchor, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(anchor, endPoint))
                .release().perform();
    }
    
    public void tapByCoordinates (int x,  int y) {
        new TouchAction(driver)
                .tap(PointOption.point(x,y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(250))).perform();
    }
    
   /* public void enterText(WebElement ele, String s) {
        ele.click();
        ele.sendKeys(s);
        }*/
    public void enterText(By ele, String s) throws IOException {
   	 System.out.println("Enter the value");
      tapByCoordinates(225, 440);
   	 
      ((MobileElement) driver.findElement(ele)).setValue(s);
      System.out.println("Entered");
       }
    
    public void enterText1(By ele, String s) throws IOException {
   	 	System.out.println("Entere the value");
   	 	driver.findElement(ele).click();
   	 	driver.findElement(ele).clear();
   	 	driver.getKeyboard().sendKeys(s);
   	 	System.out.println("Entered");
       }
      
    public void enterTextByJSE(WebElement ele, String s) throws IOException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
   	 	System.out.println("Entere the value");
   	    jse.executeScript("arguments[0].value='"+s+"';", (ele));
   	 	System.out.println("Entered");
       }
    
    public void enterTextByAdb(WebElement ele, String s, String udid) throws IOException {
        ele.click();
        new ProcessBuilder(new String[]{"adb", "-s", udid, "shell", "input", "text", s})
        .redirectErrorStream(true)
        .start();
        
        }
    public void enterTextSendKeys(WebElement ele, String s) throws IOException {
   	 	System.out.println("Entere the value");
   	 	tapByCoordinates(225, 440);
   	 	System.out.println("Tapped");
   	 	(ele).clear();
   	 	System.out.println("Cleared");
   	 	ele.sendKeys(s);
   	 	System.out.println("Entered");
       }
}
