package com.pages.Acqui;

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
import org.openqa.selenium.interactions.SendKeysAction;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.BasePage;
import junit.framework.Assert;
import utility.Generic;

public class AcquiPDP_page extends BasePage {

	private static final By Checkbox1 = null;

	private static final By Chockbox2 = null;

	private static final By Chockbox3 = null;

	private static final By Chockbox4 = null;

	private static final By Chockbox5 = null;

	static File file;

	By BasicBanner1 = By.xpath("//h2[contains(text(),'MOVE BEYOND THE AVERAGE')]");
	By BasicBanner2 = By.xpath("//h2[contains(text(), ' is boring')]");
	By BasicBanner3 = By.xpath("//h2[contains(text(),'All fun')]");
	By BasicBanner4 = By.xpath("//h2[contains(text(),'s simple pleasures')]");
	By BasicBanner5 = By.xpath("//h2[contains(text(),'Entertainment on the go')]");
	By BasicBanner6 = By.xpath("//h2[contains(text(),'Add to cart to your')]");
	By BasicBanner7 = By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
	By BasicBanner8 = By.xpath("//h2[contains(text(),'Do you need more data?')]");
	By BasicBanner9 = By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");
	By link_Apply = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Apply']");


	By Planname_SimOnly599 = By.xpath("//strong[contains(text(),'GPlan SIM-Only 599')]");
	By Planname_SimOnly599_Price = By.xpath("//span[contains(text(),'â‚± 599.00')]");

	By GSSurf99addon = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");
	By Monthlybill_amountSimOnly999_GS99addon = By.xpath("//span[contains(text(),'â‚± 1,098.00')]");
	By Totalsubsandaddons_amountSimOnly999_GS99addon = By.xpath("//span[contains(text(),'â‚± 99.00')]");
	By Monthlypayment_amountSimOnly999_GS99addon = By.xpath("(//strong[contains(text(),'â‚± 1,098.00/mo.')])[2]");
	By Contractduration_Value = By.xpath("//span[contains(text(),'mos.')]");
	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	//Discovery Starter page
	By Disc_Basicbtn = By.xpath("//button[text()=' Discover Basic ']");
	By Disc_starterbtn = By.xpath("//button[contains(text(),' Discover Starter ')]");
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
	By searchfield=By.xpath("//input[@placeholder='Search by device, brand']");
	
	By discoveryAlways = By.xpath("//button[text()=' Discover Always On ']");


	//h2[contains(text(),'Ã¢â‚¬Å“Let me Google that!Ã¢â‚¬ï¿½')]");
	By starterbanner5 = By.xpath("//h2[contains(text(),'Reframe your lifestyle')]");
	By starterbanner6 = By.xpath("//strong[text() ='Stay connected']");
	By starterbanner7 = By.xpath("//h2[contains(text(),'Do you need more data?')]");
	By starterbanner8 = By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");


	By My_Duo = By.xpath("//div[text()='MyDuo']//following::span[1]");




	//	Discoverysc2 banners validation
	By bannervalidation1=By.xpath("//span[contains(text(),'Youâ€™ve got WiFi at work. Youâ€™ve got WiFi at home. Now get a plan is for the moments in between. The Starter Plan helps you stay connected when it matters!')]");



	//FTA_1-----PDP page for withdevice599
	By Price_599 = By.xpath("(//span[contains(text(),'599')])[1]");
	By Color_header = By.xpath("//span[contains(text(),'Color or Finish')]");
	By Capacity_header = By.xpath("//span[contains(text(),'Capacity')]");
	By Contractduration_header = By.xpath("//span[contains(text(),'Contract duration')]");
	By Banner = By.xpath("//div[@class='getaplan-with-device-image-wrapper']");
	//Breakdown page
	By Allaccess_data = By.xpath("//span[contains(text(),'All-access data')]");
	By Gowifi_access = By.xpath("//span[contains(text(),'GoWifi access')]");
	By List_ul = By.xpath("//ul[@class='list-ul']");
	By Monthlycashout_header = By.xpath("//div[@class='monthly-with-onetime-cashout']");
	By Plan_name = By.xpath("(//div[@class='gplan-with-device'])[3]");
	By Plan_price = By.xpath("(//div[@class='plan-msf-price'])");
	By Addonsheader = By.xpath("//span[contains(text(),'Subscriptions and Add-ons')]");
	By Monthlybillheader = By.xpath("(//span[contains(text(),'Monthly Bill')])");
	By Device=By.xpath("//div[@class='go_device-wrapper-footer go_plan-builder-sticky ng-star-inserted']//img");
	By Devicename=By.xpath("//span[@class='go_text-h3-smallest-default']");
	By Planname1=By.xpath("//strong[@class='go_text-preamble']");
	By Devicedetails=By.xpath("");
	By Checkbox=By.xpath("");
	By Checkbox2=By.xpath("");
	By Checkbox3=By.xpath("");
	By ProccedwithMyplan=By.xpath("");
	By GplanWithDevicePlanName=By.xpath("(//strong[@class='go_text-preamble'])[1]");
	By GetStartedWithDeviceGplan599=By.xpath("//div[@class='starterplanwithdevice']//following::a[@class='geststarted-anchortag'][1]");




	By Banner1 = By.xpath("//div[@class='getaplan-with-device-image']");
	By Planname = By.xpath("//strong[contains(text(),'GPlan 599 with Device')]");
	By Plan_amount = By.xpath("//span[contains(text(),'â‚± 599.00')]");
	By Subsandaddonheader = By.xpath("//span[contains(text(),'Subscriptions and Addâ€‘ons')]");
	By MyDuoaddon = By.xpath("(//div[contains(text(),'MySuperDuo')])[2]");
	By AmazonAddon = By.xpath("(//div[contains(text(),'Amazon Prime Video')])[2]");
	By SURF=By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");
	By mysuperDuoAddon=By.xpath("(//div[contains(text(),'MySuperDuo')])[2]");


	By Totalsubsandaddons = By.xpath("//strong[contains(text(),'Total subscriptions and addâ€‘ons')]");
	By Totalsubsandaddons_amont = By.xpath("//span[contains(text(),'â‚± 848.00')]");
	By Monthlybill_header = By.xpath("//strong[contains(text(),'Monthly bill, subscriptions, and addâ€‘ons')]");
	By Monthlybill_amount = By.xpath("//span[contains(text(),'â‚± 1,447.00')]");
	By Monthly_payment = By.xpath("(//span[text()='Monthly payment'])[2]");
	//li[@class='go_footer-total-row']//span[text()='Monthly payment']");
	By Monthlypayment_amount = By.xpath("//strong[contains(text(),'â‚± 1,447.00/mo.')]");
	By inputmoblienum = By.xpath("//input[@id='go_plan-breakdown-number']");
	By proceedbtn1 = By.xpath("(//button[contains(text(),'Proceed')])[1]");
	By Breakdown_Mobilenum  = By.xpath("//span[@class='go_text-preamble-small']");
	By Breakdown_proceedbutton = By.xpath("//button[contains(text(),'Proceed with my plan')]");
	
	//Gplanwith_Gcash599	
	By gcashverifiedtext = By.xpath("//div[@class='gcash-verify-text']");
	By gcashcredits = By.xpath("//div[@class='d-flex flex-row g-cash-block']");
	//Breakdownpage
	By Breakdown_Gcashcredits = By.xpath("(//span[contains(text(),'GCash Credits')])[2]");
	By Plannamegcash = By.xpath("//div[@class='go_text-preamble']");
	By Gcashamount = By.xpath("(//span[contains(text(),'â‚± 599.00')])");		
	By Breakdownn_Viupremium = By.xpath("(//div[contains(text(),'Viu Premium')])[2]");
	By Breakdownn_Spotifypremium = By.xpath("(//div[contains(text(),'Spotify Premium')])[2]");
	By Breakdownn_EasyRoam = By.xpath("(//div[contains(text(),'Easy Roam')])[2]");
	By Breakdownn_Gocallid = By.xpath("(//div[contains(text(),'GOCALLIDD 199')])[2]");
	By Breakdownn_Gsaddsurf = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");

