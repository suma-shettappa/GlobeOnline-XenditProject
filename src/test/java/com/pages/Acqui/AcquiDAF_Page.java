package com.pages.Acqui;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.BasePage;
import junit.framework.Assert;
import utility.Generic;

public class AcquiDAF_Page extends BasePage {
	
	//---- RONNIE SCRIPT ADA5 -----
	By ODA_Img = By.xpath("//div[@class='go_snackbar-icon']");
	By ODA_Header = By.xpath("//div[contains(text(), 'Your address is out of our delivery area')]");
	By ODA_Spiel = By.xpath("//div[contains(text(), 'Please provide a different address.')]");
	
	By OB_Img = By.xpath("//div[@class='go_notif-message-block-icon']");
	By OB_Header = By.xpath("//div[contains(text(), 'Pay the amount shown in the breakdown')]");
	By OB_Spiel = By.xpath("//span[contains(text(), 'Before we can add an additional postpaid line, please pay the amount shown in the ')]");
	By OB_ViewBreakdown = By.xpath("//a[contains(text(), 'View breakdown')]");
	
	By OBModal_Close = By.xpath("//img[contains(@src, 'cross')]");
	By OBModal_HeresBreakdown = By.xpath("//span[contains(text(), 's the breakdown: ')]");
	By OBModal_OBHeader = By.xpath("//div[contains(text(), 'Overdue Balance')]");
	By OBModal_OBPrice = By.xpath("//div[@class='ob-price-section']");
	By OBModal_OBMsg = By.xpath("//span[contains(text(), 'This is the amount from all your unpaid billing statements.')]");
	By OBModal_OBMobileNum = By.xpath("//div[@class='left-content-item']/span");
	By OBModal_OBMobileNum_Price = By.xpath("//div[@class='right-content-item']/span");
	By OBModal_OBSubTotal = By.xpath("//div[@class='d-flex flex-row overdue-bal-total-amt']/span");
	By OBModal_OBOverallTotal = By.xpath("//div[contains(@class, 'breakdown-container-total-amt')]/span");

	By AlternativeDeliveryInstruction = By.xpath("//input[@placeholder='Special delivery instructions']");
	
	//----- RONNIE SCRIPT ENDS HERE ------

	By AddressLbl = By.xpath("//span[text()='Address']");
	By rBtb_House = By.xpath("//label[text()='House']");
	By rBtn_condominium = By.xpath("//label[text()='Condominium']");
	
	By hdrForm = By.xpath("//h1[text()=' Form ']");
	
	By email = By.xpath("//input[@formcontrolname='email']");
	
	//**************************************************************
	
	
	//*******************************************************
	By rBtn_house = By.xpath("//label[text()='House']");
	By SignalStrengthWarning = By.xpath("//div[contains(@class,'address-sub-section-flex-content')]/span");
	By street = By.xpath("//input[@formcontrolname='street']");
	By village_subDivision = By.xpath("//input[@placeholder='Village / Subdivision']");
	
	By subDivision = By.xpath("//input[@formcontrolname='subDivision']");
	By floor = By.xpath("//input[@formcontrolname='floor']");
	By buildingName = By.xpath("//input[@formcontrolname='buildingName']");
	By drpdwnProvince = By.xpath("//select[@formcontrolname='province']");
	By drpdwnCity = By.xpath("//select[@formcontrolname='city']");
	By drpdwnBarangay = By.xpath("//select[@formcontrolname='barangay']");
	By chkbx_acceptAll = By.xpath("//input[@formcontrolname='all']");
	By btnPay = By.xpath("//button[contains(@class,'btn-primary-custom pay-button')][1]");
	By topSectionImgXPW = By.xpath("//div[@class='top-section'] //img[@alt='Xtreme Home Prepaid WiFi']");
	By topSectionImgGHPW = By.xpath("//div[@class='top-section'] //img[@alt='Globe At Home Prepaid WiFi']");
	By topSectionImgBlackPink = By.xpath("//div[@class='top-section'] //img[@alt='Blackpink LTE Advanced with TP Link']");

	By topSectionProductName = By.xpath("//div[@class='top-section'] //div[@class='prepaid-text']/span");
	By topSectionPrice = By.xpath("//div[@class='top-section'] //div[@class='prepaid-cost']/span");
	By btnReviewBag = By.xpath("//button[text()=' Review my bag ']");
	By PersonalInformation = By.xpath("//span[normalize-space(text())='Personal information']");
	
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	//ASMA$x("//div[text()='Personal information']"
	By journeyDAF=By.xpath("//div[text()='Personal information']");
	By journeyDAF2=By.xpath("//div[text()='Delivery information']");
	
	By Suffix=By.xpath("//select[@formcontrolname='suffix']");
	By motherfirst_name1=By.xpath("//input[@formcontrolname='mothersFirstName']");
	By mothers_middlename=By.xpath("//input[@formcontrolname='mothersMiddleName']");
	By mothers_lastname=By.xpath("//input[@formcontrolname='mothersLastName']");

	By journeystastus1=By.xpath("//li[@class='go_stepper-progress-item go_active ng-star-inserted']");
	By planname=By.xpath("//div[@class='go_highlighted']");
			//div[text()='GPlan 599 with Device']");
	By planenamevalue=By.xpath("//div[@class='go_text-form-base-alt go_selected-plan-note ng-star-inserted']");
	By Billingaddressinfo=By.xpath("//span[text()='Billing address']");
	By Dob=By.xpath("//input[@id='dateOfBirth']");
	By NextDeliinfo=By.xpath("//button[@class='go_btn go_with-arrow go_text-base-action']");
	By NextUplodoc=By.xpath("//button[@class='go_btn go_with-arrow go_text-base-action']");
	By Toggledbtn=By.xpath("//span[@class='slider round']");
	
	
	By Dropdown1=By.xpath("//select[@id='poidDocIDType']");
	By Dropdown2=By.xpath("//select[@id='pofcDocIDType']");
	
