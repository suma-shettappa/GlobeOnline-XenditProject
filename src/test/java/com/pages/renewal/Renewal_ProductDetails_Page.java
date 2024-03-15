package com.pages.renewal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;
import utility.Generic;

public class Renewal_ProductDetails_Page extends BasePage {

	

	static File file;

	By SpecifDocumentUpload=By.xpath("//ul[contains(@class,'go_upload_block-requirements go_text-small-regular-content-big ng-star-inserted')]");
	By DeliveryInfoCss=By.xpath("//div[text()='Delivery information']");	
	By Proceed=By.xpath("//button[@id='sticky-proceed-plan']");
	By SearchByDevice=By.xpath("//input[@placeholder='Search by device, brand']");
	By Addons=By.xpath("//div[text()=' Add-ons ']");
	By MPIN=By.xpath("//p[text()='Enter your 4-digit MPIN.']");	
	public By GCashMobilenumber=By.xpath("//div[@class='input-wrap']//input[@type='number']");
	By CreditCard=By.xpath("//span[text()='Credit Card']");
	By availableForDelivery=By.xpath("//span[text()=' Available for delivery ']");
	By errorDelMsg=By.xpath("//div[text()='Your address is out of our delivery area']");
	public By GCashLoginNext=By.xpath("//button[@class='ap-button ap-button-primary' and contains(text(),'NEXT')]");
    By NextIcon=By.xpath("//div[@class='owl-next']");
    By PDPplanIcon=By.xpath("//img[contains(@src,'plan.png')]");
    By PDPdataIcon=By.xpath("//img[contains(@src,'data.png')]");
    By PDPentertainmentIcon=By.xpath("//img[contains(@src,'entertainment.png')]");
    By PDPcallIcon=By.xpath("//img[contains(@src,'call.png')]");
    By PDProamingIcon=By.xpath("//img[contains(@src,'roaming.png')]");
    By SupportingDocsReq=By.xpath("//div[text()='Supporting document needed']");   
    By PDPPlanSection=By.xpath("//div[@class='owl-stage ng-tns-c58-4']");   
	By email = By.xpath("//input[@placeholder='Email Address']");
By UploadedDocPreview=By.xpath("(//div[@class='go_upload-preview']//img)[1]");
By UploadedDocName=By.xpath("(//div[@class='go_upload-content-wrapper go_uploaded']//span)[1]");
By MandatoryCheckbox=By.xpath("(//input[@id='flexCheckDefault'])[3]");
By AgreeBtn=By.xpath("//div[@class='submit-button confirm-button']");
By NextBtn=By.xpath("//div[@class='submit-button']//button");
By SubmitBtn=By.xpath("//div[@class='submit-button");
By PayBtn=By.xpath("//button[contains(text(),'PAY')]");    
	By Price_599WithDevice = By.xpath("(//span[contains(text(),'599')])[1]");
//	In PDP Device pLAN CAUROSELS
	By CarouselDeviceplanprevious = By.xpath("(//div[@class='owl-prev'])[1]");
	By CarouselDeviceplanNext = By.xpath("(//div[@class='owl-next'])[1]");
	By DeviceSearch = By.xpath("//input[@type='text']");
	By FifteenDevicesPerPage = By.xpath("//div[@class='go_device-image-wrapper']");
	By Deviceitem = By.xpath("//div[@id='deviceItem']");
	By Color_Click = By.xpath("(//input[@class='form-check-input'])[1]");
	By Color_color = By.xpath("(//input[@value='option1'])[1]");	
	public By RadioButtonColor = By.xpath("(//div[@id='deviceColor']/span[contains(text(),'')])[1]");
	public By RadioButtonColor1 = By.xpath("(//div[@id='deviceColor']/span[contains(text(),'')])[2]");	
	public By RadioBtnDevicecolor1=By.xpath("(//div[@id='deviceColor'])[1]");
	public By RadioBtnDevicecolor2=By.xpath("(//div[@id='deviceColor'])[2]");
	By RenewWihDevice = By
			.xpath("//div[@class='go_button-block']//a[@class='go_btn go_outline go_text-small-action :anchor-tag']");	
	By Proceedwithmyplan = By.xpath("(//button[contains(text(),'Proceed with my plan')])[1]");
	By ProceedwithChargeToBill=By.xpath("(//button[contains(text(),'Proceed with charge to bill')])[1]");	
	By movie_addon = By.xpath("//div[contains(text(),' Do you love watching shows and movies? ')]");	
		By PlanName2499=By.xpath("//strong[contains(text(),'GPlan 2499 ')]");
	By PlanValue = By.xpath("//div[@class='go_plan-breakdown-row go_plan-type']//span[contains(text(),'₱ ')]");
	By PlanValue2499 = By.xpath("//span[contains(text(),'₱ 2,499.00')]");	
	By TotalSubsandaddons_amount_General=By.xpath("(//span[contains(text(),'₱')])[2]");	
	By mysuperduo = By.xpath("(//div[contains(text(),'MySuperDuo')])[2]");	
	By ViuAddon = By.xpath("(//div[contains(text(),'Viu Premium')])[2]");
	By SpotifyAddon = By.xpath("(//div[text()='Spotify Premium'])[1]");	
	By EasyRoamaddon = By.xpath("(//div[contains(text(),'Easy Roam')])[2]");
	By GSAddSur99addon = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");	
	By UntickMySuperDuo=By.xpath("//div[text()=' MySuperDuo']");	
	By Price_1499WithDevice = By.xpath("(//span[contains(text(),'1499')])[2]");	
	/****************************************Renewal Scenario 4*************************************************************/
	
	By GplanAllData2499 = By.xpath("(//span[contains(text(),'GPlan SIM-Only All Data')])[1]");
	By GplanAllData2499Plan = By.xpath("(//span[contains(text(),'2499')])[1]");	
	By PlanConclusion = By.xpath("//span[contains(text(),'Plan inclusions')]");	
	By PlanNameAllData2499 = By.xpath("//strong[contains(text(),'GPlan SIM-Only All Data 2499')]");
	By PlanNameAllDataCost = By.xpath("//span[contains(text(),'₱ 2,499.00')]");
	By Totalsubsandaddons_amont2499 = By.xpath("//span[contains(text(),'₱ 1,275.00')]");
	By MontlyAllData2499 = By.xpath("//span[contains(text(),'₱ 3,774.00')]");	
	By SupportDocumentNeeded = By.xpath("//div[contains(text(),'Supporting document needed')]");	
// h2[contains(text(),'Ã¢â‚¬Å“Let me Google that!Ã¢â‚¬ï¿½')]");
By reserveThisDevice = By.xpath("//button[text()=' Reserve this device ']");
//////////////////////////////////////////////////////////////////////////




////////////////////////////////////////////////////////////////////////////////////////////////
By BasicBanner1 = By.xpath("//h2[contains(text(),'MOVE BEYOND THE AVERAGE')]");
By BasicBanner2 = By.xpath("//h2[contains(text(),'â€œAverageâ€  is boring')]");
By BasicBanner3 = By.xpath("//h2[contains(text(),'All fun')]");
By BasicBanner4 = By.xpath("//h2[contains(text(),'s simple pleasures')]");
By BasicBanner5 = By.xpath("//h2[contains(text(),'Entertainment on the go')]");
By BasicBanner6 = By.xpath("//h2[contains(text(),'Add to cart to your')]");
By BasicBanner7 = By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
By BasicBanner8 = By.xpath("//h2[contains(text(),'Do you need more data?')]");
By BasicBanner9 = By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");

By Planname_SimOnly999 = By.xpath("//strong[contains(text(),'GPlan Plus SIM-Only 999')]");
By Planname_SimOnly999_Price = By.xpath("//span[contains(text(),'â‚± 999.00')]");

By GSSurf99addon = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");
By Monthlybill_amountSimOnly999_GS99addon = By.xpath("(//span[contains(text(),'â‚± ')])[2]");
By Totalsubsandaddons_amountSimOnly999_GS99addon = By.xpath("//span[contains(text(),'â‚± 99.00')]");
By Monthlypayment_amountSimOnly999_GS99addon = By.xpath("(//strong[contains(text(),'mo.')])[2]");
By Contractduration_Value = By.xpath("//span[contains(text(),'mos.')]");



/********************************************************************************************************************************/
// Discovery Starter page
public By NextIcon1 = By.xpath("(//div[@class='owl-nav ng-star-inserted']//div[@class='owl-next'])");
public By nextIcon = By.xpath("(//div[@class='owl-nav ng-star-inserted']//div[@class='owl-next'])[2]");
public By BasicBtn_Discovery = By
		.xpath("//button[@class='btn discover-label' and contains(text(),' Discover Basic ')]");
By Disc_Basicbtn = By.xpath("(//button[contains(text(),' Get Started')])[3]");
// button[contains(text(),' Discover Basic')]");
By Submitbutton = By.xpath("//button[contains(text(),' Submit order ')]");
By SubmitOrder=By.xpath("//button[@id='payOrder']");
public By Disc_starterbtn = By.xpath("//button[contains(text(),' Discover Starter ')]");
By Disc_starterbtn_arrow = By.xpath("//span[@class='arrow-icon'])[4]");
By Starter_header = By.xpath("//h2[contains(text(),'A GREAT LIFE STARTS HERE')]");
By Build_btn = By.xpath("//div[contains(text(),' Build my plan ')]");
By Device_strtr_btn = By.xpath("//div[contains(text(),' Device ')]");
By GCash_strtr_btn = By.xpath("//div[contains(text(),' GCash ')]");
By Simonly_strtr_btn = By.xpath("//div[contains(text(),' Sim Only ')]");
By Simonly_basic_btn = By.xpath("//div[contains(text(),' SIM Only ')]");
By Alldata_strtr_btn = By.xpath("//div[contains(text(),' All-Data ')]");
By starterbanner1 = By.xpath("//h2[contains(text(),'A GREAT LIFE STARTS HERE')]");
By starterbanner2 = By.xpath("//h2[contains(text(),'For all the moments in-between')]");
By starterbanner3 = By.xpath("//h2[contains(text(),'The Starter plan is made for the tireless go-getter.')]");
By starterbanner4 = By.xpath("//h2[contains(text(),'The soundtrack of your life')]");

// h2[contains(text(),'Ã¢â‚¬Å“Let me Google that!Ã¢â‚¬ï¿½')]");
By starterbanner5 = By.xpath("//h2[contains(text(),'Reframe your lifestyle')]");
By starterbanner6 = By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
By starterbanner7 = By.xpath("//h2[contains(text(),'Do you need more data?')]");
By starterbanner8 = By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");

// Discoverysc2 banners validation
By bannervalidation1 = By.xpath(
		"//span[contains(text(),'Youâ€™ve got WiFi at work. Youâ€™ve got WiFi at home. Now get a plan is for the moments in between. The Starter Plan helps you stay connected when it matters!')]");
By Recomputemyplan = By.xpath("(//button[contains(text(),'Recompute my plan')])[1]");

// FTA_1-----PDP page for withdevice599

public By RenewWithThisDevice=By.xpath("(//a[contains(text(),'Renew with this device') and @class='go_button'])[1]");
By Price_599 = By.xpath("(//span[contains(text(),'599')])[1]");
By Color_header = By.xpath("//span[contains(text(),'Color or Finish')]");
By Capacity_header = By.xpath("//span[contains(text(),'Capacity')]");
By Contractduration_header = By.xpath("//span[contains(text(),'Contract duration')]");
By Banner = By.xpath("//div[@class='getaplan-with-device-image-wrapper']");
// Breakdown page
By Allaccess_data = By.xpath("//span[contains(text(),'All-access data')]");
By Gowifi_access = By.xpath("//span[contains(text(),'GoWifi access')]");
By List_ul = By.xpath("//ul[@class='list-ul']");
By Monthlycashout_header = By.xpath("//div[@class='monthly-with-onetime-cashout']");
By Plan_name = By.xpath("(//div[@class='gplan-with-device'])[3]");
By Plan_price = By.xpath("(//div[@class='plan-msf-price'])");
By Addonsheader = By.xpath("//span[contains(text(),'Subscriptions and Add-ons')]");
By Monthlybillheader = By.xpath("(//span[contains(text(),'Monthly Bill')])");
By Device = By.xpath("//div[@class='go_device-wrapper-footer go_plan-builder-sticky ng-star-inserted']//img");
By Devicename = By.xpath("//span[@class='go_text-h3-smallest-default']");
By Planname1 = By.xpath("//strong[@class='go_text-preamble']");
By Devicedetails = By.xpath("");
By Checkbox = By.xpath("");
By Checkbox2 = By.xpath("");
By Checkbox3 = By.xpath("");
By ProccedwithMyplan = By.xpath("");


By Banner1 = By.xpath("//div[@class='getaplan-with-device-image']");
By Planname = By.xpath("//strong[contains(text(),'GPlan 599 with Device')]");
By Plan_amount = By.xpath("//span[contains(text(),'â‚± 599.00')]");
By Subsandaddonheader = By.xpath("//span[contains(text(),'Subscriptions and Addâ€‘ons')]");
By MyDuoaddon = By.xpath("(//div[contains(text(),'MySuperDuo')])[1]");
By AmazonAddon = By.xpath("(//div[contains(text(),'Amazon Prime Video')])[2]");
By SURF = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");
By mysuper = By.xpath("(//div[contains(text(),'MySuperDuo')])[2]");

By Totalsubsandaddons = By.xpath("//strong[contains(text(),'Total subscriptions and addâ€‘ons')]");
By Totalsubsandaddons_amont = By.xpath("(//span[contains(text(),'â‚± ')])[2]");
By Monthlybill_header = By.xpath("//strong[contains(text(),'Monthly bill, subscriptions, and addâ€‘ons')]");
By Monthlybill_amount = By.xpath("(//span[contains(text(),'â‚± ')])[3]");
By Monthly_payment = By.xpath("(//span[text()='Monthly payment'])[2]");
// li[@class='go_footer-total-row']//span[text()='Monthly payment']");
By Monthlypayment_amount = By.xpath("(//strong[contains(text(),'/mo.')])[2]");
By inputmoblienum = By.xpath("//input[@id='go_plan-breakdown-number']");
By proceedbtn1 = By.xpath("(//button[contains(text(),'Proceed')])[1]");
By Breakdown_Mobilenum = By.xpath("//span[@class='go_text-preamble-small']");
By Breakdown_proceedbutton = By.xpath("//button[contains(text(),'Proceed with my plan')]");
// By = By.xpath("");
// Bhavana ADA 4 and ADA 7
// Gplanwith_Gcash599
By gcashverifiedtext = By.xpath("//div[@class='gcash-verify-text']");
By gcashcredits = By.xpath("//div[@class='d-flex flex-row g-cash-block']");
// Breakdownpage
By Breakdown_Gcashcredits = By.xpath("(//span[contains(text(),'GCash Credits')])[2]");
By Plannamegcash = By.xpath("//div[@class='go_text-preamble']");
By Gcashamount = By.xpath("(//span[contains(text(),'â‚± 599.00')])");
By Gcashamount_999 = By.xpath("(//span[contains(text(),'â‚± 999.00')])");
By Breakdownn_Viupremium = By.xpath("(//div[contains(text(),'Viu Premium')])[2]");
By Breakdownn_Spotifypremium = By.xpath("(//div[contains(text(),'Spotify Premium')])[1]");
By Breakdownn_EasyRoam = By.xpath("(//div[contains(text(),'Easy Roam')])[2]");
By Breakdownn_Gocallid = By.xpath("(//div[contains(text(),'GOCALLIDD 199')])[2]");
By Breakdownn_Gsaddsurf = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");

By Addonsamount = By.xpath("//span[contains(text(),'â‚± 1,275.00')]");
By Addonsamount_999 = By
		.xpath("//div[@class='go_plan-payment-breakdown-total-row go_total-amount']//span[contains(text(),'â‚± ')]");
By Addonsamount_599 = By
		.xpath("//div[@class='go_plan-payment-breakdown-total-row go_total-amount']//span[contains(text(),'â‚± ')]");

By Monthlyamount = By.xpath("//span[contains(text(),'â‚± 1,874.00')]");
By Monthlyamount_999 = By.xpath("//div[@class='go_plan-payment-breakdown-total-row']//span[contains(.,'â‚± ')]");
By Monthlyamount_599 = By.xpath("//div[@class='go_plan-payment-breakdown-total-row']//span[contains(.,'â‚± ')]");

By Gcash_Monthlypayment_amount = By.xpath("(//strong[contains(text(),'â‚± 1,874.00/mo.')])[2]");

// Gplanwithdevice2499

By PlannameGplanwithdevice = By.xpath("//div[@class='GPlan 2499 with Device']");
By Gplanwithdeviceamount = By.xpath("(//span[contains(text(),'â‚± 2,499.00')])");

By Selecteddevice = By.xpath("(//strong[@class='go_text-preamble'])[2])");
By Selecteddevice_amount = By.xpath("(//span[@class='go_text-preamble-small-semibold'])[2])");
By GplanwithdeviceMonthlyamount = By.xpath("//span[contains(text(),'â‚± 3,774.00/mo.')]");

By PlanBuilderPage = By.xpath("//h1[contains(text(),' Plan Builder - GCash ')]");
By PlanBuilderPage_Device = By.xpath("//h1[contains(text(),' Plan Builder - Device ')]");
By CustomizeGlobePlan=By.xpath("//h1[text()=' Customize Your Globe Plan ']");

public By FourthBannerTxt = By.xpath("//h2[contains(text(),'simple pleasures')]");
public By FifthBannerTxt = By.xpath("//div[@class='d-flex flex-column section-content-block']");
public By SixthBannerTxt = By.xpath("//div[@class='d-flex flex-column variation3-top-section']");
public By DevicesDisplayed = By.xpath("//div[@class='d-flex flex-column device-featute-wrapper']");
public By DevicesEligible = By.xpath("//div[@class='selection-phone-image']");

By HighlightedGPlanWithDevice999 = By.xpath("(//div[@class='d-flex flex-column plan-card blue-plan-card'])[1]");
By HighlightedGPlanWithDevice599 = By.xpath("(//div[@class='d-flex flex-column plan-card blue-plan-card'])[1]");

By HighlightedDeviceOpt = By.xpath("//button[@class='nav-link active']");
By HighlightedGPlanWithDevice1999 = By.xpath("(//div[@class='d-flex flex-column plan-card blue-plan-card'])[2]");
By HighlightedGPlanWithSimOnlyAllData1799 = By.xpath("(//div[@class='d-flex flex-column plan-card blue-plan-card'])[2]");
By HighlightedGPlanWithSimOnlyAllData1999 = By.xpath("(//div[@class='d-flex flex-column plan-card blue-plan-card'])[2]");

By GreatLife = By.xpath("//h2[text()='A GREAT LIFE STARTS HERE']");
By UntickMyDuo = By.xpath("//div[text()='MyDuo']");
By ViewBreakdown=By.xpath("//a[text()='View breakdown']");
By Overduebalance=By.xpath("//div[text()='Overdue Balance']");
By BreakdownCloseIcon=By.xpath("//img[contains(@src,'cross.svg')]");
By BreakdownHeader=By.xpath("//span[contains(text(),'breakdown: ')]");
By PostpaidRenewalHeader=By.xpath("//ul[@class='go_breadcrumbs go_pdp-breadcrumb']");

By HighlightedGplanDevice1499=By.xpath("(//div[@class='d-flex flex-column plan-card blue-plan-card']//span[text()='1499'])[2]");
By GplanWithDevice1499=By.xpath("(//span[text()='1499'])[2]");

By NoNeedDocs=By.xpath("//p[contains(text(),'No need to upload documents.')]");
By MoveBeyond = By.xpath("//h2[contains(text(),'MOVE BEYOND THE AVERAGE')]");
By HighlightedGplanSimonly999=By.xpath("(//div[@class='d-flex flex-column plan-card blue-plan-card']//span[text()='999'])[1]");
By MobileField=By.xpath("//input[@id='go_plan-breakdown-number']");
By FirstBannerTxt = By
		.xpath("//span[contains(text(),' Get through your day with a plan that packs a bit more oomph!')]");
public By Device_LandingPage = By.xpath("//div[@id='anchor_0' or contains(text(),'Device')]");
public By BasicPlanSimOnlyTxt = By.xpath("//strong[text()='Basic plan SIM only']");
public By GetStartedBtnSeventhBanner = By
		.xpath("//div[@class='d-flex flex-row get-started-button-icon']//a[@class='geststarted-anchortag']");
public By Eightbanner = By.xpath("//strong[text()='Plan styles for all lifestyles']");
By ValuePlanStyle = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'value')])[2]");
By LitePlanStyle = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'Lite')])[2]");
By BasicPlanStyle = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'basic')])[2]");
By LitePlanStyle1 = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'Lite')])[1]");
By BasicPlanStyle1 = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'basic')])[1]");
By ValuePlanStyle1 = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'value')])[1]");
By EssentialPlanStyle1 = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'eseential')])[1]");
By PlusPlanStyle1 = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'plus')])[1]");
By AlwaysOnPlanStyle1 = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'always')])[1]");