	By Addonsamount = By.xpath("//span[contains(text(),'â‚± 1,275.00')]");
	By Monthlyamount = By.xpath("//span[contains(text(),'â‚± 1,874.00')]");
	By Gcash_Monthlypayment_amount = By.xpath("(//strong[contains(text(),'â‚± 1,874.00/mo.')])[2]");


	//Gplanwithdevice2499

	By PlannameGplanwithdevice = By.xpath("//div[@class='GPlan 2499 with Device']");
	By Gplanwithdeviceamount = By.xpath("(//span[contains(text(),'â‚± 2,499.00')])");

	By Selecteddevice = By.xpath("(//strong[@class='go_text-preamble'])[2])");
	By Selecteddevice_amount = By.xpath("(//span[@class='go_text-preamble-small-semibold'])[2])");
	By GplanwithdeviceMonthlyamount = By.xpath("//span[contains(text(),'â‚± 3,774.00/mo.')]");




	//Addons
	By Data_addon = By.xpath("//div[contains(text(),' Do you use lots of data? ')]");


	By movie_addon = By.xpath("//div[contains(text(),' Do you love watching shows and movies? ')]");


	By message_addon = By.xpath("//div[contains(text(),' Prefer talking over messaging? ')]");


	By lifestyle_addon = By.xpath("//div[contains(text(),' Are you all about the jet-setting lifestyle? ')]");



	//span[@class='go_text-preamble-small']");

	By Monthlybill = By.xpath("//div[@class='monthlybill-amount']");
	By Viewplanbreakdwn = By.xpath("//span[contains(text(),'View Plan Breakdown')]");
	By dropdown_Planbreakdwn = By.xpath("//div[@class='hide-tab-content-image']");
	By Reviewmyplan = By.xpath("//div[contains(text(),'Review my plan')]");
	By Dragbutton = By.xpath("//div[@class='go_sticky-footer-drag-arrow']");
	By CarouselDevicePrevBtn = By.xpath("(//div[@class='owl-prev'])[2]");
	By CarouselDeviceNextBtn = By.xpath("(//div[@class='owl-next'])[2]");
	By NextArrow=By.xpath("(//div[@class='owl-next'])[1]");
	
	By PrevArrow=By.xpath("(//div[@class='owl-prev'])[1]");

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
	By TotalSubsandAddons_amount = By.xpath("//span[contains(text(),'â‚± 1,424.00')]");
	
	By Inputmoblienum = By.xpath("//input[@id='go_plan-breakdown-number']");
	By ProceedBtn = By.xpath("(//button[contains(text(),'Proceed')])[1]");
	

	//ADA6
	By DiscooverPlus=By.xpath("//button[contains(text(),' Discover Plus ')]");
	By Bannerplus1=By.xpath("//h2[contains(text(),'Do more, Get more, Be more')]");
	By Bannerplus2=By.xpath("//h2[contains(text(),'Embrace life')]");
	By Bannerplus3=By.xpath("//h2[contains(text(),'Everything you need, plus more')]");
	By Bannerplus4=By.xpath("//span[contains(text(),'Power up your playlist with over 3,000 high quality songs and enjoy up to 180 minutes of non-stop music streaming every day.')]");
	By Bannerplus5=By.xpath("//h2[contains(text(),'a lifestyle')]");
	By Bannerplus6=By.xpath("//span[contains(text(),'Online shopping, made easy')]");
	By Bannerplus7=By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
	By Bannerplus8=By.xpath("//h2[contains(text(),'Do you need more data?')]");
	By Bannerplus9=By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");

	By Gplan1799=By.xpath("//span[contains(text(),'1799')]");
	
	By Banner2=By.xpath("//div[@class='getaplan-with-device-image']");

	By planename1799=By.xpath("//strong[contains(text(),'GPlan All Data 1799 ')]");
	By planeamount1799=By.xpath("//span[contains(text(),'â‚± 1,799.00')]");
	By totalpluse=By.xpath("//span[contains(text(),'â‚± 848.00')]");
	By monthlybillpay1799=By.xpath("//span[contains(text(),'â‚± 2,647.00')]");
	By monthlypaymentamount1799=By.xpath("(//strong[contains(text(),'â‚± 2,647.00/mo.')])[2]");
	By panenameDAF=By.xpath("//div[contains(text(),'GPlan All Data 1799 ')]");

	/***************ADA  1 STARTS HERE**********************/
	By GplanSimonlyPlanName = By.xpath("//span[text()='Starter']//following::strong[1]");
	By SimOnly599GOCALLIDD199 = By.xpath("(//div[contains(text(),'GOCALLIDD 199')])[2]");
	By Addonamount = By.xpath("//strong[text()='Total subscriptions and addâ€‘ons']//following::span[1]");
	By Monthyaddon = By.xpath("//strong[text()='Monthly bill, subscriptions, and addâ€‘ons']//following::span[1]");
	By Totalmontlypaymentsimonly= By.xpath("(//span[contains(text(),'Monthly payment')])[3]//following::strong");


	By showsAndMoviesToggle = By.xpath("(//span[@class='slider round'])[1]");
	By AmazonprimeVideoaddon599 = By.xpath("(//div[contains(text(),'Amazon Prime Video')])[1] |  (//div[contains(text(),'Prime Video')])[1]");
	By viupremiuum599 = 	By.xpath("(//div[contains(text(),' Viu Premium ')])[1]");
	By spotifypremiuum599 = 	By.xpath("(//div[contains(text(),'Spotify Premium')])[2]");
	By TalkingovermessageAddOn = By.xpath("(//span[@class='slider round'])[2]");
	By lifestylemessageAddOn = By.xpath("(//span[@class='slider round'])[3]");
	By YoutubeAddon = By.xpath("(//div[@class='entertainment-content-block ng-star-inserted'])[1]");
	By PdpSearchfield=By.xpath("//input[@placeholder='Search by device, brand']");
	By Esim=By.xpath("(//input[@type='radio'])[3]");




	/***************ADA  1 ENDS HERE**********************/	

	//ADA7
	By Discoveralwayson=By.xpath("//button[contains(text(),' Discover Always On ')]");
	By starterbanner1Always=By.xpath("//h2[contains(text(),'A NEW plan that can keep up with you')]");
	By starterbanner2Always=By.xpath("//h2[contains(text(),'A plan designed to keep up')]");
	By starterbanner3Always=By.xpath("//span[contains(text(),'Stay connected')]");
	By starterbanner4Always=By.xpath("//span[contains(text(),'HD. 4k. Prepare for impact.')]");
	By starterbanner5Always=By.xpath("//span[contains(text(),'Curate the soundtrack of your life ')]");
	By starterbanner6Always=By.xpath("//span[contains(text(),'Always on, always on call')]");
	By starterbanner7Always=By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
	By starterbanner8Always=By.xpath("//h2[contains(text(),'Do you need more data?')]");
	By starterbanner9Always=By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");


