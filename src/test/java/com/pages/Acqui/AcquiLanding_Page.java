package com.pages.Acqui;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.BasePage;
import utility.Generic;

public class AcquiLanding_Page extends BasePage {

	static File file;

	//mobile view
		By QuickLink_MobileView=By.xpath("//p[text()='Quick Links']");
		By QuickLinksDropdown_MobileView=By.xpath("//select[@class='quick-links']");
		By QuickLinkDropdown_BuyLoad_MobileView=By.xpath("//option[text()='Buy Load']");
		By QuickLinkDropdown_RegisterYourSim_MobileView=By.xpath("//option[text()='Register your SIM']");
		By QuickLinkDropdown_SwitchtoGlobe_MobileView=By.xpath("//option[text()='Switch to Globe']");
		By QuickLinkDropdown_HelpandSupport_MobileView=By.xpath("//option[text()='Help & Support']");
		By ExitMenu_MobileView=By.xpath("//img[contains(@src,'exit-mobile')]");
		By PlanWithDeviceSearchField_MobileView=By.xpath("//div[@class='input-container']//input");
		
		By GlobeLogo_MobileView=By.xpath("//img[contains(@src,'globe-logo')]");
		By EasyPayments_MobileView=By.xpath("//a[text()='Easy payments via GCash GGives']");
		
		By MenuIcon_MobileView=By.xpath("//p[text()='Menu']");
		By MobileExpandOption_MobileView =By.xpath("//div[@class='content-label-text']//a[text()='Mobile']");
		By SimOnlyPlan_MobileView=By.xpath("//a[text()='SIM-Only Plan' or text()='SIM-only Plan']");
		By PlanWithDevice_MobileView=By.xpath("//a[text()='Plan with Device']");
		By RenewalLink_MobileView=By.xpath("//a[text()='Renewal']");
		By HomeInternet_MobileView=By.xpath("//div[@class='content-label-text']//a[text()='Home Internet']");
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
		
		By ChooseYourSimOnlyPlan_MobileView=By.xpath("//p[text()=' Choose your SIM-Only Plan ']");
		
		// GlobeOnline Phase 2 Menubar Validation
		By EasyPaymentTetx = By.xpath("//nav[contains(@class,'header')] //a[text()='Easy payments via GCash GGives']");
		By CancelIcon = By.xpath("//img[@alt = 'exit']");
		By GlobeLogo = By.xpath("//img[@alt = 'Globe logo']");
		By Link_Mobile = By.xpath("//nav[contains(@class,'header')] //a[text()='Mobile']");
		//Hover on Mobile  Validations
		By Link_Postpaid = By.xpath("//a[text()='Postpaid']");
		By Link_NewOnline = By.xpath("//a[text()='New Line']");
		By Link_SimOnly = By.xpath("//a[text()='SIM-only Plan'] | //a[text()='SIM-Only Plan']");
		By Link_PlanWithDevice = By.xpath("//a[text()='Plan with Device']");
		By Link_Renewal = By.xpath("//a[text()='Renewal']"); 
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

		// Selection Of PLans In PDP Page.
		By Sim_Only = By.xpath("//button[contains(normalize-space(),'Sim Only')]]");
		By Device_Plan = By.xpath("//button[contains(normalize-space(),'Device')]");
		By Gcash_Plan = By.xpath("//button[contains(normalize-space(),'GCash')]");
		By AllData_Plan = By.xpath("//button[contains(normalize-space(),'All-Data')]");
		By Owl_Prev = By.xpath("//div[@class='owl-prev']");
		By Owl_Next = By.xpath("//div[@class='owl-next']");
	