By StarterPlanStyle = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'starter')])[2]");
By StarterPlanStyle1=By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'starter')])[1]");
By EssentialPlanStyle = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'eseential')])[2]");
By PlusPlanStyle = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'plus')])[2]");
By ExtraPlanStyle = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'extra')])[2]");
By AlwaysOnPlanStyle = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'always')])[2]");
By ExtraPlanStyle1 = By.xpath("(//div[@class='plan-styles-image']//img[contains(@src,'extra')])[1]");

public By GCash_LandingPage = By.xpath("//div[@id='anchor_1' or contains(text(),' GCash ')]");
public By SimOnly_LandingPage = By.xpath("//div[contains(text(),' SIM Only ') or contains(text(),' Sim Only ')]");
public By GPlanPlusOnly_LandingPage = By.xpath("//div[text()=' GPlan Plus ']");
By owlnext = By.xpath("(//div[@class='owl-next'])[2]");

public By GplanPlus_LandingPage = By.xpath("//div[contains(text(),' GPlan Plus ')]");
public By AllData_LandingPage = By.xpath("//div[contains(text(),' All-Data ')]");
public By StarterAllData_LandingPage = By.xpath("//div[contains(text(),' AllData ') or contains(text(),' All-Data ')]");
public By BasicAllData_LandingPage = By.xpath("//div[contains(text(),' AllData ') or contains(text(),' All-Data ')]");
public By EssentialAllData_LandingPage=By.xpath("//div[contains(text(),' AllData ') or contains(text(),' All-Data ')]");
public By PlusAllData_LandingPage=By.xpath("//div[contains(text(),' AllData ') or contains(text(),' All-Data ')]");
public By ExtraAllData_LandingPage=By.xpath("//div[contains(text(),' AllData ') or contains(text(),' All-Data ')]");
public By AlwaysOnAllData_LandingPage=By.xpath("//div[contains(text(),' AllData ') or contains(text(),' All-Data ')]");


By NavToValuePlanWithDevice=By.xpath("//strong[text()='Value plan with Device']");
By NavToValuePlanWithGCash=By.xpath("//strong[text()='Value plan with GCash']");
By NavToValuePlanWithSimOnly=By.xpath("//strong[contains(text(),'Value plan SIM only') or contains(text(),'SIM-only')]");
By NavToValuePlanwithAllData=By.xpath("//strong[text()='Value plan All-Data']");

By NavToEssentialPlanWithDevice=By.xpath("//div[@class='starterplanwithdevice']//strong[text()='Essential plan with Device']");
By NavToEssentialPlanWithGCash=By.xpath("//strong[text()='Essential plan with GCash']");
By NavToEssentialPlanWithSimOnly=By.xpath("//strong[contains(text(),'Essential plan with SIM-only') or contains(text(),'GPlan Plus SIM-only ')]");
By NavToEssentialPlanWithAllData=By.xpath("//strong[contains(text(),'Essential plan All-Data')]");

By ChooseYourUnliApp=By.xpath("//div[@class='entertainment-add-ons-label' and text()=' Choose your unli app ']");
		
By NavToBasicPlanwithDevice = By.xpath("//strong[contains(text(),'Basic plan with Device')]");
By NavToExtraPlanwithDevice = By.xpath("//strong[contains(text(),'Extra plan with Device')]");
By SoundTrackOfYourLife=By.xpath("//h2[text()='The soundtrack of your life']");
By NavToStarterPlanwithDevice = By.xpath("//span//strong[text()='Starter plan with Device']");
By NavToLitePlanWithDevice=By.xpath("//strong[text()='Lite plan with Device']");
By NavToLitePlanwithAllData=By.xpath("//strong[text()='Lite plan All-Data']");
By NavToLitePlanWithGCash=By.xpath("//strong[text()='Lite plan with GCash']");
By NavToLitePlanWithSimOnly=By.xpath("//strong[contains(text(),'Lite plan SIM only') or contains(text(),'SIM-only')]");

By NavToBasicPlanWithDevice=By.xpath("//strong[text()='Basic plan with Device']");
By NavToBasicPlanwithAllData=By.xpath("//strong[contains(text(),'Basic plan All-Data')]");
By NavToBasicPlanWithGCash=By.xpath("//strong[text()='Basic plan with GCash']");
By NavToBasicPlanWithSimOnly=By.xpath("//strong[contains(text(),'Basic plan SIM only') or contains(text(),'GPlan Plus SIM-only ')]");

By NavToStarterPlanwithGCash = By.xpath("//span//strong[text()='Starter plan with GCash']");
By NavToStarterPlanwithSimOnly = By.xpath("//span//strong[contains(text(),'Starter plan SIM only') or contains(text(),'SIM-only')]");
By NavToStarterPlanwithAllData = By.xpath("//span//strong[text()='Starter plan All-Data']");
By GoogleThatBanner=By.xpath("//h2[text()='â€œLet me Google that!â€ ']");
By ReframeYourlifeStyle=By.xpath("//h2[text()='Reframe your lifestyle']");
By MobileDeviceCarousel=By.xpath("//div[@class='owl-stage ng-tns-c58-1' or @class='owl-stage ng-tns-c58-3' or @class='owl-stage ng-tns-c58-5']");
By MobileDeviceCarousel1=By.xpath("(//div[@class='owl-stage-outer ng-star-inserted'])[1]");
By MobileDeviceCarousel2=By.xpath("(//div[@class='owl-stage-outer ng-star-inserted'])[1]");

By nextArrow=By.xpath("(//div[@class='owl-next'])[2]");
By DataTypeBanner=By.xpath("//h2[text()='Do you need more data?']");
By BasicImg1=By.xpath("(//img[contains(@src,'basic')])[1]");
By BasicImg2=By.xpath("(//img[contains(@src,'basic')])[2]");
By ValueImg1=By.xpath("(//img[contains(@src,'value')])[1]");
By ValueImg2=By.xpath("(//img[contains(@src,'value')])[2]");

By EssentialImg2=By.xpath("(//img[contains(@src,'eseential')])[2]");
By EssentialImg3=By.xpath("(//img[contains(@src,'eseential')])[3]");

By EssentialBanner1=By.xpath("//h2[text()='WELCOME TO YOUR DIGITAL LIFESTYLE']");
By EssentialBanner3=By.xpath("//span[text()='Entertainment for days']");
By EssentialBanner4=By.xpath("//h2[text()='Never miss a beat']");
By EssentialBanner5=By.xpath("//span[text()='Online shopping, made easy']");



By ValueBanner1=By.xpath("//h2[text()='Simple. Straightforward. Sensible.']");
By ValueBanner3=By.xpath("//span[text()='A new whole']");
By ValueBanner4=By.xpath("//strong[text()='Sharing is caring']");
By ValueBanner5=By.xpath("//h2[text()='A plan that works so you can play']");
By DataSoundsLikeMusic=By.xpath("//h2[text()='3 GB of data sounds like music']");
By PlusImg1=By.xpath("(//img[contains(@src,'plus')])[1]");
By PlusImg2=By.xpath("(//img[contains(@src,'plus')])[2]");
By PlusBanner1=By.xpath("//h2[text()='A great life starts here']");
By PlusBanner3=By.xpath("//div[@class='top-headline']//h2[contains(text(),'Add')]");
By PlusBanner4=By.xpath("//strong[text()='Itâ€™s more than a phone']");
//By DeviceTab=By.xpath("//button[text()=' Device ']");
By PlusBanner5=By.xpath("//h2[text()='Add to cart to your']");
By GplanSimOnlyTab=By.xpath("//button[text()=' GPlan SIM-only ']");
By GCashTab=By.xpath("//button[text()=' GCash ']");
By SimOnlyPDP=By.xpath("//button[text()=' SIM-Only ']");
By MatchPerfect=By.xpath("//span[contains(text(),' find your perfect match!')]");
By DeviceHighlighted=By.xpath("//button[text()=' Device ' and @class='nav-link active']");
By ContractDuration=By.xpath("//span[text()='Contract duration']");
By Color=By.xpath("//span[text()='Color or Finish']");
By HBOGo=By.xpath("//h2[text()='Take your pick.']");
By AlwaysOnImg1=By.xpath("(//img[contains(@src,'always')])[1]");
By AlwaysOnImg2=By.xpath("(//img[contains(@src,'always')])[2]");
By AlwaysOnBanner1=By.xpath("//h2[text()='The plan that can keep up with you']");
By AlwaysOnBanner3=By.xpath("//span[text()='HD. 4k. Prepare for impact.']");
By AlwaysOnBanner4=By.xpath("//span[text()='Stream up to 2 hours of high-quality music a day ']");
By AlwaysOnBanner5=By.xpath("//span[text()='Always on, always on call']");

By NavToAlwaysOnPlanWithDevice=By.xpath("//strong[text()='Always On plan with Device']");
By NavToAlwaysOnPlanWithGCash=By.xpath("//strong[text()='Always On plan with GCash']");
By NavToAlwaysOnPlanWithSimOnly=By.xpath("//strong[contains(text(),'Always On plan with Sim-only') or contains(text(),'GPlan Plus SIM-only ')]");
By NavToAlwaysOnPlanWithAllData=By.xpath("//strong[contains(text(),'Always On plan All-Data')]");





By ExtraImg1=By.xpath("(//img[contains(@src,'extra')])[1]");
By ExtraImg2=By.xpath("(//img[contains(@src,'extra')])[2]");
By ExtraBanner1=By.xpath("//h2[text()='EXTRAORDINARY']");

By ExtraBanner3=By.xpath("//span[contains(text(),'All the entertainment, with data to spare')]");
By ExtraBanner4=By.xpath("//h2[contains(text(),'Work better')]");
By ExtraBanner5=By.xpath("//span[contains(text(),'When it comes to games, weâ€™re not playing around')]");

By NavToExtraPlanWithDevice=By.xpath("//strong[text()='Extra plan with Device']");
By NavToExtraPlanWithGCash=By.xpath("//strong[text()='Extra plan with GCash']");
By NavToExtraPlanWithSimOnly=By.xpath("//strong[contains(text(),'Extra plan with SIm-only') or contains(text(),'GPlan Plus SIM-only ')]");
By NavToExtraPlanWithAllData=By.xpath("//strong[contains(text(),'Extra plan All-Data')]");


By NavToPlusPlanWithDevice=By.xpath("//strong[text()='Plus plan with Device']");
By NavToPlusPlanWithGCash=By.xpath("//strong[text()='Plus plan with GCash']");
By NavToPlusPlanWithSimOnly=By.xpath("//strong[contains(text(),'Plus plan with SIM-only') or contains(text(),'GPlan Plus SIM-only ')]");
By NavToPlusPlanWithAllData=By.xpath("//strong[contains(text(),'Plus plan All-Data')]");



By LiteBanner=By.xpath("(//img[contains(@src,'Lite')])[1]");
By LiteBanner2=By.xpath("(//img[contains(@src,'Lite')])[2]");
By BrightNewDay=By.xpath("//h2[contains(text(),'Bright New Day')]");
By KeepInTouch=By.xpath("//h2[text()='Keep in touch']");
By KeepThoseConnections=By.xpath("//span[text()='Keep those connections']");
By NavToBasicPlanwithGCash = By
		.xpath("//div[@class='starterplanwithdevice']//strong[contains(text(),'Basic plan with GCash')]");
By NavToExtraPlanwithGCash = By
		.xpath("//div[@class='starterplanwithdevice']//strong[contains(text(),'Extra plan with GCash')]");

By NavToBasicPlanwithSimOnly = By.xpath("//strong[contains(text(),'Basic plan SIM only') or contains(text(),'GPlan Plus SIM-only ')]");
By NavToExtraPlanwithSimOnly = By.xpath("//strong[contains(text(),'Extra plan SIM only')]");

//By NavToBasicPlanwithAllData = By.xpath("//strong[contains(text(),'Basic plan All-Data')]");
By NavToExtraPlanwithAllData = By.xpath("//strong[contains(text(),'Extra plan All-Data')]");

// Addons
By Data_addon = By.xpath("//div[contains(text(),' Do you use lots of data? ')]");


By Entertainment_CheckBox=By.xpath("//input[@id='loveEntertainment']");

By message_addon = By.xpath("//div[contains(text(),' Prefer talking over messaging? ')]");

By PreferTalking=By.xpath("//input[@id='preferTalking']");
By lifestyle_addon = By.xpath("//div[contains(text(),' Are you all about the jet-setting lifestyle? ')]");





By inputMobileNumber = By.xpath("//input[@id='otpMsisdnInput']");


By Monthlybill = By.xpath("//div[@class='monthlybill-amount']");
By Viewplanbreakdwn = By.xpath("//span[contains(text(),'View Plan Breakdown')]");
By dropdown_Planbreakdwn = By.xpath("//div[@class='hide-tab-content-image']");
By Reviewmyplan = By.xpath("//div[contains(text(),'Review my plan')]");
By Dragbutton = By.xpath("//div[@class='go_sticky-footer-drag-arrow']");
By CarouselDevicePrevBtn = By.xpath("(//div[@class='owl-prev'])[2]");
public By CarouselDeviceNextBtn = By.xpath("(//div[@class='owl-next'])[2]");

// Vishnu - ADA3 Xpaths

By PlanName = By.xpath("//strong[contains(text(),'GPlan 1499 with Device')]");
By Plan_Amount = By.xpath("//span[contains(text(),'â‚± 1,499.00')]");
By DeviceName = By.xpath("//strong[contains(text(),'')]");
By SubsAndAddonHeader = By.xpath("//span[contains(text(),'Subscriptions and Addâ€‘ons')]");
By MySuperDuo1 = By.xpath("(//div[contains(text(),'MySuperDuo')])[2]");
By AmazonPrimeVideoAddon = By.xpath("(//div[contains(text(),'Amazon Prime Video')])[2]");
By ViuPremiumAddon = By.xpath("(//div[contains(text(),'Viu Premium')])[2]");
By SpotifyPremium1 = By.xpath("(//div[contains(text(),'Spotify Premium')])[2]");
By EastRoamAddon = By.xpath("(//div[contains(text(),'Easy Roam')])[2]");
By GOCALLIDDAddon = By.xpath("(//div[contains(text(),'GOCALLIDD 199')])[2]");
By GSAddSurf = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");
// By Totalsubsandaddons = By.xpath("//strong[contains(text(),'Total
// subscriptions and addâ€‘ons')]");
By TotalSubsandAddons_amount = By.xpath("//span[contains(text(),'â‚± 1,424.00')]");
// By Monthlybill_header = By.xpath("//strong[contains(text(),'Monthly bill,
// subscriptions, and addâ€‘ons')]");
// By Monthlybill_amount = By.xpath("//span[contains(text(),'â‚±
// 2,923.00')]");
// By Monthly_payment = By.xpath("(//span[contains(text(),'Monthly
// payment')])[3]");
// By Monthlypayment_amount = By.xpath("(//strong[contains(text(),'â‚±
// 2,923.00/mo.')])");
By Inputmoblienum = By.xpath("//input[@id='go_plan-breakdown-number']");
By ProceedBtn = By.xpath("(//button[contains(text(),'Proceed')])[1]");
// By Breakdown_Mobilenum =
// By.xpath("//span[@class='go_text-preamble-small']");
// By Breakdown_proceedbutton = By.xpath("//button[contains(text(),'Proceed
// with my plan')]");

// ADA6
By DiscooverPlus = By.xpath("//button[contains(text(),' Discover Plus ')]");
By Bannerplus1 = By.xpath("//h2[contains(text(),'Do more, Get more, Be more')]");
By Bannerplus2 = By.xpath("//h2[contains(text(),'Embrace lifeâ€™s positives')]");
By Bannerplus3 = By.xpath("//h2[contains(text(),'Everything you need, plus more')]");
By Bannerplus4 = By.xpath(
		"//span[contains(text(),'Power up your playlist with over 3,000 high quality songs and enjoy up to 180 minutes of non-stop music streaming every day.')]");
By Bannerplus5 = By.xpath("//h2[contains(text(),'Itâ€™s a lifestyle')]");
By Bannerplus6 = By.xpath("//span[contains(text(),'Online shopping, made easy')]");
By Bannerplus7 = By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
By Bannerplus8 = By.xpath("//h2[contains(text(),'Do you need more data?')]");
By Bannerplus9 = By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");

By Gplan1799 = By.xpath("(//span[contains(text(),'1799')])[2]");
By Gplan1999 = By.xpath("(//span[contains(text(),'GPlan SIM-Only All Data')]//following::span[text()='1999'])[2]");
// div[@class='price']//span[text()='1799']");
// By Review=By.xpath("//div[text()='Review my plan']");
By Banner2 = By.xpath("//div[@class='getaplan-with-device-image']");
By planename1999 = By.xpath("//strong[contains(text(),'GPlan SIM-Only All Data 1999')]");

