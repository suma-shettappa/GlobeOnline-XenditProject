package com.pagesHPW;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class FormPage extends BasePage {

	By AddressLbl = By.xpath("//span[text()='Address']");
	By rBtb_House = By.xpath("//label[text()='House']");
	By rBtn_condominium = By.xpath("//label[text()='Condominium']");
	
	By hdrForm = By.xpath("//h1[text()=' Form ']");
	By firstName = By.xpath("//input[@formcontrolname='firstName']");
	By middleName = By.xpath("//input[@formcontrolname='middleName']");
	By lastName = By.xpath("//input[@formcontrolname='lastName']");
	By email = By.xpath("//input[@formcontrolname='email']");
	By mobileNumber = By.xpath("//input[@formcontrolname='mobile']");
	
	By rBtn_house = By.xpath("//label[text()='House']");
	By SignalStrengthWarning = By.xpath("//div[contains(@class,'address-sub-section-flex-content')]/span");
	By houseNo = By.xpath("//input[@formcontrolname='HouseNo']");
	By street = By.xpath("//input[@formcontrolname='street']");
	By village_subDivision = By.xpath("//input[@formcontrolname='subDivision']");
	By subDivision = By.xpath("//input[@formcontrolname='subDivision']");
	By floor = By.xpath("//input[@formcontrolname='FloorNo']");
	By buildingName = By.xpath("//input[@formcontrolname='buildingName']");
	By drpdwnProvince = By.xpath("//select[@formcontrolname='province']");
	By drpdwnCity = By.xpath("//select[@formcontrolname='city']");
	By drpdwnBarangay = By.xpath("//select[@formcontrolname='barangay']");
	By chkbx_acceptAll = By.xpath("//input[@formcontrolname='all']");
	By btnPay = By.xpath("(//span[text()='Pay'])[2]//parent::button | (//span[text()='Pay'])[1]/parent::button");
	By topSectionImgXPW = By.xpath("//div[@class='top-section'] //img[@alt='Xtreme Home Prepaid WiFi']");
	By topSectionImgGHPW = By.xpath("//div[@class='top-mobile-section'] | //div[@class='top-section'] //img[@alt='Globe At Home Prepaid WiFi']");
	By topSectionImgBlackPink = By.xpath("//div[@class='top-section'] //img[@alt='Blackpink LTE Advanced with TP Link']");

	By topSectionImgSanitizer= By.xpath("//div[@class='top-section'] //img[@alt='UV Sanitizer']");
	By topSectionImgBottle = By.xpath("//div[@class='top-section'] //img[@alt='Water Bottle']");

	
	By topSectionProductName = By.xpath("//div[@class='mobile-total-amount'] | //div[@class='top-section'] //div[@class='prepaid-text']/span");
	By topSectionPrice = By.xpath("//div[@class='mobile-price'] | //div[@class='top-section'] //div[@class='prepaid-cost']/span");
	By btnReviewBag = By.xpath("//button[text()=' Review bag ']");
	By formPersonalInfo = By.xpath("//span[text()='Personal information']");

	By imgGiftOption = By.xpath("//div[@formgroupname='giftOption'] //img");
	By toggleGiftOption = By.xpath("//div[@formgroupname='giftOption'] //span[@class='slider round']");
	By recipientName = By.xpath("//input[@formcontrolname='recipientName']");
	By recipientMobile = By.xpath("//input[@formcontrolname='recipientMobile']");
	By errRecipientMobile = By.xpath("//input[@formcontrolname='recipientMobile'] /../following-sibling::div/span");
	By zipCode = By.xpath("//input[@formcontrolname='zipCode']");
	By imgnextDayDelivery = By.xpath("//input[@formcontrolname='isSameDay']/../../img");
	By txtdeliveryCaveat_1 = By.xpath("//div[contains(@class,'delivery-msg-block')]/div[1]");
	By txtdeliveryCaveat_2 = By.xpath("//div[contains(@class,'delivery-msg-block')]/div[2]/p");
	By chkbxTermsConditions = By.xpath("//div[@class='terms-and-condition-wrapper'] // input[@type='checkbox']");
	By get_chkbxLabelTermsConditions = By.xpath(
			"//div[@class='terms-and-condition-wrapper'] // input[@type='checkbox']/../../following-sibling::div //span[1]");
By label_accept_all_terms = By.xpath("//label[text()=' I accept all Terms and Conditions. ']");
	
	
	By specialInstruction = By.xpath("//input[@formcontrolname='instruction']");
	
//	AndoidXpath
	By btnPay_Android = By.xpath("(//span[text()='Pay'])[2]//parent::button");


	/********************************************************************************************************************************/
	public WebElement get_firstName() {
		return DriverManager.getDriver().findElement(firstName);
	}

	/********************************************************************************************************************************/
	public WebElement get_middleName() {
		return DriverManager.getDriver().findElement(middleName);
	}

	/********************************************************************************************************************************/
	public WebElement get_lastName() {
		return DriverManager.getDriver().findElement(lastName);
	}

	/********************************************************************************************************************************/
	public WebElement get_email() {
		return DriverManager.getDriver().findElement(email);
	}

	/********************************************************************************************************************************/
	public WebElement get_condominium() {
		return DriverManager.getDriver().findElement(rBtn_condominium);
	}
	/********************************************************************************************************************************/
	public WebElement get_AddressLbl() {
		return DriverManager.getDriver().findElement(AddressLbl);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_house() {
		return DriverManager.getDriver().findElement(houseNo);
	}

	/********************************************************************************************************************************/
	public WebElement get_street() {
		return DriverManager.getDriver().findElement(street);
	}

	/********************************************************************************************************************************/
	public WebElement get_village_subDivision() {
		return DriverManager.getDriver().findElement(village_subDivision);
	}

	/********************************************************************************************************************************/
	public WebElement get_floor() {
		return DriverManager.getDriver().findElement(floor);
	}

	/********************************************************************************************************************************/
	public WebElement get_buildingName() {
		return DriverManager.getDriver().findElement(buildingName);
	}

	/********************************************************************************************************************************/
	public WebElement get_subDivision() {
		return DriverManager.getDriver().findElement(subDivision);
	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void select_province(String option) throws Exception {
		try {
			Select s = new Select(DriverManager.getDriver().findElement(drpdwnProvince));
			s.selectByValue(option);
			Generic.WriteTestData("Selecting '"+option+"' in provience dropdown field",option,option,"Should able to select'"+option+"' in provience drop down field","Selected '"+option+"' in provience drop down field successfully","Passed");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			Generic.WriteTestData("Selecting '"+option+"' in provience dropdown field",option,option,"Should able to select'"+option+"' in provience drop down field","Selecting '"+option+"' in provience drop down field was unsuccessfull","Failed");
		}	
		
	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void select_city(String option) throws Exception {
		try {
			Select s = new Select(DriverManager.getDriver().findElement(drpdwnCity));
			s.selectByValue(option);
			Generic.WriteTestData("Selecting '"+option+"' in city dropdown field",option,option,"Should able to select'"+option+"' in city drop down field","Selected '"+option+"' in city drop down field successfully","Passed");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Generic.WriteTestData("Selecting '"+option+"' in city dropdown field",option,option,"Should able to select'"+option+"' in city drop down field","Selecting '"+option+"' in city drop down field was unsuccessfull","Failed");
		}
		
	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void select_barangay(String option) throws Exception {
		try {
			Select s = new Select(DriverManager.getDriver().findElement(drpdwnBarangay));
			s.selectByValue(option);
			Generic.WriteTestData("Selecting '"+option+"' in barangay dropdown field",option,option,"Should able to select'"+option+"' in barangay drop down field","Selected '"+option+"' in barangay drop down field successfully","Passed");
		} catch(Exception e) {
			Generic.WriteTestData("Selecting '"+option+"' in barangay dropdown field",option,option,"Should able to select'"+option+"' in barangay drop down field","Selecting '"+option+"' in barangay drop down field was unsuccessfull","Failed");
		}
	}

	/********************************************************************************************************************************/
	public WebElement get_checkbox_acceptAll() {
		return DriverManager.getDriver().findElement(chkbx_acceptAll);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnPay() {
		return DriverManager.getDriver().findElement(btnPay);
	}
	/********************************************************************************************************************************/
	public WebElement get_btnPay_Android() {
		return DriverManager.getDriver().findElement(btnPay_Android);
	}
	public WebElement get_chkbx_acceptAll() {
		return DriverManager.getDriver().findElement(chkbx_acceptAll);
	}
	/********************************************************************************************************************************/
	public WebElement get_reviewBag() {
		return DriverManager.getDriver().findElement(btnReviewBag);
	}

	/********************************************************************************************************************************/
	public WebElement get_toggleGiftOption() {
		return DriverManager.getDriver().findElement(toggleGiftOption);
	}

	/********************************************************************************************************************************/
	public WebElement get_recipientName() {
		return DriverManager.getDriver().findElement(recipientName);
	}

	/********************************************************************************************************************************/
	public WebElement get_recipientMobile() {
		return DriverManager.getDriver().findElement(recipientMobile);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_SignalStrengthWarning() {
		return DriverManager.getDriver().findElements(SignalStrengthWarning);
	}

	/********************************************************************************************************************************/
	public WebElement get_ImgGiftOption() {
		return DriverManager.getDriver().findElement(imgGiftOption);
	}

	/********************************************************************************************************************************/
	public WebElement get_zipCode() {
		return DriverManager.getDriver().findElement(zipCode);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_chkbxTermsConditions() {
		return DriverManager.getDriver().findElements(chkbxTermsConditions);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_chkbxLabelTermsConditions() {
		return DriverManager.getDriver().findElements(get_chkbxLabelTermsConditions);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_topSectionProductsName() {
		return DriverManager.getDriver().findElements(topSectionProductName);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_topSectionProductsPrice() {
		return DriverManager.getDriver().findElements(topSectionPrice);
	}

	/********************************************************************************************************************************/
	public WebElement get_specialInstruction() {
		return DriverManager.getDriver().findElement(specialInstruction);
	}

	/********************************************************************************************************************************/
	public WebElement get_radioBtnHouse() {
		return DriverManager.getDriver().findElement(rBtn_house);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_label_accept_all_terms() {
		return DriverManager.getDriver().findElement(label_accept_all_terms);
	}
	
	
	
	
	

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) throws Exception {

		boolean flag = false;

		switch (element) {
		case "rBtn_condominium":
			flag = waitForElementClickable(rBtn_condominium, waitTime);
			break;
		case "Pay":
			flag = waitForElementClickable(btnPay, waitTime);
			break;
		case "btnPay_Android":
			flag = waitForElementClickable(btnPay_Android, waitTime);
			break;		
		case "reviewBag":
			flag = waitForElementClickable(btnReviewBag, waitTime);
			break;
		case "toggleGiftOption":
			flag = waitForElementClickable(toggleGiftOption, waitTime);
			break;
		case "btnPay":
			flag = waitForElementClickable(btnPay, waitTime);
			break;
		case "zipCode":
			flag = waitForElementClickable(zipCode, waitTime);
			break;
		}
		
		if (flag) {
			//			ExtentTestManager.logInfo(message +System.out.println( message + " - exists");
			System.out.println(element + " - exists");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");
		} else {
			//			ExtentTestManager.logFail(message + " - do not exists");
			System.out.println(element + " - do not exist");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is not visbile on the page","Failed");
		}
		
		return flag;
	
	
	}

	/********************************************************************************************************************************/
	public void javascript_clickCondominium() {
		WebElement ele = DriverManager.getDriver().findElement(rBtn_condominium);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", ele);

	}

	/********************************************************************************************************************************/
	public void javascript_clickRadioBtn_House() {
		WebElement ele = DriverManager.getDriver().findElement(rBtn_house);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", ele);

	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		case "chkbx_acceptAll":
			flag = waitForElementVisibility(chkbx_acceptAll, waitTime);
			break;
		case "hdrForm":
			flag = waitForElementVisibility(hdrForm, waitTime);
			break;
		case "topSectionImgXPW":
			flag = waitForElementVisibility(topSectionImgXPW, waitTime);
			break;
		case "topSectionImgGHPW":
			flag = waitForElementVisibility(topSectionImgGHPW, waitTime);
			break;
		case "formPersonalInfo":
			flag = waitForElementVisibility(formPersonalInfo, waitTime);
			break;
		case "errRecipientMobile":
			flag = waitForElementVisibility(errRecipientMobile, waitTime);
			break;
		case "specialInstruction":
			flag = waitForElementVisibility(specialInstruction, waitTime);
			break;
		case "topSectionImgBlackPink":
			flag = waitForElementVisibility(topSectionImgBlackPink, waitTime);
			break;
		case "AddressLbl":
			flag = waitForElementVisibility(AddressLbl, waitTime);
			break;
		case "rBtb_House":
			flag = waitForElementVisibility(rBtb_House, waitTime);
			break;
		case "rBtn_condominium":
			flag = waitForElementVisibility(rBtn_condominium, waitTime);
			break;
		case "topSectionImgBottle":
			flag = waitForElementVisibility(topSectionImgBottle, waitTime);
			break;
		case "topSectionImgSanitizer":
			flag = waitForElementVisibility(topSectionImgSanitizer, waitTime);
			break;
		case "btnPay":
			flag = waitForElementVisibility(btnPay, waitTime);
			break;
		case "btnPay_Android":
			flag = waitForElementVisibility(btnPay_Android, waitTime);
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

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public String getText(String ele) throws Exception {
		String text = "";

		try {
			switch (ele) {
			case "topSectionProductName":
				text = DriverManager.getDriver().findElement(topSectionProductName).getText();
				break;
			case "topSectionPrice":
				text = DriverManager.getDriver().findElement(topSectionPrice).getText();
				break;
			case "errRecipientMobile":
				text = DriverManager.getDriver().findElement(errRecipientMobile).getText();
				break;
			case "txtdeliveryCaveat_1":
				text = DriverManager.getDriver().findElement(txtdeliveryCaveat_1).getText();
				break;
			case "txtdeliveryCaveat_2":
				text = DriverManager.getDriver().findElement(txtdeliveryCaveat_2).getText();
				break;
			case "firstName":
				text = DriverManager.getDriver().findElement(firstName).getText();
				break;
			case "middleName":
				text = DriverManager.getDriver().findElement(middleName).getText();
				break;
			case "lastName":
				text = DriverManager.getDriver().findElement(lastName).getText();
				break;
			case "email":
				text = DriverManager.getDriver().findElement(email).getText();
				break;
			case "mobileNumber":
				text = DriverManager.getDriver().findElement(mobileNumber).getText();
				break;
			case "houseNo":
				text = DriverManager.getDriver().findElement(houseNo).getText();
				break;
			case "street":
				text = DriverManager.getDriver().findElement(street).getText();
				break;
			case "village_subDivision":
				text = DriverManager.getDriver().findElement(village_subDivision).getText();
				break;
			case "drpdwnProvince":
				text = DriverManager.getDriver().findElement(drpdwnProvince).getText();
				break;
			case "drpdwnCity":
				text = DriverManager.getDriver().findElement(drpdwnCity).getText();
				break;
			case "drpdwnBarangay":
				text = DriverManager.getDriver().findElement(drpdwnBarangay).getText();
				break;
			case "zipCode":
				text = DriverManager.getDriver().findElement(zipCode).getText();
				break;
			case "specialInstruction":
				text = DriverManager.getDriver().findElement(specialInstruction).getText();
				break;
			}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
			Generic.WriteTestData("Check visibility of locator '"+ele+"' in Page ",ele,"","'"+ele+"' should be visible on the Application","'"+ele+"' is visbile on the page","Passed");
		} catch (Exception e1) {
			System.out.println("Method : getText - Error : " + e1.getMessage());
			Generic.WriteTestData("Check visibility of locator '"+ele+"' in Page ",ele,"","'"+ele+"' should be visible on the Application","'"+ele+"' is not visbile on the page","Failed");
		}

		return text;
	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {
			case "reviewBag":
				get_reviewBag().click();
				break;
			case "btnPay":
				get_btnPay().click();
				break;
			case "btnPay_Android":
				get_btnPay_Android().click();
				break;
			case "chkbx_acceptAll":
				get_chkbx_acceptAll().click();
				break;
				
				
			}
		}catch (ElementClickInterceptedException e1) {
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

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public String getAttributeValue(String ele, String attribute) throws Exception {
		String text = "";

		try {
			switch (ele) {
			case "imgGiftOption":
				text = DriverManager.getDriver().findElement(imgGiftOption).getAttribute(attribute);
				break;
			case "imgnextDayDelivery":
				text = DriverManager.getDriver().findElement(imgnextDayDelivery).getAttribute(attribute);
				break;
			case "mobileNumber":
				text = DriverManager.getDriver().findElement(mobileNumber).getAttribute(attribute);
				break;
				
			case "firstName":
				text = DriverManager.getDriver().findElement(firstName).getAttribute(attribute);
				break;
			case "middleName":
				text = DriverManager.getDriver().findElement(middleName).getAttribute(attribute);
				break;
			case "lastName":
				text = DriverManager.getDriver().findElement(lastName).getAttribute(attribute);
				break;
			case "email":
				text = DriverManager.getDriver().findElement(email).getAttribute(attribute);
				break;
			case "houseNo":
				text = DriverManager.getDriver().findElement(houseNo).getAttribute(attribute);
				break;
			case "street":
				text = DriverManager.getDriver().findElement(street).getAttribute(attribute);
				break;
			case "village_subDivision":
				text = DriverManager.getDriver().findElement(village_subDivision).getAttribute(attribute);
				break;
			case "drpdwnProvince":
				text = DriverManager.getDriver().findElement(drpdwnProvince).getAttribute(attribute);
				break;
			case "drpdwnCity":
				text = DriverManager.getDriver().findElement(drpdwnCity).getAttribute(attribute);
				break;
			case "drpdwnBarangay":
				text = DriverManager.getDriver().findElement(drpdwnBarangay).getAttribute(attribute);
				break;
			case "zipCode":
				text = DriverManager.getDriver().findElement(zipCode).getAttribute(attribute);
				break;
			case "specialInstruction":
				text = DriverManager.getDriver().findElement(specialInstruction).getAttribute(attribute);
				break;
			}
		} catch (NoSuchElementException e1) {			
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e1.getMessage());
			Generic.WriteTestData("Check visibility of locator '"+ele+"' in Page ",attribute,"","'"+ele+"' should be visible on the Application","'"+ele+"' is visbile on the page","Passed");
			
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
			Generic.WriteTestData("Check visibility of locator '"+ele+"' in Page ",attribute,"","'"+ele+"' should be visible on the Application","'"+ele+"' is not visbile on the page","Failed");
		}
		
		return text;
	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public boolean check_AttirbuteNotEmpty(String eleName, String attribute, int waitTime) throws Exception {

		boolean success = false;
		switch (eleName) {
		case "imgGiftOption":
			success = waitForElementAttributeToBeNotEmpty(imgGiftOption, "src", 10);
			break;
		case "imgnextDayDelivery":
			success = waitForElementAttributeToBeNotEmpty(imgnextDayDelivery, "src", 10);
			break;
		}
		if (success) {
			//			ExtentTestManager.logInfo(message + " - exists");
			System.out.println("message +  - exists");
			Generic.WriteTestData("Check visibility of locator '"+eleName+"' in Page ",attribute,"","'"+waitTime+"' should be visible on the Application","'"+eleName+"' is visbile on the page","Passed");
		} else {
			//			ExtentTestManager.logFail(message + " - do not exists");
			Generic.WriteTestData("Check visibility of locator '"+eleName+"' in Page ",attribute,"","'"+waitTime+"' should be visible on the Application","'"+eleName+"' is not visbile on the page","Failed");
			System.out.println("message" + " - do not exist");
			
		}		
		return success;
		
		
	}
	
	public void enterText(String type, String ele, String value) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			switch (ele) {	
		    case "firstName":
			     get_firstName().clear();
			     get_firstName().sendKeys(value);
		    	break;	
		    case "middleName":
			     get_middleName().clear();
			     get_middleName().sendKeys(value);
		    	break;	
		    case "lastName":
			     get_lastName().clear();
			     get_lastName().sendKeys(value);
		    	break;	
		    case "email":
			     get_email().clear();
			     get_email().sendKeys(value);
		    	break;
		    case "recipientName":
			     get_recipientName().clear();
			     get_recipientName().sendKeys(value);
		    	break;		    	
		    case "floor":
		    	get_floor().clear();
		    	get_floor().sendKeys(value);
		    	break;	
		    case "buildingName":
		    	get_buildingName().clear();
		    	get_buildingName().sendKeys(value);
		    	break;
		    case "street":
		    	get_street().clear();
		    	get_street().sendKeys(value);
		    	break; 
		    case "specialInstruction":
		    	get_specialInstruction().clear();
		    	get_specialInstruction().sendKeys(value);
		    	break; 
		    	
			}
			
		}
			catch (ElementClickInterceptedException e1) {
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

//	public void enterText( string ele, Keys tab) {
//		
//		try {
//			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//			switch (ele) {	
//		    case "firstName":
//		    	get_recipientMobile().clear();
//		    	get_recipientMobile().sendKeys(Keys.TAB);
//		    	break;	
//		    	    	
//			}		
//		}
//			catch (ElementClickInterceptedException e1) {
//			System.out.println(type + " : " + Keys.TAB + " : " + "Element is not clickable : " + e1.getMessage());
//			Generic.WriteTestData("Entering Key tab '"+Keys.TAB+"' in '"+Keys.TAB+"' text field",Keys.TAB,"","Unable to identify the '"+Keys.TAB+"' text field","Not able to identify the  '"+Keys.TAB+"' text field","Failed");
//			Assert.assertTrue(false);
//		} catch (NoSuchElementException e2) {
//			System.out.println(Keys.TAB + " : " + Keys.TAB + " : " + "Element not found : " + e2.getMessage());
//			Generic.WriteTestData("Entering text '"+Keys.TAB+"' in '"+Keys.TAB+"' text field",Keys.TAB,"","Unable to identify the '"+Keys.TAB+"' text field","Not able to identify the  '"+Keys.TAB+"' text field","Failed");
//			Assert.assertTrue(false);
//		} catch (Exception e) {
//			System.out.println(Keys.TAB + " : " + Keys.TAB + " : " + "Exception : " + e.getMessage());
//			Generic.WriteTestData("Entering text '"+Keys.TAB+"' in '"+Keys.TAB+"' text field",Keys.TAB,"","Unable to identify the '"+Keys.TAB+"' text field","Not able to identify the  '"+Keys.TAB+"' text field","Failed");
//			Assert.assertTrue(false);
//		}
//		Generic.WriteTestData("Entering text '"+Keys.TAB+"' in '"+Keys.TAB+"' text field",Keys.TAB,"","Should able to enter data'"+Keys.TAB+"' into  '"+Keys.TAB+"' text field","Entered data'"+Keys.TAB+"' into  '"+Keys.TAB+"' text field successfully","Passed");
//		// TODO Auto-generated method stub
//		
//	}
	
	public void js_clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


			switch (ele) {
			case "Pay":
				js.executeScript("arguments[0].click();", get_btnPay());
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
