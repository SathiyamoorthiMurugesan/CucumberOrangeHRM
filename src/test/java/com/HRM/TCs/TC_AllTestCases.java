package com.HRM.TCs;

import org.testng.annotations.Test;

import com.Orange.base.Generic;
import com.Orange.pages.HRM_CommonPage;
import com.Orange.pages.HRM_LoginPage;
import com.Orange.utilities.ExcelReadAndWriteUsingFillo;

public class TC_AllTestCases extends Generic {

//	ExcelReadAndWriteUsingFillo obj = new ExcelReadAndWriteUsingFillo();

	@Test
	public void validateAPage() throws Exception {
		Generic.extentLogger = Generic.extentReport.createTest("validateAPage");

		HRM_LoginPage loginPage = new HRM_LoginPage(getDriver());
		HRM_CommonPage commonPage = new HRM_CommonPage(driver);
		ExcelReadAndWriteUsingFillo.getSpecificRow(2);

//		loginPage.loginOrangeHRMPage("Admin", "admin123");
		loginPage.loginOrangeHRMPage(ExcelReadAndWriteUsingFillo.getFieldValue("UserName"),
				ExcelReadAndWriteUsingFillo.getFieldValue("Password"));
		commonPage.getUserName();
//		commonPage.validateClientImage1();
//		commonPage.minimizeTheMenuSection();
//		commonPage.searchAPage("Time");
//		commonPage.goToTheGivenPage("Time");
	}

	@Test
	public void validateAPage1() throws Exception {
		Generic.extentLogger = Generic.extentReport.createTest("validateAPage1");
		HRM_LoginPage loginPage = new HRM_LoginPage(driver);
		loginPage.loginOrangeHRMPage("Admin", "admin123");
		HRM_CommonPage commonPage = new HRM_CommonPage(driver);
		commonPage.getUserName();
//		commonPage.validateClientImage1();
//		commonPage.minimizeTheMenuSection();
//		commonPage.searchAPage("Time");
//		commonPage.goToTheGivenPage("Time");
	}

}
