package com.pagesHPW;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utility.*;
import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;

public class LandingPage extends BasePage {

	static File file;
	By privacyAccept = By.xpath("//button[text()=' I accept'] | //button[text()=' I accept']");
	By cookiesNotification = By.xpath("//p[contains(text(),'uses cookies to help')]");
	By link_LogoGlobe = By.xpath("//div/img[@alt = 'Globe Logo'] | //a/img[@alt = 'Globe Logo']");
	By link_Apply = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Apply'] | //div[contains(@class,'left-menu-mobile')] //a[text()='Apply']");
	By link_Renew = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Renew'] | //div[contains(@class,'left-menu-mobile')] //a[text()='Renew']");
	By link_Switch = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Switch'] | //div[contains(@class,'left-menu-mobile')] //a[text()='Switch']");
	By link_PostPaid = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Postpaid Promos'] | //div[contains(@class,'left-menu-mobile')] //a[text()='Postpaid Promos']");
	By link_Gfiber = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='GFiber'] | //div[contains(@class,'left-menu-mobile')] //a[text()='GFiber']");
	By link_Help = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()=' Help '] | //div[contains(@class,'right-menu-mobile')] //a[text()=' Help ']");
	By link_MenuBuy = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Buy']");
	By link_Reload = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Reload'] |  //div[contains(@class,'left-menu-mobile')] //a[text()='Reload']");
	By link_Registersim = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Register SIM'] |  //div[contains(@class,'left-menu-mobile')] //a[text()='Register SIM']");
	By CartIcon = By.xpath("//a/img[contains(@src,'cart-icon')] | //a[text()=' Cart ']");
	By link_TrackMyOrder = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()=' Track my order '] | //a[text()=' Track my order ']");
	By   TokenInput     =  By.xpath("//input[@placeholder='Enter Token']");
	By   TokenSubmit   = By.xpath("//button[text()='Submit']");
	
	
	By link_MobilePostPaid = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Mobile Postpaid'] | //div[contains(@class,'left-menu-mobile')] //a[text()='Mobile Postpaid']");
	
	By Link_Prepaidwifi = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Prepaid Wifi']");
	By link_XtremeHomePrepaidWiFi = By.xpath("//a[text() = 'Xtreme Home Prepaid WiFi'] | //a[text() = ' Xtreme Home Prepaid WiFi']");
	By link_GlobeAtHomePrepaidWiFi = By.xpath("//a[text() = 'Globe At Home Prepaid WiFi']  |  //a[text() = ' Home Prepaid WiFi']");
	By link_LTE_Advanced = By.xpath("//a[text() = ' LTE Advanced'] | //a[text() = 'LTE Advanced']");
	By link_BLACKPINKLimitedEdition = By.xpath("//a[text() = 'BLACKPINK Limited Edition'] | //a[text() = ' BLACKPINK Limited Edition']");
	By link_MyFiLTE = By.xpath("//a[text() = 'MyFi LTE'] | //a[text() = ' MyFi LTE']");
	By link_MyFiLTE_Advanced = By.xpath("//a[text() = 'MyFi LTE-Advanced'] | //a[text() = ' MyFi LTE-Advanced']");

	
	By downloadManual = By.xpath("//a[text()='Download Manual']");
	By buyNow = By.xpath("//button[contains(text(),'Buy now')]");
	
	By floatingBuyNow = By.xpath("//span[text()='Buy now']");
	By floatActualPrice = By.xpath("//span[@class='actualPrice'] | //span[@class='offerPrice']");
	
	
	
	

	By link_features = By.xpath("//div[@class='link' and text()=' Features '] | //div[contains(@class,'link') and text()=' Features ']");
	By FeatureContent = By.xpath("//span[text()='Super fast, super reliable']");
	By FeatureContent_Text = By.xpath("//p[text()='Connect to WiFi by following the guide included with your modem.']");
	By Surf_Content = By.xpath("//p[text()='Get FREE 50GB within 15 minutes after turning on your modem.']");
	By Download_Content = By.xpath("//p[text()='Download the New GlobeOne app to manage your accounts, track data usage and redeem rewards.']");
	
	
	By link_specifications = By.xpath("//div[contains(@class, 'link')and text()=' Specifications ']");
	By link_compare = By.xpath("//div[contains(@class, 'link') and text()=' Specifications ']");
	
	
	By BPHW_HighlightContent = By.xpath("//h2[text()='All areas covered']");
	By BPHW_Highlightcontentarea = By.xpath("//div[text()='BLACKPINK in your area']");
	
	By BPHW_sigal= By.xpath("//div[text()='2X']");
	By BPHW_HighlightSignal = By.xpath("//p[text()='Double the signal strength, and wider coverage.']");
	
	By BPHW_devicesinyourhome= By.xpath("//p[text()='Share with up to six devices in your home.']");
	By BPHW_SixDevices = By.xpath("//div[text()='6']");
	
	By BPHW_FeatureContent = By.xpath("//p[contains(@class, 'plugplaysurfdescription')and text()='Just plug your device, load up, and surf!']");
	By BPHW_FeatureContent1 = By.xpath("//p[contains(@class, 'plugplaysurfdescription')and text()='Get free 10GB when you activate your modem.']");
	
	
	By BPHW_FeatureBanner2 = By.xpath("//span[text()='Surf and stan all you want']");
	By BPHW_Featurewatchlearn = By.xpath("//p[text()='Watch, learn, chat, and earn when you load a HomeSurf promo. Do more at home with free 1GB daily.']");
	
	By BPHW_Apps = By.xpath("//p[text()='Enjoy watching from these apps:']");

	By footer = By.xpath("//a[text()='© 2024 Globe Telecom, Inc.']");
	By footerPrivacyPolicy = By.xpath("(//a[text()='Privacy Policy'])[3] | (//a[text()='Privacy Policy'])[1]");
	By footerTermsOfUse = By.xpath("(//a[text()='Terms of Use'])[3] | (//a[text()='Terms of Use'])[1]");
	By footerSiteMap = By.xpath("(//a[text()='Site Map'])[3] | (//a[text()='Site Map'])[1]");

	By thankYouNote = By.xpath("//h1[text()=' Thank you! ']");
	By orderID = By.xpath(
			"//div[text()=' Reference number ']/../div[2]/div[1] | //span[text()='Reference number']/../../div[2]/span");

	By link_Deals = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Deals'] | //div[contains(@class,'left-menu-mobile')] //a[text()='Deals']");
	By link_UVSanitizer = By.xpath("//a[text() = '0917 UV Sanitizer']");
	By link_UVWaterBottle = By.xpath("//a[text() = '0917 UVC 600ml Water Bottle']");
	
	
	By Samsung = By.xpath("//a[text()='Samsung Galaxy S23 Series']");
	By Iphone = By.xpath("//a[text()='iPhone SE']");
	By Iphone64GB = By.xpath("//a[text() = 'Buy in 64GB']");
	By cod = By.xpath("//div[text()=' Cash On Delivery ']");
	By MainLP_NewNormalEssential = By.xpath("//span[contains(text(),'New Normal Essentials')]");
	By MainLP_0917UVSanitizer = By.xpath("//span[contains(text(),'0917 UV Sanitizer')]");
	By MainLP_0917UVSanitizer_ShopNow = By.xpath("(//button/span[text()='Shop now'])[1]");
	By MainLP_0917UVBottle = By.xpath("//span[text()='0917 UVC Insulated Water Bottle']");
	By MainLP_0917UVBottle_ShopNow = By.xpath("(//button/span[text()='Shop now'])[3]");

	//	Andoid Xpaths
	By MenuBuyAndriod = By.xpath("//div[contains(@class, 'menu-icon')]");	
	By menuIconAndroid = By.xpath("//div[contains(@class, 'menu-icon')]");	

	By link_MenuBuyAndroid = By.xpath("//a[text()='Buy']//following::div[3]");
	By LTE_AdvancedLinkIos = By.xpath("//a[text()=' LTE Advanced']");
	
