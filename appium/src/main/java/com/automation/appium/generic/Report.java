package com.automation.appium.generic;

import java.time.LocalDateTime;
import java.time.Month;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report {
	
	public static ExtentReports extent;
	static ExtentHtmlReporter htmlReporter;
	static LocalDateTime ld = LocalDateTime.now();
	static int date = ld.getDayOfMonth();
	static Month month = ld.getMonth();
	static int hrs = ld.getHour();
	static int min = ld.getMinute();
	
	static String fileName = String.valueOf(date) + String.valueOf(month)+"_"+
			String.valueOf(hrs) +"_"+ String.valueOf(min);
	
	public static ExtentReports getInstance(String testname) {
		
		String s = System.getProperty("user.dir");
		
		
		testname = testname+"_"+fileName;
		String path = s+"\\report\\"+testname+".html";
		
		 htmlReporter = new ExtentHtmlReporter(path);
        
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(testname);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(testname);
        
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        //extent = extentReport.createTest(testname);

        return extent;
        
	}

}
