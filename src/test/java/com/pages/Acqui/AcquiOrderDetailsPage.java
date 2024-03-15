package com.pages.Acqui;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.BasePage;
import utility.Generic;

public class AcquiOrderDetailsPage extends BasePage {

	By referenceNumber = By.xpath("//span[@class='refNo']");
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
	By device=By.xpath("//div[@class='phone']//child::img");
	By OrderDetails = By.xpath("//h1[text()=' Order Details ']");
	By MyOrder = By.xpath("//span[text()='My order']");
	By REFERENCE_NUMBER = By.xpath("//span[text()='REFERENCE NUMBER']//following::span[1]");
	By Processing = By.xpath("(//span[text()='Processing'])[1]");
	By Deliver = By.xpath("(//span[text()='Deliver'])[1]");
	By Receive = By.xpath("(//span[text()='Receive'])[1]");
	By orderTrackerStatus = By.xpath("//div[@class='title-heading']");
	By DateOrdered = By.xpath("//span[text()='Date ordered']//following::div[2]//span");
	By PaymentMethod = By.xpath("//span[text()='Payment method: ']//following::div[2]//following::span[1]");
	By ShipToThisAddress = By.xpath("//span[text()='Ship to this address']//following::div[2]//span");
	By planType = By.xpath("//div[@class='plan-name-heading']//span");
	By AllAccessData = By.xpath("//span[text()='All-access data ']");
	By totalAmount = By.xpath("//span[text()='Total amount']//following::span[1]");
	By GoWifi = By.xpath("//span[text()=' GoWifi access '] | //span[text()='  GoWiFi access '] | //span[text()=' GoWiFi access ']");
	By CallAndtext = By.xpath("//span[text()=' Call and text ']");
	By PlanInclusions = By.xpath("//div[text()='Plan inclusions']");
	By KonsultaMD = By.xpath("//li[text()='Konsulta MD ']");
	By Add_ons = By.xpath("//div[text()='Add ons']");
	By GSAddSurf = By.xpath("//li[text()='GS Add Surf 99']");
	By AmazonPrimeVideo = By.xpath("//li[text()='Amazon Prime Video'] | //li[text()='Prime Video']");
	By ViuPremium = By.xpath("//li[text()='Viu Premium']");
	By MySuperDuo = By.xpath("//li[text()='MySuperDuo']");
	By EasyRoam = By.xpath("//li[text()='Easy Roam']");
	By GOCALLIDD = By.xpath("//li[text()='GOCALLIDD 199']");

	
	
	
	By newplandevicename=By.xpath("//div[@class='link']");
	By productdetails=By.xpath("//li[contains(text(),'Product Details')]");
	By productimg=By.xpath("//img[@alt='device_image']");
	By name=By.xpath("//span[@class='go_text-preamble-small']");
	By nameprod=By.xpath("//div[@class='go_text-h1']");
	By identifier=By.xpath("//span[@class='go_tag go_text-preamble-chip ng-star-inserted']");
	By colourfinish=By.xpath("//span[@class='go_text-base-action-default']");
	By clourvalue=By.xpath("//div[@id='deviceColor']");
	By capacity=By.xpath("(//span[@class='go_text-base-action-default'])[2]");
	By contractduration=By.xpath("//div[contains(normalize-space(text()),'Contract Duration:')]//following-sibling::div");
	By  color_GB   = By.xpath("//div[@class='frame-color-ellipse']//following-sibling::div");
	By produuctavilabulity=By.xpath("//span[text()=' Available for Pre-order']");
	By produuctavilabulityreser=By.xpath("//span[text()='For reservation']");
	
	By faq1=By.xpath("//div[text()='Want to know more about our new GPlans?']");
	By applywithdevice=By.xpath("//button[@id='applyButton']");
	By reservethesedevice=By.xpath("//button[@id='reserveButton']");
	By selectanotherdevice=By.xpath("//span[@id='selectDeviceButton']");
	By featurs=By.xpath("//a[@id='pills-home-tab']");
	By promo=By.xpath("//a[@id='pills-profile-tab']");
	By promovalidation=By.xpath("//span[text()='Sorry, there are no available promos at this time. Check back soon or explore other devices in our shop.']");
	