By planeamount1999 = By.xpath("(//span[contains(text(),'â‚± ')])[1]");

By planename1799 = By.xpath("//strong[contains(text(),'GPlan All Data 1799 ')]");
By planeamount1799 = By.xpath("(//span[contains(text(),'â‚± ')])[1]");
By totalpluse = By.xpath("//span[contains(text(),'â‚± 848.00')]");
By monthlybillpay1799 = By.xpath("(//span[contains(text(),'â‚± ')])[3]");
By monthlybillpay1999 = By.xpath("(//span[contains(text(),'â‚± ')])[3]");
By monthlypaymentamount1999 = By.xpath("(//strong[contains(text(),'/mo.')])[2]");

By monthlypaymentamount1799 = By.xpath("(//strong[contains(text(),'/mo.')])[2]");
By panenameDAF = By.xpath("//div[contains(text(),'GPlan All Data 1799 ')]");

/*************** ADA 1 STARTS HERE **********************/
By GplanSimonly599 = By.xpath("//strong[contains(text(),'GPlan Plus SIM-Only 599')]");
By SimOnly599GOCALLIDD199 = By.xpath("(//div[contains(text(),'GOCALLIDD 199')])[2]");
By Addonamount599 = By.xpath("//span[contains(text(),'â‚± 1,325.00')]");
By Monthyaddon599 = By.xpath("//span[contains(text(),'â‚± 1,924.00')]");
By Totalmontlypaymentsimonly599 = By.xpath("(//strong[contains(text(),'â‚± 1,924.00/mo.')])[2]");
// By movie_checkboxAddon1 = By.xpath("(//strong[contains(text(),'â‚±
// 1,775.00/mo.')])[2]");

By showsAndMoviesToggle = By.xpath("(//span[@class='slider round'])[1]");
By AmazonprimeVideoaddon599 = By.xpath("(//div[contains(text(),'Amazon Prime Video')])[1]");
By viupremiuum599 = By.xpath("(//div[contains(text(),' Viu Premium ')])[1]");
By spotifypremiuum599 = By.xpath("(//div[contains(text(),'Spotify Premium')])[1]");
// Prefer talking over messaging? Addon
By TalkingovermessageAddOn = By.xpath("(//span[@class='slider round'])[2]");
// Are you all about the jet-setting lifestyle? Addon
By lifestylemessageAddOn = By.xpath("(//span[@class='slider round'])[3]");

/*************** ADA 1 ENDS HERE **********************/

// ADA7
By Discoveralwayson = By.xpath("//button[contains(text(),' Discover Always On ')]");
By starterbanner1Always = By.xpath("//h2[contains(text(),'A NEW plan that can keep up with you')]");
By starterbanner2Always = By.xpath("//h2[contains(text(),'A plan designed to keep up')]");
By starterbanner3Always = By.xpath("//span[contains(text(),'Stay connected')]");
By starterbanner4Always = By.xpath("//span[contains(text(),'HD. 4k. Prepare for impact.')]");
By starterbanner5Always = By.xpath("//span[contains(text(),'Curate the soundtrack of your life ')]");
By starterbanner6Always = By.xpath("//span[contains(text(),'Always on, always on call')]");
By starterbanner7Always = By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
By starterbanner8Always = By.xpath("//h2[contains(text(),'Do you need more data?')]");
By starterbanner9Always = By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");

// Discovery sc2 banners validation
By banner2device = By.xpath("//div[contains(text(),'Device')]");
By banner2gcash = By.xpath("//div[contains(text(),' GCash ')]");
By banner2gpluse = By.xpath("//div[contains(text(),' GPlan Plus ')]");
By banner2alldata = By.xpath("//div[contains(text(),' AllData ')]");

By deviceclick = By.xpath("//strong[contains(text(),'Starter plan with Device')]");
By gcashclick = By.xpath("//strong[contains(text(),'Starter plan with GCash')]");
By pluseclick = By.xpath("//strong[contains(text(),'Starter plan SIM only')]");
By alldataclick = By.xpath("//strong[contains(text(),'Starter plan All-Data')]");

By GetStarted_PlanWithGCash = By.xpath("(//span[text()='Get started'])[2]");
By GetStarted_EssentialPlanwithDevice=By.xpath("((//span[text()='Get started']))[1]");

By DeviceTab=By.xpath("//div[text()=' Device ']");
By SimOnlyTab = By.xpath("//button[text()=' SIM-Only ']");
By AllDataTab = By.xpath("//button[text()=' All-Data ']");
By GPlanPlusSimOnly999 = By.xpath("(//span[text()='GPlan Plus SIM-Only']//following::div//span[text()='999'])[1]");
By GPlanWithSimOnly999=By.xpath("(//span[text()='GPlan SIM-only']//following::div//span[text()='999'])[1]");
By Checkbutton = By.xpath("//input[@class='go_primary-button mnp-check-eligibility']");
By GPlanDevice1499 = By.xpath("(//span[text()='GPlan with Device']//following::div//span[text()='1499'])[2]");

By YoutubeOpt=By.xpath("(//div[@class='entertainment-content-block ng-star-inserted']//img)[1]");

public By SelectDevice = By.xpath("(//button[text()='Select & customize'])[1]");
By GPlanSimOnlyAllData1999 = By.xpath("(//span[text()='GPlan SIM-Only All Data']//following::div//span[text()='1999'])[2]");
By GPlanSimOnlyAllData1799 = By.xpath("(//span[text()='GPlan SIM-Only All Data']//following::div//span[text()='1799'])[2]");
By GCashOption_PDP=By.xpath("//button[text()=' GCash ']");


/********************************************************************************************************************************/

By productGallery = By.xpath("//li[text()='Product Gallery']");
By productDetails = By.xpath("//li[text()='Product Details']");
By deviceNameinPDPage = By.xpath("//div[@class='go_text-h1']");
By color_Finish = By.xpath("//span[text()='Color/Finish']//following-sibling::div//label");
By capacity = By.xpath("//span[text()='Capacity']//following::span[1]");
By contractDuration = By.xpath("//span[text()='Contract duration']//following::span[1]");
By cashoutAmount = By.xpath("//span[text()='Cashout Amount']//following-sibling::span");
By forReservationTag = By.xpath("//span[text()='For reservation']");
By note = By.xpath("//span[contains(text(),'Note:')]");
By wantToknowAboutGplans = By.xpath("//div[text()='Want to know more about our new GPlans?']");
By discoverGplanBelow = By.xpath("//span[text()='Discover GPlans below.']");
By planCard = By.xpath("//div[@class='go_carousel-list-wrapper go_no-overflow']");
By renewwithThisDevice = By.xpath("//button[text()=' Renew with this device ']");
By selectAnotherDevice = By.xpath("//span[text()='Select another device']");
By features = By.xpath("//a[text()='Features']");
By promos = By.xpath("//a[text()='Promos']");
//By faqText1 = By.xpath("(//div[@class='item-text'])[1]");
//By faqText2 = By.xpath("(//div[@class='item-text'])[2]");
//By faqText3 = By.xpath("(//div[@class='item-text'])[3]");
//By faqText4 = By.xpath("(//div[@class='item-text'])[4]");
//By faqText5 = By.xpath("(//div[@class='item-text'])[5]");
//By faqText6 = By.xpath("(//div[@class='item-text'])[6]");
By buildMyPlan = By.xpath("//div[text()=' Build my plan ']");

/**************************************Main PDP Page****************************************************/
By planbuilderPage = By.xpath("//h1[text()=' Acquisition Plan Builder - Device ']");
By PDP_Device = By.xpath("//button[contains(text(),' Device ')]");
By PDP_Gcash = By.xpath("//button[contains(text(),' GCash ')]");
By PDP_Simonly = By.xpath("//button[contains(text(),' SIM-Only ')]");
By PDP_Alldata = By.xpath("//button[contains(text(),' All-Data ')]");
By PlanCard = By.xpath("//div[@class='plan-card-list']");
By Devicecarousel = By.xpath("//div[@class='pb-md-owl-carousel-wrapper ng-star-inserted']");
By ViewAllDevicesLinkInPdPage = By.xpath("(//a[text()='View all devices'])[1]");
By color_Finish1 = By.xpath("//span[text()='Color or Finish']");
By Diff_Colors = By.xpath("//input[@name='inlineRadioOptions']");
By capacity1 = By.xpath("//span[text()='Capacity']//following::div[4]//span");
By contractDuration1 = By.xpath("//span[text()='Contract duration']//following::div[3]//span");
//By Preper_esimOr_PhysicalSim = By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");
//By Preper_esimOr_PhysicalSim = By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");
//By Preper_esimOr_PhysicalSim = By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");



//Addons
By DoYouUseLotsOfData = By.xpath("//div[contains(text(),' Do you use lots of data? ')]");
By Data_checkbox = By.xpath("(//span[@class='slider round'])[1]");
By GSAddsurf99 = By.xpath("//div[contains(text(),' GS Add Surf 99')]");

By DoYouLoveWatchingShowsAndMovies = By.xpath("//div[contains(text(),' Do you love watching shows and movies? ')]");
By movie_checkbox = By.xpath("(//span[@class='slider round'])[2]");
By Amazonprime = By.xpath("//div[contains(text(),' Amazon Prime Video ')]");
By Viupremium = By.xpath("//div[contains(text(),' Viu Premium ')]");
By Spotifypremium = By.xpath("//div[contains(text(),' Spotify Premium ')]");

By PreferTalkingOverMessaging = By.xpath("//div[contains(text(),' Prefer talking over messaging? ')]");
By message_checkbox = By.xpath("(//span[@class='slider round'])[3]");
By MyDuo = By.xpath("//div[contains(text(),' MyDuo')]");
By MySuperDuo = By.xpath("//div[contains(text(),' MySuperDuo')]");

By AreYouAllAboutTheJetSettingLifestyle = By.xpath("//div[contains(text(),' Are you all about the jet-setting lifestyle? ')]");
By lifestyle_checkbox = By.xpath("(//span[@class='slider round'])[4]");
By easyRoam = By.xpath("//div[contains(text(),' Easy Roam')]");
By Gocallid199 = By.xpath("//div[contains(text(),' GOCALLIDD 199')]");


//FAQ
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
//Review My plan details
By ReviewMyPlan = By.xpath("//div[text()='Review my plan']");
By DeviceNameInReviewMyPlan = By.xpath("(//div[@class='go_device-info go_plan-builder-sticky']//span)[1]");
By DeviceCapacityInReview = By.xpath("(//div[@class='go_device-info go_plan-builder-sticky']//span)[3]");
By ContactDerationInReview = By.xpath("(//span[text()='Contract Duration:']//following::strong)[1]");

By All_access_data = By.xpath("//span[text()='All-access data ']//following::span[1]");
By GoWifi_access = By.xpath("//span[text()=' GoWifi access ']//following::span[1]");

By Unli_All_net = By.xpath("//span[text()=' Call and text ']//following::span[1]");
By Plan_inclusions = By.xpath("//span[text()='Plan inclusions']");
By Konsulta_Sub = By.xpath("//li[text()=' Konsulta MD Free personal subscription']");
By Glnsure_Sub = By.xpath("//li[text()=' Glnsure 3-months subscription']");

By gplan_withDevice = By.xpath("//div[@class='go_plan-breakdown-row go_plan-type']//strong");
By Subscriptions_Addons = By.xpath("//span[text()='Subscriptions and Add‑ons']");
By My_Super_Duo = By.xpath("//div[text()='MySuperDuo']//following::span[1]");
By Amazon_Prime_Video = By.xpath("//div[text()='Amazon Prime Video']//following::span[1]");
By Viu_Premium = By.xpath("//div[text()='Viu Premium']//following::span[1]");
By Spotify_Premium = By.xpath("//div[text()='Spotify Premium']//following::span[1]");
By GOCALLIDD_199 = By.xpath("//div[text()='GOCALLIDD 199']//following::span[1]");
By Easy_Roam = By.xpath("//div[text()='Easy Roam']//following::span[1]");
By GS_Add_Surf_99 = By.xpath("//div[text()='GS Add Surf 99']//following::span[1]");

By Total_subscriptions_and_addons = By.xpath("//strong[text()='Total subscriptions and add‑ons']//following::span[1]");
By MonthlyBill_subscriptions_and_addons = By.xpath("//strong[text()='Monthly bill, subscriptions, and add‑ons']//following::span[1]");
By Monthly_Payment = By.xpath("(//span[text()='Monthly payment'])[2]//following::strong[1]");
By OneTimeDevice_Cashout = By.xpath("//span[text()='One-time device cost']//following::strong");

By Mobilenumfield = By.xpath("//input[@id='otpMsisdnInput']");
By Proceedbtn = By.xpath("(//button[contains(text(),'Proceed')])[1]");


//Plan Breakdown page
By Mobile_Number = By.xpath("//div[@class='go_mobile-display']//span");
By ProceedWithMyPlanButton = By.xpath("//button[contains(text(),'Proceed with my plan')]");
///////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////
public WebElement get_SimOnlyTab() {
	return DriverManager.getDriver().findElement(SimOnlyTab);

}


public WebElement get_AllDataTab() {
	return DriverManager.getDriver().findElement(AllDataTab);

}

public WebElement get_GPlanSimOnlyAllData1799() {
	return DriverManager.getDriver().findElement(GPlanSimOnlyAllData1799);

}

public WebElement get_GPlanPlusSimOnly999() {
	return DriverManager.getDriver().findElement(GPlanPlusSimOnly999);

}


public WebElement get_banner2device() {
	return DriverManager.getDriver().findElement(banner2device);

}
public WebElement get_DeviceTab() {
	return DriverManager.getDriver().findElement(DeviceTab);

}
public WebElement get_GplanWithDevice1499() {
	return DriverManager.getDriver().findElement(GplanWithDevice1499);

}
public WebElement get_GPlanSimOnlyAllData1999() {
	return DriverManager.getDriver().findElement(GPlanSimOnlyAllData1999);

}
public WebElement get_GCashOption_PDP() {
	return DriverManager.getDriver().findElement(GCashOption_PDP);

}


public WebElement get_AlwaysOnImg1() {
	return DriverManager.getDriver().findElement(AlwaysOnImg1);

}
public WebElement get_AlwaysOnImg2() {
	return DriverManager.getDriver().findElement(AlwaysOnImg2);

}

public WebElement get_nextArrow() {
	return DriverManager.getDriver().findElement(nextArrow);

}

public WebElement get_ValueImg1() {
	return DriverManager.getDriver().findElement(ValueImg1);

}
public WebElement get_ValueImg2() {
	return DriverManager.getDriver().findElement(ValueImg2);

}

public WebElement get_EssentialImg2() {
	return DriverManager.getDriver().findElement(EssentialImg2);

}

public WebElement get_EssentialImg3() {
	return DriverManager.getDriver().findElement(EssentialImg3);

}


public WebElement get_BasicImg2() {
	return DriverManager.getDriver().findElement(BasicImg2);

}
public WebElement get_BasicImg1() {
	return DriverManager.getDriver().findElement(BasicImg1);

}
public WebElement get_PlusImg2() {
	return DriverManager.getDriver().findElement(PlusImg2);

}
public WebElement get_PlusImg1() {
	return DriverManager.getDriver().findElement(PlusImg1);

}

public WebElement get_banner2gcash() {
	return DriverManager.getDriver().findElement(banner2gcash);

}

public WebElement get_banner2gpluse() {
	return DriverManager.getDriver().findElement(banner2gpluse);

}

public WebElement get_banner2alldata() {
	return DriverManager.getDriver().findElement(banner2alldata);

}

public WebElement get_GetStarted_PlanWithGCash() {
	return DriverManager.getDriver().findElement(GetStarted_PlanWithGCash);

}
public WebElement get_GetStarted_EssentialPlanwithDevice() {
	return DriverManager.getDriver().findElement(GetStarted_EssentialPlanwithDevice);

}


public WebElement get_starterbanner1() {
	return DriverManager.getDriver().findElement(starterbanner1);

}

public WebElement get_starterbanner2() {
	return DriverManager.getDriver().findElement(starterbanner2);

}

public WebElement get_starterbanner3() {
	return DriverManager.getDriver().findElement(starterbanner3);

}


public WebElement get_Planname_SimOnly999() {
	return DriverManager.getDriver().findElement(Planname_SimOnly999);
}

public WebElement get_GplanSimonly599() {
	return DriverManager.getDriver().findElement(GplanSimonly599);

}

/********************************************************************************************************************************/
public WebElement get_Breakdown_proceedbutton() {
	return DriverManager.getDriver().findElement(Breakdown_proceedbutton);
}

/********************************************************************************************************************************/
public WebElement get_Disc_starterbtn_arrow() {
	return DriverManager.getDriver().findElement(Disc_starterbtn_arrow);
}


/********************************************************************************************************************************/
public WebElement get_Disc_starterbtn() {
	return DriverManager.getDriver().findElement(Disc_starterbtn);
}

public WebElement get_Discoveralwayson() {
	return DriverManager.getDriver().findElement(Discoveralwayson);

}

/*******************************************/
public WebElement get_Discover_plus() {
	return DriverManager.getDriver().findElement(DiscooverPlus);

}

/********************************************************************************************************************************/
public WebElement get_Build_btn() {
	return DriverManager.getDriver().findElement(Build_btn);
}

/********************************************************************************************************************************/
public WebElement get_Device_strtr_btn() {
	return DriverManager.getDriver().findElement(Device_strtr_btn);
}

/********************************************************************************************************************************/
public WebElement get_GCash_strtr_btn() {
	return DriverManager.getDriver().findElement(GCash_strtr_btn);
}

/********************************************************************************************************************************/
public WebElement get_Simonly_strtr_btn() {
	return DriverManager.getDriver().findElement(Simonly_strtr_btn);
}

/********************************************************************************************************************************/
public WebElement get_Alldata_strtr_btn() {
	return DriverManager.getDriver().findElement(Alldata_strtr_btn);
}



/********************************************************************************************************************************/
public WebElement get_dropdown_Planbreakdwn() {
	return DriverManager.getDriver().findElement(dropdown_Planbreakdwn);
}

public WebElement get_inputmoblienum() {
	return DriverManager.getDriver().findElement(inputmoblienum);
}


/***********************************************************************/
public WebElement get_Surf() {
	return DriverManager.getDriver().findElement(SURF);
}

/**********************************************************************/
public WebElement get_super() {
	return DriverManager.getDriver().findElement(mysuper);
}

/*******************************************/
public WebElement get_Gplan1799() {
	return DriverManager.getDriver().findElement(Gplan1799);
}

/*************** ADA 1 STARTS HERE **********************/
// Shows and Movies
public WebElement get_showsAndMoviesToggle() {
	return DriverManager.getDriver().findElement(showsAndMoviesToggle);
}

