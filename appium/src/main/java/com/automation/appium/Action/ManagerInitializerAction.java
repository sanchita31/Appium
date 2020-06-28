package com.automation.appium.Action;

import org.apache.poi.poifs.property.Child;
import org.testng.annotations.BeforeMethod;

import com.automation.appium.WebElements.IconsElement;
import com.automation.appium.functions.AppointmentFunction;
import com.automation.appium.functions.ChemicalPeelFunction;
//import com.automation.appium.functions.IconsFunction;
import com.automation.appium.functions.LoginFunction;
import com.automation.appium.functions.ServicesFunction;
import com.automation.appium.generic.ExcelReader;
import com.automation.appium.generic.Report;

public class ManagerInitializerAction extends BrowserAction {

	protected LoginFunction login;
	protected AppointmentFunction ap;
	protected ServicesFunction service;
	protected ChemicalPeelFunction chempeel;
	protected ActionDriver genActios;
	protected ExcelReader excel;
	

	@BeforeMethod
	public void initialize() {
		
		try {
			System.out.println("Before initialize login object");
			login = new LoginFunction(driver);
			System.out.println("Before initialize service object");
			service = new ServicesFunction(driver);
			chempeel = new ChemicalPeelFunction(driver);
			//ap = new AppointmentFunction(driver);
			//genActios = new ActionDriver(driver);
			excel = new ExcelReader();
			System.out.println("Before initialize 2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Before initialize service object 2");
			//service = new ServicesFunction(driver);
			e.printStackTrace();
		}
		
	}

}
