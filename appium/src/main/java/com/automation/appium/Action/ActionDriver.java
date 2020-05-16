package com.automation.appium.Action;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

public class ActionDriver {

	public static WebDriver driver;
	JavascriptExecutor exe = (JavascriptExecutor) driver;

	public ActionDriver(WebDriver driver) {
		this.driver = driver;
	}

	public static void reportLog(String message) throws IOException {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File srFfile = sc.getScreenshotAs(OutputType.FILE);
		String userDir = System.getenv("user.dir");

		LocalDateTime ld = LocalDateTime.now();
		int s = ld.getSecond();
		int ns = ld.getNano();
		String fileName = String.valueOf(s) + String.valueOf(ns);
		String filePath = userDir + "//target//screenshots";
		File f = new File(filePath);
		File destFile = new File(f + fileName + ".png");
		System.out.println("Output file is :" + destFile);
		FileUtil.copyFile(srFfile, destFile);
	}

	public void isElementDisplayed(WebElement ele) {

		try {
			ele.isDisplayed();
			System.out.println("Element is available for operation");
		} catch (Exception e) {
			Assert.fail("Element not avilable", e);
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

	public void swipeDown(WebElement ele) {

		try {
			exe.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}

	public void swipeUp(WebElement ele) {

		try {
			exe.executeScript("mobile: scroll", ImmutableMap.of("direction", "up"));
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}

	public void swipeLeft(WebElement ele) {

		try {
			exe.executeScript("mobile: scroll", ImmutableMap.of("direction", "left"));
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}

	public void swipeRight(WebElement ele) {

		try {
			exe.executeScript("mobile: scroll", ImmutableMap.of("direction", "right"));
		} catch (Exception e) {
			Assert.fail("Element not clickable", e);
		}

	}

}