public WebElement get_AmazonprimeVideoaddon599() {
	return DriverManager.getDriver().findElement(AmazonprimeVideoaddon599);
}

public WebElement get_viupremiuum599() {
	return DriverManager.getDriver().findElement(viupremiuum599);
}

public WebElement get_spotifypremiuum599() {
	return DriverManager.getDriver().findElement(spotifypremiuum599);
}

public WebElement get_TalkingovermessageAddOn() {
	return DriverManager.getDriver().findElement(TalkingovermessageAddOn);
}

public WebElement get_lifestylemessageAddOn() {
	return DriverManager.getDriver().findElement(lifestylemessageAddOn);
}



/********************************************************************************************************************************/
public WebElement get_productDetails() {
	return DriverManager.getDriver().findElement(productDetails);
}

/********************************************************************************************************************************/
public WebElement get_productGallery() {
	return DriverManager.getDriver().findElement(productGallery);
}


/********************************************************************************************************************************/
public WebElement get_reserveThisDevice() {
	return DriverManager.getDriver().findElement(reserveThisDevice);
}

/********************************************************************************************************************************/
public WebElement get_selectAnotherDevice() {
	return DriverManager.getDriver().findElement(selectAnotherDevice);
}

/********************************************************************************************************************************/
public List<WebElement> get_Diff_Colors() {
	return DriverManager.getDriver().findElements(Diff_Colors);
}


/********************************************************************************************************************************/
public WebElement get_capacity1() {
	return DriverManager.getDriver().findElement(capacity1);
}

/********************************************************************************************************************************/
public WebElement get_contractDuration1() {
	return DriverManager.getDriver().findElement(contractDuration1);
}

/******************************************************************************************************************************/
public WebElement get_DeviceNameInReviewMyPlan() {
	return DriverManager.getDriver().findElement(DeviceNameInReviewMyPlan);
}

/********************************************************************************************************************************/
public WebElement get_DeviceCapacityInReview() {
	return DriverManager.getDriver().findElement(DeviceCapacityInReview);
}

/********************************************************************************************************************************/
public WebElement get_ContactDerationInReview() {
	return DriverManager.getDriver().findElement(ContactDerationInReview);
}

/********************************************************************************************************************************/
public WebElement get_gplan_withDevice() {
	return DriverManager.getDriver().findElement(gplan_withDevice);
}

/********************************************************************************************************************************/
public WebElement get_My_Super_Duo() {
	return DriverManager.getDriver().findElement(My_Super_Duo);
}

/********************************************************************************************************************************/
public WebElement get_Amazon_Prime_Video() {
	return DriverManager.getDriver().findElement(Amazon_Prime_Video);
}

/********************************************************************************************************************************/
public WebElement get_Viu_Premium() {
	return DriverManager.getDriver().findElement(Viu_Premium);
}

/********************************************************************************************************************************/
public WebElement get_Spotify_Premium() {
	return DriverManager.getDriver().findElement(Spotify_Premium);
}

/********************************************************************************************************************************/
public WebElement get_GOCALLIDD_199() {
	return DriverManager.getDriver().findElement(GOCALLIDD_199);
}

/********************************************************************************************************************************/
public WebElement get_Easy_Roam() {
	return DriverManager.getDriver().findElement(Easy_Roam);
}

/********************************************************************************************************************************/
public WebElement get_GS_Add_Surf_99() {
	return DriverManager.getDriver().findElement(GS_Add_Surf_99);
}

/********************************************************************************************************************************/
public WebElement get_Total_subscriptions_and_addons() {
	return DriverManager.getDriver().findElement(Total_subscriptions_and_addons);
}

/********************************************************************************************************************************/
public WebElement get_MonthlyBill_subscriptions_and_addons() {
	return DriverManager.getDriver().findElement(MonthlyBill_subscriptions_and_addons);
}

/********************************************************************************************************************************/
public WebElement get_Monthly_Payment() {
	return DriverManager.getDriver().findElement(Monthly_Payment);
}

/********************************************************************************************************************************/
public WebElement get_OneTimeDevice_Cashout() {
	return DriverManager.getDriver().findElement(OneTimeDevice_Cashout);
}

/********************************************************************************************************************************/
public WebElement get_Mobile_Number() {
	return DriverManager.getDriver().findElement(Mobile_Number);
}
/********************************************************************************************************************************/











/**********************************************************************/
	public WebElement get_SimOnly_LandingPage() {
		return DriverManager.getDriver().findElement(SimOnly_LandingPage);
	}
	public WebElement get_discoverGplanBelow() {
		return DriverManager.getDriver().findElement(discoverGplanBelow);
	}
	
	public WebElement get_contractDuration() {
		return DriverManager.getDriver().findElement(contractDuration);
	}
	public WebElement get_capacity() {
		return DriverManager.getDriver().findElement(capacity);
	}
	
	public List<WebElement> get_color_Finish() {
		return DriverManager.getDriver().findElements(color_Finish);
	}

	public WebElement get_AlwaysOnAllData_LandingPage() {
		return DriverManager.getDriver().findElement(AlwaysOnAllData_LandingPage);
	}
	public WebElement get_PreferTalking() {
		return DriverManager.getDriver().findElement(PreferTalking);
	}
	public WebElement get_Dragbutton() {
		return DriverManager.getDriver().findElement(Dragbutton);
	}
	public WebElement get_GPlanPlusOnly_LandingPage() {
		return DriverManager.getDriver().findElement(GPlanPlusOnly_LandingPage);
	}
	public WebElement get_deviceNameinPDPage() {
		return DriverManager.getDriver().findElement(deviceNameinPDPage);
	
	}
	public WebElement get_color_Finish1() {
		return DriverManager.getDriver().findElement(color_Finish1);
	}


	public WebElement get_Entertainment_CheckBox() {
		return DriverManager.getDriver().findElement(Entertainment_CheckBox);
	}
	public WebElement get_YoutubeOpt() {
		return DriverManager.getDriver().findElement(YoutubeOpt);

	}
	public WebElement get_SubmitOrder() {
		return DriverManager.getDriver().findElement(SubmitOrder);
	}
	
	public WebElement get_SelectDevice() {
		return DriverManager.getDriver().findElement(SelectDevice);

	}
	public WebElement get_inputMobileNumber() {
		return DriverManager.getDriver().findElement(inputMobileNumber);
	}

	public WebElement get_owlnext() {
		return DriverManager.getDriver().findElement(owlnext);

	}
	public WebElement get_SoundTrackBanner() {
		return DriverManager.getDriver().findElement(SoundTrackOfYourLife);
	}
	public WebElement get_starterbanner4() {
		return DriverManager.getDriver().findElement(starterbanner4);

	}
	public WebElement get_ReframeYourlifeStyle() {
		return DriverManager.getDriver().findElement(ReframeYourlifeStyle);
	}
	public WebElement get_GoogleThatBanner() {
		return DriverManager.getDriver().findElement(GoogleThatBanner);
	}
	public WebElement get_MobileDevicesCarousel() {
		return DriverManager.getDriver().findElement(MobileDeviceCarousel);
	}
	public WebElement get_starterbanner7() {
		return DriverManager.getDriver().findElement(starterbanner7);

	}

	public WebElement get_starterbanner8() {
		return DriverManager.getDriver().findElement(starterbanner8);

	}

	public WebElement get_starterbanner5() {
		return DriverManager.getDriver().findElement(starterbanner5);

	}

	public WebElement get_starterbanner6() {
		return DriverManager.getDriver().findElement(starterbanner6);

	}
	public WebElement get_DataTypeBanner() {
		return DriverManager.getDriver().findElement(DataTypeBanner);
	}

	public WebElement get_GplanPlus_LandingPage() {
		return DriverManager.getDriver().findElement(GplanPlus_LandingPage);
	}
	public WebElement get_GPlanWithSimOnly999() {
		return DriverManager.getDriver().findElement(GPlanWithSimOnly999);

	}
	public WebElement get_StarterAllData_LandingPage() {
		return DriverManager.getDriver().findElement(StarterAllData_LandingPage);
	}
	public WebElement get_EssentialAllData_LandingPage() {
		return DriverManager.getDriver().findElement(EssentialAllData_LandingPage);
	}
	public WebElement get_PlusAllData_LandingPage() {
		return DriverManager.getDriver().findElement(PlusAllData_LandingPage);
	}
	public WebElement get_ExtraAllData_LandingPage() {
		return DriverManager.getDriver().findElement(ExtraAllData_LandingPage);
	}
	public WebElement get_NextIcon1() {
		return DriverManager.getDriver().findElement(NextIcon1);

	}
	public WebElement get_nextIcon() {
		return DriverManager.getDriver().findElement(nextIcon);

	}

	public WebElement get_SearchByDevice() {
		return DriverManager.getDriver().findElement(SearchByDevice);
	}
	
	public WebElement get_GCash_LandingPage() {
		return DriverManager.getDriver().findElement(GCash_LandingPage);
	}
	public WebElement get_Device_LandingPage() {
		return DriverManager.getDriver().findElement(Device_LandingPage);
	}

//	 RENEW MOBILE ENTERING FILED
	public WebElement get_Mobilenumfield() {
		return DriverManager.getDriver().findElement(Mobilenumfield);
	}
	
	
	public WebElement get_Addons() {
		return DriverManager.getDriver().findElement(Addons);
	}
	public WebElement get_Checkbutton() {
		return DriverManager.getDriver().findElement(Checkbutton);
	}
	public WebElement get_PDPplanIcon() {
		return DriverManager.getDriver().findElement(PDPplanIcon);
	}
	public WebElement get_PDPdataIcon() {
		return DriverManager.getDriver().findElement(PDPdataIcon);
	}
	public WebElement get_PDProamingIcon() {
		return DriverManager.getDriver().findElement(PDProamingIcon);
	}
	public WebElement get_PDPcallIcon() {
		return DriverManager.getDriver().findElement(PDPcallIcon);
	}
	public WebElement get_proceedbtn1() {
		return DriverManager.getDriver().findElement(proceedbtn1);
	}
	public WebElement get_LiteBanner() {
		return DriverManager.getDriver().findElement(LiteBanner);

	}
	public WebElement get_ProceedWithMyPlanButton() {
		return DriverManager.getDriver().findElement(ProceedWithMyPlanButton);
	}
	public WebElement get_Proceedbtn() {
		return DriverManager.getDriver().findElement(Proceedbtn);
	}
	public WebElement get_LiteBanner2() {
		return DriverManager.getDriver().findElement(LiteBanner2);

	}
	public WebElement get_Submitbutton() {
		return DriverManager.getDriver().findElement(Submitbutton);
	}
	
	
	/*************************************************************************************************/

	public WebElement get_Disc_Basicbtn() {
		return DriverManager.getDriver().findElement(Disc_Basicbtn);
	}
	


	/*************************************************************************************************/

	public WebElement get_BasicBtn_Discovery() {
		return DriverManager.getDriver().findElement(BasicBtn_Discovery);
	}

	
	public WebElement get_AllData_LandingPage() {
		return DriverManager.getDriver().findElement(AllData_LandingPage);
	}
		public WebElement get_ExtraImg2() {
		return DriverManager.getDriver().findElement(ExtraImg2);
	}
	public WebElement get_ExtraImg1() {
		return DriverManager.getDriver().findElement(ExtraImg1);
	}
	
	public WebElement get_BasicAllData_LandingPage() {
		return DriverManager.getDriver().findElement(BasicAllData_LandingPage);
	}
	
	public WebElement get_ViewBreakdown() {
		return DriverManager.getDriver().findElement(ViewBreakdown);
	}
	public WebElement get_BreakdownCloseIcon() {
		return DriverManager.getDriver().findElement(BreakdownCloseIcon);
	}
	public WebElement get_MandatoryCheckbox() {
		return DriverManager.getDriver().findElement(MandatoryCheckbox);
	}
	public WebElement get_UntickMySuperDuo() {
		return DriverManager.getDriver().findElement(UntickMySuperDuo);
	}
	
	public WebElement get_PDP_Device() {
		return DriverManager.getDriver().findElement(PDP_Device);
	}
	
	public WebElement get_NextBtn() {
		return DriverManager.getDriver().findElement(NextBtn);
	}
	public WebElement get_AgreeBtn() {
		return DriverManager.getDriver().findElement(AgreeBtn);
	}
	public WebElement get_SubmitBtn() {
		return DriverManager.getDriver().findElement(SubmitBtn);
	}
	public WebElement get_PayBtn() {
		return DriverManager.getDriver().findElement(PayBtn);
	}
	

//	Select Plan Device Caurosel
	public WebElement get_CarouselDeviceplanprevious() {
		return DriverManager.getDriver().findElement(CarouselDeviceplanprevious);
	}

	public WebElement get_CarouselDeviceplanNext() {
		return DriverManager.getDriver().findElement(CarouselDeviceplanNext);
	}

	public WebElement get_DeviceSearch() {
		return DriverManager.getDriver().findElement(DeviceSearch);
	}

	public WebElement get_Deviceitem() {
		return DriverManager.getDriver().findElement(Deviceitem);
	}

	public WebElement get_Color_Click() {
		return DriverManager.getDriver().findElement(Color_Click);
	}

	public WebElement get_RadioButtonColor() {
		return DriverManager.getDriver().findElement(RadioButtonColor);
	}

	public WebElement get_RadioButtonColor1() {
		return DriverManager.getDriver().findElement(RadioButtonColor1);
	}

	public WebElement get_RenewWihDevice() {
		return DriverManager.getDriver().findElement(RenewWihDevice);
	}

