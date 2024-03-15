package com.pages.renewal;

import java.util.NoSuchElementException;

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

public class Renewal_CustmizeplanPage extends BasePage{
	By tittle=By.xpath("//label[contains(text(),'Customize plan')]");
	By change=By.xpath("//a[contains(text(),'Change')]");
	By editmyplan=By.xpath("//button[text()=' Main plan ']");	
	By Gcash=By.xpath("//li[contains(text(),' GCash ')]");
	By Simonly=By.xpath("//li[normalize-space(text())='Sim Only'] | //li[normalize-space(text())='SIM-Only']");
	By device=By.xpath("//li[contains(text(),' Device ')]");
	By alldata=By.xpath("//li[contains(text(),' All-Data ')]");
	By plane2499=By.xpath("//div[contains(text(),' GPlan 2499 with GCash ')]");
	By planealldata2499=By.xpath("//div[contains(text(),' GPlan SIM-Only 2499 ')]");
	By plane2499withdevice=By.xpath("//div[contains(text(),' GPlan 7999 with Device ')]");
	By selectplan=By.xpath("//div[@class='go_sc_modal-plan-add-on add-on-select-wrapper']//button[text()=' Select plan ']");
	By continuetheplan=By.xpath("//span[text()=' Continue with this plan? ']");
	By stayhere=By.xpath("//button[text()=' Stay here ']");
	By gopdgpage=By.xpath("//button[text()=' Go to plan builder ']");	
	By planename=By.xpath("(//div[contains(text(),' GPlan 2499 with GCash ')])[1]");
	By pick=By.xpath("//div[contains(text(),' Pick your add-ons (as many as you want!) ')]");	
	By datapermonth=By.xpath("//div[text()='25 GB data per month']");
	By alldatapermonth=By.xpath("//div[text()='80 GB data per month']");
	By calldata=By.xpath("(//span[@class='go_sc-icon-24 go_sc-icon:plan-card-data go_sc-icon:plan-card-calls ng-star-inserted'])[4]");
	By wifidata=By.xpath("(//span[@class='go_sc-icon-24 go_sc-icon:plan-card-data ng-star-inserted'])[5]");
	By unlimiteddata=By.xpath("(//span[@class='go_sc-icon-24 go_sc-icon:plan-card-data go_sc-icon:plan-card-sms ng-star-inserted'])[5]");
	By inclusiontypesdata=By.xpath("(//span[@class='go_sc-icon-24 go_sc-icon:plan-card-data go_sc-icon:plan-card-package ng-star-inserted'])[5]");
	By gettheseplan=By.xpath("(//button[text()='Get this plan'])[5]");	
	By call=By.xpath("(//span[@class='go_sc-icon-24 go_sc-icon:plan-card-data go_sc-icon:plan-card-calls ng-star-inserted'])[4]");
	By wifi=By.xpath("(//span[@class='go_sc-icon-24 go_sc-icon:plan-card-data ng-star-inserted'])[4]");
	By unlimited=By.xpath("(//span[@class='go_sc-icon-24 go_sc-icon:plan-card-data go_sc-icon:plan-card-sms ng-star-inserted'])[4]");
	By inclusiontypes=By.xpath("(//span[@class='go_sc-icon-24 go_sc-icon:plan-card-data go_sc-icon:plan-card-package ng-star-inserted'])[4]");	
	By DataAddon=By.xpath("//span[text()='Do you use lots of data?']");
	By JetSettingLifeStyle=By.xpath("//span[text()='Are you all about the jet-setting lifestyle?']");
	By MessageAddon=By.xpath("//span[text()='Prefer talking over messaging?']");
	By MovieAddon=By.xpath("//span[text()='Do you love watching shows and movies?']");
	By GSSurfAdd99=By.xpath("//div[text()=' GS Add Surf 99 ']");
	By EasyRoam=By.xpath("//div[text()=' Easy Roam ']");
	By MyDuo=By.xpath("//div[text()=' MyDuo ']");
	By AmazonPrime=By.xpath("//div[text()=' Amazon Prime Video ']");	
	By ViuPremium=By.xpath("//div[text()=' Viu Premium ']");
	By SpotifyPremium=By.xpath("//div[text()=' Spotify Premium ']");
	By SeeMyNewPlan=By.xpath("//span[normalize-space(text())='See my new plan']//preceding::button[1]");
    By ViuPremiumbreak=By.xpath("//span[text()='Viu Premium']");
    By EasyRoambreak=By.xpath("//span[text()='Easy Roam']");
    By ChooseYourPlan  = By.xpath(" //div[normalize-space(text())='Choose your Plan']");
    By iIcon =By.xpath("//div[normalize-space(text())='Choose your Plan']//following-sibling::span[contains(@class, 'go_sc-icon-')]");
    
	/**********************************************************/
	By plantype=By.xpath("(//div[text()=' GPlan 2499 with GCash '])[4]");
	By deviceimage=By.xpath("(//img[@alt='Apple iPhone 14 Pro'])[2]");
	By allaccessdata=By.xpath("(//span[text()='All-access data '])[2]");
	By Gowifi=By.xpath("(//span[text()=' GoWifi access '])[2]");
	By calltext=By.xpath("(//span[text()=' Call and text '])[2]");
	By contarct=By.xpath("(//span[text()='Contract duration'])[2]");
	By plnefinal=By.xpath("(//div[text()=' GPlan 2499 with GCash '])[3]");
	By planevalue=By.xpath("(//div[text()=' GPlan 2499 with GCash '])[3]//span");
	By monthlypayment=By.xpath("(//div[text()=' Monthly payment '])");
	By mothlypaymentvalue=By.xpath("(//div[text()=' Monthly payment '])//span");
	By gsadd=By.xpath("(//span[text()='GS Add Surf 99'])");
	By apv=By.xpath("(//span[text()='Amazon Prime Video'])");
	By viu=By.xpath("(//span[text()='Viu Premium'])");	
	By Duo=By.xpath("(//span[text()='MyDuo'])");
	By easy=By.xpath("(//span[text()='Easy Roam'])");
	By sptify=By.xpath("(//span[text()='Spotify Premium'])");
	By total=By.xpath("(//div[text()=' Total subscriptions and add-ons '])");
	By taotalvalue=By.xpath("(//div[text()=' Total subscriptions and add-ons '])//span");
	By maothlyaddons=By.xpath("(//div[text()=' Monthly bill, subscriptions, and add-ons '])");
	By mothlyaddonvalue=By.xpath("(//div[text()=' Monthly bill, subscriptions, and add-ons '])//span");
	By renewingfor=By.xpath("(//div[normalize-space(text())='Renewing for'])//span");
	By select=By.xpath("(//button[contains(text(),' Select plan ')])[1]");	
	By selectedplan=By.xpath("(//div[text()=' GPlan 2499 with GCash '])[2]");
	By selectedplanwithdevice=By.xpath("//div[text()=' GPlan 2499 with Device ']");
	By allaccess=By.xpath("(//span[text()='All-access data '])[1]");
	By Gowi=By.xpath("(//span[text()=' GoWifi access '])[1]");
	By callText=By.xpath("(//span[text()=' Call and text '])[1]");
	By contractduration=By.xpath("(//span[text()='Contract duration'])[1]");
	By inclusion=By.xpath("(//span[text()=' Inclusions '])[1]");	
	By Konsulta=By.xpath("(//span[text()=' Konsulta MD Free personal subscription '])[1]");
	By Glnsure=By.xpath("(//span[text()=' Glnsure 3-months subscription '])[1]");
	By VIP=By.xpath("(//span[text()=' iQIYI via GlobeOne app 3 months standard VIP access '])[1]");
	By wetv=By.xpath("(//span[text()=' WeTV via GlobeOne app 3 months standard VIP access '])[1]");
	By Kids=By.xpath("(//span[text()=' Da Vinci Kids via Globe One app 1 month Premium Access '])[1]");
	By skillshare=By.xpath("(//span[text()=' SkillShare via Globe One app 1 month Premium Membership '])[1]");
	By inclusion2=By.xpath("(//span[text()=' Inclusions '])[2]");	
	By Konsulta2=By.xpath("(//span[text()=' Konsulta MD Free personal subscription '])[2]");
	By Glnsure2=By.xpath("(//span[text()=' Glnsure 3-months subscription '])[2]");
	By VIP2=By.xpath("(//span[text()=' iQIYI via GlobeOne app 3 months standard VIP access '])[2]");
	By wetv2=By.xpath("(//span[text()=' WeTV via GlobeOne app 3 months standard VIP access '])[2]");
	By Kids2=By.xpath("(//span[text()=' Da Vinci Kids via Globe One app 1 month Premium Access '])[2]");
	By skillshare2=By.xpath("(//span[text()=' SkillShare via Globe One app 1 month Premium Membership '])[2]");	
	By showmoredevices=By.xpath("//button[text()=' Show more devices ']");
	By appleiphone14pro=By.xpath("//div[text()='Apple iPhone 14 Pro']");
	By selectbutton=By.xpath("//button[text()=' Select ']");	
	By devicedisplay=By.xpath("//img[@alt='Apple iPhone 14 Pro']");
	By devicedetails=By.xpath("//div[text()='Device details']");
	By choosecontractduration=By.xpath("//span[text()='Choose your contract duration']");
	By choosecolour=By.xpath("//span[text()='Choose your color']");
	By choosestoragecapacity=By.xpath("//span[text()='Choose your storage capacity']");
	By shiipindaddress=By.xpath("//span[text()='Shipping Address']");
	By shippingaddressvalue=By.xpath("(//div[@class='go_widget go_sc-shipping'])//span[2]");
	By chnagebutton=By.xpath("(//a[text()='Change'])[2]"); 
	By searchBar=By.xpath("//input[@placeholder='What device you are looking for?']"); 
	By DeviceSelect=By.xpath("//div[@class='go_sc_modal-device-item__title']");	
	By changeaddress=By.xpath("//span[text()='Change shipping address']");
	By house=By.xpath("//span[text()='House']");
	By condo=By.xpath("//span[text()='Condominium']");	
	By floor=By.xpath("//input[@id='base-input1']");
	By buildingname=By.xpath("//label[text()='Building name']");
	By houseNo = By.xpath("//input[@id='base-input3']");
	By street=By.xpath("//input[@id='base-input4']");
	By province=By.xpath("//input[@placeholder='Please select a province']");
	By city=By.xpath("//select[@id='go_billing-info-city']");
	By barangay=By.xpath("//select[@id='go_billing-info-barangay']");	
	By outofdeliveryaddress=By.xpath("//label[text()=' Your address is out of our delivery area. ']");	
	By submitbutton=By.xpath("//button[normalize-space(text())='Submit']");	
	By esim = By.xpath("//span[text()='e-SIM']//parent::label//input");	
	By shippingaddress=By.xpath("(//span[text()='Shipping Address'])//following-sibling::span");