//	//mobile view
//		By QuickLink_MobileView=By.xpath("//p[text()='Quick Links']");
//		By QuickLinksDropdown_MobileView=By.xpath("//select[@class='quick-links'] | //img[@alt='down-arrow']");
//		By QuickLinkDropdown_BuyLoad_MobileView=By.xpath("//option[text()='Buy Load'] | //button[text()=' Buy Load ']");
//		By QuickLinkDropdown_RegisterYourSim_MobileView=By.xpath("//option[text()='Register your SIM'] | //button[text()=' Register your SIM ']");
//		By QuickLinkDropdown_SwitchtoGlobe_MobileView=By.xpath("//option[text()='Switch to Globe']");
//		By QuickLinkDropdown_HelpandSupport_MobileView=By.xpath("//option[text()='Help & Support'] | //button[text()=' Help & Support ']");
//		By ExitMenu_MobileView=By.xpath("//img[contains(@src,'exit-mobile')]");
//		By PlanWithDeviceSearchField_MobileView=By.xpath("//div[@class='input-container']//input");
//		
//		By GlobeLogo_MobileView=By.xpath("//img[contains(@src,'globe-logo')]");
//		By EasyPayments_MobileView=By.xpath("//a[text()='Easy payments via GCash GGives']");
//		
//		By MenuIcon_MobileView=By.xpath("//img[@class='menu']");
//		////p[text()='Menu'] | 
//		By MobileExpandOption_MobileView =By.xpath("//div[@class='content-label-text']//a[text()='Mobile']");
//		By SimOnlyPlan_MobileView=By.xpath("//a[text()='SIM-Only Plan'] | //a[text()='SIM-Only Plan']");
//		By PlanWithDevice_MobileView=By.xpath("//a[text()='Plan with Device']");
//		By RenewalLink_MobileView=By.xpath("//a[text()='Renewal']");
//		By HomeInternet_MobileView=By.xpath("//div[@class='content-label-text']//a[text()='Home Internet']");
//		By chkbx_acceptAll = By.xpath("//input[@formcontrolname='all']");
//		By ApplyForaGFiberPlan_MobileView=By.xpath("//a[text()='Apply for a GFiber Plan']");
//		By UpgradeMyInternet_MobileView=By.xpath("//a[text()='Upgrade my internet' or text()='Upgrade my Internet']");
//		By GFiberPrepaid_MobileView=By.xpath("//a[text()='GFiber Prepaid']");
//		By PrepaidWifi_MobileView=By.xpath("//a[text()='Prepaid Wifi']");
//		By HomePrepaidWifiSim_MobileView=By.xpath("//a[text()='Home Prepaid WiFi SIM']");
//		By Deals_MobileView=By.xpath("//div[@class='content-label-text']//a[text()='Deals']");
//		By DiscountedDevices_MobileView=By.xpath("//a[text()='GPlan PLUS x Discounted Devices']");
//		By GlobePrepaidExclusives_MobileView=By.xpath("//a[text()='Globe Prepaid Exclusives']");
//		By QuickLinks_MobileView=By.xpath("//div[@class='content-label-text']//a[text()='Quick Links']");
//		By BuyLoad_MobileView=By.xpath("//a[text()='Buy Load']");
//		By RegisterYourSim_MobileView=By.xpath("//a[text()='Register your SIM']");
//		By SwitchToGlobe_MobileView=By.xpath("//a[text()='Switch to Globe']");
//		By HelpandSupport_MobileView=By.xpath("//a[text()='Help & Support']");
//		
//		By ChooseYourSimOnlyPlan_MobileView=By.xpath("//p[text()=' Choose your SIM-Only Plan ']");
		
		
		
		//mobile view
				By QuickLink_MobileView=By.xpath("//p[text()='Quick Links']");
				By QuickLinksDropdown_MobileView=By.xpath("//select[@class='quick-links'] | //img[@alt='down-arrow']");
				By QuickLinkDropdown_BuyLoad_MobileView=By.xpath("//option[text()='Buy Load'] | //button[text()=' Buy Load ']");
				By QuickLinkDropdown_RegisterYourSim_MobileView=By.xpath("//option[text()='Register your SIM'] | //button[text()=' Register your SIM ']");
				By QuickLinkDropdown_SwitchtoGlobe_MobileView=By.xpath("//option[text()='Switch to Globe']");
				By QuickLinkDropdown_HelpandSupport_MobileView=By.xpath("//option[text()='Help & Support'] | //button[text()=' Help & Support ']");
				By ExitMenu_MobileView=By.xpath("//img[contains(@src,'exit-mobile')]");
				By PlanWithDeviceSearchField_MobileView=By.xpath("//div[@class='input-container']//input");
				
				By GlobeLogo_MobileView=By.xpath("//img[contains(@src,'globe-logo')]");
				By EasyPayments_MobileView=By.xpath("//a[text()='Easy payments via GCash GGives']");
				
				By MenuIcon_MobileView=By.xpath("//img[@class='menu']");
				////p[text()='Menu'] | 
				By MobileExpandOption_MobileView =By.xpath("//div[@class='content-label-text']//a[text()='Mobile']");
				By SimOnlyPlan_MobileView=By.xpath("//a[text()='SIM-Only Plan'] | //a[text()='SIM-Only Plan']");
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
				
				By ChooseYourSimOnlyPlan_MobileView=By.xpath("//p[text()=' Choose your SIM-Only Plan ']");
				
		
		
	
	By link_highlights = By.xpath("//div[@class='link' and contains(text(),'Highlight')] | //div[contains(@class,'link')and contains(text(),'Highlight')]");
