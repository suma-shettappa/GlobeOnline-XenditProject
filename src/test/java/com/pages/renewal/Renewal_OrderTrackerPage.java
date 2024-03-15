package com.pages.renewal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class Renewal_OrderTrackerPage extends BasePage{
	
	By referenceNum = By.xpath("//span[contains(text(),'PRE')]");
	By myOrder = By.xpath("//span[contains(text(),'My order')]");
	//By refNumOrder=By.xpath("(//span[contains(text(),'PRE')])[2]");
	By orderActiveStatus = By.xpath("(//div[contains(@class,'show-active-title')])[1]/span");
	By completedDate = By.xpath("//div[contains(@class,'show-active-title')]/following-sibling::div");	
	By productNamedetails = By.xpath("//div[contains(@class,'plan-name-heading')]");
	By allAccessData = By.xpath("//span[text()='All-access data ']");
	By allAccessDataVal = By.xpath("(//div[@class='go_text-h2-semibold-to-smallest'])[1]");	
	By goWifiAccess = By.xpath("//span[text()=' GoWifi access ']");
	By goWifiAccessVal = By.xpath("(//div[@class='go_text-h2-semibold-to-smallest'])[2]");
	By calltext=By.xpath("//span[text()=' Call and text ']");
	By planInclusion = By.xpath("//div[text()='Plan inclusions']");
	By konsulta = By.xpath("//li[text()='Konsulta MD ']");
	By freePersonalSubscription = By.xpath("//li[text()=' Free personal subscription']");
	By glnusure = By.xpath("//li[text()=' Glnsure ']");	 
	By monthsSsubscription = By.xpath("//li[text()=' 3-months subscription']");
	By addOns = By.xpath("//div[text()='Add ons']");
//		Add ons 	
	By mysuper = By.xpath("//li[text()='MySuperDuo']");
	By myDuo1 = By.xpath("//li[text()='MyDuo']");	
	By aPV = By.xpath("//li[text()='Amazon Prime Video']");
	By Viupremiumaddons = By.xpath("//li[text()='Viu Premium']");
	By Spotifypremium = By.xpath("//li[text()='Spotify Premium']");
	By easyroam = By.xpath("//li[text()='Easy Roam']");
	By Gocallidaddons = By.xpath("//li[text()='GOCALLIDD 199']");
	By GSAddsurf = By.xpath("//li[text()='GS Add Surf 99']");	
	
	
	By orderconfirmed=By.xpath("//span[contains(text(),'Order Confirmed')]");
	By orderconfirmeddatae=By.xpath("//div[@class='date-value']");
	By dateOrdered = By.xpath("//span[contains(text(),'Date ordered')]");
	By dateOrderedValue = By.xpath("(//div[contains(@class,'date-ordered-col-value')])[1]");	
	By overDueBalance = By.xpath("//span[text()='Amount paid for overdue balance:']");
	By overDueBalanceValue = By.xpath("(//div[contains(@class,'date-ordered-col-value')])[2]");	
	By amountPaid = By.xpath("//span[text()='Amount paid:']");
	By amountPaidValue = By.xpath("(//div[contains(@class,'date-ordered-col-value')])[3]");	
	By paymentMethod = By.xpath("//span[text()='Payment method: ']");
	By paymentMethodName = By.xpath("(//div[contains(@class,'payment-details-col-value')])[1]");	
	By totalAmountPaid = By.xpath("//span[text()='Total Amount Paid:']");
	By totalAmountPaidValue = By.xpath("(//div[contains(@class,'payment-details-col-value')])[3]");	
	By shippingAdress = By.xpath("//span[contains(text(),'Ship to this address')]");
	By shipingaddressvalue=By.xpath("(//div[@class='shipping-details-address'])//span");	
	By estimatedDelivery = By.xpath("//span[contains(text(),'Estimated day of delivery')]");
	By esimatedeliverydatevalue=By.xpath("(//div[@class='shipping-details-address'])[2]//span");
	By OrderDetails = By.xpath("//h1[text()=' Order Details ']");
	By MyOrder = By.xpath("//span[text()='My order']");
	By REFERENCE_NUMBER = By.xpath("//span[text()='REFERENCE NUMBER']//following::span[1]");
	By Processing = By.xpath("(//span[text()='Processing'])[1]");
	By Deliver = By.xpath("(//span[text()='Deliver'])[1]");
	By Receive = By.xpath("(//span[text()='Receive'])[1]");
	By orderTrackerStatus = By.xpath("//div[@class='title-heading']");
	By DateOrdered = By.xpath("//span[text()='Date ordered']//following::div[2]//span");
	By AmountPaidForOverdueBalance = By.xpath("//span[text()='Amount paid for overdue balance:']//following::div[2]//span");
	By AmountPaid = By.xpath("//span[text()='Amount paid:']//following::div[2]//span");
	By PaymentMethod = By.xpath("//span[text()='Payment method: ']//following::div[2]//following::span[1]");
	By Total_Amount_Paid = By.xpath("//span[text()='Total Amount Paid:']//following::div[2]//following::span[1]");
	By ShipToThisAddress = By.xpath("//span[text()='Ship to this address']//following::div[2]//span");
	By EstimatedDayOfDelivery = By.xpath("//span[text()='Estimated day of delivery']//following::div[2]//span");
	By planType = By.xpath("//div[@class='plan-name-heading']//span");
	By DeviceImg = By.xpath("//div[@class='phone']//img");
	By AllAccessData = By.xpath("//span[text()='All-access data ']");
	By GoWifi = By.xpath("//span[text()=' GoWifi access '] | //span[text()=' GoWiFi access ']");
	By CallAndtext = By.xpath("//span[text()=' Call and text ']");
	By PlanInclusions = By.xpath("//div[text()='Plan inclusions']");
	By KonsultaMD = By.xpath("//li[text()='Free subscription to KonsultaMD']");
	By iQIYI = By.xpath("//li[text()=' 3-month VIP Access to iQIYI']");
	By weTV = By.xpath("//li[text()=' 3-month VIP Access to weTV']");
	By Add_ons = By.xpath("//div[text()='Add ons']");
	By GSAddSurf = By.xpath("//li[text()='GS Add Surf 99']");
	By AmazonPrimeVideo = By.xpath("//li[text()='Prime Video']");
	By ViuPremium = By.xpath("//li[text()='Viu Premium']");
	By MySuperDuo = By.xpath("//li[text()='MySuperDuo']");
	By EasyRoam = By.xpath("//li[text()='Easy Roam']");
	By GOCALLIDD = By.xpath("//li[text()='GOCALLIDD 199']");
	
	By Unliapp = By.xpath("//ul[@class='go_feature-list go_text-content-xbase-small']//li[1]");
	By  Unliapp5Gapps = By.xpath("//ul[@class='go_feature-list go_text-content-xbase-small']//li[2]");
	By  GBstoPointsupGBmonth = By.xpath("//ul[@class='go_feature-list go_text-content-xbase-small']//li[3]");
	By   FreeindividualsubscriptiontoKonsultaMDs = By.xpath("//ul[@class='go_feature-list go_text-content-xbase-small']//li[4]");

	

	
		/********************************************************************************************************************************/
	public WebElement get_shipingaddressvalue()
	{
		return DriverManager.getDriver().findElement(shipingaddressvalue);
	}
	public WebElement get_esimatedeliverydatevalue()
	{
		return DriverManager.getDriver().findElement(esimatedeliverydatevalue);
	}
	public WebElement get_orderconfirmeddatae()
	{
		return DriverManager.getDriver().findElement(orderconfirmeddatae);
	}
	public WebElement get_referenceNum() {
		return DriverManager.getDriver().findElement(referenceNum);
	}
//	public WebElement get_refNumOrder() {
//		return DriverManager.getDriver().findElement(refNumOrder);
//	}
//	
	public WebElement get_myOrder() {
		return DriverManager.getDriver().findElement(myOrder);
	}
	public WebElement get_orderconfirmed()
	{
		return DriverManager.getDriver().findElement(orderconfirmed);	
	}
	
	public WebElement get_productNamedetails() {
		return DriverManager.getDriver().findElement(productNamedetails);
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
	public WebElement get_allAccessData() {
		return DriverManager.getDriver().findElement(allAccessData);
	}
	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public WebElement get_allAccessDataVal() {
		return DriverManager.getDriver().findElement(allAccessDataVal);
	}
	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public WebElement get_goWifiAccess() {
		return DriverManager.getDriver().findElement(goWifiAccess);
	}
	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public WebElement get_goWifiAccessVal() {
		return DriverManager.getDriver().findElement(goWifiAccessVal);
	}
	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public WebElement get_planInclusion() {
		return DriverManager.getDriver().findElement(planInclusion);
	}
	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public WebElement get_konsulta() {
		return DriverManager.getDriver().findElement(konsulta);
	}
	/********************************************************************************************************************************/
	public WebElement get_freePersonalSubscription() {
		return DriverManager.getDriver().findElement(freePersonalSubscription);
	}
	/********************************************************************************************************************************/
	public WebElement get_glnusure() {
		return DriverManager.getDriver().findElement(glnusure);
	}
	/********************************************************************************************************************************/
	public WebElement get_monthsSsubscription() {
		return DriverManager.getDriver().findElement(monthsSsubscription);
	}
	/********************************************************************************************************************************/
	public WebElement get_addOns() {
		return DriverManager.getDriver().findElement(addOns);
	}
	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public WebElement get_aPV() {
		return DriverManager.getDriver().findElement(aPV);
	}
	/********************************************************************************************************************************/
	public WebElement get_myDuo1() {
		return DriverManager.getDriver().findElement(myDuo1);
	}
	/********************************************************************************************************************************/

	public WebElement get_Viupremiumaddons() {
		return DriverManager.getDriver().findElement(Viupremiumaddons);
	}
	/********************************************************************************************************************************/
	public WebElement get_Spotifypremium() {
		return DriverManager.getDriver().findElement(Spotifypremium);
	}
	/********************************************************************************************************************************/
	public WebElement get_easyroam() {
		return DriverManager.getDriver().findElement(easyroam);
	}
	/********************************************************************************************************************************/
	public WebElement get_Gocallidaddons() {
		return DriverManager.getDriver().findElement(Gocallidaddons);
	}
	/********************************************************************************************************************************/
	public WebElement get_GSAddsurf() {
		return DriverManager.getDriver().findElement(GSAddsurf);
	}
	/********************************************************************************************************************************/
	
	public WebElement get_dateOrderedValue() {
		return DriverManager.getDriver().findElement(dateOrderedValue);
	}
	/********************************************************************************************************************************/
	public WebElement get_overDueBalance() {
		return DriverManager.getDriver().findElement(overDueBalance);
	}
	/********************************************************************************************************************************/
	public WebElement get_overDueBalanceValue() {
		return DriverManager.getDriver().findElement(overDueBalanceValue);
	}
	/********************************************************************************************************************************/	
	public WebElement get_amountPaidValue() {
		return DriverManager.getDriver().findElement(amountPaidValue);
	}
	/********************************************************************************************************************************/
	
	public WebElement get_paymentMethodName() {
		return DriverManager.getDriver().findElement(paymentMethodName);
	}
	/********************************************************************************************************************************/
	
	public WebElement get_totalAmountPaid() {
		return DriverManager.getDriver().findElement(totalAmountPaid);
	}
	/********************************************************************************************************************************/
	public WebElement get_totalAmountPaidValue() {
		return DriverManager.getDriver().findElement(totalAmountPaidValue);
	}
	/********************************************************************************************************************************/
	public WebElement get_shippingAdress() {
		return DriverManager.getDriver().findElement(shippingAdress);
	}
	/********************************************************************************************************************************/

	public WebElement get_estimatedDelivery() {
		return DriverManager.getDriver().findElement(estimatedDelivery);
	}
	/********************************************************************************************************************************/
	
	

	/********************************************************************************************************************************/
//	public WebElement get_quantity() {
//		return DriverManager.getDriver().findElement(quantity);
//	}
//
//	/********************************************************************************************************************************/
//	public WebElement get_updateDate() {
//		return DriverManager.getDriver().findElement(updateDate);
//	}

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
	public WebElement get_AmountPaidForOverdueBalance() {
		return DriverManager.getDriver().findElement(AmountPaidForOverdueBalance);
	}

	/********************************************************************************************************************************/
	public WebElement get_AmountPaid() {
		return DriverManager.getDriver().findElement(AmountPaid);
	}

	/********************************************************************************************************************************/
	public WebElement get_PaymentMethod() {
		return DriverManager.getDriver().findElement(PaymentMethod);
	}

	/********************************************************************************************************************************/
	public WebElement get_Total_Amount_Paid() {
		return DriverManager.getDriver().findElement(Total_Amount_Paid);
	}

	/********************************************************************************************************************************/
	public WebElement get_ShipToThisAddress() {
		return DriverManager.getDriver().findElement(ShipToThisAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_EstimatedDayOfDelivery() {
		return DriverManager.getDriver().findElement(EstimatedDayOfDelivery);
	}

	/********************************************************************************************************************************/
	public WebElement get_planType() {
		return DriverManager.getDriver().findElement(planType);
	}

	
			
	/********************************************************************************************************************************/
	public WebElement get_Unliapp() {
		return DriverManager.getDriver().findElement(Unliapp);
	}
	/********************************************************************************************************************************/
	public WebElement get_Unliapp5Gapps() {
		return DriverManager.getDriver().findElement(Unliapp5Gapps);
	}
	/********************************************************************************************************************************/
	public WebElement get_GBstoPointsupGBmonth() {
		return DriverManager.getDriver().findElement(GBstoPointsupGBmonth);
	}
	/********************************************************************************************************************************/
	public WebElement get_FreeindividualsubscriptiontoKonsultaMDs() {
		return DriverManager.getDriver().findElement(FreeindividualsubscriptiontoKonsultaMDs);
	}
	public WebElement get_PlanInclusions()
	{
		return DriverManager.getDriver().findElement(PlanInclusions);
	}
	

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		case "overDueBalance":
			flag = waitForElementVisibility(overDueBalance, waitTime);
			break;
		case "OrderDetails":
			flag = waitForElementVisibility(OrderDetails, waitTime);
			break;
		case "MyOrder":
			flag = waitForElementVisibility(MyOrder, waitTime);
			break;
		case "REFERENCE_NUMBER":
			flag = waitForElementVisibility(REFERENCE_NUMBER, waitTime);
			break;
		case "Processing":
			flag = waitForElementVisibility(Processing, waitTime);
			break;
		case "myDuo1":
			flag = waitForElementVisibility(myDuo1, waitTime);
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
		case "AmountPaidForOverdueBalance":
			flag = waitForElementVisibility(AmountPaidForOverdueBalance, waitTime);
			break;
		case "AmountPaid":
			flag = waitForElementVisibility(AmountPaid, waitTime);
			break;
		case "PaymentMethod":
			flag = waitForElementVisibility(PaymentMethod, waitTime);
			break;
		case "Total_Amount_Paid":
			flag = waitForElementVisibility(Total_Amount_Paid, waitTime);
			break;
		case "ShipToThisAddress":
			flag = waitForElementVisibility(ShipToThisAddress, waitTime);
			break;
		case "EstimatedDayOfDelivery":
			flag = waitForElementVisibility(EstimatedDayOfDelivery, waitTime);
			break;
		case "planType":
			flag = waitForElementVisibility(planType, waitTime);
			break;
		case "DeviceImg":
			flag = waitForElementVisibility(DeviceImg, waitTime);
			break;
		case "AllAccessData":
			flag = waitForElementVisibility(AllAccessData, waitTime);
			break;
		case "GoWifi":
			flag = waitForElementVisibility(GoWifi, waitTime);
			break;
		case "CallAndtext":
			flag = waitForElementVisibility(CallAndtext, waitTime);
			break;
		case "PlanInclusions":
			flag = waitForElementVisibility(PlanInclusions, waitTime);
			break;
		case "KonsultaMD":
			flag = waitForElementVisibility(KonsultaMD, waitTime);
			break;
		case "iQIYI":
			flag = waitForElementVisibility(iQIYI, waitTime);
			break;
		case "weTV":
			flag = waitForElementVisibility(weTV, waitTime);
			break;
		case "Add_ons":
			flag = waitForElementVisibility(Add_ons, waitTime);
			break;
		case "GSAddSurf":
			flag = waitForElementVisibility(GSAddSurf, waitTime);
			break;
		case "AmazonPrimeVideo":
			flag = waitForElementVisibility(AmazonPrimeVideo, waitTime);
			break;
		case "ViuPremium":
			flag = waitForElementVisibility(ViuPremium, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
				
		case "Unliapp":
			flag = waitForElementVisibility(Unliapp, waitTime);
			break;
		case "Unliapp5Gapps":
			flag = waitForElementVisibility(Unliapp5Gapps, waitTime);
			break;
		case "GBstoPointsupGBmonth":
			flag = waitForElementVisibility(GBstoPointsupGBmonth, waitTime);
			break;
		case "FreeindividualsubscriptiontoKonsultaMDs":
			flag = waitForElementVisibility(FreeindividualsubscriptiontoKonsultaMDs, waitTime);
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

	
}
