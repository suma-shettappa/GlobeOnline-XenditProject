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

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class renewal_landingpage extends BasePage {

	Assertion hardAssert = new Assertion();
	static File file;	
	By GCash=By.xpath("//button[text()=' GCash ']");	
	By GCash2499Plan=By.xpath("(//span[text()='2499'])[2]");
	By GPlan1499=By.xpath("(//span[text()='1499'])[2]");
	By GPlan599=By.xpath("(//span[text()='599'])[1]");
	By GPlan2499=By.xpath("(//span[text()='2499'])[1]");	
	By link_XtremeHomePrepaidWiFi = By.xpath("//a[text() = 'Xtreme Home Prepaid WiFi']");	
	By link_MobilePostpaid = By.xpath("//a[text() = 'Mobile Postpaid']");	
	By postpaidDevices = By.xpath("//h1[text() = ' Postpaid Devices ']");
	By filters = By.xpath("(//span[@class='go_filter-icon-open'])[1]");	
	By RenewtoGPlanPlus = By.xpath("(//button[contains(text(),' Renew to GPlan Plus ')])[1]");	
	By orderID = By.xpath("//div[text()=' Reference number ']/../div[2]/div[1] | //span[text()='Reference number']/../../div[2]/span");
	By footer = By.xpath("//div[@class='desktop-view']//nav[@class='globe-footer-nav']");
	By footerPrivacyPolicy = By.xpath("//a[text()='Privacy Policy']");
	By footerTermsOfUse = By.xpath("//a[text()='Terms of Use']");
	By footerSiteMap = By.xpath("//a[text()='Site Map']");	
	///three clicks updates
	By entermobileno=By.xpath("//label[text()='Enter your mobile number']");
	By Device_strtr_btn = By.xpath("//div[contains(text(),' Device ')]");	
	By search_field = By.xpath("//input[@placeholder='Search by brand, model, feature, plan value']");
	By magnifybutton = By.xpath("//div[@class='go_card-zoom']");	
	By planValue = By.xpath("(//span[@class='go_filter-dropdown-icon'])[3]");
	By AlwayOnPlanPage=By.xpath("//h1[contains(text(),' Always On ')]");
	By cookiesNotification = By.xpath("//span[contains(text(),'Your privacy is important to us')]");
	By privacyAccept = By.xpath("//button[text()=' I accept']");
	By link_LogoGlobe = By.xpath("//a/img[@alt = 'Globe Logo']");
	By acquiCarousel01 = By.xpath("(//div[@class='plan-styles-image']//img[@alt=' GPlan Plus x Dr. Strange Merch'])[1]");
	By Disc_starterbtn = By.xpath("//button[contains(text(),' Discover Starter ')]");
	By link_Apply = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Apply']");
    By link_Renew = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Renew']");
	By link_Switch = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Switch']");
	By link_MenuBuy = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Buy']");
	By CartIcon = By.xpath("//a/img[contains(@src,'cart-icon')]");
	By internet=By.xpath("//a[text()='Internet']");
	By deals=By.xpath("//a[text()='Deals']");
	By reload=By.xpath("//a[text()='Reload']");
	By registersim=By.xpath(" //a[text()='Register SIM']");
	
	
	// GlobeOnline Phase 2 Menubar Validation
		By EasyPaymentTetx = By.xpath("//nav[contains(@class,'header')] //a[text()='Easy payments via GCash GGives']");
		By CancelIcon = By.xpath("//img[@alt = 'exit']");
		By GlobeLogo = By.xpath("//img[@alt = 'Globe logo']");
		By Link_Mobile = By.xpath("(//a[text()='Mobile'])[2]");
		//Hover on Mobile  Validations
		By Link_Postpaid = By.xpath("//a[text()='Postpaid']");
		By Link_NewOnline = By.xpath("//a[text()='New Line']");
		By Link_SimOnly = By.xpath("//a[text()='SIM-only Plan'] | //a[text()='SIM-Only Plan']");
		By Link_PlanWithDevice = By.xpath("//a[text()='Plan with Device']");
		By Link_Renewal = By.xpath("//a[text()='Renewal']"); 
		By Link_DeviceGallery = By.xpath("//a[text()='Device Gallery']"); 
		By Link_ViewPlans = By.xpath("//a[text()='View Plans']"); 
		
		By Link_Brands = By.xpath("//a[text()='Brands']");
		By Link_Apple = By.xpath("//a[text()='Apple']");
		By Link_Samsung = By.xpath("//a[text()='Samsung']");
		By Link_Services = By.xpath("//a[text()='Services']");
		By Link_Gadget = By.xpath("//a[text()='Gadget Xchange']");
		//Hover on HomeInternet 
		By Link_HomeInternet = By.xpath("//nav[contains(@class,'header')] //a[text()='Home Internet']");
		//Hover on HomeInternet  Validations
		By Link_HIpostpaid = By.xpath("//a[text()='Postpaid']");
		By Link_ApplyGfiberPlan = By.xpath("//a[text()='Apply for a GFiber Plan']");
		By Link_UpgradeInternetPlan = By.xpath("//a[text()='Upgrade my internet'] | //a[text()='Upgrade my Internet']");
		By Link_Prepaid = By.xpath("//a[text()='Prepaid']");
		By GFiber_Prepaid = By.xpath("//a[text()='GFiber Prepaid']");
		By Link_PrepaidWifi = By.xpath("//a[text()='Prepaid WiFi'] | //a[text()='Prepaid Wifi']");
		By Link_PrepaidWifiSIM = By.xpath("//a[text()='Home Prepaid WiFi SIM']");
		//Hover on Deals 
		By Link_Deals = By.xpath("//nav[contains(@class,'header')] //a[text()='Deals']");
		//Hover on Deals  Validations
		By Link_GPlanPLUS_Discounted_Devices = By.xpath("//a[text()='GPlan PLUS x Discounted Devices']");
		By Link_Globe_Prepaid_Exclusives = By.xpath("//a[text()='Globe Prepaid Exclusives'] | //a[text()='Globe Prepaid Exclusives'] ");
		//Hover on Deals 
		By Link_QuickLinks=By.xpath("//nav[contains(@class,'header')] //a[text()='Quick Links']");
		//Hover on Deals  validations
		By Link_BUYLoad= By.xpath("//a[text()='Buy Load']");
		By Link_Register_your_SIM = By.xpath("//a[text()='Register your SIM']");
		By Link_SwitchtoGlobe = By.xpath(" //a[text()='Switch to Globe']");
		By Link_HelpSupport = By.xpath("//a[text()='Help & Support']");	
		By Link_TrackMyorder = By.xpath("//nav[contains(@class,'header')] //a[text()='Track my order']");
	
	
	By link_TrackMyOrder = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()=' Track my order ']");
	By link_Help = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()=' Help ']");
	By link_MobilePostPaid = By.xpath("//a[text() = 'Mobile Postpaid']");
	By link_ViewAllDevices = By.xpath("//a[text() = 'View all devices']");
	By postpaidPlansAndSmartphones= By.xpath("//h1[contains(text(),'Renewal') or contains(text(),'Renew my plan')]");
	By pickingTheRightPlanBanner= By.xpath("//h2[contains(text(),'Picking the right plan isnâ€™t rocket science.')]");
	By customSlider = By.xpath("//div[@class='desktop-selector ng-star-inserted']");
	By HowOftenDoYou = By.xpath("//div[text() = 'How often do you watch live selling videos like LazLive or Shopee Live?']");
	By rarely = By.xpath("//span[text()='Rarely']");
	By occasionally = By.xpath("//span[text()='Occasionally']");
	By sometimes = By.xpath("//span[text()='Sometimes']");
	By always = By.xpath("//span[text()='Always']");
	By tellMeabout = By.xpath("(//button[text()=' Tell me more about this plan '])[1]");
	By introductionBlock = By.xpath("//div[@class='introduction-block']");
	By planStylesForAll = By.xpath("//span[text() = 'Plan styles for all lifestyles']");
	By shopping = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[1]");
	By social = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[2]");
	By videos= By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[3]");
	By music = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[4]");
	By work = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[5]");
	By games = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[6]");
	By GPlanPlusSimOnly999=By.xpath("(//span[text()='999'])[2]");
	By ProceedwithMyPlan=By.xpath("//button[text()='Proceed with my plan']");
	By NODoc=By.xpath("//p[contains(text(),' No need to upload documents. ')]");
	By gplanWithDevice = By.xpath("//option[text()=' GPlan with Device ']");
	By gplanWithGCash = By.xpath("//option[text()=' GPlan with GCash ']");
	By gplanPlusSIMOnly = By.xpath("//option[text()=' GPlan SIM-Only ' or @value='SIM-Only']");
	By GPlanDevice1499 = By.xpath("(//span[text()='GPlan with Device']//following::div//span[text()='1499'])[2]");
	By Discover_starter=By.xpath("//button[text()=' Discover Starter ']");
	By getStarted999=By.xpath("(//div[text()='GPlan Plus SIM-Only 999']//following::button[text()=' Get Started '])[1]");
	//option[text()=' GPlan Plus ']");
	By gplanSIMOnlyAllData = By.xpath("//option[text()=' GPlan SIM-Only All Data ']");
	By Agree=By.xpath("//button[text()='Agree']");
	By Select=By.xpath("//button[text()='Select']");
	By MobilePostPaid=By.xpath(" //a[text()='Mobile Postpaid']");
	By previousicon = By.xpath("(//div[@class='owl-prev'])[2]");
	By Nexticon = By.xpath("(//div[@class='owl-next'])[2]");
	By ViewAllDevices=By.xpath("//a[text()='View all devices']");
	By PlanValueDP=By.xpath("//span[text()='Plan Value']//following::span[1]");
	By Radio_btn1499=By.xpath("//h2[text()='1499']");
	By ApplyFilter=By.xpath("//button[text()=' Apply Filter ']");
	By starter = By.xpath("//div[text()='Starter']");
	By Platinum_7999=By.xpath("//div[text()='Platinum']//following::div[contains(text(),'7999')]");
	By Platinum_4999=By.xpath("//div[text()='Platinum']//following::div[contains(text(),'4999')]");
	By lite = By.xpath("//div[text()='Lite']");
	By basic = By.xpath("//div[text()='Basic']");
	By owlnext = By.xpath("(//div[@class='owl-next'])[2]");
	By NextBtn=By.xpath("//button[text()=' Next ']");
	By CloseIcon=By.xpath("//img[contains(@src,'cross1.svg')]");
	By value = By.xpath("//div[text()='Value']");
	By essential = By.xpath("//div[text()='Essential']");
	By plus = By.xpath("//div[text()='Plus']");
	By extra = By.xpath("//div[text()='Extra']");
	By alwaysOn = By.xpath("//div[text()='Always On']");
	By faqText1 = By.xpath("(//div[@class='item-text'])[1]");
	By faqText2 = By.xpath("(//div[@class='item-text'])[2]");
	By faqText3 = By.xpath("(//div[@class='item-text'])[3]");
	By faqText4 = By.xpath("(//div[@class='item-text'])[4]");
	By faqText5 = By.xpath("(//div[@class='item-text'])[5]");
	By faqText6 = By.xpath("(//div[@class='item-text'])[6]");
	By faqText7 = By.xpath("(//div[@class='item-text'])[7]");
	By faqText8 = By.xpath("(//div[@class='item-text'])[8]");
	//By faqText8 = By.xpath("(//div[@class='item-text'])[8]");
	By faqText9 = By.xpath("(//div[@class='item-text'])[9]");
	By faqText10 = By.xpath("(//div[@class='item-text'])[10]");
	By faqText11 = By.xpath("(//div[@class='item-text'])[11]");
	By faqText12 = By.xpath("(//div[@class='item-text'])[12]");
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
	By acccordionButton7 = By.xpath("(//button[@id='faqExpandCollapse'])[7]");
	By acccordionButton8 = By.xpath("(//button[@id='faqExpandCollapse'])[8]");
	By acccordionButton9 = By.xpath("(//button[@id='faqExpandCollapse'])[9]");
	By acccordionButton10 = By.xpath("(//button[@id='faqExpandCollapse'])[10]");
	By acccordionButton11= By.xpath("(//button[@id='faqExpandCollapse'])[11]");
	By acccordionButton12= By.xpath("(//button[@id='faqExpandCollapse'])[12]");
	By link_CheckYourEligibility = By.xpath("//div[text() = ' Check your eligibility to renew ']");
	By DataAddon=By.xpath("//span[text()='Do you use lots of data?']");
	By JetSettingLifeStyle=By.xpath("//span[text()='Are you all about the jet-setting lifestyle?']");
	By MessageAddon=By.xpath("//span[text()='Prefer talking over messaging?']");
	By MovieAddon=By.xpath("//span[text()='Do you love watching shows and movies?']");
	By Mobilenumberformat= By.xpath("//div[contains(@class,'go_text-preamble')] //small[text()='Please enter your number below. Follow this format 09â€¢â€¢â€¢â€¢â€¢â€¢â€¢â€¢â€¢']");
	By EligibilityPanel=By.xpath("(//div[@class='go_tooltip go_text-tooltip' and contains(text(),'By submitting your number')])[3]");
	By Discover_Essential=By.xpath("//button[text()=' Discover Essential ']");
	By MappedDevices=By.xpath("(//div[@class='owl-stage-outer ng-star-inserted'])[1]");
	By EssentialBanner1=By.xpath("//h2[text()='WELCOME TO YOUR DIGITAL LIFESTYLE']");
	By DeviceName=By.xpath("(//div[@class='phone-content-title'])[1]");
	By Select_Customize=By.xpath("(//button[text()='Select & customize'])[1]");
	By PlanBuilderPage=By.xpath("//h1[text()=' Plan Builder - Device ']");
	By DefaultDeviceSelected=By.xpath("//button[text()=' Device ' and @class='nav-link active']");
	By DefaultSelectedPlan=By.xpath("(//div[@class='d-flex flex-column plan-card blue-plan-card'])[2]");
	By DefaultSelectedDevice=By.xpath("(//div[contains(@class,'plan-builder-phone-list active ')])[1]");	//
	By GreatLifeStartsHere=By.xpath("//h2[text()='A GREAT LIFE STARTS HERE']");
	By StarterImg=By.xpath("(//img[contains(@src,'starter')])[1]");
	By EntertainmentForDays=By.xpath("//span[text()='Entertainment for days']");
	By NeverMissABeat=By.xpath("//strong[text()='Stream your favorite music']");
	By CreateBetterConnections=By.xpath("//h2[text()='Create better connections']");
	By NextArrowIcon=By.xpath("//div[@class='owl-next']");
	By AmazonPrime=By.xpath("//div[text()=' Amazon Prime Video ']");
	By TotalSubscAddons=By.xpath(" Total subscriptions and add-ons ");
	By RenewingFor=By.xpath("//div[text()=' Renewing for ']");
	By MonthlyBill=By.xpath("//div[text()=' Monthly bill, subscriptions, and add-ons ']");
	By SelectPlan=By.xpath("//button[text()=' Select plan ']");
	By MonthlyPayment=By.xpath("//div[text()=' Monthly payment ']");
	By ViuPremium=By.xpath("//div[text()=' Viu Premium ']");
	By SpotifyPremium=By.xpath("//div[text()=' Spotify Premium ']");
	By SeeMyNewPlan=By.xpath("//span[text()=' See my new plan ']");
	By WelcomeBack=By.xpath("//div[text()='Welcome back to Globe!']");
	By GlobeRecomPlan=By.xpath("//button[contains(text(),' recommended plan')]");
	By banner2checkout=By.xpath("//span[text()='Check out our newest plans']");
	By banner2simonly3799=By.xpath("//span[text()='GPlan PLUS 3799']");
	By banner2unlimit=By.xpath("//span[text()='With GPlan PLUS 1799 to 2499, get 12 months of Disney+ Mobile access on us']");
	By banner2planstart=By.xpath("(//span[text()='Plan starts at'])[1]");
	By banner2planstartvalue=By.xpath("(//div[@class='go_sc-same-plan-carousel__rate-box'])//span[2]");
	By banner2showplan=By.xpath("(//button[text()=' Show plan details '])[1]");
	By banner2simonly2499=By.xpath("//span[text()='GPlan PLUS 2499']");
	By banner2moredata=By.xpath("(//span[text()='The best from Globe just got even better.'])[1]");
	By banner2planstartat=By.xpath("(//span[text()='Plan starts at'])[2]");
	By banner2planstartvalue2=By.xpath("(//div[@class='go_sc-same-plan-carousel__rate-box'])[2]//span[2]");
	By banner2showplan2=By.xpath("(//button[text()=' Show plan details '])[2]");
	By looking=By.xpath("(//span[text()='Looking for devices?'])");
	By Prevsicon=By.xpath("//div[@class=\"owl-prev\"][1]");
	By Nexticons=By.xpath("//div[@class=\"owl-next\"][1]");
	By GPlan1499withDevice=By.xpath("(//div[text()=' GPlan 1499 with Device '])[1]");
	By prev=By.xpath("(//span[normalize-space(text())='Looking for devices?']//following::div[@class='owl-next'])[1]");
	By next=By.xpath("(//span[normalize-space(text())='Looking for devices?']//following::div[@class='owl-prev'])[1]");
	By enjoy=By.xpath("//h2[text()=' Enjoy a #LifeMadeGreater ']");
	By selectGplansimonly999=By.xpath("//li[text()=' Sim-Only ']");
	By WithDevice=By.xpath("//li[text()=' Device ']");
	By gcash=By.xpath("//li[text()=' GCash ']");
	By alldata=By.xpath("//li[text()=' All-Data ']");
	By DeviceOption=By.xpath("//li[text()=' Device ']");
	By GCashOption=By.xpath("//li[text()=' GCash ']");
	By GPlanNameCard=By.xpath("(//div[contains(text(),' GPlan SIM-Only')]//following::div[contains(text(),'Unli data per month')])[1]");
	By GPlanNameCardAmount=By.xpath("(//div[contains(text(),' GPlan SIM-Only')]//following-sibling::div[contains(text(),'â‚± ')])[1]");
	By AllDataOption=By.xpath("//li[text()=' All-Data ']");
	By Gplan599withGash=By.xpath("//div[text()=' GPlan 599 with GCash ']");
	By GplanPrice=By.xpath("//div[text()='₱ 599.00']");
	By Getthisplan=By.xpath("(//button[text()='Get this plan'])[6]");
	By GetthisplanWithGcash599=By.xpath("(//button[text()='Get this plan'])[4]");
	By alldata1999=By.xpath("//div[text()=' GPlan SIM-Only All Data 1999 ']");
	//	3 clicks simonly
	By Gplan999simonly=By.xpath("(//div[text()=' GPlan SIM-Only 999 '])[2]");
	By GplanPriceSimonly999=By.xpath("//div[text()='₱ 999.00']");
	By GetthisplanSimonly999=By.xpath("(//button[text()='Get this plan'])[13]");
	By previousiconsimonly = By.xpath("(//div[@class='owl-prev'])[3]");			
	By Gplan14999Price=By.xpath("(//div[text()='₱ 1499.00'])[1]");
	By GetthisplanGplan14999Price=By.xpath("(//button[text()='Get this plan'])[11]");
	By DeviceGalleryPage=By.xpath("//h1[text()=' Device Gallery ']");
	By PlanValue=By.xpath("//span[text()='Plan Value']");
	public By RenewWithThisDevice=By.xpath("//button[text()=' Renew with this device ']");
	By GetCode=By.xpath("//button[text()=' Get code ']");
	By RenewWithDevice=By.xpath("(//a[text()=' Renew with this device '])[1]");
	By SubmitBtn=By.xpath("//button[text()=' Submit ']");
	By EasyRoam=By.xpath("//div[text()=' Easy Roam ']");
	By MyDuo=By.xpath("//div[text()=' MyDuo ']");
	By PickYourAddons=By.xpath("//div[text()=' Pick your add-ons (as many as you want!) ']");
	By GSSurfAdd99=By.xpath("//div[text()=' GS Add Surf 99 ']");
	By ZoomIcon=By.xpath("((//a[text()=' Renew with this device '])[1]//preceding::div[@class='go_card-zoom'])[2]");
	By ProductDetails=By.xpath("//li[text()='Product Details']");
	By SelectedGplanWithDevice=By.xpath("//div[contains(@class,'selectedPlan ng-star-inserted')]//span[text()='GPlan with Device']");
	By Color=By.xpath("//span[text()='Color/Finish']");
	By Capacity=By.xpath("//span[text()='Capacity']");
	By Features=By.xpath("//a[text()='Features']");
	By Specifications=By.xpath("//p[text()='Specifications']");
	By ContractDuration=By.xpath("//span[text()='Contract duration']");
	By CashoutAmount=By.xpath("//span[text()='Cashout Amount']");
	By CashamountValue=By.xpath("//span[text()='Cashout Amount']//following::span[contains(text(),' â‚±')]");
	By AvailableForDelivery=By.xpath("//span[text()=' Available for delivery']");
	By RenewYourPlanProduct=By.xpath("//div[@class='link']//h1[@class='homePrepaid-text']");
	By LookingForMorePlans=By.xpath("//span[@class='go_sc-device-carousel__title']");
	By PlanTypes=By.xpath("//div[@class='go_tab-menu-panel']//ul[@class='go_tabs']");
	By HighlightedSimOnly=By.xpath("//div[@class='go_tab-menu-panel']//li[contains(@class,'go_active ng-star-inserted') and text()=' SIM-Only ']");
	By CTA_btn=By.xpath("//div[text()=' Check your eligibility to renew ']");
	By RenewWithCurrentPlan=By.xpath("//button[text()=' Renew with my current plan ']");
	public By Social_fourhrs = By.xpath("(//div[@class='ngx-slider-inner-tooltip ng-star-inserted'])[5]");
	By Timespent = By.xpath("(//div[@class='time-spent'])[1]");
	By Dataneeds = By.xpath("(//div[contains(text(),'DATA NEEDS')])[1]");
	By TimeSpentValue = By.xpath("(//div[@class='d-flex flex-row']//div[@class='data-qty'])[1]");
	By DataNeedsValue = By.xpath("(//div[@class='d-flex flex-row']//div[@class='data-qty'])[2]");
	By ZoomOption=By.xpath("(//div[contains(@class,'plan-builder-phone-list active ')])[1]//img[contains(@src,'zoom-icon.svg')]");
	By FeaturesTab=By.xpath("//span[text()='Samsung Galaxy A32 5G']//following::button[text()=' Features ']");
	By PromoTab=By.xpath("//span[text()='Samsung Galaxy A32 5G']//following::button[text()=' Promos ']");
	By FeatureContent=By.xpath("//div[@class='momentum-body']");
	//Discover Extra
	By DiscoverExtra = By.xpath("//button[contains(text(),' Discover Extra ')]");
	By EXTRAORDINARY = By.xpath("//h2[contains(text(),'EXTRAORDINARY')]");
	By Device = By.xpath("//li[text()=' Device ']");
	By Gcash = By.xpath("//div[contains(text(),' GCash ')]");
	By Simonly = By.xpath("//div[contains(text(),' SIM Only ')]");
	By Alldata = By.xpath("//div[contains(text(),' All-Data ')]");
	By Banner1 = By.xpath("//h2[contains(text(),'An extraordinary plan')]");
	By Banner2 = By.xpath("//h2[contains(text(),'Be extraordinary')]");
	By Banner3 = By.xpath("//span[contains(text(),'All the entertainment, with data to spare')]");
	By Banner4 = By.xpath("//h2[contains(text(),'Work better')]");
	By Banner5 = By.xpath("//h2[contains(text(),'Add to cart to your heartâ€™s content')]");
	By Banner6 = By.xpath("//span[contains(text(),'When it comes to games, weâ€™re not playing around')]");
	By Banner7 = By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
	By Banner8 = By.xpath("//h2[contains(text(),'Do you need more data?')]");
	By Buildmyplan = By.xpath("//div[contains(text(),' Build my plan ')]");
	By GplanAlldata = By.xpath("//button[contains(text(),' All-Data ')]");
	/********************************************************************************************************************************/

	//SC2
	By shoping_onrhr=By.xpath("(//div[@class='ngx-slider-inner-tooltip ng-star-inserted'])[2]");
	By shopingfaq=By.xpath("//div[contains(text(),'How long do you browse the web and shop online using your mobile data?')]");
	By socailfaq=By.xpath("//div[contains(text(),'How much time do you spend on social media using your mobile data?')]");
	By Vediosfaq=By.xpath("//div[contains(text(),'How long do you usually watch videos on your mobile data?')]");
	By musicfaq=By.xpath("//div[contains(text(),'How long do you stream music on your mobile data?')]");
	By workfaq=By.xpath("//div[contains(text(),'How long do you use web conferencing apps on your mobile data?')]");
	By gamesfaq=By.xpath("//div[contains(text(),'How much time do you spend on online games on your mobile data?')]");
	By timespend=By.xpath("//div[contains(text(),'TIME SPENT')]");	
	By timespendvalue=By.xpath("(//div[@class='d-flex flex-row'])[3]");
	By dataneeds=By.xpath("//div[contains(text(),'DATA NEEDS')]");
	By dataneedsvales=By.xpath("(//div[@class='d-flex flex-row'])[4]");	//sc4
	By shoping_threehr=By.xpath("(//div[@class='ngx-slider-inner-tooltip ng-star-inserted'])[4]");
	By shopingzero=By.xpath("(//div[@class='ngx-slider-inner-tooltip ng-star-inserted'])[1]");
	By tellmemore=By.xpath("(//button[contains(text(),'Tell me more about this plan')] )[1]");	//sc3
	public By shoping_twohr=By.xpath("(//div[@class='ngx-slider-inner-tooltip ng-star-inserted'])[3]");
	//dis sc2:
	By FAQ1shoprearelly=By.xpath("//div[contains(text(),'How often do you watch live selling videos like LazLive or Shopee Live?')]");
	By FAQ2socailrearelly=By.xpath("(//div[contains(text(),'How often do you watch videos on social media?')])[1]");
	By FAQ3vediosrearelly=By.xpath("(//div[contains(text(),'How often do you watch HD movies & shows?')])[1]");
	By FAQ4musicrearelly=By.xpath("(//div[contains(text(),'How often do you listen to music with videos?')])[1]");
	By FAQ5workrearelly=By.xpath("(//div[contains(text(),'How often are you on a video call or conference?')])[1]");
	By FAQ6gamesrearelly=By.xpath("(//div[contains(text(),'How often do you update or download files from your mobile games?')])[1]");
	By deviceGalleryText = By.xpath("//h1[text()=' Plan Renewal Devices ']");
	By BackToTop_Button = By.xpath("//div[@class='back-to-top-btn']");
	By Colour_Variant = By.xpath("(//span[text()='Black']//parent::label//input)[1]");
	By auto_search = By.xpath("//b[text()='samsung']");
	By searched_Device = By.xpath("//h2[text()='Samsung Galaxy M12']");
	By X_Button = By.xpath("//i[text()='close']");
	By notAvailable_Msg = By.xpath("//div[text()='Sorry, the device you are looking for is not available at this time.']");
	By FifteenDevicesPerPage = By.xpath("//div[@class='go_device-image-wrapper']");
	By outOfStockText = By.xpath("//span[text()='Out of Stock'] | //span[text()=' Out of stock ']");
	By aboutUs = By.xpath("//a[text()='About Us']");
	By relevantItem = By.xpath("(//h2[contains(text(), ' 14')])[1]");
	By sortDropDown = By.xpath("//div[@class='go_sort-by-dropdown-wrapper']");
	By priceHightoLow = By.xpath("//option[text()=' Price: High to Low ']");
	By featuredProducts = By.xpath("//option[text()=' Featured Products ']");
	By priceLowtoHigh = By.xpath("//option[text()=' Price: Low to High ']");
	By collapse_Filter = By.xpath("//span[@class='go_hide-btn']");
	By productType = By.xpath("(//span[@class='go_filter-dropdown-icon'])[2]");
	By brand = By.xpath("(//span[@class='go_filter-dropdown-icon'])[1]");
	By clear_filters_Disabled = By.xpath("//span[@class='go_text-base-action go_clear-btn clear-filters-disable']");
	By clear_filters = By.xpath("//span[text()='Clear filters']");
	By PlanValue999_radioButton = By.xpath("(//h2[text()='999']//following::input[@type='radio'])[1]");
	By huaweibrand_radioButton = By.xpath("(//h2[text()='Huawei']//following::input[@type='checkbox'])[1]");
	By applebrand_radioButton = By.xpath("(//h2[text()='Apple']//following::input[@type='checkbox'])[1]");
	By applyFilter_Button = By.xpath("//button[text()=' Apply Filter ']");
	By planWithDevice = By.xpath("//h2[contains(text(), 'Huawei nova')]");
	By ebike_radioButton = By.xpath("(//h2[text()='e-Bike']//following::input[@type='checkbox'])[1]");
	By electricStudio_radioButton = By.xpath("//h2[text()='Electric Studio']//following-sibling::input");
	By electricstudio_Device = By.xpath("(//h2[contains(text(), 'Electric Studio ')])[1]");
	By magnifying_glass = By.xpath("//div[@class='go_card-zoom']");
	By samsung_device = By.xpath("//h2[text()='Samsung Galaxy S21 Ultra 5G']");
	By colourOr_Finish = By.xpath("//span[text()='Color/Finish']");
	By capacity = By.xpath("//span[text()='Capacity']");
	By contract_duration = By.xpath("//span[text()='Contract duration']");
	By cashout_amount = By.xpath("//span[text()='Cashout Amount']");
	By renewWithThisDevice = By.xpath("//a[text()='Renew with this device']");
	By InStock_Text = By.xpath("//span[text()=' In Stock']");
	By selectAnotherDevice = By.xpath("//span[text()='Select another device']");
	By Color_Var = By.xpath("(//input[@class='go_color-radio'])[2]");
	By Smart_Phone = By.xpath("//h2[text()='Smartphone']//following-sibling::input");//h2[text()='Mobile Phone']//following-sibling::input
	By watch = By.xpath("//h2[text()='watch']//following-sibling::input");
	By Brand_Oppo = By.xpath("//h2[text()='Oppo']//following-sibling::input");
	By Feature_Products = By.xpath("(//span[@class='go_filter-dropdown-icon'])[4]");
	By New_Radio = By.xpath("//h2[text()='New']//following-sibling::input");
	By BestSeller_Radio = By.xpath("//h2[text()='Bestseller']//following-sibling::input");
	By Vocher_Radio = By.xpath("//h2[text()='Voucher']//following-sibling::input");
	By newTagged_Devices = By.xpath("//span[text()='New']");
	By bestSellerTagged_Devices = By.xpath("//span[text()='Bestseller']");
	By Tab_Devices = By.xpath("(//h2[contains(text(), 'iPad ')])[1]");
	By Nokia_Devices = By.xpath("//h2[contains(text(), 'Nokia ')]");
	By Nokia_Radio = By.xpath("//h2[text()='Nokia']//following-sibling::input");
	By GplanWithDevice999Text = By.xpath("//div[contains(text(), 'GPlan 999 with Device')]");
	By Plan2499 = By.xpath("(//h2[text()='2499']//following::input[@type='radio'])[1]");	
	By Checkbutton = By.xpath("//input[@class='go_primary-button mnp-check-eligibility']");	
	By RenewalProcessing = By.xpath("//h1[text()=' Plan Renewal - Processing ']");
	By BestsellerTag = By.xpath("//span[text()=' Bestseller ']");
	By appleWatchDevices = By.xpath("//h2[contains(text(), 'Apple Watch')]");		
	By colours = By.xpath("//input[@class='go_color-radio']");
	By ForReservation = By.xpath("(//span[text()=' For reservation '])[1]");
	By cashoutAmountinGalleryPage = By.xpath("//span[text()='Cashout']//following-sibling::div//span");
	By Tablet = By.xpath("//h2[text()='Tablet']//following-sibling::input");
	By search_field_CSTM = By.xpath("//input[@placeholder='What device you are looking for?']");	
	By PlanValue_radioButton = By.xpath("(//h2[text()='999']//following::input[@type='radio'])[1]");
	By brand_radioButton = By.xpath("(//h2[text()='Huawei']//following::input[@type='checkbox'])[1]");
	By clours=By.xpath("//input[@class='go_color-radio']");
	By preorderavilable=By.xpath("//span[text()=' Available for Pre-order']");
    By ournewestplan=By.xpath("//h2[contains(normalize-space(text()),'Our newest plans give you better bang for your buck.')]");
	By recomended=By.xpath("//span[contains(normalize-space(text()),'Recommended')]");
    By banner1continueplan=By.xpath("//button[contains(text(),' Renew with my current plan ')] ");
	By banner1checrecomendedkplan=By.xpath("//button[text()=' Check recommended plan ']");
	By prev2=By.xpath("//div[@class='owl-nav ng-star-inserted']//div[1]");
	By next2=By.xpath("//div[@class='owl-nav ng-star-inserted']//div[2]");	
	By alldata2499=By.xpath("//div[text()=' GPlan SIM-Only All Data 2499 ']");		
	By ForReservationButton = By.xpath("//a[text()=' Reserve this device ']");
	By clicklanding3=By.xpath("//div[text()='Welcome back to Globe!']");
	By banner1postpaidplan=By.xpath("//h1[contains(text(),' Get the postpaid plan made just for you.')] ");
	
	
	By simonly=By.xpath("(//li[text()=' Sim Only '] | //li[text()=' SIM-Only '])");
	By device=By.xpath("//li[text()=' Device ']");
	By Devicetext=By.xpath("(//div[text()='GPlan SIM-Only - Focus on the things that matter the most - making connections and building bonds. All plans come with unli all-net calls and texts.'])[1]");
	
	
	//landing 
	By   TokenInput     =  By.xpath("//input[@placeholder='Enter Token']");
	By   TokenSubmit   = By.xpath("//button[text()='Submit']");
	
	//(//div[text()=' GPlan SIM-Only All Data 599 '])[2]//following::button[1]
	
	
	By GB1499withdevice=By.xpath("(//span[contains(text(),'All-access data   10 GB,  GoWiFi access   3 GB')])[1]");
	By alldata1499=By.xpath("(//span[contains(text(),'All-access data')])[11]");
	By call1499=By.xpath("(//span[contains(text(),'Unli calls to mobile and landline')])[11]");
	By net1499=By.xpath("(//span[contains(text(),' Unli All-network ')])[8]");
	By inclu1499=By.xpath("(//span[contains(text(),'Free individual subscription to KonsultaMD')])[11]");
	By plan1299withdevice=By.xpath("(//div[text()=' GPlan 1299 with Device '])[1]");
	
	//MobileView
	
		By QuickLink_MobileView=By.xpath("//p[text()='Quick Links']");
		By QuickLinksDropdown_MobileView=By.xpath("//select[@class='quick-links'] | //img[@alt='down-arrow']");
		By QuickLinkDropdown_BuyLoad_MobileView=By.xpath("//option[text()='Buy Load'] | //button[text()=' Buy Load ']");
		By QuickLinkDropdown_RegisterYourSim_MobileView=By.xpath("//option[text()='Register your SIM'] | //button[text()=' Register your SIM ']");
		By QuickLinkDropdown_SwitchtoGlobe_MobileView=By.xpath("//option[text()='Switch to Globe']");
		By QuickLinkDropdown_HelpandSupport_MobileView=By.xpath("//option[text()='Help & Support'] | //button[text()=' Help & Support ']");
		By ExitMenu_MobileView=By.xpath("//img[contains(@src,'exit-mobile')]");

		
		By GlobeLogo_MobileView=By.xpath("//img[contains(@src,'globe-logo')]");
		By EasyPayments_MobileView=By.xpath("//a[text()='Easy payments via GCash GGives']");
		
		By MenuIcon_MobileView=By.xpath("//p[text()='Menu']");
		By MobileExpandOption_MobileView =By.xpath("//div[@class='content-label-text']//a[text()='Mobile']");
		By SimOnlyPlan_MobileView=By.xpath("//a[text()='SIM-Only Plan' or text()='SIM-only Plan']");
		By PlanWithDevice_MobileView=By.xpath("//a[text()='Plan with Device']");
		By RenewalLink_MobileView=By.xpath("//a[text()='Renewal']");
		By HomeInternet_MobileView=By.xpath("//div[@class='content-label-text']//a[text()='Home Internet']");
		By chkbx_acceptAll = By.xpath("//input[@formcontrolname='all']");
		By ApplyForaGFiberPlan_MobileView=By.xpath("//a[text()='Apply for a GFiber Plan']");
		By UpgradeMyInternet_MobileView=By.xpath("//a[text()='Upgrade my internet' or text()='Upgrade my Internet']");
		By GFiberPrepaid_MobileView=By.xpath("//a[text()='GFiber Prepaid']");
		By PrepaidWifi_MobileView=By.xpath("//a[text()='Prepaid Wifi']");
		By HomePrepaidWifiSim_MobileView=By.xpath("//a[text()='Home Prepaid WiFi SIM']");
		By Deals_MobileView=By.xpath("//div[@class='content-label-text']//a[text()='Deals']");
		By DiscountedDevices_MobileView=By.xpath("//a[text()='GPlan PLUS x Discounted Devices']");
		By GlobePrepaidExclusives_MobileView=By.xpath("//a[text()='Globe Prepaid Exclusives']");
		By QuickLinks_MobileView=By.xpath("//div[@class='content-label-text']//a[text()='Quick Links']");
		By BuyLoad_MobileView=By.xpath("//a[text()='Buy Load']");
		By RegisterYourSim_MobileView=By.xpath("//a[text()='Register your SIM']");
		By SwitchToGlobe_MobileView=By.xpath("//a[text()='Switch to Globe']");
		By HelpandSupport_MobileView=By.xpath("//a[text()='Help & Support']");
		
		
	
	//new UI
	By mobilepostpaid=By.xpath("//a[text()='Mobile Postpaid']");
	By newplan=By.xpath("//a[text()='Renew Plan']");
	By mobilepostpiaddevice=By.xpath("//a[text()='Mobile Postpaid Devices']");
	By renewdevice=By.xpath("//a[text()='Renewal Devices']");
	By AboutUs=  By.xpath("(//a[normalize-space(text())='About Us'])[2]");
	
	public WebElement get_GB1499withdevice()
	{
		return DriverManager.getDriver().findElement(GB1499withdevice);
				
	}
	public WebElement get_AboutUs()
	{
		return DriverManager.getDriver().findElement(AboutUs);
				
	}
	public WebElement get_newplan()
	{
		return DriverManager.getDriver().findElement(newplan);
	}
	
	public WebElement get_banner1checrecomendedkplan()
	{
		return DriverManager.getDriver().findElement(banner1checrecomendedkplan);
				
	}
	public WebElement get_WelcomeBack()
	{
		return DriverManager.getDriver().findElement(WelcomeBack);
	}
	public WebElement get_simonly()
	{
		return DriverManager.getDriver().findElement(simonly);
		
	}
	public WebElement get_device()
	{
		return DriverManager.getDriver().findElement(device);
		
	}
	
	
	public WebElement get_next()
	{
		return DriverManager.getDriver().findElement(next);
		
	}
	public WebElement get_prev()
	{
		return DriverManager.getDriver().findElement(prev);
		
	}
	
	public WebElement get_next2()
	{
		return DriverManager.getDriver().findElement(next2);
		
	}


	/************************************************************************/
	public WebElement get_tellmemore()
	{
		return DriverManager.getDriver().findElement(tellmemore);
	}
	public WebElement get_GPlanPlusSimOnly999()
	{
		return DriverManager.getDriver().findElement(GPlanPlusSimOnly999);
	}	
	/********************************************************************************************************************************/
	public WebElement get_Buildmyplan() {
		return DriverManager.getDriver().findElement(Buildmyplan);
	}
	/********************************************************************************************************************************/
	public WebElement get_capacity() {
		return DriverManager.getDriver().findElement(capacity);
	}
		
	/********************************************************************************************************************************/
	public WebElement get_GplanAlldata() {
		return DriverManager.getDriver().findElement(GplanAlldata);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Timespent() {
		return DriverManager.getDriver().findElement(Timespent);
	}
	/********************************************************************************************************************************/
	public WebElement get_Dataneeds() {
		return DriverManager.getDriver().findElement(Dataneeds);
	}
	/********************************************************************************************************************************/
	public WebElement get_TimeSpentValue() {
		return DriverManager.getDriver().findElement(TimeSpentValue);
	}
	/********************************************************************************************************************************/
	public WebElement get_DataNeedsValue() {
		return DriverManager.getDriver().findElement(DataNeedsValue);
	}
	/********************************************************************************************************************************/
	public WebElement get_getStarted999() {
		return DriverManager.getDriver().findElement(getStarted999);
	}
	/********************************************************************************************************************************/
	public WebElement get_GPlanDevice1499() {
		return DriverManager.getDriver().findElement(GPlanDevice1499);
	}
	/********************************************************************************************************************************/
	public WebElement get_GPlan1499withDevice() {
		return DriverManager.getDriver().findElement(GPlan1499withDevice);
	}	
	/********************************************************************************************************************************/
	public WebElement get_Discover_starter() {
		return DriverManager.getDriver().findElement(Discover_starter);
	}
	/********************************************************************************************************************************/
	public WebElement get_ApplyFilter() {

		return DriverManager.getDriver().findElement(ApplyFilter);
	}
	/********************************************************************************************************************************/
	public WebElement get_GSSurfAdd99() {

		return DriverManager.getDriver().findElement(GSSurfAdd99);
	}
	/********************************************************************************************************************************/
	public WebElement get_MyDuo() {

		return DriverManager.getDriver().findElement(MyDuo);
	}
	/********************************************************************************************************************************/
	public WebElement get_EasyRoam() {

		return DriverManager.getDriver().findElement(EasyRoam);
	}
	/********************************************************************************************************************************/
	public WebElement get_SeeMyNewPlan() {

		return DriverManager.getDriver().findElement(SeeMyNewPlan);
	}
	/********************************************************************************************************************************/
	public WebElement get_SelectPlan() {

		return DriverManager.getDriver().findElement(SelectPlan);
	}
	/********************************************************************************************************************************/
	public WebElement get_AmazonPrime() {

		return DriverManager.getDriver().findElement(AmazonPrime);
	}
	/********************************************************************************************************************************/
	public WebElement get_ViuPremium() {

		return DriverManager.getDriver().findElement(ViuPremium);
	}
	/********************************************************************************************************************************/
	public WebElement get_SpotifyPremium() {

		return DriverManager.getDriver().findElement(SpotifyPremium);
	}
	/********************************************************************************************************************************/
	public WebElement get_MobilePostPaid() {

		return DriverManager.getDriver().findElement(MobilePostPaid);
	}
	/********************************************************************************************************************************/
	public WebElement get_Select() {
		return DriverManager.getDriver().findElement(Select);
	}
	/********************************************************************************************************************************/
	public WebElement get_StarterImg() {
		return DriverManager.getDriver().findElement(StarterImg);
	}
	/********************************************************************************************************************************/
	public WebElement get_NextBtn() {
		return DriverManager.getDriver().findElement(NextBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_CloseIcon() {
		return DriverManager.getDriver().findElement(CloseIcon);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProceedwithMyPlan() {
		return DriverManager.getDriver().findElement(ProceedwithMyPlan);
	}	
	/********************************************************************************************************************************/
	public WebElement get_previousiconsimonly() {
		return DriverManager.getDriver().findElement(previousiconsimonly);
	}	
	/********************************************************************************************************************************/
	public WebElement get_gcash() {
		return DriverManager.getDriver().findElement(gcash);
	}	
	/********************************************************************************************************************************/
	public WebElement get_Gplan599withGash() {
		return DriverManager.getDriver().findElement(Gplan599withGash);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_GplanPriceSimonly999() {
		return DriverManager.getDriver().findElement(GplanPriceSimonly999);
	}		
	/********************************************************************************************************************************/
	public WebElement get_GetthisplanWithGcash599() {
		return DriverManager.getDriver().findElement(GetthisplanWithGcash599);
	}
	/********************************************************************************************************************************/

	public WebElement get_Gplan999simonly() {
		return DriverManager.getDriver().findElement(Gplan999simonly);
	}
	/********************************************************************************************************************************/
	public WebElement get_selectGplansimonly999() {
		return DriverManager.getDriver().findElement(selectGplansimonly999);
	}
	/********************************************************************************************************************************/
	public WebElement get_GetthisplanSimonly999() {
		return DriverManager.getDriver().findElement(GetthisplanSimonly999);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Gplan14999Price() {
		return DriverManager.getDriver().findElement(Gplan14999Price);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_GetthisplanGplan14999Price() {
		return DriverManager.getDriver().findElement(GetthisplanGplan14999Price);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_MobilePostPaid() {
		return DriverManager.getDriver().findElement(link_MobilePostPaid);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Colour_Variant() {
		return DriverManager.getDriver().findElement(Colour_Variant);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_searched_Device() {
		return DriverManager.getDriver().findElement(search_field);
	}	
	/********************************************************************************************************************************/
	public WebElement get_X_Button() {
		return DriverManager.getDriver().findElement(X_Button);
	}	
	/********************************************************************************************************************************/
	
	public WebElement get_notAvailable_Msg() {
		return DriverManager.getDriver().findElement(notAvailable_Msg);
	}	
	/********************************************************************************************************************************/
	
	public WebElement get_aboutUs() {
		return DriverManager.getDriver().findElement(aboutUs);
	}	
	/********************************************************************************************************************************/
	
	public WebElement get_relevantItem() {
		return DriverManager.getDriver().findElement(relevantItem);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_sortDropDown() {
		return DriverManager.getDriver().findElement(sortDropDown);
	}
	
	public WebElement get_TokenSubmit() {
		return DriverManager.getDriver().findElement(TokenSubmit);
	}
	
	public WebElement get_TokenInput() {
		return DriverManager.getDriver().findElement(TokenInput);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_priceHightoLow() {
		return DriverManager.getDriver().findElement(priceHightoLow);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_priceLowtoHigh() {
		return DriverManager.getDriver().findElement(priceLowtoHigh);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_featuredProducts() {
		return DriverManager.getDriver().findElement(featuredProducts);
	}
	
	public WebElement get_clear_filters_Disabled() {
		return DriverManager.getDriver().findElement(clear_filters_Disabled);
	}	
	public int get_newTagged_Devices() {

		int size= DriverManager.getDriver().findElements(newTagged_Devices).size();
		return size;
	}
/********************************************************************************************************************************/
	
	public int get_bestSellerTagged_Devices() {

		int size= DriverManager.getDriver().findElements(bestSellerTagged_Devices).size();
		return size;
	}

	
	/********************************************************************************************************************************/
	public int get_GplanWithDevice999Text() {
		//List<WebElement> element=new ArrayList<WebElement>();

		int size= DriverManager.getDriver().findElements(GplanWithDevice999Text).size();
		return size;
	}
	
	
	/********************************************************************************************************************************/
	public WebElement get_WithDevice() {
		return DriverManager.getDriver().findElement(WithDevice);
	}
	/********************************************************************************************************************************/
	
	/********************************************************************************************************************************/
	public WebElement get_Checkbutton() {
		return DriverManager.getDriver().findElement(Checkbutton);
	}
	
	//Globe online Phase 2 Navabar Validation
		/********************************************************************************************************************************/
		public WebElement get_Link_Mobile() {
			return DriverManager.getDriver().findElement(Link_Mobile);
		}
		/********************************************************************************************************************************/
		public WebElement get_Link_HomeInternet() {
			return DriverManager.getDriver().findElement(Link_HomeInternet);
		}
		/********************************************************************************************************************************/
		public WebElement get_Link_Deals() {
			return DriverManager.getDriver().findElement(Link_Deals);
		}
		/********************************************************************************************************************************/
		public WebElement get_Link_QuickLinks() {
			return DriverManager.getDriver().findElement(Link_QuickLinks);
		}
		/********************************************************************************************************************************/
		public WebElement get_Link_SimOnly() {
			return DriverManager.getDriver().findElement(Link_SimOnly);
		}
		public WebElement get_Link_NewOnline() {
			return DriverManager.getDriver().findElement(Link_NewOnline);
		}
		
		/********************************************************************************************************************************/
		public WebElement get_Link_PlanWithDevice() {
			return DriverManager.getDriver().findElement(Link_PlanWithDevice);
		}
		/********************************************************************************************************************************/
		public WebElement get_Link_Renewal() {
			return DriverManager.getDriver().findElement(Link_Renewal);
		}
		/********************************************************************************************************************************/
		public WebElement get_Link_SwitchtoGlobe() {
			return DriverManager.getDriver().findElement(Link_SwitchtoGlobe);
		}
		/********************************************************************************************************************************/
	/***********************************************************************************************************************************/
	public List<WebElement> get_appleWatchDevices() {
		return DriverManager.getDriver().findElements(appleWatchDevices);
	}	
		public List<WebElement> get_colours() {
		return DriverManager.getDriver().findElements(colours);
		}

		
	public WebElement get_planWithDevice() {
		return DriverManager.getDriver().findElement(planWithDevice);
	}
	
	/*****************************************************************tttt****************************/
	public WebElement get_banner1continueplan()
	{
		return DriverManager.getDriver().findElement(banner1continueplan);
				
	}
	/********************************************************************************************************************************/
	public WebElement get_ForReservation() {
		return DriverManager.getDriver().findElement(ForReservation);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_PlanValue_radioButton() {
		return DriverManager.getDriver().findElement(PlanValue_radioButton);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_brand_radioButton() {
		return DriverManager.getDriver().findElement(brand_radioButton);
	}
	
	
	
	/********************************************************************************************************************************/
	
	public WebElement get_Tablet() {
		return DriverManager.getDriver().findElement(Tablet);
	}	

	public List<WebElement> get_clours()
	{
		return DriverManager.getDriver().findElements(clours);
		
	}
	
	public WebElement get_preorderavilable()
	{
		return DriverManager.getDriver().findElement(preorderavilable);
		
	}
	
	public WebElement get_prev2()
	{
		return DriverManager.getDriver().findElement(prev2);
		
	}

	public WebElement get_search_field_CSTM()
	{
		return DriverManager.getDriver().findElement(search_field_CSTM);
		
	}

	/********************************************************************************************************************************/
	public WebElement get_ForReservationButton() {
		return DriverManager.getDriver().findElement(ForReservationButton);
	}
	
	

	/**********************************************renewal**********************************************************************************/
	public WebElement get_RenewWithThisDevice() {

		return DriverManager.getDriver().findElement(RenewWithThisDevice);
	}
	public int get_FifteenDevicesPerPage() {
		//List<WebElement> element=new ArrayList<WebElement>();

		int size= DriverManager.getDriver().findElements(FifteenDevicesPerPage).size();
		return size;
	}
	
	public WebElement get_search_field() {
		return DriverManager.getDriver().findElement(search_field);
	}
	public WebElement get_acccordionButton7() {
		return DriverManager.getDriver().findElement(acccordionButton7);
	}
	public WebElement get_applyFilter_Button() {
		return DriverManager.getDriver().findElement(applyFilter_Button);
	}
	public WebElement get_huaweibrand_radioButton() {
		return DriverManager.getDriver().findElement(huaweibrand_radioButton);
	}
	public WebElement get_ebike_radioButton() {
		return DriverManager.getDriver().findElement(ebike_radioButton);
	}
	public WebElement get_productType() {
		return DriverManager.getDriver().findElement(productType);
	}
	public WebElement get_magnifying_glass() {
		return DriverManager.getDriver().findElement(magnifying_glass);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_renewWithThisDevice() {
		return DriverManager.getDriver().findElement(renewWithThisDevice);
	}
	public WebElement get_PlanValue999_radioButton() {
		return DriverManager.getDriver().findElement(PlanValue999_radioButton);
	}
	public WebElement get_Smart_Phone() {
		return DriverManager.getDriver().findElement(Smart_Phone);
	}
	public WebElement get_watch() {
		return DriverManager.getDriver().findElement(watch);
	}
	public WebElement get_brand() {
		return DriverManager.getDriver().findElement(brand);
	}
	
	
	/********************************************************************************************************************************/
	
	public WebElement get_Brand_Oppo() {
		return DriverManager.getDriver().findElement(Brand_Oppo);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_Color_Var() {
		return DriverManager.getDriver().findElement(Color_Var);
	}
	public WebElement get_Feature_Products() {
		return DriverManager.getDriver().findElement(Feature_Products);
	}
	public WebElement get_New_Radio() {
		return DriverManager.getDriver().findElement(New_Radio);
	}
	public WebElement get_BestSeller_Radio() {
		return DriverManager.getDriver().findElement(BestSeller_Radio);
	}
	public WebElement get_Vocher_Radio() {
		return DriverManager.getDriver().findElement(Vocher_Radio);
	}
	public WebElement get_electricStudio_radioButton() {
		return DriverManager.getDriver().findElement(electricStudio_radioButton);
	}
	public WebElement get_Nokia_Radio() {
		return DriverManager.getDriver().findElement(Nokia_Radio);
	}
	public WebElement get_planValue() {
		return DriverManager.getDriver().findElement(planValue);
	}
	public WebElement get_clear_filters() {
		return DriverManager.getDriver().findElement(clear_filters);
	}
	public WebElement get_Plan2499() {
		return DriverManager.getDriver().findElement(Plan2499);
	}
	public WebElement get_auto_search() {
		return DriverManager.getDriver().findElement(auto_search);
	}
	public WebElement get_BackToTop_Button() {
		return DriverManager.getDriver().findElement(BackToTop_Button);
	}
	public WebElement get_magnifybutton() {
		return DriverManager.getDriver().findElement(magnifybutton);
	}
	public WebElement get_collapse_Filter() {
		return DriverManager.getDriver().findElement(collapse_Filter);
	}
	
	public WebElement get_applebrand_radioButton() {
		return DriverManager.getDriver().findElement(applebrand_radioButton);
	}
	
	public WebElement get_PlanValueDP() {

		return DriverManager.getDriver().findElement(PlanValueDP);
	}
	/********************************************************************************************************************************/
	public WebElement get_ViewAllDevices() {

		return DriverManager.getDriver().findElement(ViewAllDevices);
	}
	/********************************************************************************************************************************/
	public WebElement get_ZoomIcon() {

		return DriverManager.getDriver().findElement(ZoomIcon);
	}
	/********************************************************************************************************************************/
	public WebElement get_Radio_btn1499() {

		return DriverManager.getDriver().findElement(Radio_btn1499);
	}

	/********************************************************************************************************************************/
	public WebElement get_acccordionButton8() {
		return DriverManager.getDriver().findElement(acccordionButton8);
	}
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton9() {
		return DriverManager.getDriver().findElement(acccordionButton9);
	}
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton10() {
		return DriverManager.getDriver().findElement(acccordionButton10);
	}
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton11() {
		return DriverManager.getDriver().findElement(acccordionButton11);
	}
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton12() {
		return DriverManager.getDriver().findElement(acccordionButton12);
	}

	public WebElement get_alldata() {
		return DriverManager.getDriver().findElement(alldata);
	}
	public WebElement get_FAQ1shoprearelly() {
		return DriverManager.getDriver().findElement(FAQ1shoprearelly);

	}
	public WebElement get_FAQ2socailrearelly() {
		return DriverManager.getDriver().findElement(FAQ2socailrearelly);

	}
	public WebElement get_FAQ3vediosrearelly() {
		return DriverManager.getDriver().findElement(FAQ3vediosrearelly);

	}
	public WebElement get_FAQ4musicrearelly() {
		return DriverManager.getDriver().findElement(FAQ4musicrearelly);

	}
	public WebElement get_FAQ5workrearelly() {
		return DriverManager.getDriver().findElement(FAQ5workrearelly);

	}
	public WebElement get_FAQ6gamesrearelly() {
		return DriverManager.getDriver().findElement(FAQ6gamesrearelly);

	}

	public WebElement get_shoping_onehr()
	{
		return DriverManager.getDriver().findElement(shoping_onrhr);
	}
	public WebElement get_shoping_twohr()
	{
		return DriverManager.getDriver().findElement(shoping_twohr);
	}
	public WebElement get_dataneedsvales()
	{
		return DriverManager.getDriver().findElement(dataneedsvales);

	}
	public WebElement get_timespendvalue() {
		return DriverManager.getDriver().findElement(timespendvalue);
	}
	public WebElement get_shopingzero()
	{
		return DriverManager.getDriver().findElement(shopingzero);
	}
	public WebElement get_rarely() {
		return DriverManager.getDriver().findElement(rarely);
	}
	public WebElement get_shoping_threehr()
	{
		return DriverManager.getDriver().findElement(shoping_threehr);
	}
	public WebElement get_shopping() {
		return DriverManager.getDriver().findElement(shopping);
	}
	public WebElement get_videos() {
		return DriverManager.getDriver().findElement(videos);
	}
	public WebElement get_music() {
		return DriverManager.getDriver().findElement(music);
	}
	public WebElement get_always() {
		return DriverManager.getDriver().findElement(always);
	}
	public WebElement get_games() {
		return DriverManager.getDriver().findElement(games);
	}
	public WebElement get_work() {
		return DriverManager.getDriver().findElement(work);
	}
	public WebElement get_occasionally() {
		return DriverManager.getDriver().findElement(occasionally);
	}
	public WebElement get_social() {
		return DriverManager.getDriver().findElement(social);
	}
	public WebElement get_sometimes() {
		return DriverManager.getDriver().findElement(sometimes);
	}
	public WebElement get_Social_fourhrs() {
		return DriverManager.getDriver().findElement(Social_fourhrs);
	}
	public WebElement get_Nexticon() {
		return DriverManager.getDriver().findElement(Nexticon);
	}

	public WebElement get_Getthisplan() {
		return DriverManager.getDriver().findElement(Getthisplan);
	}

	public WebElement get_alldata1999() {
		return DriverManager.getDriver().findElement(alldata1999);
	}
	public WebElement get_GplanPrice() {
		return DriverManager.getDriver().findElement(GplanPrice);
	}

	public WebElement get_privacyAccept() {
		return DriverManager.getDriver().findElement(privacyAccept);
	}
	
	public WebElement get_MenuIcon_MobileView() {
		return DriverManager.getDriver().findElement(MenuIcon_MobileView);
	}
	public WebElement get_MobileExpandOption_MobileView() {
		return DriverManager.getDriver().findElement(MobileExpandOption_MobileView);
	}
	public WebElement get_QuickLink_MobileView() {
		return DriverManager.getDriver().findElement(QuickLink_MobileView);
	}
	public WebElement get_QuickLinksDropdown_MobileView() {
		return DriverManager.getDriver().findElement(QuickLinksDropdown_MobileView);
	}
	public WebElement get_MobileExpandOptionRenewal_MobileView() {
		return DriverManager.getDriver().findElement(RenewalLink_MobileView);
	}
	public WebElement get_HomeInternet_MobileView() {
		return DriverManager.getDriver().findElement(HomeInternet_MobileView);
	}
	public WebElement get_chkbx_acceptAll() {
		return DriverManager.getDriver().findElement(chkbx_acceptAll);
	}
	
	
	public WebElement get_Deals_MobileView() {
		return DriverManager.getDriver().findElement(Deals_MobileView);
	}
	
	public WebElement get_QuickLinks_MobileView() {
		return DriverManager.getDriver().findElement(QuickLinks_MobileView);
	}
	public WebElement get_ExitMenu_MobileView() {
		return DriverManager.getDriver().findElement(ExitMenu_MobileView);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_GPlan599() {
		return DriverManager.getDriver().findElement(GPlan599);
	}
	/********************************************************************************************************************************/
	public WebElement get_GPlan2499() {
		return DriverManager.getDriver().findElement(GPlan2499);
	}

	/********************************************************************************************************************************/
	public WebElement get_link_LogoGlobe() {
		return DriverManager.getDriver().findElement(link_LogoGlobe);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_Apply() {
		return DriverManager.getDriver().findElement(link_Apply);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_Renew() {
		return DriverManager.getDriver().findElement(link_Renew);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_Switch() {
		return DriverManager.getDriver().findElement(link_Switch);
	}
	/********************************************************************************************************************************/
	public WebElement get_GCash() {
		return DriverManager.getDriver().findElement(GCash);
	}
	private WebElement get_Discover_Essential() {
		// TODO Auto-generated method stub
		return DriverManager.getDriver().findElement(Discover_Essential);
	}
	public WebElement get_Select_Customize() {
		return DriverManager.getDriver().findElement(Select_Customize);
	}
	/********************************************************************************************************************************/
	public WebElement get_ZoomOption() {
		return DriverManager.getDriver().findElement(ZoomOption);
	}
	/********************************************************************************************************************************/
	public WebElement get_GCash2499Plan() {
		return DriverManager.getDriver().findElement(GCash2499Plan);
	}
	/********************************************************************************************************************************/
	public WebElement get_GPlan1499() {
		return DriverManager.getDriver().findElement(GPlan1499);
	}
	/********************************************************************************************************************************/
	public WebElement get_Agree() {
		return DriverManager.getDriver().findElement(Agree);
	}
	
	
	/********************************************************************************************************************************/
	public WebElement get_link_MenuBuy() {
		return DriverManager.getDriver().findElement(link_MenuBuy);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_CartIcon() {
		return DriverManager.getDriver().findElement(CartIcon);
	}
	public WebElement get_mobilepostpaid()
	{
		return DriverManager.getDriver().findElement(mobilepostpaid);
	}
	/********************************************************************************************************************************/
	public WebElement get_link_TrackMyOrder() {
		return DriverManager.getDriver().findElement(link_TrackMyOrder);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_Help() {
		return DriverManager.getDriver().findElement(link_Help);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_MobilePostpaid() {
		return DriverManager.getDriver().findElement(link_MobilePostpaid);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_ViewAllDevices() {
		return DriverManager.getDriver().findElement(link_ViewAllDevices);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_CheckYourEligibility() {
		return DriverManager.getDriver().findElement(link_CheckYourEligibility);
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
public WebElement get_GetCode() {
		
		return DriverManager.getDriver().findElement(GetCode);
	}
	/********************************************************************************************************************************/
	public WebElement get_SubmitBtn() {
		
		return DriverManager.getDriver().findElement(SubmitBtn);
	}
	
	/********************************************************************************************************************************/
//	public WebElement get_acccordionButton() {
//		return DriverManager.getDriver().findElement(acccordionButton);
//	}
//	
	/********************************************************************************************************************************/
	public WebElement get_gplanWithDevice() {
		return DriverManager.getDriver().findElement(gplanWithDevice);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_gplanWithGCash() {
		return DriverManager.getDriver().findElement(gplanWithGCash);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_gplanPlusSIMOnly() {
		return DriverManager.getDriver().findElement(gplanPlusSIMOnly);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_gplanSIMOnlyAllData() {
		return DriverManager.getDriver().findElement(gplanSIMOnlyAllData);
	}
	
	
	
	/********************************************************************************************************************************/
	public WebElement get_previousicon() {
		return DriverManager.getDriver().findElement(previousicon);
	}
	
	
	/********************************************************************************************************************************/
	public WebElement get_owlnext() {
		return DriverManager.getDriver().findElement(owlnext);
	}
	
	public WebElement get_OrderID() {
		return DriverManager.getDriver().findElement(orderID);
	}
	/********************************************************************************************************************************/
	public WebElement get_DataAddon() {
		return DriverManager.getDriver().findElement(DataAddon);
	}
	/********************************************************************************************************************************/
	public WebElement get_MessageAddon() {
		return DriverManager.getDriver().findElement(MessageAddon);
	}
	/********************************************************************************************************************************/
	public WebElement get_MovieAddon() {
		return DriverManager.getDriver().findElement(MovieAddon);
	}
	public WebElement get_JetSettingLifeStyle() {
		return DriverManager.getDriver().findElement(JetSettingLifeStyle);
	}
	public WebElement get_renewdevice()
	{
		return DriverManager.getDriver().findElement(renewdevice);
	}
	
	
	
	
	
	
	/**
	 * @throws Exception ******************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		
		
		
		case "clicklanding3":
			flag = waitForElementVisibility(clicklanding3, waitTime);
			break;
		case "Devicetext":
			flag = waitForElementVisibility(Devicetext, waitTime);
			break;
			
		case "alldata1499":
			flag = waitForElementVisibility(alldata1499, waitTime);
			break;
		case "ournewestplan":
			flag = waitForElementVisibility(ournewestplan, waitTime);
			break;
		case "recomended":
			flag = waitForElementVisibility(recomended, waitTime);
			break;
			
			
		case "call1499":
			flag = waitForElementVisibility(call1499, waitTime);
			break;
		case "Link_DeviceGallery":
			flag = waitForElementVisibility(Link_DeviceGallery, waitTime);
			break;
		case "TokenInput":
			flag = waitForElementVisibility(TokenInput, waitTime);
			break;
		case "Link_ViewPlans":
			flag = waitForElementVisibility(Link_ViewPlans, waitTime);
			break;
		case "Link_Brands":
			flag = waitForElementVisibility(Link_Brands, waitTime);
			break;
		case "Link_Apple":
			flag = waitForElementVisibility(Link_Apple, waitTime);
			break;
		case "Link_Samsung":
			flag = waitForElementVisibility(Link_Samsung, waitTime);
			break;
		case "Link_Services":
			flag = waitForElementVisibility(Link_Services, waitTime);
			break;
		case "Link_Gadget":
			flag = waitForElementVisibility(Link_Gadget, waitTime);
			break;
			
		case "EasyPaymentTetx":
			flag = waitForElementVisibility(EasyPaymentTetx, waitTime);
			break;
		case "CancelIcon":
			flag = waitForElementVisibility(CancelIcon, waitTime);
			break;
		case "GlobeLogo":
			flag = waitForElementVisibility(GlobeLogo, waitTime);
			break;
		case "Link_Mobile":
			flag = waitForElementVisibility(Link_Mobile, waitTime);
			break;
		case "Link_Postpaid":
			flag = waitForElementVisibility(Link_Postpaid, waitTime);
			break;
		case "Link_SimOnly":
			flag = waitForElementVisibility(Link_SimOnly, waitTime);
			break;
		case "Link_PlanWithDevice":
			flag = waitForElementVisibility(Link_PlanWithDevice, waitTime);
			break;
		case "Link_Renewal":
			flag = waitForElementVisibility(Link_Renewal, waitTime);
			break;
		case "Link_HomeInternet":
			flag = waitForElementVisibility(Link_HomeInternet, waitTime);
			break;
		case "Link_HIpostpaid":
			flag = waitForElementVisibility(Link_HIpostpaid, waitTime);
			break;
		case "Link_ApplyGfiberPlan":
			flag = waitForElementVisibility(Link_ApplyGfiberPlan, waitTime);
			break;
		case "Link_UpgradeInternetPlan":
			flag = waitForElementVisibility(Link_UpgradeInternetPlan, waitTime);
			break;
		case "GFiber_Prepaid":
			flag = waitForElementVisibility(GFiber_Prepaid, waitTime);
			break;
		case "Link_NewOnline":
			flag = waitForElementVisibility(Link_NewOnline, waitTime);
			break;
		case "Link_Prepaid":
			flag = waitForElementVisibility(Link_Prepaid, waitTime);
			break;
		case "Link_PrepaidWifi":
			flag = waitForElementVisibility(Link_PrepaidWifi, waitTime);
			break;
		case "Link_PrepaidWifiSIM":
			flag = waitForElementVisibility(Link_PrepaidWifiSIM, waitTime);
			break;
		case "Link_Deals":
			flag = waitForElementVisibility(Link_Deals, waitTime);
			break;
		case "Link_GPlanPLUS_Discounted_Devices":
			flag = waitForElementVisibility(Link_GPlanPLUS_Discounted_Devices, waitTime);
			break;
		case "Link_Globe_Prepaid_Exclusives":
			flag = waitForElementVisibility(Link_Globe_Prepaid_Exclusives, waitTime);
			break;			
		case "Link_QuickLinks":
			flag = waitForElementVisibility(Link_QuickLinks, waitTime);
			break;
			
		case "Link_BUYLoad":
			flag = waitForElementVisibility(Link_BUYLoad, waitTime);
			break;
		case "Link_Register_your_SIM":
			flag = waitForElementVisibility(Link_Register_your_SIM, waitTime);
			break;
		case "Link_SwitchtoGlobe":
			flag = waitForElementVisibility(Link_SwitchtoGlobe, waitTime);
			break;
		case "Link_HelpSupport":
			flag = waitForElementVisibility(Link_HelpSupport, waitTime);
			break;
		case "Link_TrackMyorder":
			flag = waitForElementVisibility(Link_TrackMyorder, waitTime);
			break;
			
			
		case "plan1299withdevice":
			flag = waitForElementVisibility(plan1299withdevice, waitTime);
			break;
		case "QuickLink_Mobileview":
			flag=waitForElementVisibility(QuickLink_MobileView, waitTime);
			break;
		case "ExitMenu_MobileView":
			flag=waitForElementVisibility(ExitMenu_MobileView, waitTime);
			break;
		case "MobileExpandOptionRenewal_MobileView":
			flag=waitForElementVisibility(RenewalLink_MobileView, waitTime);
			break;			
		case "QuickLinkDropdown_BuyLoad_MobileView":
			flag=waitForElementVisibility(QuickLinkDropdown_BuyLoad_MobileView, waitTime);
			break;
		case "QuickLinkDropdown_RegisterYourSim_MobileView":
			flag=waitForElementVisibility(QuickLinkDropdown_RegisterYourSim_MobileView, waitTime);
			break;
		case "QuickLinkDropdown_SwitchtoGlobe_MobileView":
			flag=waitForElementVisibility(QuickLinkDropdown_SwitchtoGlobe_MobileView, waitTime);
			break;
		case "QuickLinkDropdown_HelpandSupport_MobileView":
			flag=waitForElementVisibility(QuickLinkDropdown_HelpandSupport_MobileView, waitTime);
			break;
			
			
			
			
				
		case "GlobeLogo_MobileView":
			flag=waitForElementVisibility(GlobeLogo_MobileView, waitTime);
			break;
		case "EasyPayments_MobileView":
			flag=waitForElementVisibility(EasyPayments_MobileView, waitTime);
			break;
			
			
			
		case "SimOnlyPlan_MobileView":
			flag=waitForElementVisibility(SimOnlyPlan_MobileView, waitTime);
			break;
		case "PlanWithDevice_MobileView":
			flag=waitForElementVisibility(PlanWithDevice_MobileView, waitTime);
			break;
		case "HomeInternet_MobileView":
			flag=waitForElementVisibility(HomeInternet_MobileView, waitTime);
			break;
		case "ApplyForaGFiberPlan_MobileView":
			flag=waitForElementVisibility(ApplyForaGFiberPlan_MobileView, waitTime);
			break;
		case "UpgradeMyInternet_MobileView":
			flag=waitForElementVisibility(UpgradeMyInternet_MobileView, waitTime);
			break;
		case "GFiberPrepaid_MobileView":
			flag=waitForElementVisibility(GFiberPrepaid_MobileView, waitTime);
			break;
		case "PrepaidWifi_MobileView":
			flag=waitForElementVisibility(PrepaidWifi_MobileView, waitTime);
			break;
		case "HomePrepaidWifiSim_MobileView":
			flag=waitForElementVisibility(HomePrepaidWifiSim_MobileView, waitTime);
			break;
		case "Deals_MobileView":
			flag=waitForElementVisibility(Deals_MobileView, waitTime);
			break;
		case "DiscountedDevices_MobileView":
			flag=waitForElementVisibility(DiscountedDevices_MobileView, waitTime);
			break;
		case "GlobePrepaidExclusives_MobileView":
			flag=waitForElementVisibility(GlobePrepaidExclusives_MobileView, waitTime);
			break;
		case "QuickLinks_MobileView":
			flag=waitForElementVisibility(QuickLinks_MobileView, waitTime);
			break;
		case "BuyLoad_MobileView":
			flag=waitForElementVisibility(BuyLoad_MobileView, waitTime);
			break;
		case "RegisterYourSim_MobileView":
			flag=waitForElementVisibility(RegisterYourSim_MobileView, waitTime);
			break;
		case "SwitchtoGlobe_MobileView":
			flag=waitForElementVisibility(SwitchToGlobe_MobileView, waitTime);
			break;
		case "HelpandSupport_MobileView":
			flag=waitForElementVisibility(HelpandSupport_MobileView, waitTime);
			break;
						
			
				
			
		case "RenewalLink_MobileView":
			flag=waitForElementVisibility(RenewalLink_MobileView, waitTime);
			break;	
			
		case "MenuIcon_MobileView":
			flag=waitForElementVisibility(MenuIcon_MobileView, waitTime);
			break;
		
		case "internet":
			flag = waitForElementVisibility(internet, waitTime);
			break;
		case "deals":
			flag = waitForElementVisibility(deals, waitTime);
			break;
		case "reload":
			flag = waitForElementVisibility(reload, waitTime);
			break;
		case "registersim":
			flag = waitForElementVisibility(registersim, waitTime);
			break;
		case "net1499":
			flag = waitForElementVisibility(net1499, waitTime);
			break;
		case "mobilepostpaid":
			flag = waitForElementVisibility(mobilepostpaid, waitTime);
			break;
		case "inclu1499":
			flag = waitForElementVisibility(inclu1499, waitTime);
			break;
		case "GB1499withdevice":
			flag = waitForElementVisibility(GB1499withdevice, waitTime);
			break;
		case "banner1postpaidplan":
			flag = waitForElementVisibility(banner1postpaidplan, waitTime);
			break;
		case "banner1continueplan":
			flag = waitForElementVisibility(banner1continueplan, waitTime);
			break;
		case "banner1checrecomendedkplan":
			flag = waitForElementVisibility(banner1checrecomendedkplan, waitTime);
			break;
		
		case "banner2simonly3799":
			flag = waitForElementVisibility(banner2simonly3799, waitTime);
			break;
		case "banner2unlimit":
			flag = waitForElementVisibility(banner2unlimit, waitTime);
			break;
		case "banner2planstart":
			flag = waitForElementVisibility(banner2planstart, waitTime);
			break;
		case "banner2planstartvalue":
			flag = waitForElementVisibility(banner2planstartvalue, waitTime);
			break;
		case "banner2showplan":
			flag = waitForElementVisibility(banner2showplan, waitTime);
			break;
		case "banner2simonly2499":
			flag = waitForElementVisibility(banner2simonly2499, waitTime);
			break;
		case "banner2moredata":
			flag = waitForElementVisibility(banner2moredata, waitTime);
			break;
		case "banner2planstartat":
			flag = waitForElementVisibility(banner2planstartat, waitTime);
			break;
		case "banner2planstartvalue2":
			flag = waitForElementVisibility(banner2planstartvalue2, waitTime);
			break;
		case "banner2showplan2":
			flag = waitForElementVisibility(banner2showplan2, waitTime);
			break;
		
		case "prev":
			flag = waitForElementVisibility(prev, waitTime);
			break;
		case "next":
			flag = waitForElementVisibility(next, waitTime);
			break;
		case "enjoy":
			flag = waitForElementVisibility(enjoy, waitTime);
			break;
		case "simonly":
			flag = waitForElementVisibility(simonly, waitTime);
			break;
			
		case "device":
				flag = waitForElementVisibility(device, waitTime);
				break;				
		case "gcash":
			flag = waitForElementVisibility(gcash, waitTime);
			break;
		case "alldata":
			flag = waitForElementVisibility(alldata, waitTime);
			break;
		case "prev2":
			flag = waitForElementVisibility(prev2, waitTime);
			break;
		case "next2":
			flag = waitForElementVisibility(next2, waitTime);
			break;

		
		case "PlanValue":
			flag = waitForElementVisibility(PlanValue, waitTime);
			break;
		case "CreateBetterConnections":
			flag = waitForElementVisibility(CreateBetterConnections, waitTime);
			break;
		case "NeverMissABeat":
			flag = waitForElementVisibility(NeverMissABeat, waitTime);
			break;
		case "NextArrowIcon":
			flag = waitForElementVisibility(NextArrowIcon, waitTime);
			break;
		case "AmazonPrime":
			flag = waitForElementVisibility(AmazonPrime, waitTime);
			break;
		case "TotalSubscAddons":
			flag = waitForElementVisibility(TotalSubscAddons, waitTime);
			break;
		case "MonthlyPayment":
			flag = waitForElementVisibility(MonthlyPayment, waitTime);
			break;
		case "SelectPlan":
			flag = waitForElementVisibility(SelectPlan, waitTime);
			break;

		case "MonthlyBill":
			flag = waitForElementVisibility(MonthlyBill, waitTime);
			break;

		case "RenewingFor":
			flag = waitForElementVisibility(RenewingFor, waitTime);
			break;


		case "ViuPremium":
			flag = waitForElementVisibility(ViuPremium, waitTime);
			break;
		case "SpotifyPremium":
			flag = waitForElementVisibility(SpotifyPremium, waitTime);
			break;
		case "SeeMyNewPlan":
			flag = waitForElementVisibility(SeeMyNewPlan, waitTime);
			break;

		case "WelcomeBack":
			flag = waitForElementVisibility(WelcomeBack, waitTime);
			break;

			//			Check out our newest plans

		case "looking":
			flag = waitForElementVisibility(looking, waitTime);
			break;
		case "Prevsicon":
			flag = waitForElementVisibility(Prevsicon, waitTime);
			break;
		case "Nexticons":
			flag = waitForElementVisibility(Nexticons, waitTime);
			break;
		case "banner2checkout":
			flag = waitForElementVisibility(banner2checkout, waitTime);
			break;
		
		case "GPlan1499withDevice":
			flag = waitForElementVisibility(GPlan1499withDevice, waitTime);
			break;

		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "MyDuo":
			flag = waitForElementVisibility(MyDuo, waitTime);
			break;


		case "SubmitBtn":
			flag = waitForElementVisibility(SubmitBtn, waitTime);
			break;
		case "GSSurfAdd99":
			flag = waitForElementVisibility(GSSurfAdd99, waitTime);
			break;


		case "PickYourAddons":
			flag = waitForElementVisibility(PickYourAddons, waitTime);
			break;



		case "RenewWithThisDevice":
			flag = waitForElementVisibility(RenewWithThisDevice, waitTime);
			break;
		case "GetCode":
			flag = waitForElementVisibility(GetCode, waitTime);
			break;


		case "SelectedGplanWithDevice":
			flag = waitForElementVisibility(SelectedGplanWithDevice, waitTime);
			break;
		case "Features":
			flag = waitForElementVisibility(Features, waitTime);
			break;
		case "Specifications":
			flag = waitForElementVisibility(Specifications, waitTime);
			break;


		case "ZoomIcon":
			flag = waitForElementVisibility(ZoomIcon, waitTime);
			break;
		case "CashamountValue":
			flag = waitForElementVisibility(CashamountValue, waitTime);
			break;
		case "AvailableForDelivery":
			flag = waitForElementVisibility(AvailableForDelivery, waitTime);
			break;


		case "Color":
			flag = waitForElementVisibility(Color, waitTime);
			break;
		case "ContractDuration":
			flag = waitForElementVisibility(ContractDuration, waitTime);
			break;
		case "CashoutAmount":
			flag = waitForElementVisibility(CashoutAmount, waitTime);
			break;


		case "ProductDetails":
			flag = waitForElementVisibility(ProductDetails, waitTime);
			break;

		case "RenewYourPlanProduct":
			flag = waitForElementVisibility(RenewYourPlanProduct, waitTime);
			break;

		case "RenewWithDevice":
			flag = waitForElementVisibility(RenewWithDevice, waitTime);
			break;
		case "GlobeRecomPlan":
			flag = waitForElementVisibility(GlobeRecomPlan, waitTime);
			break;
		case "LookingForMorePlans":
			flag = waitForElementVisibility(LookingForMorePlans, waitTime);
			break;
		case "PlanTypes":
			flag = waitForElementVisibility(PlanTypes, waitTime);
			break;
		case "GPlanNameCardAmount":
			flag = waitForElementVisibility(GPlanNameCardAmount, waitTime);
			break;


		case "GPlanNameCard":
			flag = waitForElementVisibility(GPlanNameCard, waitTime);
			break;

		case "HighlightedSimOnly":
			flag = waitForElementVisibility(HighlightedSimOnly, waitTime);
			break;
		case "DeviceOption":
			flag = waitForElementVisibility(DeviceOption, waitTime);
			break;
		case "GCashOption":
			flag = waitForElementVisibility(GCashOption, waitTime);
			break;
		case "AllDataOption":
			flag = waitForElementVisibility(AllDataOption, waitTime);
			break;

		case "CTA_btn":
			flag = waitForElementVisibility(CTA_btn, waitTime);
			break;
		case "RenewWithCurrentPlan":
			flag = waitForElementVisibility(RenewWithCurrentPlan, waitTime);
			break;


		case "StarterImg":
			flag = waitForElementVisibility(StarterImg, waitTime);
			break;
		case "GreatLifeStartsHere":
			flag = waitForElementVisibility(GreatLifeStartsHere, waitTime);
			break;

		case "EntertainmentForDays":
			flag = waitForElementVisibility(EntertainmentForDays, waitTime);
			break;
		case "Social_fourhrs":
			flag = waitForElementVisibility(Social_fourhrs, waitTime);
			break;
		case "Discover_Essential":
			flag = waitForElementVisibility(Discover_Essential, waitTime);
			break;
		case "MappedDevices":
			flag = waitForElementVisibility(MappedDevices, waitTime);
			break;
		case "ZoomOption":
			flag = waitForElementVisibility(ZoomOption, waitTime);
			break;
		case "PromoTab":
			flag = waitForElementVisibility(PromoTab, waitTime);
			break;
		case "FeatureContent":
			flag = waitForElementVisibility(FeatureContent, waitTime);
			break;


		case "FeaturesTab":
			flag = waitForElementVisibility(FeaturesTab, waitTime);
			break;

		case "DefaultSelectedPlan":
			flag = waitForElementVisibility(DefaultSelectedPlan, waitTime);
			break;
		case "DefaultSelectedDevice":
			flag = waitForElementVisibility(DefaultSelectedDevice, waitTime);
			break;



		case "DefaultDeviceSelected":
			flag = waitForElementVisibility(DefaultDeviceSelected, waitTime);
			break;
		case "PlanBuilderPage":
			flag = waitForElementVisibility(PlanBuilderPage, waitTime);
			break;

		case "EssentialBanner1":
			flag = waitForElementVisibility(EssentialBanner1, waitTime);
			break;
		case "Select_Customize":
			flag = waitForElementVisibility(Select_Customize, waitTime);
			break;


		case "DeviceName":
			flag = waitForElementVisibility(DeviceName, waitTime);
			break;


		case "link_CheckYourEligibility":
			flag = waitForElementVisibility(link_CheckYourEligibility, waitTime);
			break;
		case "Mobilenumberformat":
			flag = waitForElementVisibility(Mobilenumberformat, waitTime);
			break;
		case "Agree":
			flag = waitForElementVisibility(Agree, waitTime);

			break;
		case "EligibilityPanel":
			flag = waitForElementVisibility(EligibilityPanel, waitTime);

			break;

		case "Discover_starter":
			flag = waitForElementVisibility(Discover_starter, waitTime);

			break;
		case "getStarted999":
			flag = waitForElementVisibility(getStarted999, waitTime);

			break;
		case "ProceedwithMyPlan":
			flag = waitForElementVisibility(ProceedwithMyPlan, waitTime);

			break;
		case "NODoc":
			flag = waitForElementVisibility(NODoc, waitTime);

			break;



		case "Timespent":
			flag = waitForElementVisibility(Timespent, waitTime);
			break;
		case "Dataneeds":
			flag = waitForElementVisibility(Dataneeds, waitTime);
			break;
		case "TimeSpentValue":
			flag = waitForElementVisibility(TimeSpentValue, waitTime);
			break;
		case "DataNeedsValue":
			flag = waitForElementVisibility(DataNeedsValue, waitTime);
			break;

		case "AlwayOnPlanPage":
			flag = waitForElementVisibility(AlwayOnPlanPage, waitTime);
			break;
		case "acquiCarousel01":
			flag = waitForElementVisibility(acquiCarousel01, waitTime);
			break;	
		case "link_Switch":
			flag = waitForElementVisibility(link_Switch, waitTime);
			break;
		case "link_MenuBuy":
			flag = waitForElementVisibility(link_MenuBuy, waitTime);
			break;
		case "CartIcon":
			flag = waitForElementVisibility(CartIcon, waitTime);
			break;
		case "link_TrackMyOrder":
			flag = waitForElementVisibility(link_TrackMyOrder, waitTime);
			break;
		case "link_Help":
			flag = waitForElementVisibility(link_Help, waitTime);
			break;
		case "postpaidPlansAndSmartphones":
			flag = waitForElementVisibility(postpaidPlansAndSmartphones, waitTime);
			break;
		case "pickingTheRightPlanBanner":
			flag = waitForElementVisibility(pickingTheRightPlanBanner, waitTime);
			break;

		case "customSlider":
			flag = waitForElementVisibility(customSlider, waitTime);
			break;
		case "HowOftenDoYou":
			flag = waitForElementVisibility(HowOftenDoYou, waitTime);
			break;
		case "rarely":
			flag = waitForElementVisibility(rarely, waitTime);
			break;
		case "occasionally":
			flag = waitForElementVisibility(occasionally, waitTime);
			break;
		case "sometimes":
			flag = waitForElementVisibility(sometimes, waitTime);
			break;
		case "always":
			flag = waitForElementVisibility(always, waitTime);
			break;
		case "tellMeabout":
			flag = waitForElementVisibility(tellMeabout, waitTime);
			break;	
		case "introductionBlock":
			flag = waitForElementVisibility(introductionBlock, waitTime);
			break;
		case "planStylesForAll":
			flag = waitForElementVisibility(planStylesForAll, waitTime);
			break;
		case "shopping":
			flag = waitForElementVisibility(shopping, waitTime);
			break;
		case "social":
			flag = waitForElementVisibility(social, waitTime);
			break;
		case "videos":
			flag = waitForElementVisibility(videos, waitTime);
			break;
		case "music":
			flag = waitForElementVisibility(music, waitTime);
			break;
		case "work":
			flag = waitForElementVisibility(work, waitTime);
			break;
		case "games":
			flag = waitForElementVisibility(games, waitTime);
			break;	
		case "shopingfaq":
			flag = waitForElementVisibility(shopingfaq, waitTime);
			break;
		case "socailfaq":
			flag = waitForElementVisibility(socailfaq, waitTime);
			break;
		case "Vediosfaq":
			flag = waitForElementVisibility(Vediosfaq, waitTime);
			break;
		case "musicfaq":
			flag = waitForElementVisibility(musicfaq, waitTime);
			break;
		case "workfaq":
			flag = waitForElementVisibility(workfaq, waitTime);
			break;
		case "gamesfaq":
			flag = waitForElementVisibility(gamesfaq, waitTime);
			break;	
		case "FAQ1shoprearelly":
			flag = waitForElementVisibility(FAQ1shoprearelly, waitTime);
			break;	
		case "FAQ2socailrearelly":
			flag = waitForElementVisibility(FAQ2socailrearelly, waitTime);
			break;
		case "FAQ3vediosrearelly":
			flag = waitForElementVisibility(FAQ3vediosrearelly, waitTime);
			break;
		case "FAQ4musicrearelly":
			flag = waitForElementVisibility(FAQ4musicrearelly, waitTime);
			break;
		case "FAQ5workrearelly":
			flag = waitForElementVisibility(FAQ5workrearelly, waitTime);
			break;
		case "FAQ6gamesrearelly":
			flag = waitForElementVisibility(FAQ6gamesrearelly, waitTime);
			break;
		case "timespend":
			flag = waitForElementVisibility(timespend, waitTime);
			break;	
		case "timespendvalue":
			flag = waitForElementVisibility(timespendvalue, waitTime);
			break;	
		case "dataneeds":
			flag = waitForElementVisibility(dataneeds, waitTime);
			break;	
		case "dataneedsvales":
			flag = waitForElementVisibility(dataneedsvales, waitTime);
			break;
		case "tellmemore":
			flag = waitForElementVisibility(tellmemore, waitTime);
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
		case "faqText7":
			flag = waitForElementVisibility(faqText7, waitTime);
			break;
		case "faqText8":
			flag = waitForElementVisibility(faqText8, waitTime);
			break;
		case "faqText9":
			flag = waitForElementVisibility(faqText9, waitTime);
			break;
		case "faqText10":
			flag = waitForElementVisibility(faqText10, waitTime);
			break;
		case "faqText11":
			flag = waitForElementVisibility(faqText11, waitTime);
			break;
		case "faqText12":
			flag = waitForElementVisibility(faqText12, waitTime);
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
		case "gplanWithDevice":
			flag = waitForElementVisibility(gplanWithDevice, waitTime);
			break;
		case "gplanWithGCash":
			flag = waitForElementVisibility(gplanWithGCash, waitTime);
			break;
		case "gplanPlusSIMOnly":
			flag = waitForElementVisibility(gplanPlusSIMOnly, waitTime);
			break;
		case "gplanSIMOnlyAllData":
			flag = waitForElementVisibility(gplanSIMOnlyAllData, waitTime);
			break;
		case "previousicon":
			flag = waitForElementVisibility(previousicon, waitTime);
			break;

		case "previousiconsimonly":
			flag = waitForElementVisibility(previousiconsimonly, waitTime);
			break;


		case "Nexticon":
			flag = waitForElementVisibility(Nexticon, waitTime);
			break;


		case "starter":
			flag = waitForElementVisibility(starter, waitTime);
			break;
		case "Platinum_7999":
			flag = waitForElementVisibility(Platinum_7999, waitTime);
			break;
		case "Platinum_4999":
			flag = waitForElementVisibility(Platinum_4999, waitTime);
			break;
		case "lite":
			flag = waitForElementVisibility(lite, waitTime);
			break;
		case "basic":
			flag = waitForElementVisibility(basic, waitTime);
			break;
		case "owlnext":
			flag = waitForElementVisibility(owlnext, waitTime);
			break;
		case "value":
			flag = waitForElementVisibility(value, waitTime);
			break;
		case "essential":
			flag = waitForElementVisibility(essential, waitTime);
			break;
		case "plus":
			flag = waitForElementVisibility(plus, waitTime);
			break;
		case "extra":
			flag = waitForElementVisibility(extra, waitTime);
			break;
		case "alwaysOn":
			flag = waitForElementVisibility(alwaysOn, waitTime);
			break;
		case "DiscoverExtra":
			flag = waitForElementVisibility(DiscoverExtra, waitTime);
			break;
		case "EXTRAORDINARY":
			flag = waitForElementVisibility(EXTRAORDINARY, waitTime);
			break;
		case "WithDevice":
			flag = waitForElementVisibility(WithDevice, waitTime);
			break;
		case "Gcash":
			flag = waitForElementVisibility(Gcash, waitTime);
			break;
		case "Simonly":
			flag = waitForElementVisibility(Simonly, waitTime);
			break;
		case "Alldata":
			flag = waitForElementVisibility(Alldata, waitTime);
			break;
		case "Banner1":
			flag = waitForElementVisibility(Banner1, waitTime);
			break;
		case "Banner2":
			flag = waitForElementVisibility(Banner2, waitTime);
			break;
		case "Banner3":
			flag = waitForElementVisibility(Banner3, waitTime);
			break;
		case "Banner4":
			flag = waitForElementVisibility(Banner4, waitTime);
			break;
		case "Banner5":
			flag = waitForElementVisibility(Banner5, waitTime);
			break;
		case "Banner6":
			flag = waitForElementVisibility(Banner6, waitTime);
			break;
		case "Banner7":
			flag = waitForElementVisibility(Banner7, waitTime);
			break;
		case "Banner8":
			flag = waitForElementVisibility(Banner8, waitTime);
			break;

		
		case "alldata1999":
			flag = waitForElementVisibility(alldata1999, waitTime);
			break;


		case "Gplan599withGash":
			flag = waitForElementVisibility(Gplan599withGash, waitTime);
			break;
		case "GplanPrice":
			flag = waitForElementVisibility(GplanPrice, waitTime);
			break;
		case "GplanPriceSimonly999":
			flag = waitForElementVisibility(GplanPriceSimonly999, waitTime);
			break;
			/********************************************************************************************************************************/
		case "Getthisplan":
			flag = waitForElementVisibility(Getthisplan, waitTime);
			break;

		case "GetthisplanWithGcash599":
			flag = waitForElementVisibility(GetthisplanWithGcash599, waitTime);
			break;	
		case "Gplan999simonly":
			flag = waitForElementVisibility(Gplan999simonly, waitTime);
			break;
		case "selectGplansimonly999":
			flag = waitForElementVisibility(selectGplansimonly999, waitTime);
			break;		
		case "GetthisplanSimonly999":
			flag = waitForElementVisibility(GetthisplanSimonly999, waitTime);
			break;	
		case "Gplan14999Price":
			flag = waitForElementVisibility(Gplan14999Price, waitTime);
			break;	
		case "GetthisplanGplan14999Price":
			flag = waitForElementVisibility(GetthisplanGplan14999Price, waitTime);
			break;	
			
			
		case "cookiesNotification":
			flag = waitForElementVisibility(cookiesNotification, waitTime);
			break;
		case "privacyAccept":
			flag = waitForElementVisibility(privacyAccept, waitTime);
			break;
		case "link_LogoGlobe":
			flag = waitForElementVisibility(link_LogoGlobe, waitTime);
			break;	
		case "link_Apply":
			flag = waitForElementVisibility(link_Apply, waitTime);
			break;
		case "link_Renew":
			flag = waitForElementVisibility(link_Renew, waitTime);
			break;
		case "link_MobilePostPaid":
			flag = waitForElementVisibility(link_MobilePostPaid, waitTime);
			break;
		case "link_ViewAllDevices":
			flag = waitForElementVisibility(link_ViewAllDevices, waitTime);
			break;
		case "BackToTop_Button":
			flag = waitForElementVisibility(BackToTop_Button, waitTime);
			break;
		case "Colour_Variant":
			flag = waitForElementVisibility(Colour_Variant, waitTime);
			break;
		case "search_field":
			flag = waitForElementVisibility(search_field, waitTime);
			break;
		case "auto_search":
			flag = waitForElementVisibility(auto_search, waitTime);
			break;	
		case "searched_Device":
			flag = waitForElementVisibility(searched_Device, waitTime);
			break;
		case "X_Button":
			flag = waitForElementVisibility(X_Button, waitTime);
			break;
		case "notAvailable_Msg":
			flag = waitForElementVisibility(notAvailable_Msg, waitTime);
			break;	
		case "outOfStockText":
			flag = waitForElementVisibility(outOfStockText, waitTime);
			break;	
		case "relevantItem":
			flag = waitForElementVisibility(relevantItem, waitTime);
			break;	
		case "sortDropDown":
			flag = waitForElementVisibility(sortDropDown, waitTime);
			break;	
		case "priceHightoLow":
			flag = waitForElementVisibility(priceHightoLow, waitTime);
			break;	
		case "priceLowtoHigh":
			flag = waitForElementVisibility(priceLowtoHigh, waitTime);
			break;	
		case "featuredProducts":
			flag = waitForElementVisibility(featuredProducts, waitTime);
			break;	
		case "collapse_Filter":
			flag = waitForElementVisibility(collapse_Filter, waitTime);
			break;	
		case "productType":
			flag = waitForElementVisibility(productType, waitTime);
			break;	
		case "planValue":
			flag = waitForElementVisibility(planValue, waitTime);
			break;	
		case "brand":
			flag = waitForElementVisibility(brand, waitTime);
			break;	
		case "clear_filters_Disabled":
			flag = waitForElementVisibility(clear_filters_Disabled, waitTime);
			break;	
		case "clear_filters":
			flag = waitForElementVisibility(clear_filters, waitTime);
			break;	
		case "PlanValue999_radioButton":
			flag = waitForElementVisibility(PlanValue999_radioButton, waitTime);
			break;	
		case "huaweibrand_radioButton":
			flag = waitForElementVisibility(huaweibrand_radioButton, waitTime);
			break;	
		case "applyFilter_Button":
			flag = waitForElementVisibility(applyFilter_Button, waitTime);
			break;
		case "planWithDevice":
			flag = waitForElementVisibility(planWithDevice, waitTime);
			break;	
		case "samsung_device":
			flag = waitForElementVisibility(samsung_device, waitTime);
			break;		
		case "colourOr_Finish":
			flag = waitForElementVisibility(colourOr_Finish, waitTime);
			break;	
		case "capacity":
			flag = waitForElementVisibility(capacity, waitTime);
			break;
		case "contract_duration":
			flag = waitForElementVisibility(contract_duration, waitTime);
			break;	
		case "cashout_amount":
			flag = waitForElementVisibility(cashout_amount, waitTime);
			break;	
		case "renewwithThisDevice":
			flag = waitForElementVisibility(renewWithThisDevice, waitTime);
			break;
		case "Color_Var":
			flag = waitForElementVisibility(Color_Var, waitTime);
			break;
		case "Feature_Products":
			flag = waitForElementVisibility(Feature_Products, waitTime);
			break;
		case "New_Radio":
			flag = waitForElementVisibility(New_Radio, waitTime);
			break;
		case "BestSeller_Radio":
			flag = waitForElementVisibility(BestSeller_Radio, waitTime);
			break;
		case "Vocher_Radio":
			flag = waitForElementVisibility(Vocher_Radio, waitTime);
			break;	
		case "electricstudio_Device":
			flag = waitForElementVisibility(electricstudio_Device, waitTime);
			break;	
		case "Tab_Devices":
			flag = waitForElementVisibility(Tab_Devices, waitTime);
			break;
		case "Nokia_Devices":
			flag = waitForElementVisibility(Nokia_Devices, waitTime);
			break;	
		case "InStock_Text":
			flag = waitForElementVisibility(InStock_Text, waitTime);
			break;
		case "renewWithThisDevice":
			flag = waitForElementVisibility(renewWithThisDevice, waitTime);
			break;	
		case "RenewalProcessing":
			flag = waitForElementVisibility(RenewalProcessing, waitTime);
			break;	
		case "deviceGalleryText":
			flag = waitForElementVisibility(deviceGalleryText, waitTime);
			break;	
		case "BestsellerTag":
			flag = waitForElementVisibility(BestsellerTag, waitTime);
			break;
		case "appleWatchDevices":
			flag = waitForElementVisibility(appleWatchDevices, waitTime);
			break;		
		case "GPlan599":
			flag = waitForElementVisibility(GPlan599, waitTime);
			break;
		case "GPlan2499":
			flag = waitForElementVisibility(GPlan2499, waitTime);
			break;
		case "GCash":
			flag = waitForElementVisibility(GCash, waitTime);
			break;			
		case "GPlan1499":
			flag = waitForElementVisibility(GPlan1499, waitTime);
			break;
		case "GCash2499Plan":
			flag = waitForElementVisibility(GCash2499Plan, waitTime);
			break;	
		case "postpaidDevices":
			flag = waitForElementVisibility(postpaidDevices, waitTime);
			break;
		case "filters":
			flag = waitForElementVisibility(filters, waitTime);
			break;		
		case "RenewtoGPlanPlus":
			flag = waitForElementVisibility(RenewtoGPlanPlus, waitTime);
			break;		
		case "footer":
			flag = waitForElementVisibility(footer, waitTime);
			break;
		case "footerPrivacyPolicy":
			flag = waitForElementVisibility(footerPrivacyPolicy, waitTime);
			break;
		case "footerTermsOfUse":
			flag = waitForElementVisibility(footerTermsOfUse, waitTime);
			break;
		case "footerSiteMap":
			flag = waitForElementVisibility(footerSiteMap, waitTime);
			break;	
		case "applyWithThisDevice":
			flag = waitForElementVisibility(renewWithThisDevice, waitTime);
			break;
		case "ForReservation":
			flag = waitForElementVisibility(ForReservation, waitTime);
			break;


			
		
		}

		if (flag) {
			System.out.println(message + " - exists");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");
			
		} else {

			System.out.println(message + " - do not exist");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should is visible on the Application","'"+element+"' is not visbile on the page","Failed");
			
		}

		return flag;
	}

	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "next":
			flag = waitForElementClickable(next, waitTime);
			break;
			
		case "Link_Mobile":
			flag = waitForElementClickable(Link_Mobile, waitTime);
			break;
		case "Link_HomeInternet":
			flag = waitForElementClickable(Link_HomeInternet, waitTime);
			break;
		case "Link_Deals":
			flag = waitForElementClickable(Link_Deals, waitTime);
			break;
		case "Link_QuickLinks":
			flag = waitForElementClickable(Link_QuickLinks, waitTime);
			break;
		case "Link_SimOnly":
			flag = waitForElementClickable(Link_SimOnly, waitTime);
			break;
		case "Link_PlanWithDevice":
			flag = waitForElementClickable(Link_PlanWithDevice, waitTime);
			break;
		case "Link_Renewal":
			flag = waitForElementClickable(Link_Renewal, waitTime);
			break;
		case "Link_SwitchtoGlobe":
			flag = waitForElementClickable(Link_SwitchtoGlobe, waitTime);
			break;
		case "next2":
			flag = waitForElementClickable(next2, waitTime);
			break;
		case "privacyAccept":
			flag = waitForElementClickable(privacyAccept, waitTime);
			break;
		case "link_LogoGlobe":
			flag = waitForElementClickable(link_LogoGlobe, waitTime);
			break;
		case "mobilepostpaid":
			flag = waitForElementClickable(mobilepostpaid, waitTime);
			break;
		case "link_Apply":
			flag = waitForElementClickable(link_Apply, waitTime);
			break;
		case "link_Renew":
			flag = waitForElementClickable(link_Renew, waitTime);
			break;
		case "link_Switch":
			flag = waitForElementClickable(link_Switch, waitTime);
			break;
		case "link_MenuBuy":
			flag = waitForElementClickable(link_MenuBuy, waitTime);
			break;
		case "CartIcon":
			flag = waitForElementClickable(CartIcon, waitTime);
			break;
		case "link_TrackMyOrder":
			flag = waitForElementClickable(link_TrackMyOrder, waitTime);
			break;
		case "link_Help":
			flag = waitForElementClickable(link_Help, waitTime);
			break;
		case "link_MobilePostpaid":
			flag = waitForElementClickable(link_MobilePostpaid, waitTime);
			break;
		case "link_ViewAllDevices":
			flag = waitForElementClickable(link_ViewAllDevices, waitTime);
			break;
		
		case "acccordionButton1":
			flag = waitForElementClickable(acccordionButton1, waitTime);
			break;
		case "acccordionButton2":
			flag = waitForElementClickable(acccordionButton2, waitTime);
			break;
		case "acccordionButton3":
			flag = waitForElementClickable(acccordionButton3, waitTime);
			break;
		case "acccordionButton4":
			flag = waitForElementClickable(acccordionButton4, waitTime);
			break;
		case "acccordionButton5":
			flag = waitForElementClickable(acccordionButton5, waitTime);
			break;
		case "acccordionButton6":
			flag = waitForElementClickable(acccordionButton6, waitTime);
			break;
		case "gplanWithDevice":
			flag = waitForElementClickable(gplanWithDevice, waitTime);
			break;
		case "gplanWithGCash":
			flag = waitForElementClickable(gplanWithGCash, waitTime);
			break;
		case "gplanPlusSIMOnly":
			flag = waitForElementClickable(gplanPlusSIMOnly, waitTime);
			break;
		case "gplanSIMOnlyAllData":
			flag = waitForElementClickable(gplanSIMOnlyAllData, waitTime);
			break;
		case "previousicon":
			flag = waitForElementClickable(previousicon, waitTime);
			break;
		case "owlnext":
			flag = waitForElementClickable(owlnext, waitTime);
			break;
		case "Disc_starterbtn":
			flag = waitForElementClickable(Disc_starterbtn, waitTime);
			break;
		case "previousiconsimonly":
			flag = waitForElementClickable(previousiconsimonly, waitTime);
			break;
		case "Nexticon":
			flag = waitForElementClickable(Nexticon, waitTime);
			break;		
		case "GPlanPlusSimOnly999":
			flag = waitForElementClickable(GPlanPlusSimOnly999, waitTime);
			break;			
		case "GPlan1499withDevice":
			flag = waitForElementClickable(GPlan1499withDevice, waitTime);
			break;			
		case "DiscoverExtra":
			flag = waitForElementClickable(DiscoverExtra, waitTime);
			break;	
		case "gcash":
			flag = waitForElementClickable(gcash, waitTime);
			break;	

			//3 click caurosels


		case "alldata":
			flag = waitForElementClickable(alldata, waitTime);
			break;
		case "alldata1999":
			flag = waitForElementClickable(alldata1999, waitTime);
			break;		
		case "Gplan599withGash":
			flag = waitForElementClickable(Gplan599withGash, waitTime);
			break;	
		case "Getthisplan":
			flag = waitForElementClickable(Getthisplan, waitTime);
			break;

		case "GetthisplanWithGcash599":
			flag = waitForElementClickable(GetthisplanWithGcash599, waitTime);
			break;


		case "Gplan999simonly":
			flag = waitForElementClickable(Gplan999simonly, waitTime);
			break;

		case "selectGplansimonly999":
			flag = waitForElementClickable(selectGplansimonly999, waitTime);
			break;	

		case "GetthisplanSimonly999":
			flag = waitForElementClickable(GetthisplanSimonly999, waitTime);
			break;	
			
		case "Gplan14999Price":
			flag = waitForElementClickable(Gplan14999Price, waitTime);
			break;
		case "GetthisplanGplan14999Price":
			flag = waitForElementClickable(GetthisplanGplan14999Price, waitTime);
			break;
		
		case "BackToTop_Button":
			flag = waitForElementClickable(BackToTop_Button, waitTime);
			break;	
		case "Colour_Variant":
			flag = waitForElementClickable(Colour_Variant, waitTime);
			break;
		case "Color_Var":
			flag = waitForElementClickable(Color_Var, waitTime);
			break;	
		case "search_field":
			flag = waitForElementClickable(search_field, waitTime);
			break;	
		case "searched_Device":
			flag = waitForElementClickable(searched_Device, waitTime);
			break;
		case "X_Button":
			flag = waitForElementClickable(searched_Device, waitTime);
			break;	
		case "sortDropDown":
			flag = waitForElementClickable(sortDropDown, waitTime);
			break;	
		case "priceHightoLow":
			flag = waitForElementClickable(priceHightoLow, waitTime);
			break;	
		case "priceLowtoHigh":
			flag = waitForElementClickable(priceLowtoHigh, waitTime);
			break;	
		case "featuredProducts":
			flag = waitForElementClickable(featuredProducts, waitTime);
			break;	
		case "collapse_Filter":
			flag = waitForElementClickable(collapse_Filter, waitTime);
			break;	
		case "productType":
			flag = waitForElementClickable(productType, waitTime);
			break;
		case "planValue":
			flag = waitForElementClickable(planValue, waitTime);
			break;
		case "brand":
			flag = waitForElementClickable(brand, waitTime);
			break;
		case "clear_filters_Disabled":
			flag = waitForElementClickable(clear_filters_Disabled, waitTime);
			break;
		case "clear_filters":
			flag = waitForElementClickable(clear_filters, waitTime);
			break;	
		case "PlanValue999_radioButton":
			flag = waitForElementClickable(PlanValue999_radioButton, waitTime);
			break;
		case "huaweibrand_radioButton":
			flag = waitForElementClickable(huaweibrand_radioButton, waitTime);
			break;	
		case "applyFilter_Button":
			flag = waitForElementClickable(applyFilter_Button, waitTime);
			break;
		case "planWithDevice":
			flag = waitForElementClickable(planWithDevice, waitTime);
			break;	
		case "renewwithThisDevice":
			flag = waitForElementClickable(renewWithThisDevice, waitTime);
			break;		
		case "selectAnotherDevice":
			flag = waitForElementClickable(selectAnotherDevice, waitTime);
			break;			
		case "link_MobilePostPaid":
			flag = waitForElementClickable(link_MobilePostPaid, waitTime);
			break;			
		case "applyWithThisDevice":
			flag = waitForElementClickable(renewWithThisDevice, waitTime);
			break;	
			
		case "PlanValue_radioButton":
			flag = waitForElementClickable(PlanValue_radioButton, waitTime);
			break;
		case "brand_radioButton":
			flag = waitForElementClickable(brand_radioButton, waitTime);
			break;	
			
		case "banner1continueplan":
			flag = waitForElementClickable(banner1continueplan, waitTime);
			break;	
		case "prev2":
			flag = waitForElementClickable(prev2, waitTime);
			break;
	
		case "search_field_CSTM":
			flag = waitForElementClickable(search_field_CSTM, waitTime);
			break;
			
		case "ForReservation":
			flag = waitForElementVisibility(ForReservation, waitTime);
			break;
	
	
					


			
			
		

		}

		return flag;
	}
	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void moveToElement(String element) throws Exception {

		WebElement ele = null;

		switch (element) {
		case "link_Apply":
			ele = DriverManager.getDriver().findElement(link_Apply);
			break;
			
		case "Link_Mobile":
			ele = DriverManager.getDriver().findElement(Link_Mobile);
			break;
		case "Link_HomeInternet":
			ele = DriverManager.getDriver().findElement(Link_HomeInternet);
			break;
		case "Link_BUYLoad":
			ele = DriverManager.getDriver().findElement(Link_BUYLoad);
			break;
		case "Link_QuickLinks":
			ele = DriverManager.getDriver().findElement(Link_QuickLinks);
			break;
		case "Link_SwitchtoGlobe":
			ele = DriverManager.getDriver().findElement(Link_SwitchtoGlobe);
			break;
		case "Link_Deals":
			ele = DriverManager.getDriver().findElement(Link_Deals);
			break;
			
		case "link_Renew":
			ele = DriverManager.getDriver().findElement(link_Renew);
			break;
		case"renewdevice":
			ele = DriverManager.getDriver().findElement(renewdevice);
			break;
		case "newplan":
			ele = DriverManager.getDriver().findElement(newplan);
			break;
		case "mobilepostpaid":
			ele = DriverManager.getDriver().findElement(mobilepostpaid);
			break;
		case "link_MenuBuy":
			ele = DriverManager.getDriver().findElement(link_MenuBuy);
			break;
		case "SwitchOpt":
			ele = DriverManager.getDriver().findElement(link_Switch);
			break;
		
		case "link_Renewal":
			ele = DriverManager.getDriver().findElement(link_Renew);
			break;
		case "link_MobilePostPaid":
			ele = DriverManager.getDriver().findElement(link_MobilePostPaid);
			break;
		case "link_ViewAllDevices":
			ele = DriverManager.getDriver().findElement(link_ViewAllDevices);
			break;
			
		
		case "Disc_starterbtn":
			ele = DriverManager.getDriver().findElement(Disc_starterbtn);
			break;
		case "ZoomOption":
			ele = DriverManager.getDriver().findElement(ZoomOption);
			break;
		case "banner2showplan2":
			ele = DriverManager.getDriver().findElement(banner2showplan2);
			break;
		case "banner2showplan":
			ele = DriverManager.getDriver().findElement(banner2showplan);
			break;

		case "Nexticons":
			ele = DriverManager.getDriver().findElement(Nexticons);
			break;

		case "Prevsicon":
			ele = DriverManager.getDriver().findElement(Prevsicon);
			break;
		case "gcash":
			ele = DriverManager.getDriver().findElement(gcash);
			break;

			//			All data 3clicks	
		case "alldata":
			ele = DriverManager.getDriver().findElement(alldata);
			break;
		case "alldata1999":
			ele = DriverManager.getDriver().findElement(alldata1999);
			break;	
		case "Gplan599withGash":
			ele = DriverManager.getDriver().findElement(Gplan599withGash);
			break;
		case "Getthisplan":
			ele = DriverManager.getDriver().findElement(Getthisplan);
			break;

		case "GetthisplanWithGcash599":
			ele = DriverManager.getDriver().findElement(GetthisplanWithGcash599);
			break;

		case "Gplan999simonly":
			ele = DriverManager.getDriver().findElement(Gplan999simonly);
			break;

		case "selectGplansimonly999":
			ele = DriverManager.getDriver().findElement(selectGplansimonly999);
			break;
		case "GetthisplanSimonly999":
			ele = DriverManager.getDriver().findElement(GetthisplanSimonly999);
			break;
			
		case "Gplan14999Price":
			ele = DriverManager.getDriver().findElement(Gplan14999Price);
			break;
			
		case "GetthisplanGplan14999Price":
			ele = DriverManager.getDriver().findElement(GetthisplanGplan14999Price);
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
	/********************************************************************************************************************************/
	public void scroll_vertical(int y_Axis) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0," + y_Axis + ")", "");
	}
	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {
			
			case "privacyAccept":
				get_privacyAccept().click();
				break;
				
			case "MenuIcon_MobileView":
				get_MenuIcon_MobileView().click();
				break;
			case "Deals_MobileView":
				get_Deals_MobileView().click();
				break;
			case "QuickLinks_MobileView":
				get_QuickLinks_MobileView().click();
				break;
			case "ExitMenu_MobileView":
				get_ExitMenu_MobileView().click();
				break;
				
			case "Link_Mobile":
				get_Link_Mobile().click();
				break;		
			case "Link_HomeInternet":
				get_Link_HomeInternet().click();
				break;
			case "Link_Deals":
				get_Link_Deals().click();
				break;
			case "Link_QuickLinks":
				get_Link_QuickLinks().click();
				break;
			case "Link_SimOnly":
				get_Link_SimOnly().click();
				break;
			case "Link_SwitchtoGlobe":
				get_Link_SwitchtoGlobe().click();
				break;			
			case "Link_PlanWithDevice":
				get_Link_PlanWithDevice().click();
				break;
			case "Link_Renewal":
				get_Link_Renewal().click();
				break;
				
				
			case "MobileExpandOption":
				get_MobileExpandOption_MobileView().click();
				break;
			case "QuickLink_MobileView":
				get_QuickLink_MobileView().click();
				break;
			case "QuickLinksDropdown_MobileView":
				get_QuickLinksDropdown_MobileView().click();
				break;
			case "MobileExpandOptionRenewal_MobileView":
				get_MobileExpandOptionRenewal_MobileView().click();
				break;
			case "HomeInternet_MobileView":
				get_HomeInternet_MobileView().click();
				break;
				
				
					
				
			case "GPlan599":
				get_GPlan599().click();
				break;
			case "link_LogoGlobe":
				get_link_LogoGlobe().click();
				break;
			case "link_Apply":
				get_link_Apply().click();
				break;
			case "GCash":
				get_GCash().click();
				break;
			case "next":
				get_next().click();
				break;
			
				
			case "GetCode":
				get_GetCode().click();
				break;
			case "SubmitBtn":
				get_SubmitBtn().click();
				break;
			case "GCash2499Plan":
				get_GCash2499Plan().click();
				break;
			case "GPlan1499":
				get_GPlan1499().click();
				break;
			
			case "link_Renew":
				get_link_Renew().click();
				break;
			case "link_Switch":
				get_link_Switch().click();
				break;
			case "link_MenuBuy":
				get_link_MenuBuy().click();
				break;
			case "CartIcon":
				get_CartIcon().click();
				break;
			case "link_TrackMyOrder":
				get_link_TrackMyOrder().click();
				break;
			case "link_Help":
				get_link_Help().click();
				break;
			case "link_MobilePostpaid":
				get_link_MobilePostpaid().click();
				break;
			case "link_ViewAllDevices":
				get_link_ViewAllDevices().click();
				break;
			case "link_CheckYourEligibility":
				get_link_CheckYourEligibility().click();
				break;
			case "acccordionButton1":
				get_acccordionButton1().click();
				break;
			case "acccordionButton2":
				get_acccordionButton2().click();
				break;
			case "acccordionButton3":
				get_acccordionButton3().click();
				break;
			case "acccordionButton4":
				get_acccordionButton4().click();
				break;
			case "acccordionButton5":
				get_acccordionButton5().click();
				break;
			case "acccordionButton6":
				get_acccordionButton6().click();
				break;
			case "gplanWithDevice":
				get_gplanWithDevice().click();
				break;
			case "gplanWithGCash":
				get_gplanWithGCash().click();
				break;
			case "gplanPlusSIMOnly":
				get_gplanPlusSIMOnly().click();
				break;
			case "gplanSIMOnlyAllData":
				get_gplanSIMOnlyAllData().click();
				break;
			case "previousicon":
				get_previousicon().click();
				break;
			case "owlnext":
				get_owlnext().click();
				break;
			case "Agree":
				get_Agree().click();
				break;
//			case "link_MobilePostPaid":
//				get_link_MobilePostPaid().click();
//				break;		
			case "Select":
				get_Select().click();
				break;
			case "StarterImg":
				get_StarterImg().click();
				break;
			case "MobilePostPaid":
				get_MobilePostPaid().click();
				break;
			case "GSSurfAdd99":
				get_GSSurfAdd99().click();
				break;
			case "SeeMyNewPlan":
				get_SeeMyNewPlan().click();
				break;
			case "SelectPlan":
				get_SelectPlan().click();
				break;

			case "EasyRoam":
				get_EasyRoam().click();
				break;
			case "AmazonPrime":
				get_AmazonPrime().click();
				break;
			case "ViuPremium":
				get_ViuPremium().click();
				break;
			case "SpotifyPremium":
				get_SpotifyPremium().click();
				break;
			case "MyDuo":
				get_MyDuo().click();
				break;


			case "ZoomIcon":
				get_ZoomIcon().click();
				break;
			case "RenewWithThisDevice":
				get_RenewWithThisDevice().click();
				break;
			


			case "ViewAllDevices":
				get_ViewAllDevices().click();
				break;
			case "Radio_btn1499":
				get_Radio_btn1499().click();
				break;
			case "ApplyFilter":
				get_ApplyFilter().click();
				break;


			case "PlanValueDP":
				get_PlanValueDP().click();
				break;
			case "CloseIcon":
				get_CloseIcon().click();
				break;
			case "NextBtn":
				get_NextBtn().click();
				break;
			case "GPlanDevice1499":
				get_GPlanDevice1499().click();
				break;
			case "Discover_Essential":
				get_Discover_Essential().click();
				break;
			case "Select_Customize":
				get_Select_Customize().click();
				break;
			case "ZoomOption":
				get_ZoomOption().click();
				break;


			case "Discover_starter":
				get_Discover_starter().click();
				break;

			case "getStarted999":
				get_getStarted999().click();
				break;
			case "ProceedwithMyPlan":
				get_ProceedwithMyPlan().click();
				break;
			case "tellmemore":
				get_tellmemore().click();
				break;
			case "GPlanPlusSimOnly999":
				get_GPlanPlusSimOnly999().click();
				break;
			case "GPlan1499withDevice":
				get_GPlan1499withDevice().click();
				break;
			case "WithDevice":
				get_WithDevice().click();
				break;	
			case "shoping_twohr":
				get_shoping_twohr().click();
				break;
			
			
			case "Nexticon":
				get_Nexticon().click();
				break;	
			case "previousiconsimonly":
				get_previousiconsimonly().click();
				break;	

			
			case "rarely":
				get_rarely().click();
				break;	
			case "occasionally":
				get_occasionally().click();
				break;
			case "sometimes":
				get_sometimes().click();
				break;
			case "always":
				get_always().click();
				break;
			case "shopping":
				get_shopping().click();
				break;
			case "social":
				get_social().click();
				break;
			case "videos":
				get_videos().click();
				break;
			case "music":
				get_music().click();
				break;
			case "work":
				get_work().click();
				break;
			case "games":
				get_games().click();
				break;
			case "Social_fourhrs":
				get_Social_fourhrs().click();
				break;
			case "Timespent":
				get_Timespent().click();
				break;
			case "Dataneeds":
				get_Dataneeds().click();
				break;
			case "TimeSpentValue":
				get_TimeSpentValue().click();
				break;
			case "DataNeedsValue":
				get_DataNeedsValue().click();
				break;
			case "Buildmyplan":
				get_Buildmyplan().click();
				break;
			case "GplanAlldata":
				get_GplanAlldata().click();
				break;
			case "gcash":
				get_gcash().click();
				break;
			case "Getthisplan":
				get_Getthisplan().click();
				break;
			case "GetthisplanWithGcash599":
				get_GetthisplanWithGcash599().click();
				break;

			case "GetthisplanSimonly999":
				get_GetthisplanSimonly999().click();
				break;
				
			case "GetthisplanGplan14999Price":
				get_GetthisplanGplan14999Price().click();
				break;
			
			case "link_MobilePostPaid":
				get_link_MobilePostPaid().click();
				break;
			
			case "BackToTop_Button":
				get_BackToTop_Button().click();
				break;
			case "Colour_Variant":
				get_Colour_Variant().click();
				break;
			case "search_field":
				get_search_field().click();
				break;
			case "auto_search":
				get_auto_search().click();
				break;	
			case "searched_Device":
				get_searched_Device().click();
				break;	
			case "X_Button":
				get_X_Button().click();
				break;	
			case "sortDropDown":
				get_sortDropDown().click();
				break;	
			case "priceHightoLow":
				get_priceHightoLow().click();
				break;	
			case "priceLowtoHigh":
				get_priceLowtoHigh().click();
				break;	
			case "featuredProducts":
				get_featuredProducts().click();
				break;	
			case "collapse_Filter":
				get_collapse_Filter().click();
				break;	
			case "productType":
				get_productType().click();
				break;	
			case "planValue":
				get_planValue().click();
				break;	
			case "brand":
				get_brand().click();
				break;	
			case "clear_filters_Disabled":
				get_clear_filters_Disabled().click();
				break;	
			case "clear_filters":
				get_clear_filters().click();
				break;	
			case "PlanValue999_radioButton":
				get_PlanValue999_radioButton().click();
				break;	
			case "huaweibrand_radioButton":
				get_huaweibrand_radioButton().click();
				break;	
			case "applyFilter_Button":
				get_applyFilter_Button().click();
				break;	
			case "planWithDevice":
				get_planWithDevice().click();
				break;	
			case "renewwithThisDevice":
				get_renewWithThisDevice().click();
				break;
			case "Smart_Phone":
				get_Smart_Phone().click();
				break;
			case "watch":
				get_watch().click();
				break;	
			case "Brand_Oppo":
				get_Brand_Oppo().click();
				break;						
			case "applyWithThisDevice":
				get_renewWithThisDevice().click();
				break;				
			case "PlanValue_radioButton":
				get_PlanValue_radioButton().click();
				break;	
			case "brand_radioButton":
				get_brand_radioButton().click();
				break;			
			case "Tablet":
				get_Tablet().click();
				break;						
			case "search_field_CSTM":
				get_search_field_CSTM().click();
				break;
			
			
			case "ForReservation":
				get_ForReservation().click();
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
	public void enterText(String type, String ele, String value) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


			switch (ele) {	
			 case "search_field":
				 get_search_field().clear();
				get_search_field().sendKeys(value);;
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
	public void jsClick(String message, String element) throws Exception {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			
			case "QuickLink_MobileView":
			      jse.executeScript("arguments[0].click();", get_QuickLink_MobileView());		
			      break;
			      
			case "QuickLinksDropdown_MobileView":
			      jse.executeScript("arguments[0].click();", get_QuickLinksDropdown_MobileView());		
			      break;
			case "HomeInternet_MobileView":
			      jse.executeScript("arguments[0].click();", get_HomeInternet_MobileView());		
			      break;
			case "chkbx_acceptAll":
			      jse.executeScript("arguments[0].click();", get_chkbx_acceptAll());		
			      break;
			case "Link_Mobile":
				jse.executeScript("arguments[0].click();", get_Link_Mobile());
				break;		
			
			case "applyFilter_Button":
			      jse.executeScript("arguments[0].click();", get_applyFilter_Button());		
			      break;
			case "link_ViewAllDevices":
				jse.executeScript("arguments[0].click();", get_link_ViewAllDevices());		
			      break;
			case "next2":
				jse.executeScript("arguments[0].click();", get_next2());		
			      break;
			case "privacyAccept":
				jse.executeScript("arguments[0].click();", get_privacyAccept());		
			      break;
			case "sortDropDown":
				jse.executeScript("arguments[0].click();", get_sortDropDown());		
			      break;
			case "TokenSubmit":
				jse.executeScript("arguments[0].click();", get_TokenSubmit());		
			      break;
				
			case "X_Button":
				 jse.executeScript("arguments[0].click();", get_X_Button());		
			      break;
			case "renewdevice":
				jse.executeScript("arguments[0].click();", get_renewdevice());		
			      break;
			case "prev2":
				jse.executeScript("arguments[0].click();", get_prev2());		
			      break;
			case "next":
				 jse.executeScript("arguments[0].click();", get_next());		
			      break;
			case "prev":
				jse.executeScript("arguments[0].click();", get_prev());		
			      break;
			      
			case "newplan":
				 jse.executeScript("arguments[0].click();", get_newplan());		
			      break;
			case "mobilepostpaid":
				jse.executeScript("arguments[0].click();", get_mobilepostpaid());		
			      break;
			case "link_Renew":
				 jse.executeScript("arguments[0].click();", get_link_Renew());		
			      break;
			case "huaweibrand_radioButton":
			      jse.executeScript("arguments[0].click();", get_huaweibrand_radioButton());		
			      break;   
			case "ebike_radioButton":
			      jse.executeScript("arguments[0].click();", get_ebike_radioButton());		
			      break;     
			case "productType":
			      jse.executeScript("arguments[0].click();", get_productType());		
			      break;  
			case "magnifying_glass":
			      jse.executeScript("arguments[0].click();", get_magnifying_glass());		
			      break;   
			case "renewWithThisDevice":
			      jse.executeScript("arguments[0].click();", get_renewWithThisDevice());		
			      break;  
			case "PlanValue999_radioButton":
			      jse.executeScript("arguments[0].click();", get_PlanValue999_radioButton());		
			      break;
			case "Smart_Phone":
			      jse.executeScript("arguments[0].click();", get_Smart_Phone());		
			      break;   
			case "watch":
			      jse.executeScript("arguments[0].click();", get_watch());		
			      break;   
			case "brand":
			      jse.executeScript("arguments[0].click();", get_brand());		
			      break; 
			case "Brand_Oppo":
			      jse.executeScript("arguments[0].click();", get_Brand_Oppo());		
			      break; 
			case "Color_Var":
			      jse.executeScript("arguments[0].click();", get_Color_Var());		
			      break;       
			case "Feature_Products":
			      jse.executeScript("arguments[0].click();", get_Feature_Products());		
			      break; 
			case "New_Radio":
			      jse.executeScript("arguments[0].click();", get_New_Radio());		
			      break;
			case "BestSeller_Radio":
			      jse.executeScript("arguments[0].click();", get_BestSeller_Radio());		
			      break;
			case "Vocher_Radio":
			      jse.executeScript("arguments[0].click();", get_Vocher_Radio());		
			      break;   
			case "electricStudio_radioButton":
			      jse.executeScript("arguments[0].click();", get_electricStudio_radioButton());		
			      break;  
			case "Nokia_Radio":
			      jse.executeScript("arguments[0].click();", get_Nokia_Radio());		
			      break;      
			case "planValue":
			      jse.executeScript("arguments[0].click();", get_planValue());		
			      break;  
			case "clear_filters":
			      jse.executeScript("arguments[0].click();", get_clear_filters());		
			      break;     
			case "Plan2499":
			      jse.executeScript("arguments[0].click();", get_Plan2499());		
			      break; 
			case "BackToTop_Button":
			      jse.executeScript("arguments[0].click();", get_BackToTop_Button());		
			      break; 
			case "magnifybutton":
			      jse.executeScript("arguments[0].click();", get_magnifybutton());		
			      break; 
			case "auto_search":
			      jse.executeScript("arguments[0].click();", get_auto_search());		
			      break;
			case "applebrand_radioButton":
			      jse.executeScript("arguments[0].click();", get_applebrand_radioButton());		
			      break;
			case "collapse_Filter":
		         jse.executeScript("arguments[0].click();", get_collapse_Filter());		
		         break;
			
			case "brand_radioButton":
			      jse.executeScript("arguments[0].click();", get_brand_radioButton());		
			      break;   
			 
			case "PlanValue_radioButton":
			      jse.executeScript("arguments[0].click();", get_PlanValue_radioButton());		
			      break;
			 
			case "Tablet":
			      jse.executeScript("arguments[0].click();", get_Tablet());		
			      break;			    
			
			case "ForReservationButton":
		         jse.executeScript("arguments[0].click();", get_ForReservationButton());		
		         break;
			case "continueCTBbutton":
				jse.executeScript("arguments[0].click();", get_banner1continueplan());		
		         break;
			case "recomendedCTBbutton":
				jse.executeScript("arguments[0].click();", get_banner1checrecomendedkplan());		
		         break;
			case "EligibulityCTBbutton":
				jse.executeScript("arguments[0].click();", get_link_CheckYourEligibility());		
		         break;
			case "alldata":
				jse.executeScript("arguments[0].click();", get_alldata());		
		         break;
			case "gcash":
				jse.executeScript("arguments[0].click();", get_gcash());		
		         break;
			case "withdevice":
				jse.executeScript("arguments[0].click();", get_WithDevice());		
		         break;
			case "GetCode":
				jse.executeScript("arguments[0].click();", get_GetCode());		
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
