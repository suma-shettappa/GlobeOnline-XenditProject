package com.pagesHPW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class TrackOrderPage extends BasePage {

	By referenceNumber = By.xpath("//input[@formcontrolname='referenceNumber']");
	By email = By.xpath("//input[@formcontrolname='email']");
	By btn_trackOrder = By.xpath("//button[text()=' Track order']");

	/********************************************************************************************************************************/
	public WebElement get_referenceNumber() {
		return DriverManager.getDriver().findElement(referenceNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_email() {
		return DriverManager.getDriver().findElement(email);
	}

	/********************************************************************************************************************************/
	public WebElement get_btn_trackOrder() {
		return DriverManager.getDriver().findElement(btn_trackOrder);
	}

public boolean isElementExist(String message, String element, int waitTime) throws Exception {
	boolean flag = false;

	switch (element) {
	case "referenceNumber":
		flag = waitForElementVisibility(referenceNumber, waitTime);
		break;
	case "email":
		flag = waitForElementVisibility(email, waitTime);
		break;
	case "btn_trackOrder":
		flag = waitForElementVisibility(btn_trackOrder, waitTime);
		break;
	}

	if (flag) {
		System.out.println(message + " - exists");
	} else {
		System.out.println(message + " - do not exist");
	}
	if (flag) {
		//			ExtentTestManager.logInfo(message + " - exists");
		System.out.println(message + " - exists");
		Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");
	} else {
		//			ExtentTestManager.logFail(message + " - do not exists");
		System.out.println(message + " - do not exist");
		Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is not visbile on the page","Failed");
	}
	
	return flag;
}
}

