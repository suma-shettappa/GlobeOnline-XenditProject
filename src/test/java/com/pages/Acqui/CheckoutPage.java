package com.pages.Acqui;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;
import utility.Generic;

public class CheckoutPage extends BasePage {

	By hdrCheckout = By.xpath("//h1[text()=' Checkout ']");
	By hdrCheckoutQTY = By.xpath("//div/span[@class='qty']");
	By imgXPW = By.xpath("//img[@alt='Xtreme Home Prepaid WiFi']");
	By imgGHPW = By.xpath("//img[@alt='Globe At Home Prepaid WiFi']");
	By imgLTE = By.xpath("//img[@alt='Prepaid WiFi - LTE Advanced with TP Link']");
	By imgBPHPW = By.xpath("//img[@alt='Blackpink LTE Advanced with TP Link']");
	By productCategory = By.xpath("(//div[@class='rightDetails'] //div[@class='cardtitleheading'])[1]");
	By productCategory2 = By.xpath("(//div[@class='rightDetails'] //div[@class='cardtitleheading'])[2]");
	By productName = By.xpath("(//div[@class='rightDetails'] //div[@class='sub-heading'])[1]");
	By productName2 = By.xpath("(//div[@class='rightDetails'] //div[@class='sub-heading'])[2]");
	By productOverview = By.xpath("(//div[@class='rightDetails'] //div[@class='description'])[1]");
	By productOverview2 = By.xpath("(//div[@class='rightDetails'] //div[@class='description'])[2]");
	By productPrice = By.xpath("(//div[contains(@class,'price')]/span)[1]");
	By productPrice2 = By.xpath("(//div[contains(@class,'price')]/span)[2]");
	By quantityLbl = By.xpath("(//span[text()= 'Quantity'])[1]");
	By quantityLbl2 = By.xpath("(//span[text()= 'Quantity'])[2]");
	By quantity = By.xpath("(//div[@class='quantity'] //div[@class='number'])[1]");	
	By quantity2 = By.xpath("(//div[@class='quantity'] //div[@class='number'])[2]");
	By Prod1QtyMinus = By.xpath("(//div[@id='addRemoveQuantity']//img[@alt='Remove quantity'])[1]");	
	By Prod1QtyAdd = By.xpath("(//div[@id='addRemoveQuantity']//img[@alt='Add quantity'])[1]");
	By Prod2QtyMinus = By.xpath("(//div[@id='addRemoveQuantity']//img[@alt='Remove quantity'])[2]");	
	By Prod2QtyAdd = By.xpath("(//div[@id='addRemoveQuantity']//img[@alt='Add quantity'])[2]");
	
	By OrderSummaryLbl = By.xpath("(//span[text()= 'Order summary'])[1]");
	By cashoutAmount = By.xpath("//span[text()='Cashout']/../../div[2]/span");
	By shipping = By.xpath("//span[text()='Shipping']/../../div[2]/span");
	By GotPromoCodeLbl = By.xpath("//span[text()= 'Got a promo code?']");
	By PromoClickHere = By.xpath("//button[text()= ' Click Here ']");
	By PromoTxtbx = By.xpath("//input[@placeholder='Enter PromoCode']");
	By PromoApplyBtn = By.xpath("//button[@id='applyPromoClick']");
	By PromoErrorMsg = By.xpath("//span[text()='Thatâ€™s not a valid promo code.']");
	By PromoSuccessMsg = By.xpath("//span[contains(text(),'Promo code applied successfully.')]");
	
	By totalAmount = By.xpath("//span[text()='Total']/../../div[2]/span");

	By ImgNextDayDelivery = By.xpath("//img[@alt='Delivery icon']");
	By txtNextDayDelivery = By.xpath("//div[@class='need-your-item-now']/span");
	By txt_gCashChckout = By.xpath("//div[@class='gcash-checkout']/p");

	By mobileNumber = By.xpath("//input[@formcontrolname='mobile']");
	By mobileNumberErrorMsg = By.xpath("//span[contains(text(),'Mobile Number is mandatory.')]");
	By btnGcashCheckout = By.xpath("//button[@id='gcashCheckout']");
	By WhatisGcash = By.xpath("//span[contains(text(),' What is GCash?')]");
	By WhatisGcashDesc = By.xpath("//p[contains(text(),'Turn your phone into a virtual wallet with GCash. Send money and pay for items at the speed of a text message!')]");
	By standardCheckout = By.xpath("//button[@id='standardCheckout']");
	
