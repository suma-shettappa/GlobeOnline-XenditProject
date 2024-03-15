package com.pages.renewal;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class Renewal_Otp_Page extends BasePage {
	
	By verificationNeeded = By.xpath("//span[text()=' Verification needed ']");
	By enterYourMobileNumber = By.xpath("//span[contains(text(), 'Enter your mobile number to receive the 6-digit security code. Then type the code on the field below to continue. ')]");
	By codeExpiresIn = By.xpath("//label[text()='Code expires in ']");
	By privacyPolicy = By.xpath("//p[contains(text(), 'By submitting, I understand that the collection and use of my personal data, which may include personal and sensitive personal information, shall be in accordance with the Data Privacy Act of 2012 and ')]");
	By submitButton = By.xpath("//button[text()=' Submit ']");
	By mobileNumField = By.xpath("//input[@id='otpMsisdnInput' or @placeholder= ' ']");
	By getCodeButton = By.xpath("//button[text()=' Get code ']");
	By otpInput1 = By.xpath("//input[contains(@class, 'gk-otp-fields__input')]");
	By cantSendOtp = By.xpath("//button[text()=' Get code ']//following::span[1]");
	By ResendCode = By.xpath("//button[normalize-space(text())='Resend code']");

	
	
	//Loading screen
	By renewalProcessing = By.xpath("//h1[text()=' Renewal - Processing ']");
	By checkingOutstandingBalance = By.xpath("//div[normalize-space(text())='We’re checking for outstanding balances.']");
	By checkingYourEligibility = By.xpath("//div[normalize-space(text())='We’re checking your eligibility.']");
	By checkingPlanDetails  =  By.xpath("//div[normalize-space(text())='We’re checking your plan details.']");
	By youareAllSet  = By.xpath("//div[contains(normalize-space(text()),'Yay! You')]");
	By DontExitPage  = By.xpath("//p[contains(normalize-space(text()),'This will only take a moment. Please don')]");

	By DuplicateOrder = By.xpath("//h1[contains(text(), ' Acquisition - Duplicate Order ')]");
	By PlanApplication = By.xpath("//div[contains(text(), ' Hi , your plan application is in the works! ')]");
	By DuplicateConfirm = By.xpath("//span[@class='duplicate-confirm']");
	By otpInput = By.xpath("//input[contains(@class, 'gk-otp-fields__input')]");
	//input[contains(@class, 'gk-otp-fields__input')]

	//div[text()=' We’re checking your eligibility. ']
	//div[text()=' We’re checking for outstanding balances. ']




	/********************************************************************************************************************************/
	public WebElement get_submitButton() {
		return DriverManager.getDriver().findElement(submitButton);
	}

	/********************************************************************************************************************************/
	public WebElement get_mobileNumField() {
		return DriverManager.getDriver().findElement(mobileNumField);
	}
	/********************************************************************************************************************************/
	public WebElement get_getCodeButton() {
		return DriverManager.getDriver().findElement(getCodeButton);
	}
	/********************************************************************************************************************************/
	public List<WebElement> get_otpInput1() {
		return DriverManager.getDriver().findElements(otpInput1);
	}
	/********************************************************************************************************************************/
	public WebElement get_DuplicateOrder() {
		return DriverManager.getDriver().findElement(DuplicateOrder);
	}
	/********************************************************************************************************************************/
	public WebElement get_PlanApplication() {
		return DriverManager.getDriver().findElement(PlanApplication);
	}
	/********************************************************************************************************************************/
	public WebElement get_DuplicateConfirm() {
		return DriverManager.getDriver().findElement(DuplicateConfirm);
	}
	/********************************************************************************************************************************/
		/********************************************************************************************************************************/
	public List<WebElement> get_otpInput() {
		return DriverManager.getDriver().findElements(otpInput);
	}
	public List<WebElement> get_DontExitPage() {
		return DriverManager.getDriver().findElements(DontExitPage);
	}
	/********************************************************************************************************************************/


	public void enterText(String type, String ele, String value) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


			switch (ele) {	
			 case "mobileNumField":
				 get_mobileNumField().clear();
				 get_mobileNumField().sendKeys(value);;
				break;
			 
			}
			
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + ele + " : " + "Element is not clickable : " + e1.getMessage());
			Generic.WriteTestData("Entering text '"+value+"' in '"+ele+"' text field",ele,value,"Unable to identify the '"+ele+"' text field","Not able to identify the  '"+ele+"' text field","Failed");
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + ele + " : " + "Element not found : " + e2.getMessage());
			Generic.WriteTestData("Entering text '"+value+"' in '"+ele+"' text field",ele,value,"Unable to identify the '"+ele+"' text field","Not able to identify the  '"+ele+"' text field","Failed");
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + ele + " : " + "Exception : " + e.getMessage());
			Generic.WriteTestData("Entering text '"+value+"' in '"+ele+"' text field",ele,value,"Unable to identify the '"+ele+"' text field","Not able to identify the  '"+ele+"' text field","Failed");
			Assert.assertTrue(false);
		}
		Generic.WriteTestData("Entering text '"+value+"' in '"+ele+"' text field",ele,value,"Should able to enter data'"+value+"' into  '"+ele+"' text field","Entered data'"+value+"' into  '"+ele+"' text field successfully","Passed");
	}

	
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		case "youareAllSet":
			flag = waitForElementVisibility(youareAllSet, waitTime);
			break;
		case "checkingPlanDetails":
			flag = waitForElementVisibility(checkingPlanDetails, waitTime);
			break;
		case "verificationNeeded":
			flag = waitForElementVisibility(verificationNeeded, waitTime);
			break;
		case "enterYourMobileNumber":
			flag = waitForElementVisibility(enterYourMobileNumber, waitTime);
			break;
		case "codeExpiresIn":
			flag = waitForElementVisibility(codeExpiresIn, waitTime);
			break;
		case "privacyPolicy":
			flag = waitForElementVisibility(privacyPolicy, waitTime);
			break;	
		case "submitButton":
			flag = waitForElementVisibility(submitButton, waitTime);
			break;	
		case "getCodeButton":
			flag = waitForElementVisibility(getCodeButton, waitTime);
			break;	
		case "otpInput1":
			flag = waitForElementVisibility(otpInput1, waitTime);
			break;
		case "renewalProcessing":
			flag = waitForElementVisibility(renewalProcessing, waitTime);
			break;
		case "checkingOutstandingBalance":
			flag = waitForElementVisibility(checkingOutstandingBalance, waitTime);
			break;
		case "checkingYourEligibility":
			flag = waitForElementVisibility(checkingYourEligibility, waitTime);
			break;
		case "mobileNumField":
			flag = waitForElementVisibility(mobileNumField, waitTime);
			break;	
		case "cantSendOtp":
			flag = waitForElementVisibility(cantSendOtp, waitTime);
			break;	
		
		case "DuplicateOrder":
			flag = waitForElementVisibility(DuplicateOrder, waitTime);
			break;	
		case "PlanApplication":
				flag = waitForElementVisibility(PlanApplication, waitTime);
				break;	
		case "DuplicateConfirm":
					flag = waitForElementVisibility(DuplicateConfirm, waitTime);
					break;	
					
					
		case "otpInput":
			flag = waitForElementVisibility(otpInput, waitTime);
			break;
		case "ResendCode":
			flag = waitForElementVisibility(ResendCode, waitTime);
			break;
		case "DontExitPage":
			flag = waitForElementVisibility(DontExitPage, waitTime);
			break;
			
			
        }
		
		if (flag) {
			System.out.println(message + " - exists");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");
			
		} else {

			System.out.println(message + " - do not exist");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should not visible on the Application","'"+element+"' is visbile on the page","Failed");
			
		}


		return flag;
	}	
	
	
	public void jsClick(String message, String element) throws Exception {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "submitButton":
		         jse.executeScript("arguments[0].click();", get_submitButton());		
		         break;
			case "getCodeButton":
		         jse.executeScript("arguments[0].click();", get_getCodeButton());		
		         break;     
			}
		}
		catch (ElementClickInterceptedException e1) {
			System.out.println( " : " + element + " : " + "Element is not clickable : " + e1.getMessage());
			Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button is unsuccessfull.","Failed");
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println( " : " + element + " : " + "Element not found : " + e2.getMessage());
			Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button is unsuccessfull.","Failed");
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println( " : " + element + " : " + "Exception : " + e.getMessage());
			Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button is unsuccessfull.","Failed");
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + " : " + element);	
		Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicked on '"+element+"' button.","Passed");
		
	}


}