	By ChooseFile1=By.xpath("//input[@id='poidDocRef']");
	//following-sibling::label");
	
	By ChooseFile2=By.xpath("//input[@id='poidBackDocRef']");
	//following-sibling::label");
	
	By ChooseFile3=By.xpath("//input[@id='pofcDocRef']");
	//following-sibling::label");
			
	
	
	
	
	//####################################################################################		

	By imgGiftOption = By.xpath("//div[@formgroupname='giftOption'] //img");
	By toggleGiftOption = By.xpath("//div[@formgroupname='giftOption'] //span[@class='slider round']");
	By recipientName = By.xpath("//input[@formcontrolname='recipientName']");
	By recipientMobile = By.xpath("//input[@formcontrolname='recipientMobile']");
	By errRecipientMobile = By.xpath("//input[@formcontrolname='recipientMobile'] /../following-sibling::div/span");
	By zipCode = By.xpath("//input[@formcontrolname='zipCode']");
	By imgSameDayDelivery = By.xpath("//input[@formcontrolname='isSameDay']/../../img");
	By txtdeliveryCaveat_1 = By.xpath("//div[contains(@class,'delivery-msg-block')]/div[1]");
	By txtdeliveryCaveat_2 = By.xpath("//div[contains(@class,'delivery-msg-block')]/div[2]/p");
	By chkbxTermsConditions = By.xpath("//div[@class='terms-and-condition-wrapper'] // input[@type='checkbox']");
	By get_chkbxLabelTermsConditions = By.xpath("//div[@class='terms-and-condition-wrapper'] // input[@type='checkbox']/../../following-sibling::div //span[1]");
    By label_accept_all_terms = By.xpath("//label[text()=' I accept all Terms and Conditions. ']");
	By btnagree=By.xpath("//button[text()='Agree']");
	
	
	

	
	
	By specialInstruction = By.xpath("//input[@formcontrolname='instruction']");
	By DeliveryInfoCTA=By.xpath("//button[text()=' Next : Delivery information ']");
	
	//Ordertracker
	By submitdocument=By.xpath("//div[text()=' Send Document ']");
	By BtnNextUploadDocs=By.xpath("//button[text()=' Next: upload documents ']");
	
	
	//Change
	
	By Mandatory_Fname = By.xpath("(//label[contains(text(), 'First Name')]/span[contains(text(), '*')])[1]");
	By Mandatory_Mname = By.xpath("(//label[contains(text(), 'Middle Name')]/span[contains(text(), '*')])[1]");
	By Mandatory_LName = By.xpath("//label[contains(text(), 'Last Name')]/span[contains(text(), '*')]");
	By Mandatory_Email = By.xpath("//label[contains(text(), 'Email Address')]/span[contains(text(), '*')]");
	By Mandatory_Birthday = By.xpath("//label[contains(text(), 'Birthday')]//span[contains(text(), '*')]");
	By Mandatory_MFName = By.xpath("//label[contains(text(), 's First Name ')]//span[contains(text(), '*')]");
	By Mandatory_MMName = By.xpath("//label[contains(text(), 'Maiden Middle Name ')]//span[contains(text(), '*')]");
	By Mandatory_MLName = By.xpath("//label[contains(text(), 'Maiden Last Name ')]//span[contains(text(), '*')]");
	By Mandatory_House = By.xpath("//label[contains(text(), 'House ')]//span[contains(text(), '*')]");
	By Mandatory_Street = By.xpath("//label[contains(text(), 'Street')]//span[contains(text(), '*')]");
	By Mandatory_Province = By.xpath("//label[contains(text(), 'Province')]//span[contains(text(), '*')]");
	By Mandatory_City = By.xpath("//label[contains(text(), 'City')]//span[contains(text(), '*')]");
	By Mandatory_Brgy = By.xpath("//label[contains(text(), 'Barangay')]//span[contains(text(), '*')]");
	By Mandatory_zip = By.xpath("//label[contains(text(), 'ZIP')]//span[contains(text(), '*')]");
	
	By personalInformation = By.xpath("//h1[text()=' Acquisition - Personal Information ']");
	By confirmDetails = By.xpath("//span[text()='Confirm details']");
	By firstName = By.xpath("//input[@placeholder='First Name']");
	By middleName = By.xpath("//input[@placeholder='Middle Name']");
	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By mobileNumber = By.xpath("//input[@placeholder='Mobile Number']");
	By emailAddress = By.xpath("//input[@placeholder='Email Address']");
	By birthday = By.xpath("//input[@placeholder='Birthday']");
	By motherFirstName = By.xpath("//label[contains(text(), 's First Name ')]//parent::div//input");
	By motherMaidenMiddleName = By.xpath("//label[contains(text(), 's Maiden Middle Name ')]//parent::div//input");
	By motherMaidenLastName = By.xpath("//label[contains(text(), 's Maiden Last Name ')]//parent::div//input");
	