//	By HighlightContent = By.xpath("//span[text()='All speed, no lock-up']");
//	By HighlightContentBanner1 = By.xpath("//span[text()='Big things come in small packages']");
//	By HighlightContentBanner2 = By.xpath("//p[text()='Make the day special with Globe At Home Xtreme Home Prepaid WiFi. Celebrate with the videoke-ready feature, or chill with your favorite local HD TV channels and internet TV.']");
//	By CommonFeatureDescription = By.xpath("//div[@class='bannerDiv']//following::p[3]");
//	By CommonInternetDescription = By.xpath("//div[@class='bannerDiv']//following::p[4]");
//	By CommonClearfeechannels = By.xpath("//div[@class='bannerDiv']//following::p[5]");
//	By Commonfasthomeinternet= By.xpath("//div[@class='bannerDiv']//following::p[6]");
	
	String xpathCommonHighlight = "//div[@class='bannerDiv']//following::p[2]";
	By allCommonHighlightContent  = By.xpath(xpathCommonHighlight);
	
	String xpathCommonHighlightContent = "//div[@class='bannerDiv']//following::span[1]";
	By allCommonHighlightContents  = By.xpath(xpathCommonHighlightContent);
	
	String commonFeatureContent = "//div[@class='bannerDiv']//following::span[2]";
	By featurecontentdescription  = By.xpath(commonFeatureContent);
	
	String FeatureStreamingmadefaster = "//div[@class='bannerDiv']//following::span[3]";
	By featurecontent1  = By.xpath(FeatureStreamingmadefaster);
	
	String Homesurface = "//div[@class='bannerDiv']//following::span[4]";
	By featurecontent2  = By.xpath(Homesurface);
	
	String Famsurface = "//div[@class='bannerDiv']//following::span[5]";
	By featurecontent3  = By.xpath(Famsurface);
	
	String FirstbannerDescrption = "//div[@class='bannerDiv']//following::span[3]";
	By featurecontentDescrition  = By.xpath(FirstbannerDescrption);
	
	
	String FeatureInternet = "//div[@class='bannerDiv']//following::p[4]";
	By FeatureInternetDescrption  = By.xpath(FeatureInternet);
	
	String FeatureClearfeechannels = "//div[@class='bannerDiv']//following::p[5]";
	By FeatureclearFreetextDescrption  = By.xpath(FeatureClearfeechannels);
	
	String fasthomeinternet = "//div[@class='bannerDiv']//following::p[6]";
	By Featurefasthomeinternet  = By.xpath(fasthomeinternet);
	
	
	
	
	
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
		By Link_PrePaidWifi = By.xpath("//a[text()='Prepaid WiFi'] | //a[text()='Prepaid Wifi']");
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
		By Link_SwitchtoGlobe = By.xpath(" //a[text()='Switch to Globe']floatingBuyNow");
		By Link_HelpSupport = By.xpath("//a[text()='Help & Support']");	
		By Link_TrackMyorder = By.xpath("//nav[contains(@class,'header')] //a[text()='Track my order']");
	
	/********************************************************************************************************************************/
		public void jsClick(String message, String element) throws Exception {
			JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		
			try {
				switch (element) {
				case "privacyAccept":
					jse.executeScript("arguments[0].click();", get_privacyAccept());		
				      break;
				      
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
				       
				      
				     
				      
				}}

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
			
		
		public String getText(String ele) {
		String text = "";

		try {
			switch (ele) {
			case "CommonHighlight":
				text = DriverManager.getDriver().findElement(allCommonHighlightContent).getText();
				break;
			case "Highlightdescription":
				text = DriverManager.getDriver().findElement(allCommonHighlightContents).getText();
				break;
			case "featurecontentdescription":
				text = DriverManager.getDriver().findElement(featurecontentdescription).getText();
				break;
			case "FeatureStreamingmadefaster":
				text = DriverManager.getDriver().findElement(featurecontent1).getText();
				break;
			case "Homesurface":
				text = DriverManager.getDriver().findElement(featurecontent2).getText();
				break;
			case "Famsurface":
				text = DriverManager.getDriver().findElement(featurecontent3).getText();
				break;
			case "Bigthingstext":
				text = DriverManager.getDriver().findElement(featurecontentDescrition).getText();
				break;
			case "FeatureInternetDescrption":
				text = DriverManager.getDriver().findElement(FeatureInternetDescrption).getText();
				break;
			case "FeatureclearFreetextDescrption":
				text = DriverManager.getDriver().findElement(FeatureclearFreetextDescrption).getText();
				break;
			case "Featurefasthomeinternet":
				text = DriverManager.getDriver().findElement(Featurefasthomeinternet).getText();
				break;				
			}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
			
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
			
		}

		return text;
	}
	
	
		public WebElement get_TokenSubmit() {
			return DriverManager.getDriver().findElement(TokenSubmit);
		}
		


	public WebElement get_link_MenuBuy() {
		WebElement element = null;
		element = DriverManager.getDriver().findElement(link_MenuBuy);
		return element;
	}
	public WebElement get_link_MenuBuyAndroid() {
		WebElement element = null;
		if(Constant.platformName.equalsIgnoreCase("android")||(Constant.platformName.equalsIgnoreCase("iOS"))) {
			element = DriverManager.getDriver().findElement(link_MenuBuyAndroid);
		}
		return element;
	}
	public WebElement get_MenuIcon_MobileView() {
		return DriverManager.getDriver().findElement(MenuIcon_MobileView);
	}
	public WebElement get_PlanWithDevice_MobileView() {
		return DriverManager.getDriver().findElement(PlanWithDevice_MobileView);
	}
	public WebElement get_PrepaidWifi_MobileView() {
		return DriverManager.getDriver().findElement(PrepaidWifi_MobileView);
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
	public WebElement get_SimOnlyPlan_MobileView() {
		return DriverManager.getDriver().findElement(SimOnlyPlan_MobileView);
	}
	
	public WebElement get_menuIconAndroid() {
		WebElement element = null;
		if(Constant.platformName.equalsIgnoreCase("android") || (Constant.platformName.equalsIgnoreCase("iOS"))) {
			element = DriverManager.getDriver().findElement(menuIconAndroid);
		}
		return element;
	}

	public WebElement get_TokenInput() {
		return DriverManager.getDriver().findElement(TokenInput);
	}
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
	public WebElement get_Link_PrePaidWifi() {
		return DriverManager.getDriver().findElement(Link_PrePaidWifi);
	}
	/********************************************************************************************************************************/
	public WebElement get_Link_SwitchtoGlobe() {
		return DriverManager.getDriver().findElement(Link_SwitchtoGlobe);
	}
	 
	
	public WebElement get_BPHW_HighlightContent() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_HighlightContent);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_Highlightcontentarea() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_Highlightcontentarea);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_sigal() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_sigal);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_HighlightSignal() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_HighlightSignal);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_devicesinyourhome() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_devicesinyourhome);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_SixDevices() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_SixDevices);// mobile } else {	
		return element;
	}
	
	public WebElement get_FeatureContent() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(FeatureContent);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_FeatureContent() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_FeatureContent);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_FeatureContent1() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_FeatureContent1);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_FeatureBanner2() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_FeatureBanner2);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_Featurewatchlearn() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_Featurewatchlearn);// mobile } else {	
		return element;
	}
	public WebElement get_BPHW_Apps() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(BPHW_Apps);// mobile } else {	
		return element;
	}
		
	public WebElement get_FeatureContent_Text() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(FeatureContent_Text);// mobile } else {	
		return element;
	}
	public WebElement get_Surf_Content() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(Surf_Content);// mobile } else {	
		return element;
	}
	public WebElement get_Download_Content() {
		WebElement element = null;	
		element = DriverManager.getDriver().findElement(Download_Content);// mobile } else {	
		return element;
	}





	/********************************************************************************************************************************/
	public WebElement get_Deals() {
		return DriverManager.getDriver().findElement(link_Deals);
	}
	/********************************************************************************************************************************/
	public WebElement get_Iphone64GB () {
		return DriverManager.getDriver().findElement(Iphone64GB );
	}

	public WebElement get_cod () {
		return DriverManager.getDriver().findElement(cod );
	}

	/********************************************************************************************************************************/
	public WebElement get_Sanitizer() {
		return DriverManager.getDriver().findElement(link_UVSanitizer);
	}
	/********************************************************************************************************************************/
	public WebElement get_Iphone() {
		return DriverManager.getDriver().findElement(Iphone);
	}	
	/********************************************************************************************************************************/
	public WebElement get_WatterBottle() {
		return DriverManager.getDriver().findElement(link_UVWaterBottle);
	}

	/********************************************************************************************************************************/
	public WebElement get_privacyAccept() {
		return DriverManager.getDriver().findElement(privacyAccept);
	}

	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_menuBuy() {
		return DriverManager.getDriver().findElement(link_MenuBuy);
	}

	/********************************************************************************************************************************/
	public WebElement get_LTE_Advanced() {
		return DriverManager.getDriver().findElement(link_LTE_Advanced);
	}

	/********************************************************************************************************************************/
	public WebElement get_XtremeHomePrepaidWiFi() {
		return DriverManager.getDriver().findElement(link_XtremeHomePrepaidWiFi);
	}

	/********************************************************************************************************************************/
	public WebElement get_downloadManual() {
		return DriverManager.getDriver().findElement(downloadManual);
	}

	/********************************************************************************************************************************/
	public WebElement get_buyNow() {
		return DriverManager.getDriver().findElement(buyNow);
	}

	/********************************************************************************************************************************/
	public WebElement get_OrderID() {
		return DriverManager.getDriver().findElement(orderID);
	}

	/********************************************************************************************************************************/
	public WebElement get_floatActualPrice() {
		return DriverManager.getDriver().findElement(floatActualPrice);
	}

	/********************************************************************************************************************************/
	public WebElement get_link_highlights() {
		return DriverManager.getDriver().findElement(link_highlights);
	}

	/********************************************************************************************************************************/
	public WebElement get_link_features() {
		return DriverManager.getDriver().findElement(link_features);
	}

	/********************************************************************************************************************************/
	public WebElement get_link_specifications() {
		return DriverManager.getDriver().findElement(link_specifications);
	}

	/********************************************************************************************************************************/
	public WebElement get_floatBuy() {
		return DriverManager.getDriver().findElement(floatingBuyNow);
	}

	/********************************************************************************************************************************/
	public WebElement get_link_compare() {
		return DriverManager.getDriver().findElement(link_compare);
	}

	/********************************************************************************************************************************/
	public WebElement get_link_BLACKPINKLimitedEdition() {
		return DriverManager.getDriver().findElement(link_BLACKPINKLimitedEdition);
	}

	/********************************************************************************************************************************/
	public WebElement get_link_GlobeAtHomePrepaidWiFi() {
		return DriverManager.getDriver().findElement(link_GlobeAtHomePrepaidWiFi);
	}
	/********************************************************************************************************************************/
