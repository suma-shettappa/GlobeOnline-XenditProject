package com.pages.Acqui;

import java.io.File;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.BasePage;
import utility.Generic;

public class AcquiThankyou_Page extends BasePage {

	static File file;
    //FTA scenario2
	By Thankyoulabel = By.xpath("//h1[contains(text(),' Thank you! ')]");
	By forProcessing = By.xpath("//h1[text()='For processing']");
	By notification= By.xpath("//div[contains(@class,'go_notice-block ng-star-inserted')]");
	By order= By.xpath("//h2[contains(normalize-space(text()),'Order confirmed')]");
	By referenceNumber= By.xpath("//div[contains(text(), 'Reference number')]");
	By orderNumber= By.xpath("//div[@class='value col-11']");
	By orderid=By.xpath("//div[@class='value col-11']");
	By purchaseSummary= By.xpath("//span[contains(text(), 'Purchase Summary')]");
	By shippingAdress= By.xpath("//span[contains(text(), 'Shipping address')]");
	By shippingAdressValue= By.xpath("(//div[@class='payment-method-value'])[1]");
	By paymentMethod = By.xpath("//span[text()='Payment method']//following::span[1]");
	By paymentMethodValue= By.xpath("(//div[@class='payment-method-value'])[2]");
	By amountToPay= By.xpath("//span[contains(text(), 'Amount to pay')]//following::span[1]");
	By amountToPayValue= By.xpath("//div[@class='payment-method-value ng-star-inserted']");
	By  esim  = By.xpath("//span[normalize-space(text())='eSIM']");
	By  esim_Inclusions   = By.xpath("//div[normalize-space(text())='e-SIM']");

	
	//asma
	By thanyougplanename=By.xpath("//div[contains(text(),' GPlan All Data 1799  ')]");
	By Gplanwithdevice=By.xpath("//div[contains(text(), ' GPlan 599 with Device ')]");
	By Mysuperduo=By.xpath("//div[contains(text(), ' MySuperDuo ')]");
	By GSADD=By.xpath("//div[contains(text(), ' GS Add Surf 99 ')]");
	
	
	By gplanSimOnly= By.xpath("//div[contains(text(), ' GPlan SIM-Only All Data 599 ')]");
	By planInclusions= By.xpath("//div[contains(text(), 'Plan inclusions')]");
	By konsultaMD= By.xpath("//div[contains(text(), ' Konsulta MD Free personal subscription ')]");
	By glnsure= By.xpath("//div[contains(text(), 'Glnsure 3-months subscription')]");

	By addons= By.xpath("//div[contains(text(), 'Add ons')]");
	By myDuo= By.xpath("//div[contains(text(), ' MyDuo ')]");
	By amazonPrimeVideo= By.xpath("//div[contains(normalize-space(text()), 'Prime Video')]");

	
    //----- RONNIE SCRIPT START HERE ------
	By gplanSimOnly999= By.xpath("//span[text()='GPlan Plus 999']");
	By GS99= By.xpath("//div[contains(text(), ' GS Add Surf 99 ')]");
	
	
	By Gcash599= By.xpath("//div[contains(text(), 'Gcash 599')]");
	By Gplanwithdevice2499= By.xpath("//div[contains(text(), 'Gplan with Device 2499')]");
	
	 //-----VIshnu SCRIPT START HERE ------
	
	By Viupremium = By.xpath("//div[contains(text(),' Viu Premium ')]");
	By Spotifypremium = By.xpath("//div[contains(text(),' Spotify Premium ')]");
	By MySuperDuo = By.xpath("//div[contains(text(),' MySuperDuo')]");
	By easyRoam = By.xpath("//div[contains(text(),' Easy Roam')]");
	By Gocallid199 = By.xpath("//div[contains(text(),' GOCALLIDD 199')]");
	By Gplanwithdevice1499= By.xpath("//div[contains(text(), 'Gplan with Device 1499')]");
	