//	Select Mobile Device Caurosel
	public WebElement get_CarouselDevicePrevBtn() {
		return DriverManager.getDriver().findElement(CarouselDevicePrevBtn);
	}

	public WebElement get_CarouselDeviceNextBtn() {
		return DriverManager.getDriver().findElement(CarouselDeviceNextBtn);
	}

	public WebElement get_PDP_Alldata() {
		return DriverManager.getDriver().findElement(PDP_Alldata);
	}

	public int get_FifteenDevicesPerPage() {
		// List<WebElement> element=new ArrayList<WebElement>();

		int size = DriverManager.getDriver().findElements(FifteenDevicesPerPage).size();
		return size;
	}

	public WebElement get_Data_addon() {
		return DriverManager.getDriver().findElement(Data_addon);
	}

	/********************************************************************************************************************************/
	public WebElement get_Data_checkbox() {
		return DriverManager.getDriver().findElement(Data_checkbox);
	}

	/********************************************************************************************************************************/
	public WebElement get_GSAddsurf99() {
		return DriverManager.getDriver().findElement(GSAddsurf99);
	}

	/********************************************************************************************************************************/
	public WebElement get_movie_addon() {
		return DriverManager.getDriver().findElement(movie_addon);
	}

	/********************************************************************************************************************************/
	public WebElement get_movie_checkbox() {
		return DriverManager.getDriver().findElement(movie_checkbox);
	}

	/********************************************************************************************************************************/
	public WebElement get_Amazonprime() {
		return DriverManager.getDriver().findElement(Amazonprime);
	}

	/********************************************************************************************************************************/
	public WebElement get_Viupremium() {
		return DriverManager.getDriver().findElement(Viupremium);
	}

	/********************************************************************************************************************************/
	public WebElement get_Spotifypremium() {
		return DriverManager.getDriver().findElement(Spotifypremium);
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

	/********************************************************************************************************************************/
	public WebElement get_message_addon() {
		return DriverManager.getDriver().findElement(message_addon);
	}

	/********************************************************************************************************************************/
	public WebElement get_message_checkbox() {
		return DriverManager.getDriver().findElement(message_checkbox);
	}

	/********************************************************************************************************************************/
	public WebElement get_MyDuo() {
		return DriverManager.getDriver().findElement(MyDuo);
	}

	/********************************************************************************************************************************/
	public WebElement get_MySuperDuo() {
		return DriverManager.getDriver().findElement(MySuperDuo);
	}

	/********************************************************************************************************************************/
	public WebElement get_lifestyle_addon() {
		return DriverManager.getDriver().findElement(lifestyle_addon);
	}

	/********************************************************************************************************************************/
	public WebElement get_lifestyle_checkbox() {
		return DriverManager.getDriver().findElement(lifestyle_checkbox);
	}

	/********************************************************************************************************************************/
	public WebElement get_easyRoam() {
		return DriverManager.getDriver().findElement(easyRoam);
	}

	/********************************************************************************************************************************/
	public WebElement get_Gocallid199() {
		return DriverManager.getDriver().findElement(Gocallid199);
	}
	

	public WebElement get_ReviewMyPlan() {
		return DriverManager.getDriver().findElement(ReviewMyPlan);
	}
	/********************************************************************************************************************************/
	public WebElement get_Reviewmyplan() {
		return DriverManager.getDriver().findElement(Reviewmyplan);
	}

	/********************************************************************************************************************************/

	public WebElement get_AmazonAddon() {
		return DriverManager.getDriver().findElement(AmazonAddon);
	}

	public WebElement get_ViuAddon() {
		return DriverManager.getDriver().findElement(ViuAddon);
	}

	public WebElement get_SpotifyAddon() {
		return DriverManager.getDriver().findElement(SpotifyAddon);
	}

	public WebElement get_MyDuoaddon() {
		return DriverManager.getDriver().findElement(MyDuoaddon);
	}

	public WebElement get_EasyRoamaddon() {
		return DriverManager.getDriver().findElement(EasyRoamaddon);
	}

	public WebElement get_GSAddSur99addon() {
		return DriverManager.getDriver().findElement(GSAddSur99addon);
	}

	public WebElement get_UntickMyDuo() {
		return DriverManager.getDriver().findElement(UntickMyDuo);
	}

	public WebElement get_Recomputemyplan() {
		return DriverManager.getDriver().findElement(Recomputemyplan);
	}

	public WebElement get_Proceedwithmyplan() {
		return DriverManager.getDriver().findElement(Proceedwithmyplan);
	}
	public WebElement get_ProceedwithChargeToBill() {
		return DriverManager.getDriver().findElement(ProceedwithChargeToBill);
	}
	

	/**************************
	 * Renewal Scenario2
	 *********************************************************************************/

	public WebElement get_Price_1499WithDevice() {
		return DriverManager.getDriver().findElement(Price_1499WithDevice);
	}
	/**************************
	 * Renewal Scenario4
	 *********************************************************************************/
	public WebElement get_GplanAllData2499() {
		return DriverManager.getDriver().findElement(GplanAllData2499);
	}
	public WebElement get_renewwithThisDevice() {
		return DriverManager.getDriver().findElement(renewwithThisDevice);
	}
	
	public WebElement get_ViewAllDevicesLinkInPdPage() {
		return DriverManager.getDriver().findElement(ViewAllDevicesLinkInPdPage);
	}
	
	
	public void jsClick(String message, String element) throws Exception {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			
			case "reserveThisDevice":
		         jse.executeScript("arguments[0].click();", get_reserveThisDevice());		
		         break;  		
			
			case "MyDuo":
		         jse.executeScript("arguments[0].click();", get_MyDuo());		
		         break;
			case "Spotifypremium":
		         jse.executeScript("arguments[0].click();", get_Spotifypremium());		
		         break;
			case "MySuperDuo":
		         jse.executeScript("arguments[0].click();", get_MySuperDuo());		
		         break;
			case "easyRoam":
		         jse.executeScript("arguments[0].click();", get_easyRoam());		
		         break;
			case "Gocallid199":
		         jse.executeScript("arguments[0].click();", get_Gocallid199());		
		         break;
			case "ReviewMyPlan":
		         jse.executeScript("arguments[0].click();", get_ReviewMyPlan());		
		         break;  
			case "Proceedbtn":
		         jse.executeScript("arguments[0].click();", get_Proceedbtn());		
		         break; 
			case "ProceedWithMyPlanButton":
		         jse.executeScript("arguments[0].click();", get_ProceedWithMyPlanButton());		
		         break;
			case "discoverGplanBelow":
		         jse.executeScript("arguments[0].click();", get_discoverGplanBelow());		
		         break;
			case "renewwithThisDevice":
		         jse.executeScript("arguments[0].click();", get_renewwithThisDevice());		
		         break;      
			case "ViewAllDevicesLinkInPdPage":
		         jse.executeScript("arguments[0].click();", get_ViewAllDevicesLinkInPdPage());		
		         break;
			case "Data_checkbox":
		         jse.executeScript("arguments[0].click();", get_Data_checkbox());		
		         break; 
			case "movie_checkbox":
		         jse.executeScript("arguments[0].click();", get_movie_checkbox());		
		         break;
			case "message_checkbox":
		         jse.executeScript("arguments[0].click();", get_message_checkbox());		
		         break;
			case "lifestyle_checkbox":
		         jse.executeScript("arguments[0].click();", get_lifestyle_checkbox());		
		         break; 
			case "GSAddsurf99":
		         jse.executeScript("arguments[0].click();", get_GSAddsurf99());		
		         break;      
			case "Amazonprime":
		         jse.executeScript("arguments[0].click();", get_Amazonprime());		
		         break;
			case "Viupremium":
		         jse.executeScript("arguments[0].click();", get_Viupremium());		
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


	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void js_clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

			switch (ele) {
			
			case "Breakdown_proceedbutton":
				js.executeScript("arguments[0].click();", get_Breakdown_proceedbutton());
				break;
			case "Disc_Basicbtn":
				js.executeScript("arguments[0].click();", get_Disc_Basicbtn());
				break;
			
			
			/*************** ADA 1 STARTS HERE **********************/
			case "showsAndMoviesToggle":
				js.executeScript("arguments[0].click();", get_showsAndMoviesToggle());
				break;
			case "AmazonprimeVideoaddon599":
				js.executeScript("arguments[0].click();", get_AmazonprimeVideoaddon599());
				break;
			case "viupremiuum599":
				js.executeScript("arguments[0].click();", get_viupremiuum599());
				break;
			case "spotifypremiuum599":
				js.executeScript("arguments[0].click();", get_spotifypremiuum599());
				break;
			case "TalkingovermessageAddOn":
				js.executeScript("arguments[0].click();", get_TalkingovermessageAddOn());
				break;
			case "lifestylemessageAddOn":
				js.executeScript("arguments[0].click();", get_lifestylemessageAddOn());
				break;
			

			case "Checkbutton":
				js.executeScript("arguments[0].click();", get_Checkbutton());
				break;
			case "discoverGplanBelow":
		         js.executeScript("arguments[0].click();", get_discoverGplanBelow());		
		         break;
			case "Addons":
				js.executeScript("arguments[0].click();", get_Addons());
				break;
			case "DeviceTab":
				js.executeScript("arguments[0].click();", get_Device_LandingPage());
				break;
				
			case "Mobilenumfield":
				js.executeScript("arguments[0].click();", get_Mobilenumfield());
				break;

			case "Deviceitem":
				js.executeScript("arguments[0].click();", get_Deviceitem());
				break;
			case "RadioButtonColor":
				js.executeScript("arguments[0].click();", get_RadioButtonColor());
				break;
			case "RadioButtonColor1":
				js.executeScript("arguments[0].click();", get_RadioButtonColor1());
				break;
			case "RenewWihDevice":
				js.executeScript("arguments[0].click();", get_RenewWihDevice());
				break;
			case "CarouselDevicePrevBtn":
				js.executeScript("arguments[0].click();", get_CarouselDevicePrevBtn());
				break;
			case "CarouselDeviceNextBtn":
				js.executeScript("arguments[0].click();", get_CarouselDeviceNextBtn());
				break;

			case "DeviceSearch":
				js.executeScript("arguments[0].click();", get_DeviceSearch());
				break;
			case "Color_Click":
				js.executeScript("arguments[0].click();", get_Color_Click());
				break;
			case "CarouselDeviceplanprevious":
				js.executeScript("arguments[0].click();", get_CarouselDeviceplanprevious());
				break;
			case "CarouselDeviceplanNext":
				js.executeScript("arguments[0].click();", get_CarouselDeviceplanNext());
				break;
			case "Data_addon":
				get_Data_addon().click();
				break;
			case "Data_checkbox":
				get_Data_checkbox().click();
				break;
			case "GSAddsurf99":
				get_GSAddsurf99().click();
				break;
			case "movie_addon":
				get_movie_addon().click();
				break;
			case "movie_checkbox":
				get_movie_checkbox().click();
				break;
			case "Amazonprime":
				get_Amazonprime().click();
				break;
			case "Viupremium":
				get_Viupremium().click();
				break;
			case "Spotifypremium":
				get_Spotifypremium().click();
				break;
			case "message_addon":
				get_message_addon().click();
				break;
			case "message_checkbox":
				get_message_checkbox().click();
				break;
			case "MyDuo":
				get_MyDuo().click();
				break;
			case "MySuperDuo":
				get_MySuperDuo().click();
				break;
			case "lifestyle_addon":
				get_lifestyle_addon().click();
				break;
			case "lifestyle_checkbox":
				get_lifestyle_checkbox().click();
				break;
			case "easyRoam":
				get_easyRoam().click();
				break;
			case "Gocallid199":
				get_Gocallid199().click();
				break;
			case "Reviewmyplan":
				get_Reviewmyplan().click();
				break;
			case "AmazonAddon":
				get_AmazonAddon().click();
				break;
			case "SpotifyAddon":
				get_SpotifyAddon().click();
				break;
			case "ViuAddon":
				get_ViuAddon().click();
				break;
			case "MyDuoaddon":
				get_MyDuoaddon().click();
				break;
			case "EasyRoamaddon":
				get_EasyRoamaddon().click();
				break;
			case "GSAddSur99addon":
				get_GSAddSur99addon().click();
				break;
			case "UntickMyDuo":
				get_UntickMyDuo().click();
				break;
			case "Recomputemyplan":
				get_Recomputemyplan().click();
				break;
			case "Proceedwithmyplan":
				get_Proceedwithmyplan().click();
				break;

			case "PDP_Alldata":
				get_PDP_Alldata().click();
				break;
			case "GplanAllData2499":
				get_GplanAllData2499().click();
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

	/**
	 * @throws Exception ***********************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		
		case "errorDelMsg":
			flag = waitForElementVisibility(errorDelMsg, waitTime);
			break;
		case "CreditCard":
			flag = waitForElementVisibility(CreditCard, waitTime);
			break;
		case "availableForDelivery":
			flag = waitForElementVisibility(availableForDelivery, waitTime);
			break;
		case "GCashMobilenumber":
			flag = waitForElementVisibility(GCashMobilenumber, waitTime);
			break;
		case "MPIN":
			flag = waitForElementVisibility(MPIN, waitTime);
			break;
		case "Checkbutton":
			flag = waitForElementVisibility(Checkbutton, waitTime);
			break;
		case "Mobilenumfield":
			flag = waitForElementVisibility(Mobilenumfield, waitTime);
			break;
		case "PDPNextIcon":
			flag = waitForElementVisibility(NextIcon, waitTime);
			break;
		case "BreakdownHeader":
			flag = waitForElementVisibility(BreakdownHeader, waitTime);
			break;
		case "UploadedDocName":
			flag = waitForElementVisibility(UploadedDocName, waitTime);
			break;
		case "UploadedDocPreview":
			flag = waitForElementVisibility(UploadedDocPreview, waitTime);
			break;
		case "MandatoryCheckbox":
			flag = waitForElementVisibility(MandatoryCheckbox, waitTime);
			break;
				
			
		case "SpecifDocumentUpload":
			flag = waitForElementVisibility(SpecifDocumentUpload, waitTime);
			break;
		case "DeliveryInfoCss":
			flag = waitForElementVisibility(DeliveryInfoCss, waitTime);
			break;
		case "PostpaidRenewalHeader":
			flag = waitForElementVisibility(PostpaidRenewalHeader, waitTime);
			break;
		case "ViewBreakdown":
			flag = waitForElementVisibility(ViewBreakdown, waitTime);
			break;
		case "Overduebalance":
			flag = waitForElementVisibility(Overduebalance, waitTime);
			break;
			
			
		case "SupportingDocsReq":
			flag = waitForElementVisibility(SupportingDocsReq, waitTime);
			break;
		case "PDPplanIcon":
			flag = waitForElementVisibility(PDPplanIcon, waitTime);
			break;
		case "PDPdataIcon":
			flag = waitForElementVisibility(PDPdataIcon, waitTime);
			break;
		case "PDPentertainmentIcon":
			flag = waitForElementVisibility(PDPentertainmentIcon, waitTime);
			break;
		case "PDProamingIcon":
			flag = waitForElementVisibility(PDProamingIcon, waitTime);
			break;
			
		case "PDPcallIcon":
			flag = waitForElementVisibility(PDPcallIcon, waitTime);
			break;			
		case "PDPPlanSection":
			flag = waitForElementVisibility(PDPPlanSection, waitTime);
			break;		
		
		case "Price_599WithDevice":
			flag = waitForElementVisibility(Price_599WithDevice, waitTime);
			break;

		case "Deviceitem":
			flag = waitForElementVisibility(Deviceitem, waitTime);
			break;
		case "Color_header":
			flag = waitForElementVisibility(Color_header, waitTime);
			break;
		case "Capacity_header":
			flag = waitForElementVisibility(Capacity_header, waitTime);
			break;
		case "Color_color":
			flag = waitForElementVisibility(Color_color, waitTime);
			break;
		case "Contractduration_header":
			flag = waitForElementVisibility(Contractduration_header, waitTime);
			break;
		case "RadioButtonColor":
			flag = waitForElementVisibility(RadioButtonColor, waitTime);
			break;
		case "RadioButtonColor1":
			flag = waitForElementVisibility(RadioButtonColor1, waitTime);
			break;
		case "RenewWihDevice":
			flag = waitForElementVisibility(RenewWihDevice, waitTime);
			break;
		case "CarouselDevicePrevBtn":
			flag = waitForElementVisibility(CarouselDevicePrevBtn, waitTime);
			break;
		case "CarouselDeviceNextBtn":
			flag = waitForElementVisibility(CarouselDeviceNextBtn, waitTime);
			break;
		case "DeviceSearch":
			flag = waitForElementVisibility(DeviceSearch, waitTime);
			break;

		case "Color_Click":
			flag = waitForElementVisibility(Color_Click, waitTime);
			break;
		case "CarouselDeviceplanprevious":
			flag = waitForElementVisibility(CarouselDeviceplanprevious, waitTime);
			break;
		case "CarouselDeviceplanNext":
			flag = waitForElementVisibility(CarouselDeviceplanNext, waitTime);
			break;
		case "Data_addon":
			flag = waitForElementVisibility(Data_addon, waitTime);
			break;
		case "Data_checkbox":
			flag = waitForElementVisibility(Data_checkbox, waitTime);
			break;
		case "GSAddsurf99":
			flag = waitForElementVisibility(GSAddsurf99, waitTime);
			break;
		case "movie_addon":
			flag = waitForElementVisibility(movie_addon, waitTime);
			break;
		case "movie_checkbox":
			flag = waitForElementVisibility(movie_checkbox, waitTime);
			break;
		case "Amazonprime":
			flag = waitForElementVisibility(Amazonprime, waitTime);
			break;
		case "Viupremium":
			flag = waitForElementVisibility(Viupremium, waitTime);
			break;
		case "Spotifypremium":
			flag = waitForElementVisibility(Spotifypremium, waitTime);
			break;
		case "message_addon":
			flag = waitForElementVisibility(message_addon, waitTime);
			break;
		case "lifestyle_addon":
			flag = waitForElementVisibility(lifestyle_addon, waitTime);
			break;
		case "easyRoam":
			flag = waitForElementVisibility(easyRoam, waitTime);
			break;
		case "Gocallid199":
			flag = waitForElementVisibility(Gocallid199, waitTime);
			break;
		case "Reviewmyplan":
			flag = waitForElementVisibility(Reviewmyplan, waitTime);
			break;
		case "PlanName":
			flag = waitForElementVisibility(PlanName, waitTime);
			break;
		case "PlanValue":
			flag = waitForElementVisibility(PlanValue, waitTime);
			break;
		case "PlanName2499":
			flag = waitForElementVisibility(PlanName2499, waitTime);
			break;
			
		case "PlanValue2499":
			flag = waitForElementVisibility(PlanValue2499, waitTime);
			break;

		case "Allaccess_data":
			flag = waitForElementVisibility(Allaccess_data, waitTime);
			break;
		case "Gowifi_access":
			flag = waitForElementVisibility(Gowifi_access, waitTime);
			break;
		case "List_ul":
			flag = waitForElementVisibility(List_ul, waitTime);
			break;
		case "Monthlycashout_header":
			flag = waitForElementVisibility(Monthlycashout_header, waitTime);
			break;
		case "Plan_name":
			flag = waitForElementVisibility(Plan_name, waitTime);
			break;
		case "Plan_price":
			flag = waitForElementVisibility(Plan_price, waitTime);
			break;

		case "Subsandaddonheader":
			flag = waitForElementVisibility(Subsandaddonheader, waitTime);
			break;
		case "Totalsubsandaddons":
			flag = waitForElementVisibility(Totalsubsandaddons, waitTime);
			break;
		case "Totalsubsandaddons_amont":
			flag = waitForElementVisibility(Totalsubsandaddons_amont, waitTime);
			break;
			
		case "Monthlybill_header":
			flag = waitForElementVisibility(Monthlybill_header, waitTime);
			break;
		case "Monthlybill_amount":
			flag = waitForElementVisibility(Monthlybill_amount, waitTime);
			break;
		case "Monthly_payment":
			flag = waitForElementVisibility(Monthly_payment, waitTime);
			break;
		case "Monthlypayment_amount":
			flag = waitForElementVisibility(Monthlypayment_amount, waitTime);
			break;
//		case "inputmoblienum":
//			flag = waitForElementVisibility(inputmoblienum, waitTime);
//			break;
		case "proceedbtn1":
			flag = waitForElementVisibility(proceedbtn1, waitTime);
			break;

		case "ViuAddon":
			flag = waitForElementVisibility(ViuAddon, waitTime);
			break;
		case "AmazonAddon":
			flag = waitForElementVisibility(AmazonAddon, waitTime);
			break;
		case "SpotifyAddon ":
			flag = waitForElementVisibility(SpotifyAddon, waitTime);
			break;
		case "MyDuoaddon":
			flag = waitForElementVisibility(MyDuoaddon, waitTime);
			break;
		case "EasyRoamaddon":
			flag = waitForElementVisibility(EasyRoamaddon, waitTime);
			break;
		case "GSAddSur99addon":
			flag = waitForElementVisibility(GSAddSur99addon, waitTime);
			break;
		case "UntickMyDuo":
			flag = waitForElementVisibility(UntickMyDuo, waitTime);
			break;
		case "UntickMySuperDuo":
			flag = waitForElementVisibility(UntickMySuperDuo, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;
		case "Recomputemyplan":
			flag = waitForElementVisibility(Recomputemyplan, waitTime);
			break;
		case "Proceedwithmyplan":
			flag = waitForElementVisibility(Proceedwithmyplan, waitTime);
			break;

		case "Price_1499WithDevice":
			flag = waitForElementVisibility(Price_1499WithDevice, waitTime);
			break;
			
		case "GplanAllData2499":
			flag = waitForElementVisibility(GplanAllData2499, waitTime);
			break;
		case "productDetails":
			flag = waitForElementVisibility(productDetails, waitTime);
			break;
		case "productGallery":
			flag = waitForElementVisibility(productGallery, waitTime);
			break;
		case "deviceNameinPDPage":
			flag = waitForElementVisibility(deviceNameinPDPage, waitTime);
			break;
		case "color_Finish":
			flag = waitForElementVisibility(color_Finish, waitTime);
			break;
		case "capacity":
			flag = waitForElementVisibility(capacity, waitTime);
			break;	
		case "contractDuration":
			flag = waitForElementVisibility(contractDuration, waitTime);
			break;	
		case "cashoutAmount":
			flag = waitForElementVisibility(cashoutAmount, waitTime);
			break;	
		case "forReservationTag":
			flag = waitForElementVisibility(forReservationTag, waitTime);
			break;
		case "note":
			flag = waitForElementVisibility(note, waitTime);
			break;
		case "wantToknowAboutGplans":
			flag = waitForElementVisibility(wantToknowAboutGplans, waitTime);
			break;	
		case "discoverGplanBelow":
			flag = waitForElementVisibility(discoverGplanBelow, waitTime);
			break;
		case "PlanCard":
			flag = waitForElementVisibility(PlanCard, waitTime);
			break;
		case "Devicecarousel":
			flag = waitForElementVisibility(Devicecarousel, waitTime);
			break;	
		case "reserveThisDevice":
			flag = waitForElementVisibility(reserveThisDevice, waitTime);
			break;	
		case "selectAnotherDevice":
			flag = waitForElementVisibility(selectAnotherDevice, waitTime);
			break;	
		case "buildMyPlan":
			flag = waitForElementVisibility(buildMyPlan, waitTime);
			break;	
		case "features":
			flag = waitForElementVisibility(features, waitTime);
			break;
		case "promos":
			flag = waitForElementVisibility(promos, waitTime);
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
		case "planbuilderPage":
			flag = waitForElementVisibility(planbuilderPage, waitTime);
			break;	
		case "PDP_Device":
			flag = waitForElementVisibility(PDP_Device, waitTime);
			break;
		case "PDP_Gcash":
			flag = waitForElementVisibility(PDP_Gcash, waitTime);
			break;
		case "PDP_Simonly":
			flag = waitForElementVisibility(PDP_Simonly, waitTime);
			break;
		case "PDP_Alldata":
			flag = waitForElementVisibility(PDP_Alldata, waitTime);
			break;
		case "planCard":
			flag = waitForElementVisibility(planCard, waitTime);
			break;	
		case "ViewAllDevicesLinkInPdPage":
			flag = waitForElementVisibility(ViewAllDevicesLinkInPdPage, waitTime);
			break;
		case "color_Finish1":
			flag = waitForElementVisibility(color_Finish1, waitTime);
			break;
		case "capacity1":
			flag = waitForElementVisibility(capacity1, waitTime);
			break;
		case "contractDuration1":
			flag = waitForElementVisibility(contractDuration1, waitTime);
			break;	
		case "DoYouUseLotsOfData":
			flag = waitForElementVisibility(DoYouUseLotsOfData, waitTime);
			break;
		case "DoYouLoveWatchingShowsAndMovies":
			flag = waitForElementVisibility(DoYouLoveWatchingShowsAndMovies, waitTime);
			break;
		case "PreferTalkingOverMessaging":
			flag = waitForElementVisibility(PreferTalkingOverMessaging, waitTime);
			break;
		case "AreYouAllAboutTheJetSettingLifestyle":
			flag = waitForElementVisibility(AreYouAllAboutTheJetSettingLifestyle, waitTime);
			break;
		case "ReviewMyPlan":
			flag = waitForElementVisibility(ReviewMyPlan, waitTime);
			break;
		case "DeviceNameInReviewMyPlan":
			flag = waitForElementVisibility(DeviceNameInReviewMyPlan, waitTime);
			break;
		case "DeviceCapacityInReview":
			flag = waitForElementVisibility(DeviceCapacityInReview, waitTime);
			break;
		case "ContactDerationInReview":
			flag = waitForElementVisibility(ContactDerationInReview, waitTime);
			break;	
		case "All_access_data":
			flag = waitForElementVisibility(All_access_data, waitTime);
			break;	
		case "GoWifi_access":
			flag = waitForElementVisibility(GoWifi_access, waitTime);
			break;
		case "Unli_All_net":
			flag = waitForElementVisibility(Unli_All_net, waitTime);
			break;
		case "Plan_inclusions":
			flag = waitForElementVisibility(Plan_inclusions, waitTime);
			break;
		case "Konsulta_Sub":
			flag = waitForElementVisibility(Konsulta_Sub, waitTime);
			break;
		case "Glnsure_Sub":
			flag = waitForElementVisibility(Glnsure_Sub, waitTime);
			break;
		case "gplan_withDevice":
			flag = waitForElementVisibility(gplan_withDevice, waitTime);
			break;
		case "My_Super_Duo":
			flag = waitForElementVisibility(My_Super_Duo, waitTime);
			break;
		case "Amazon_Prime_Video":
			flag = waitForElementVisibility(Amazon_Prime_Video, waitTime);
			break;
		case "Viu_Premium":
			flag = waitForElementVisibility(Viu_Premium, waitTime);
			break;
		case "Spotify_Premium":
			flag = waitForElementVisibility(Spotify_Premium, waitTime);
			break;
		case "GOCALLIDD_199":
			flag = waitForElementVisibility(GOCALLIDD_199, waitTime);
			break;
		case "Easy_Roam":
			flag = waitForElementVisibility(Easy_Roam, waitTime);
			break;
		case "GS_Add_Surf_99":
			flag = waitForElementVisibility(GS_Add_Surf_99, waitTime);
			break;
		case "Subscriptions_Addons":
			flag = waitForElementVisibility(Subscriptions_Addons, waitTime);
			break;
		case "Total_subscriptions_and_addons":
			flag = waitForElementVisibility(Total_subscriptions_and_addons, waitTime);
			break;
		case "MonthlyBill_subscriptions_and_addons":
			flag = waitForElementVisibility(MonthlyBill_subscriptions_and_addons, waitTime);
			break;
		case "Monthly_Payment":
			flag = waitForElementVisibility(Monthly_Payment, waitTime);
			break;
		case "OneTimeDevice_Cashout":
			flag = waitForElementVisibility(OneTimeDevice_Cashout, waitTime);
			break;
		case "Mobile_Number":
			flag = waitForElementVisibility(Mobile_Number, waitTime);
			break;
		case "ProceedWithMyPlanButton":
			flag = waitForElementVisibility(ProceedWithMyPlanButton, waitTime);
			break;	
		case "renewwithThisDevice":
			flag = waitForElementVisibility(renewwithThisDevice, waitTime);
			break;	
		case "NavToEssentialPlanwithDevice":
			flag = waitForElementVisibility(NavToEssentialPlanWithDevice, waitTime);
			break;
		case "NavToEssentialPlanwithGCash":
			flag = waitForElementVisibility(NavToEssentialPlanWithGCash, waitTime);
			break;
		case "ChooseYourUnliApp":
			flag = waitForElementVisibility(ChooseYourUnliApp, waitTime);
			break;
			
		case "NextIcon1":
			flag = waitForElementVisibility(NextIcon1, waitTime);
			break;
		case "nextIcon":
			flag = waitForElementVisibility(nextIcon, waitTime);
			break;
		case "owlnext":
			flag = waitForElementVisibility(owlnext, waitTime);
			break;
			
		case "monthlybillpay1999":
			flag = waitForElementVisibility(monthlybillpay1999, waitTime);
			break;
		case "monthlypaymentamount1999":
			flag = waitForElementVisibility(monthlypaymentamount1999, waitTime);
			break;
			
			
			
		case "AlwaysOnImg1":
			flag = waitForElementVisibility(AlwaysOnImg1, waitTime);
			break;
		case "MatchPerfect":
			flag = waitForElementVisibility(MatchPerfect, waitTime);
			break;
		case "DeviceHighlighted":
			flag = waitForElementVisibility(DeviceHighlighted, waitTime);
			break;
		case "Color":
			flag = waitForElementVisibility(Color, waitTime);
			break;
		case "HBOGo":
			flag = waitForElementVisibility(HBOGo, waitTime);
			break;
		case "AlwaysOnImg2":
			flag = waitForElementVisibility(AlwaysOnImg2, waitTime);
			break;
		case "PlusBanner4":
			flag = waitForElementVisibility(PlusBanner4, waitTime);
			break;
		case "GplanSimOnlyTab":
			flag = waitForElementVisibility(GplanSimOnlyTab, waitTime);
			break;
		case "GCashTab":
			flag = waitForElementVisibility(GCashTab, waitTime);
			break;
		case "AllDataTab":
			flag = waitForElementVisibility(AllDataTab, waitTime);
			break;
		case "SimOnlyPDP":
			flag = waitForElementVisibility(SimOnlyPDP, waitTime);
			break;
			
			
		case "PlusBanner5":
			flag = waitForElementVisibility(PlusBanner5, waitTime);
			break;
		case "ExtraBanner1":
			flag = waitForElementVisibility(ExtraBanner1, waitTime);
			break;
		case "AlwaysOnBanner1":
			flag = waitForElementVisibility(AlwaysOnBanner1, waitTime);
			break;
		case "GPlanPlus":
			flag = waitForElementVisibility(GPlanPlusOnly_LandingPage, waitTime);
			break;
			
			
		case "ValueAllData_LandingPage":
			flag = waitForElementVisibility(StarterAllData_LandingPage, waitTime);
			break;
		case "BasicAllData_LandingPage":
			flag = waitForElementVisibility(StarterAllData_LandingPage, waitTime);
			break;
			
		case "NavToValuePlanWithDevice":
			flag = waitForElementVisibility(NavToValuePlanWithDevice, waitTime);
			break;
		case "NavToAlwaysOnPlanWithDevice":
			flag = waitForElementVisibility(NavToAlwaysOnPlanWithDevice, waitTime);
			break;
		case "NavToAlwaysOnPlanWithGCash":
			flag = waitForElementVisibility(NavToAlwaysOnPlanWithGCash, waitTime);
			break;
		case "NavToAlwaysOnPlanWithSimOnly":
			flag = waitForElementVisibility(NavToAlwaysOnPlanWithSimOnly, waitTime);
			break;
		case "NavToAlwaysOnPlanWithAllData":
			flag = waitForElementVisibility(NavToAlwaysOnPlanWithAllData, waitTime);
			break;
			
		case "AlwaysOnBanner3":
			flag = waitForElementVisibility(AlwaysOnBanner3, waitTime);
			break;
		case "AlwaysOnBanner4":
			flag = waitForElementVisibility(AlwaysOnBanner4, waitTime);
			break;
		case "AlwaysOnBanner5":
			flag = waitForElementVisibility(AlwaysOnBanner5, waitTime);
			break;
			
		case "ExtraImg1":
			flag = waitForElementVisibility(ExtraImg1, waitTime);
			break;
		case "ExtraImg2":
			flag = waitForElementVisibility(ExtraImg2, waitTime);
			break;
		case "ExtraBanner3":
			flag = waitForElementVisibility(ExtraBanner3, waitTime);
			break;
		case "ExtraBanner4":
			flag = waitForElementVisibility(ExtraBanner4, waitTime);
			break;
		case "ExtraBanner5":
			flag = waitForElementVisibility(ExtraBanner5, waitTime);
			break;
			
		case "NavToExtraPlanWithDevice":
			flag = waitForElementVisibility(NavToExtraPlanWithDevice, waitTime);
			break;
		case "NavToExtraPlanWithGCash":
			flag = waitForElementVisibility(NavToExtraPlanWithGCash, waitTime);
			break;
		case "NavToExtraPlanWithSimOnly":
			flag = waitForElementVisibility(NavToExtraPlanWithSimOnly, waitTime);
			break;
		case "NavToExtraPlanWithAllData":
			flag = waitForElementVisibility(NavToExtraPlanWithAllData, waitTime);
			break;
			
		
		case "PlusImg1":
			flag = waitForElementVisibility(PlusImg1, waitTime);
			break;
		case "PlusImg2":
			flag = waitForElementVisibility(PlusImg2, waitTime);
			break;
		case "PlusBanner1":
			flag = waitForElementVisibility(PlusBanner1, waitTime);
			break;
		case "PlusBanner3":
			flag = waitForElementVisibility(PlusBanner3, waitTime);
			break;
		/*case "PlusBanner4":
			flag = waitForElementVisibility(PlusBanner4, waitTime);
			break;
		case "PlusBanner5":
			flag = waitForElementVisibility(PlusBanner5, waitTime);
			break;*/
			
			
			
		case "NavToPlusPlanWithGCash":
			flag = waitForElementVisibility(NavToPlusPlanWithGCash, waitTime);
			break;
		case "NavToPlusPlanWithDevice":
			flag = waitForElementVisibility(NavToPlusPlanWithDevice, waitTime);
			break;
		case "NavToPlusPlanWithSimOnly":
			flag = waitForElementVisibility(NavToPlusPlanWithSimOnly, waitTime);
			break;
		case "NavToPlusPlanWithAllData":
			flag = waitForElementVisibility(NavToPlusPlanWithAllData, waitTime);
			break;
			
		
		case "LiteBanner":
			flag = waitForElementVisibility(LiteBanner, waitTime);
			break;
		case "LiteBanner2":
			flag = waitForElementVisibility(LiteBanner2, waitTime);
			break;
		case "EssentialImg2":
			flag = waitForElementVisibility(EssentialImg2, waitTime);
			break;
		case "EssentialImg3":
			flag = waitForElementVisibility(EssentialImg3, waitTime);
			break;
		case "EssentialAllData_LandingPage":
			flag = waitForElementVisibility(EssentialAllData_LandingPage, waitTime);
			break;
		case "EssentialBanner3":
			flag = waitForElementVisibility(EssentialBanner3, waitTime);
			break;
		case "EssentialBanner4":
			flag = waitForElementVisibility(EssentialBanner4, waitTime);
			break;
		case "EssentialBanner5":
			flag = waitForElementVisibility(EssentialBanner5, waitTime);
			break;
			
		case "EssentialBanner1":
			flag = waitForElementVisibility(EssentialBanner1, waitTime);
			break;
		case "ValueBanner3":
			flag = waitForElementVisibility(ValueBanner3, waitTime);
			break;
		case "ValueBanner4":
			flag = waitForElementVisibility(ValueBanner4, waitTime);
			break;	
		case "ValueBanner5":
			flag = waitForElementVisibility(ValueBanner5, waitTime);
			break;	
		case "DataSoundsLikeMusic":
			flag = waitForElementVisibility(DataSoundsLikeMusic, waitTime);
			break;
		case "nextArrow":
			flag = waitForElementVisibility(nextArrow, waitTime);
			break;
		case "ValueBanner1":
			flag = waitForElementVisibility(ValueBanner1, waitTime);
			break;
		case "NavToValuePlanWithSimOnly":
			flag = waitForElementVisibility(NavToValuePlanWithSimOnly, waitTime);
			break;
		case "NavToValuePlanwithAllData":
			flag = waitForElementVisibility(NavToValuePlanwithAllData, waitTime);
			break;
		
		
		case "NavToEssentialPlanWithSimOnly":
			flag = waitForElementVisibility(NavToEssentialPlanWithSimOnly, waitTime);
			break;
		case "NavToEssentialPlanwithAllData":
			flag = waitForElementVisibility(NavToEssentialPlanWithAllData, waitTime);
			break;
			
			
				
		case "ValueImg1":
			flag = waitForElementVisibility(ValueImg1, waitTime);
			break;
		case "ValueImg2":
			flag = waitForElementVisibility(ValueImg2, waitTime);
			break;	
			
		case "BrightNewDay":
			flag = waitForElementVisibility(BrightNewDay, waitTime);
			break;
		case "BasicImg1":
			flag = waitForElementVisibility(BasicImg1, waitTime);
			break;
		case "BasicImg2":
			flag = waitForElementVisibility(BasicImg2, waitTime);
			break;	
			
		case "KeepInTouch":
			flag = waitForElementVisibility(KeepInTouch, waitTime);
			break;
		case "KeepThoseConnections":
			flag = waitForElementVisibility(KeepThoseConnections, waitTime);
			break;
			
		
		case "DataTypeBanner":
			flag = waitForElementVisibility(DataTypeBanner, waitTime);
			break;
		
		
		case "MobileDeviceCarousel":
			flag = waitForElementVisibility(MobileDeviceCarousel, waitTime);
			break;
		case "MobileDeviceCarousel1":
			flag = waitForElementVisibility(MobileDeviceCarousel1, waitTime);
			break;
		case "MobileDeviceCarousel2":
			flag = waitForElementVisibility(MobileDeviceCarousel2, waitTime);
			break;

			
		case "MoveBeyond":
			flag = waitForElementVisibility(MoveBeyond, waitTime);
			break;
		case "StarterAllData_LandingPage":
			flag = waitForElementVisibility(StarterAllData_LandingPage, waitTime);
			break;
		case "GoogleThatBanner":
			flag = waitForElementVisibility(GoogleThatBanner, waitTime);
			break;
		case "ReframeYourlifeStyle":
			flag = waitForElementVisibility(ReframeYourlifeStyle, waitTime);
			break;
			
		case "GplanPlus_LandingPage":
			flag = waitForElementVisibility(GplanPlus_LandingPage, waitTime);
			break;
		case "SoundTrackOfYourLife":
			flag = waitForElementVisibility(SoundTrackOfYourLife, waitTime);
			break;
			
			
		case "NoNeedDocs":
			flag = waitForElementVisibility(NoNeedDocs, waitTime);
			break;
			
		case "HighlightedGplanDevice1499":
			flag = waitForElementVisibility(HighlightedGplanDevice1499, waitTime);
			break;
		case "GPlanWithDevice1499":
			flag = waitForElementVisibility(GplanWithDevice1499, waitTime);
			break;
			
		case "HighlightedGplanSimonly999":
			flag = waitForElementVisibility(HighlightedGplanSimonly999, waitTime);
			break;
		case "MobileField":
			flag = waitForElementVisibility(MobileField, waitTime);
			break;	
		case "GreatLife":
			flag = waitForElementVisibility(GreatLife, waitTime);
			break;

		case "RenewWithThisDevice":
			flag = waitForElementVisibility(RenewWithThisDevice, waitTime);

			break;
			

		case "BasicBtn_Discovery":
			flag = waitForElementClickable(BasicBtn_Discovery, waitTime);
			break;

		case "BasicPlanSimOnlyTxt":
			flag = waitForElementVisibility(BasicPlanSimOnlyTxt, waitTime);
			break;
		case "Eightbanner":
			flag = waitForElementVisibility(Eightbanner, waitTime);
			break;
		case "AlwaysOnPlanStyle1":
			flag = waitForElementVisibility(AlwaysOnPlanStyle1, waitTime);
			break;

		case "PlusPlanStyle1":
			flag = waitForElementVisibility(PlusPlanStyle1, waitTime);
			break;
		case "EssentialPlanStyle1":
			flag = waitForElementVisibility(EssentialPlanStyle1, waitTime);
			break;
		case "ValuePlanStyle1":
			flag = waitForElementVisibility(ValuePlanStyle1, waitTime);
			break;

		case "AlwaysOnPlanStyle":
			flag = waitForElementVisibility(AlwaysOnPlanStyle, waitTime);
			break;

		case "ExtraPlanStyle":
			flag = waitForElementVisibility(ExtraPlanStyle, waitTime);
			break;
		case "ExtraPlanStyle1":
			flag = waitForElementVisibility(ExtraPlanStyle1, waitTime);
			break;

		case "PlusPlanStyle":
			flag = waitForElementVisibility(PlusPlanStyle, waitTime);
			break;
		case "EssentialPlanStyle":
			flag = waitForElementVisibility(EssentialPlanStyle, waitTime);
			break;
		case "ValuePlanStyle":
			flag = waitForElementVisibility(ValuePlanStyle, waitTime);
			break;
		case "LitePlanStyle":
			flag = waitForElementVisibility(LitePlanStyle, waitTime);
			break;
		case "BasicPlanStyle":
			flag = waitForElementVisibility(BasicPlanStyle, waitTime);
			break;
		case "StarterPlanStyle":
			flag = waitForElementVisibility(StarterPlanStyle, waitTime);
			break;
		case "StarterPlanStyle1":
			flag = waitForElementVisibility(StarterPlanStyle1, waitTime);
			break;
			
		case "LitePlanStyle1":
			flag = waitForElementVisibility(LitePlanStyle1, waitTime);
			break;
		case "BasicPlanStyle1":
			flag = waitForElementVisibility(BasicPlanStyle1, waitTime);
			break;

		case "HighlightedDeviceOpt":
			flag = waitForElementVisibility(HighlightedDeviceOpt, waitTime);
			break;
		case "HighlightedGPlanWithDevice999":
			flag = waitForElementVisibility(HighlightedGPlanWithDevice999, waitTime);
			break;
		case "HighlightedGPlanWithDevice599":
			flag = waitForElementVisibility(HighlightedGPlanWithDevice599, waitTime);
			break;
		case "HighlightedGPlanWithDevice1999":
			flag = waitForElementVisibility(HighlightedGPlanWithDevice1999, waitTime);
			break;
		case "HighlightedGPlanWithSimOnlyAllData1799":
			flag = waitForElementVisibility(HighlightedGPlanWithSimOnlyAllData1799, waitTime);
			break;
		case "HighlightedGPlanWithSimOnlyAllData1999":
			flag = waitForElementVisibility(HighlightedGPlanWithSimOnlyAllData1999, waitTime);
			break;
			
		case "SixthBannerTxt":
			flag = waitForElementVisibility(SixthBannerTxt, waitTime);
			break;
		case "DevicesDisplayed":
			flag = waitForElementVisibility(DevicesDisplayed, waitTime);
			break;

		case "FourthBannerTxt":
			flag = waitForElementVisibility(FourthBannerTxt, waitTime);
			break;
		case "FifthBannerTxt":
			flag = waitForElementVisibility(FifthBannerTxt, waitTime);
			break;
		case "PlanBuilderPage":
			flag = waitForElementVisibility(PlanBuilderPage, waitTime);
			break;
		case "PlanBuilderPage_Device":
			flag = waitForElementVisibility(PlanBuilderPage_Device, waitTime);
			break;
		case "FirstBannerTxt":
			flag = waitForElementVisibility(FirstBannerTxt, waitTime);
			break;
		case "CustomizeGlobePlan":
			flag = waitForElementVisibility(CustomizeGlobePlan, waitTime);
			break;
			
			
		case "GPlanDevice1499":
			flag = waitForElementVisibility(GPlanDevice1499, waitTime);
			break;
		case "GPlanPlusSimOnly999":
			flag = waitForElementVisibility(GPlanPlusSimOnly999, waitTime);
			break;
		case "GPlanWithSimOnly999":
			flag = waitForElementVisibility(GPlanWithSimOnly999, waitTime);
			break;
			
		case "GPlanSimOnlyAllData1999":
			flag = waitForElementVisibility(GPlanSimOnlyAllData1999, waitTime);
			break;
		case "GPlanSimOnlyAllData1799":
			flag = waitForElementVisibility(GPlanSimOnlyAllData1799, waitTime);
			break;

		case "NavToLitePlanWithDevice":
			flag = waitForElementVisibility(NavToLitePlanWithDevice, waitTime);
			break;
		case "NavToLitePlanWithGCash":
			flag = waitForElementVisibility(NavToLitePlanWithGCash, waitTime);
			break;
		case "NavToLitePlanWithSimOnly":
			flag = waitForElementVisibility(NavToLitePlanWithSimOnly, waitTime);
			break;
		case "NavToLitePlanwithAllData":
			flag = waitForElementVisibility(NavToLitePlanwithAllData, waitTime);
			break;
			
			
		case "Device_LandingPage":
			flag = waitForElementVisibility(Device_LandingPage, waitTime);
			break;
		case "GCash_LandingPage":
			flag = waitForElementVisibility(GCash_LandingPage, waitTime);
			break;
		case "SimOnly_BasicLandingPage":
			flag = waitForElementVisibility(SimOnly_LandingPage, waitTime);
			break;
		case "SimOnly_LandingPage":
			flag = waitForElementVisibility(SimOnly_LandingPage, waitTime);
			break;
			
		case "AllData_BasicLandingPage":
			flag = waitForElementVisibility(AllData_LandingPage, waitTime);
			break;
		case "NavToBasicPlanwithDevice":
			flag = waitForElementVisibility(NavToBasicPlanwithDevice, waitTime);
			break;
		case "NavToBasicPlanWithDevice":
			flag = waitForElementVisibility(NavToBasicPlanWithDevice, waitTime);
			break;
		case "NavToValuePlanWithGCash":
			flag = waitForElementVisibility(NavToValuePlanWithGCash, waitTime);
			break;
			
			
		case "NavToStarterPlanwithDevice":
			flag = waitForElementVisibility(NavToStarterPlanwithDevice, waitTime);
			break;
		case "NavToExtraPlanwithDevice":
			flag = waitForElementVisibility(NavToExtraPlanwithDevice, waitTime);
			break;

		case "NavToStarterPlanwithGCash":
			flag = waitForElementVisibility(NavToStarterPlanwithGCash, waitTime);
			break;
		case "NavToExtraPlanwithGCash":
			flag = waitForElementVisibility(NavToExtraPlanwithGCash, waitTime);
			break;
			
		case "NavToBasicPlanWithSimOnly":
			flag = waitForElementVisibility(NavToBasicPlanWithSimOnly, waitTime);
			break;
		case "NavToBasicPlanwithSimOnly":
			flag = waitForElementVisibility(NavToBasicPlanwithSimOnly, waitTime);
			break;
		case "NavToExtraPlanwithSimOnly":
			flag = waitForElementVisibility(NavToExtraPlanwithSimOnly, waitTime);
			break;
		case "NavToStarterPlanwithSimOnly":
			flag = waitForElementVisibility(NavToStarterPlanwithSimOnly, waitTime);
			break;
		case "NavToBasicPlanwithAllData":
			flag = waitForElementVisibility(NavToBasicPlanwithAllData, waitTime);
			break;
		case "NavToBasicPlanwithGCash":
			flag = waitForElementVisibility(NavToBasicPlanwithGCash, waitTime);
			break;
		case "NavToExtraPlanwithAllData":
			flag = waitForElementVisibility(NavToExtraPlanwithAllData, waitTime);
			break;
		case "NavToStarterPlanwithAllData":
			flag = waitForElementVisibility(NavToStarterPlanwithAllData, waitTime);
			break;

		// ------------------Bhavana script starts here--------
		case "Selecteddevice":
			flag = waitForElementVisibility(Selecteddevice, waitTime);
			break;
		case "Selecteddevice_amount":
			flag = waitForElementVisibility(Selecteddevice_amount, waitTime);
			break;
		case "Gplanwithdeviceamount":
			flag = waitForElementVisibility(Gplanwithdeviceamount, waitTime);
			break;
		case "PlannameGplanwithdevice":
			flag = waitForElementVisibility(PlannameGplanwithdevice, waitTime);
			break;
		case "GplanwithdeviceMonthlyamount":
			flag = waitForElementVisibility(GplanwithdeviceMonthlyamount, waitTime);
			break;
		case "gcashverifiedtext":
			flag = waitForElementVisibility(gcashverifiedtext, waitTime);
			break;
		case "gcashcredits":
			flag = waitForElementVisibility(gcashcredits, waitTime);
			break;
		case "Breakdown_Gcashcredits":
			flag = waitForElementVisibility(Breakdown_Gcashcredits, waitTime);
			break;
		case "Plannamegcash":
			flag = waitForElementVisibility(Plannamegcash, waitTime);
			break;
		case "Gcashamount":
			flag = waitForElementVisibility(Gcashamount, waitTime);
			break;
		case "Gcashamount_999":
			flag = waitForElementVisibility(Gcashamount_999, waitTime);
			break;
		case "Breakdownn_Viupremium":
			flag = waitForElementVisibility(Breakdownn_Viupremium, waitTime);
			break;
		case "Breakdownn_EasyRoam":
			flag = waitForElementVisibility(Breakdownn_EasyRoam, waitTime);
			break;
		case "Breakdownn_Gocallid":
			flag = waitForElementVisibility(Breakdownn_Gocallid, waitTime);
			break;
		case "Breakdownn_Gsaddsurf":
			flag = waitForElementVisibility(Breakdownn_Gsaddsurf, waitTime);
			break;
		case "Addonsamount":
			flag = waitForElementVisibility(Addonsamount, waitTime);
			break;
		case "Addonsamount_999":
			flag = waitForElementVisibility(Addonsamount_999, waitTime);
			break;
		case "Addonsamount_599":
			flag = waitForElementVisibility(Addonsamount_599, waitTime);
			break;

		case "Monthlyamount":
			flag = waitForElementVisibility(Monthlyamount, waitTime);
			break;
		case "Monthlyamount_999":
			flag = waitForElementVisibility(Monthlyamount_999, waitTime);
			break;
		case "Monthlyamount_599":
			flag = waitForElementVisibility(Monthlyamount_599, waitTime);
			break;
		case "Gcash_Monthlypayment_amount":
			flag = waitForElementVisibility(Monthlypayment_amount, waitTime);
			break;

		case "Breakdownn_Spotifypremium":
			flag = waitForElementVisibility(Breakdownn_Spotifypremium, waitTime);
			break;

		// ------ RONNIE SCRIPT ADA5---------
		case "Contractduration_Value":
			flag = waitForElementVisibility(Contractduration_Value, waitTime);
			break;
		case "Simonly_basic_btn":
			flag = waitForElementVisibility(Simonly_basic_btn, waitTime);
			break;
		case "Breakdown_Mobilenum":
			flag = waitForElementVisibility(Breakdown_Mobilenum, waitTime);
			break;
		case "Planname_SimOnly999":
			flag = waitForElementVisibility(Planname_SimOnly999, waitTime);
			break;
		case "Planname_SimOnly999_Price":
			flag = waitForElementVisibility(Planname_SimOnly999_Price, waitTime);
			break;
		case "GSSurf99addon":
			flag = waitForElementVisibility(GSSurf99addon, waitTime);
			break;
		case "Monthlybill_amountSimOnly999_GS99addon":
			flag = waitForElementVisibility(Monthlybill_amountSimOnly999_GS99addon, waitTime);
			break;
		case "Totalsubsandaddons_amountSimOnly999_GS99addon":
			flag = waitForElementVisibility(Totalsubsandaddons_amountSimOnly999_GS99addon, waitTime);
			break;
		case "Monthlypayment_amountSimOnly999_GS99addon":
			flag = waitForElementVisibility(Monthlypayment_amountSimOnly999_GS99addon, waitTime);
			break;

		// ------ RONNIE SCRIPT ADA5 END HERE -------

		case "Disc_starterbtn":
			flag = waitForElementVisibility(Disc_starterbtn, waitTime);
			break;
		case "Starter_header":
			flag = waitForElementVisibility(Starter_header, waitTime);
			break;
		case "Build_btn":
			flag = waitForElementVisibility(Build_btn, waitTime);
			break;
		case "Device_strtr_btn":
			flag = waitForElementVisibility(Device_strtr_btn, waitTime);
			break;
		case "GCash_strtr_btn":
			flag = waitForElementVisibility(GCash_strtr_btn, waitTime);
			break;
		case "Simonly_strtr_btn":
			flag = waitForElementVisibility(Simonly_strtr_btn, waitTime);
			break;
		case "Alldata_strtr_btn":
			flag = waitForElementVisibility(Alldata_strtr_btn, waitTime);
			break;
		case "Price_599":
			flag = waitForElementVisibility(Price_599, waitTime);
			break;
		case "Banner":
			flag = waitForElementVisibility(Banner, waitTime);
			break;

		case "MyDuo":
			flag = waitForElementVisibility(MyDuo, waitTime);
			break;
		case "inputMobileNumber":
			flag = waitForElementVisibility(inputMobileNumber, waitTime);
			break;
			
	
		case "Addonsheader":
			flag = waitForElementVisibility(Addonsheader, waitTime);
			break;
		case "Monthlybillheader":
			flag = waitForElementVisibility(Monthlybillheader, waitTime);
			break;
		case "starterbanner1":
			flag = waitForElementVisibility(starterbanner1, waitTime);
			break;
		case "starterbanner2":
			flag = waitForElementVisibility(starterbanner2, waitTime);
			break;
		case "starterbanner3":
			flag = waitForElementVisibility(starterbanner3, waitTime);
			break;
		case "starterbanner4":
			flag = waitForElementVisibility(starterbanner4, waitTime);
			break;
		case "starterbanner5":
			flag = waitForElementVisibility(starterbanner5, waitTime);
			break;
		case "starterbanner6":
			flag = waitForElementVisibility(starterbanner6, waitTime);
			break;
		case "starterbanner7":
			flag = waitForElementVisibility(starterbanner7, waitTime);
			break;
		case "starterbanner8":
			flag = waitForElementVisibility(starterbanner8, waitTime);
			break;
		case "deviceclick":
			flag = waitForElementVisibility(deviceclick, waitTime);
			break;
		case "gcashclick":
			flag = waitForElementVisibility(gcashclick, waitTime);
			break;

		case "pluseclick":
			flag = waitForElementVisibility(pluseclick, waitTime);
			break;

		case "alldataclick":
			flag = waitForElementVisibility(alldataclick, waitTime);
			break;

		case "Bannerplus1":
			flag = waitForElementVisibility(Bannerplus1, waitTime);
			break;
		case "Bannerplus2":
			flag = waitForElementVisibility(Bannerplus2, waitTime);
			break;
		case "Bannerplus3":
			flag = waitForElementVisibility(Bannerplus3, waitTime);
			break;
		case "Bannerplus4":
			flag = waitForElementVisibility(Bannerplus4, waitTime);
			break;
		case "Bannerplus5":
			flag = waitForElementVisibility(Bannerplus5, waitTime);
			break;
		case "Bannerplus6":
			flag = waitForElementVisibility(Bannerplus6, waitTime);
			break;
		case "Bannerplus7":
			flag = waitForElementVisibility(Bannerplus7, waitTime);
			break;
		case "Bannerplus8":
			flag = waitForElementVisibility(Bannerplus8, waitTime);
			break;
		case "Bannerplus9":
			flag = waitForElementVisibility(Bannerplus9, waitTime);
			break;
		case "starterbanner1Always":
			flag = waitForElementVisibility(starterbanner1Always, waitTime);
			break;
		case "starterbanner2Always":
			flag = waitForElementVisibility(starterbanner2Always, waitTime);
			break;
		case "starterbanner3Always":
			flag = waitForElementVisibility(starterbanner3Always, waitTime);
			break;
		case "starterbanner4Always":
			flag = waitForElementVisibility(starterbanner4Always, waitTime);
			break;
		case "starterbanner5Always":
			flag = waitForElementVisibility(starterbanner5Always, waitTime);
			break;
		case "starterbanner6Always":
			flag = waitForElementVisibility(starterbanner6Always, waitTime);
			break;
		case "starterbanner7Always":
			flag = waitForElementVisibility(starterbanner7Always, waitTime);
			break;
		case "starterbanner8Always":
			flag = waitForElementVisibility(starterbanner8Always, waitTime);
			break;
		case "starterbanner9Always":
			flag = waitForElementVisibility(starterbanner9Always, waitTime);
			break;

		case "Dragbutton":
			flag = waitForElementVisibility(Dragbutton, waitTime);
			break;
		case "Banner1":
			flag = waitForElementVisibility(Banner1, waitTime);
			break;
		case "Planname":
			flag = waitForElementVisibility(Planname, waitTime);
			break;
		case "Plan_amount":
			flag = waitForElementVisibility(Plan_amount, waitTime);
			break;
		case "SURF":
			flag = waitForElementVisibility(SURF, waitTime);
			break;
		case "mysuper":
			flag = waitForElementVisibility(mysuper, waitTime);
			break;

		case "inputmoblienum":
			flag = waitForElementVisibility(inputmoblienum, waitTime);
			break;
		
		case "Banner2":
			flag = waitForElementVisibility(Banner2, waitTime);
			break;
		case "Gplan1999":
			flag = waitForElementVisibility(Gplan1999, waitTime);
			break;
		case "Gplan1799":
			flag = waitForElementVisibility(Gplan1799, waitTime);
			break;
		case "Planname1999":
			flag = waitForElementVisibility(planename1999, waitTime);
			break;
		case "Planname1799":
			flag = waitForElementVisibility(planename1799, waitTime);
			break;
		case "planeamount1799":
			flag = waitForElementVisibility(planeamount1799, waitTime);
			break;
		case "planeamount1999":
			flag = waitForElementVisibility(planeamount1999, waitTime);
			break;
		case "monthlybillpay1799":
			flag = waitForElementVisibility(monthlybillpay1799, waitTime);
			break;
		case "monthlypaymentamount1799":
			flag = waitForElementVisibility(monthlypaymentamount1799, waitTime);
			break;
		case "panenameDAF":
			flag = waitForElementVisibility(panenameDAF, waitTime);
			break;

		// ----- RONNIE SCRIPT START HERE-----
		case "BasicBanner1":
			flag = waitForElementVisibility(BasicBanner1, waitTime);
			break;
		case "BasicBanner2":
			flag = waitForElementVisibility(BasicBanner2, waitTime);
			break;
		case "BasicBanner3":
			flag = waitForElementVisibility(BasicBanner3, waitTime);
			break;
		case "BasicBanner4":
			flag = waitForElementVisibility(BasicBanner4, waitTime);
			break;
		case "BasicBanner5":
			flag = waitForElementVisibility(BasicBanner5, waitTime);
			break;
		case "BasicBanner6":
			flag = waitForElementVisibility(BasicBanner6, waitTime);
			break;
		case "BasicBanner7":
			flag = waitForElementVisibility(BasicBanner7, waitTime);
			break;
		case "BasicBanner8":
			flag = waitForElementVisibility(BasicBanner8, waitTime);
			break;
		case "BasicBanner9":
			flag = waitForElementVisibility(BasicBanner9, waitTime);
			break;
		/*************** ADA 1 STARTS HERE **********************/
		case "GplanSimonly599":
			flag = waitForElementVisibility(GplanSimonly599, waitTime);
			break;
		case "SimOnly599GOCALLIDD199":
			flag = waitForElementVisibility(SimOnly599GOCALLIDD199, waitTime);
			break;
		case "Addonamount599":
			flag = waitForElementVisibility(Addonamount599, waitTime);
			break;
		case "Monthyaddon599":
			flag = waitForElementVisibility(Monthyaddon599, waitTime);
			break;
		case "Totalmontlypaymentsimonly599":
			flag = waitForElementVisibility(Totalmontlypaymentsimonly599, waitTime);
			break;
		case "showsAndMoviesToggle":
			flag = waitForElementVisibility(showsAndMoviesToggle, waitTime);
			break;

		case "AmazonprimeVideoaddon599":
			flag = waitForElementVisibility(AmazonprimeVideoaddon599, waitTime);
			break;

		case "viupremiuum599":
			flag = waitForElementVisibility(viupremiuum599, waitTime);
			break;

		case "spotifypremiuum599":
			flag = waitForElementVisibility(spotifypremiuum599, waitTime);
			break;
		case "TalkingovermessageAddOn":
			flag = waitForElementVisibility(TalkingovermessageAddOn, waitTime);
			break;
		case "lifestylemessageAddOn":
			flag = waitForElementVisibility(lifestylemessageAddOn, waitTime);
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
		case "Disc_Basicbtn":
			flag = waitForElementClickable(Disc_Basicbtn, waitTime);
			break;
		case "BasicBtn_Discovery":
			flag = waitForElementClickable(BasicBtn_Discovery, waitTime);
			break;

		case "DiscooverPlus":
			flag = waitForElementClickable(DiscooverPlus, waitTime);
			break;
		case "Disc_starterbtn":
			flag = waitForElementClickable(Disc_starterbtn, waitTime);
			break;
		case "Dragbutton":
			flag = waitForElementClickable(Dragbutton, waitTime);
			break;
		case "inputmoblienum":
			flag = waitForElementClickable(inputmoblienum, waitTime);
			break;
		case "proceedbtn1":
			flag = waitForElementClickable(proceedbtn1, waitTime);
			break;
		/*************** ADA 1 STARTS HERE **********************/
		case "GplanSimonly599":
			flag = waitForElementVisibility(GplanSimonly599, waitTime);
			break;
		case "SimOnly599GOCALLIDD199":
			flag = waitForElementVisibility(SimOnly599GOCALLIDD199, waitTime);
			break;
		case "Addonamount599":
			flag = waitForElementVisibility(Addonamount599, waitTime);
			break;
		case "Monthyaddon599":
			flag = waitForElementVisibility(Monthyaddon599, waitTime);
			break;
		case "Totalmontlypaymentsimonly599":
			flag = waitForElementVisibility(Totalmontlypaymentsimonly599, waitTime);
			break;
		case "showsAndMoviesToggle":
			flag = waitForElementVisibility(showsAndMoviesToggle, waitTime);
			break;
		case "AmazonprimeVideoaddon599":
			flag = waitForElementVisibility(AmazonprimeVideoaddon599, waitTime);
			break;
		case "viupremiuum599":
			flag = waitForElementVisibility(viupremiuum599, waitTime);
			break;

		case "spotifypremiuum599":
			flag = waitForElementVisibility(spotifypremiuum599, waitTime);
			break;
		case "TalkingovermessageAddOn":
			flag = waitForElementVisibility(TalkingovermessageAddOn, waitTime);
			break;
		case "lifestylemessageAddOn":
			flag = waitForElementVisibility(lifestylemessageAddOn, waitTime);
			break;
		case "deviceNameinPDPage":
			flag = waitForElementVisibility(deviceNameinPDPage, waitTime);
			break;
			
		case "capacity":
			flag = waitForElementVisibility(capacity, waitTime);
			break;	
		case "contractDuration":
			flag = waitForElementVisibility(contractDuration, waitTime);
			break;	
		case "discoverGplanBelow":
			flag = waitForElementVisibility(discoverGplanBelow, waitTime);
			break;

		case "Mobilenumfield":
			flag = waitForElementClickable(Mobilenumfield, waitTime);
			break;
		case "Checkbutton":
			flag = waitForElementClickable(Checkbutton, waitTime);
			break;
		case "Price_599WithDevice":
			flag = waitForElementClickable(Price_599WithDevice, waitTime);
			break;
		case "CarouselDeviceplanprevious":
			flag = waitForElementClickable(CarouselDeviceplanprevious, waitTime);
			break;
		case "CarouselDeviceplanNext":
			flag = waitForElementClickable(CarouselDeviceplanNext, waitTime);
			break;

		case "DeviceSearch":
			flag = waitForElementClickable(DeviceSearch, waitTime);
			break;
		case "Color_Click":
			flag = waitForElementClickable(Color_Click, waitTime);
			break;
		case "RadioButtonColor":
			flag = waitForElementClickable(RadioButtonColor, waitTime);
			break;
		case "RadioButtonColor1":
			flag = waitForElementClickable(RadioButtonColor, waitTime);
			break;
		case "RenewWihDevice":
			flag = waitForElementClickable(RenewWihDevice, waitTime);
			break;
		case "CarouselDevicePrevBtn ":
			flag = waitForElementClickable(CarouselDevicePrevBtn, waitTime);
			break;
		case "CarouselDeviceNextBtn":
			flag = waitForElementClickable(CarouselDeviceNextBtn, waitTime);
			break;
		case "Reviewmyplan":
			flag = waitForElementClickable(Reviewmyplan, waitTime);
			break;
		case "ViuAddon":
			flag = waitForElementClickable(ViuAddon, waitTime);
			break;
		case "AmazonAddon":
			flag = waitForElementClickable(AmazonAddon, waitTime);
			break;
		case "SpotifyAddon":
			flag = waitForElementClickable(SpotifyAddon, waitTime);
			break;
		case "MyDuoaddon":
			flag = waitForElementClickable(MyDuoaddon, waitTime);
			break;
		case "EasyRoamaddon":
			flag = waitForElementClickable(EasyRoamaddon, waitTime);
			break;
		case "GSAddSur99addon":
			flag = waitForElementClickable(EasyRoamaddon, waitTime);
			break;
		case "UntickMyDuo":
			flag = waitForElementClickable(UntickMyDuo, waitTime);
			break;
		case "Recomputemyplan":
			flag = waitForElementClickable(Recomputemyplan, waitTime);
			break;
		case "Proceedwithmyplan":
			flag = waitForElementClickable(Proceedwithmyplan, waitTime);
			break;

		case "Price_1499WithDevice":
			flag = waitForElementClickable(Price_1499WithDevice, waitTime);
			break;
		case "GplanAllData2499":
			flag = waitForElementClickable(GplanAllData2499, waitTime);
			break;
			
			

		}

		return flag;
	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void moveToElement(String element) throws Exception {

		WebElement ele = null;

		switch (element) {
		case "Disc_starterbtn":
			ele = DriverManager.getDriver().findElement(Disc_starterbtn);
			break;
		case "Device_strtr_btn":
			ele = DriverManager.getDriver().findElement(Device_strtr_btn);
			break;
		
		case "inputMobileNumber":
			ele = DriverManager.getDriver().findElement(inputMobileNumber);
			break;
			
		case "DiscooverPlus":
			ele = DriverManager.getDriver().findElement(DiscooverPlus);
			break;
	

		case "BasicBanner1":
			ele = DriverManager.getDriver().findElement(BasicBanner1);
			break;
		case "BasicBanner2":
			ele = DriverManager.getDriver().findElement(BasicBanner2);
			break;
		case "BasicBanner3":
			ele = DriverManager.getDriver().findElement(BasicBanner3);
			break;
		case "BasicBanner4":
			ele = DriverManager.getDriver().findElement(BasicBanner4);
			break;
		case "BasicBanner5":
			ele = DriverManager.getDriver().findElement(BasicBanner5);
			break;
		case "BasicBanner6":
			ele = DriverManager.getDriver().findElement(BasicBanner6);
			break;
		case "BasicBanner7":
			ele = DriverManager.getDriver().findElement(BasicBanner7);
			break;
		case "BasicBanner8":
			ele = DriverManager.getDriver().findElement(BasicBanner8);
			break;

		case "ViewBreakdown":
			ele = DriverManager.getDriver().findElement(ViewBreakdown);
			break;
		case "email":
			ele = DriverManager.getDriver().findElement(email);
			break;
		case "Proceed":
			ele = DriverManager.getDriver().findElement(Proceed);
			break;
		case "Mobilenumfield":
			ele = DriverManager.getDriver().findElement(Mobilenumfield);
			break;
		case "Checkbutton":
			ele = DriverManager.getDriver().findElement(Checkbutton);
			break;
		case "DeviceSearch":
			ele = DriverManager.getDriver().findElement(DeviceSearch);
			break;

		case "Color_Click":
			ele = DriverManager.getDriver().findElement(Color_Click);
			break;

		case "RadioButtonColor":
			ele = DriverManager.getDriver().findElement(RadioButtonColor);
			break;
		case "RadioButtonColor1":
			ele = DriverManager.getDriver().findElement(RadioButtonColor1);
			break;
		case "RenewWihDevice1":
			ele = DriverManager.getDriver().findElement(RenewWihDevice);
			break;
		case "Price_599WithDevice":
			ele = DriverManager.getDriver().findElement(Price_599WithDevice);
			break;

		case "Reviewmyplan":
			ele = DriverManager.getDriver().findElement(Reviewmyplan);
			break;
		case "UntickMyDuo":
			ele = DriverManager.getDriver().findElement(UntickMyDuo);
			break;
		case "Recomputemyplan":
			ele = DriverManager.getDriver().findElement(Recomputemyplan);
			break;
		case "Proceedwithmyplan":
			ele = DriverManager.getDriver().findElement(Proceedwithmyplan);
			break;
		case "Price_1499WithDevice":
			ele = DriverManager.getDriver().findElement(Price_1499WithDevice);
			break;
		case "GplanAllData2499":
			ele = DriverManager.getDriver().findElement(GplanAllData2499);
			break;
			

		}

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {
			Generic.WriteTestData("Hover on '"+element+"'",element,"","Able to Hover on '"+element+"' button.","Hovered on '"+element+"'is unsucessfull .","Fail");
		}
		Generic.WriteTestData("Hover on '"+element+"'",element,"","Able to Hover on '"+element+"' button.","Hovered on '"+element+"' .","Passed");	}

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
	public void write_OrderID_in_PropertiesFile(String key, String data) {
		FileOutputStream fileOut = null;
		FileInputStream fileIn = null;
		try {
			Properties p = new Properties();

			File file = new File(".//OrderID.properties");
			fileIn = new FileInputStream(file);
			p.load(fileIn);
			p.setProperty(key, data);
			fileOut = new FileOutputStream(file);
			p.store(fileOut, null);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			try {
				fileOut.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {
			
			case "UntickMySuperDuo":
				get_UntickMySuperDuo().click();
				break;
			case "AlwaysOnAllData_LandingPage":
				get_AlwaysOnAllData_LandingPage().click();
				break;
			case "AllData_LandingPage":
				get_AllData_LandingPage().click();
				break;
			case "PDP_Device":
				get_PDP_Device().click();
				break;
			case "SimOnly_LandingPage":
				get_SimOnly_LandingPage().click();
				break;
			case "discoverGplanBelow":
				get_discoverGplanBelow().click();
				break;
			case "reserveThisDevice":
				get_reserveThisDevice().click();
				break;
			case "selectAnotherDevice":
				get_selectAnotherDevice().click();
				break;
			
			case "renewwithThisDevice":
				get_renewwithThisDevice().click();
				break;
			case "banner2alldata":
				get_banner2alldata().click();
				break;
			case "banner2device":
				get_banner2device().click();
				break;
			case "DeviceTab":
				get_DeviceTab().click();
				break;
			case "GplanWithDevice1499":
				get_GplanWithDevice1499().click();
				break;
			case "GPlanSimOnlyAllData1999":
				get_GPlanSimOnlyAllData1999().click();
				break;
				
			case "GCashOption_PDP":
				get_GCashOption_PDP().click();
				break;
				
			case "AlwaysOnImg1":
				get_AlwaysOnImg1().click();
				break;
			case "AlwaysOnImg2":
				get_AlwaysOnImg2().click();
				break;
			case "PlusAllData_LandingPage":
				get_PlusAllData_LandingPage().click();
				break;
			case "ExtraImg2":
				get_ExtraImg2().click();
				break;
			case "ExtraImg1":
				get_ExtraImg2().click();
				break;
				
				
				
			case "BasicImg1":
				get_BasicImg1().click();
				break;
			case "PlusImg2":
				get_PlusImg2().click();
				break;
			case "PlusImg1":
				get_PlusImg1().click();
				break;			
			case "nextArrow":
				get_nextArrow().click();
				break;
			case "EssentialAllData_LandingPage":
				get_EssentialAllData_LandingPage().click();
				break;
			case "ExtraAllData_LandingPage":
				get_ExtraAllData_LandingPage().click();
				break;
				
				
			case "ValueImg1":
				get_ValueImg1().click();
				break;
			case "ValueImg2":
				get_ValueImg2().click();
				break;
			case "EssentialImg2":
				get_EssentialImg2().click();
				break;
			case "EssentialImg3":
				get_EssentialImg3().click();
				break;
				
				
			case "SimOnlyTab":
				get_SimOnlyTab().click();
				break;
			case "AllDataTab":
				get_AllDataTab().click();
				break;
			case "CheckEligibilityBtn":
				get_AllDataTab().click();
				break;
			case "GPlanSimOnlyAllData1799":
				get_GPlanSimOnlyAllData1799().click();
				break;
			case "LiteBanner":
				get_LiteBanner().click();
				break;
			case "LiteBanner2":
				get_LiteBanner2().click();
				break;
				

			case "SelectDevice":
				get_SelectDevice().click();
				break;
			case "BreakdownCloseIcon":
				get_BreakdownCloseIcon().click();
				break;
				
			case "GPlanPlusSimOnly999":
				get_GPlanPlusSimOnly999().click();
				break;
			case "GPlanWithSimOnly999":
				get_GPlanWithSimOnly999().click();
				break;

			case "GetStarted_PlanWithGCash":
				get_GetStarted_PlanWithGCash().click();
				break;
			case "GetStarted_EssentialPlanwithDevice":
				get_GetStarted_EssentialPlanwithDevice().click();
				break;

				
			case "banner2gcash":
				get_banner2gcash().click();
				break;

			case "banner2gpluse":
				get_banner2gpluse().click();
				break;
			case "Device_LandingPage":
				get_Device_LandingPage().click();
				break;
			case "GCash_LandingPage":
				get_GCash_LandingPage().click();
				break;
			
			case "GplanPlus_LandingPage":
				get_GplanPlus_LandingPage().click();
				break;
			
			case "StarterAllData_LandingPage":
				get_StarterAllData_LandingPage().click();
				break;
			case "BasicAllData_LandingPage":
				get_BasicAllData_LandingPage().click();
				break;
			case "ValueAllData_LandingPage":
				get_StarterAllData_LandingPage().click();
				break;

				
			case "CarouselDeviceNextBtn":
				get_CarouselDeviceNextBtn().click();
				break;
			case "Disc_Basicbtn":
				get_Disc_Basicbtn().click();
				break;
			case "Disc_starterbtn":
				get_Disc_starterbtn().click();
				break;
			case "Build_btn":
				get_Build_btn().click();
				break;
			case "Device_strtr_btn":
				get_Device_strtr_btn().click();
				break;
			case "GCash_strtr_btn":
				get_GCash_strtr_btn().click();
				break;
			case "Simonly_strtr_btn":
				get_Simonly_strtr_btn().click();
				break;
			case "Alldata_strtr_btn":
				get_Alldata_strtr_btn().click();
				break;
			case "Data_addon":
				get_Data_addon().click();
				break;
			case "Data_checkbox":
				get_Data_checkbox().click();
				break;
			case "GSAddsurf99":
				get_GSAddsurf99().click();
				break;

			case "movie_checkbox":
				get_movie_checkbox().click();
				break;
			case "Amazonprime":
				get_Amazonprime().click();
				break;
			case "Viupremium":
				get_Viupremium().click();
				break;
			case "Spotifypremium":
				get_Spotifypremium().click();
				break;
			case "message_addon":
				get_message_addon().click();
				break;
			case "message_checkbox":
				get_message_checkbox().click();
				break;
			case "MyDuo":
				get_MyDuo().click();
				break;
			case "MySuperDuo":
				get_MySuperDuo().click();
				break;
			case "lifestyle_addon":
				get_lifestyle_addon().click();
				break;
			case "lifestyle_checkbox":
				get_lifestyle_checkbox().click();
				break;
			case "easyRoam":
				get_easyRoam().click();
				break;
			case "Gocallid199":
				get_Gocallid199().click();
				break;
			case "dropdown_Planbreakdwn":
				get_dropdown_Planbreakdwn().click();
				break;
			case "Proceedbtn":
				get_Proceedbtn().click();
				break;
			case "Disc_starterbtn_arrow":
				get_Disc_starterbtn_arrow().click();
				break;
			case "Dragbutton":
				get_Dragbutton().click();
				break;
			case "proceedbtn1":
				get_proceedbtn1().click();
				break;
			case "Breakdown_proceedbutton":
				get_Breakdown_proceedbutton().click();
				break;
				
			case "inputMobileNumber":
				get_inputMobileNumber().click();
				break;

			/*************** ADA 1 STARTS HERE **********************/
			case "showsAndMoviesToggle":
				get_showsAndMoviesToggle().click();
				break;

			case "AmazonprimeVideoaddon599":
				get_AmazonprimeVideoaddon599().click();
				break;
			case "spotifypremiuum599":
				get_spotifypremiuum599().click();
				break;

			case "viupremiuum599":
				get_viupremiuum599().click();
				break;
			case "TalkingovermessageAddOn":
				get_TalkingovermessageAddOn().click();
				break;
			case "lifestylemessageAddOn":
				get_lifestylemessageAddOn().click();
				break;

			
			case "MandatoryCheckbox":
				get_MandatoryCheckbox().click();
				break;
			case "NextBtn":
				get_NextBtn().click();
				break;
			case "AgreeBtn":
				get_AgreeBtn().click();
				break;
			case "PayBtn":
				get_PayBtn().click();
				break;
			case "SubmitBtn":
				get_SubmitBtn().click();
				break;
			
			case "ViewBreakdown":
				get_ViewBreakdown().click();
				break;
			
			case "PDProamingIcon":
				get_PDProamingIcon().click();
				break;
			
			case "PDPcallIcon":
				get_PDPcallIcon().click();
				break;
			
			case "Mobilenumfield":
				get_Mobilenumfield().click();
				break;
			case "PDPplanIcon":
				get_PDPplanIcon().click();
				break;
			case "PDPdataIcon":
				get_PDPdataIcon().click();
				break;
				
			case "Checkbutton":
				get_Checkbutton().click();
				break;
			case "CarouselDevicePrevBtn":
				get_CarouselDevicePrevBtn().click();
				break;
			case "CarouselDeviceplanNext":
				get_CarouselDeviceplanNext().click();
				break;

			case "DeviceSearch":
				get_DeviceSearch().click();
				break;

			case "Color_Click":
				get_Color_Click().click();
				break;
			case "RadioButtonColor":
				get_RadioButtonColor().click();
				break;
			case "RadioButtonColor1":
				get_RadioButtonColor1().click();
				break;
			
			case "RenewWihDevice":
				get_RenewWihDevice().click();
				break;
			
			case "Reviewmyplan":
				get_Reviewmyplan().click();
				break;
			case "ViuAddon":
				get_ViuAddon().click();
				break;
			case "AmazonAddon":
				get_AmazonAddon().click();
				break;
			case "SpotifyAddon":
				get_SpotifyAddon().click();
				break;
			case "MyDuoaddon":
				get_MyDuoaddon().click();
				break;
			case "EasyRoamaddon":
				get_EasyRoamaddon().click();
				break;
			
			case "UntickMyDuo":
				get_UntickMyDuo().click();
				break;
			case "Recomputemyplan":
				get_Recomputemyplan().click();
				break;
			
			case "Proceedwithmyplan":
				get_Proceedwithmyplan().click();
				break;
			case "Price_1499WithDevice":
				get_Price_1499WithDevice().click();
				break;
			case "GplanAllData2499":
				get_GplanAllData2499().click();
				break;
			case "PDP_Alldata":
				get_PDP_Alldata().click();
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
	

}
