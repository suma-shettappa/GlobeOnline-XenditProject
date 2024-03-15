package com.pagesHPW;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class OrderDetailsPage extends BasePage {

	By referenceNumber = By.xpath("//span[@class='refNo'] | //span[@class='reference-number']");
	By orderActiveStatus = By.xpath("(//div[contains(@class,'show-active-title')])[1]/span");
	By completedDate = By.xpath("//div[contains(@class,'show-active-title')]/following-sibling::div");
	By productName = By.xpath("//div[contains(@class,'card-description')] //div[contains(@class,'sub-heading')]");
	By quantity = By.xpath("//div[contains(@class,'row unit-section')]/div/span");
	By productImage = By.xpath("//img[contains(@class,'globeImage')]");
	By updateDate = By.xpath("//div[contains(@class,'order-recieved-data')]");
	By dateOrdered = By.xpath("(//div[contains(@class,'grab')])[1]/span");
	By paymentMethod = By.xpath("(//div[contains(@class,'grab')])[2]/span");
	By amountPaid = By.xpath("(//div[contains(@class,'grab')])[3]/span");
	By shippingAddress = By.xpath("//div[text()='Ship to this address']/following-sibling::div");
	By estDayOfDelivery = By.xpath("//div[text()='Estimated day of delivery']/following-sibling::div");
	By REFERENCE_NUMBER = By.xpath("//span[text()='REFERENCE NUMBER']//following::span[1]");
	By Processing = By.xpath("(//span[text()='Order Confirmed'])[1]");
	By Deliver = By.xpath("(//span[text()='Deliver'])[1]");
	By Receive = By.xpath("(//span[text()='Receive'])[1]");
	By orderTrackerStatus = By.xpath("//div[@class='title-heading'] | //h1[@class='homePrepaid-text']");
	By DateOrdered = By.xpath("//span[text()='Date ordered']//following::div[2]//span");
	By PaymentMethod = By.xpath("//span[text()='Payment method: ']//following::div[2]//following::span[1]");
	By ShipToThisAddress = By.xpath("//span[text()='Ship to this address']//following::div[2]//span");
	By planType = By.xpath("//div[@class='plan-name-heading']//span");
	By totalAmount = By.xpath("//span[text()='Total']//following::span[1]");

	/********************************************************************************************************************************/
	public WebElement get_referenceNumber() {
		return DriverManager.getDriver().findElement(referenceNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_orderActiveStatus() {
		return DriverManager.getDriver().findElement(orderActiveStatus);
	}

	/********************************************************************************************************************************/
	public WebElement get_completedDate() {
		return DriverManager.getDriver().findElement(completedDate);
	}

	/********************************************************************************************************************************/
	public WebElement get_productName() {
		return DriverManager.getDriver().findElement(productName);
	}

	/********************************************************************************************************************************/
	public WebElement get_quantity() {
		return DriverManager.getDriver().findElement(quantity);
	}

	/********************************************************************************************************************************/
	public WebElement get_updateDate() {
		return DriverManager.getDriver().findElement(updateDate);
	}

	/********************************************************************************************************************************/
	public WebElement get_dateOrdered() {
		return DriverManager.getDriver().findElement(dateOrdered);
	}

	/********************************************************************************************************************************/
	public WebElement get_paymentMethod() {
		return DriverManager.getDriver().findElement(paymentMethod);
	}

	/********************************************************************************************************************************/
	public WebElement get_amountPaid() {
		return DriverManager.getDriver().findElement(amountPaid);
	}

	/********************************************************************************************************************************/
	public WebElement get_shippingAddress() {
		return DriverManager.getDriver().findElement(shippingAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_estDayOfDelivery() {
		return DriverManager.getDriver().findElement(estDayOfDelivery);
	}
	/********************************************************************************************************************************/
	public WebElement get_REFERENCE_NUMBER() {
		return DriverManager.getDriver().findElement(REFERENCE_NUMBER);
	}

	/********************************************************************************************************************************/
	public WebElement get_orderTrackerStatus() {
		return DriverManager.getDriver().findElement(orderTrackerStatus);
	}

	/********************************************************************************************************************************/
	public WebElement get_DateOrdered() {
		return DriverManager.getDriver().findElement(DateOrdered);
	}

	/********************************************************************************************************************************/
	
	public WebElement get_totalAmount() {
		return DriverManager.getDriver().findElement(totalAmount);
	}

	/********************************************************************************************************************************/
	public WebElement get_PaymentMethod() {
		return DriverManager.getDriver().findElement(PaymentMethod);
	}

	/********************************************************************************************************************************/
	
	public WebElement get_ShipToThisAddress() {
		return DriverManager.getDriver().findElement(ShipToThisAddress);
	}

	/********************************************************************************************************************************/
	
	public WebElement get_planType() {
		return DriverManager.getDriver().findElement(planType);
	}

	/********************************************************************************************************************************/

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
//		case "privacyAccept":
//			flag = waitForElementVisibility(privacyAccept, waitTime);
//			break;
		case "REFERENCE_NUMBER":
			flag = waitForElementVisibility(REFERENCE_NUMBER, waitTime);
			break;
		case "Processing":
			flag = waitForElementVisibility(Processing, waitTime);
			break;
		case "Deliver":
			flag = waitForElementVisibility(Deliver, waitTime);
			break;
		case "Receive":
			flag = waitForElementVisibility(Receive, waitTime);
			break;
		case "orderTrackerStatus":
			flag = waitForElementVisibility(orderTrackerStatus, waitTime);
			break;
		case "DateOrdered":
			flag = waitForElementVisibility(DateOrdered, waitTime);
			break;
		case "totalAmount":
			flag = waitForElementVisibility(totalAmount, waitTime);
			break;
		case "PaymentMethod":
			flag = waitForElementVisibility(PaymentMethod, waitTime);
			break;
		case "ShipToThisAddress":
			flag = waitForElementVisibility(ShipToThisAddress, waitTime);
			break;
		case "planType":
			flag = waitForElementVisibility(planType, waitTime);
			break;

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

	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
//		case "link_LTE_Advanced":
//			flag = waitForElementClickable(link_LTE_Advanced, waitTime);
//			break;

		}

		return flag;
	}

	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
//		case "menuBuy":
//			ele = DriverManager.getDriver().findElement(link_MenuBuy);
//			break;

		}

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}

	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
//			case "menuBuy":
//				get_menuBuy().click();
//				break;

			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + eleName + " : " + "Element is not clickable : " + e1.getMessage());
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + eleName + " : " + "Element not found : " + e2.getMessage());
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + eleName + " : " + "Exception : " + e.getMessage());
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + type + " : " + eleName);
	}

	/********************************************************************************************************************************/
	public String getAttributeValue(String ele, String attribute) {
		String text = "";

		try {
			switch (ele) {
			case "productImage":
				text = DriverManager.getDriver().findElement(productImage).getAttribute(attribute);
				break;

			}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
		}

		return text;
	}

}
