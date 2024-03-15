package com.pages.renewal;


//import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class Renewal_PaymentPage extends BasePage {

	//static File file;

	//	public static WebDriverManager.getDriver() DriverManager.getDriver();
	//
	//	public LandingPage(WebDriverManager.getDriver() DriverManager.getDriver()) {
	//		this.DriverManager.getDriver() = DriverManager.getDriver();
	//	}

	By MonthlyPaySpiel = By.xpath("//div[contains(text(), ' No need to pay this today! This will be charged to your first bill. ')]");
	By Selectpaymentmethod = By.xpath("//span[contains(text(),'Select payment method')]");	
	By Gcash = By.xpath("//img[@id='gcash_paylater' or @id='gcash']//following::div[(text()=' GCash ')]");
	By CCStraightpayment = By.xpath("//div[contains(text(),' Credit Card (Straight Payment) ')]");
	By CCHSBC = By.xpath("//div[contains(text(),' Credit Card (Installment For HSBC) ')]");
	By CCBPI = By.xpath("//div[contains(text(),' Credit Card (Installment For BPI) ')]");
	By VisaMastercard = By.xpath("//div[contains(text(),'Visa / MasterCard')]");
	By COD = By.xpath("//div[contains(text(),' Cash On Delivery ')]"); 
	By HSBC = By.xpath("//div[text()='Credit card (Installment For HSBC)']");
	By COD_Statment = By.xpath("//div[@class='heading']");
	By Onetimepayment = By.xpath("//span[@class='one-time-payment']");
	By planApplicationHeader = By.xpath("//div[contains(text(),'Renewal')]");
	By Colapsebutton1 = By.xpath("(//button[@class='accordion-button pre-termination-fee'])");
	By Planname = By.xpath("(//div[@class='fees-type-desc'])[1]");
	By Planamount = By.xpath("(//div[@class='amount ng-star-inserted'])[1]");

	//	Total Amount 
	By TotalAmountHeader = By.xpath("//span[contains(text(),'Total amount')]");
	By TotalAmount = By.xpath("(//div[@class='total-amount-to-pay ampount-2'])[1]");

	//	Promo links
	By Gotapromocodeheader = By.xpath("//span[contains(text(),'Got a promo code?')]");
	By PromoClickhere = By.xpath("//button[contains(text(),' Click Here ')]");
	By ShiptothisaddressHeader = By.xpath("//span[contains(text(),'Ship to this address')]");

	By shipicon = By.xpath("//div[@class='col-3 ship-icon']");
	By shippingAdress = By.xpath("//span[contains(text(),'Ship to this address')]");
	By changeAdress = By.xpath("//span[contains(text(),'Change address')]");

	//	Submit Button
	By Submitbutton = By.xpath("//button[text()=' Submit order ']");
	//button[contains(text(),' Submit order ')]");

	//	Monthly Payment Header
	By Monthlypayment = By.xpath("//div[contains(text(),' Monthly Payment ')]");

	//	No need to pay Notification
	By Noneedtopaythistoday = By.xpath("//div[contains(text(),' No need to pay this today! This will be charged to your bill over the duration of your contract period.')]");

	//	PLAN Name With ADDONS
	By GPlan1799withDevice = By.xpath("//div[contains(text(), 'GPlan 1799 with Device')]");	
	By GPlan599withDevice = By.xpath("//div[contains(text(), 'GPlan 599 with Device')]");	

	By creditCardPage=By.xpath("//span[text()='Credit Card']");
	By Planname1 = By.xpath("(//div[@class='bold fees-type-desc'])[2]");
	By PayPage=By.xpath("//title[text()='Pay']");
	By Addons = By.xpath("//div[contains(text(),' Add-ons ')]");
	By Colapsebutton2 = By.xpath("//button[@class='accordion-button pre-termination-fee collapsed']");
	//(//button[@class='accordion-button pre-termination-fee collapsed'])[2]

	//    Selected Addons
	By pretermination=By.xpath("//span[text()=' Total pre-termination fee ']//following::span[1]");
	
	By myDuo = By.xpath("//span[contains(text(),'MyDuo')]");
	By mysuperduo=By.xpath("//div[text()='MySuperDuo']");
	By AmazonPrime = By.xpath("//div[contains(text(),'Amazon Prime Video')]");
	By Viupremium = By.xpath("//div[contains(text(),'Viu Premium')]");
	By Spotifypremium = By.xpath("//div[text()='Spotify Premium']");
	By EasyRoam = By.xpath("//div[contains(text(),'Easy Roam')]");
	By Gocallid = By.xpath("//div[contains(text(),'GOCALLIDD 199')]");
	By Gsaddsurf = By.xpath("//div[contains(text(),'GS Add Surf 99')]");



	By TotalMonthlybill = By.xpath("//div[@class='total-monthly-amount']");
	By MonthlysvcplusAddons = By.xpath("//div[contains(text(),'Monthly Service fee + add-ons and subcriptions')]");
	By Totalmontlyamount = By.xpath("(//div[@class='total-amount-to-pay ampount-2'])[2]");


	//Gcash
	By Plannamegcash = By.xpath("//div[@class='plan-name ng-star-inserted']");
	By Planamountgcash = By.xpath("(//div[@class='amount bold ng-star-inserted'])[1]");
	By Totalamountpay1 = By.xpath("(//div[@class='total-amount-to-pay ampount-2'])[1]");

	By Planamountgcash2 = By.xpath("(//div[@class='amount bold'])");
	By Plannamegcash2 = By.xpath("(//div[@class='bold fees-type-desc'])[2]");
    By TotalAmountLabel  = By.xpath("//span[@class='go_total-amount go_text-medium_v2 -go_bold -go_label']");

	By textCreditCard = By.xpath("//span[text()='Credit Card']");	
	By cardNumberFrame = By.xpath("//span[@data-encrypted-field='encryptedCardNumber']/iframe");
	By cardNumber = By.xpath("//input[@aria-label='Credit or debit card number']");

	By cardExpiryDateFrame = By.xpath("//span[@data-encrypted-field='encryptedExpiryDate']/iframe");
	By cardExpiryDate = By.xpath("//input[@id='encryptedExpiryDate']");

	By cvvFrame = By.xpath("//span[@data-encrypted-field='encryptedSecurityCode']/iframe");
	By cvv = By.xpath("//input[@id='encryptedSecurityCode']");

	By btnPay_CC = By.xpath("//button[contains(@class,'js-chckt-button--submit')]");
	public By RadioBtnDevicecolor1=By.xpath("(//div[@id='deviceColor'])[1]");
	public By RadioBtnDevicecolor2=By.xpath("(//div[@id='deviceColor'])[2]");



	//    Renewal Scenario 4
	By pay = By.xpath("//li[text()='Pay']");
	By Noneedtopay = By.xpath("//div[text()='No need to pay today!']");
	By YourContactPeriod = By.xpath("(//div[@class='notification-desc'])");
	By PreferUpfront = By.xpath("(//div[@class='notification-condition'])");	

	By RenewalHeading = By.xpath("(//div[@class='summary-heading'])[1]");	

	By planRenewalcollapse1 = By.xpath("(//button[@class='accordion-button pre-termination-fee collapsed'])[1]");
	By RenewalProduct = By.xpath("(//div[@class='bold fees-type-desc'])[1]");	
	By RenewalProductCost = By.xpath("//div[@class='amount bold']");	


	By addons = By.xpath("//div[text()=' Add-ons  ']");
	//	By myDuo = By.xpath("//div[text()=' MyDuo ']");
	By amazonprimeVideo = By.xpath("//div[@class='fees-type-desc' and text()=' Amazon Prime Video ']");
	By ViuPremium = By.xpath("//div[text()=' Viu Premium ']");
	By SpotifyPremiumaddon = By.xpath("//div[text()=' Spotify Premium ']");
	//	By EasyRoam = By.xpath("//div[text()=' Easy Roam ']");
	By GOCALLIDD = By.xpath("//div[text()=' GOCALLIDD 199 ']");
	By GSAdd = By.xpath("//div[text()=' GS Add Surf 99 ']");

	By totaladdons = By.xpath("//div[@class='total-label' and text()=' Total add ons ']");
	By totalMontlybill2 = By.xpath("//span[@class='total-amount']");
	By monthlyservice = By.xpath("//div[text()=' Monthly Service fee + add-ons and subcriptions ']");
	By totalmontlyBillPayment = By.xpath("//div[@class='total-amount-to-pay ampount-2']");

	By payOrder = By.xpath("//button[@id='payOrder']");

	By PayBtn=By.xpath("//button//following::span[contains(text(),'Pay')]");
	/***************************************************************************************/

	By ChargeToBill=By.xpath("//strong[text()='Charge to Bill']");
	By howwouldyouliketopay=By.xpath("//span[text()=' How would you like to pay for your plan with device? ']");
	By chargetobillbutton=By.xpath("//button[text()=' Charge to Bill ']");
	By ontimecashout=By.xpath("//button[text()=' One-time payment ']");

	//By SupportingDocs=By.xpath("//p//em[text()='Supporting document needed.']");
	By ShowBreakdown=By.xpath("//span[text()=' Show breakdown ']");
	//By ShippingFee=By.xpath("//span[text()='Shipping fee']");
	By MonthlyBill=By.xpath("//span[text()=' Monthly bill ']");
	By montlybillvalue=By.xpath("(//div[@class='go_total-bill-header'])//span");
	By viewbreakdown=By.xpath("(//span[text()=' View breakdown '])");
	public By Paying=By.xpath("(//span[text()=' How will you be paying your fees? '])");
	public By SelectDeliveryMethod=By.xpath("//span[text()='Select delivery method']");
	By visamaster=By.xpath("//div[text()='Visa / MasterCard']");
	By gcash=By.xpath("//div[text()='GCash']");
	By hsbc=By.xpath("//div[text()='Credit card (Installment For HSBC)']");
	By bpi=By.xpath("//div[text()='Credit card (Installment For BPI)']");

	By accept=By.xpath("//span[@class='gk-checkbox__checkmark']");
	By SubscDeclarationcrosal=By.xpath("(//button[@class='gk-button gk-btn-xs with-icon-start ng-star-inserted'])[1]");
	By privacycrosal=By.xpath("(//button[@class='gk-button gk-btn-xs with-icon-start ng-star-inserted'])[2]");
	By globespatnercrosal=By.xpath("(//button[@class='gk-button gk-btn-xs with-icon-start ng-star-inserted'])[3]");

	By StandardDelievry=By.xpath("//span[text()='Standard Delivery ']");
	By FlatRate=By.xpath("//span[text()='Flat Rate ']");
	By SubscDeclaration=By.xpath("//span[contains(text(),'Declaration')]");


	By planetype=By.xpath("(//span[text()='GPlan 2499 with GCash'])");
	By planetype2=By.xpath("//span[text()='GPlan 2499 with Device']");

	By planetypewithdevice=By.xpath("//div[text()=' GPlan 2499 with Device ']");
	By planetypeamount=By.xpath("//div[@class='go_sc-rnp-bill__breakdown-item']//span[2]");
	By addon=By.xpath("(//span[text()='Add-ons'])");
	By addonsamount=By.xpath("//div[@class='go_sc-rnp-bill__breakdown-item ng-star-inserted']//span[2]");
	By gsaddsurf=By.xpath("(//span[text()='GS Add Surf 99'])");
	By gsaddamount=By.xpath("//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted']//span[2]");
	By apv=By.xpath("(//span[text()='Amazon Prime Video'])");
	By apvamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[2]//span[2]");
	By viu=By.xpath("(//span[text()='Viu Premium'])");
	By viuamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[3]//span[2]");
	By spotify=By.xpath("//span[text()='Spotify Premium']");
	By spotifymeamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[6]//span[2]");
	By myduo=By.xpath("(//span[text()='MyDuo'])");
	By myduoamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[4]//span[2]");
	By easyroam=By.xpath("(//span[text()='Easy Roam'])");
	By easyroamamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[5]//span[2]");
	By Monthlybill=By.xpath("//span[text()='Monthly bill']");
	By monthlybillamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-footer'])//span[2]");
	By deviceimage=By.xpath("//img[@alt='Apple iPhone 14 Pro']");
	By allaccess=By.xpath("//span[text()='All-access data']");
	By Gowi=By.xpath("//span[text()='GoWifi access']");
	By callText=By.xpath("//span[text()='Call & Text']");
	By contractduration=By.xpath("//span[text()='Contract duration']");
	By inclusion=By.xpath("//span[text()=' Inclusions ']");

	By Konsulta=By.xpath("(//span[text()=' Konsulta MD Free personal subscription '])[1]");
	By Glnsure=By.xpath("(//span[text()=' Glnsure 3-months subscription '])[1]");
	By VIP=By.xpath("(//span[text()=' iQIYI via GlobeOne app 3 months standard VIP access '])[1]");
	By wetv=By.xpath("(//span[text()=' WeTV via GlobeOne app 3 months standard VIP access '])[1]");
	By Kids=By.xpath("(//span[text()=' Da Vinci Kids via Globe One app 1 month Premium Access '])[1]");
	By skillshare=By.xpath("(//span[text()=' SkillShare via Globe One app 1 month Premium Membership '])[1]");
	By addonsubscripation=By.xpath("(//span[text()=' Add-ons and subscriptions '])");

	By GS=By.xpath("(//span[text()=' GS Add Surf 99 '])");
	By APV2=By.xpath("(//span[text()=' Amazon Prime Video '])");
	By VIU2=By.xpath("(//span[text()=' Viu Premium '])");
	By MYDUO2=By.xpath("(//span[text()=' MyDuo '])");
	By EasyRoame=By.xpath("(//span[text()=' Easy Roam '])");
	By spotify2=By.xpath("//span[text()=' Spotify Premium ']");

	By termsconditions=By.xpath("//a[text()='GPlan Terms & Conditions']");
	By privacytext=By.xpath("//a[text()='Privacy Policy of Globe.']");
	By globepatnertext=By.xpath("//p[text()='I allow my personal data to be shared to the Globe Group and with Globe’s Partners for them to market and extend their products and services to me as part of Globe’s ongoing partnerships with them.']");

    By AcceptAllTerms = By.xpath("//span[normalize-space(text())='I accept all Terms & Conditions']");
    By subscriberDeclaration = By.xpath("//span[contains(normalize-space(text()),'Subscribe')]");
    By GlobePrivacyNote = By.xpath("//span[contains(normalize-space(text()),'Globe Privacy Notice')]");
    By SharingWithGlobeGroup = By.xpath("//span[contains(normalize-space(text()),'Sharing with the Globe Group and Globe')]");
    By SuscriberDescription = By.xpath("//p[contains(normalize-space(text()),'I have read and understood, and I agree to the')]");
    By GlobePrivacyDescription = By.xpath("//p[contains(normalize-space(text()),'I understand and agree that any personal data I will provide for the processing of my application, including the sharing of such personal data to any relevant party only for the said purpose, will be processed in accordance with the')]");
    By SharingWithGlobeDescription = By.xpath("//p[contains(normalize-space(text()),'I allow my personal data to be shared to the Globe Group and with Globe’s Partners for them to market and extend their products and services to me as part of Globe’s ongoing partnerships with them.')]");
    By chevron1 = By.xpath("(//i[@class='gk-icon-nav chevron-down-sm'])[1]");
    By chevron2 = By.xpath("(//i[@class='gk-icon-nav chevron-down-sm'])[2]");
    By chevron3 = By.xpath("(//i[@class='gk-icon-nav chevron-down-sm'])[3]");
    By subtext = By.xpath("//div[@class='privacy-notice mt-4']");
    
	By Deliverymethod=By.xpath("//span[text()='Select delivery method']");
	By standeddelivey=By.xpath("//span[text()='Standard Delivery ']");

	By payText = By.xpath("//label[text()='Pay']");
	By howWouldYouLikeToPay = By.xpath("//span[text()=' How would you like to pay for your plan with device? '] | //span[text()=' How would you like to pay for your device? ']");
	By chargeToBill = By.xpath("//button[text()=' Charge to Bill ']");
	By OneTimePayment = By.xpath("//button[text()=' One-time payment ']");
	By installmentIsAvailableOnlyFoSelectCreditCards = By.xpath("//span[text()=' Installment is available only for select credit cards at the moment. Click on \"One-time payment\" to check. ']");
	By supportingDocumentNeeded = By.xpath("//em[text()='Supporting document needed.']");

	By planType = By.xpath("//a[text()=' Change ']//preceding::div[1]");
	
	By ChangeLink = By.xpath("//a[text()=' Change ']");
	By AllAccessData = By.xpath("//span[text()='All-access data']");
	By GoWifiAccess = By.xpath("//span[text()='GoWifi access']");
	By Call_Text = By.xpath("//span[text()='Call & Text']");
	By ContractDuration = By.xpath("//span[text()='Contract duration']");

	By Inclusions  = By.xpath("//span[text()=' Inclusions ']");
	By KonsultaMD = By.xpath("//span[text()=' Free individual subscription to KonsultaMD ']");
	By VIPAccessToiQIYI  = By.xpath("//span[text()=' 3-month VIP Access to iQIYI ']");
	By VIPAccessToWeTV  = By.xpath("//span[text()=' 3-month VIP Access to weTV ']");

	By AddonsAndSubscriptions   = By.xpath("//span[text()=' Add-ons and subscriptions ']");
	By GSAddSurf   = By.xpath("//span[text()=' GS Add Surf 99 ']");
	By AmazonPrimeVideo   = By.xpath("//span[text()=' Amazon Prime Video '] | //span[text()=' Viu Premium '] ");

	By MySuperDuo   = By.xpath("//span[text()=' MySuperDuo ']");


	By ChangeLinkForAddress   = By.xpath("//a[text()='Change']");
	By defaultshippingAddress   = By.xpath("//a[text()='Change']//parent::div//span[2]");

	By thisIsWhatYourMonthlyBillWillLookLike = By.xpath("//span[text()=' This is what your next bill will look like ']");
	By showBreakdown = By.xpath("//span[text()=' Show breakdown ']");
	By shippingFee = By.xpath("//span[text()='Shipping fee']//following::span[1]");
	By monthlyBill = By.xpath("//span[text()='Total bill']//following-sibling::span | //span[text()='Monthly bill']//following-sibling::span");
	By hideBreakdown = By.xpath("//span[text()=' Hide breakdown ']");

	By OneTime_PaymentText = By.xpath("//span[text()=' One-time payment ']");
	By viewBreakdown = By.xpath("//span[text()=' View breakdown ']");
	By deviceSelected = By.xpath("(//span[text()=' Hide breakdown ']//following::div[1]//span)[1]");
	By costOfDevice = By.xpath("(//span[text()=' Hide breakdown ']//following::div[1]//span)[3]");
	By Shipping = By.xpath("//span[text()='Shipping fee']//following::span[2]");
	By totalAmountToPay = By.xpath("//span[text()=' Total amount to pay ']//following-sibling::span");

	By pendingChargesWillReceiveMailText = By.xpath("//div[contains(text(), ' If you have pending charges to be')]");
	By enterPromoCodeField = By.xpath("//input[@placeholder='Enter promo code']");
	
	
    By ThisIsWhatYouPayNow  =  By.xpath("//span[normalize-space(text())='This is what you have to pay now']");
    By TotalFromUnpaidBills = By.xpath("//p[normalize-space(text())='This total is from your unpaid billing statements (including any other Globe accounts).']");
    By unpaidBillStatement  = By.xpath("//p[normalize-space(text())='This is from your unpaid billing statements (including any other Globe accounts).']");
    By MobileNumber  = By.xpath("//span[normalize-space(text())='Overdue balance']//following::span[1]");
    By preterminationFee = By.xpath("//span[normalize-space(text())='Pre-termination fee']");
    By RenewingPlanBefore = By.xpath("//p[contains(normalize-space(text()), 'Since you')]");
    By UnpaidMonthlyBill = By.xpath("//span[contains(normalize-space(text()), 'Unpaid monthly installment')]//following::span[@class='go_sc-rnp-ob-ptf__item-price'][1]");
    By GadgetPenalityFee = By.xpath("//span[contains(normalize-space(text()), 'Gadget penalty fee')]//following::span[@class='go_sc-rnp-ob-ptf__item-price'][1]");
    By AdminFee = By.xpath("//span[contains(normalize-space(text()), 'Admin fee')]//following::span[@class='go_sc-rnp-ob-ptf__item-price'][1]");
    By DeviceCost  = By.xpath("//span[normalize-space(text())='Device cost']");
    By TotalDeviceCost = By.xpath("//span[normalize-space(text())='Total amount to pay']//following-sibling::span");
    
    
	By promocodeapply=By.xpath("(//div[@class='go_sc-rnp-ob-ptf__item-name-wrap'])[6]");
	By promocodediscount=By.xpath("(//div[@class='go_sc-rnp-ob-ptf__item-name-wrap'])[6]//following::span[1]");
	
	By howWillYouBePaying = By.xpath("//span[contains(text(),'How will you be paying')]");
	By Visa_MasterCard = By.xpath("//div[text()='Visa / MasterCard']");
	By GCash = By.xpath("//div[text()='GCash']");
	By cashOnDelivery = By.xpath("//div[text()='Cash On Delivery'] | //div[text()='Cash on Delivery']");
    By StrigtPay=By.xpath("//div[text()='Credit Card (Straight Payment)']");
   // By HSBC=By.xpath("//div[text()='Credit card (Installment For HSBC)']");
	By ProofOfFinancialCapacity = By.xpath("//span[text()='Proof of Financial Capacity']");
	By YourChosenPlanMayBeAboveYourCurrentSpendingLimit = By.xpath("//p[contains(text(), ' Your chosen plan may be above your current spending limit.')]");
	By pofcDropdown=By.xpath("//select[@id='pofcDocIDType']");
	By uploadScannedCopy=By.xpath("//p[text()=' Upload a scanned copy of your document: ']");
	By MaximumFileSizeIs10MB=By.xpath("//li[text()='Maximum file size is 10MB.']");
	By PhotosMustbeInPNG_JPG_GIF_HEIC_PDF_Format=By.xpath("//li[text()='Photos must be in PNG, JPG, GIF, HEIC, or PDF format.']");
	By MakeSureYourDocumentIsClear=By.xpath("//li[text()='Make sure your document is clear and the details are readable.']");
	By MakeSureTheImageIsNotBlurredAndNotCropped=By.xpath("//li[text()='Make sure the image is not blurred and not cropped.']");




	By StandardDelivery=By.xpath("//span[text()='Standard Delivery ']");

	By IAcceptAllTerms_Conditions=By.xpath("//span[text()='I accept all Terms & Conditions']");

	By SubmitOrder=By.xpath("(//button[text()=' Submit order '])[1]");

	By Merchant=By.xpath("//label[text()='Merchant']//following-sibling::span");
	By AmountDue=By.xpath("//label[text()='Amount Due']//following-sibling::span");
	By LoginToPayWithGCash=By.xpath("//h2[text()='Login to pay with GCash']");
	By NumberField=By.xpath("//input[@type='number']");
	By nextButton=By.xpath("//button[@accessbilityid='next-button']");
	By Enteryour4digitMPIN=By.xpath("//p[text()='Enter your 4-digit MPIN.']");
	By gcashPin=By.xpath("//input[@class='ap-password-focus']");
	By nxtButton=By.xpath("//button[@accessbilityid='submit-button']");
	By GCashBalance=By.xpath("//label[text()='GCash Balance']//following-sibling::span");
	By agree=By.xpath("//button[@type='button']");
	By payBtn=By.xpath("//button[@accessibilityid='button-pay']");
	By TrackMyOrder=By.xpath("(//button[text()=' Track my order '])[2]");

	/************************************************************************************************/
	By cardnumber=By.xpath("(//span[@class='chckt-input-field js-chckt-form-field js-chckt-hosted-input-field'])[1]");
	By expiryDate=By.xpath("(//span[@class='chckt-input-field js-chckt-form-field js-chckt-hosted-input-field'])[2]");

	By procced_btn=By.xpath("//button[@class='chckt-button chckt-pm-list__button chckt-button--submit js-chckt-button--submit']");


	By  whatyouhave  = By.xpath("//Span[text()=' This is what you have to pay now ']");



	By Glnusure = By.xpath("(//span[@class='go_sc-accordion__item-title'])[2]");



	By Davicnic  = By.xpath("(//span[@class='go_sc-accordion__item-title'])[5]");
	By Skillshare  = By.xpath("(//span[@class='go_sc-accordion__item-title'])[6]");
    By OrderSummary  = By.xpath("//strong[normalize-space(text())='Order Summary']");




	By youhavepending = By.xpath("//div[@class='gk-alert__description']");

	By overdue = By.xpath("//span[text()=' Overdue balance ']");
	By Unpaidbillig = By.xpath("//P[text()=' This is from your unpaid billing statements (including any other Globe accounts). ']");


	By Testdatfilled = By.xpath("//span[@class='go_sc-rnp-ob-ptf__item-name']");

	By CreditcardHSBC = By.xpath("//div[text()='Credit card (Installment For HSBC)'] | //div[text()='Credit card installment for HSBC']");
	By CreditcardinstallBPI = By.xpath("//div[text()='Credit card installment for BPI']");

	By chkbx_acceptAll = By.xpath("//input[@type='checkbox']");

	By chkbxLabelTermsConditions = By.xpath("//label[@class='gk-checkbox required'] // input[@type='checkbox']");

	By label_accept_all_terms = By.xpath("//span[text()='I accept all Terms & Conditions']");

    By ShippingFee = By.xpath("//span[normalize-space(text())='Shipping Fee']//following::span[@class='go_sc-rnp-delivery__item-price']");
    By deliverInSiel  =  By.xpath("//span[normalize-space(text())='Delivers in 1-2 days in NCR, and 3-5 days in non-NCR areas once request is approved.']");



	//ALL DATA 3CLICKS

	By PlanTypeAllData=By.xpath("//div[contains(@class,'go_gpon-plan-details-title go_text-s-medium_v2 -go_bold -go_label')]");

	//3click Gcash SHOW BREAK ADD ONS 



	By Addsurf=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[1]");
	By Amazonprimevideo=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[2]");
	By SpotifyPremium=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[3]");
	By MysuperDuo=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[4]");
	By EasyRoamW=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[5]");
	By GOCALLIDD199=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[6]");




	// Pay page xpaths

	By hdrPay = By.xpath("//h1[text()=' Pay ']");
	By cod = By.xpath("//div[text()=' Cash On Delivery ']");
	By payOptionGCash = By.xpath("//h2[contains(@class,'payoption')] //div[text()=' GCash ']");
	By payOption_Visa_MasterCard = By.xpath("//h2[contains(@class,'payoption')] //div[text()=' Visa / MasterCard ']");
	By payOption_overTheCounter = By.xpath("//div[text()=' Over the Counter ']");

	//By payOrder = By.xpath("//*[contains(text(), 'Pay ₱')]");

	By quantity = By.xpath("//div[contains(@class,'onex')]/span");
	By productName = By.xpath("//div[contains(@class,'cashout')]/span");
	By price = By.xpath("//div[contains(@class,'amount-1')]/span");
	By shipping = By.xpath("//span[contains(@class,'float-end')]");
	By totalAmount = By.xpath("//div[contains(@class,'ampount-2')]/span");

	By shipAddress = By.xpath("//div[contains(@class,'ship-address')]/span");

	By notification_OTC = By.xpath("//div[text()='Paying Over the Counter']");
	By notification_OTC_text = By
			.xpath("//div[text()='Paying Over the Counter']/../../following-sibling::div/div/span");
	By nearestECPay = By.xpath("//a[text()='Find the nearest ECPay near me']");
	By promoCode = By.xpath("//div[contains(@class,'promo-code-part-content')]");
	By changeAddress = By.xpath("//div[@id='changeAddress']/span");



	//By hdrPay = By.xpath("//h1[text()=' Pay ']");
	By ImgVisaCC = By.xpath("//img[@alt='adyen']");
	By BtnVisaCC = By.xpath("//div[contains(text(), ' Visa')]");
	By ImgGCash = By.xpath("//img[@alt='gcash']");
	By BtnGCash = By.xpath("//div[contains(text(), 'GCash')]");

	By OTCDesc1 = By.xpath("//span[contains(text(), 'You can pay Over the Counter through ECPay partners near you.')]");
	By OTCNearestECPayLink = By.xpath("//a[contains(text(), 'Find the nearest ECPay near me')]");
	By ImgCOD = By.xpath("//img[@alt='cashondelivery']");
	By BtnCOD = By.xpath("//div[contains(text(), 'Cash On Delivery')]");

	By OrderDetailsHeader = By.xpath("//span[contains(text(), 'Order details')]");
	By Prod1_Qty = By.xpath("(//span[contains(text(), '1x')])[1]");
	By Prod1_Name = By.xpath("(//div[@class='col-7 cashout'])[1]");
	By Prod1_Price = By.xpath("(//div[@class='col-4 amount-1'])[1]");
	By ShippingLbl = By.xpath("//span[contains(text(), 'Shipping')]");
	By ShippingVal = By.xpath("//span[contains(text(), 'Free')]");
	By AddImg = By.xpath("//img[@class='ship-img']");
	By AddShiptoAddLbl = By.xpath("//span[contains(text(), 'Ship to this address')]");
	By AddVal = By.xpath("//div[@class='col-12 ship-address mt-1']/span");
	By changeAdd = By.xpath("//span[contains(text(), 'Change address')]");
	By PromoIcon = By.xpath("//div[@class='promocode-icon']");
	By PromoGotPromoLbl = By.xpath("//span[contains(text(), 'Got a promo code?')]");
	By PromoClickHere = By.xpath("//button[contains(text(), 'Click Here')]");
	By TotalLbl = By.xpath("//span[contains(text(), 'Total')]");
	By TotalVal = By.xpath("//div[@class='col-6 ampount-2']");
	//By cod = By.xpath("//div[text()=' Cash On Delivery ']");
	//By payOptionGCash = By.xpath("//h2[contains(@class,'payoption')] //div[text()=' GCash ']");
	//By payOrder = By.xpath("//button[@id='payOrder']");

	By AccMerchants = By.xpath("//*[text()='Accredited ECPay Merchants']");
	By OrderNames = By.xpath("//div[@class='col-7 cashout']/span");
	By PromoCode = By.xpath("//div[@class='col-7 promo-code-part-content']");//span[@class='discount-amount-end']
	By PromoCodeDiscountAmt = By.xpath("//span[@class='discount-amount-end']");
	By PromoImgApplied = By.xpath("//div[@class='col-3 promo-code-part1-icon']/img");
	By PromoCodeApplied = By.xpath("//div[@class='col-12 promo-code-part1-content-text1']");



	By EditPromoCodeApplied = By.xpath("//button[text()=' Edit Promo Code ']");


	//ALL DATA PAY ADDONS

	By  GSAddSurf99Addon =By.xpath("(//span[text()=' GS Add Surf 99 '])");
	By  AmazonPrimeVideoAddon =By.xpath("(//span[text()=' Amazon Prime Video ']) | //span[text()=' Prime Video ']");
	By  VIUPremiumAddon=By.xpath("(//span[text()=' Viu Premium '])");
	By  MYDUOAddon=By.xpath("(//span[text()=' MyDuo '])");
	By  EasyRoamAddon=By.xpath("(//span[text()=' Easy Roam '])");
	By  spotifyAddon=By.xpath("//span[text()=' Spotify Premium ']");

	By GOCALLIDDP=By.xpath("(//span[text()=' GOCALLIDD 199 '])");
	By MonthlybillAmount=By.xpath("//span[text()='Monthly bill']");
	
	By esim=By.xpath("(//span[text()=' e-SIM  '])");
	By promoinput=By.xpath("//input[@placeholder='Enter promo code']");
	By promoapply=By.xpath("//button[text()=' Apply ']");
	
	//dyanamic
	By plantypepay=By.xpath("//a[text()=' Change ']//preceding::div[1]");
	By DeviceNamePay=By.xpath("(//span[text()=' Hide breakdown ']//following::div[1]//span)[1]");
	By deviceCostPay=By.xpath("(//span[text()=' Hide breakdown ']//following::div[1]//span)[3]");	
	By deviceColorPAy=By.xpath("(//span[text()=' Hide breakdown ']//following::div[1]//span)[2]");
	
	By Shippingpay=By.xpath("//span[text()='Shipping']//following::span[1]");
	By palntypepay=By.xpath("//span[text()=' Hide breakdown ']//following::span[contains(text(), 'GPlan')]//following-sibling::span");
	By GSADDPAY=By.xpath("//span[text()='GS Add Surf 99']//following-sibling::span");
	By APVPAY=By.xpath("//span[text()='Amazon Prime Video']//following-sibling::span | //span[text()='Prime Video']//following-sibling::span");
	By VIU=By.xpath("//span[text()='Viu Premium']//following-sibling::span");
	By Musuperduo=By.xpath("//span[text()='MySuperDuo']//following-sibling::span");
	By EseyRoam=By.xpath("//span[text()='Easy Roam']//following-sibling::span");
	By Gloicod=By.xpath("//span[text()='GOCALLIDD 199']//following-sibling::span");
	By OverdueBalnce=By.xpath("//span[text()=' Total Overdue Balance ']//following::span[1]");
	
	
	///////////////////////////////////////////////////////////////////////////////
	public WebElement get_deviceColorPAy()
	{
		return DriverManager.getDriver().findElement(deviceColorPAy);
	}
	public WebElement get_showBreakdown() {
		return DriverManager.getDriver().findElement(showBreakdown);
	}
	public WebElement get_promoapply()
	{
		return DriverManager.getDriver().findElement(promoapply);
	}
	public WebElement get_StrigtPay()
	{
		return DriverManager.getDriver().findElement(StrigtPay);
	}

	public WebElement get_promoinput()
	{
		return DriverManager.getDriver().findElement(promoinput);
	}
	public WebElement get_pretermination()
	{
		return DriverManager.getDriver().findElement(pretermination);
	}
	/********************************************************************************************************************************/
	public WebElement get_hideBreakdown() {
		return DriverManager.getDriver().findElement(hideBreakdown);
	}

	/********************************************************************************************************************************/
	public WebElement get_shippingFee() {
		return DriverManager.getDriver().findElement(shippingFee);
	}
	public WebElement get_palntypepay() {
		return DriverManager.getDriver().findElement(palntypepay);
	}
	public WebElement get_GSADDPAY() {
		return DriverManager.getDriver().findElement(GSADDPAY);
	}
	public WebElement get_APVPAY() {
		return DriverManager.getDriver().findElement(APVPAY);
	}
	public WebElement get_VIU() {
		return DriverManager.getDriver().findElement(VIU);
	}
	public WebElement get_Musuperduo() {
		return DriverManager.getDriver().findElement(Musuperduo);
	}
	public WebElement get_EseyRoam() {
		return DriverManager.getDriver().findElement(EseyRoam);
	}
	public WebElement get_Gloicod() {
		return DriverManager.getDriver().findElement(Gloicod);
	}

	/********************************************************************************************************************************/
	public WebElement get_monthlyBill() {
		return DriverManager.getDriver().findElement(monthlyBill);
	}
	public WebElement get_chevron1() {
		return DriverManager.getDriver().findElement(chevron1);
	}
	public WebElement get_chevron2() {
		return DriverManager.getDriver().findElement(chevron2);
	}
	public WebElement get_chevron3() {
		return DriverManager.getDriver().findElement(chevron3);
	}
	
	public WebElement get_OneTimePayment() {
		return DriverManager.getDriver().findElement(OneTimePayment);
	}
	public WebElement get_chargeToBill()
	{
		return DriverManager.getDriver().findElement(chargeToBill);
	}
	
	public WebElement get_UnpaidMonthlyBill()
	{
		return DriverManager.getDriver().findElement(UnpaidMonthlyBill);
	}
	
	public WebElement get_GadgetPenalityFee()
	{
		return DriverManager.getDriver().findElement(GadgetPenalityFee);
	}
	
	public WebElement get_AdminFee()
	{
		return DriverManager.getDriver().findElement(AdminFee);
	}

	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_viewBreakdown() {
		return DriverManager.getDriver().findElement(viewBreakdown);
	}

	/********************************************************************************************************************************/
	public WebElement get_deviceSelected() {
		return DriverManager.getDriver().findElement(deviceSelected);
	}

	/********************************************************************************************************************************/
	public WebElement get_costOfDevice() {
		return DriverManager.getDriver().findElement(costOfDevice);
	}

	/********************************************************************************************************************************/
	public WebElement get_Shipping() {
		return DriverManager.getDriver().findElement(Shipping);
	}

	/********************************************************************************************************************************/
	public WebElement get_totalAmountToPay() {
		return DriverManager.getDriver().findElement(totalAmountToPay);
	}

	/********************************************************************************************************************************/
	public WebElement get_Visa_MasterCard() {
		return DriverManager.getDriver().findElement(Visa_MasterCard);
	}

	/********************************************************************************************************************************/
	public WebElement get_GCash() {
		return DriverManager.getDriver().findElement(GCash);
	}

	/********************************************************************************************************************************/
	public WebElement get_cashOnDelivery() {
		return DriverManager.getDriver().findElement(cashOnDelivery);
	}

	/********************************************************************************************************************************/
	public void Select_dropdown(String option)
	{
		Select s = new Select(DriverManager.getDriver().findElement(pofcDropdown));
		s.selectByVisibleText(option);
	} 
	/********************************************************************************************************************************/
	public WebElement get_StandardDelivery() {
		return DriverManager.getDriver().findElement(StandardDelivery);
	}
	/********************************************************************************************************************************/
	public WebElement get_IAcceptAllTerms_Conditions() {
		return DriverManager.getDriver().findElement(IAcceptAllTerms_Conditions);
	}
	/********************************************************************************************************************************/
	public WebElement get_defaultshippingAddress() {
		return DriverManager.getDriver().findElement(defaultshippingAddress);
	}
	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_SubmitOrder() {
		return DriverManager.getDriver().findElement(SubmitOrder);
	}
	/********************************************************************************************************************************/
	public WebElement get_NumberField() {
		return DriverManager.getDriver().findElement(NumberField);
	}
	/********************************************************************************************************************************/
	public WebElement get_nextButton() {
		return DriverManager.getDriver().findElement(nextButton);
	}
	public WebElement get_TotalDeviceCost() {
		return DriverManager.getDriver().findElement(TotalDeviceCost);
	}
	/********************************************************************************************************************************/
	public WebElement get_gcashPin() {
		return DriverManager.getDriver().findElement(gcashPin);
	}
	/********************************************************************************************************************************/
	public WebElement get_nxtButton() {
		return DriverManager.getDriver().findElement(nxtButton);
	}
	/********************************************************************************************************************************/
	public WebElement get_agree() {
		return DriverManager.getDriver().findElement(agree);
	}
	/********************************************************************************************************************************/
	public WebElement get_payBtn() {
		return DriverManager.getDriver().findElement(payBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_Merchant() {
		return DriverManager.getDriver().findElement(Merchant);
	}
	/********************************************************************************************************************************/
	public WebElement get_AmountDue() {
		return DriverManager.getDriver().findElement(AmountDue);
	}
	/********************************************************************************************************************************/
	public WebElement get_GCashBalance() {
		return DriverManager.getDriver().findElement(GCashBalance);
	}
	/********************************************************************************************************************************/
	public WebElement get_TrackMyOrder() {
		return DriverManager.getDriver().findElement(TrackMyOrder);
	}



	/********************************************************************************************************************************/
	public WebElement get_cardnumber() {
		return DriverManager.getDriver().findElement(cardnumber);
	}
	/********************************************************************************************************************************/
	public WebElement get_expiryDate() {
		return DriverManager.getDriver().findElement(expiryDate);
	}
	/********************************************************************************************************************************/
	public WebElement get_procced_btn() {
		return DriverManager.getDriver().findElement(procced_btn);
	}





	/********************************************************************************************************************************/
	public WebElement get_standeddelivey()
	{
		return DriverManager.getDriver().findElement(standeddelivey);
	}

	public WebElement get_Deliverymethod()
	{
		return DriverManager.getDriver().findElement(Deliverymethod);
	}
	public WebElement get_chargetobillbutton()
	{
		return DriverManager.getDriver().findElement(chargetobillbutton);
	}
	public WebElement get_ontimecashout()
	{
		return DriverManager.getDriver().findElement(ontimecashout);
	}

	public WebElement get_viewbreakdown()
	{
		return DriverManager.getDriver().findElement(viewbreakdown);
	}
	public WebElement get_ShowBreakdown()
	{
		return DriverManager.getDriver().findElement(ShowBreakdown);
	}

	public WebElement get_globespatnercrosal()
	{
		return DriverManager.getDriver().findElement(globespatnercrosal);
	}
	public WebElement get_privacycrosal()
	{
		return DriverManager.getDriver().findElement(privacycrosal);

	}
	public WebElement get_SubscDeclarationcrosal()
	{
		return DriverManager.getDriver().findElement(SubscDeclarationcrosal);

	}
	public WebElement get_addonsubscripation()
	{
		return DriverManager.getDriver().findElement(addonsubscripation);
	}
	public WebElement get_inclusion()
	{
		return DriverManager.getDriver().findElement(inclusion);
	}
	public WebElement get_accept() {
		return DriverManager.getDriver().findElement(accept);
	}
	public WebElement get_pay() {
		return DriverManager.getDriver().findElement(pay);
	} 
	public WebElement get_YourContactPeriod() {
		return DriverManager.getDriver().findElement(YourContactPeriod);
	} 
	public WebElement get_Noneedtopay() {
		return DriverManager.getDriver().findElement(Noneedtopay);
	} 
	public WebElement get_PreferUpfront() {
		return DriverManager.getDriver().findElement(PreferUpfront);
	} 
	public WebElement get_RenewalHeading() {
		return DriverManager.getDriver().findElement(RenewalHeading);
	} 

	public WebElement get_planRenewalcollapse1() {
		return DriverManager.getDriver().findElement(planRenewalcollapse1);
	} 

	public WebElement get_RenewalProduct() {
		return DriverManager.getDriver().findElement(RenewalProduct);
	} 
	public WebElement get_RenewalProductCost() {
		return DriverManager.getDriver().findElement(RenewalProductCost);
	} 

	public WebElement get_addons() {
		return DriverManager.getDriver().findElement(addons);
	}
	public WebElement get_myDuo() {
		return DriverManager.getDriver().findElement(myDuo);
	}
	public WebElement get_HSBC() {
		return DriverManager.getDriver().findElement(HSBC);
	}
	public WebElement get_amazonprimeVideo() {
		return DriverManager.getDriver().findElement(amazonprimeVideo);
	}
	public WebElement get_ViuPremium() {
		return DriverManager.getDriver().findElement(ViuPremium);
	}
	public WebElement get_SpotifyPremiumaddon() {
		return DriverManager.getDriver().findElement(SpotifyPremiumaddon);
	}
	public WebElement get_EasyRoam() {
		return DriverManager.getDriver().findElement(EasyRoam);
	}
	public WebElement get_GOCALLIDD() {
		return DriverManager.getDriver().findElement(GOCALLIDD);
	}
	public WebElement get_GSAdd() {
		return DriverManager.getDriver().findElement(GSAdd);
	}
	public WebElement get_totaladdons() {
		return DriverManager.getDriver().findElement(totaladdons);
	}


	public WebElement get_totalMontlybill2() {
		return DriverManager.getDriver().findElement(totalMontlybill2);
	}
	public WebElement get_monthlyservice() {
		return DriverManager.getDriver().findElement(monthlyservice);
	}
	public WebElement get_totalmontlyBillPayment() {
		return DriverManager.getDriver().findElement(totalmontlyBillPayment);
	}

	public WebElement get_CCBPI() {
		return DriverManager.getDriver().findElement(CCBPI);
	}		
	/********************************************************************************************************************************/
	public WebElement get_CCStraightpayment() {
		return DriverManager.getDriver().findElement(CCStraightpayment);
	}
	/********************************************************************************************************/

	public WebElement get_VisaMastercard()
	{
		return DriverManager.getDriver().findElement(VisaMastercard);
	}
	/********************************************************************************************************/
	public WebElement get_Gcash()
	{
		return DriverManager.getDriver().findElement(Gcash);

	}
	/********************************************************************************************************/
	public WebElement get_planApplicationHeader()
	{
		return DriverManager.getDriver().findElement(planApplicationHeader);

	}


	/********************************************************************************************************************************/
	public WebElement get_TotalAmount() {
		return DriverManager.getDriver().findElement(TotalAmount);
	}
	/********************************************************************************************************************************/
	public WebElement get_COD() {
		return DriverManager.getDriver().findElement(COD);
	}
	/********************************************************************************************************************************/
	public WebElement get_Colapsebutton1() {
		return DriverManager.getDriver().findElement(Colapsebutton1);
	}
	/********************************************************************************************************************************/
	public WebElement get_Submitbutton() {
		return DriverManager.getDriver().findElement(Submitbutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_Colapsebutton2() {
		return DriverManager.getDriver().findElement(Colapsebutton2);
	}
	public WebElement get_Addons()
	{
		return DriverManager.getDriver().findElement(Addons);
	}
	//FTA4
	public WebElement get_CCHSBC() {
		return DriverManager.getDriver().findElement(CCHSBC);
	}
	//FTA5
	public WebElement get_ccBPI()
	{
		return DriverManager.getDriver().findElement(CCBPI);
	}

	/********************************************************************************************************************************/
	public WebElement get_cardNumberFrame() {
		return DriverManager.getDriver().findElement(cardNumberFrame);
	}
	/********************************************************************************************************************************/
	public WebElement get_cardNumber() {
		return DriverManager.getDriver().findElement(cardNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_cardExpiryDateFrame() {
		return DriverManager.getDriver().findElement(cardExpiryDateFrame);
	}

	/********************************************************************************************************************************/
	public WebElement get_cardExpiryDate() {
		return DriverManager.getDriver().findElement(cardExpiryDate);
	}

	/********************************************************************************************************************************/
	public WebElement get_cvvFrame() {
		return DriverManager.getDriver().findElement(cvvFrame);
	}

	/********************************************************************************************************************************/
	public WebElement get_cvv() {
		return DriverManager.getDriver().findElement(cvv);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnPay_CC() {
		return DriverManager.getDriver().findElement(btnPay_CC);
	}
	public WebElement get_payOrder() {
		return DriverManager.getDriver().findElement(payOrder);
	}
	/********************************************************************************************************************************/
	public WebElement get_checkbox_acceptAll() {
		return DriverManager.getDriver().findElement(chkbx_acceptAll);
	}
	/********************************************************************************************************************************/
	public WebElement get_chkbxLabelTermsConditions() {
		return DriverManager.getDriver().findElement(chkbxLabelTermsConditions);
	}

	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_overdue() {
		return DriverManager.getDriver().findElement(overdue);
	}

	public WebElement get_Unpaidbillig() {
		return DriverManager.getDriver().findElement(Unpaidbillig);
	}

	public WebElement get_Testdatfilled() {
		return DriverManager.getDriver().findElement(Testdatfilled);
	}


	public WebElement get_youhavepending() {
		return DriverManager.getDriver().findElement(youhavepending);
	}

	//		All data 3clicks
	public WebElement get_PlanTypeAllData() {
		return DriverManager.getDriver().findElement(PlanTypeAllData);
	}

	public WebElement get_Addsurf() {
		return DriverManager.getDriver().findElement(Addsurf);
	}

	public WebElement get_Amazonprimevideo() {
		return DriverManager.getDriver().findElement(Amazonprimevideo);
	}
	public WebElement get_SpotifyPremium() {
		return DriverManager.getDriver().findElement(SpotifyPremium);
	}
	public WebElement get_MysuperDuo() {
		return DriverManager.getDriver().findElement(MysuperDuo);
	}
	public WebElement get_EasyRoamW() {
		return DriverManager.getDriver().findElement(EasyRoamW);
	}

	public WebElement get_GOCALLIDD199() {
		return DriverManager.getDriver().findElement(GOCALLIDD199);
	}


	/********************************************************************************************************************************/
	public WebElement get_CreditcardHSBC() {
		return DriverManager.getDriver().findElement(CreditcardHSBC);
	}

	/********************************************************************************************************************************/
	public WebElement get_CreditcardinstallBPI () {
		return DriverManager.getDriver().findElement(CreditcardinstallBPI );
	}

	/********************************************************************************************************************************/
	public WebElement get_label_accept_all_terms() {
		return DriverManager.getDriver().findElement(label_accept_all_terms);
	}

	/********************************************************************************************************************************/
	// Pay page xpaths

	/********************************************************************************************************************************/
	public WebElement get_PromoCodeApplied() {
		return DriverManager.getDriver().findElement(PromoCodeApplied);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_OrderNames() {
		return DriverManager.getDriver().findElements(OrderNames);
	}


	/********************************************************************************************************************************/
	public WebElement get_cod() {
		return DriverManager.getDriver().findElement(cod);
	}

	/********************************************************************************************************************************/
	public WebElement get_payOpt_Gcash() {
		return DriverManager.getDriver().findElement(payOptionGCash);
	}

	/********************************************************************************************************************************/
	public WebElement get_payOpt_VisaMasterCard() {
		return DriverManager.getDriver().findElement(payOption_Visa_MasterCard);
	}

	/********************************************************************************************************************************/
	public WebElement get_payOpt_overTheCounter() {
		return DriverManager.getDriver().findElement(payOption_overTheCounter);
	}

	/********************************************************************************************************************************/
	public WebElement get_notification_OTC() {
		return DriverManager.getDriver().findElement(notification_OTC);
	}

	/********************************************************************************************************************************/
	public WebElement get_notification_OTC_text() {
		return DriverManager.getDriver().findElement(notification_OTC_text);
	}

	/********************************************************************************************************************************/
	public WebElement get_nearestECPay() {
		return DriverManager.getDriver().findElement(nearestECPay);
	}


	/********************************************************************************************************************************/
	public List<WebElement> get_quantity() {
		return DriverManager.getDriver().findElements(quantity);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_productName() {
		return DriverManager.getDriver().findElements(productName);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_price() {
		return DriverManager.getDriver().findElements(price);
	}

	/********************************************************************************************************************************/
	public WebElement get_shipping() {
		return DriverManager.getDriver().findElement(shipping);
	}

	/********************************************************************************************************************************/
	public WebElement get_totalAmount() {
		return DriverManager.getDriver().findElement(totalAmount);
	}

	/********************************************************************************************************************************/
	public WebElement get_shipAddress() {
		return DriverManager.getDriver().findElement(shipAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_promoCode() {
		return DriverManager.getDriver().findElement(promoCode);
	}

	/********************************************************************************************************************************/
	public WebElement get_changeAddress() {
		return DriverManager.getDriver().findElement(changeAddress);
	}



	/********************************************************************************************************************************/
	public WebElement get_KonsultaMD() {
		return DriverManager.getDriver().findElement(KonsultaMD);
	}

	/********************************************************************************************************************************/
	public WebElement get_Glnusure() {
		return DriverManager.getDriver().findElement(Glnusure);
	}
	/********************************************************************************************************************************/
	public WebElement get_AddonsAndSubscriptions() {
		return DriverManager.getDriver().findElement(AddonsAndSubscriptions);
	}
	/********************************************************************************************************************************/
	public WebElement get_GSAddSurf() {
		return DriverManager.getDriver().findElement(GSAddSurf);
	}
	/********************************************************************************************************************************/
	public WebElement get_AmazonPrimeVideo() {
		return DriverManager.getDriver().findElement(AmazonPrimeVideo);
	}
	/********************************************************************************************************************************/
	public WebElement get_MySuperDuo() {
		return DriverManager.getDriver().findElement(MySuperDuo);
	}

	/********************************************************************************************************************************/
	public WebElement get_planetypeamount() {
		return DriverManager.getDriver().findElement(planetypeamount);
	}
	/********************************************************************************************************************************/
	public WebElement get_addon() {
		return DriverManager.getDriver().findElement(addon);
	}
	/********************************************************************************************************************************/
	public WebElement get_addonsamount() {
		return DriverManager.getDriver().findElement(addonsamount);
	}
	/********************************************************************************************************************************/
	public WebElement get_gsaddsurf() {
		return DriverManager.getDriver().findElement(gsaddsurf);
	}
	/********************************************************************************************************************************/
	public WebElement get_gsaddamount() {
		return DriverManager.getDriver().findElement(gsaddamount);
	}
	/********************************************************************************************************************************/
	public WebElement get_apv() {
		return DriverManager.getDriver().findElement(apv);
	}
	/********************************************************************************************************************************/
	public WebElement get_apvamount() {
		return DriverManager.getDriver().findElement(apvamount);
	}
	/********************************************************************************************************************************/
	public WebElement get_viu() {
		return DriverManager.getDriver().findElement(viu);
	}
	/********************************************************************************************************************************/
	public WebElement get_viuamount() {
		return DriverManager.getDriver().findElement(viuamount);
	}
	/********************************************************************************************************************************/
	public WebElement get_myduo() {
		return DriverManager.getDriver().findElement(myduo);
	}


	/********************************************************************************************************************************/
	public WebElement get_myduoamount() {
		return DriverManager.getDriver().findElement(myduoamount);
	}
	/********************************************************************************************************************************/
	public WebElement get_easyroam() {
		return DriverManager.getDriver().findElement(easyroam);
	}
	/********************************************************************************************************************************/
	public WebElement get_easyroamamount() {
		return DriverManager.getDriver().findElement(easyroamamount);
	}
	/********************************************************************************************************************************/
	public WebElement get_Monthlybill() {
		return DriverManager.getDriver().findElement(Monthlybill);
	}

	/********************************************************************************************************************************/
	public WebElement get_monthlybillamount() {
		return DriverManager.getDriver().findElement(monthlybillamount);
	}
	public WebElement get_promocodeapply() {
		return DriverManager.getDriver().findElement(promocodeapply);
	}
	public WebElement get_promocodediscount() {
		return DriverManager.getDriver().findElement(promocodediscount);
	}
	public WebElement get_howWillYouBePaying()
	{
		return DriverManager.getDriver().findElement(howWillYouBePaying);
	}
public WebElement get_OverdueBalnce()
{
	return DriverManager.getDriver().findElement(OverdueBalnce);
}



	/**
	 * @throws Exception ******************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		case "AcceptAllTerms":
			flag = waitForElementVisibility(AcceptAllTerms, waitTime);
			break;
		case "subscriberDeclaration":
			flag = waitForElementVisibility(subscriberDeclaration, waitTime);
			break;
		case "subtext":
			flag = waitForElementVisibility(subtext, waitTime);
			break;
			
		case "GlobePrivacyNote":
			flag = waitForElementVisibility(GlobePrivacyNote, waitTime);
			break;
		case "SharingWithGlobeGroup":
			flag = waitForElementVisibility(SharingWithGlobeGroup, waitTime);
			break;
		case "SuscriberDescription":
			flag = waitForElementVisibility(SuscriberDescription, waitTime);
			break;
		case "GlobePrivacyDescription":
			flag = waitForElementVisibility(GlobePrivacyDescription, waitTime);
			break;
		case "SharingWithGlobeDescription":
			flag = waitForElementVisibility(SharingWithGlobeDescription, waitTime);
			break;
		case "creditCardPage":
			flag = waitForElementVisibility(creditCardPage, waitTime);
			break;
		case "pretermination":
			flag = waitForElementVisibility(pretermination, waitTime);
			break;
		case "palntypepay":
			flag = waitForElementVisibility(palntypepay, waitTime);
			break;
		case "OverdueBalnce":
			flag = waitForElementVisibility(OverdueBalnce, waitTime);
			break;
		case "GSADDPAY":
			flag = waitForElementVisibility(GSADDPAY, waitTime);
			break;
		case "APVPAY":
			flag = waitForElementVisibility(APVPAY, waitTime);
			break;
		case "VIU":
			flag = waitForElementVisibility(VIU, waitTime);
			break;
		case "Musuperduo":
			flag = waitForElementVisibility(Musuperduo, waitTime);
			break;
		case "EseyRoam":
			flag = waitForElementVisibility(EseyRoam, waitTime);
			break;
		case "Gloicod":
			flag = waitForElementVisibility(Gloicod, waitTime);
			break;
		case "planetype2":
			flag = waitForElementVisibility(planetype2, waitTime);
			break;
		case"deviceColorPAy":
			flag = waitForElementVisibility(deviceColorPAy, waitTime);
			break;
		case "GOCALLIDDP":
			flag = waitForElementVisibility(GOCALLIDDP, waitTime);
			break;
		case "howwouldyouliketopay":
			flag = waitForElementVisibility(howwouldyouliketopay, waitTime);
			break;
		case "promocodediscount":
			flag = waitForElementVisibility(promocodediscount, waitTime);
			break;
		case "TotalAmountLabel":
			flag = waitForElementVisibility(TotalAmountLabel, waitTime);
			break;
		case "promocodeapply":
			flag = waitForElementVisibility(promocodeapply, waitTime);
			break;
		case "promoinput":
			flag = waitForElementVisibility(promoinput, waitTime);
			break;
		case "chargetobillbutton":
			flag = waitForElementVisibility(chargetobillbutton, waitTime);
			break;
		case "esim":
			flag = waitForElementVisibility(esim, waitTime);
			break;
		case "ontimecashout":
			flag = waitForElementVisibility(ontimecashout, waitTime);
			break;
		case "payBtn":
			flag = waitForElementVisibility(payBtn, waitTime);
			break;
		case "planetypewithdevice":
			flag = waitForElementVisibility(planetypewithdevice, waitTime);
			break;
		case "PayPage":
			flag = waitForElementVisibility(PayPage, waitTime);
			break;
		case "globepatnertext":
			flag = waitForElementVisibility(globepatnertext, waitTime);
			break;
		case "privacytext":
			flag = waitForElementVisibility(privacytext, waitTime);
			break;
		case "termsconditions":
			flag = waitForElementVisibility(termsconditions, waitTime);
			break;
		case "GPlan1799withDevice":
			flag = waitForElementVisibility(GPlan1799withDevice, waitTime);
			break;
		case "GPlan599withDevice":
			flag = waitForElementVisibility(GPlan599withDevice, waitTime);
			break;
		case "Plannamegcash":
			flag = waitForElementVisibility(Plannamegcash, waitTime);
			break;
		case "Planamountgcash":
			flag = waitForElementVisibility(Planamountgcash, waitTime);
			break;
		case "Totalamountpay1":
			flag = waitForElementVisibility(Totalamountpay1, waitTime);
			break;
		case "Planamountgcash2":
			flag = waitForElementVisibility(Planamountgcash2, waitTime);
			break;
		case "Plannamegcash2":
			flag = waitForElementVisibility(Plannamegcash2, waitTime);
			break;
		case "spotify2":
			flag = waitForElementVisibility(spotify2, waitTime);
			break;
		case "OrderSummary":
			flag = waitForElementVisibility(OrderSummary, waitTime);
			break;

		case "Selectpaymentmethod":
			flag = waitForElementVisibility(Selectpaymentmethod, waitTime);
			break;
		case "Gcash":
			flag = waitForElementVisibility(Gcash, waitTime);
			break;
		case "CCStraightpayment":
			flag = waitForElementVisibility(CCStraightpayment, waitTime);
			break;
		case "CCHSBC":
			flag = waitForElementVisibility(CCHSBC, waitTime);
			break;
		case "CCBPI":
			flag = waitForElementVisibility(CCBPI, waitTime);
			break;
		case "VisaMastercard":
			flag = waitForElementVisibility(VisaMastercard, waitTime);
			break;

		case "COD":
			flag = waitForElementVisibility(COD, waitTime);
			break;
		case "COD_Statment":
			flag = waitForElementVisibility(COD_Statment, waitTime);
			break;
		case "Onetimepayment":
			flag = waitForElementVisibility(Onetimepayment, waitTime);
			break;
		case "planApplicationHeader":
			flag = waitForElementVisibility(planApplicationHeader, waitTime);
			break;
		case "Colapsebutton1":
			flag = waitForElementVisibility(Colapsebutton1, waitTime);
			break;
		case "Planname":
			flag = waitForElementVisibility(Planname, waitTime);
			break;
		case "Planamount":
			flag = waitForElementVisibility(Planamount, waitTime);
			break;
		case "TotalAmountHeader":
			flag = waitForElementVisibility(TotalAmountHeader, waitTime);
			break;
		case "TotalAmount":
			flag = waitForElementVisibility(TotalAmount, waitTime);
			break;
		case "Gotapromocodeheader":
			flag = waitForElementVisibility(Gotapromocodeheader, waitTime);
			break;
		case "PromoClickhere":
			flag = waitForElementVisibility(PromoClickhere, waitTime);
			break;
		case "ShiptothisaddressHeader":
			flag = waitForElementVisibility(ShiptothisaddressHeader, waitTime);
			break;
		case "Submitbutton":
			flag = waitForElementVisibility(Submitbutton, waitTime);
			break;
		case "Monthlypayment":
			flag = waitForElementVisibility(Monthlypayment, waitTime);
			break;
		case "Noneedtopaythistoday":
			flag = waitForElementVisibility(Noneedtopaythistoday, waitTime);
			break;
		case "Planname1":
			flag = waitForElementVisibility(Planname1, waitTime);
			break;
		case "Addons":
			flag = waitForElementVisibility(Addons, waitTime);
			break;
		case "Colapsebutton2":
			flag = waitForElementVisibility(Colapsebutton2, waitTime);
			break;
		case "TotalMonthlybill":
			flag = waitForElementVisibility(TotalMonthlybill, waitTime);
			break;
		case "MonthlysvcplusAddons":
			flag = waitForElementVisibility(MonthlysvcplusAddons, waitTime);
			break;
		case "Totalmontlyamount":
			flag = waitForElementVisibility(Totalmontlyamount, waitTime);
			break;
		case "myDuo":
			flag = waitForElementVisibility(myDuo, waitTime);
			break;	
		case "AmazonPrime":
			flag = waitForElementVisibility(AmazonPrime, waitTime);
			break;
		case "mysuperduo":
			flag = waitForElementVisibility(mysuperduo, waitTime);
			break;
		case "Viupremium":
			flag = waitForElementVisibility(Viupremium, waitTime);
			break;
		case "Spotifypremium":
			flag = waitForElementVisibility(Spotifypremium, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "Gocallid":
			flag = waitForElementVisibility(Gocallid, waitTime);
			break;
		case "Gsaddsurf":
			flag = waitForElementVisibility(Gsaddsurf, waitTime);
			break;
		case "payOrder":
			flag = waitForElementVisibility(payOrder, waitTime);
			break;
			/***************************************/
		case "ChargeToBill":
			flag = waitForElementVisibility(ChargeToBill, waitTime);
			break;
		case "ShowBreakdown":
			flag = waitForElementVisibility(ShowBreakdown, waitTime);
			break;
		case "viewbreakdown":
			flag = waitForElementVisibility(viewbreakdown, waitTime);
			break;
		case "montlybillvalue":
			flag = waitForElementVisibility(montlybillvalue, waitTime);
			break;
		case "MonthlyBill":
			flag = waitForElementVisibility(MonthlyBill, waitTime);
			break;
		case "Paying":
			flag = waitForElementVisibility(Paying, waitTime);
			break;
		case "visamaster":
			flag = waitForElementVisibility(visamaster, waitTime);
			break;
		case "gcash":
			flag = waitForElementVisibility(gcash, waitTime);
			break;
		case "planetype":
			flag = waitForElementVisibility(planetype, waitTime);
			break;
		case "planetypeamount":
			flag = waitForElementVisibility(planetypeamount, waitTime);
			break;
		case "addon":
			flag = waitForElementVisibility(addon, waitTime);
			break;
		case "addonsamount":
			flag = waitForElementVisibility(addonsamount, waitTime);
			break;
		case "gsaddsurf":
			flag = waitForElementVisibility(gsaddsurf, waitTime);
			break;
		case "gsaddamount":
			flag = waitForElementVisibility(gsaddamount, waitTime);
			break;
		case "apv":
			flag = waitForElementVisibility(apv, waitTime);
			break;
		case "apvamount":
			flag = waitForElementVisibility(apvamount, waitTime);
			break;
		case "viu":
			flag = waitForElementVisibility(viu, waitTime);
			break;
		case "viuamount":
			flag = waitForElementVisibility(viuamount, waitTime);
			break;
		case "myduo":
			flag = waitForElementVisibility(myduo, waitTime);
			break;
		case "myduoamount":
			flag = waitForElementVisibility(myduoamount, waitTime);
			break;
		case "easyroam":
			flag = waitForElementVisibility(easyroam, waitTime);
			break;
		case "easyroamamount":
			flag = waitForElementVisibility(easyroamamount, waitTime);
			break;
		case "Monthlybill":
			flag = waitForElementVisibility(Monthlybill, waitTime);
			break;
		case "monthlybillamount":
			flag = waitForElementVisibility(monthlybillamount, waitTime);
			break;
		case "allaccess":
			flag = waitForElementVisibility(allaccess, waitTime);
			break;
		case "Gowi":
			flag = waitForElementVisibility(Gowi, waitTime);
			break;
		case "callText":
			flag = waitForElementVisibility(callText, waitTime);
			break;
		case "contractduration":
			flag = waitForElementVisibility(contractduration, waitTime);
			break;
		case "inclusion":
			flag = waitForElementVisibility(inclusion, waitTime);
			break;
		case "Konsulta":
			flag = waitForElementVisibility(Konsulta, waitTime);
			break;
		case "Glnsure":
			flag = waitForElementVisibility(Glnsure, waitTime);
			break;
		case "VIP":
			flag = waitForElementVisibility(VIP, waitTime);
			break;
		case "wetv":
			flag = waitForElementVisibility(wetv, waitTime);
			break;
		case "Kids":
			flag = waitForElementVisibility(Kids, waitTime);
			break;
		case "skillshare":
			flag = waitForElementVisibility(skillshare, waitTime);
			break;
		case "addonsubscripation":
			flag = waitForElementVisibility(addonsubscripation, waitTime);
			break;
		case "GS":
			flag = waitForElementVisibility(GS, waitTime);
			break;
		case "APV2":
			flag = waitForElementVisibility(APV2, waitTime);
			break;
		case "VIU2":
			flag = waitForElementVisibility(VIU2, waitTime);
			break;
		case "MYDUO2":
			flag = waitForElementVisibility(MYDUO2, waitTime);
			break;
		case "payText":
			flag = waitForElementVisibility(payText, waitTime);
			break;
		case "howWouldYouLikeToPay":
			flag = waitForElementVisibility(howWouldYouLikeToPay, waitTime);
			break;
		case "chargeToBill":
			flag = waitForElementVisibility(chargeToBill, waitTime);
			break;
		case "OneTimePayment":
			flag = waitForElementVisibility(OneTimePayment, waitTime);
			break;	
		case "installmentIsAvailableOnlyFoSelectCreditCards":
			flag = waitForElementVisibility(installmentIsAvailableOnlyFoSelectCreditCards, waitTime);
			break;	
		case "supportingDocumentNeeded":
			flag = waitForElementVisibility(supportingDocumentNeeded, waitTime);
			break;
		case "thisIsWhatYourMonthlyBillWillLookLike":
			flag = waitForElementVisibility(thisIsWhatYourMonthlyBillWillLookLike, waitTime);
			break;
		case "showBreakdown":
			flag = waitForElementVisibility(showBreakdown, waitTime);
			break;
		case "shippingFee":
			flag = waitForElementVisibility(shippingFee, waitTime);
			break;
		case "monthlyBill":
			flag = waitForElementVisibility(monthlyBill, waitTime);
			break;
		case "hideBreakdown":
			flag = waitForElementVisibility(hideBreakdown, waitTime);
			break;
		case "OneTime_PaymentText":
			flag = waitForElementVisibility(OneTime_PaymentText, waitTime);
			break;
		case "viewBreakdown":
			flag = waitForElementVisibility(viewBreakdown, waitTime);
			break;
		case "deviceSelected":
			flag = waitForElementVisibility(deviceSelected, waitTime);
			break;
		case "costOfDevice":
			flag = waitForElementVisibility(costOfDevice, waitTime);
			break;	
		case "Shipping":
			flag = waitForElementVisibility(Shipping, waitTime);
			break;
		case "totalAmountToPay":
			flag = waitForElementVisibility(totalAmountToPay, waitTime);
			break;
		case "pendingChargesWillReceiveMailText":
			flag = waitForElementVisibility(pendingChargesWillReceiveMailText, waitTime);
			break;
		case "enterPromoCodeField":
			flag = waitForElementVisibility(enterPromoCodeField, waitTime);
			break;
		case "howWillYouBePaying":
			flag = waitForElementVisibility(howWillYouBePaying, waitTime);
			break;
		case "Visa_MasterCard":
			flag = waitForElementVisibility(Visa_MasterCard, waitTime);
			break;
		case "GCash":
			flag = waitForElementVisibility(GCash, waitTime);
			break;
		case "cashOnDelivery":
			flag = waitForElementVisibility(cashOnDelivery, waitTime);
			break;	
		case "ProofOfFinancialCapacity":
			flag = waitForElementVisibility(ProofOfFinancialCapacity, waitTime);
			break;
		case "YourChosenPlanMayBeAboveYourCurrentSpendingLimit":
			flag = waitForElementVisibility(YourChosenPlanMayBeAboveYourCurrentSpendingLimit, waitTime);
			break;
		case "pofcDropdown":
			flag = waitForElementVisibility(pofcDropdown, waitTime);
			break;
		case "uploadScannedCopy":
			flag = waitForElementVisibility(uploadScannedCopy, waitTime);
			break;
		case "MaximumFileSizeIs10MB":
			flag = waitForElementVisibility(MaximumFileSizeIs10MB, waitTime);
			break;
		case "PhotosMustbeInPNG_JPG_GIF_HEIC_PDF_Format":
			flag = waitForElementVisibility(PhotosMustbeInPNG_JPG_GIF_HEIC_PDF_Format, waitTime);
			break;
		case "MakeSureYourDocumentIsClear":
			flag = waitForElementVisibility(MakeSureYourDocumentIsClear, waitTime);
			break;
		case "MakeSureTheImageIsNotBlurredAndNotCropped":
			flag = waitForElementVisibility(MakeSureTheImageIsNotBlurredAndNotCropped, waitTime);
			break;
		case "SelectDeliveryMethod":
			flag = waitForElementVisibility(SelectDeliveryMethod, waitTime);
			break;
		case "Deliverymethod":
			flag = waitForElementVisibility(Deliverymethod, waitTime);
			break;
		case "StandardDelivery":
			flag = waitForElementVisibility(StandardDelivery, waitTime);
			break;
		case "FlatRate":
			flag = waitForElementVisibility(FlatRate, waitTime);
			break;
		case "IAcceptAllTerms_Conditions":
			flag = waitForElementVisibility(IAcceptAllTerms_Conditions, waitTime);
			break;
		case "planType":
			flag = waitForElementVisibility(planType, waitTime);
			break;
		case "ChangeLink":
			flag = waitForElementVisibility(ChangeLink, waitTime);
			break;
		case "AllAccessData":
			flag = waitForElementVisibility(AllAccessData, waitTime);
			break;
		case "GoWifiAccess":
			flag = waitForElementVisibility(GoWifiAccess, waitTime);
			break;
		case "Call_Text":
			flag = waitForElementVisibility(Call_Text, waitTime);
			break;
		case "ContractDuration":
			flag = waitForElementVisibility(ContractDuration, waitTime);
			break;
		case "Inclusions":
			flag = waitForElementVisibility(Inclusions, waitTime);
			break;
		case "KonsultaMD":
			flag = waitForElementVisibility(KonsultaMD, waitTime);
			break;
		case "VIPAccessToiQIYI":
			flag = waitForElementVisibility(VIPAccessToiQIYI, waitTime);
			break;
		case "VIPAccessToWeTV":
			flag = waitForElementVisibility(VIPAccessToWeTV, waitTime);
			break;
		case "AddonsAndSubscriptions":
			flag = waitForElementVisibility(AddonsAndSubscriptions, waitTime);
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
		
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
		case "ChangeLinkForAddress":
			flag = waitForElementVisibility(ChangeLinkForAddress, waitTime);
			break;
		case "defaultshippingAddress":
			flag = waitForElementVisibility(defaultshippingAddress, waitTime);
			break;
		case "SubmitOrder":
			flag = waitForElementVisibility(SubmitOrder, waitTime);
			break;
		case "NumberField":
			flag = waitForElementVisibility(NumberField, waitTime);
			break;
		case "nextButton":
			flag = waitForElementVisibility(nextButton, waitTime);
			break;
		case "gcashPin":
			flag = waitForElementVisibility(gcashPin, waitTime);
			break;
		case "Enteryour4digitMPIN":
			flag = waitForElementVisibility(Enteryour4digitMPIN, waitTime);
			break;
		case "nxtButton":
			flag = waitForElementVisibility(nxtButton, waitTime);
			break;
		case "agree":
			flag = waitForElementVisibility(agree, waitTime);
			break;
		case "Merchant":
			flag = waitForElementVisibility(Merchant, waitTime);
			break;
		case "AmountDue":
			flag = waitForElementVisibility(AmountDue, waitTime);
			break;
		case "LoginToPayWithGCash":
			flag = waitForElementVisibility(LoginToPayWithGCash, waitTime);
			break;
		case "GCashBalance":
			flag = waitForElementVisibility(GCashBalance, waitTime);
			break;
		case "TrackMyOrder":
			flag = waitForElementVisibility(TrackMyOrder, waitTime);
			break;
		
		case "cardnumber":
			flag = waitForElementVisibility(cardnumber, waitTime);
			break;
		case "expiryDate":
			flag = waitForElementVisibility(expiryDate, waitTime);
			break;
		
		case "cvv":
			flag = waitForElementVisibility(cvv, waitTime);
			break;
		case "procced_btn":
			flag = waitForElementVisibility(procced_btn, waitTime);
			break;
		case "chkbx_acceptAll":
			flag = waitForElementVisibility(chkbx_acceptAll, waitTime);
			break;
		
			
		case "chkbxLabelTermsConditions":
			flag = waitForElementVisibility(chkbxLabelTermsConditions, waitTime);
			break;
			
	
		case "youhavepending":
			flag = waitForElementVisibility(youhavepending, waitTime);
			break;
				
		case "overdue":
			flag = waitForElementVisibility(overdue, waitTime);
			break;	
			
		case "Unpaidbillig":
			flag = waitForElementVisibility(Unpaidbillig, waitTime);
			break;	
			
		case "Testdatfilled":
			flag = waitForElementVisibility(Testdatfilled, waitTime);
			break;	
			
		case "CreditcardinstallBPI":
			flag = waitForElementVisibility(CreditcardinstallBPI, waitTime);
			break;
		case "CreditcardHSBC":
			flag = waitForElementVisibility(CreditcardHSBC, waitTime);
			break;
		
		case "PlanTypeAllData":
			flag = waitForElementVisibility(PlanTypeAllData, waitTime);
			break;
			
		case "Addsurf":
			flag = waitForElementVisibility(Addsurf, waitTime);
			break;
		case "Amazonprimevideo":
			flag = waitForElementVisibility(Amazonprimevideo, waitTime);
			break;
		case "SpotifyPremium":
			flag = waitForElementVisibility(SpotifyPremium, waitTime);
			break;
		case "MysuperDuo":
			flag = waitForElementVisibility(MysuperDuo, waitTime);
			break;
		case "EasyRoamW":
			flag = waitForElementVisibility(EasyRoamW, waitTime);
			break;
		case "GOCALLIDD199":
			flag = waitForElementVisibility(GOCALLIDD199, waitTime);
			break;
		case "Glnusure":
			flag = waitForElementVisibility(Glnusure, waitTime);
			break;
		case "Davicnic":
			flag = waitForElementVisibility(Davicnic, waitTime);
			break;
		case "Skillshare":
			flag = waitForElementVisibility(Skillshare, waitTime);
			break;

			
//			Pay xpaths
		case "hdrPay":
			flag = waitForElementVisibility(hdrPay, waitTime);
			break;
		case "payOpt_VisaMaster":
			flag = waitForElementVisibility(payOption_Visa_MasterCard, waitTime);
			break;
		case "payOpt_GCash":
			flag = waitForElementVisibility(payOptionGCash, waitTime);
			break;
		case "payOpt_overTheCounter":
			flag = waitForElementVisibility(payOption_overTheCounter, waitTime);
			break;
		case "payOpt_COD":
			flag = waitForElementVisibility(cod, waitTime);
			break;
		case "notification_OTC":
			flag = waitForElementVisibility(notification_OTC, waitTime);
			break;
			
			//RONNIE SCRIPT
		case "ImgVisaCC":
			flag = waitForElementVisibility(ImgVisaCC, waitTime);
			break;
		case "BtnVisaCC":
			flag = waitForElementVisibility(BtnVisaCC, waitTime);
			break;
		case "ImgGCash":
			flag = waitForElementVisibility(ImgGCash, waitTime);
			break;
		case "BtnGCash":
			flag = waitForElementVisibility(BtnGCash, waitTime);
			break;
		case "OTCDesc1":
			flag = waitForElementVisibility(OTCDesc1, waitTime);
			break;
		case "OTCNearestECPayLink":
			flag = waitForElementVisibility(OTCNearestECPayLink, waitTime);
			break;
		case "ImgCOD":
			flag = waitForElementVisibility(ImgCOD, waitTime);
			break;
		case "BtnCOD":
			flag = waitForElementVisibility(BtnCOD, waitTime);
			break;
			
			
		case "OrderDetailsHeader":
			flag = waitForElementVisibility(OrderDetailsHeader, waitTime);
			break;
		case "Prod1_Qty":
			flag = waitForElementVisibility(Prod1_Qty, waitTime);
			break;
		case "Prod1_Name":
			flag = waitForElementVisibility(Prod1_Name, waitTime);
			break;
		case "Prod1_Price":
			flag = waitForElementVisibility(Prod1_Price, waitTime);
			break;
		case "ShippingLbl":
			flag = waitForElementVisibility(ShippingLbl, waitTime);
			break;
		case "ShippingVal":
			flag = waitForElementVisibility(ShippingVal, waitTime);
			break;
		case "AddImg":
			flag = waitForElementVisibility(AddImg, waitTime);
			break;
		case "AddShiptoAddLbl":
			flag = waitForElementVisibility(AddShiptoAddLbl, waitTime);
			break;
		case "AddVal":
			flag = waitForElementVisibility(AddVal, waitTime);
			break;
		case "changeAdd":
			flag = waitForElementVisibility(changeAdd, waitTime);
			break;
		case "PromoIcon":
			flag = waitForElementVisibility(PromoIcon, waitTime);
			break;
		case "PromoGotPromoLbl":
			flag = waitForElementVisibility(PromoGotPromoLbl, waitTime);
			break;
		case "PromoClickHere":
			flag = waitForElementVisibility(PromoClickHere, waitTime);
			break;
		case "TotalLbl":
			flag = waitForElementVisibility(TotalLbl, waitTime);
			break;
		case "TotalVal":
			flag = waitForElementVisibility(TotalVal, waitTime);
			break;
		
		case "AccMerchants":
			flag = waitForElementVisibility(AccMerchants, waitTime);
			break;
		case "PromoCode":
			flag = waitForElementVisibility(PromoCode, waitTime);
			break;
		case "PromoCodeDiscountAmt":
			flag = waitForElementVisibility(PromoCodeDiscountAmt, waitTime);
			break;			
			
		case "PromoImgApplied":
			flag = waitForElementVisibility(PromoImgApplied, waitTime);
			break;
		case "PromoCodeApplied":
			flag = waitForElementVisibility(PromoCodeApplied, waitTime);
			break;
		case "EditPromoCodeApplied":
			flag = waitForElementVisibility(EditPromoCodeApplied, waitTime);
			break;
			
		case "GSAddSurf99Addon":
			flag = waitForElementVisibility(GSAddSurf99Addon, waitTime);
			break;
		case "AmazonPrimeVideoAddon":
			flag = waitForElementVisibility(AmazonPrimeVideoAddon, waitTime);
			break;
		case "VIUPremiumAddon":
			flag = waitForElementVisibility(VIUPremiumAddon, waitTime);
			break;
		case "MYDUOAddon":
			flag = waitForElementVisibility(MYDUOAddon, waitTime);
			break;
		case "EasyRoamAddon":
			flag = waitForElementVisibility(EasyRoamAddon, waitTime);
			break;
		case "spotifyAddon":
			flag = waitForElementVisibility(spotifyAddon, waitTime);
			break; 
		case "ThisIsWhatYouPayNow":
			flag = waitForElementVisibility(ThisIsWhatYouPayNow, waitTime);
			break; 
		case "TotalFromUnpaidBills":
			flag = waitForElementVisibility(TotalFromUnpaidBills, waitTime);
			break; 
		case "unpaidBillStatement":
			flag = waitForElementVisibility(unpaidBillStatement, waitTime);
			break; 
		case "MobileNumber":
			flag = waitForElementVisibility(MobileNumber, waitTime);
			break; 
		case "preterminationFee":
			flag = waitForElementVisibility(preterminationFee, waitTime);
			break; 
		case "RenewingPlanBefore":
			flag = waitForElementVisibility(RenewingPlanBefore, waitTime);
			break; 
		case "UnpaidMonthlyBill":
			flag = waitForElementVisibility(UnpaidMonthlyBill, waitTime);
			break; 
		case "GadgetPenalityFee":
			flag = waitForElementVisibility(GadgetPenalityFee, waitTime);
			break;
		case "DeviceCost":
			flag = waitForElementVisibility(DeviceCost, waitTime);
			break;
		case "AdminFee":
			flag = waitForElementVisibility(AdminFee, waitTime);
			break;
		case "TotalDeviceCost":
			flag = waitForElementVisibility(TotalDeviceCost, waitTime);
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

		case "Submitbutton":
			flag = waitForElementClickable(Submitbutton, waitTime);
			break;
		case "Addons":
			flag = waitForElementClickable(Addons, waitTime);
			break;
		case "payOrder":
			flag = waitForElementClickable(payOrder, waitTime);
			break;
		case "nearestECPay":
			flag = waitForElementClickable(nearestECPay, waitTime);
			break;
			
		

		case "btnPay_CC":
			flag = waitForElementClickable(btnPay_CC, waitTime);
			break;

		case "PayBtn":
			flag = waitForElementClickable(PayBtn, waitTime);
			break;
		case "ShowBreakdown":
			flag = waitForElementClickable(ShowBreakdown, waitTime);
			break;
		case "ShippingFee":
			flag = waitForElementClickable(ShippingFee, waitTime);
			break;
		case "deliverInSiel":
			flag = waitForElementClickable(deliverInSiel, waitTime);
			break;
			



		}

		return flag;
	}
	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void moveToElement(String element) throws Exception {

		WebElement ele = null;

		switch (element) {
		case "Colapsebutton1":
			ele = DriverManager.getDriver().findElement(Colapsebutton1);
			break;
		case "Colapsebutton2":
			ele = DriverManager.getDriver().findElement(Colapsebutton2);
			break;
		case "Onetimepayment":
			ele = DriverManager.getDriver().findElement(Onetimepayment);
			break;
		case "TotalMonthlybill":
			ele = DriverManager.getDriver().findElement(TotalMonthlybill);
			break;
		case "btnPay_CC":
			ele = DriverManager.getDriver().findElement(btnPay_CC);
			break;
		case "RadioBtnDevicecolor1":
			ele = DriverManager.getDriver().findElement(RadioBtnDevicecolor1);
			break;
		case "RadioBtnDevicecolor2":
			ele = DriverManager.getDriver().findElement(RadioBtnDevicecolor2);
			break;



		}	

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {
			Generic.WriteTestData("Hover on '"+element+"'",element,"","Able to Hover on '"+element+"' button.","Hovered on '"+element+"'is unsucessfull .","Fail");
		}
		Generic.WriteTestData("Hover on '"+element+"'",element,"","Able to Hover on '"+element+"' button.","Hovered on '"+element+"' .","Passed");
	}

	/********************************************************************************************************************************/


	/********************************************************************************************************************************/
	public String getURLOfNewTab() {

		String title = "";
		try {
			Set<String> winID = DriverManager.getDriver().getWindowHandles();
			Iterator<String> winItr = winID.iterator();
			String parentID = winItr.next();
			String childID = winItr.next();

			DriverManager.getDriver().switchTo().window(childID);
			title = DriverManager.getDriver().getCurrentUrl();
			DriverManager.getDriver().close();
			DriverManager.getDriver().switchTo().window(parentID);

		} catch (Exception e) {
			System.out.println("FAIL : to get the tab title. Message :" + e.getMessage());
		}
		return title;
	}

	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
//	public void write_OrderID_in_PropertiesFile(String key, String data) {
//		FileOutputStream fileOut = null;
//		FileInputStream fileIn = null;
//		try {
//			Properties p = new Properties();
//
//			File file = new File(".//OrderID.properties");
//			fileIn = new FileInputStream(file);
//			p.load(fileIn);
//			p.setProperty(key, data);
//			fileOut = new FileOutputStream(file);
//			p.store(fileOut, null);
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		} finally {
//
//			try {
//				fileOut.close();
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
	/********************************************************************************************************************************/
	public void scroll_vertical(int y_Axis) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0," + y_Axis + ")", "");
	}
	public void enterText(String type, String ele, String value) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


			switch (ele) {	
			 case "search_field":
				 //get_search_field().clear();
				//get_search_field().sendKeys(value);;
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

	public void js_clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


			switch (ele) {
			case "COD":
				js.executeScript("arguments[0].click();", get_COD());
				break;
			case "Gcash":
				js.executeScript("arguments[0].click();", get_Gcash());
				break;			
			case "Colapsebutton1":
				js.executeScript("arguments[0].click();", get_Colapsebutton1());
				break;
			case "Submitbutton":
				js.executeScript("arguments[0].click();", get_Submitbutton());
				break;
			case "Colapsebutton2":
				js.executeScript("arguments[0].click();", get_Colapsebutton2());
				break;
			case "CCStraightpayment":
				js.executeScript("arguments[0].click();", get_CCStraightpayment());
				break;
			case "CCHSBC":
				js.executeScript("arguments[0].click();", get_CCHSBC());
				break;
			case "CCBPI":
				js.executeScript("arguments[0].click();", get_ccBPI());
				break;
			case "VisaMastercard":
				js.executeScript("arguments[0].click();", get_VisaMastercard());
				break;
			case "showBreakdown":
				js.executeScript("arguments[0].click();", get_showBreakdown());		
		         break;
			case "hideBreakdown":
				js.executeScript("arguments[0].click();", get_hideBreakdown());		
		         break;     
			case "viewBreakdown":
				js.executeScript("arguments[0].click();", get_viewBreakdown());		
		         break;
			case "Visa_MasterCard":
				js.executeScript("arguments[0].click();", get_Visa_MasterCard());		
		         break;
			case "GCash":
				js.executeScript("arguments[0].click();", get_GCash());		
		         break;
			case "cashOnDelivery":
				js.executeScript("arguments[0].click();", get_cashOnDelivery());		
		         break;
			case "StandardDelivery":
				js.executeScript("arguments[0].click();", get_StandardDelivery());		
		         break;
			case "IAcceptAllTerms_Conditions":
				js.executeScript("arguments[0].click();", get_IAcceptAllTerms_Conditions());		
		         break; 
			case "SubmitOrder":
				js.executeScript("arguments[0].click();", get_SubmitOrder());		
		         break;
			case "nextButton":
				js.executeScript("arguments[0].click();", get_nextButton());		
		         break;
			case "nxtButton":
				js.executeScript("arguments[0].click();", get_nxtButton());		
		         break;
			case "agree":
				js.executeScript("arguments[0].click();", get_agree());		
		         break;
			case "payBtn":
				js.executeScript("arguments[0].click();", get_payBtn());		
		         break;
			case "TrackMyOrder":
				js.executeScript("arguments[0].click();", get_TrackMyOrder());		
		         break;
			case "procced_btn":
		         js.executeScript("arguments[0].click();", get_procced_btn());		
		         break;
			case "CreditcardinstallBPI":
		         js.executeScript("arguments[0].click();", get_CreditcardinstallBPI());		
		         break;
			case "CreditcardHSBC":
		         js.executeScript("arguments[0].click();", get_CreditcardHSBC());		
		         break;     
			     




			}
		} 
		catch (ElementClickInterceptedException e1) {
			System.out.println( " : " + eleName + " : " + "Element is not clickable : " + e1.getMessage());
			Generic.WriteTestData("Click on '"+eleName+"'",eleName,"","Able to click on '"+eleName+"' button.","Clicking on '"+eleName+"' button is unsuccessfull.","Failed");
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println( " : " + eleName + " : " + "Element not found : " + e2.getMessage());
			Generic.WriteTestData("Click on '"+eleName+"'",eleName,"","Able to click on '"+eleName+"' button.","Clicking on '"+eleName+"' button is unsuccessfull.","Failed");
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println( " : " + eleName + " : " + "Exception : " + e.getMessage());
			Generic.WriteTestData("Click on '"+eleName+"'",eleName,"","Able to click on '"+eleName+"' button.","Clicking on '"+eleName+"' button is unsuccessfull.","Failed");
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + " : " + eleName);	
		Generic.WriteTestData("Click on '"+eleName+"'",eleName,"","Able to click on '"+eleName+"' button.","Clicked on '"+eleName+"' button.","Passed");
	}
	//=========== RONNIE SCRIPT ENDS HERE =============


	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {

			case "ShowBreakdown":
				get_ShowBreakdown().click();
				break;
			case "inclusion":
				get_inclusion().click();
				break;
			case "addonsubscripation":
				get_addonsubscripation().click();
				break;
			case "COD":
				get_COD().click();
				break;
			case "Gcash":
				get_Gcash().click();
				break;
			case "planApplicationHeader":
				get_planApplicationHeader().click();
				break;

			case "Colapsebutton1":
				get_Colapsebutton1().click();
				break;
			case "Submitbutton":
				get_Submitbutton().click();
				break;
			case "Addons":
				get_Addons().click();
				break;

			case "Colapsebutton2":
				get_Colapsebutton2().click();
				break;
			case "CCStraightpayment":
				get_CCStraightpayment().click();
				break;
			case "CCHSBC":
				get_CCHSBC().click();
				break;
			case "CCBPI":
				get_ccBPI().click();
				break;
			case "VisaMastercard":
				get_VisaMastercard().click();
				break;




			}
		} 
		catch (ElementClickInterceptedException e1) {
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
	public void jsClick(String message, String element) throws Exception {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "showBreakdown":
		         jse.executeScript("arguments[0].click();", get_showBreakdown());		
		         break;
			case "hideBreakdown":
		         jse.executeScript("arguments[0].click();", get_hideBreakdown());		
		         break; 
			case "OneTimePayment":
				jse.executeScript("arguments[0].click();", get_OneTimePayment());		
		         break;
			case "chargeToBill":
				jse.executeScript("arguments[0].click();", get_chargeToBill());		
		         break;
			case "viewBreakdown":
		         jse.executeScript("arguments[0].click();", get_viewBreakdown());		
		         break;
			case "StrigtPay":
				jse.executeScript("arguments[0].click();", get_StrigtPay());		
		         break;
			case "Visa_MasterCard":
		         jse.executeScript("arguments[0].click();", get_Visa_MasterCard());		
		         break;
			case "CreditcardHSBC":
				jse.executeScript("arguments[0].click();", get_CreditcardHSBC());		
		         break;
			case "CreditcardinstallBPI":
				jse.executeScript("arguments[0].click();", get_CreditcardinstallBPI());		
		         break;
			case "GCash":
		         jse.executeScript("arguments[0].click();", get_GCash());		
		         break;
			case "cashOnDelivery":
		         jse.executeScript("arguments[0].click();", get_cashOnDelivery());		
		         break;
			case "StandardDelivery":
		         jse.executeScript("arguments[0].click();", get_StandardDelivery());		
		         break;
			case "IAcceptAllTerms_Conditions":
		         jse.executeScript("arguments[0].click();", get_IAcceptAllTerms_Conditions());		
		         break; 
			case "SubmitOrder":
		         jse.executeScript("arguments[0].click();", get_SubmitOrder());		
		         break;
			case "nextButton":
		         jse.executeScript("arguments[0].click();", get_nextButton());		
		         break;
			case "nxtButton":
		         jse.executeScript("arguments[0].click();", get_nxtButton());		
		         break;
			case "agree":
		         jse.executeScript("arguments[0].click();", get_agree());		
		         break;
			case "payBtn":
		         jse.executeScript("arguments[0].click();", get_payBtn());		
		         break;
			case "TrackMyOrder":
		         jse.executeScript("arguments[0].click();", get_TrackMyOrder());		
		         break;
			case "chevron1":
		         jse.executeScript("arguments[0].click();", get_chevron1());		
		         break;
			case "chevron2":
		         jse.executeScript("arguments[0].click();", get_chevron2());		
		         break;
			case "chevron3":
		         jse.executeScript("arguments[0].click();", get_chevron3());		
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