	By cookiesNotification = By.xpath("//span[contains(text(),'Your privacy is important to us')]");
	By   TokenInput     =  By.xpath("//input[@placeholder='Enter Token']");
	By   TokenSubmit   = By.xpath("//button[text()='Submit']");
	By privacyAccept = By.xpath("//button[text()=' I accept']");
	By link_LogoGlobe = By.xpath("//a/img[@alt = 'Globe Logo']");
	By link_Apply = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Apply']");
	By link_Renew = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Renew']");
	By link_Switch = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Switch']");
	By link_MenuBuy = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Buy']");
	By CartIcon = By.xpath("//a/img[contains(@src,'cart-icon')]");
	By internetLink = By.xpath("//a[text()='Internet']");
	By dealsLink = By.xpath("//a[text()='Deals']");
	By reloadLink = By.xpath("//a[text()='Reload']");
	By RegisterSim = By.xpath("//a[text()='Register SIM']");
	By link_TrackMyOrder = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()=' Track my order ']");
	By link_Help = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()=' Help ']");
	By link_MobilePostpaid = By.xpath("//a[text() = 'Mobile Postpaid']");
	By link_ViewAllDevices = By.xpath("//a[text() = 'View all devices']");
	By postpaidDevices = By.xpath("//h1[text() = ' Postpaid Devices ']");
	By postpaidDevicesLink = By.xpath("//a[text()='Apply for Plan with Device']");
	By filters = By.xpath("(//span[@class='go_filter-icon-open'])[1]");
	By link_buildMyPlan = By.xpath("//div[text() = ' Build my plan ']");
	By postpaidPlansAndSmartphones= By.xpath("//h1[contains(text(),' Postpaid Plans and Smartphones ')]");
	By acquiCarousel01 = By.xpath("(//div/img[@alt = 'OPPO Reno7 Z 5G'])[1]");
	By acquiCarousel02 = By.xpath("//div[@class='d-flex flex-column acqui-postpaid-banner1-wrapper']");
	By pickingTheRightPlanBanner= By.xpath("//h2[contains(text(),'Picking the right plan is')]");
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
	By gplanWithDevice = By.xpath("//option[text()=' GPlan with Device ']");
	By gplanWithGCash = By.xpath("//option[text()=' GPlan with GCash ']");
	By gplanPlusSIMOnly = By.xpath("//option[text()=' GPlan SIM-only ']  |  //option[text()=' GPlan Plus SIM-Only '] | //option[normalize-space(text())='GPlan PLUS']"); 
	By gplanSIMOnlyAllData = By.xpath("//option[text()=' GPlan SIM-Only All Data ']");
	By previousicon = By.xpath("(//div[@class='owl-prev'])[2]");
	By starter = By.xpath("//div[text()='Starter']");
	By lite = By.xpath("//div[text()='Lite']");
	By basic = By.xpath("//div[text()='Basic']");
	By owlnext = By.xpath("(//div[@class='owl-next'])[2]");
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
	By accordianText1 = By.xpath("(//div[@class='accordian-text'])[1]");
	By accordianText2 = By.xpath("(//div[@class='accordian-text'])[2]");
	By accordianText3 = By.xpath("(//div[@class='accordian-text'])[3]");
	By accordianText4 = By.xpath("(//div[@class='accordian-text'])[4]");
	By accordianText5 = By.xpath("(//div[@class='accordian-text'])[5]");
	By accordianText6 = By.xpath("(//div[@class='accordian-text'])[6]");
	By acccordionButton1 = By.xpath("(//button[@class='accordion-button'])[1]");
	By acccordionButton2 = By.xpath("(//button[@class='accordion-button'])[2]");
	By acccordionButton3 = By.xpath("(//button[@class='accordion-button'])[3]");
	By acccordionButton4 = By.xpath("(//button[@class='accordion-button'])[4]");
	By acccordionButton5 = By.xpath("(//button[@class='accordion-button'])[5]");
	By acccordionButton6 = By.xpath("(//button[@class='accordion-button'])[6]");
	By simOnlyAllData599= By.xpath("//div[contains(text(),'GPlan SIM-Only All Data 599')]");
	
	//ADA2
	By Gplanwithdevice599=By.xpath("//div[contains(text(),'GPlan 599 with Device')]");
	
	
   By link_preorderNow = By.xpath("(//div[@class='d-flex flex-row tell-me-more-cta ng-star-inserted'])[5]");
	
	//color swatches
	By black_color = By.xpath("(//input[@class= 'go_color-radio' ])[1]");
	By silver_color = By.xpath("(//input[@class= 'go_color-radio' ])[2]");
	By gold_color = By.xpath("(//input[@class= 'go_color-radio' ])[3]");
	By purple_color = By.xpath("(//input[@class= 'go_color-radio' ])[4]");
	
	
    By applywith_thisdevice = By.xpath("//button[@class= 'go_btn go_text-base-action ng-star-inserted' ]");
		
	//FTA4
	By Simonlyplus1799=By.xpath("//div[contains(text(),'GPlan Plus SIM-Only 1799')]");
	//FTA1
	By GplanWith599=By.xpath("//div[contains(text(),'GPlan 599 with Device')]");
	
	/********************************************************************************************************************************/
	public WebElement get_Link_Mobile() {
		return DriverManager.getDriver().findElement(Link_Mobile);
	}
	
	public WebElement get_TokenInput() {
		return DriverManager.getDriver().findElement(TokenInput);
	}
	
	public WebElement get_TokenSubmit() {
		return DriverManager.getDriver().findElement(TokenSubmit);
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
	
	
	/********************************************************************************************************************************/
	public WebElement get_privacyAccept() {
		return DriverManager.getDriver().findElement(privacyAccept);
	}
	public WebElement get_Owl_Prev() {
		return DriverManager.getDriver().findElement(Owl_Prev);
	}
	// Selecting Plans in PDP Page.
		/********************************************************************************************************************************/
		public WebElement get_Sim_Only() {
			return DriverManager.getDriver().findElement(Sim_Only);
		} 
		/********************************************************************************************************************************/
		public WebElement get_Device_Plan() {
			return DriverManager.getDriver().findElement(Device_Plan);
		}
		/********************************************************************************************************************************/
		public WebElement get_Gcash_Plan() {
			return DriverManager.getDriver().findElement(Gcash_Plan);
		}
		/********************************************************************************************************************************/
		public WebElement get_AllData_Plan() {
			return DriverManager.getDriver().findElement(AllData_Plan);
		}
		/********************************************************************************************************************************/
		public WebElement get_Owl_Next() {
			return DriverManager.getDriver().findElement(Owl_Next);
		}

	/********************************************************************************************************************************/
	public WebElement get_link_LogoGlobe() {
		return DriverManager.getDriver().findElement(link_LogoGlobe);
	}
	public WebElement get_MenuIcon_MobileView() {
		return DriverManager.getDriver().findElement(MenuIcon_MobileView);
	}
	public WebElement get_PlanWithDevice_MobileView() {
		return DriverManager.getDriver().findElement(PlanWithDevice_MobileView);
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
	
	public WebElement get_Deals_MobileView() {
		return DriverManager.getDriver().findElement(Deals_MobileView);
	}
	
	public WebElement get_QuickLinks_MobileView() {
		return DriverManager.getDriver().findElement(QuickLinks_MobileView);
	}
	public WebElement get_ExitMenu_MobileView() {
		return DriverManager.getDriver().findElement(ExitMenu_MobileView);
	}
	public WebElement get_SimOnlyPlan_MobileView() {
		return DriverManager.getDriver().findElement(SimOnlyPlan_MobileView);
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
	public WebElement get_link_MenuBuy() {
		return DriverManager.getDriver().findElement(link_MenuBuy);
	}
	
	public WebElement get_postpaidDevicesLink() {
		return DriverManager.getDriver().findElement(postpaidDevicesLink);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_CartIcon() {
		return DriverManager.getDriver().findElement(CartIcon);
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
	public WebElement get_link_buildMyPlan() {
		return DriverManager.getDriver().findElement(link_buildMyPlan);
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
	/********************************************************************************************************************************/
	public WebElement get_starter() {
		return DriverManager.getDriver().findElement(starter);
	}
	/********************************************************************************************************************************/
	public WebElement get_link_preorderNow() {
		return DriverManager.getDriver().findElement(link_preorderNow);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_black_color() {
		return DriverManager.getDriver().findElement(black_color);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_silver_color() {
		return DriverManager.getDriver().findElement(silver_color);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_gold_color() {
		return DriverManager.getDriver().findElement(gold_color);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_purple_color() {
		return DriverManager.getDriver().findElement(purple_color);
	}
	/********************************************************************************************************************************/
	
	public WebElement get_applywith_thisdevice() {
		return DriverManager.getDriver().findElement(applywith_thisdevice);
	}
	public WebElement get_pickingTheRightPlanBanner() {
		return DriverManager.getDriver().findElement(pickingTheRightPlanBanner);
	}
	public WebElement get_customSlider() {
		return DriverManager.getDriver().findElement(customSlider);
	}
	public WebElement get_shopping() {
		return DriverManager.getDriver().findElement(shopping);
	}
	public WebElement get_Rarely() {
		return DriverManager.getDriver().findElement(rarely);
	}
	public WebElement get_introductionBlock() {
		return DriverManager.getDriver().findElement(introductionBlock);
	}
	public WebElement get_planStylesForAll() {
		return DriverManager.getDriver().findElement(planStylesForAll);
	}

	
	public static void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 1px solid DeepPink;");
	}
	
	

	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;
		switch (element) {
		case "cookiesNotification":
			flag = waitForElementVisibility(cookiesNotification, waitTime);
			break;
		case "privacyAccept":
			flag = waitForElementVisibility(privacyAccept, waitTime);
			break;
		case "PlanWithDeviceSearchField_MobileView":
			flag = waitForElementVisibility(PlanWithDeviceSearchField_MobileView, waitTime);
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
		case "ChooseYourSimOnlyPlan_MobileView":
			flag=waitForElementVisibility(ChooseYourSimOnlyPlan_MobileView, waitTime);
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
		case "TokenInput":
			flag=waitForElementVisibility(TokenInput, waitTime);
			break;
		case "TokenSubmit":
			flag=waitForElementVisibility(TokenSubmit, waitTime);
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
		case "QuickLinksSwitchToGlobe_MobileView":
			flag = waitForElementVisibility(SwitchToGlobe_MobileView, waitTime);
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
		case "Sim_Only":
			flag = waitForElementVisibility(Sim_Only, waitTime);
			break;
		case "Device_Plan":
			flag = waitForElementVisibility(Device_Plan, waitTime);
			break;
		case "Gcash_Plan":
			flag = waitForElementVisibility(Gcash_Plan, waitTime);
			break;
		case "AllData_Plan":
			flag = waitForElementVisibility(AllData_Plan, waitTime);
			break;
		case "Owl_Prev":
			flag = waitForElementVisibility(Owl_Prev, waitTime);
			break;
		case "Owl_Next":
			flag = waitForElementVisibility(Owl_Next, waitTime);
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
		case "link_MobilePostpaid":
			flag = waitForElementVisibility(link_MobilePostpaid, waitTime);
			break;
		case "link_ViewAllDevices":
			flag = waitForElementVisibility(link_ViewAllDevices, waitTime);
			break;
		case "postpaidDevices":
			flag = waitForElementVisibility(postpaidDevices, waitTime);
			break;
		case "filters":
			flag = waitForElementVisibility(filters, waitTime);
			break;
		case "link_buildMyPlan":
			flag = waitForElementVisibility(link_buildMyPlan, waitTime);
			break;
		case "postpaidPlansAndSmartphones":
			flag = waitForElementVisibility(postpaidPlansAndSmartphones, waitTime);
			break;
		case "acquiCarousel01":
			flag = waitForElementVisibility(acquiCarousel01, waitTime);
			break;
		case "acquiCarousel02":
			flag = waitForElementVisibility(acquiCarousel02, waitTime);
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
		case "RegisterSim":
			flag = waitForElementVisibility(RegisterSim, waitTime);
			break;
		case "games":
			flag = waitForElementVisibility(games, waitTime);
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
		case "starter":
			flag = waitForElementVisibility(starter, waitTime);
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
		case "simOnlyAllData599":
			flag = waitForElementVisibility(simOnlyAllData599, waitTime);
			break;
		case "Gplanwithdevice599":
			flag = waitForElementVisibility(Gplanwithdevice599, waitTime);
			break;	
		case "link_preorderNow":
			flag = waitForElementVisibility(link_preorderNow, waitTime);
			break;
		case "black_color":
			flag = waitForElementVisibility(black_color, waitTime);
			break;
		case "silver_color":
			flag = waitForElementVisibility(silver_color, waitTime);
			break;
		case "gold_color":
			flag = waitForElementVisibility(gold_color, waitTime);
			break;
		case "purple_color":
			flag = waitForElementVisibility(purple_color, waitTime);
			break;
		case "applywith_thisdevice":
			flag = waitForElementVisibility(applywith_thisdevice, waitTime);
			break;	
		case "GplanWith599":
			flag = waitForElementVisibility(GplanWith599, waitTime);
			break;
		case "internetLink":
			flag = waitForElementVisibility(internetLink, waitTime);
			break;
		case "dealsLink":
			flag = waitForElementVisibility(dealsLink, waitTime);
			break;
		case "reloadLink":
			flag = waitForElementVisibility(reloadLink, waitTime);
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
			// Select Plan in Landing Page	
			case "Sim_Only":
				flag = waitForElementClickable(Sim_Only, waitTime);
				break;
			case "Device_Plan":
				flag = waitForElementClickable(Device_Plan, waitTime);
				break;
			case "Gcash_Plan":
				flag = waitForElementClickable(Gcash_Plan, waitTime);
				break;
			case "AllData_Plan":
				flag = waitForElementClickable(AllData_Plan, waitTime);
				break; 
			case "Owl_Prev":
				flag = waitForElementClickable(Owl_Prev, waitTime);
				break; 
			case "Owl_Next":
				flag = waitForElementClickable(Owl_Next, waitTime);
				break;
		case "privacyAccept":
			flag = waitForElementClickable(privacyAccept, waitTime);
			break;
		case "link_LogoGlobe":
			flag = waitForElementClickable(link_LogoGlobe, waitTime);
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
		case "link_buildMyPlan":
			flag = waitForElementClickable(link_buildMyPlan, waitTime);
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
		case "postpaidDevicesLink":
			flag = waitForElementClickable(postpaidDevicesLink, waitTime);
			break;
		case "Link_NewOnline":
			flag = waitForElementClickable(Link_NewOnline, waitTime);
			break;
		}

		return flag;
	}
	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void moveToElement(String element) throws Exception {

		WebElement ele = null;

		switch (element) {
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
			// Select Plan In PDP Page
		case "AllData_Plan":
			ele = DriverManager.getDriver().findElement(AllData_Plan);
			break;
		case "Device_Plan":
			ele = DriverManager.getDriver().findElement(Device_Plan);
			break;
		case "Gcash_Plan":
			ele = DriverManager.getDriver().findElement(Gcash_Plan);
			break; 
		case "Sim_Only": 
			ele = DriverManager.getDriver().findElement(Sim_Only);
			break;
		case "Owl_Prev": 
			ele = DriverManager.getDriver().findElement(Owl_Prev);
			break;
		case "Owl_Next": 
			ele = DriverManager.getDriver().findElement(Owl_Next);
			break;
		case "link_Apply":
			ele = DriverManager.getDriver().findElement(link_Apply);
			break;
		case "link_TrackMyOrder":
			ele = DriverManager.getDriver().findElement(link_TrackMyOrder);
			break;	
		case "black_color":
			ele = DriverManager.getDriver().findElement(link_Apply);
			break;
		case "silver_color":
			ele = DriverManager.getDriver().findElement(link_Apply);
			break;
		case "gold_color":
			ele = DriverManager.getDriver().findElement(link_Apply);
			break;
		case "purple_color":
			ele = DriverManager.getDriver().findElement(link_Apply);
			break;
		case "link_MobilePostpaid":
			ele = DriverManager.getDriver().findElement(link_MobilePostpaid);
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
			case "link_LogoGlobe":
				get_link_LogoGlobe().click();
				break;
			case "PlanWithDevice_MobileView":
				get_PlanWithDevice_MobileView().click();
				break;
				
			case "MenuIcon_MobileView":
				get_MenuIcon_MobileView().click();
				break;
			case "Deals_MobileView":
				get_Deals_MobileView().click();
				break;
			case "SimOnlyPlan_MobileView":
				get_SimOnlyPlan_MobileView().click();
				break;
				
				
			case "QuickLinks_MobileView":
				get_QuickLinks_MobileView().click();
				break;
			case "ExitMenu_MobileView":
				get_ExitMenu_MobileView().click();
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
				
				
			case "link_Apply":
				get_link_Apply().click();
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
			case "link_buildMyPlan":
				get_link_buildMyPlan().click();
				break;
			case "acccordionButton1":
				get_acccordionButton1().click();
				break;
			case "acccordionButton2":
				get_acccordionButton2().click();
				break;
			case "postpaidDevicesLink":
				get_postpaidDevicesLink().click();
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
			
			case "AllData_Plan":
				get_AllData_Plan().click();
				break;	
			case "Device_Plan":
				get_applywith_thisdevice().click();
				break;	
			case "Gcash_Plan":
				get_Gcash_Plan().click();
				break;	
			case "Sim_Only":
				get_Sim_Only().click();
				break;	
			case "Owl_Prev":
				get_Owl_Prev().click();
				break;	
			case "Owl_Next":
				get_Owl_Next().click();
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
			case "applywith_thisdevice":
				get_applywith_thisdevice().click();
				break;	
			case "Link_NewOnline":
				get_Link_NewOnline().click();
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
		if (ele != null) {
		  System.out.println("Clicked on " + type + " : " + eleName);
		  Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicked on '"+ele+"' button.","Passed");	
		}
	}

	public void jsClick(String message, String element) throws Exception {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "gplanWithDevice":
		         jse.executeScript("arguments[0].click();", get_gplanWithDevice());		
		         break;
			case "gplanWithGCash":
		         jse.executeScript("arguments[0].click();", get_gplanWithGCash());		
		         break;     
			case "gplanPlusSIMOnly":
		         jse.executeScript("arguments[0].click();", get_gplanPlusSIMOnly());		
		         break;
			case "gplanSIMOnlyAllData":
		         jse.executeScript("arguments[0].click();", get_gplanSIMOnlyAllData());		
		         break;
			case "link_MobilePostpaid":
		         jse.executeScript("arguments[0].click();", get_link_MobilePostpaid());		
		         break;
			case "link_TrackMyOrder":
		         jse.executeScript("arguments[0].click();", get_link_TrackMyOrder());		
		         break;
			case "link_Help":
		         jse.executeScript("arguments[0].click();", get_link_Help());		
		         break;
			case "Owl_Prev":
		         jse.executeScript("arguments[0].click();", get_Owl_Prev());		
		         break; 
			case "Owl_Next":
		         jse.executeScript("arguments[0].click();", get_Owl_Next());		
		         break; 
			case "TokenSubmit":
		         jse.executeScript("arguments[0].click();", get_TokenSubmit());		
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