	By testDataDisplayedInBreakdown = By.xpath("//span[@class='go_text-preamble-small']");
	By nameOfThePlanInBreakDown = By.xpath("//strong[@class='go_text-preamble']");
	By contractDurationInBreakDown = By.xpath("//div[@class='go_contract-duration'] | //div[contains(text(),'Contract duration:')]");
	By allAccessDataInBreakDown = By.xpath("//span[text()='All-access data ']");
	By goWifiAccessInBreakDown = By.xpath("//span[text()=' GoWiFi access '] | //span[text()='  GoWiFi access ']");
	By call_TextInBreakdown = By.xpath("//span[text()=' Call and text ']");
	By planInclusionsInBreakdown = By.xpath("//span[text()='Plan inclusions']");
	By KonsultaMDInBreakdown = By.xpath("//li[text()=' Konsulta MD Free personal subscription']");
	By MySuperDuoInBreakdown = By.xpath("//div[text()='MySuperDuo']");
	By AmazonPrimeVideoInBreakdown = By.xpath("//div[text()='Amazon Prime Video']");
	By ViuPremiumInBreakdown = By.xpath("//div[text()='Viu Premium']");
	By EasyRoam = By.xpath("//div[text()='Easy Roam']");
	By GOCALLIDDInBreakdown = By.xpath("//div[text()='GOCALLIDD 199']");
	By GSAddSurfBreakdown = By.xpath("//div[text()='GS Add Surf 99']");

	By TotalSubs_AddonsInBreakdown = By.xpath("//strong[contains(text(), 'Total subscriptions and add')]//following-sibling::span");
	By MonthlyBillSub_AddonsInBreakdown = By.xpath("//strong[contains(text(), 'Monthly bill, subscriptions, and add')]//following-sibling::span");
	By MonthlyPaymentInBreakdown = By.xpath("(//span[text()='Monthly payment'])[2]//following-sibling::strong");


    By  GetSatartedBtn  =  By.xpath("//button[normalize-space(text())='Discover Value']//preceding::button[normalize-space(text())='Get Started']");


	By productGallery = By.xpath("//li[text()='Product Gallery']");
	By productDetails = By.xpath("//li[text()='Product Details']");
	By deviceNameinPDPage = By.xpath("//div[@class='go_text-h1']");
	By color_Finish = By.xpath("//div[@class='color-to-finish']");
	By capacity = By.xpath("//span[text()='Capacity']//following::span[1]");
	By contractDuration = By.xpath("//span[text()='Contract duration']//following::span[1]");
	By cashoutAmount = By.xpath("//span[text()='Cashout Amount']//following-sibling::span");
	By forReservationTag = By.xpath("//span[text()='For reservation']");
	By note = By.xpath("//span[contains(text(),'Note:')]");
	By wantToknowAboutGplans = By.xpath("//div[text()='Want to know more about our new GPlans?']");
	By discoverGplanBelow = By.xpath("//span[text()='Discover GPlans below.']");
	By planCard = By.xpath("//div[@class='go_carousel-list-wrapper go_no-overflow']");
	By reserveWithThisDevice = By.xpath("//button[text()=' Reserve this device ']");
	By selectAnotherDevice = By.xpath("//span[text()='Select another device']");
	By features = By.xpath("//a[text()='Features']");
	By promos = By.xpath("//a[text()='Promos']");
	By faqText1 = By.xpath("(//div[@class='item-text'])[1]");
	By faqText2 = By.xpath("(//div[@class='item-text'])[2]");
	By faqText3 = By.xpath("(//div[@class='item-text'])[3]");
	By faqText4 = By.xpath("(//div[@class='item-text'])[4]");
	By faqText5 = By.xpath("(//div[@class='item-text'])[5]");
	By faqText6 = By.xpath("(//div[@class='item-text'])[6]");
	By buildMyPlan = By.xpath("//div[text()=' Build my plan ']");


	/**************************************Main PDP Page****************************************************/
	By planbuilderPage = By.xpath("//h1[text()=' Acquisition Plan Builder - Device ']");
	By PDP_Device = By.xpath("//button[contains(text(),' Device ')]");
	By PDP_Gcash = By.xpath("//button[contains(text(),' GCash ')]");
	By PDP_Simonly = By.xpath("//button[contains(text(),' Sim-Only ')] | //button[text()=' Sim Only '] | //button[text()=' SIM-Only ']");
	By PDP_Alldata = By.xpath("//button[contains(text(),' All-Data ')]");
	By PlanCard = By.xpath("//div[@class='plan-card-list']");
	By Devicecarousel = By.xpath("//div[@class='pb-md-owl-carousel-wrapper ng-star-inserted']");
	By ViewAllDevicesLinkInPdPage = By.xpath("(//a[text()='View all devices'])[1]");
	By color_Finish1 = By.xpath("//span[text()='Color or Finish']");
	By Diff_Colors = By.xpath("//input[@name='inlineRadioOptions']");
	By capacity1 = By.xpath("//span[text()='Capacity']//following::div[4]//span");
	By contractDuration1 = By.xpath("//span[text()='Contract duration']//following::div[3]//span");
	By Preper_esim_PhysicalSim = By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");
	By esim = By.xpath("//span[text()='e-SIM']//parent::label//input");
	By physicalSim = By.xpath("//span[text()='Physical SIM card']//parent::label//input");
	By esimInReviewpage = By.xpath("//span[text()=' e-SIM ']");
	By esimInPlanInclusionsReview = By.xpath("//li[text()=' e-SIM ']");



	//Addons
	By DoYouUseLotsOfData = By.xpath("//div[contains(text(),' Do you use lots of data? ')]");
	By Data_checkbox = By.xpath("//div[text()=' Do you use lots of data? ']//following::span[1]");
	By GSAddsurf99 = By.xpath("//div[contains(text(),' GS Add Surf 99')]");

	By DoYouLoveWatchingShowsAndMovies = By.xpath("//div[contains(text(),' Do you love watching shows and movies? ')]");
	By movie_checkbox = By.xpath("//div[text()=' Do you love watching shows and movies? ']//following::span[1]");
	By Amazonprime = By.xpath("//div[contains(text(),' Amazon Prime Video ')]");
	By Viupremium = By.xpath("//div[contains(text(),' Viu Premium ')]");
	By Spotifypremium = By.xpath("//div[contains(text(),' Spotify Premium ')]");

	By PreferTalkingOverMessaging = By.xpath("//div[contains(text(),' Prefer talking over messaging? ')]");
	By message_checkbox = By.xpath("//div[contains(text(),' Prefer talking over messaging? ')]//following::span[1]");
	By MyDuo = By.xpath("//div[contains(text(),' MyDuo')]");
	By MySuperDuo = By.xpath("//div[contains(text(),' MySuperDuo')]");

	By AreYouAllAboutTheJetSettingLifestyle = By.xpath("//div[contains(text(),' Are you all about the jet-setting lifestyle? ')]");
	By lifestyle_checkbox = By.xpath("//div[contains(text(),' Are you all about the jet-setting lifestyle? ')]//following::span[1]");
	By easyRoam = By.xpath("//div[contains(text(),' Easy Roam')]");
	By Gocallid199 = By.xpath("//div[contains(text(),' GOCALLIDD 199')]");


	//Review My plan details
	By ReviewMyPlan = By.xpath("//div[text()='Review my plan']");
	By DeviceImage = By.xpath("//img[@class='go_device']");
	By DeviceNameInReviewMyPlan = By.xpath("(//div[@class='go_device-info go_plan-builder-sticky']//span)[1]");
	By DeviceCapacityInReview = By.xpath("(//div[@class='go_device-info go_plan-builder-sticky']//span)[3]");
	By ContactDerationInReview = By.xpath("(//span[text()='Contract Duration:']//following::strong)[1]");

	By All_access_data = By.xpath("//span[text()='All-access data ']//following::span[1]");
	By GoWifi_access = By.xpath("//span[text()=' GoWifi access ']//following::span[1]");

	By Unli_All_net = By.xpath("//span[text()=' Call and text ']//following::span[1]");
	By Plan_inclusions = By.xpath("//span[text()='Plan inclusions']");
	By Konsulta_Sub = By.xpath("//li[text()=' Konsulta MD Free personal subscription']");
	By Glnsure_Sub = By.xpath("//li[text()=' Glnsure 3-months subscription']");