	By otpText = By.xpath("//div[contains(text(),' We sent the code to')]");
	By otp = By.xpath("//input[contains(@id,'otpInput')]");
	
//BPHPW Checkout multiple cart
	By Img_BPHPW = By.xpath("//img[@alt='Blackpink LTE Advanced with TP Link']");
	By Name_BPHPW = By.xpath("//div[@class='sub-heading'][contains(text(),'Globe At Home x Blackpink Limited Edition Modem with TPLink Repeater')]");
	By Price_BPHPW = By.xpath("//div[@class='price']//span[contains(text(),'₱ 2,099.00')]");
	By Qtyheader_BPHPW = By.xpath("(//span[contains(text(),'Quantity')])[2]");
	By Qty_BPHPW = By.xpath("(//div[@class='number'][contains(text(),'1')])[2]");
	
//Total amount checkout page GHPW and BPHPW
	By cartheader_Qty = By.xpath("//div[@class='cart-quantity']//span[contains(text(),'2')]");
	By cashoutprice = By.xpath("//div[@class='row cashout-amount1']//span[contains(text(),'₱ 2,598.00')]");
	By Totalprice = By.xpath("//div[@class='row totalAmount-amount2']//span[contains(text(),'₱ 2,598.00')]");
	
	By btnTryAgain = By.xpath("//button[text()=' Try Again ']");
	By btn_resendOPT = By.xpath("//button[text()=' Resend code. ']");
	By confirmationResendOTP = By.xpath("//div[text()=' We resent your OTP! ']");
	By btnPromoCode = By.xpath("//button[@id='promoClick']");
	By txtbx_promoCode = By.xpath("//input[@formcontrolname='coupon']");
	By btn_applyPromo = By.xpath("//button[@id='applyPromoClick']");
	By promoSuccessMsg = By.xpath("//div[contains(@class,'promocode-success-message')]");
	By promoFailMsg = By.xpath("//div[contains(@class,'promocode-fail-message')]/div/span");
	By transactionTimeOut= By.xpath("//span[text()='The transaction timed out!']");
	
	
	

	By link_gCashDefinition = By.xpath("//span[text()=' What is GCash?']");
	By gCashDefinition = By.xpath("//div[contains(@class,'row GCashText')] //p");
	By addQuantity = By.xpath("//img[@alt='Add quantity']");
	By removeQuantity = By.xpath("//img[@alt='Remove quantity']");
	By closeButton = By.xpath("//div[@class='close-icon']");
	By btn_confirm_removeProduct = By.xpath("//div[contains(@class,'yes-button')]/button");
	
	
	By We_Sent_Code_To = By.xpath("//div[contains(text(),' We sent the code to')]");
	By One_Time_Password= By.xpath("//h1[text()=' One-Time Password ']");
	By Code_ExpiresIn_5Min= By.xpath("//div[text()=' Code expires in ']//span");
	By Resend_Code= By.xpath("//button[text()=' Resend code. ']");
	By Didnot_Get_Code= By.xpath("//span[text()='Didnâ€™t get the code?']");

	
	
	By imgBlackPink = By.xpath("//img[@alt='Blackpink LTE Advanced with TP Link']");
	
	/********************************************************************************************************************************/
	public WebElement get_Transaction_Time_Out() {
		return DriverManager.getDriver().findElement(transactionTimeOut);
	}