	By billingAddress = By.xpath("//span[text()='Billing address']");
	By house = By.xpath("//label[text()='House']//parent::div//input[@type='radio']");
	By condominium = By.xpath("//label[text()='Condominium']//parent::div//input[@type='radio']");
	By houseNo = By.xpath("//input[@placeholder='House no.']");
	By Street = By.xpath("//input[@placeholder='Street']");
	By Village = By.xpath("//input[@placeholder='Village / Subdivision']");
	By province = By.xpath("//select[@formcontrolname='province']");
	By city = By.xpath("//select[@formcontrolname='city']");
	By barangay = By.xpath("//select[@formcontrolname='barangay']");
	By ZIPcode = By.xpath("//input[@formcontrolname='zipCode']");
	By NextDeliveryInformation = By.xpath("//button[text()=' Next : Delivery information ']");
	
	By AcquisitionDeliveryInformation = By.xpath("//h1[text()=' Acquisition - Delivery Information  ']| //h1[contains(text(),' Delivery Information  ')]");
	By remainder = By.xpath("//span[contains(text(), 'Delivery for pre-orders and reservations is subject to device availability')]");
	By shippingAddressIsSameAsBilling = By.xpath("//span[text()='My shipping address is the same as my billing address.']");
	By slider = By.xpath("//span[@class='slider round']");
	
	By alternateAndRecipient = By.xpath("//span[text()='Alternate recipient and contact details (optional)']");
	By RecipentFname=By.xpath("//input[@formcontrolname='firstName']");
	By RecipentMname=By.xpath("//input[@formcontrolname='middleName']");
	By RecipentLname=By.xpath("//input[@formcontrolname='lastName']");
	By RecipentMobileno=By.xpath("//input[@formcontrolname='altMobile']");
	By NextUploadDoc=By.xpath("//button[@class='go_btn go_with-arrow go_text-base-action']");
	
	By AcquisitionUploadDocuments = By.xpath("//h1[text()=' Acquisition - Upload Documents ']");
	By ProofOfIdentification = By.xpath("//div[text()='Proof of Identification']");
	By ProofOfFinancialCapacity = By.xpath("//div[text()='Proof of Financial Capacity']");
	By POIDDropdown=By.xpath("//select[@id='poidDocIDType']");
	By POFCDropdown=By.xpath("//select[@id='pofcDocIDType']");
    By acceptAllTerms = By.xpath("//label[text()=' I accept all Terms and Conditions. ']");
	By btnAgree=By.xpath("//button[text()='Agree']");
	By btnNext=By.xpath("//button[@id='submit-document-btn']");
	By personalInformationHeader = By.xpath("//h1[text()=' Personal Information ']");
	By personalInfoFieldsRequired = By.xpath("(//div[text()=' Fields are required'])[1]");
	By billingAddressFieldsRequired = By.xpath("(//div[text()=' Fields are required'])[2]");
	By removedSpecialCharForPersonalInfo = By.xpath("(//span[normalize-space(text())='Personal information']//following::div[normalize-space(text())='Note: Removed special characters from the auto-filled fields.'])[1]");
	By removedSpecialCharForBillingAdd = By.xpath("(//span[normalize-space(text())='Billing address']//following::div[normalize-space(text())='Note: Removed special characters from the auto-filled fields.'])[1]");


	
		
	  //Dupliicity xpath
	 By DuplicateOrder = By.xpath("//h1[contains(text(), ' Duplicate Order ')]");
	 By PlanApplication = By.xpath("//div[contains(text(), ' Hi , your plan application is in the works! ')]");
	 By DuplicateConfirm = By.xpath("//span[@class='duplicate-confirm']");
	 
	 
	 
	
	By shippingaddress=By.xpath("//span[contains(text(),'Shipping address ')]");
	By Recipentaddress=By.xpath("//span[contains(text(),'Alternate recipient and contact details ')]");
	
	
	By ODAheader=By.xpath("//div[@class='go_snackbar-title go_text-preamble-small']");
	By ODAspiel=By.xpath("//div[@class='go_snackbar-description go_text-preamble-small-semibold']");
	By sliderround=By.xpath("//span[@class='slider round']");

	By Upload_different=By.xpath("//label[contains(text(), ' Upload a different file ')]");	
	By rBtn_condo = By.xpath("//label[text()='Condominium']");
	By Gender = By.xpath("//select[@formcontrolname='gender']");