	By gplan_Name = By.xpath("//div[@class='go_plan-breakdown-row go_plan-type']//strong");
	By Subscriptions_Addons = By.xpath("//span[contains(text(), 'Subscriptions and Add')]");
	By My_Super_Duo = By.xpath("//div[text()='MySuperDuo']//following::span[1]");
	By Amazon_Prime_Video = By.xpath("//div[text()='Amazon Prime Video']//following::span[1]");
	By Viu_Premium = By.xpath("//div[text()='Viu Premium']//following::span[1]");
	By Spotify_Premium = By.xpath("//div[text()='Spotify Premium']//following::span[1]");
	By GOCALLIDD_199 = By.xpath("//div[text()='GOCALLIDD 199']//following::span[1]");
	By Easy_Roam = By.xpath("//div[text()='Easy Roam']//following::span[1]");
	By GS_Add_Surf_99 = By.xpath("//div[text()='GS Add Surf 99']//following::span[1]");
	By customizeYourGplan = By.xpath("//h1[contains(text(), ' Customize your GPlan')]");

	By Total_subscriptions_and_addons = By.xpath("//strong[contains(text(), 'Total subscriptions and add')]//following::span[1]");
	By MonthlyBill_subscriptions_and_addons = By.xpath("//strong[contains(text(), 'Monthly bill, subscriptions, and add')]//following::span[1]");
	By Monthly_Payment = By.xpath("(//span[text()='Monthly payment'])[2]//following::strong[1]");
	By OneTimeDevice_Cashout = By.xpath("//span[text()='One-time device cost']//following::strong");

	By Mobilenumfield = By.xpath("//input[@id='go_plan-breakdown-number']");
	By Proceedbtn = By.xpath("(//button[contains(text(),'Proceed')])[1]");


	//Plan Breakdown page
	By Mobile_Number = By.xpath("//div[@class='go_mobile-display']//span");
	By ProceedWithMyPlanButton = By.xpath("//button[contains(text(),'Proceed with my plan')]");


	
	By Planname_SimOnly999 = By.xpath("//strong[contains(text(),'GPlan Plus SIM-Only 999')]");
	By Planname_SimOnly999_Price = By.xpath("//span[contains(text(),'â‚± 999.00')]");
	By mysuper=By.xpath("(//div[contains(text(),'MySuperDuo')])[2]");

	By GplanSimonly599 = By.xpath("//strong[contains(text(),'GPlan Plus SIM-Only 599')]");
	By Addonamount599 = By.xpath("//span[contains(text(),'â‚± 1,325.00')]");
	By Monthyaddon599 = By.xpath("//span[contains(text(),'â‚± 1,924.00')]");
	By Totalmontlypaymentsimonly599 = By.xpath("(//strong[contains(text(),'â‚± 1,924.00/mo.')])[2]");

	
	//PREFOR ESIM
	By esimorphysical=By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");
	By physicalsim=By.xpath("(//span[@class='go_custom-radio-title go_text-content-xbase-bold-default'])[2]");
	By esimInclusion=By.xpath("//li[text()=' e-SIM ']");
	By esimInReviewPlan=By.xpath("//span[text()=' e-SIM ']");


	By alldataclick=By.xpath("(//button[@id='pills-lifestyle-bundle-tab'])[4]");
	By viewall=By.xpath("//a[contains(text(),'View all devices')]");
	By starterbanner9 = By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");	
	By MyGsadd=By.xpath("//div[contains(text(),'GS Add Surf 99')]");
	By Mysuperde=By.xpath("//div[@class='go_text-h3-small-alt']");
	By Total_price=By.xpath("//span[contains(text(),'â‚± 848.00')]");
	By planedata=By.xpath("//div[@class='owl-item ng-tns-c52-4 ng-trigger ng-trigger-autoHeight ng-star-inserted active']");
	By prev=By.xpath("//div[@class='owl-prev']");
	
	
	
    By DiscoverEssential=By.xpath("//button[contains(text(),' Discover Essential ')]");
	By selectGplanWithDevice599=By.xpath("((//div[@class='price'])[1]//following::span[contains(text(),'599')])[1]");
	By selectGplanWithDevice1499 = By.xpath("//span[contains(text(),'1499')]");
	By BannerEssential1 = By.xpath("//h2[text()='WELCOME TO YOUR DIGITAL LIFESTYLE']");
	By BannerEssential2 = By.xpath("//h2[text()='Everything you need to move on']");
	By BannerEssential3 = By.xpath("//h2[text()='Create better connections']");
	By BannerEssential4 = By.xpath("//span[text()='Entertainment for days']");
	By BannerEssential5 = By.xpath("//h2[text()='Never miss a beat']");
	By BannerEssential6 = By.xpath("//span[text()='Online shopping, made easy']");
	By BannerEssential7 = By.xpath("//h2[text()='Find the ultimate companion']");
	By BannerEssential8 = By.xpath("//h2[text()='Do you need more data?']");
	By BannerEssential9 = By.xpath("//strong[text()='Plan styles for all lifestyles']");
	
	By planeName1499=By.xpath("//strong[contains(text(),'GPlan 1499 with Device')]");
	By planeamount1499=By.xpath("//span[contains(text(),'â‚± 1,499.00')]");
	By Viu=By.xpath("(//div[contains(text(),'Viu Premium')])[2]");
	By Spotify=By.xpath("(//div[contains(text(),'Spotify Premium')])[2]");
	By GsSurf=By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");
	By totalsubamount1499=By.xpath("(//span[contains(text(),'â‚± 927.00')])");
	By monthlybillamount1499=By.xpath("(//span[contains(text(),'â‚± 2,426.00')])");
	By monthlypayment1499=By.xpath("(//strong[contains(text(),'â‚± 2,426.00/mo.')])");
	By plannamepluse=By.xpath("//strong[contains(text(),'GPlan Plus SIM-Only 1799')]");
	By planepricepluse=By.xpath("//span[contains(text(),'â‚± 1,799.00')]");
	
	
    By Planenamewithsim=By.xpath("//div[@class='go_plan-breakdown-row go_plan-type']//strong[@class='go_text-preamble']");
	By Monthlypayment=By.xpath("//span[text()='Monthly payment']");	  
	//FTA-5----PDP page and view Breakdown for Gplan withDevice 1499  
	By selectGplanWithgcash2499 = By.xpath("(//span[contains(text(),'2499')])[2]");		
	By monthlypayment = By.xpath("(//strong[contains(text(),'â‚± 3,327.00/mo.')])[2]");
	By applyWithDevice = By.xpath("//button[text()=' Apply with this device ']");
	
	
	
	/********************************************************************************************************************************/


	public WebElement get_Planname_SimOnly599() {
		return DriverManager.getDriver().findElement(Planname_SimOnly599);}

	public WebElement get_GplanSimonlyPlanName() {
		return DriverManager.getDriver().findElement(GplanSimonlyPlanName);

	}

	public WebElement get_Esim() {
		return DriverManager.getDriver().findElement(Esim);}


	public WebElement get_CarouselDeviceNextBtn() {
		return DriverManager.getDriver().findElement(CarouselDeviceNextBtn);

	}
		public WebElement get_applyWithDevice() {
			return DriverManager.getDriver().findElement(applyWithDevice);

		}