	//ASMA ADD NEW
	By linkTrackOrder = By.xpath("//a[text()=' Track my order ']");
	
	
	By thankYouText = By.xpath("//h1[text()=' Thank you! ']");
	By youOnTheListText = By.xpath("//p[contains(text(), 'on the list! Stand by for updates on your reservation via the email')]");
	By reservationRequestReceived = By.xpath("//h2[text()='Reservation request received']");
	By ReferenceNumber = By.xpath("//div[text()='Reference number']//following::div[2]");
	By OrderSummaryText = By.xpath("//span[text()='Order Summary']");
	By shippingAddress = By.xpath("//span[text()='Shipping address']//following::span[1]");
	By payment_Method = By.xpath("//span[text()='Payment method']//following::span[1]");
	By AmountToPay = By.xpath("//span[text()='Amount to pay']//following::span[1]");
	By thankYouForReservationText = By.xpath("//span[contains(text(), 'Thank you for your reservation')]");
	By deviceImage = By.xpath("//div[contains(@class, 'device-image')]//img");
	By deviceName = By.xpath("//div[contains(@class, 'device-image')]//following::div[3]");
	By planName = By.xpath("//div[contains(@class, 'device-image')]//following::div[contains(text(),'GPlan')]");
	By plan_Name = By.xpath("//div[@class='plan-name'] | //div[contains(@class, 'device-image')]//following::div[4]");
	By contractDurationText = By.xpath("//span[contains(text(), 'Contract Duration:')]//following::div[1]");
	By color_CapacityText = By.xpath("//div[text()=' Color & Capacity ']");

	
	By planInclusionsText = By.xpath("//div[text()=' Plan inclusions ']");
	By KonsultaMD_Subscription = By.xpath("//div[text()=' Free individual subscription to KonsultaMD  ']");
	By iQIYI_Access = By.xpath("//div[text()=' 3-month VIP Access to iQIYI  ']");
	By weTV_Access = By.xpath("//div[text()=' 3-month VIP Access to weTV  ']");
	By addons_Text = By.xpath("//div[text()=' Add ons ']");
	By AmazonPrimeVideo = By.xpath("//div[normalize-space(text())='Prime Video']");
	By ViuPremium = By.xpath("//div[text()=' Viu Premium ']");
	By SpotifyPremium = By.xpath("//div[text()=' Spotify Premium ']");
	By GOCALLIDD = By.xpath("//div[text()=' GOCALLIDD 199 ']");
	By EasyRoam = By.xpath("//div[text()=' Easy Roam ']");
	By GSAddSurf99  = By.xpath("//div[text()=' GS Add Surf 99 ']");
	By Reminders = By.xpath("//div[text()=' Reminders: ']");
	
	
	
	By btnClose = By.xpath("//span[@class='close-button']");
	By ShippingAd=By.xpath("//div[contains(@class,'payment-method-value')]//span");
	By Paymode=By.xpath("//div[contains(@class,'payment-method-value')]//span[text()='GCash']");
    By devicename=By.xpath("//div[contains(@class,'d-flex flex-column')]//div[contains(@class,'plan-name ng-star-inserted')]");
	By refNumber=By.xpath("//div[contains(@class,'reference-data col-12')]//div[text()='Reference number']");
	
	By Gplanname=By.xpath("//div[@class='plan-name']");
	//FTA1
	By referencevalue=By.xpath("//div[contains(text(), 'UAT-000004174')]");
	By AmountToPayValue=By.xpath("//span[contains(text(), '₱ 48,599.00')]");
	
	//FTA4
	By referencevalue4=By.xpath("//div[contains(text(), 'UAT-000004211')]");
	By AmountTopayValue4=By.xpath("//span[contains(text(), '₱ 1,799.00')]");
	By Gplanplusesimonly=By.xpath("//div[contains(text(), ' GPlan Plus SIM-Only 1799 ')]");
	
	By Konsult4=By.xpath("//div[contains(text(), ' Konsulta MD Free personal subscription ')]");
	By Glnsure4=By.xpath("//div[contains(text(), ' Glnsure 3-months subscription')]");
	By IQIYI4=By.xpath("//div[contains(text(), ' IQIYI 3-month subscription ')]");
	By DA4=By.xpath("//div[contains(text(), ' Da Vinci Kids 1 month Premium Access ')]");
	By skill4=By.xpath("//div[contains(text(), ' SkillShare 1 month Premium Membership ')]");
	By HBO4=By.xpath("//div[contains(text(), ' HBO GO Get 6 months access to HBO GO for only P599 ')]");
	