	By Document_id = By.xpath("//input[@id='floatingInput']");
	public void select_Gender(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(Gender));
		s.selectByValue(option);
	}

	/*******************************************************************************/
	public WebElement get_BtnNextUploadDocs()
	{
		return DriverManager.getDriver().findElement(BtnNextUploadDocs);
		
	}
	public WebElement get_Document_id() {
		return DriverManager.getDriver().findElement(Document_id);
	}
	public WebElement get_submitdocument()
	{
		return DriverManager.getDriver().findElement(submitdocument);
	}
	/********************************************************************************************************************************/
	public WebElement get_Suffix() {
		return DriverManager.getDriver().findElement(Suffix);
	}

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
	//ASMA************************************//
	public WebElement get_dob()
	{
		return DriverManager.getDriver().findElement(Dob);
		
	}
	public WebElement get_mothersfirstname()
	{
		return DriverManager.getDriver().findElement(motherfirst_name1);
		
	}
	public WebElement get_mothersmiddlename()
	{
		return DriverManager.getDriver().findElement(mothers_middlename);
		
	}
	public WebElement get_motherslastname()
	{
		return DriverManager.getDriver().findElement(mothers_lastname);
	}
	public WebElement get_RecipentFname()
	{
		return DriverManager.getDriver().findElement(RecipentFname);
		
	}
	public WebElement get_RecipentMname()
	{
		return DriverManager.getDriver().findElement(RecipentMname);
	}
	public WebElement get_RecipentLname()
	{
		return DriverManager.getDriver().findElement(RecipentLname);
		
	}
	public WebElement get_RecipentMobileno()
	{
		return DriverManager.getDriver().findElement(RecipentMobileno);
		
	}
	public WebElement get_nextUploaddoc()
	{
		return DriverManager.getDriver().findElement(NextUplodoc);
		
	}


	/********************************************************************************************************************************/
	public WebElement get_condominium() {
		return DriverManager.getDriver().findElement(rBtn_condominium);
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
		return DriverManager.getDriver().findElement(village_subDivision);
	}
	
	// asma******************************************
	public void  Select_Suffix(String option)
	{
		Select s=new Select(DriverManager.getDriver().findElement(Suffix));
		s.selectByValue(option);
	}
	/**
	 * @return *******************************************************************/
	public WebElement Togglebtn_select()
	{
		return DriverManager.getDriver().findElement(Toggledbtn);
		
		
	}
	/**************************************************/
	
	/***ASMA
	 * @throws Exception *****************************************************************/
	public void Select_dropdown(String option) throws Exception
	{
		try {
			Select s = new Select(DriverManager.getDriver().findElement(Dropdown1));
			s.selectByValue(option);
			Generic.WriteTestData("Selecting '"+option+"' in id type dropdown field",option,option,"Should able to select'"+option+"' in id type drop down field","Selected '"+option+"' in id type drop down field successfully","Passed");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Generic.WriteTestData("Selecting '"+option+"' in id type dropdown field",option,option,"Should able to select'"+option+"' in id type drop down field","Selecting '"+option+"' in id type drop down field was  unsuccessfull","Failed");
		}
		
	} 
	/********************************************************************/
	public boolean DropDownDisplay1()
	{
		return DriverManager.getDriver().findElement(Dropdown1).isDisplayed();
		
	}
	/****************************************************************/
	public boolean DropDownDisplay2()
	{
		return DriverManager.getDriver().findElement(Dropdown2).isDisplayed();
		
	}
	/**
	 * @throws Exception *****************************************************************/
	public void Select_dropdown2(String option) throws Exception
	{
		try {
			Select s = new Select(DriverManager.getDriver().findElement(Dropdown2));
			s.selectByValue(option);
			Generic.WriteTestData("Selecting '"+option+"' in POFC type dropdown field",option,option,"Should able to select'"+option+"' in POFC drop down field","Selected '"+option+"' in POFC drop down field successfully","Passed");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Generic.WriteTestData("Selecting '"+option+"' in POFC type dropdown field",option,option,"Should able to select'"+option+"' in POFC drop down field","Selecting '"+option+"' in POFC drop down field was unsuccessfull","Failed");
		}
		

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
	public WebElement get_nextdelivery()
	{
		return DriverManager.getDriver().findElement(NextDeliinfo);
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

	/********************************************************************************************************************************/
	public WebElement get_btnagree()
	{
		return DriverManager.getDriver().findElement(btnagree);
		
		
	}
	
	/********************************************************************************************************************************/

	public WebElement get_DeliveryInfoCTA() {
		return DriverManager.getDriver().findElement(NextDeliinfo);
	}
	/*******************************************************************************/
	public WebElement get_next()
	{
		return DriverManager.getDriver().findElement(btnNext);
		
	}
	/*********************************************************************************/
	public WebElement Choosefile2Click()
	{
		return DriverManager.getDriver().findElement(ChooseFile2);
		
	}
	/****************************************************************/
	public WebElement Choosefile3Click()
	{
		return DriverManager.getDriver().findElement(ChooseFile3);
		
	}
	/*********************************************************************/
	
	//Change
	
	
	/********************************************************************************************************************************/
	public WebElement get_mobileNumber() {
		return DriverManager.getDriver().findElement(mobileNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_emailAddress() {
		return DriverManager.getDriver().findElement(emailAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_birthday() {
		return DriverManager.getDriver().findElement(birthday);
	}

	/********************************************************************************************************************************/
	public WebElement get_motherFirstName() {
		return DriverManager.getDriver().findElement(motherFirstName);
	}

	/********************************************************************************************************************************/
	public WebElement get_motherMaidenMiddleName() {
		return DriverManager.getDriver().findElement(motherMaidenMiddleName);
	}

	/********************************************************************************************************************************/
	public WebElement get_motherMaidenLastName() {
		return DriverManager.getDriver().findElement(motherMaidenLastName);
	}

	/********************************************************************************************************************************/
	public WebElement get_ZIPcode() {
		return DriverManager.getDriver().findElement(ZIPcode);
	}

	/********************************************************************************************************************************/
	public WebElement get_houseNo() {
		return DriverManager.getDriver().findElement(houseNo);
	}

	/********************************************************************************************************************************/
	public WebElement get_Street() {
		return DriverManager.getDriver().findElement(Street);
	}
	/********************************************************************************************************************************/
	public WebElement get_Village() {
		return DriverManager.getDriver().findElement(Village);
	}

	/********************************************************************************************************************************/
	public WebElement get_NextDeliveryInformation() {
		return DriverManager.getDriver().findElement(NextDeliveryInformation);
	}
	/********************************************************************************************************************************/
	public WebElement get_slider() {
		return DriverManager.getDriver().findElement(slider);
	}
	/********************************************************************************************************************************/
	public WebElement get_NextUploadDoc() {
		return DriverManager.getDriver().findElement(NextUploadDoc);
	}
	/********************************************************************************************************************************/
	public void Select_POIDDropdown(String option)
	{
		Select s = new Select(DriverManager.getDriver().findElement(POIDDropdown));
		s.selectByValue(option);
	} 
	/********************************************************************************************************************************/	
	public void Select_POFCDropdown(String option)
	{
		Select s = new Select(DriverManager.getDriver().findElement(POFCDropdown));
		s.selectByValue(option);
	} 
	/********************************************************************************************************************************/
	public WebElement get_acceptAllTerms() {
		return DriverManager.getDriver().findElement(acceptAllTerms);
	}
	/********************************************************************************************************************************/
	public WebElement get_btnAgree() {
		return DriverManager.getDriver().findElement(btnAgree);
	}
	/********************************************************************************************************************************/
	public WebElement get_btnNext() {
		return DriverManager.getDriver().findElement(btnNext);
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
	public WebElement get_Upload_different() {
		return DriverManager.getDriver().findElement(Upload_different);
	}
	/********************************************************************************************************************************/
	public WebElement get_sliderround() {
		return DriverManager.getDriver().findElement(sliderround);
	}

	/********************************************************************************************************************************/
	
	public WebElement get_ODAheader() {
		return DriverManager.getDriver().findElement(ODAheader);
	}
	/********************************************************************************************************************************/
	public WebElement get_ODAspiel() {
		return DriverManager.getDriver().findElement(ODAspiel);
	}

	
	
	/*********************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "rBtn_condominium":
			flag = waitForElementClickable(rBtn_condominium, waitTime);
			break;
		case "btnNext":
			flag = waitForElementClickable(btnNext, waitTime);
			break;
		case "Pay":
			flag = waitForElementClickable(btnPay, waitTime);
			break;
		case "reviewBag":
			flag = waitForElementClickable(btnReviewBag, waitTime);
			break;
		case "toggleGiftOption":
			flag = waitForElementClickable(toggleGiftOption, waitTime);
			break;
		case "DeliveryInfoCTA":
			flag=waitForElementClickable(DeliveryInfoCTA, waitTime);
			break;
		case "NextDeliinfo":
			flag=waitForElementClickable(NextDeliinfo, waitTime);
			break;
		case "NextUplodoc":
			flag=waitForElementClickable(NextUplodoc, waitTime);
			break;
		case "ChooseFile1":
			flag=waitForElementClickable(ChooseFile1, waitTime);
			break;
		case "ChooseFile2":
			flag=waitForElementClickable(ChooseFile2, waitTime);
			break;
		case "ChooseFile3":
			flag=waitForElementClickable(ChooseFile3, waitTime);
			break;
		case "DuplicateOrder":
			flag = waitForElementClickable(DuplicateOrder, waitTime);
			break;
		case "PlanApplication":
			flag = waitForElementClickable(PlanApplication, waitTime);
			break;
		case "DuplicateConfirm":
			flag = waitForElementClickable(DuplicateConfirm, waitTime);
			break;
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
	
	/**************************************************************************************************/
	
	//----- RONNIE SCRIPT STARTS HERE -----
	/********************************************************************************************************************************/
	public WebElement OB_ViewBreakdown() {
		return DriverManager.getDriver().findElement(OB_ViewBreakdown);
	}
	/********************************************************************************************************************************/
	public WebElement get_OBModal_Close() {
		return DriverManager.getDriver().findElement(OBModal_Close);
	}
	/********************************************************************************************************************************/
	public WebElement get_OBModal_OBPrice() {
		return DriverManager.getDriver().findElement(OBModal_OBPrice);
	}
	public WebElement get_AlternativeDeliveryInstruction() {
		return DriverManager.getDriver().findElement(AlternativeDeliveryInstruction);
	}
	
	public void enterText(String type, String ele, String value) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

			
			switch (ele) {	
			 case "mothersfirstname":
				 get_mothersfirstname().clear();
				 get_mothersfirstname().sendKeys(value);;
				break;
			 case "mothersmiddlename":
				 get_mothersmiddlename().clear();
				 get_mothersmiddlename().sendKeys(value);;
				break;
			 case "motherslastname":
				 get_motherslastname().clear();
				 get_motherslastname().sendKeys(value);;
				break;
			 case "email":
				 get_email().clear();
				 get_email().sendKeys(value);;
				break;
			 case "floor":
				 get_floor().clear();
				 get_floor().sendKeys(value);;
				break;
			 case "buildingName":
				 get_buildingName().clear();
				 get_buildingName().sendKeys(value);;
				break;
			 case "street":
				 get_street().clear();
				 get_street().sendKeys(value);;
				break;
			 case "house":
				 get_house().clear();
				 get_house().sendKeys(value);;
				break;
			 case "subDivision":
				 get_subDivision().clear();
				 get_subDivision().sendKeys(value);;
				break;
			 case "Document_id":
				 get_Document_id().clear();
				 get_Document_id().sendKeys(value);;
				break;
			 case "firstName":
				 get_firstName().clear();
				 get_firstName().sendKeys(value);;
				break;
			 case "middleName":
				 get_middleName().clear();
				 get_middleName().sendKeys(value);;
				break;
			 case "lastName":
				 get_lastName().clear();
				 get_lastName().sendKeys(value);;
				break;
			 case "dob":
				 get_dob().clear();
				 get_dob().sendKeys(value);;
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
	
	//----- RONNIE SCRIPT ENDS HERE -----
	
	/**
	 * @throws Exception ******************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;
		switch (element) {
		
		//---- RONNIE SCRIPT ADA5 -----
		case "ODA_Img":
			flag = waitForElementVisibility(ODA_Img, waitTime);
			break;
		case "ODA_Header":
			flag = waitForElementVisibility(ODA_Header, waitTime);
			break;
		case "ODA_Spiel":
			flag = waitForElementVisibility(ODA_Spiel, waitTime);
			break;
		
		case "OB_Img":
			flag = waitForElementVisibility(OB_Img, waitTime);
			break;
		case "OB_Header":
			flag = waitForElementVisibility(OB_Header, waitTime);
			break;
		case "OB_Spiel":
			flag = waitForElementVisibility(OB_Spiel, waitTime);
			break;
		case "OB_ViewBreakdown":
			flag = waitForElementVisibility(OB_ViewBreakdown, waitTime);
			break;
		case "OBModal_Close":
			flag = waitForElementVisibility(OBModal_Close, waitTime);
			break;
		case "OBModal_HeresBreakdown":
			flag = waitForElementVisibility(OBModal_HeresBreakdown, waitTime);
			break;
		case "OBModal_OBHeader":
			flag = waitForElementVisibility(OBModal_OBHeader, waitTime);
			break;
		case "OBModal_OBPrice":
			flag = waitForElementVisibility(OBModal_OBPrice, waitTime);
			break;
		case "OBModal_OBMsg":
			flag = waitForElementVisibility(OBModal_OBMsg, waitTime);
			break;
		case "OBModal_OBMobileNum":
			flag = waitForElementVisibility(OBModal_OBMobileNum, waitTime);
			break;
		case "OBModal_OBMobileNum_Price":
			flag = waitForElementVisibility(OBModal_OBMobileNum_Price, waitTime);
			break;
		case "OBModal_OBSubTotal":
			flag = waitForElementVisibility(OBModal_OBSubTotal, waitTime);
			break;
		case "OBModal_OBOverallTotal":
			flag = waitForElementVisibility(OBModal_OBOverallTotal, waitTime);
			break;
		
		//----- RONNIE SCRIPT END HERE ------
		
		
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
		case "PersonalInformation":
			flag = waitForElementVisibility(PersonalInformation, waitTime);
			break;
			//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&ASMA
		case "journeyDAF":
			flag = waitForElementVisibility(journeyDAF, waitTime);
			break;
		case "journeyDAF2":
			flag = waitForElementVisibility(journeyDAF2, waitTime);
			break;
		case "journeystastus1":
			flag = waitForElementVisibility(journeystastus1, waitTime);
			break;
			
		case "planname":
			flag = waitForElementVisibility(planname, waitTime);
			break;
		case "Billingaddressinfo":
			flag = waitForElementVisibility(Billingaddressinfo, waitTime);
			break;
		case "NextUplodoc":
			flag = waitForElementVisibility(NextUplodoc, waitTime);
			break;
		case "Dropdown1":
			flag = waitForElementVisibility(Dropdown1, waitTime);
			break;
		case "Dropdown2":
			flag = waitForElementVisibility(Dropdown2, waitTime);
			break;
		case "personalInformationHeader":
			flag = waitForElementVisibility(personalInformationHeader, waitTime);
			break;
		case "removedSpecialCharForPersonalInfo":
			flag = waitForElementVisibility(removedSpecialCharForPersonalInfo, waitTime);
			break;
		case "removedSpecialCharForBillingAdd":
			flag = waitForElementVisibility(removedSpecialCharForBillingAdd, waitTime);
			break;
			
			
			
			

		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
			
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
		case "Mandatory_Fname":
			flag = waitForElementVisibility(Mandatory_Fname, waitTime);
			break;
		case "Mandatory_Mname":
			flag = waitForElementVisibility(Mandatory_Mname, waitTime);
			break;
		case "Mandatory_LName":
			flag = waitForElementVisibility(Mandatory_LName, waitTime);
			break;
		case "Mandatory_Email":
			flag = waitForElementVisibility(Mandatory_Email, waitTime);
			break;
		case "Mandatory_Birthday":
			flag = waitForElementVisibility(Mandatory_Birthday, waitTime);
			break;
		case "Mandatory_MFName":
			flag = waitForElementVisibility(Mandatory_MFName, waitTime);
			break;
		case "Mandatory_MMName":
			flag = waitForElementVisibility(Mandatory_MMName, waitTime);
			break;
		case "Mandatory_MLName":
			flag = waitForElementVisibility(Mandatory_MLName, waitTime);
			break;
		case "Mandatory_House":
			flag = waitForElementVisibility(Mandatory_House, waitTime);
			break;
		case "Mandatory_Street":
			flag = waitForElementVisibility(Mandatory_Street, waitTime);
			break;
		case "Mandatory_Province":
			flag = waitForElementVisibility(Mandatory_Province, waitTime);
			break;
		case "Mandatory_City":
			flag = waitForElementVisibility(Mandatory_City, waitTime);
			break;
		case "Mandatory_Brgy":
			flag = waitForElementVisibility(Mandatory_Brgy, waitTime);
			break;
		case "Mandatory_zip":
			flag = waitForElementVisibility(Mandatory_zip, waitTime);
			break;
		case "DeliveryInfoCTA":
			flag = waitForElementVisibility(DeliveryInfoCTA, waitTime);
			break;
			
			
			//Change
			
		
		case "personalInformation":
			flag = waitForElementVisibility(personalInformation, waitTime);
			break;
		case "confirmDetails":
			flag = waitForElementVisibility(confirmDetails, waitTime);
			break;
		case "firstName":
			flag = waitForElementVisibility(firstName, waitTime);
			break;
		case "middleName":
			flag = waitForElementVisibility(middleName, waitTime);
			break;
		case "lastName":
			flag = waitForElementVisibility(lastName, waitTime);
			break;
		case "birthday":
			flag = waitForElementVisibility(birthday, waitTime);
			break;
		case "emailAddress":
			flag = waitForElementVisibility(emailAddress, waitTime);
			break;
		case "motherFirstName":
			flag = waitForElementVisibility(motherFirstName, waitTime);
			break;
		case "motherMaidenMiddleName":
			flag = waitForElementVisibility(motherMaidenMiddleName, waitTime);
			break;
		case "motherMaidenLastName":
			flag = waitForElementVisibility(motherMaidenLastName, waitTime);
			break;
		case "mobileNumber":
			flag = waitForElementVisibility(mobileNumber, waitTime);
			break;
		case "billingAddress":
			flag = waitForElementVisibility(billingAddress, waitTime);
			break;
		case "house":
			flag = waitForElementVisibility(house, waitTime);
			break;
		case "condominium":
			flag = waitForElementVisibility(condominium, waitTime);
			break;
		case "houseNo":
			flag = waitForElementVisibility(houseNo, waitTime);
			break;
		case "Street":
			flag = waitForElementVisibility(Street, waitTime);
			break;
		case "Village":
			flag = waitForElementVisibility(Village, waitTime);
			break;
		case "province":
			flag = waitForElementVisibility(province, waitTime);
			break;
		case "city":
			flag = waitForElementVisibility(city, waitTime);
			break;
		case "barangay":
			flag = waitForElementVisibility(barangay, waitTime);
			break;
		case "ZIPcode":
			flag = waitForElementVisibility(ZIPcode, waitTime);
			break;
		case "slider":
			flag = waitForElementVisibility(slider, waitTime);
			break;	
		case "NextDeliveryInformation":
			flag = waitForElementVisibility(NextDeliveryInformation, waitTime);
			break;	
		case "remainder":
			flag = waitForElementVisibility(remainder, waitTime);
			break;	
		case "shippingAddressIsSameAsBilling":
			flag = waitForElementVisibility(shippingAddressIsSameAsBilling, waitTime);
			break;	
		case "AcquisitionDeliveryInformation":
			flag = waitForElementVisibility(AcquisitionDeliveryInformation, waitTime);
			break;
		case "alternateAndRecipient":
			flag = waitForElementVisibility(alternateAndRecipient, waitTime);
			break;	
		case "acceptAllTerms":
			flag = waitForElementVisibility(acceptAllTerms, waitTime);
			break;
		case "btnAgree":
			flag = waitForElementVisibility(btnAgree, waitTime);
			break;
		case "btnNext":
			flag = waitForElementVisibility(btnNext, waitTime);
			break;
		case "AcquisitionUploadDocuments":
			flag = waitForElementVisibility(AcquisitionUploadDocuments, waitTime);
			break;
		case "ProofOfIdentification":
			flag = waitForElementVisibility(ProofOfIdentification, waitTime);
			break;
		case "ProofOfFinancialCapacity":
			flag = waitForElementVisibility(ProofOfFinancialCapacity, waitTime);
			break;
		case "POIDDropdown":
			flag = waitForElementVisibility(POIDDropdown, waitTime);
			break;
		case "POFCDropdown":
			flag = waitForElementVisibility(POFCDropdown, waitTime);
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
		case "shippingaddress":
			flag = waitForElementVisibility(shippingaddress, waitTime);
			break;
		case "Recipentaddress":
			flag = waitForElementVisibility(Recipentaddress, waitTime);
			break;
		
		case "Toggledbtn":
			flag = waitForElementVisibility(Toggledbtn, waitTime);
			break;
		case "ODAheader":
			flag = waitForElementVisibility(ODAheader, waitTime);
			break;
		case "ODAspiel":
			flag = waitForElementVisibility(ODAspiel, waitTime);
			break;
		case "sliderround":
			flag = waitForElementVisibility(sliderround, waitTime);
			break;
		case "Upload_different":
			flag = waitForElementVisibility(Upload_different, waitTime);
			break;	
		case "Gender":
			flag = waitForElementVisibility(Gender, waitTime);
			break;
		case "Document_id":
			flag = waitForElementVisibility(Document_id, waitTime);
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
	
	public void js_Upload_different(String type, String eleName, String ele) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            
			
			switch (ele) {
			case "Upload_different":
				js.executeScript("arguments[0].click();", get_Upload_different());
				break;

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
	
	public void js_clickOnElement1(String type, String eleName, String ele) throws Exception {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            
			
			switch (ele) {
			case "sliderround":
				js.executeScript("arguments[0].click();", get_sliderround());
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

	/********************************************************************************************************************************/
	public String getText(String ele) {
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
			case "Suffix":
				text = DriverManager.getDriver().findElement(Suffix).getText();
				break;
			case "motherfirst_name1":
				text = DriverManager.getDriver().findElement(motherfirst_name1).getText();
				break;
			case "mothers_middlename":
				text = DriverManager.getDriver().findElement(mothers_middlename).getText();
				break;
			case "mothers_lastname":
				text = DriverManager.getDriver().findElement(mothers_lastname).getText();
				break;
			case "RecipentFname":
				text = DriverManager.getDriver().findElement(RecipentFname).getText();
				break;
			case "RecipentMname":
				text = DriverManager.getDriver().findElement(RecipentMname).getText();
				break;
			case "RecipentLname":
				text = DriverManager.getDriver().findElement(RecipentLname).getText();
				break;
			case "RecipentMobileno":
				text = DriverManager.getDriver().findElement(RecipentMobileno).getText();
				break;
			}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
		}

		return text;
	}

	/**
	 * @throws Exception **************************************************************/
	public void moveToElement(String element) throws Exception {

		WebElement ele = null;
		
		switch (element) {
		case "ODA_Img":
			ele = DriverManager.getDriver().findElement(ODA_Img);
			break;
		case "Mandatory_Fname":
			ele = DriverManager.getDriver().findElement(Mandatory_Fname);
			break;
		case "Mandatory_House":
			ele = DriverManager.getDriver().findElement(Mandatory_House);
			break;
		}	

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
		Generic.WriteTestData("Hover on '"+element+"'",element,"","Able to Hover on '"+element+"' button.","Hovered on '"+element+"' .","Passed");

	}

	public void js_clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            
			
			switch (ele) {
			case "NextDeliinfo":
				js.executeScript("arguments[0].click();", get_nextdelivery());
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
	
	public void jsClick(String message, String ele) throws Exception {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (ele) {
			case "house":
		         jse.executeScript("arguments[0].click();", get_house());		
		         break;
			case "condominium":
		         jse.executeScript("arguments[0].click();", get_condominium());		
		         break;
			case "NextDeliveryInformation":
		         jse.executeScript("arguments[0].click();", get_NextDeliveryInformation());		
		         break;
			case "slider":
		         jse.executeScript("arguments[0].click();", get_slider());		
		         break;
			case "NextUploadDoc":
		         jse.executeScript("arguments[0].click();", get_NextUploadDoc());		
		         break;
			case "acceptAllTerms":
		         jse.executeScript("arguments[0].click();", get_acceptAllTerms());		
		         break;
			case "btnAgree":
		         jse.executeScript("arguments[0].click();", get_btnAgree());		
		         break;
			case "btnNext":
		         jse.executeScript("arguments[0].click();", get_btnNext());		
		         break;    
			 }
		} catch (ElementClickInterceptedException e1) {
			System.out.println( " : " + ele + " : " + "Element is not clickable : " + e1.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println( " : " + ele + " : " + "Element not found : " + e2.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println( " : " + ele + " : " + "Exception : " + e.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + " : " + ele);	
		Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicked on '"+ele+"' button.","Passed");	
		
	}

	
	
	
	//---- RONNI SCRIPT ADA5 ENDS here-----
	
	
	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {
			// ----- RONNIE SCRIPT ADA5 STARTS HERE -----
			case "OB_ViewBreakdown":
				OB_ViewBreakdown().click();
				break;
			case "OBModal_Close":
				get_OBModal_Close().click();
				break;
			case "OBModal_OBPrice":
				get_OBModal_OBPrice().click();
				break;
			// ----- RONNIE SCRIPT ENDS HERE -----
				
				
			case "reviewBag":
				get_reviewBag().click();
				break;
			case "ChooseFile1":
				Choosefile1Click().click();
				break;
			case "ChooseFile2":
				Choosefile2Click().click();
				break;
			case "ChooseFile3":
				Choosefile3Click().click();
				break;
			case "chboxterms":
				get_label_accept_all_terms().click();
				break;
			case "btnagre":
				get_btnagree().click();
				break;
							
			case "btnnext":
				get_next().click();
				break;
			case "NextUplodoc":
				get_nextUploaddoc().click();
				break;
			case "NextDeliinfo":
				get_nextdelivery().click();
				break;
			case "Toggledbtn":
				Togglebtn_select().click();
				break;
			case "DeliveryInfoCTA":
				get_DeliveryInfoCTA().click();
				break;			
			case "Upload_different":
				get_Upload_different().click();
				break;		
			case "sliderround":
				get_sliderround().click();
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

	/********************************************************************************************************************************/
	public String getAttributeValue(String ele, String attribute) {
		String text = "";

		try {
			switch (ele) {
			case "imgGiftOption":
				text = DriverManager.getDriver().findElement(imgGiftOption).getAttribute(attribute);
				break;
			case "imgSameDayDelivery":
				text = DriverManager.getDriver().findElement(imgSameDayDelivery).getAttribute(attribute);
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
			case "Suffix":
				text = DriverManager.getDriver().findElement(Suffix).getAttribute(attribute);
				break;
			case "motherfirst_name1":
					text = DriverManager.getDriver().findElement(motherfirst_name1).getAttribute(attribute);
					break;
			case "mothers_middlename":
				text = DriverManager.getDriver().findElement(mothers_middlename).getAttribute(attribute);
				break;
			
			case "mothers_lastname":
				text = DriverManager.getDriver().findElement(mothers_lastname).getAttribute(attribute);
				break;
			case "RecipentFname":
				text = DriverManager.getDriver().findElement(RecipentFname).getAttribute(attribute);
				break;
			case "RecipentMname":
					text = DriverManager.getDriver().findElement(RecipentMname).getAttribute(attribute);
					break;
			case "RecipentLname":
				text = DriverManager.getDriver().findElement(RecipentLname).getAttribute(attribute);
				break;
			
			case "RecipentMobileno":
				text = DriverManager.getDriver().findElement(RecipentMobileno).getAttribute(attribute);
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
	public boolean check_AttirbuteNotEmpty(String eleName, String attribute, int waitTime) {

		boolean success = false;

		switch (eleName) {
		case "imgGiftOption":
			success = waitForElementAttributeToBeNotEmpty(imgGiftOption, "src", 10);
			break;
		case "imgSameDayDelivery":
			success = waitForElementAttributeToBeNotEmpty(imgSameDayDelivery, "src", 10);
			break;
		}

		return success;
	}

	public WebElement Choosefile1Click() {
		
		 return DriverManager.getDriver().findElement(ChooseFile1);
	}


}