//	public WebElement get_CommonHighlightContent() {
//		return DriverManager.getDriver().findElement(CommonHighlightContent);
//	}
//	/********************************************************************************************************************************/
//	public WebElement get_CommonHighlight() {
//		return DriverManager.getDriver().findElement(CommonHighlight);
//	}
//	/********************************************************************************************************************************/
//	public WebElement get_CommonFeatureContent() {
//		return DriverManager.getDriver().findElement(CommonFeatureContent);
//	}
	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_Link_Prepaidwifi() {
		return DriverManager.getDriver().findElement(Link_Prepaidwifi);
	}
	/********************************************************************************************************************************/
	public void implicitWait() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/********************************************************************************************************************************/
	/**
	 * @throws Exception ******************************************************************************************************************************/



	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		// ANDROID
		case "menuIconAndroid":
			if(Constant.platformName.equalsIgnoreCase("android") || (Constant.platformName.equalsIgnoreCase("iOS"))) {
				flag = waitForElementVisibility(menuIconAndroid,waitTime);
				// mobile } else {
			}	
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
		case "Link_PrePaidWifi":
			flag = waitForElementVisibility(Link_PrePaidWifi, waitTime);
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
		case "link_MenuBuyAndroid":
			if (Constant.platformName.equalsIgnoreCase("android")|| Constant.platformName.equalsIgnoreCase("iOS")) {
				flag = waitForElementVisibility(link_MenuBuyAndroid,waitTime);
				// mobile } else {
			}	
			break;
		case "privacyAccept":
			flag = waitForElementVisibility(privacyAccept, waitTime);
			break;			
		case "downloadManual":
			flag = waitForElementVisibility(downloadManual, waitTime);
			break;
		case "buyNow":
			flag = waitForElementVisibility(buyNow, waitTime);
			break;
		case "menuBuy":
			flag = waitForElementVisibility(link_MenuBuy, waitTime);
			break;
		case "floatingBuyNow":
			flag = waitForElementVisibility(floatingBuyNow, waitTime);
			break;
		case "thankYouNote":
			flag = waitForElementVisibility(thankYouNote, waitTime);
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
		case "link_PostPaid":
			flag = waitForElementVisibility(link_PostPaid, waitTime);
			break;
		case "link_Gfiber":
			flag = waitForElementVisibility(link_Gfiber, waitTime);
			break;
		case "Link_Prepaidwifi":
			flag = waitForElementVisibility(Link_Prepaidwifi, waitTime);
			break;
		case "link_MobilePostPaid":
			flag = waitForElementVisibility(link_MobilePostPaid, waitTime);
			break;		
		case "link_MenuBuy":	
			flag = waitForElementVisibility(link_MenuBuy, waitTime);
			break;
		case "link_Reload":	
			flag = waitForElementVisibility(link_Reload, waitTime);
			break;
		case "link_Registersim":	
			flag = waitForElementVisibility(link_Registersim, waitTime);
			break;		
		case "link_Help":
			flag = waitForElementVisibility(link_Help, waitTime);
			break;
		case "link_XtremeHomePrepaidWiFi":
			flag = waitForElementVisibility(link_XtremeHomePrepaidWiFi, waitTime);
			break;
		case "link_GlobeAtHomePrepaidWiFi":
			flag = waitForElementVisibility(link_GlobeAtHomePrepaidWiFi, waitTime);
			break;
		case "link_LTE_Advanced":
			flag = waitForElementVisibility(link_LTE_Advanced, waitTime);
			break;
		case "link_BLACKPINKLimitedEdition":
			flag = waitForElementVisibility(link_BLACKPINKLimitedEdition, waitTime);
			break;
		case "link_MyFiLTE":
			flag = waitForElementVisibility(link_MyFiLTE, waitTime);
			break;
		case "link_MyFiLTE_Advanced":
			flag = waitForElementVisibility(link_MyFiLTE_Advanced, waitTime);
			break;
		case "CartIcon":
			flag = waitForElementVisibility(CartIcon, waitTime);
			break;
		case "link_TrackMyOrder":
			flag = waitForElementVisibility(link_TrackMyOrder, waitTime);
			break;
		case "cookiesNotification":
			flag = waitForElementVisibility(cookiesNotification, waitTime);
			break;
		case "link_highlights":
			flag = waitForElementVisibility(link_highlights, waitTime);
			break;