	///////////////////////////////////////*********************??????????????????????????????//////////////////////
	By customizePlan = By.xpath("//label[text()='Customize plan']");
	By gplan599WithDevice = By.xpath("(//div[@class='go_sc-pb__plan-header-main'])//following-sibling::div[contains(text(),'GPlan')]");
	
	//By change=By.xpath("//a[text()='Change']");
	By chooseYourPhone = By.xpath("//span[text()='Choose your phone']");	//Device detalis
	By deviceName = By.xpath("//div[@class='go_sc-choose-your-phone__img']//span");
	By deviceDetails = By.xpath("//div[text()='Device details']");
	By specifications = By.xpath("//div[text()='Device details']//following::p");
			//div[text()='Device details']//following::p[2]");
	By screenSize = By.xpath("//div[text()='Device details']//following::li[1]");
	By camera = By.xpath("//div[text()='Device details']//following::li[2]");
	By battery = By.xpath("//div[text()='Device details']//following::li[3]");
	By memory = By.xpath("//div[text()='Device details']//following::li[4]");
	By display = By.xpath("//div[text()='Device details']//following::li[5]");
	By frontCamera = By.xpath("//div[text()='Device details']//following::li[6]");
	By RAM = By.xpath("//div[text()='Device details']//following::li[7]");
	By hideDetails = By.xpath("//a[text()='Hide details']");
	By showMoreDevices = By.xpath("//button[text()=' Show more devices ']");
	By changeLinkForPlans = By.xpath("(//a[text()='Change'])[1]");	
	By PrefereSIMOrPhysicalSIMCard = By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");
	By physicalSimCard = By.xpath("//span[text()='e-SIM']");
	By all_AccessData = By.xpath("(//span[text()='All-access data ']//following::span)[1]");
	By GoWifi_Access = By.xpath("(//span[text()=' GoWifi access ']//following::span)[1] | (//span[text()=' GoWiFi access ']//following::span)[1]");
	By Call_and_text = By.xpath("(//span[text()=' Call and text '])[1]");
	By Contract_duration = By.xpath("(//span[text()='Contract duration']//following::span)[1]");
	//Inclusions
	By Inclusions = By.xpath("(//span[text()=' Inclusions '])[1]");
	By KonsultaMD = By.xpath("(//span[text()=' Free subscription to KonsultaMD  '])[1]");
	By iQIYI = By.xpath("(//span[text()=' 3-month VIP Access to iQIYI  '])[1]");
	By weTV = By.xpath("(//span[text()=' 3-month VIP Access to weTV  '])[1]");	
	By chooseContractDuration = By.xpath("//span[text()='Choose your contract duration']");
	By chooseYourColor = By.xpath("//span[text()='Choose your color']");
	By deviceColors = By.xpath("//input[@class='gk-color-selector__radio']");
	By chooseStorageCapacity = By.xpath("//span[text()='Choose your storage capacity']//following::div[3]");	
	//Addons
	By pickYourAdd_ons = By.xpath("//div[text()=' Pick your add-ons (as many as you want!) ']");
	By add_ons_Go_On_TopOfYour_Month = By.xpath("//div[text()=' These add-ons go on top of your monthly plan. ']");	
	By Do_you_use_lots_of_data = By.xpath("//span[text()='Do you use lots of data?']");
	By GS_Add_Surf_99 = By.xpath("//div[text()=' GS Add Surf 99 '] | //div[text()=' Add On - GS Add Surf 99 (1GB) ']");	
	By Do_you_love_watching_shows_and_movies = By.xpath("//span[text()='Do you love watching shows and movies?']");
	By Amazon_Prime_Video = By.xpath("//div[normalize-space(text())='Amazon Prime Video'] | //div[normalize-space(text())='Prime Video']");
	By Viu_Premium = By.xpath("//div[text()=' Viu Premium ']");
	By Spotify_Premium = By.xpath("//div[text()=' Spotify Premium ']");	
	By Prefer_talking_over_messaging = By.xpath("//span[text()='Prefer talking over messaging?']");
	By My_Super_Duo = By.xpath("//div[text()=' MySuperDuo ']");	
	By Are_you_all_about_the_jet_setting_lifestyle = By.xpath("//span[text()='Are you all about the jet-setting lifestyle?']");
	By Easy_Roam = By.xpath("//div[text()=' Easy Roam ']");
	By GOCALLIDD_199 = By.xpath("//div[text()=' GOCALLIDD 199 ']");	
	By shippingAddress = By.xpath("(//span[text()='Shipping Address'])//following::span[1]");
	By changeLinkForAddress = By.xpath("(//a[text()='Change'])[2]");
	//Review my plan
	By See_my_new_plan = By.xpath("//button[@class='go_sc-pb__see-plan-toggle-button']");
	By gplan599With_Device = By.xpath("(//div[contains(text(), 'GPlan')])[3]");
	By nameOfDevice = By.xpath("//div[@class='go_sc-rnp-device-vw__details']//span[1]");
	By subscriptionsandAddons = By.xpath("//div[text()=' Subscriptions and Add-ons ']");
	By GSAddSurf = By.xpath("//span[text()='GS Add Surf 99'] | //span[text()='Add On - GS Add Surf 99 (1GB)']");
	By AmazonPrimeVideo = By.xpath("//span[text()='Amazon Prime Video'] | //span[text()='Prime Video']");
	By MySuperDuo = By.xpath("//span[text()='MySuperDuo']");
	By GOCALLIDD = By.xpath("//span[text()='GOCALLIDD 199']");
	By Totalsubscriptionsandaddons = By.xpath("//div[text()=' Total subscriptions and add-ons ']//span");
	By MonthlyPayment = By.xpath("//div[text()=' Monthly payment ']//span");
	By Monthlypaymentincludes = By.xpath("//div[text()=' Monthly payment includes service fee, subscriptions, and add-ons ']");
	By RenewingFor = By.xpath("//div[text()=' Renewing for ']//span");
	By AllAccessData = By.xpath("(//span[text()='All-access data '])[2]");
	By GoWifiAccess = By.xpath("(//span[text()=' GoWifi access '])[2]  | (//span[text()=' GoWiFi access '])[2]");
	By Callandtext = By.xpath("(//span[text()=' Call and text '])[2]");
	By ContractDuration = By.xpath("(//span[text()='Contract duration'])[2]");
	By FreesubscriptiontoKonsultaMD = By.xpath("(//span[text()=' Free subscription to KonsultaMD  '])[2]");
	By ThreemonthVIPAccesstoiQIYI = By.xpath("(//span[text()=' 3-month VIP Access to iQIYI  '])[2]");
	By ThreemonthVIPAccesstoweTV = By.xpath("(//span[text()=' 3-month VIP Access to weTV  '])[2]");
	By SelectPlan = By.xpath("(//button[text()=' Select plan '])[1]");
	////////////////////////////////////************************************////////////////////////////
	By gplan599WithCash = By.xpath("(//div[contains(text(), ' GPlan 599 with GCash')])[1]");	
	//Device detalis	
	By searching_field = By.xpath("//input[@name='search']");
	By Selecteddevice = By.xpath("(//div[@class='go_sc_modal-device-item__title'])");
	By Deviceplan = By.xpath("(//div[@class='go_sc-pb__plan-header']//div)[4]");	
	By Inclusionsplan = By.xpath("(//span[@class='go_sc-accordion__title'])[1]");
	By monthsdisney = By.xpath("(//span[@class='go_sc-accordion__title'])[2]");
	By  Glnsures = By.xpath("(//span[@class='go_sc-accordion__title'])[3]");	
	By Appleiphone14pro=By.xpath("//div[text()='Apple iPhone 14 Pro']");	
	By selectButton=By.xpath("//button[text()=' Select ']");
	By Dav = By.xpath("(//span[text()=' Da Vinci Kids via Globe One app 1 month Premium Access '])[1]");	
	//Addons	
	By ChooseYourUnilapp = By.xpath("//span[text()='Choose your unli app']");
	By Youtube = By.xpath("//div[text()=' YouTube ']");		
	By Glunsurea = By.xpath("(//span[text()=' Glnsure 3-months subscription '])[2]");	
	By DAV = By.xpath("(//span[text()=' Da Vinci Kids via Globe One app 1 month Premium Access '])[2]");	
	By Skillshare = By.xpath("(//span[@class='go_sc-accordion__title'])[7]");
	By PlanGplanwithcash599= By.xpath("(//div[contains(text(), 'GPlan 599 with GCash')])[1]");
	By SeemyplanPlanGplanwithcash599= By.xpath("(//div[contains(text(), 'GPlan 599 with GCash')])[3]");	
	//    3clicks All data
	By KonsultaMBFREE = By.xpath("(//span[@class='go_sc-accordion__title'])[2]");
	By Glunsure= By.xpath("(//span[@class='go_sc-accordion__title'])[3]");
	By GPlanALLDATA799= By.xpath("(//div[contains(text(), ' GPlan SIM-Only All Data 1999')])[4]");		
	By GPlanALLDATA799pricetitle= By.xpath("(//div[contains(text(), ' GPlan SIM-Only All Data 1999')])[4]");		
	By Unli= By.xpath("(//span[text()=' Unli 1 app for 6 months (free data access)  '])[1]");
	By Unli5G= By.xpath("(//span[text()=' Unli 5G for 6 months  '])[1]");
	By Freeindividual= By.xpath("(//span[text()=' Free individual subscription to KonsultaMD  '])[1]");
	By GBStopoints= By.xpath("(//span[text()=' GBs to Points up to 50 GB/month  '])[1]");		
	By Unilpay= By.xpath("(//span[@class='go_sc-accordion__item-title'])[1]");
	By Unilpay5GPay= By.xpath("(//span[@class='go_sc-accordion__item-title'])[2]");
	By UnilpayFREEINDVIDUALPay= By.xpath("(//span[@class='go_sc-accordion__item-title'])[3]");
	By GBStopointsPay= By.xpath("(//span[@class='go_sc-accordion__item-title'])[4]");		
	By SimOnly999 = By.xpath("//div[@class='go_sc-pb__see-plan-section-bill-plan']");
	By CustomerPLAN599 = By.xpath("//div[@class='go_sc-pb__plan-header-title']");
	By GowifiAccess = By.xpath("(//SPAN[@class='go_sc-pb__plan-incl-title'])[2]");		
    By submitButton = By.xpath("//button[text()=' Submit ']");
	/////////////////////////////////////////////////////////////////////////////////////////////////