    By gplanwithgcash= By.xpath("(//div[contains(text(),' GPlan 2499 with GCash ')])");
	
	By viu=By.xpath("//div[contains(text(),' Viu Premium ')]");
	By spotify=By.xpath("//div[contains(text(),' Spotify Premium ')]");
	By weSendPaymentLinkText =By.xpath("//p[contains(text(),'send the payment link once your order is approved.')]");
	

	
	public WebElement get_orderNumber() {
		return DriverManager.getDriver().findElement(orderNumber);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_linkTrackOrder() {
		return DriverManager.getDriver().findElement(linkTrackOrder);
	}
	/********************************************************************************************************************************/
	public WebElement get_ReferenceNumber() {
		return DriverManager.getDriver().findElement(ReferenceNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_shippingAddress() {
		return DriverManager.getDriver().findElement(shippingAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_paymentMethod() {
		return DriverManager.getDriver().findElement(paymentMethod);
	}

	/********************************************************************************************************************************/
	public WebElement get_AmountToPay() {
		return DriverManager.getDriver().findElement(AmountToPay);
	}

	/********************************************************************************************************************************/
	public WebElement get_deviceName() {
		return DriverManager.getDriver().findElement(deviceName);
	}

	/********************************************************************************************************************************/
	public WebElement get_planName() {
		return DriverManager.getDriver().findElement(planName);
	}

	/********************************************************************************************************************************/
	public WebElement get_shippingAdressValue() {
		return DriverManager.getDriver().findElement(shippingAdressValue);
	}
	public WebElement get_payment_Method() {
		return DriverManager.getDriver().findElement(payment_Method);
	}
	
	public WebElement get_plan_Name() {
		return DriverManager.getDriver().findElement(plan_Name);
	}
	
	
	
	/********************************************************************************************************************************/

	public WebElement get_devicename()
	{
		return DriverManager.getDriver().findElement(devicename);
		
	}	
	/**************************************************************************************/
	public WebElement getPaymode()
	{
		return DriverManager.getDriver().findElement(Paymode);
		
	}
	/************************************************************************************/
	public WebElement get_shipadd()
	{
		return DriverManager.getDriver().findElement(ShippingAd);
		
	}
	/*******************************************************************************************/
		public WebElement get_refNumber()
		{
			return DriverManager.getDriver().findElement(refNumber);
			
		}
		public WebElement get_orderid()
		{
			return DriverManager.getDriver().findElement(orderid);
		}

	/*********************************************************************************************/

		/*********************************************************************************/
		public WebElement get_closeButton() {
			return DriverManager.getDriver().findElement(btnClose);
		}
		public WebElement get_contractDurationText() {
			return DriverManager.getDriver().findElement(contractDurationText);
		}
	
	
	//===================================================================
	public void moveToElement(String element) {

		WebElement ele = null;
		
				switch (element) {
				case "gplanSimOnly999":
					ele = DriverManager.getDriver().findElement(gplanSimOnly999);
					break;
				case "Gplanwithdevice1499":
					ele = DriverManager.getDriver().findElement(Gplanwithdevice1499);
					break;
				}

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}

	
	/**
	 * @throws Exception ******************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;
		switch (element) {
		case "gplanSimOnly999":
			flag = waitForElementVisibility(gplanSimOnly999, waitTime);
			break;
		case "GS99":
			flag = waitForElementVisibility(GS99, waitTime);
			break;
		case "Thankyoulabel":
			flag = waitForElementVisibility(Thankyoulabel, waitTime);
			break;
		case "notification":
			flag = waitForElementVisibility(notification, waitTime);
			break;
		case "order":
			flag = waitForElementVisibility(order, waitTime);
			break;
		case "referenceNumber":
			flag = waitForElementVisibility(referenceNumber, waitTime);
			break;
		case "orderNumber":
			flag = waitForElementVisibility(orderNumber, waitTime);
			break;
		case "purchaseSummary":
			flag = waitForElementVisibility(purchaseSummary, waitTime);
			break;
		case "shippingAdress":
			flag = waitForElementVisibility(shippingAdress, waitTime);
			break;
		case "shippingAdressValue":
			flag = waitForElementVisibility(shippingAdressValue, waitTime);
			break;
		case "payment_Method":
			flag = waitForElementVisibility(payment_Method, waitTime);
			break;
		case "paymentMethodValue":
			flag = waitForElementVisibility(paymentMethodValue, waitTime);
			break;
		case "amountToPay":
			flag = waitForElementVisibility(amountToPay, waitTime);
			break;
		case "amountToPayValue":
			flag = waitForElementVisibility(amountToPayValue, waitTime);
			break;
		case "gplanSimOnly":
			flag = waitForElementVisibility(gplanSimOnly, waitTime);
			break;
		case "thanyougplanename":
			flag = waitForElementVisibility(thanyougplanename, waitTime);
			break;
		case "weSendPaymentLinkText":
			flag = waitForElementVisibility(weSendPaymentLinkText, waitTime);
			break;
		
		case "planInclusions":
			flag = waitForElementVisibility(planInclusions, waitTime);
			break;
		case "konsultaMD":
			flag = waitForElementVisibility(konsultaMD, waitTime);
			break;
		case "glnsure":
			flag = waitForElementVisibility(glnsure, waitTime);
			break;
		case "addons":
			flag = waitForElementVisibility(addons, waitTime);
			break;
		case "myDuo":
			flag = waitForElementVisibility(Thankyoulabel, waitTime);
			break;
		case "amazonPrimeVideo":
			flag = waitForElementVisibility(amazonPrimeVideo, waitTime);

			break;
		case "Viupremium":
			flag = waitForElementVisibility(Viupremium, waitTime);
			break;
		case "Spotifypremium":
			flag = waitForElementVisibility(amazonPrimeVideo, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;
		case "easyRoam":
			flag = waitForElementVisibility(easyRoam, waitTime);
			break;
		case "Gocallid199":
			flag = waitForElementVisibility(Gocallid199, waitTime);
			break;
		case "Gplanwithdevice1499":
			flag = waitForElementVisibility(Gplanwithdevice1499, waitTime);
			break;
			
		case "plan_Name":
			flag = waitForElementVisibility(plan_Name, waitTime);
			break;
		case "esim":
			flag = waitForElementVisibility(esim, waitTime);
			break;	
		case "esim_Inclusions":
			flag = waitForElementVisibility(esim_Inclusions, waitTime);
			break;		
			     
		 
		case "Gplanwithdevice":
			flag = waitForElementVisibility(Gplanwithdevice, waitTime);
			break;
		case "Mysuperduo":
			flag = waitForElementVisibility(Mysuperduo, waitTime);
			break;
		case "GSADD":
			flag = waitForElementVisibility(GSADD, waitTime);
			break;
		case "forProcessing":
			flag = waitForElementVisibility(forProcessing, waitTime);
			break;
		case "thankYouText":
			flag = waitForElementVisibility(thankYouText, waitTime);
			break;
		case "youOnTheListText":
			flag = waitForElementVisibility(youOnTheListText, waitTime);
			break;
		case "reservationRequestReceived":
			flag = waitForElementVisibility(reservationRequestReceived, waitTime);
			break;
		case "ReferenceNumber":
			flag = waitForElementVisibility(ReferenceNumber, waitTime);
			break;
		case "OrderSummaryText":
			flag = waitForElementVisibility(OrderSummaryText, waitTime);
			break;
		case "shippingAddress":
			flag = waitForElementVisibility(shippingAddress, waitTime);
			break;
		case "paymentMethod":
			flag = waitForElementVisibility(paymentMethod, waitTime);
			break;
		case "AmountToPay":
			flag = waitForElementVisibility(AmountToPay, waitTime);
			break;
		case "thankYouForReservationText":
			flag = waitForElementVisibility(thankYouForReservationText, waitTime);
			break;
		case "deviceImage":
			flag = waitForElementVisibility(deviceImage, waitTime);
			break;
		case "deviceName":
			flag = waitForElementVisibility(deviceName, waitTime);
			break;
		case "planName":
			flag = waitForElementVisibility(planName, waitTime);
			break;
		case "color_CapacityText":
			flag = waitForElementVisibility(color_CapacityText, waitTime);
			break;
		case "contractDurationText":
			flag = waitForElementVisibility(contractDurationText, waitTime);
			break;
		case "planInclusionsText":
			flag = waitForElementVisibility(planInclusionsText, waitTime);
			break;
		case "KonsultaMD_Subscription":
			flag = waitForElementVisibility(KonsultaMD_Subscription, waitTime);
			break;
		case "iQIYI_Access":
			flag = waitForElementVisibility(iQIYI_Access, waitTime);
			break;
		case "weTV_Access":
			flag = waitForElementVisibility(weTV_Access, waitTime);
			break;
		case "addons_Text":
			flag = waitForElementVisibility(addons_Text, waitTime);
			break;
		case "AmazonPrimeVideo":
			flag = waitForElementVisibility(AmazonPrimeVideo, waitTime);
			break;
		case "ViuPremium":
			flag = waitForElementVisibility(ViuPremium, waitTime);
			break;
		case "SpotifyPremium":
			flag = waitForElementVisibility(SpotifyPremium, waitTime);
			break;
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GSAddSurf99":
			flag = waitForElementVisibility(GSAddSurf99, waitTime);
			break;
		case "Reminders":
			flag = waitForElementVisibility(Reminders, waitTime);
			break;		
		case "viu":
			flag = waitForElementVisibility(viu, waitTime);
			break;  
		case "spotify":
			flag = waitForElementVisibility(spotify, waitTime);
			break;	
		case "Gplan1799":
			flag = waitForElementVisibility(Gplanname, waitTime);
			break;  
		case "referencevalue":
			flag = waitForElementVisibility(referencevalue, waitTime);
			break;  
		case "AmountToPayValue":
			flag = waitForElementVisibility(AmountToPayValue, waitTime);
			break;
		case"referencevalue4":
			flag = waitForElementVisibility(referencevalue4, waitTime);
			break;
		case "AmountTopayValue4":
			flag = waitForElementVisibility(AmountTopayValue4, waitTime);
			break;
		case "Gplanplusesimonly":
			flag = waitForElementVisibility(Gplanplusesimonly, waitTime);
			break;
		case "Konsult4":
			flag = waitForElementVisibility(Konsult4, waitTime);
			break;
		case  "Glnsure4":
			flag = waitForElementVisibility(Glnsure4, waitTime);
			break;
		case "IQIYI4":
			flag = waitForElementVisibility(IQIYI4, waitTime);
			break;
		case "skill4":
			flag = waitForElementVisibility(skill4, waitTime);
			break;
		case "DA4":
			flag = waitForElementVisibility(DA4, waitTime);
			break;
		case "HBO4":
			flag = waitForElementVisibility(HBO4, waitTime);
			break;
		}

		if (flag) {
			//			ExtentTestManager.logInfo(message + " - exists");
			System.out.println(message + " - exists");
            Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");    
		} else {
			//			ExtentTestManager.logFail(message + " - do not exists");
			System.out.println(message + " - do not exist");
            Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should not visible on the Application","'"+element+"' is visbile on the page","Failed");    
		}

		return flag;
	}
	public String getAttributeValue(String ele, String attribute) 
	{
			String text = "";
			try {
				switch (ele) 
				{
				case "orderNumber":
				text = DriverManager.getDriver().findElement(orderNumber).getAttribute(attribute);
				break;

				}

			    } catch (NoSuchElementException e) {
				System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Method : getText - Error : " + e.getMessage());
			}

			return text;
	}

	public String getText(String ele) {
			String text = "";
	 		try {
				switch (ele) {
				case "orderNumber":
				text = DriverManager.getDriver().findElement(orderNumber).getText();
				break;
			}

			} catch (NoSuchElementException e) {
				System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Method : getText - Error : " + e.getMessage());
			}

			return text;
		}

	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {
			case "close_btn":
				get_closeButton().click();
				break;
			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + eleName + " : " + "Element is not clickable : " + e1.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + eleName + " : " + "Element not found : " + e2.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + eleName + " : " + "Exception : " + e.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + type + " : " + eleName);
		Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicked on '"+ele+"' button.","Passed");	

	}

}