	/********************************************************************************************************************************/
	public WebElement get_btn_resendOPT() {
		return DriverManager.getDriver().findElement(btn_resendOPT);
	}
	/********************************************************************************************************************************/
	public WebElement get_mobileNumber() {
		return DriverManager.getDriver().findElement(mobileNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_standardCheckout() {
		return DriverManager.getDriver().findElement(standardCheckout);
	}

	/********************************************************************************************************************************/
	public WebElement get_gcashCheckout() {
		return DriverManager.getDriver().findElement(btnGcashCheckout);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_OTP() {
		return DriverManager.getDriver().findElements(otp);
	}
	/********************************************************************************************************************************/
	public WebElement get_WhatisGcash() {
		return DriverManager.getDriver().findElement(WhatisGcash);
	}

	/********************************************************************************************************************************/
	
	public WebElement get_transactionTimeOut() {
		return DriverManager.getDriver().findElement(transactionTimeOut);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_quantities() {
		return DriverManager.getDriver().findElements(quantity);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_productsName() {
		return DriverManager.getDriver().findElements(productName);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_productsCategory() {
		return DriverManager.getDriver().findElements(productCategory);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_productsOverview() {
		return DriverManager.getDriver().findElements(productOverview);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_productsPrice() {
		return DriverManager.getDriver().findElements(productPrice);
	}

	/********************************************************************************************************************************/
	public WebElement get_linkGCashDefinition() {
		return DriverManager.getDriver().findElement(link_gCashDefinition);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnAddQuantity() {
		return DriverManager.getDriver().findElement(addQuantity);
	}
	
	/********************************************************************************************************************************/
	public List<WebElement> get_buttonsAddQuantity() {
		return DriverManager.getDriver().findElements(addQuantity);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnRemoveQuantity() {
		return DriverManager.getDriver().findElement(removeQuantity);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnClose() {
		return DriverManager.getDriver().findElement(closeButton);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnConfirmRemoveProduct() {
		return DriverManager.getDriver().findElement(btn_confirm_removeProduct);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnTryAgain() {
		return DriverManager.getDriver().findElement(btnTryAgain);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnResendOTP() {
		return DriverManager.getDriver().findElement(btn_resendOPT);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnPromoCode() {
		return DriverManager.getDriver().findElement(btnPromoCode);
	}

	/********************************************************************************************************************************/
	public WebElement get_txtbx_promoCode() {
		return DriverManager.getDriver().findElement(txtbx_promoCode);
	}

	/********************************************************************************************************************************/
	public WebElement get_btn_applyPromo() {
		return DriverManager.getDriver().findElement(btn_applyPromo);
	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		case "header_checkout":
			flag = waitForElementVisibility(hdrCheckout, waitTime);
			break;
		case "hdrCheckoutQTY":
			flag = waitForElementVisibility(hdrCheckoutQTY, waitTime);
			break;
		case "imgXPW":
			flag = waitForElementVisibility(imgXPW, waitTime);
			break;
		case "imgGHPW":
			flag = waitForElementVisibility(imgGHPW, waitTime);
			break;
		case "imgLTE":
			flag = waitForElementVisibility(imgLTE, waitTime);
			break;
		case "imgBPHPW":
			flag = waitForElementVisibility(imgBPHPW, waitTime);
			break;
		case "productCategory":
			flag = waitForElementVisibility(productCategory, waitTime);
			break;
		case "productCategory2":
			flag = waitForElementVisibility(productCategory2, waitTime);
			break;
		case "productName":
			flag = waitForElementVisibility(productName, waitTime);
			break;
		case "productName2":
			flag = waitForElementVisibility(productName2, waitTime);
			break;
		case "productOverview":
			flag = waitForElementVisibility(productOverview, waitTime);
			break;
		case "productOverview2":
			flag = waitForElementVisibility(productOverview2, waitTime);
			break;
		case "productPrice":
			flag = waitForElementVisibility(productPrice, waitTime);
			break;	
		case "productPrice2":
			flag = waitForElementVisibility(productPrice, waitTime);
			break;	
		case "quantityLbl":
			flag = waitForElementVisibility(quantityLbl, waitTime);
			break;	
		case "quantityLbl2":
			flag = waitForElementVisibility(quantityLbl2, waitTime);
			break;	
		case "quantity":
			flag = waitForElementVisibility(quantity, waitTime);
			break;	
		case "quantity2":
			flag = waitForElementVisibility(quantity2, waitTime);
			break;	
		case "Prod1QtyMinus":
			flag = waitForElementVisibility(Prod1QtyMinus, waitTime);
			break;
		case "Prod1QtyAdd":
			flag = waitForElementVisibility(Prod1QtyAdd, waitTime);
			break;
		case "Prod2QtyMinus":
			flag = waitForElementVisibility(Prod2QtyMinus, waitTime);
			break;
		case "Prod2QtyAdd":
			flag = waitForElementVisibility(Prod2QtyAdd, waitTime);
			break;
			
	/**********/		
		case "OrderSummaryLbl":
			flag = waitForElementVisibility(OrderSummaryLbl, waitTime);
			break;		
		case "cashoutAmount":
			flag = waitForElementVisibility(cashoutAmount, waitTime);
			break;		
		case "shipping":
			flag = waitForElementVisibility(shipping, waitTime);
			break;		
		case "GotPromoCodeLbl":
			flag = waitForElementVisibility(GotPromoCodeLbl, waitTime);
			break;		
		case "PromoClickHere":
			flag = waitForElementVisibility(PromoClickHere, waitTime);
			break;		
		case "PromoTxtbx":
			flag = waitForElementVisibility(PromoTxtbx, waitTime);
			break;		
		case "PromoApplyBtn":
			flag = waitForElementVisibility(PromoApplyBtn, waitTime);
			break;		
		case "PromoErrorMsg":
			flag = waitForElementVisibility(PromoErrorMsg, waitTime);
			break;		
		case "PromoSuccessMsg":
			flag = waitForElementVisibility(PromoErrorMsg, waitTime);
			break;			
		case "totalAmount":
			flag = waitForElementVisibility(totalAmount, waitTime);
			break;	
			
	/**********/				
		case "ImgNextDayDelivery":
			flag = waitForElementVisibility(ImgNextDayDelivery, waitTime);
			break;
		case "txtNextDayDelivery":
			flag = waitForElementVisibility(txtNextDayDelivery, waitTime);
			break;
		case "txt_gCashChckout":
			flag = waitForElementVisibility(txt_gCashChckout, waitTime);
			break;
		case "mobileNumber":
			flag = waitForElementVisibility(mobileNumber, waitTime);
			break;
		case "mobileNumberErrorMsg":
			flag = waitForElementVisibility(mobileNumberErrorMsg, waitTime);
			break;
		case "gcashCheckout":
			flag = waitForElementVisibility(btnGcashCheckout, waitTime);
			break;
		case "WhatisGcash":
			flag = waitForElementVisibility(WhatisGcash, waitTime);
			break;
		case "WhatisGcashDesc":
			flag = waitForElementVisibility(WhatisGcashDesc, waitTime);
			break;
		case "standardCheckout":
			flag = waitForElementVisibility(standardCheckout, waitTime);
			break;
	
		
		case "otpText":
			flag = waitForElementVisibility(otpText, waitTime);
			break;
		case "hdrCheckout":
			flag = waitForElementVisibility(hdrCheckout, waitTime);
			break;

			/****/
		case "Img_BPHPW":
			flag = waitForElementVisibility(Img_BPHPW, waitTime);
			break;
		case "cartheader_Qty":
			flag = waitForElementVisibility(cartheader_Qty, waitTime);
			break;			
		case "Name_BPHPW":
			flag = waitForElementVisibility(Name_BPHPW, waitTime);
			break;
		case "Price_BPHPW":
			flag = waitForElementVisibility(Price_BPHPW, waitTime);
			break;			
		case "Qtyheader_BPHPW":
			flag = waitForElementVisibility(Qtyheader_BPHPW, waitTime);
			break;
		case "Qty_BPHPW":
			flag = waitForElementVisibility(Qty_BPHPW, waitTime);
			break;
		case "cashoutprice":
			flag = waitForElementVisibility(cashoutprice, waitTime);
			break;
		case "Totalprice":
			flag = waitForElementVisibility(Totalprice, waitTime);
			break;
		case "transactionTimeOut":
			flag = waitForElementVisibility(transactionTimeOut, waitTime);
			break;	
		case "btnStandardCheckout":
			flag = waitForElementVisibility(standardCheckout, waitTime);
			break;
		case "btnTryAgain":
			flag = waitForElementVisibility(btnTryAgain, waitTime);
			break;
		case "confirmationResendOTP":
			flag = waitForElementVisibility(confirmationResendOTP, waitTime);
			break;
		case "promoSuccessMsg":
			flag = waitForElementVisibility(promoSuccessMsg, waitTime);
			break;
		case "promoFailMsg":
			flag = waitForElementVisibility(promoFailMsg, waitTime);
			break;
		case "imgBlackPink":
			flag = waitForElementVisibility(imgBlackPink, waitTime);
			break;
		case "We_Sent_Code_To":
			flag = waitForElementVisibility(We_Sent_Code_To, waitTime);
			break;
		case "One_Time_Password":
			flag = waitForElementVisibility(One_Time_Password, waitTime);
			break;	
		case "Code_ExpiresIn_5Min":
			flag = waitForElementVisibility(Code_ExpiresIn_5Min, waitTime);
			break;
		case "Resend_Code":
			flag = waitForElementVisibility(Resend_Code, waitTime);
			break;
		case "Didnot_Get_Code":
			flag = waitForElementVisibility(Didnot_Get_Code, waitTime);
			break;	
		}

		if (flag) {
			System.out.println(message + " - exists");
            Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");    
		} else {
            Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should not visible on the Application","'"+element+"' is visbile on the page","Failed");    
			System.out.println(message + " - do not exist");
		}

		return flag;
	}

	/********************************************************************************************************************************/
	public String getText(String ele) {
		String text = "";

		try {
			switch (ele) {
			case "quantity":
				text = DriverManager.getDriver().findElement(quantity).getText();
				break;
			case "cashoutAmount":
				text = DriverManager.getDriver().findElement(cashoutAmount).getText();
				break;
			case "shipping":
				text = DriverManager.getDriver().findElement(shipping).getText();
				break;
			case "totalAmount":
				text = 	DriverManager.getDriver().findElement(totalAmount).getText();
				break;
			case "productCategory":
				text = 	DriverManager.getDriver().findElement(productCategory).getText();
				break;
			case "productName":
				text = 	DriverManager.getDriver().findElement(productName).getText();
				break;
			case "productOverview":
				text = DriverManager.getDriver().findElement(productOverview).getText();
				break;
			case "productPrice":
				text = DriverManager.getDriver().findElement(productPrice).getText();
				break;
			case "txtNextDayDelivery":
				text = 	DriverManager.getDriver().findElement(txtNextDayDelivery).getText();
				break;
			case "txt_gCashChckout":
				text = DriverManager.getDriver().findElement(txt_gCashChckout).getText();
				break;
			case "WhatisGcashDesc":
				text = DriverManager.getDriver().findElement(WhatisGcashDesc).getText();
				break;
			case "WhatisGcash":
				text = DriverManager.getDriver().findElement(WhatisGcash).getText();
				break;
			case "btn_resendOPT":
				text = DriverManager.getDriver().findElement(btn_resendOPT).getText();
				break;
			case "gCashDefinition":
				text = DriverManager.getDriver().findElement(gCashDefinition).getText();
				break;
			}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
		}

		return text;
	}

	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "StanCheckout":
			flag = waitForElementClickable(standardCheckout, waitTime);
			break;
		case "btnGcashCheckout":
			flag = waitForElementClickable(btnGcashCheckout, waitTime);
			break;
		case "WhatisGcash":
			flag = waitForElementClickable(WhatisGcash, waitTime);
			break;
		case "PromoClickHere":
			flag = waitForElementClickable(PromoClickHere, waitTime);
			break;
		case "PromoApplyBtn":
			flag = waitForElementClickable(PromoApplyBtn, waitTime);
			break;
		case "Prod1QtyMinus":
			flag = waitForElementClickable(Prod1QtyMinus, waitTime);
			break;
		case "Prod1QtyAdd":
			flag = waitForElementClickable(Prod1QtyAdd, waitTime);
			break;
		case "Prod2QtyMinus":
			flag = waitForElementClickable(Prod2QtyMinus, waitTime);
			break;
		case "Prod2QtyAdd":
			flag = waitForElementClickable(Prod2QtyAdd, waitTime);
			break;
		case "btn_resendOPT":
			flag = waitForElementClickable(btn_resendOPT, waitTime);
			break;	
		case "gCashDefinitionLink":
			flag = waitForElementClickable(link_gCashDefinition, waitTime);
			break;
		case "addQuantity":
			flag = waitForElementClickable(addQuantity, waitTime);
			break;
		case "removeQuantity":
			flag = waitForElementClickable(removeQuantity, waitTime);
			break;
		case "closeButton":
			flag = waitForElementClickable(closeButton, waitTime);
			break;
		case "confirm_removeProduct":
			flag = waitForElementClickable(btn_confirm_removeProduct, waitTime);
			break;
		case "btnPromoCode":
			flag = waitForElementClickable(btnPromoCode, waitTime);
			break;
		
		}
		return flag;
	}

	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {
			case "WhatisGcash":
				get_WhatisGcash().click();
				break;
			case "btn_resendOPT":
				get_btn_resendOPT().click();
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


	/********************************************************************************************************************************/
	
	