	By faqText1 = By.xpath("(//div[@class='item-text'])[1]");
	By faqText2 = By.xpath("(//div[@class='item-text'])[2]");
	By faqText3 = By.xpath("(//div[@class='item-text'])[3]");
	By faqText4 = By.xpath("(//div[@class='item-text'])[4]");
	By faqText5 = By.xpath("(//div[@class='item-text'])[5]");
	By faqText6 = By.xpath("(//div[@class='item-text'])[6]");
	By accordianText1 = By.xpath("(//div[@class='accordian-text'])[1]");
	By accordianText2 = By.xpath("(//div[@class='accordian-text'])[2]");
	By accordianText3 = By.xpath("(//div[@class='accordian-text'])[3]");
	By accordianText4 = By.xpath("(//div[@class='accordian-text'])[4]");
	By accordianText5 = By.xpath("(//div[@class='accordian-text'])[5]");
	By accordianText6 = By.xpath("(//div[@class='accordian-text'])[6]");
	By acccordionButton1 = By.xpath("(//button[@id='faqExpandCollapse'])[1]");
	By acccordionButton2 = By.xpath("(//button[@id='faqExpandCollapse'])[2]");
	By acccordionButton3 = By.xpath("(//button[@id='faqExpandCollapse'])[3]");
	By acccordionButton4 = By.xpath("(//button[@id='faqExpandCollapse'])[4]");
	By acccordionButton5 = By.xpath("(//button[@id='faqExpandCollapse'])[5]");
	By acccordionButton6 = By.xpath("(//button[@id='faqExpandCollapse'])[6]");
	
	//OB
	By payToContinueWithYourOrderTest = By.xpath("//span[text()=' Please pay the total amount to continue with your order. ']");
	By overDueBalanceText = By.xpath("//div[text()='Overdue Balance']");
	By amountFromUnpaidBilingStatementText = By.xpath("//span[text()='This is the amount from all your unpaid billing statements.']");
	By mobileNumDisplayed = By.xpath("//div[@class='left-content-item']//span");
	By Ob = By.xpath("//div[@class='right-content-item']//span");
	By totalOB = By.xpath("//span[text()='Total']//following::span[1]");
	By payWithIn48HoursText = By.xpath("//p[text()='Please pay for your order within 48 hours. Amount subject to change.']");



	/********************************************************************************************************************************/
	public WebElement get_referenceNumber() {
		return DriverManager.getDriver().findElement(referenceNumber);
	}
	
	public WebElement get_totalOB() {
		return DriverManager.getDriver().findElement(totalOB);
	}
	public WebElement get_contractduration() {
		return DriverManager.getDriver().findElement(contractduration);
	}
	public WebElement get_color_GB() {
		return DriverManager.getDriver().findElement(color_GB);
	}
	
	public WebElement get_overDueBalanceText() {
		return DriverManager.getDriver().findElement(overDueBalanceText);
	}
	
	public WebElement get_mobileNumDisplayed() {
		return DriverManager.getDriver().findElement(mobileNumDisplayed);
	}
	
	public WebElement get_payWithIn48HoursText() {
		return DriverManager.getDriver().findElement(payWithIn48HoursText);
	}

	/********************************************************************************************************************************/
	public WebElement get_orderActiveStatus() {
		return DriverManager.getDriver().findElement(orderActiveStatus);
	}