	By prefersim=By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");
	By esimbutton=By.xpath("//span[text()='e-SIM']");

	By Xiaomi11t=By.xpath("//div[text()='Xiaomi 11T 5G + FREE Speaker']");

	By plane1799withdevice=By.xpath("//div[contains(text(),' GPlan 1799 with Device ')]");

	By plan2499simOnlyalldata=By.xpath("//div[contains(text(),' GPlan SIM-Only All Data 2499 ')]");
	By ZIPcode= By.xpath("//input[@placeholder='ZIP code']");
	
	By esimbreak=By.xpath("(//span[text()='e-SIM'])[2]");
	
	By ESIMIMG=By.xpath("//label[text()=' eSim ']");
	By EsimInfo = By.xpath("//p[contains(normalize-space(text()),'An e-SIM is embedded in your mobile')]");
	By PhysicalSIMInfo = By.xpath("//p[contains(normalize-space(text()),'For new applications, the physical SIM will be sent together with your device.')]");
	By esimmmm=By.xpath("(//span[normalize-space(text())='Inclusions'])[1]//ancestor::div[@class='go_sc-accordion']//span[normalize-space(text())='e-SIM']");
	

	////////////////////////////////////////////Dynamic xpath///////////////////////////////////////////////////////////
	
	
	By selectedplanCustmize=By.xpath("(//div[@class='go_sc-pb__plan-header-main'])//following-sibling::div[contains(text(),'GPlan')]");
	By Devicedetailscustmize=By.xpath("//div[text()='Device details']//following::p");
	By planetypecustbreak=By.xpath("(//div[contains(text(), 'GPlan')])[3]");
	By secondplantype=By.xpath("(//span[text()='All-access data '])//preceding::div[1]");

	

	
	
	
	
	public WebElement get_submitButton() {
		return DriverManager.getDriver().findElement(submitButton);
	}
	
	public WebElement get_houseNo() {
		return DriverManager.getDriver().findElement(houseNo);
	}
	
	public WebElement get_planealldata2499() {
		return DriverManager.getDriver().findElement(planealldata2499);
	}
	public WebElement get_ZIPcode() {
		return DriverManager.getDriver().findElement(ZIPcode);
	}
	
	public WebElement get_esimbutton() {
		return DriverManager.getDriver().findElement(esimbutton);
	}
	