//		case "HighlightContent ":
//			flag = waitForElementVisibility(HighlightContent, waitTime);
//			break;
//		case "HighlightContentBanner1 ":
//			flag = waitForElementVisibility(HighlightContentBanner1, waitTime);
//			break;
//		case "HighlightContentBanner2 ":
//			flag = waitForElementVisibility(HighlightContentBanner2, waitTime);
//			break;
//		case "CommonHighlight":
//			flag = waitForElementVisibility(CommonHighlight, waitTime);
//			break;
//		case "CommonHighlightContent":
//			flag = waitForElementVisibility(CommonHighlightContent, waitTime);
//			break;
//		case "CommonFeatureContent":
//			flag = waitForElementVisibility(CommonFeatureContent, waitTime);
//			break;
//		case "CommonFeatureContent1":
//			flag = waitForElementVisibility(CommonFeatureContent1, waitTime);
//			break;
//		case "CommonFeatureContent2":
//			flag = waitForElementVisibility(CommonFeatureContent2, waitTime);
//			break;
//		case "CommonFeatureContent3":
//			flag = waitForElementVisibility(CommonFeatureContent3, waitTime);
//			break;
//		case "CommonFeatureDescription":
//			flag = waitForElementVisibility(CommonFeatureDescription, waitTime);
//			break;
//		case "CommonInternetDescription":
//			flag = waitForElementVisibility(CommonInternetDescription, waitTime);
//			break;
//		case "Commonfasthomeinternet":
//			flag = waitForElementVisibility(Commonfasthomeinternet, waitTime);
//			break;
//		case "CommonClearfeechannels":
//			flag = waitForElementVisibility(CommonClearfeechannels, waitTime);
//			break;	
		case "link_features":
			flag = waitForElementVisibility(link_features, waitTime);
			break;
		case "link_specifications":
			flag = waitForElementVisibility(link_specifications, waitTime);
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
		case "link_compare":
			flag = waitForElementVisibility(link_compare, waitTime);
			break;
		case "link_Deals":
			flag = waitForElementVisibility(link_Deals, waitTime);
			break;
		case "link_UVSanitizer":
			flag = waitForElementVisibility(link_UVSanitizer, waitTime);
			break;
		case "link_UVWaterBottle":
			flag = waitForElementVisibility(link_UVWaterBottle, waitTime);
			break;
		case "Samsung":
			flag = waitForElementVisibility(Samsung, waitTime);
			break;		
		case "Iphone":
			flag = waitForElementVisibility(Iphone, waitTime);
			break;
			
		case "Iphone64GB":
			flag = waitForElementVisibility(Iphone64GB, waitTime);
			break;
		case "MainLP_NewNormalEssential":
			flag = waitForElementVisibility(MainLP_NewNormalEssential, waitTime);
			break;
		case "MainLP_0917UVSanitizer":
			flag = waitForElementVisibility(MainLP_0917UVSanitizer, waitTime);
			break;
		case "MainLP_0917UVSanitizer_ShopNow":
			flag = waitForElementVisibility(MainLP_0917UVSanitizer_ShopNow, waitTime);
			break;
		case "MainLP_0917UVBottle":
			flag = waitForElementVisibility(MainLP_0917UVBottle, waitTime);
			break;
		case "MainLP_0917UVBottle_ShopNow":
			flag = waitForElementVisibility(MainLP_0917UVBottle_ShopNow, waitTime);
			break;	
			//			Mobile			
		}
		
		if (flag) {
			//			ExtentTestManager.logInfo(message + " - exists");
			System.out.println(message + " - exists");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");
		} else {
			//			ExtentTestManager.logFail(message + " - do not exists");
			System.out.println(message + " - do not exist");
			Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is not visbile on the page","Failed");
		}
		
		return flag;
	}


	/**
	 * @throws Exception ******************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) throws Exception {

		boolean flag = false;

		switch (element) {

		case "privacyAccept":
			flag = waitForElementClickable(privacyAccept,waitTime);// mobile } else {
			break;
		case "link_MenuBuy":
			flag = waitForElementClickable(link_MenuBuy, waitTime);
			break;
		case "Link_Prepaidwifi":
			flag = waitForElementClickable(Link_Prepaidwifi, waitTime);
			break;		
		case "menuIconAndroid":
			if(Constant.platformName.equalsIgnoreCase("android") || (Constant.platformName.equalsIgnoreCase("iOS"))) {
				flag = waitForElementClickable(menuIconAndroid,waitTime);// mobile } else {
			}
			break;
		case "link_MenuBuyAndroid":
			if (Constant.platformName.equalsIgnoreCase("android") || Constant.platformName.equalsIgnoreCase("iOS")) {
				flag = waitForElementClickable(link_MenuBuyAndroid,waitTime);// mobile } else {
			}
			
			
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
		case "Link_PrePaidWifi":
			flag = waitForElementClickable(Link_PrePaidWifi, waitTime);
			break;
			
			
			
			
			
			
			
		case "MainLP_0917UVBottle_ShopNow":
			flag = waitForElementClickable(MainLP_0917UVBottle_ShopNow, waitTime);
			break;

		case "MainLP_0917UVSanitizer_ShopNow":
			flag = waitForElementClickable(MainLP_0917UVSanitizer_ShopNow, waitTime);
			break;
		case "link_LTE_Advanced":
			flag = waitForElementClickable(link_LTE_Advanced, waitTime);
			break;
		case "downloadManual":
			flag = waitForElementClickable(downloadManual, waitTime);
			break;
		case "buyNow":
			flag = waitForElementClickable(buyNow, waitTime);
			break;
		case "menuBuy":
			flag = waitForElementClickable(link_MenuBuy, waitTime);
			break;
		case "link_XtremeHomePrepaidWiFi":
			flag = waitForElementClickable(link_XtremeHomePrepaidWiFi, waitTime);
			break;
		case "link_highlights":
			flag = waitForElementClickable(link_highlights, waitTime);
			break;
		case "link_features":
			flag = waitForElementClickable(link_highlights, waitTime);
			break;
		case "link_specifications":
			flag = waitForElementClickable(link_specifications, waitTime);
			break;
		case "link_compare":
			flag = waitForElementClickable(link_compare, waitTime);
			break;
		case "link_BLACKPINKLimitedEdition":
			flag = waitForElementClickable(link_BLACKPINKLimitedEdition, waitTime);
			break;
		case "link_GlobeAtHomePrepaidWiFi":
			flag = waitForElementClickable(link_GlobeAtHomePrepaidWiFi, waitTime);
			break;

		case "link_Deals":
			flag = waitForElementClickable(link_Deals, waitTime);
			break;
		case "link_UVSanitizer":
			flag = waitForElementClickable(link_UVSanitizer, waitTime);
			break;
		case "link_UVWaterBottle":
			flag = waitForElementClickable(link_UVWaterBottle, waitTime);
			break;
		case "Iphone":
			flag = waitForElementClickable(Iphone, waitTime);
			break;
			
		case "Iphone64GB":
			flag = waitForElementClickable(Iphone64GB, waitTime);
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

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void moveToElement(String element) throws Exception {

		WebElement ele = null;

		switch (element) {
		//        Mobile Speed
		case "privacyAccept":
		{
			ele = DriverManager.getDriver().findElement(privacyAccept);
			DriverManager.getDriver().findElement(privacyAccept);// mobile } else {

		}		
		
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
		case "Link_PrePaidWifi":
			ele = DriverManager.getDriver().findElement(Link_PrePaidWifi);
			break;
		case "menuBuy":
			ele = DriverManager.getDriver().findElement(link_MenuBuy);
			break;
		case "Link_Prepaidwifi":
			ele = DriverManager.getDriver().findElement(Link_Prepaidwifi);
			break;	
			
		case "link_MenuBuy":
			ele = DriverManager.getDriver().findElement(link_MenuBuy);
			break;
		case "floatingBuyNow":
			ele = DriverManager.getDriver().findElement(floatingBuyNow);
			break;
		case "link_Deals":
			ele = DriverManager.getDriver().findElement(link_Deals);
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

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {

			case "link_MenuBuyAndroid":
				if (Constant.platformName.equalsIgnoreCase("android") || Constant.platformName.equalsIgnoreCase("iOS")) {
					get_link_MenuBuyAndroid().click();				
				}
				break;	
			case "PlanWithDevice_MobileView":
				get_PlanWithDevice_MobileView().click();
				break;
			case "PrepaidWifi_MobileView":
				get_PrepaidWifi_MobileView().click();
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
			case "Link_PrePaidWifi":
				get_Link_PrePaidWifi().click();
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
				
				
			case "menuIconAndroid":		
				get_menuIconAndroid().click();				
				break;	
			case "menuBuy":
				get_menuBuy().click();
				break;
			case "privacyAccept":
				get_privacyAccept().click();
				break;
			case "link_XtremeHomePrepaidWiFi":
				get_XtremeHomePrepaidWiFi().click();
				break;
			case "link_highlights":
				get_link_highlights().click();
				break;
			case "link_features":
				get_link_features().click();
				break;
			case "Link_Prepaidwifi":
				get_Link_Prepaidwifi().click();
				break;
						
			case "link_specifications":
				get_link_specifications().click();
				break;
			case "float_buy":
				get_floatBuy().click();
				break;
			case "link_compare":
				get_link_compare().click();
				break;
			case "link_BLACKPINKLimitedEdition":
				get_link_BLACKPINKLimitedEdition().click();
				break;
			case "link_GlobeAtHomePrepaidWiFi":
				get_link_GlobeAtHomePrepaidWiFi().click();
				break;
			case "Iphone64GB":
				get_Iphone64GB().click();
				break;
			case "cod":
				get_cod().click();
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