	/********************************************************************************************************************************/
	public WebElement get_completedDate() {
		return DriverManager.getDriver().findElement(completedDate);
	}
	public WebElement get_device()
	{
		return DriverManager.getDriver().findElement(device);
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
	public WebElement get_applywiththesedevice()
	{
		return DriverManager.getDriver().findElement(applywithdevice);
	}
	public WebElement get_reservethesedevice()
	{
		return DriverManager.getDriver().findElement(reservethesedevice);
	}
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton1() {
		return DriverManager.getDriver().findElement(acccordionButton1);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton2() {
		return DriverManager.getDriver().findElement(acccordionButton2);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton3() {
		return DriverManager.getDriver().findElement(acccordionButton3);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton4() {
		return DriverManager.getDriver().findElement(acccordionButton4);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton5() {
		return DriverManager.getDriver().findElement(acccordionButton5);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton6() {
		return DriverManager.getDriver().findElement(acccordionButton6);
	}
	
	
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
//		case "privacyAccept":
//			flag = waitForElementVisibility(privacyAccept, waitTime);
//			break;
		case "OrderDetails":
			flag = waitForElementVisibility(OrderDetails, waitTime);
			break;
		case "MyOrder":
			flag = waitForElementVisibility(MyOrder, waitTime);
			break;
		case "device":
			flag = waitForElementVisibility(device, waitTime);
			break;
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
		case "color_GB":
			flag = waitForElementVisibility(color_GB, waitTime);
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
		case "newplandevicename":
			flag = waitForElementVisibility(newplandevicename, waitTime);
			break;
		case "productdetails":
			flag = waitForElementVisibility(productdetails, waitTime);
			break;
		case "productimg":
			flag = waitForElementVisibility(productimg, waitTime);
			break;
		case "nameprod":
			flag = waitForElementVisibility(nameprod, waitTime);
			break;
		case "name":
			flag = waitForElementVisibility(name, waitTime);
			break;
		case "identifier":
			flag = waitForElementVisibility(identifier, waitTime);
			break;
		case "colourfinish":
			flag = waitForElementVisibility(colourfinish, waitTime);
			break;
		case "clourvalue":
			flag = waitForElementVisibility(clourvalue, waitTime);
			break;
		case "capacity":
			flag = waitForElementVisibility(capacity, waitTime);
			break;
		case "contractduration":
			flag = waitForElementVisibility(contractduration, waitTime);
			break;
		case "produuctavilabulity":
			flag = waitForElementVisibility(produuctavilabulity, waitTime);
			break;
		case "produuctavilabulityreser":
			flag = waitForElementVisibility(produuctavilabulityreser, waitTime);
			break;
		case "faq1":
			flag = waitForElementVisibility(faq1, waitTime);
			break;
		case "selectanotherdevice":
			flag = waitForElementVisibility(selectanotherdevice, waitTime);
			break;
		case "featurs":
			flag = waitForElementVisibility(featurs, waitTime);
			break;
		case "promo":
			flag = waitForElementVisibility(promo, waitTime);
			break;
		case "promovalidation":
			flag = waitForElementVisibility(promovalidation, waitTime);
			break;
			
			
		case "faqText1":
			flag = waitForElementVisibility(faqText1, waitTime);
			break;
		case "faqText2":
			flag = waitForElementVisibility(faqText2, waitTime);
			break;
		case "faqText3":
			flag = waitForElementVisibility(faqText3, waitTime);
			break;
		case "faqText4":
			flag = waitForElementVisibility(faqText4, waitTime);
			break;
		case "faqText5":
			flag = waitForElementVisibility(faqText5, waitTime);
			break;
		case "faqText6":
			flag = waitForElementVisibility(faqText6, waitTime);
			break;
		case "accordianText1":
			flag = waitForElementVisibility(accordianText1, waitTime);
			break;
		case "accordianText2":
			flag = waitForElementVisibility(accordianText2, waitTime);
			break;
		case "accordianText3":
			flag = waitForElementVisibility(accordianText3, waitTime);
			break;
		case "accordianText4":
			flag = waitForElementVisibility(accordianText4, waitTime);
			break;
		case "accordianText5":
			flag = waitForElementVisibility(accordianText5, waitTime);
			break;
		case "accordianText6":
			flag = waitForElementVisibility(accordianText6, waitTime);
			break;
		case "acccordionButton1":
			flag = waitForElementVisibility(acccordionButton1, waitTime);
			break;
		case "acccordionButton2":
			flag = waitForElementVisibility(acccordionButton2, waitTime);
			break;
		case "acccordionButton3":
			flag = waitForElementVisibility(acccordionButton3, waitTime);
			break;
		case "acccordionButton4":
			flag = waitForElementVisibility(acccordionButton4, waitTime);
			break;
		case "acccordionButton5":
			flag = waitForElementVisibility(acccordionButton5, waitTime);
			break;
		case "acccordionButton6":
			flag = waitForElementVisibility(acccordionButton6, waitTime);
			break;
		case "payToContinueWithYourOrderTest":
			flag = waitForElementVisibility(payToContinueWithYourOrderTest, waitTime);
			break;
		case "overDueBalanceText":
			flag = waitForElementVisibility(overDueBalanceText, waitTime);
			break;
		case "amountFromUnpaidBilingStatementText":
			flag = waitForElementVisibility(amountFromUnpaidBilingStatementText, waitTime);
			break;
		case "mobileNumDisplayed":
			flag = waitForElementVisibility(mobileNumDisplayed, waitTime);
			break;
		case "Ob":
			flag = waitForElementVisibility(Ob, waitTime);
			break;
		case "totalOB":
			flag = waitForElementVisibility(totalOB, waitTime);
			break;
		case "payWithIn48HoursText":
			flag = waitForElementVisibility(payWithIn48HoursText, waitTime);
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

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {
//			case "menuBuy":
//				get_menuBuy().click();
//				break;

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