		public WebElement get_selectGplanWithDevice599() {
			return DriverManager.getDriver().findElement(selectGplanWithDevice599);

		}
		public WebElement get_NextArrow() {
			return DriverManager.getDriver().findElement(NextArrow);

		}
		public WebElement get_PrevArrow() {
			return DriverManager.getDriver().findElement(PrevArrow);

		}
		public WebElement get_GetSatartedBtn() {
			return DriverManager.getDriver().findElement(GetSatartedBtn);

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
	public WebElement get_Mobilenumfield() {
		return DriverManager.getDriver().findElement(Mobilenumfield);
	}
	/********************************************************************************************************************************/
	public WebElement get_Disc_starterbtn() {
		return DriverManager.getDriver().findElement(Disc_starterbtn);
	}
	public WebElement get_Discoveralwayson()
	{
		return DriverManager.getDriver().findElement(Discoveralwayson);

	}

	/*******************************************/
	public WebElement get_Discover_plus()
	{
		return DriverManager.getDriver().findElement(DiscooverPlus);

	}

	public WebElement get_searchfield()
	{
		return DriverManager.getDriver().findElement(searchfield);
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
	public WebElement get_Data_addon() {
		return DriverManager.getDriver().findElement(Data_addon);
	}
	
	public WebElement get_discoveryAlways() {
		return DriverManager.getDriver().findElement(discoveryAlways);
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
	public WebElement get_PdpSearchfield()
	{
		return DriverManager.getDriver().findElement(PdpSearchfield);
	}
	/***********************************************************************************************************************************/
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

	/********************************************************************************************************************************/
	public WebElement get_dropdown_Planbreakdwn() {
		return DriverManager.getDriver().findElement(dropdown_Planbreakdwn);
	}

	/********************************************************************************************************************************/
	public WebElement get_Proceedbtn() {
		return DriverManager.getDriver().findElement(Proceedbtn);
	}

	/********************************************************************************************************************************/
	public WebElement get_Dragbutton() {
		return DriverManager.getDriver().findElement(Dragbutton);
	}

	/********************************************************************************************************************************/
	public WebElement get_inputmoblienum() {
		return DriverManager.getDriver().findElement(inputmoblienum);
	}

	/********************************************************************************************************************************/
	public WebElement get_proceedbtn1() {
		return DriverManager.getDriver().findElement(proceedbtn1);
	}
	/***********************************************************************/
	public WebElement get_Surf()
	{
		return DriverManager.getDriver().findElement(SURF);
	}
	/**********************************************************************/
	public WebElement get_mysuperDuoAddon()
	{
		return DriverManager.getDriver().findElement(mysuperDuoAddon);
	}
	public WebElement get_Reviewmyplan()
	{
		return DriverManager.getDriver().findElement(Reviewmyplan);
	}
	/*******************************************/
	public WebElement get_Gplan1799()
	{
		return DriverManager.getDriver().findElement(Gplan1799);	
	}
	/***************ADA  1 STARTS HERE**********************/
	//	Shows and Movies
	public WebElement get_showsAndMoviesToggle() {
		return DriverManager.getDriver().findElement(showsAndMoviesToggle);
	}

	public WebElement get_AmazonprimeVideoaddon599()
	{
		return DriverManager.getDriver().findElement(AmazonprimeVideoaddon599);
	}
	public WebElement get_viupremiuum599()
	{
		return DriverManager.getDriver().findElement(viupremiuum599);
	}
	public WebElement get_spotifypremiuum599()
	{
		return DriverManager.getDriver().findElement(spotifypremiuum599);
	}
	public WebElement get_TalkingovermessageAddOn()
	{
		return DriverManager.getDriver().findElement(TalkingovermessageAddOn);
	}
	public WebElement get_lifestylemessageAddOn()
	{
		return DriverManager.getDriver().findElement(lifestylemessageAddOn);
	}
	public WebElement get_YoutubeAddon()
	{
		return DriverManager.getDriver().findElement(YoutubeAddon);
	}
	public WebElement get_testDataDisplayedInBreakdown()
	{
		return DriverManager.getDriver().findElement(testDataDisplayedInBreakdown);
	}
	public WebElement get_nameOfThePlanInBreakDown()
	{
		return DriverManager.getDriver().findElement(nameOfThePlanInBreakDown);
	}
	public WebElement get_TotalSubs_AddonsInBreakdown()
	{
		return DriverManager.getDriver().findElement(TotalSubs_AddonsInBreakdown);
	}
	public WebElement get_MonthlyBillSub_AddonsInBreakdown()
	{
		return DriverManager.getDriver().findElement(MonthlyBillSub_AddonsInBreakdown);
	}
	public WebElement get_MonthlyPaymentInBreakdown()
	{
		return DriverManager.getDriver().findElement(MonthlyPaymentInBreakdown);
	}
	public WebElement get_esim() {
		return DriverManager.getDriver().findElement(esim);
	}
	/********************************************************************************************************************************/
	public WebElement get_physicalSim() {
		return DriverManager.getDriver().findElement(physicalSim);
	}
	/********************************************************************************************************************************/
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
	public WebElement get_gplan_Name() {
		return DriverManager.getDriver().findElement(gplan_Name);
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
	



	//Change

	public WebElement get_productDetails() {
		return DriverManager.getDriver().findElement(productDetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_productGallery() {
		return DriverManager.getDriver().findElement(productGallery);
	}

	/********************************************************************************************************************************/
	public WebElement get_discoverGplanBelow() {
		return DriverManager.getDriver().findElement(discoverGplanBelow);
	}

	/********************************************************************************************************************************/
	public WebElement get_reserveWithThisDevice() {
		return DriverManager.getDriver().findElement(reserveWithThisDevice);
	}

	/********************************************************************************************************************************/
	public WebElement get_selectAnotherDevice() {
		return DriverManager.getDriver().findElement(selectAnotherDevice);
	}

	/********************************************************************************************************************************/
	public WebElement get_deviceNameinPDPage() {
		return DriverManager.getDriver().findElement(deviceNameinPDPage);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_color_Finish() {
		return DriverManager.getDriver().findElements(color_Finish);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_Diff_Colors() {
		return DriverManager.getDriver().findElements(Diff_Colors);
	}

	/********************************************************************************************************************************/
	public WebElement get_capacity() {
		return DriverManager.getDriver().findElement(capacity);
	}

	/********************************************************************************************************************************/
	public WebElement get_contractDuration() {
		return DriverManager.getDriver().findElement(contractDuration);
	}

	/********************************************************************************************************************************/
	public WebElement get_color_Finish1() {
		return DriverManager.getDriver().findElement(color_Finish1);
	}

	/********************************************************************************************************************************/
	public WebElement get_capacity1() {
		return DriverManager.getDriver().findElement(capacity1);
	}

	/********************************************************************************************************************************/
	public WebElement get_contractDuration1() {
		return DriverManager.getDriver().findElement(contractDuration1);
	}

	/********************************************************************************************************************************/
	public WebElement get_ViewAllDevicesLinkInPdPage() {
		return DriverManager.getDriver().findElement(ViewAllDevicesLinkInPdPage);
	}
	public WebElement get_GetStartedWithDeviceGplan599()
	{
		return DriverManager.getDriver().findElement(GetStartedWithDeviceGplan599);
	}


	public WebElement get_ReviewMyPlan() {
		return DriverManager.getDriver().findElement(ReviewMyPlan);
	}


	public WebElement get_ProceedWithMyPlanButton() {
		return DriverManager.getDriver().findElement(ProceedWithMyPlanButton);
	}
	/********************************************************************************************************************************/
	public WebElement get_physicalsim()
	{
		return DriverManager.getDriver().findElement(physicalsim);
	}
	public WebElement get_Planname_SimOnly999() {
		return DriverManager.getDriver().findElement(Planname_SimOnly999);}

	public WebElement get_GplanSimonly599() {
		return DriverManager.getDriver().findElement(GplanSimonly599);

	}
	public WebElement get_super()
	{
		return DriverManager.getDriver().findElement(mysuper);
	}	
	public WebElement get_viewall()
	{
		return DriverManager.getDriver().findElement(viewall);
		
	}
	public WebElement get_prev() {
		return DriverManager.getDriver().findElement(prev);
		
	}
	
	public WebElement get_alldataclick()
	{
		return DriverManager.getDriver().findElement(alldataclick);
	}
	/*****************************************************************************/
	public WebElement get_ReviewMyplan()
	{
		return DriverManager.getDriver().findElement(Reviewmyplan);
	}
	/********************************************************************************************************************************/
	
	public WebElement get_DiscoverEssential()
	{
		return DriverManager.getDriver().findElement(DiscoverEssential);
	}
	/**************************************************************************/
	
	public WebElement get_planedata()
	{
		return DriverManager.getDriver().findElement(planedata);
	}
	/********************************************************************************************************************************/

	public WebElement get_PDP_Simonly()
	{
		return DriverManager.getDriver().findElement(PDP_Simonly);
	}

	/***************ADA  1 ENDS HERE**********************/

	//---- RONNI SCRIPT ADA5 Start here-----
	/**
	 * @throws Exception ******************************************************************************************************************************/
	
	public void enterText(String type, String ele, String value) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


			switch (ele) {	
			 case "Mobilenumfield":
				 get_Mobilenumfield().clear();
				get_Mobilenumfield().sendKeys(value);;
				break;
			 case "PdpSearchfield":
				 get_PdpSearchfield().clear();
				get_PdpSearchfield().sendKeys(value);
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
			case "Breakdown_proceedbutton":
				js.executeScript("arguments[0].click();", get_Breakdown_proceedbutton());
				break;
			case "Disc_Basicbtn":
				js.executeScript("arguments[0].click();", get_Disc_Basicbtn());
				break;
			case "Data_checkbox":
				js.executeScript("arguments[0].click();", get_Data_checkbox());
				break;
			case "GSAddsurf99":
				js.executeScript("arguments[0].click();", get_GSAddsurf99());
				break;
			case "Reviewmyplan":
				js.executeScript("arguments[0].click();", get_Reviewmyplan());
				break;
				/***************ADA  1 STARTS HERE**********************/
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
			case "YoutubeAddon":
				js.executeScript("arguments[0].click();", get_YoutubeAddon());
				break;
			case "easyRoam":
				js.executeScript("arguments[0].click();", get_easyRoam());
				break;
			case "Gocallid199":
				js.executeScript("arguments[0].click();", get_Gocallid199());
				break;
			case "Spotifypremium":
				js.executeScript("arguments[0].click();", get_Spotifypremium());
				break;
				/***************ADA  1 EndS HERE**********************/
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

	//---- RONNI SCRIPT ADA5 ENDS here-----

	/*************************************************************************************************/

	public WebElement get_Disc_Basicbtn() {
		return DriverManager.getDriver().findElement(Disc_Basicbtn);
	}

	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {

		//------------------Bhavana script starts here--------
		case "Selecteddevice":
			flag = waitForElementVisibility(Selecteddevice, waitTime);
			break;
		case "CarouselDevicePrevBtn":
			flag = waitForElementVisibility(CarouselDevicePrevBtn, waitTime);
			break;
		case "Selecteddevice_amount":
			flag = waitForElementVisibility(Selecteddevice_amount, waitTime);
			break;
		case "CarouselDeviceNextBtn":
			flag = waitForElementVisibility(CarouselDeviceNextBtn, waitTime);
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
		case "GSAddSurfBreakdown":
			flag = waitForElementVisibility(GSAddSurfBreakdown, waitTime);
			break;
		case "Addonsamount":
			flag = waitForElementVisibility(Addonsamount, waitTime);
			break;
		case "Monthlyamount":
			flag = waitForElementVisibility(Monthlyamount, waitTime);
			break;
		case "Gcash_Monthlypayment_amount":
			flag = waitForElementVisibility(Monthlypayment_amount, waitTime);
			break;
		case "YoutubeAddon":
			flag = waitForElementVisibility(YoutubeAddon, waitTime);
			break;
		case "PdpSearchfield":
			flag = waitForElementVisibility(PdpSearchfield, waitTime);
			break;
		case "GplanWithDevicePlanName":
			flag = waitForElementVisibility(GplanWithDevicePlanName, waitTime);
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
		case "Diff_Colors":
			flag = waitForElementVisibility(Diff_Colors, waitTime);
			break;
		case "gplan_Name":
			flag = waitForElementVisibility(gplan_Name, waitTime);
			break;
		case "My_Super_Duo":
			flag = waitForElementVisibility(My_Super_Duo, waitTime);
			break;
		case "My_Duo":
			flag = waitForElementVisibility(My_Duo, waitTime);
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
		case "DeviceImage":
			flag = waitForElementVisibility(DeviceImage, waitTime);
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
		case "customizeYourGplan":
			flag = waitForElementVisibility(customizeYourGplan, waitTime);
			break;



			//------ RONNIE SCRIPT ADA5---------
		case "Contractduration_Value":
			flag = waitForElementVisibility(Contractduration_Value, waitTime);
			break;
		case "Simonly_basic_btn":
			flag = waitForElementVisibility(Simonly_basic_btn, waitTime);
			break;
		case "Preper_esim_PhysicalSim":
			flag = waitForElementVisibility(Preper_esim_PhysicalSim, waitTime);
			break;
		case "Breakdown_Mobilenum":
			flag = waitForElementVisibility(Breakdown_Mobilenum, waitTime);
			break;
		case "Planname_SimOnly599":
			flag = waitForElementVisibility(Planname_SimOnly599, waitTime);
			break;
		case "Planname_SimOnly599_Price":
			flag = waitForElementVisibility(Planname_SimOnly599_Price, waitTime);
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

			//------ RONNIE SCRIPT ADA5 END HERE -------

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
		case "Price_599":
			flag = waitForElementVisibility(Price_599, waitTime);
			break;
		case "Color_header":
			flag = waitForElementVisibility(Color_header, waitTime);
			break;
		case "Capacity_header":
			flag = waitForElementVisibility(Capacity_header, waitTime);
			break;
		case "Contractduration_header":
			flag = waitForElementVisibility(Contractduration_header, waitTime);
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
		case "Banner":
			flag = waitForElementVisibility(Banner, waitTime);
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
		case "MyDuo":
			flag = waitForElementVisibility(MyDuo, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;			
		case "Mobilenumfield":
			flag = waitForElementVisibility(Mobilenumfield, waitTime);
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



		case "Reviewmyplan":
			flag = waitForElementVisibility(Reviewmyplan, waitTime);
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
		case "Subsandaddonheader":
			flag = waitForElementVisibility(Subsandaddonheader, waitTime);
			break;
		case "MyDuoaddon":
			flag = waitForElementVisibility(MyDuoaddon, waitTime);
			break;
		case "AmazonAddon":
			flag = waitForElementVisibility(AmazonAddon, waitTime);
			break;
		case "SURF":
			flag = waitForElementVisibility(SURF, waitTime);
			break;
		case "mysuperDuoAddon":
			flag = waitForElementVisibility(mysuperDuoAddon, waitTime);
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
		case "inputmoblienum":
			flag = waitForElementVisibility(inputmoblienum, waitTime);
			break;
		case "proceedbtn1":
			flag = waitForElementVisibility(proceedbtn1, waitTime);
			break;
		case "Banner2":
			flag=waitForElementVisibility(Banner2, waitTime);
			break;
		case "Gplan1799":
			flag=waitForElementVisibility(Gplan1799, waitTime);
			break;
		case "Planname1799":
			flag=waitForElementVisibility(planename1799, waitTime);
			break;
		case "planeamount1799":
			flag=waitForElementVisibility(planeamount1799, waitTime);
			break;
		case "monthlybillpay1799":
			flag=waitForElementVisibility(monthlybillpay1799, waitTime);
			break;
		case "monthlypaymentamount1799":
			flag=waitForElementVisibility(monthlypaymentamount1799, waitTime);
			break;
		case "panenameDAF":
			flag=waitForElementVisibility(panenameDAF, waitTime);
			break;


			//----- RONNIE SCRIPT START HERE-----
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
			/***************ADA  1 STARTS HERE**********************/
		case "GplanSimonlyPlanName":
			flag = waitForElementVisibility(GplanSimonlyPlanName, waitTime);
			break;
		case "SimOnly599GOCALLIDD199":
			flag = waitForElementVisibility(SimOnly599GOCALLIDD199, waitTime);
			break;
		case "Addonamount":
			flag = waitForElementVisibility(Addonamount, waitTime);
			break;
		case "Monthyaddon":
			flag = waitForElementVisibility(Monthyaddon, waitTime);
			break;
		case "Totalmontlypaymentsimonly":
			flag = waitForElementVisibility(Totalmontlypaymentsimonly, waitTime);
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
		case "testDataDisplayedInBreakdown":
			flag = waitForElementVisibility(testDataDisplayedInBreakdown, waitTime);
			break;
		case "nameOfThePlanInBreakDown":
			flag = waitForElementVisibility(nameOfThePlanInBreakDown, waitTime);
			break;
		case "contractDurationInBreakDown":
			flag = waitForElementVisibility(contractDurationInBreakDown, waitTime);
			break;
		case "allAccessDataInBreakDown":
			flag = waitForElementVisibility(allAccessDataInBreakDown, waitTime);
			break;
		case "goWifiAccessInBreakDown":
			flag = waitForElementVisibility(goWifiAccessInBreakDown, waitTime);
			break;
		case "call_TextInBreakdown":
			flag = waitForElementVisibility(call_TextInBreakdown, waitTime);
			break;
		case "planInclusionsInBreakdown":
			flag = waitForElementVisibility(planInclusionsInBreakdown, waitTime);
			break;
		case "KonsultaMDInBreakdown":
			flag = waitForElementVisibility(KonsultaMDInBreakdown, waitTime);
			break;
		case "MySuperDuoInBreakdown":
			flag = waitForElementVisibility(MySuperDuoInBreakdown, waitTime);
			break;
		case "AmazonPrimeVideoInBreakdown":
			flag = waitForElementVisibility(AmazonPrimeVideoInBreakdown, waitTime);
			break;
		case "ViuPremiumInBreakdown":
			flag = waitForElementVisibility(ViuPremiumInBreakdown, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GOCALLIDDInBreakdown":
			flag = waitForElementVisibility(GOCALLIDDInBreakdown, waitTime);
			break;
		case "TotalSubs_AddonsInBreakdown":
			flag = waitForElementVisibility(TotalSubs_AddonsInBreakdown, waitTime);
			break;
		case "MonthlyBillSub_AddonsInBreakdown":
			flag = waitForElementVisibility(MonthlyBillSub_AddonsInBreakdown, waitTime);
			break;
		case "MonthlyPaymentInBreakdown":
			flag = waitForElementVisibility(MonthlyPaymentInBreakdown, waitTime);
			break;

			/***************ADA  1 ENDS HERE**********************/

			//------------ RONNIE SCRIPT ENDS HERE --------------

			//Change

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
		case "reserveWithThisDevice":
			flag = waitForElementVisibility(reserveWithThisDevice, waitTime);
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

		case "Mobile_Number":
			flag = waitForElementVisibility(Mobile_Number, waitTime);
			break;
		case "ProceedWithMyPlanButton":
			flag = waitForElementVisibility(ProceedWithMyPlanButton, waitTime);
			break;	
		case "Planname_SimOnly999":
			flag = waitForElementVisibility(Planname_SimOnly999, waitTime);
			break;
		case "Planname_SimOnly999_Price":
			flag = waitForElementVisibility(Planname_SimOnly999_Price, waitTime);
			break;
		case "esim":
			flag = waitForElementVisibility(esim, waitTime);
			break;
		case "physicalsim":
			flag = waitForElementVisibility(physicalsim, waitTime);
			break;
		case "esimorphysical":
			flag = waitForElementVisibility(esimorphysical, waitTime);
			break;
		case "mysuper":
			flag = waitForElementVisibility(mysuper, waitTime);
			break;
		case "GplanSimonly599":
			flag = waitForElementVisibility(GplanSimonly599, waitTime);
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
		case "selectGplanWithgcash2499":
			flag = waitForElementVisibility(selectGplanWithgcash2499, waitTime);
			break;
		
		case "searchfield":
			flag = waitForElementVisibility(searchfield, waitTime);
			break;
		
		case "Discoveralwayson":
			flag = waitForElementVisibility(Discoveralwayson, waitTime);
			break;
		
		
		case "planedata":
			flag = waitForElementVisibility(planedata, waitTime);
			break;
			
		
		case "viewall":
			flag = waitForElementVisibility(viewall, waitTime);
			break;
		
		//added ASMA
		case "DiscooverPlus":
			flag = waitForElementVisibility(DiscooverPlus, waitTime);
			break;
		case "DiscoverEssential":
			flag = waitForElementVisibility(DiscoverEssential, waitTime);
			break;		
			
		
		case "MyGsadd":
			flag = waitForElementVisibility(MyGsadd, waitTime);
			break;
		case "Mysuperde":
			flag = waitForElementVisibility(Mysuperde, waitTime);
			break;
		case "Total_price":
			flag = waitForElementVisibility(Total_price, waitTime);
			break;
		case "totalpluse":
			flag = waitForElementVisibility(totalpluse, waitTime);
			break;	
		case "starterbanner9":
			flag = waitForElementVisibility(starterbanner9, waitTime);
			break;
		case "BannerEssential1":
			flag = waitForElementVisibility(BannerEssential1, waitTime);
			break;
		case "BannerEssential2":
			flag = waitForElementVisibility(BannerEssential2, waitTime);
			break;
		case "BannerEssential3":
			flag = waitForElementVisibility(BannerEssential3, waitTime);
			break;
		case "BannerEssential4":
			flag = waitForElementVisibility(BannerEssential4, waitTime);
			break;
		case "BannerEssential5":
			flag = waitForElementVisibility(BannerEssential5, waitTime);
			break;
		case "BannerEssential6":
			flag = waitForElementVisibility(BannerEssential6, waitTime);
			break;
		case "BannerEssential7":
			flag = waitForElementVisibility(BannerEssential7, waitTime);
			break;
		case "BannerEssential8":
			flag = waitForElementVisibility(BannerEssential8, waitTime);
			break;
		case "BannerEssential9":
			flag = waitForElementVisibility(BannerEssential9, waitTime);
			break;	
		case "Monthlypayment":
			flag=waitForElementVisibility(Monthlypayment, waitTime);
			break;
		case "planeName1499":
			flag=waitForElementVisibility(planeName1499, waitTime);
			break;
		case "planeamount1499":
			flag=waitForElementVisibility(planeamount1499, waitTime);
			break;
		case "Viu":
			flag=waitForElementVisibility(Viu, waitTime);
			break;
		case "Spotify":
			flag=waitForElementVisibility(Spotify, waitTime);
			break;
		case "GsSurf":
			flag=waitForElementVisibility(GsSurf, waitTime);
			break;
		case "totalsubamount1499":
			flag=waitForElementVisibility(totalsubamount1499, waitTime);
			break;
		case "monthlybillamount1499":
			flag=waitForElementVisibility(monthlybillamount1499, waitTime);
			break;
		case "monthlypayment1499":
			flag=waitForElementVisibility(monthlypayment1499, waitTime);
			break;
		case "esimInReviewpage":
			flag=waitForElementVisibility(esimInReviewpage, waitTime);
			break;
		case "esimInPlanInclusionsReview":
			flag=waitForElementVisibility(esimInPlanInclusionsReview, waitTime);
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

	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "Disc_Basicbtn":
			flag = waitForElementClickable(Disc_starterbtn, waitTime);
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
			/***************ADA  1 STARTS HERE**********************/
		case "GplanSimonlyPlanName":
			flag = waitForElementClickable(GplanSimonlyPlanName, waitTime);
			break;
		case "SimOnly599GOCALLIDD199":
			flag = waitForElementClickable(SimOnly599GOCALLIDD199, waitTime);
			break;
		case "Addonamount":
			flag = waitForElementClickable(Addonamount, waitTime);
			break;
		case "Monthyaddon":
			flag = waitForElementClickable(Monthyaddon, waitTime);
			break;
		case "Totalmontlypaymentsimonly":
			flag = waitForElementClickable(Totalmontlypaymentsimonly, waitTime);
			break;
		case "showsAndMoviesToggle":
			flag = waitForElementClickable(showsAndMoviesToggle, waitTime);
			break;
		case "AmazonprimeVideoaddon599":
			flag = waitForElementClickable(AmazonprimeVideoaddon599, waitTime);
			break;
		case "viupremiuum599":
			flag = waitForElementClickable(viupremiuum599, waitTime);
			break;

		case "spotifypremiuum599":
			flag = waitForElementClickable(spotifypremiuum599, waitTime);
			break;
		case "TalkingovermessageAddOn":
			flag = waitForElementClickable(TalkingovermessageAddOn, waitTime);
			break;
		case "lifestylemessageAddOn":
			flag = waitForElementClickable(lifestylemessageAddOn, waitTime);
			break;
		case "Build_btn":
			flag = waitForElementClickable(Build_btn, waitTime);
			break;		
		case "GplanSimonly599":
			flag = waitForElementVisibility(GplanSimonly599, waitTime);
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
		case "DiscoverEssential":
			flag = waitForElementClickable(DiscoverEssential, waitTime);
			break;
		case "Discoveralwayson":
			flag=waitForElementClickable(Discoveralwayson,waitTime);
			break;
		case "viewall":
			flag=waitForElementClickable(viewall,waitTime);
			break;
		case "prev":
			flag=waitForElementClickable(prev,waitTime);
			break;
		case "planedata":
			flag=waitForElementClickable(planedata,waitTime);
			break;
		case "Alldata_strtr_btn":
			flag=waitForElementClickable(Alldata_strtr_btn,waitTime);
			break;
		case "alldataclick":			
			flag=waitForElementClickable(alldataclick,waitTime);
			break;	
		case "Gplan1799":
			flag = waitForElementClickable(Gplan1799, waitTime);
			break;
		case "PDP_Simonly":
			flag = waitForElementClickable(PDP_Simonly, waitTime);
			break;
		}

		return flag;
	}
	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
		case "Disc_starterbtn":
			ele = DriverManager.getDriver().findElement(Disc_starterbtn);
			break;
		case "link_Apply":
			ele = DriverManager.getDriver().findElement(link_Apply);
			break;
		case "Device_strtr_btn":
			ele = DriverManager.getDriver().findElement(Device_strtr_btn);
			break;
		case "Mobilenumfield":
			ele = DriverManager.getDriver().findElement(Mobilenumfield);
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
		case "DiscoverEssential":
			ele = DriverManager.getDriver().findElement(DiscoverEssential);
			break;
		case "Discoveralwayson":
			ele = DriverManager.getDriver().findElement(Discoveralwayson);
			break;
		case "prev":
			ele = DriverManager.getDriver().findElement(prev);
			break;
		case "Build_btn":
			ele = DriverManager.getDriver().findElement(Build_btn);
			break;
		case "planedata":
			ele = DriverManager.getDriver().findElement(planedata);
			break;
		case "alldataclick":
			ele = DriverManager.getDriver().findElement(alldataclick);
			break;
		case "viewall":
			ele = DriverManager.getDriver().findElement(viewall);
			break;

		}

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}	

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
	public boolean get_checkbox1()
	{
		return DriverManager.getDriver().findElement(Checkbox1).isSelected();
	}
	public boolean get_checkbox2()
	{
		return DriverManager.getDriver().findElement(Chockbox2).isSelected();


	}
	public boolean get_checkbox3()
	{
		return DriverManager.getDriver().findElement(Chockbox3).isSelected();

	}
	public boolean get_checkbox4()
	{
		return DriverManager.getDriver().findElement(Chockbox4).isSelected();

	}
	public boolean get_checkbox5()
	{
		return DriverManager.getDriver().findElement(Chockbox5).isSelected();


	}
	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {
			case "CarouselDeviceNextBtn":
				get_CarouselDeviceNextBtn().click();
				break;
			case "selectGplanWithDevice599":
				get_selectGplanWithDevice599().click();
				break;
			case "NextArrow":
				get_NextArrow().click();
				break;
			case "PrevArrow":
				get_PrevArrow().click();
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

				/***************ADA  1 STARTS HERE**********************/
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
				/***************ADA  1 ENDS HERE**********************/

				//Change

			case "discoverGplanBelow":
				get_discoverGplanBelow().click();
				break;
			case "reserveWithThisDevice":
				get_reserveWithThisDevice().click();
				break;
			case "selectAnotherDevice":
				get_selectAnotherDevice().click();
				break;			
			case "DiscooverPlus":
				get_Discover_plus().click();
				break;
			case "PDP_Simonly":
				get_PDP_Simonly().click();
				break;
				
			case "prev":
				get_prev().click();
				break;
			case "viewall":
				get_viewall().click();
				break;			
			case "planedata":
				get_planedata().click();
				break;
			case "alldataclick":
				get_alldataclick().click();
				break;
				
			case "DiscoverEssential":
				get_DiscoverEssential().click();
				break;
			case "Discoveralwayson":
				get_Discoveralwayson().click();
				break;
						case "Gplan1799":
				get_Gplan1799().click();
				break;
			case "Reviewmyplan":
				get_ReviewMyplan().click();
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

	public void jsClick(String message, String element) throws Exception {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "esim":
				jse.executeScript("arguments[0].click();", get_esim());		
				break;
			case "discoverGplanBelow":
				jse.executeScript("arguments[0].click();", get_discoverGplanBelow());		
				break;
			case "reserveWithThisDevice":
				jse.executeScript("arguments[0].click();", get_reserveWithThisDevice());		
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
			case "physicalSim":
				jse.executeScript("arguments[0].click();", get_physicalSim());		
				break;
			case "Dragbutton":
				jse.executeScript("arguments[0].click();", get_Dragbutton());		
				break;
			case "Disc_starterbtn":
				jse.executeScript("arguments[0].click();", get_Disc_starterbtn());		
				break;
			case "applyWithDevice":
				jse.executeScript("arguments[0].click();", get_applyWithDevice());		
				break;
			case "Build_btn":
				jse.executeScript("arguments[0].click();", get_Build_btn());		
				break;
			case "Discover_plus":
				jse.executeScript("arguments[0].click();", get_Discover_plus());		
				break;
			case "Disc_Basicbtn":
				jse.executeScript("arguments[0].click();", get_Disc_Basicbtn());		
				break;
			case "discoveryAlways":
				jse.executeScript("arguments[0].click();", get_discoveryAlways());		
				break;
			case "GetStartedWithDeviceGplan599":
				jse.executeScript("arguments[0].click();", get_GetStartedWithDeviceGplan599());		
				break;
			case "GetSatartedBtn":
				jse.executeScript("arguments[0].click();", get_GetSatartedBtn());		
				break;
	

			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println( " : " + element + " : " + "Element is not clickable : " + e1.getMessage());
			Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button. is unsuccessfull","Failed");	
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println( " : " + element + " : " + "Element not found : " + e2.getMessage());
			Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button. is unsuccessfull","Failed");	
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println( " : " + element + " : " + "Exception : " + e.getMessage());
			Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button. is unsuccessfull","Failed");	
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + " : " + element);	
		Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicked on '"+element+"' button.","Passed");	


	}



}
