package com.Orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Orange.base.Generic;
import com.aventstack.extentreports.MediaEntityBuilder;

public class HRM_LoginPage {

	WebDriver driver;
	Generic generic = new Generic();

	public HRM_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(name = "username")
	WebElement textBox_UserName;

	@FindBy(name = "password")
	WebElement textBox_Password;

	@FindBy(xpath = "//button[text() = ' Login ']")
	WebElement button_Login;
	
	@FindBy(className = "oxd-userdropdown-name")
	WebElement text_UserName;
	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;

	public void loginOrangeHRMPage(String userName, String password) throws Exception {
		try {
//		textBox_UserName.sendKeys(userName);
			
			generic.waitForElementToBeVisible(button_Login, 10);
			generic.pauseExecution(2);
			generic.sendTextToAnElement(textBox_UserName, userName);
			generic.sendTextToAnElement(textBox_Password, password);
//			Thread.sleep(1000);
//			Generic.extentLogger.pass("Website Lauched with Login Credentials",
//					MediaEntityBuilder.createScreenCaptureFromPath(Generic.captureScreenshot()).build());
			generic.clickAnElement(button_Login);
//			Thread.sleep(5000);
			generic.waitForElementToBeVisible(text_UserName, 10);
//			Generic.extentLogger.pass("Successfully logged in Orange HRM application",
//					MediaEntityBuilder.createScreenCaptureFromPath(generic.captureScreenshot()).build());
	
		} catch (Exception e) {
//			Generic.extentLogger.fail("Failed to login Orange HRM application." + e.getMessage(),
//					MediaEntityBuilder.createScreenCaptureFromPath(generic.captureScreenshot()).build());
			Assert.fail("Failed to login Orange HRM application."+e.getMessage());
		}

	}
}