	public WebElement get_prefersim() {
		return DriverManager.getDriver().findElement(prefersim);
	}
	
	public WebElement get_shippingaddress()
	{
		return DriverManager.getDriver().findElement(shippingaddress);

	}	
	public WebElement get_submitbutton()
	{
		return DriverManager.getDriver().findElement(submitbutton);

	}		
	public WebElement get_floor()
	{
		return DriverManager.getDriver().findElement(floor);

	}
	public WebElement get_buildingname()
	{
		return DriverManager.getDriver().findElement(buildingname);

	}
	public WebElement get_street()
	{
		return DriverManager.getDriver().findElement(street);

	}

	/********************************************************************************************************************************/
	public void select_province(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(province));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public void select_city(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(city));
		s.selectByIndex(31);
	}

	/********************************************************************************************************************************/
	public void select_barangay(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(barangay));
		s.selectByIndex(4);
	}

	public WebElement get_condo()
	{
		return DriverManager.getDriver().findElement(condo);
	}
	public WebElement get_chnagebutton()
	{
		return DriverManager.getDriver().findElement(chnagebutton);
	}
	public WebElement get_alldatapermonth()
	{
		return DriverManager.getDriver().findElement(alldatapermonth);
	}
	public WebElement get_gettheseplan()
	{
		return DriverManager.getDriver().findElement(gettheseplan);
	}

	public WebElement get_shippingaddressvalue()
	{
		return DriverManager.getDriver().findElement(shippingaddressvalue);
	}
	public WebElement get_selectbutton()
	{
		return DriverManager.getDriver().findElement(selectbutton);
	}
	public WebElement get_showmoredevices()
	{
		return DriverManager.getDriver().findElement(showmoredevices);
	}
	public WebElement get_appleiphone13pro()
	{
		return DriverManager.getDriver().findElement(appleiphone14pro);
	}
	public WebElement get_inclusion2()
	{
		return DriverManager.getDriver().findElement(inclusion2);
	}

	public WebElement get_gopdgpage() {
		return DriverManager.getDriver().findElement(gopdgpage);
	}
	public WebElement get_stayhere() {
		return DriverManager.getDriver().findElement(stayhere);
	}

	public WebElement get_inclusion()
	{
		return DriverManager.getDriver().findElement(inclusion);
	}

	public WebElement get_select()
	{
		return DriverManager.getDriver().findElement(select);
	}

	public WebElement get_planename()
	{
		return DriverManager.getDriver().findElement(planename);

	}
	public WebElement get_selectplan()
	{
		return DriverManager.getDriver().findElement(selectplan);
	}
	public WebElement get_editmyplan()
	{
		return DriverManager.getDriver().findElement(editmyplan);
	}
	public WebElement get_change()

	{
		return DriverManager.getDriver().findElement(change);

	}
	public WebElement get_plane2499()
	{
		return DriverManager.getDriver().findElement(plane2499);
	}
	public WebElement get_plane2499withdevice()
	{
		return DriverManager.getDriver().findElement(plane2499withdevice);
	}
	public WebElement get_searchBar()
	{
		return DriverManager.getDriver().findElement(searchBar);
	}
	public WebElement get_Gcash()
	{
		return DriverManager.getDriver().findElement(Gcash);
	}
	public WebElement get_device()
	{
		return DriverManager.getDriver().findElement(device);
	}
	public WebElement get_SeeMyNewPlan() {

		return DriverManager.getDriver().findElement(SeeMyNewPlan);
	}
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

	public WebElement get_GSSurfAdd99() {

		return DriverManager.getDriver().findElement(GSSurfAdd99);
	}


	/********************************************************************************************************************************/
	public WebElement get_EasyRoam() {

		return DriverManager.getDriver().findElement(EasyRoam);
	}
	public WebElement get_esim() {

		return DriverManager.getDriver().findElement(esim);
	}
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
	public WebElement get_DeviceSelect() {
		return DriverManager.getDriver().findElement(DeviceSelect);
	}
	public WebElement get_JetSettingLifeStyle() {
		return DriverManager.getDriver().findElement(JetSettingLifeStyle);
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////


	/********************************************************************************************************************************/
	public WebElement get_deviceName() {
		return DriverManager.getDriver().findElement(deviceName);
	}

	/********************************************************************************************************************************/
	public WebElement get_hideDetails() {
		return DriverManager.getDriver().findElement(hideDetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_showMoreDevices() {
		return DriverManager.getDriver().findElement(showMoreDevices);
	}

	/********************************************************************************************************************************/
	public WebElement get_screenSize() {
		return DriverManager.getDriver().findElement(screenSize);
	}

	/********************************************************************************************************************************/
	public WebElement get_camera() {
		return DriverManager.getDriver().findElement(camera);
	}

	/********************************************************************************************************************************/
	public WebElement get_battery() {
		return DriverManager.getDriver().findElement(battery);
	}

	/********************************************************************************************************************************/
	public WebElement get_memory() {
		return DriverManager.getDriver().findElement(memory);
	}

	/********************************************************************************************************************************/
	public WebElement get_display() {
		return DriverManager.getDriver().findElement(display);
	}

	/********************************************************************************************************************************/
	public WebElement get_frontCamera() {
		return DriverManager.getDriver().findElement(frontCamera);
	}

	/********************************************************************************************************************************/
	public WebElement get_RAM() {
		return DriverManager.getDriver().findElement(RAM);
	}

	/********************************************************************************************************************************/
	public WebElement get_all_AccessData() {
		return DriverManager.getDriver().findElement(all_AccessData);
	}

	/********************************************************************************************************************************/
	public WebElement get_GoWifi_Access() {
		return DriverManager.getDriver().findElement(GoWifi_Access);
	}

	/********************************************************************************************************************************/
	public WebElement get_Contract_duration() {
		return DriverManager.getDriver().findElement(Contract_duration);
	}

	/********************************************************************************************************************************/
	public WebElement get_chooseStorageCapacity() {
		return DriverManager.getDriver().findElement(chooseStorageCapacity);
	}

	/********************************************************************************************************************************/
	public WebElement get_Do_you_use_lots_of_data() {
		return DriverManager.getDriver().findElement(Do_you_use_lots_of_data);
	}

	/********************************************************************************************************************************/
	public WebElement get_GS_Add_Surf_99() {
		return DriverManager.getDriver().findElement(GS_Add_Surf_99);
	}

	/********************************************************************************************************************************/
	public WebElement get_Do_you_love_watching_shows_and_movies() {
		return DriverManager.getDriver().findElement(Do_you_love_watching_shows_and_movies);
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
	public WebElement get_Prefer_talking_over_messaging() {
		return DriverManager.getDriver().findElement(Prefer_talking_over_messaging);
	}

	/********************************************************************************************************************************/
	public WebElement get_MyDuo() {
		return DriverManager.getDriver().findElement(MyDuo);
	}

	/********************************************************************************************************************************/
	public WebElement get_My_Super_Duo() {
		return DriverManager.getDriver().findElement(My_Super_Duo);
	}

	/********************************************************************************************************************************/
	public WebElement get_Are_you_all_about_the_jet_setting_lifestyle() {
		return DriverManager.getDriver().findElement(Are_you_all_about_the_jet_setting_lifestyle);
	}

	/********************************************************************************************************************************/
	public WebElement get_Easy_Roam() {
		return DriverManager.getDriver().findElement(Easy_Roam);
	}

	/********************************************************************************************************************************/
	public WebElement get_GOCALLIDD_199() {
		return DriverManager.getDriver().findElement(GOCALLIDD_199);
	}

	/********************************************************************************************************************************/
	public WebElement get_changeLinkForAddress() {
		return DriverManager.getDriver().findElement(changeLinkForAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_See_my_new_plan() {
		return DriverManager.getDriver().findElement(See_my_new_plan);
	}

	/********************************************************************************************************************************/
	public WebElement get_nameOfDevice() {
		return DriverManager.getDriver().findElement(nameOfDevice);
	}

	/********************************************************************************************************************************/
	public WebElement get_Totalsubscriptionsandaddons() {
		return DriverManager.getDriver().findElement(Totalsubscriptionsandaddons);
	}

	public WebElement get_gplan599With_Device()
	{
		return DriverManager.getDriver().findElement(gplan599With_Device);
	}
	/********************************************************************************************************************************/
	public WebElement get_MonthlyPayment() {
		return DriverManager.getDriver().findElement(MonthlyPayment);
	}

	/********************************************************************************************************************************/
	public WebElement get_RenewingFor() {
		return DriverManager.getDriver().findElement(RenewingFor);
	}

	/********************************************************************************************************************************/
	public WebElement get_SelectPlan() {
		return DriverManager.getDriver().findElement(SelectPlan);
	}

	/********************************************************************************************************************************/
	public WebElement get_physicalSimCard() {
		return DriverManager.getDriver().findElement(physicalSimCard);
	}
	public WebElement get_Appleiphone14pro()
	{
		return DriverManager.getDriver().findElement(Appleiphone14pro);
	}
	public WebElement get_selectButton()
	{
		return DriverManager.getDriver().findElement(selectButton);
	}
	public WebElement get_searching_field()
	{
		return DriverManager.getDriver().findElement(searching_field);
	}

	public WebElement get_Selecteddevice()
	{
		return DriverManager.getDriver().findElement(Selecteddevice);
	}
	/********************************************************************************************************************************/
	public WebElement get_deviceDetails() {
		return DriverManager.getDriver().findElement(deviceDetails);
	}
	/********************************************************************************************************************************/
	public WebElement get_Deviceplan() {
		return DriverManager.getDriver().findElement(Deviceplan);
	}
	/********************************************************************************************************************************/
	public WebElement get_Call_and_text() {
		return DriverManager.getDriver().findElement(Call_and_text);
	}
	/********************************************************************************************************************************/
	public WebElement get_specifications() {
		return DriverManager.getDriver().findElement(specifications);
	}
	/********************************************************************************************************************************/
	public WebElement get_Inclusionsplan() {
		return DriverManager.getDriver().findElement(Inclusionsplan);
	}
	/********************************************************************************************************************************/
	public WebElement get_monthsdisney() {
		return DriverManager.getDriver().findElement(monthsdisney);
	}
	/********************************************************************************************************************************/
	public WebElement get_Glnsures() {
		return DriverManager.getDriver().findElement(Glnsures);
	}
	/********************************************************************************************************************************/
	public WebElement get_ChooseYourUnilapp() {
		return DriverManager.getDriver().findElement(ChooseYourUnilapp);
	}
	public WebElement get_Youtube() {
		return DriverManager.getDriver().findElement(Youtube);
	}
	//3 CLICKS ALL DATA 
	public WebElement get_KonsultaMBFREE() {
		return DriverManager.getDriver().findElement(KonsultaMBFREE);
	}

	public WebElement get_Glunsure() {
		return DriverManager.getDriver().findElement(Glunsure);
	}

	public WebElement get_GPlanALLDATA799() {
		return DriverManager.getDriver().findElement(GPlanALLDATA799);
	}

	public WebElement get_GPlanALLDATA799pricetitle() {
		return DriverManager.getDriver().findElement(GPlanALLDATA799pricetitle);
	}

	public WebElement get_KonsultaMD() {
		return DriverManager.getDriver().findElement(KonsultaMD);
	}

	public WebElement get_Glnsure() {
		return DriverManager.getDriver().findElement(Glnsure);
	}

	public WebElement get_iQIYI() {
		return DriverManager.getDriver().findElement(iQIYI);
	}
	public WebElement get_weTV() {
		return DriverManager.getDriver().findElement(weTV);
	}
	public WebElement get_Dav() {
		return DriverManager.getDriver().findElement(Dav);
	}//3 clicks Gcash
	public WebElement get_PlanGplanwithcash599() {
		return DriverManager.getDriver().findElement(PlanGplanwithcash599);
	}
	public WebElement get_SeemyplanPlanGplanwithcash599() {
		return DriverManager.getDriver().findElement(SeemyplanPlanGplanwithcash599);
	}
	public WebElement get_SimOnly999() {
		return DriverManager.getDriver().findElement(SimOnly999);
	}
	public WebElement get_CustomerPLAN599() {
		return DriverManager.getDriver().findElement(CustomerPLAN599);
	}
	public WebElement get_GowifiAccess() {
		return DriverManager.getDriver().findElement(GowifiAccess);
	}
	/********************************************************************************************************************************/
	public WebElement get_FreesubscriptiontoKonsultaMD() {
		return DriverManager.getDriver().findElement(FreesubscriptiontoKonsultaMD);
	}
	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_ThreemonthVIPAccesstoiQIYI() {
		return DriverManager.getDriver().findElement(ThreemonthVIPAccesstoiQIYI);
	}
	/********************************************************************************************************************************/
	public WebElement get_ThreemonthVIPAccesstoweTV() {
		return DriverManager.getDriver().findElement( ThreemonthVIPAccesstoweTV);
	}
	/********************************************************************************************************************************/
	public WebElement get_DAV() {
		return DriverManager.getDriver().findElement(DAV);
	}
	/********************************************************************************************************************************/
	public WebElement get_Skillshare() {
		return DriverManager.getDriver().findElement(Skillshare);
	}
	/********************************************************************************************************************************/
	public WebElement get_Glunsurea() {
		return DriverManager.getDriver().findElement(Glunsurea);
	}
	//3 clicks Simonly
	/********************************************************************************************************************************/
	public WebElement get_Unli() {
		return DriverManager.getDriver().findElement(Unli);
	}

	/********************************************************************************************************************************/
	public WebElement get_Unli5G() {
		return DriverManager.getDriver().findElement(Unli5G);
	}
	/********************************************************************************************************************************/
	public WebElement get_Freeindividual() {
		return DriverManager.getDriver().findElement(Freeindividual);
	}

	public WebElement get_GBStopoints() {
		return DriverManager.getDriver().findElement(GBStopoints);
	}

	/********************************************************************************************************************************/
	public WebElement get_GBStopointsPay() {
		return DriverManager.getDriver().findElement(GBStopointsPay);
	}
	public WebElement get_renewingfor() {
		return DriverManager.getDriver().findElement(renewingfor);
	}

	/********************************************************************************************************************************/
	
	public WebElement get_Unilpay() {
		return DriverManager.getDriver().findElement(Unilpay);
	}

	/********************************************************************************************************************************/
	public WebElement get_Unilpay5GPay() {
		return DriverManager.getDriver().findElement(Unilpay5GPay);
	}

	/********************************************************************************************************************************/
	public WebElement get_UnilpayFREEINDVIDUALPay() {
		return DriverManager.getDriver().findElement(UnilpayFREEINDVIDUALPay);
	}

	
	public WebElement get_alldata() {
		return DriverManager.getDriver().findElement(alldata);
	}
	public WebElement get_plan2499simOnlyalldata() {
		return DriverManager.getDriver().findElement(plan2499simOnlyalldata);
	}
	
	
	public WebElement get_plane1799withdevice()
	{
		return DriverManager.getDriver().findElement(plane1799withdevice);
	}
	
	public WebElement get_Xiaomi11t()
	{
		return DriverManager.getDriver().findElement(Xiaomi11t);
	}	
	public WebElement get_secondplantype()
	{
		return DriverManager.getDriver().findElement(secondplantype);
	}
	public WebElement get_shippingAddress()
	{
		return DriverManager.getDriver().findElement(shippingAddress);
	}
	public WebElement get_province()
	{
		return DriverManager.getDriver().findElement(province);
	}
	/**
	 * @throws Exception ******************************************************************************************************************************/


	////////////////////////////////////////////////////////////////////////////////////////////////////////

	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		case "tittle":
			flag = waitForElementVisibility(tittle, waitTime);
			break;
		case "EasyRoambreak":
			flag = waitForElementVisibility(EasyRoambreak, waitTime);
			break;
		case "alldatapermonth":
			flag = waitForElementVisibility(alldatapermonth, waitTime);
			break;
		case"ESIMIMG":
			flag = waitForElementVisibility(ESIMIMG, waitTime);
			break;
		case "ViuPremiumbreak":
			flag = waitForElementVisibility(ViuPremiumbreak, waitTime);
			break;
		case "secondplantype":
			flag = waitForElementVisibility(secondplantype, waitTime);
			break;
		case "esimbreak":
			flag = waitForElementVisibility(esimbreak, waitTime);
			break;
		case "prefersim":
			flag = waitForElementVisibility(prefersim, waitTime);
			break;
		case "calldata":
			flag = waitForElementVisibility(calldata, waitTime);
			break;
		case"outofdeliveryaddress":
			flag = waitForElementVisibility(outofdeliveryaddress, waitTime);
			break;
		case "wifidata":
			flag = waitForElementVisibility(wifidata, waitTime);
			break;
		case "unlimiteddata":
			flag = waitForElementVisibility(unlimiteddata, waitTime);
			break;
		case "inclusiontypesdata":
			flag = waitForElementVisibility(inclusiontypesdata, waitTime);
			break;
		case "gettheseplan":
			flag = waitForElementVisibility(gettheseplan, waitTime);
			break;
		case "plane2499withdevice":
			flag = waitForElementVisibility(plane2499withdevice, waitTime);
			break;
		case "planename":
			flag = waitForElementVisibility(planename, waitTime);
			break;
		case "pick":
			flag = waitForElementVisibility(pick, waitTime);
			break;
		case "showmoredevices":
			flag = waitForElementVisibility(showmoredevices, waitTime);
			break;
		case "selectbutton":
			flag = waitForElementVisibility(selectbutton, waitTime);
			break;
		case "change":
			flag = waitForElementVisibility(change, waitTime);
			break;
		case "shiipindaddress":
			flag = waitForElementVisibility(shiipindaddress, waitTime);
			break;
		case "shippingaddressvalue":
			flag = waitForElementVisibility(shippingaddressvalue, waitTime);
			break;
			
		case "chnagebutton":
			flag = waitForElementVisibility(chnagebutton, waitTime);
			break;
		case "devicedisplay":
			flag = waitForElementVisibility(devicedisplay, waitTime);
			break;
		case "devicedetails":
			flag = waitForElementVisibility(devicedetails, waitTime);
			break;
		case "choosecontractduration":
			flag = waitForElementVisibility(choosecontractduration, waitTime);
			break;
		case "choosecolour":
			flag = waitForElementVisibility(choosecolour, waitTime);
			break;
		case "choosestoragecapacity":
			flag = waitForElementVisibility(choosestoragecapacity, waitTime);
			break;
		case "chooseStorageCapacity":
			flag = waitForElementVisibility(choosestoragecapacity, waitTime);
			break;
		case "submitButton":
			flag = waitForElementVisibility(submitButton, waitTime);
			break;
		case "Gcash":
			flag = waitForElementVisibility(Gcash, waitTime);
			break;
		case "Simonly":
			flag = waitForElementVisibility(Simonly, waitTime);
			break;
		case "device":
			flag = waitForElementVisibility(device, waitTime);
			break;
		case "alldata":
			flag = waitForElementVisibility(alldata, waitTime);
			break;
		case "datapermonth":
			flag = waitForElementVisibility(datapermonth, waitTime);
			break;
		case "call":
			flag = waitForElementVisibility(call, waitTime);
			break;
		case "wifi":
			flag = waitForElementVisibility(wifi, waitTime);
			break;
		case "unlimited":
			flag = waitForElementVisibility(unlimited, waitTime);
			break;
		case "inclusiontypes":
			flag = waitForElementVisibility(inclusiontypes, waitTime);
			break;
		case "continuetheplan":
			flag = waitForElementVisibility(continuetheplan, waitTime);
			break;
		case "stayhere":
			flag = waitForElementVisibility(stayhere, waitTime);
			break;
		case "gopdgpage":
			flag = waitForElementVisibility(gopdgpage, waitTime);
			break;

		case "plane2499":
			flag = waitForElementVisibility(plane2499, waitTime);
			break;
		case "selectplan":
			flag = waitForElementVisibility(selectplan, waitTime);
			break;
		case "AmazonPrime":
			flag = waitForElementVisibility(AmazonPrime, waitTime);
			break;
		
		case "SpotifyPremium":
			flag = waitForElementVisibility(SpotifyPremium, waitTime);
			break;
		case "house":
			flag = waitForElementVisibility(house, waitTime);
			break;
		case "condo":
			flag = waitForElementVisibility(condo, waitTime);
			break;
		case "SeeMyNewPlan":
			flag = waitForElementVisibility(SeeMyNewPlan, waitTime);
			break;

		
		case "GSSurfAdd99":
			flag = waitForElementVisibility(GSSurfAdd99, waitTime);
			break;
		case "plantype":
			flag = waitForElementVisibility(plantype, waitTime);
			break;
		case "allaccessdata":
			flag = waitForElementVisibility(allaccessdata, waitTime);
			break;
		case "Gowifi":
			flag = waitForElementVisibility(Gowifi, waitTime);
			break;
		case "calltext":
			flag = waitForElementVisibility(calltext, waitTime);
			break;
		case "contarct":
			flag = waitForElementVisibility(contarct, waitTime);
			break;
		case "plnefinal":
			flag = waitForElementVisibility(plnefinal, waitTime);
			break;
		case "planevalue":
			flag = waitForElementVisibility(planevalue, waitTime);
			break;
		case "monthlypayment":
			flag = waitForElementVisibility(monthlypayment, waitTime);
			break;
		case "mothlypaymentvalue":
			flag = waitForElementVisibility(mothlypaymentvalue, waitTime);
			break;
		case "gsadd":
			flag = waitForElementVisibility(gsadd, waitTime);
			break;
		case "apv":
			flag = waitForElementVisibility(apv, waitTime);
			break;
		case "viu":
			flag = waitForElementVisibility(viu, waitTime);
			break;
		case "Duo":
			flag = waitForElementVisibility(Duo, waitTime);
			break;
		case "easy":
			flag = waitForElementVisibility(easy, waitTime);
			break;
		case "total":
			flag = waitForElementVisibility(total, waitTime);
			break;
		case "taotalvalue":
			flag = waitForElementVisibility(taotalvalue, waitTime);
			break;
		case "maothlyaddons":
			flag = waitForElementVisibility(maothlyaddons, waitTime);
			break;
		case "mothlyaddonvalue":
			flag = waitForElementVisibility(mothlyaddonvalue, waitTime);
			break;
		case "renewingfor":
			flag = waitForElementVisibility(renewingfor, waitTime);
			break;
		case "select":
			flag = waitForElementVisibility(select, waitTime);
			break;
		case "selectedplan":
			flag = waitForElementVisibility(selectedplan, waitTime);
			break;
		case "selectedplanwithdevice":
			flag = waitForElementVisibility(selectedplanwithdevice, waitTime);
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
		case "inclusion2":
			flag = waitForElementVisibility(inclusion2, waitTime);
			break;
		case "Konsulta2":
			flag = waitForElementVisibility(Konsulta2, waitTime);
			break;
		case "Glnsure2":
			flag = waitForElementVisibility(Glnsure2, waitTime);
			break;
		case "VIP2":
			flag = waitForElementVisibility(VIP2, waitTime);
			break;
		case "wetv2":
			flag = waitForElementVisibility(wetv2, waitTime);
			break;
		case "Kids2":
			flag = waitForElementVisibility(Kids2, waitTime);
			break;
		case "skillshare2":
			flag = waitForElementVisibility(skillshare2, waitTime);
			break;
		case "customizePlan":
			flag = waitForElementVisibility(customizePlan, waitTime);
			break;
		case "gplan599WithDevice":
			flag = waitForElementVisibility(gplan599WithDevice, waitTime);
			break;
		case "chooseYourPhone":
			flag = waitForElementVisibility(chooseYourPhone, waitTime);
			break;	
		case "deviceName":
			flag = waitForElementVisibility(deviceName, waitTime);
			break;
		case "deviceDetails":
			flag = waitForElementVisibility(deviceDetails, waitTime);
			break;
		case "specifications":
			flag = waitForElementVisibility(specifications, waitTime);
			break;	
		case "screenSize":
			flag = waitForElementVisibility(screenSize, waitTime);
			break;	
		case "camera":
			flag = waitForElementVisibility(camera, waitTime);
			break;
		case "battery":
			flag = waitForElementVisibility(battery, waitTime);
			break;	
		case "memory":
			flag = waitForElementVisibility(memory, waitTime);
			break;
		case "display":
			flag = waitForElementVisibility(display, waitTime);
			break;
		case "frontCamera":
			flag = waitForElementVisibility(frontCamera, waitTime);
			break;
		case "RAM":
			flag = waitForElementVisibility(RAM, waitTime);
			break;
		case "hideDetails":
			flag = waitForElementVisibility(hideDetails, waitTime);
			break;	
		case "showMoreDevices":
			flag = waitForElementVisibility(showMoreDevices, waitTime);
			break;
		case "all_AccessData":
			flag = waitForElementVisibility(all_AccessData, waitTime);
			break;
		case "GoWifi_Access":
			flag = waitForElementVisibility(GoWifi_Access, waitTime);
			break;
		case "Call_and_text":
			flag = waitForElementVisibility(Call_and_text, waitTime);
			break;
		case "Contract_duration":
			flag = waitForElementVisibility(Contract_duration, waitTime);
			break;
		case "Inclusions":
			flag = waitForElementVisibility(Inclusions, waitTime);
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
		case "chooseContractDuration":
			flag = waitForElementVisibility(chooseContractDuration, waitTime);
			break;
		case "chooseYourColor":
			flag = waitForElementVisibility(chooseYourColor, waitTime);
			break;
		case "deviceColors":
			flag = waitForElementVisibility(deviceColors, waitTime);
			break;
		case "pickYourAdd_ons":
			flag = waitForElementVisibility(pickYourAdd_ons, waitTime);
			break;
		case "add_ons_Go_On_TopOfYour_Month":
			flag = waitForElementVisibility(add_ons_Go_On_TopOfYour_Month, waitTime);
			break;	
		case "Do_you_use_lots_of_data":
			flag = waitForElementVisibility(Do_you_use_lots_of_data, waitTime);
			break;	
		case "GS_Add_Surf_99":
			flag = waitForElementVisibility(GS_Add_Surf_99, waitTime);
			break;
		case "Do_you_love_watching_shows_and_movies":
			flag = waitForElementVisibility(Do_you_love_watching_shows_and_movies, waitTime);
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
		case "Prefer_talking_over_messaging":
			flag = waitForElementVisibility(Prefer_talking_over_messaging, waitTime);
			break;
		case "MyDuo":
			flag = waitForElementVisibility(MyDuo, waitTime);
			break;
		case "My_Super_Duo":
			flag = waitForElementVisibility(My_Super_Duo, waitTime);
			break;
		case "Are_you_all_about_the_jet_setting_lifestyle":
			flag = waitForElementVisibility(Are_you_all_about_the_jet_setting_lifestyle, waitTime);
			break;	
		case "Easy_Roam":
			flag = waitForElementVisibility(Easy_Roam, waitTime);
			break;
		case "GOCALLIDD_199":
			flag = waitForElementVisibility(GOCALLIDD_199, waitTime);
			break;	
		case "changeLinkForAddress":
			flag = waitForElementVisibility(changeLinkForAddress, waitTime);
			break;
		case "shippingAddress":
			flag = waitForElementVisibility(shippingAddress, waitTime);
			break;
		case "See_my_new_plan":
			flag = waitForElementVisibility(See_my_new_plan, waitTime);
			break;
		case "changeLinkForPlans":
			flag = waitForElementVisibility(changeLinkForPlans, waitTime);
			break;	
		case "gplan599With_Device":
			flag = waitForElementVisibility(gplan599With_Device, waitTime);
			break;
		case "nameOfDevice":
			flag = waitForElementVisibility(nameOfDevice, waitTime);
			break;
		case "subscriptionsandAddons":
			flag = waitForElementVisibility(subscriptionsandAddons, waitTime);
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
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;
		case "Totalsubscriptionsandaddons":
			flag = waitForElementVisibility(Totalsubscriptionsandaddons, waitTime);
			break;
		case "MonthlyPayment":
			flag = waitForElementVisibility(MonthlyPayment, waitTime);
			break;
		case "Monthlypaymentincludes":
			flag = waitForElementVisibility(Monthlypaymentincludes, waitTime);
			break;
		case "RenewingFor":
			flag = waitForElementVisibility(RenewingFor, waitTime);
			break;	
		case "AllAccessData":
			flag = waitForElementVisibility(AllAccessData, waitTime);
			break;	
		case "GoWifiAccess":
			flag = waitForElementVisibility(GoWifiAccess, waitTime);
			break;	
		case "Callandtext":
			flag = waitForElementVisibility(Callandtext, waitTime);
			break;	
		case "ContractDuration":
			flag = waitForElementVisibility(ContractDuration, waitTime);
			break;	
		case "FreesubscriptiontoKonsultaMD":
			flag = waitForElementVisibility(FreesubscriptiontoKonsultaMD, waitTime);
			break;	
		case "ThreemonthVIPAccesstoiQIYI":
			flag = waitForElementVisibility(ThreemonthVIPAccesstoiQIYI, waitTime);
			break;	
		case "ThreemonthVIPAccesstoweTV":
			flag = waitForElementVisibility(ThreemonthVIPAccesstoweTV, waitTime);
			break;
		case "SelectPlan":
			flag = waitForElementVisibility(SelectPlan, waitTime);
			break;
		case "PrefereSIMOrPhysicalSIMCard":
			flag = waitForElementVisibility(PrefereSIMOrPhysicalSIMCard, waitTime);
			break;				
		case "searching_field":
			flag = waitForElementVisibility(searching_field, waitTime);
			break;		
		case "Inclusionsplan":
			flag = waitForElementVisibility(Inclusionsplan, waitTime);
			break;
		case "monthsdisney":
			flag = waitForElementVisibility(monthsdisney, waitTime);
			break;	
		case "Glnsures":
			flag = waitForElementVisibility(Glnsures, waitTime);
			break;			
		case "selectButton":
			flag = waitForElementVisibility(selectButton, waitTime);
			break;
		case "Dav":
			flag = waitForElementVisibility(Dav, waitTime);
			break;			
//			3 clicks Gcash
		case "PlanGplanwithcash599":
			flag = waitForElementVisibility(PlanGplanwithcash599, waitTime);
			break;	
		case "SeemyplanPlanGplanwithcash599":
			flag = waitForElementVisibility(SeemyplanPlanGplanwithcash599, waitTime);
			break;
		case "SimOnly999":
			flag = waitForElementVisibility(SimOnly999, waitTime);
			break;
		case "CustomerPLAN599 ":
			flag = waitForElementVisibility(CustomerPLAN599 , waitTime);
			break;
		case "GowifiAccess ":
			flag = waitForElementVisibility(GowifiAccess , waitTime);
			break;			
		case "ChooseYourUnilapp":
			flag = waitForElementVisibility(ChooseYourUnilapp, waitTime);
			break;		
		case "Youtube":
			flag = waitForElementVisibility(Youtube, waitTime);
			break;				
		case "DAV":
			flag = waitForElementVisibility(DAV, waitTime);
			break;		
		case "Skillshare":
			flag = waitForElementVisibility(Skillshare, waitTime);
			break;	
		case "KonsultaMBFREE":
			flag = waitForElementVisibility(KonsultaMBFREE, waitTime);
			break;	
		case "Glunsure":
			flag = waitForElementVisibility(Glunsure, waitTime);
			break;	
		case "GPlanALLDATA799pricetitle":
			flag = waitForElementVisibility(GPlanALLDATA799pricetitle, waitTime);
			break;			
		case "Freeindividual":
			flag = waitForElementVisibility(Freeindividual, waitTime);
			break;
		case "Unli":
			flag = waitForElementVisibility(Unli, waitTime);
			break;
		case "Unli5G":
			flag = waitForElementVisibility(Unli5G, waitTime);
			break;
		case "GBStopoints":
			flag = waitForElementVisibility(GBStopoints, waitTime);
			break;
		case "Unilpay":
			flag = waitForElementVisibility(Unilpay, waitTime);
			break;
		case "Unilpay5GPay":
			flag = waitForElementVisibility(Unilpay5GPay, waitTime);
			break;
		case "UnilpayFREEINDVIDUALPay":
			flag = waitForElementVisibility(UnilpayFREEINDVIDUALPay, waitTime);
			break;
		case "GBStopointsPay":
			flag = waitForElementVisibility(GBStopointsPay, waitTime);
			break;
			
		case "Xiaomi11t":
			flag = waitForElementVisibility(Xiaomi11t, waitTime);
			break;	
		
		case "editmyplan":
			flag = waitForElementVisibility(editmyplan, waitTime);
			break;
		case "plane1799withdevice":
			flag = waitForElementVisibility(plane1799withdevice, waitTime);
			break;
		
		case "plan2499simOnlyalldata":
			flag = waitForElementVisibility(plan2499simOnlyalldata, waitTime);
			break;
		case "ChooseYourPlan":
			flag = waitForElementVisibility(ChooseYourPlan, waitTime);
			break;
		case "iIcon":
			flag = waitForElementVisibility(iIcon, waitTime);
			break;
		case "EsimInfo":
			flag = waitForElementVisibility(EsimInfo, waitTime);
			break;
		case "PhysicalSIMInfo":
			flag = waitForElementVisibility(PhysicalSIMInfo, waitTime);
			break;
			

		
		}
		if (flag) {
			//			ExtentTestManager.logInfo(message + " - exists");
			System.out.println(message + " - exists");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");
		} else {
			//			ExtentTestManager.logFail(message + " - do not exists");
			System.out.println(message + " - do not exist");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should is visible on the Application","'"+element+"' is not visbile on the page","Failed");
		}

		return flag;


	}
	public void clickOnElement(String type, String eleName, String element) throws Exception {

		try {
			switch (element) {
			case "GSSurfAdd99":
				get_GSSurfAdd99().click();
				break;
			case "SeeMyNewPlan":
				get_SeeMyNewPlan().click();
				break;
				
			case "select":
				get_select().click();
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
			case "inclusion":
				get_inclusion().click();
				break;


			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + eleName + " : " + "Element is not clickable : " + e1.getMessage());
			Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button is unsuccessfull.","Failed");
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + eleName + " : " + "Element not found : " + e2.getMessage());
			Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button is unsuccessfull.","Failed");
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + eleName + " : " + "Exception : " + e.getMessage());
			Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button is unsuccessfull.","Failed");
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + type + " : " + eleName);
		Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicked on '"+element+"' button.","Passed");

	}

	public void jsClick(String message, String element) throws Exception {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "esim":
				jse.executeScript("arguments[0].click();", get_esim());		
				break;
			case "hideDetails":
		         jse.executeScript("arguments[0].click();", get_hideDetails());		
		         break;
			case "selectButton":
				jse.executeScript("arguments[0].click();", get_selectButton());		
		         break;
			case "showMoreDevices":
		         jse.executeScript("arguments[0].click();", get_showMoreDevices());		
		         break;
			case "Do_you_use_lots_of_data":
		         jse.executeScript("arguments[0].click();", get_Do_you_use_lots_of_data());		
		         break; 
			case "GS_Add_Surf_99":
		         jse.executeScript("arguments[0].click();", get_GS_Add_Surf_99());		
		         break; 
			case "Do_you_love_watching_shows_and_movies":
		         jse.executeScript("arguments[0].click();", get_Do_you_love_watching_shows_and_movies());		
		         break;  
			case "Amazon_Prime_Video":
		         jse.executeScript("arguments[0].click();", get_Amazon_Prime_Video());		
		         break;   
			case "Viu_Premium":
		         jse.executeScript("arguments[0].click();", get_Viu_Premium());		
		         break;
			case "Spotify_Premium":
		         jse.executeScript("arguments[0].click();", get_Spotify_Premium());		
		         break;
			case "Prefer_talking_over_messaging":
		         jse.executeScript("arguments[0].click();", get_Prefer_talking_over_messaging());		
		         break; 
			case "MyDuo":
		         jse.executeScript("arguments[0].click();", get_MyDuo());		
		         break; 
			case "My_Super_Duo":
		         jse.executeScript("arguments[0].click();", get_My_Super_Duo());		
		         break;
			case "Are_you_all_about_the_jet_setting_lifestyle":
		         jse.executeScript("arguments[0].click();", get_Are_you_all_about_the_jet_setting_lifestyle());		
		         break; 
			case "Easy_Roam":
		         jse.executeScript("arguments[0].click();", get_Easy_Roam());		
		         break;
			case "GOCALLIDD_199":
		         jse.executeScript("arguments[0].click();", get_GOCALLIDD_199());		
		         break;
			case "changeLinkForAddress":
		         jse.executeScript("arguments[0].click();", get_changeLinkForAddress());		
		         break; 
			case "See_my_new_plan":
		         jse.executeScript("arguments[0].click();", get_See_my_new_plan());		
		         break;
			case "SelectPlan":
		         jse.executeScript("arguments[0].click();", get_SelectPlan());		
		         break;
			case "physicalSimCard":
		         jse.executeScript("arguments[0].click();", get_physicalSimCard());		
		         break; 
			case "selectplan":
		         jse.executeScript("arguments[0].click();", get_selectplan());		
		         break;
						
			case "submitButton":
		         jse.executeScript("arguments[0].click();", get_submitButton());		
		         break; 
			case "ChooseYourUnilapp":
		         jse.executeScript("arguments[0].click();", get_ChooseYourUnilapp());		
		         break; 
		         
			case "Youtube":
		         jse.executeScript("arguments[0].click();", get_Youtube());		
		         break;
		         
			
			case "Selecteddevice":
		         jse.executeScript("arguments[0].click();", get_Selecteddevice());		
		         break;
			
			case "Gcash":
		         jse.executeScript("arguments[0].click();", get_Gcash());		
		         break;
			case "device":
		         jse.executeScript("arguments[0].click();", get_device());		
		         break;
			case "alldata":
		         jse.executeScript("arguments[0].click();", get_alldata());		
		         break;
			case "plan2499simOnlyalldata":
		         jse.executeScript("arguments[0].click();", get_plan2499simOnlyalldata());		
		         break;
			case "province":
		         jse.executeScript("arguments[0].click();", get_province());		
		         break;
		         
			case "change":
		         jse.executeScript("arguments[0].click();", get_change());		
		         break;
			case "showmoredevices":
		         jse.executeScript("arguments[0].click();", get_showmoredevices());		
		         break;
			case "SeeMyNewPlan":
		         jse.executeScript("arguments[0].click();", get_SeeMyNewPlan());		
		         break;
		         
		         
			 
			}
		} catch (ElementClickInterceptedException e1) {
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
	
	public void moveToElement(String element) throws Exception {

		WebElement ele = null;

		switch (element) {
		case "iIcon":
			ele = DriverManager.getDriver().findElement(iIcon);
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



public void enterText(String type, String ele, String value) throws Exception {
	try {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


		switch (ele) {	
		 case "searching_field":
			get_searching_field().sendKeys(value);
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

}


