package globeOnline_HPW;

import static org.junit.Assert.assertTrue;



import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.pages.renewal.Renewal_Otp_Page;
import com.pagesHPW.CheckoutPage;
import com.pagesHPW.FormPage;
import com.pagesHPW.GCash_Page;
import com.pagesHPW.LandingPage;
import com.pagesHPW.Notifyme_page;
import com.pagesHPW.OrderDetailsPage;
import com.pagesHPW.Otp_Page;
import com.pagesHPW.PayPage;
import com.pagesHPW.ProductComparatorPage;
import com.pagesHPW.SurveyPage;
import com.pagesHPW.ThankYouPage;
import com.pagesHPW.TrackOrderPage;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;
import utility.Generic;

public class CommonMethods {

	private util util = new util();

	private LandingPage LP = new LandingPage();
	private CheckoutPage checkout = new CheckoutPage();
	private Otp_Page Otp = new Otp_Page();
	private FormPage Form = new FormPage();
	private PayPage Pay = new PayPage();
	private ThankYouPage ThankYou = new ThankYouPage();
	private ProductComparatorPage PC = new ProductComparatorPage();
	private TrackOrderPage TrackOrder = new TrackOrderPage();
	private OrderDetailsPage OrderDetails = new OrderDetailsPage();
	private GCash_Page GCash = new GCash_Page();
	private SurveyPage Survey = new SurveyPage();
	private ThankYouPage TP = new ThankYouPage();
	private BasePage Base = new BasePage();
	private Notifyme_page noti = new Notifyme_page();

	/*************************************
	 * Navigation Bar Validation
	 * 
	 * @throws Exception
	 ***************************************************************/

	public void hover_On_Navigation(String env) throws Exception {

		if (env.equalsIgnoreCase("UAT")) {

			if (Constant.platformName.equalsIgnoreCase("iOS") || Constant.platformName.equalsIgnoreCase("android")) {
				if (LP.isElementExist("Menu Icon", "menuIconAndroid", 10)) {
					Thread.sleep(1000L);
					if (LP.isClickable("menuIconAndroid", 5)) {
						LP.clickOnElement("Link", "menu Icon", "menuIconAndroid");
					}
				}
			}
			LP.isElementExist("Link Globe logo", "link_LogoGlobe", 10);
			LP.isElementExist("Menu bar link - Apply", "link_Apply", 10);
			LP.isElementExist("Menu bar link - Renew", "link_Renew", 10);
			// b.1) Gallery - Not Covered
			LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);
			// LP.isElementExist("Menu bar link - PostPaid", "link_PostPaid", 10);
			// LP.isElementExist("Menu bar link - Gfiber", "link_Gfiber", 10);
			// Android - Click on Buy Chrome - Hover on Buy
			if (Constant.platformName.equalsIgnoreCase("iOS") || Constant.platformName.equalsIgnoreCase("android")) {
				if (LP.isElementExist("Menu Icon", "link_MenuBuyAndroid", 10)) {
					Thread.sleep(1000L);
					if (LP.isClickable("link_MenuBuyAndroid", 5)) {
						LP.clickOnElement("Link", "Buy", "link_MenuBuyAndroid");
						Control.takeScreenshot();
					}
				}
			} else {
				if (LP.isElementExist("Menu bar link - Buy", "link_MenuBuy", 10)) {
					Thread.sleep(2000L);
					LP.moveToElement("link_MenuBuy");
					Thread.sleep(2000L);
				}
			}

			// validate Buy options
			LP.isElementExist("Link - Buy - Xtreme Home Prepaid WiFi", "link_XtremeHomePrepaidWiFi", 10);
			// LP.isElementExist("Link - Buy - Globe At Home Prepaid WiFi",
			// "link_GlobeAtHomePrepaidWiFi", 10);
			LP.isElementExist("Link - Buy - LTE Advanced", "link_LTE_Advanced", 10);
			// LP.isElementExist("Link - Buy - BLACKPINK Limited Edition",
			// "link_BLACKPINKLimitedEdition", 10);
			LP.isElementExist("Link - Buy - MyFi LTE", "link_MyFiLTE", 10);
			LP.isElementExist("Link - Buy - MyFi LTE-Advanced", "link_MyFiLTE_Advanced", 10);

			LP.isElementExist("Menu bar link - Help", "link_Help", 10);
			LP.isElementExist("Menu bar link - Cart Icon", "CartIcon", 10);
			LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);
			Control.takeScreenshot();
		} else {
			if (Constant.platformName.equalsIgnoreCase("iOS") || Constant.platformName.equalsIgnoreCase("android")) {
				if (LP.isElementExist("Menu Icon", "menuIconAndroid", 10)) {
					Thread.sleep(1000L);
					if (LP.isClickable("menuIconAndroid", 5)) {
						LP.clickOnElement("Link", "menu Icon", "menuIconAndroid");
					}
				}
			}
			LP.isElementExist("Mobile postpaid", "link_MobilePostPaid", 10);
			LP.isElementExist("Menu bar link - GFiber", "link_Gfiber", 10);
			LP.isElementExist("Menu bar link - Prepaidwifi", "Link_Prepaidwifi", 10);
			LP.isElementExist("Menu bar link - Deals", "link_Deals", 10);
			LP.isElementExist("Menu bar link - Reload", "link_Reload", 10);
			LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);
			LP.isElementExist("Menu bar link - Help", "link_Help", 10);
			LP.isElementExist("RegisterSim link", "link_Registersim", 10);
			LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);

			if (LP.isElementExist("Menu bar link - Prepaidwifi", "Link_Prepaidwifi", 10)) {
				Thread.sleep(2000L);
				LP.moveToElement("Link_Prepaidwifi");
				Thread.sleep(3000L);
				System.out.println("Moved to Prepaidwifi icon on menu bar");
				LP.isElementExist("Link - PrePaid WIFI - Xtreme Home Prepaid WiFi", "link_XtremeHomePrepaidWiFi", 10);
				LP.isElementExist("Link - PrePaid WIFI - Globe At Home Prepaid WiFi", "link_GlobeAtHomePrepaidWiFi",
						10);
				LP.isElementExist("Link - PrePaid WIFI- MyFiLTE_Advanced", "link_MyFiLTE_Advanced", 10);
				Control.takeScreenshot();
				// Android - Click on Buy Chrome - Hover on Buy
				if (Constant.platformName.equalsIgnoreCase("iOS")
						|| Constant.platformName.equalsIgnoreCase("android")) {
					if (LP.isElementExist("Prepaidwifi Icon", "Link_Prepaidwifi", 10)) {
						Thread.sleep(1000L);
						if (LP.isClickable("Link_Prepaidwifi", 5)) {
							LP.clickOnElement("Link", "Link_Prepaidwifi", "Link_Prepaidwifi");
							Control.takeScreenshot();
						}
					}
				} else {
					if (LP.isElementExist("Menu bar link - Prepaidwifi", "Link_Prepaidwifi", 10)) {
						Thread.sleep(2000L);
						LP.moveToElement("Link_Prepaidwifi");
						Thread.sleep(2000L);
					}
				}

				// validate Buy options
				LP.isElementExist("Link - Buy - Xtreme Home Prepaid WiFi", "link_XtremeHomePrepaidWiFi", 10);
				LP.isElementExist("Link - Buy - LTE Advanced", "link_LTE_Advanced", 10);
				LP.isElementExist("Link - Buy - MyFi LTE", "link_MyFiLTE", 10);
				LP.isElementExist("Link - Buy - MyFi LTE-Advanced", "link_MyFiLTE_Advanced", 10);
				LP.isElementExist("Menu bar link - Help", "link_Help", 10);
				LP.isElementExist("Menu bar link - Cart Icon", "CartIcon", 10);
				LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);
				Control.takeScreenshot();
			}
		}

	}
//	public void openApplication(String url) throws Exception {
//		DriverManager.getDriver().get(url);
//		assertTrue(DriverManager.getDriver().getTitle().contains("Home"));	
//		System.out.println("Accessed aplication successfully");
//}

public void openApplication() throws Exception {
		
		if(Constant.environment.equalsIgnoreCase("UAT")) {
			DriverManager.getDriver().get(Constant.UAT_URL);
			assertTrue(DriverManager.getDriver().getTitle().contains("Customize your GPlan with Device"));	
			System.out.println("Accessed aplication successfully");
		}
		else if(Constant.environment.equalsIgnoreCase("preprod")) {
			DriverManager.getDriver().get(Constant.PreProd_URL);
//    		assertTrue(DriverManager.getDriver().getTitle().contains("Home"));	
			System.out.println("Accessed aplication successfully");
		}
		else if(Constant.environment.equalsIgnoreCase("Dev")) {
			DriverManager.getDriver().get(Constant.DevUrl);
//			assertTrue(DriverManager.getDriver().getTitle().contains("New Globe Online Shop"));	
			System.out.println("Launched Aplication");
		}
		else if(Constant.environment.equalsIgnoreCase("Maintenance")) {
			DriverManager.getDriver().get(Constant.Maintenance);
//			assertTrue(DriverManager.getDriver().getTitle().contains("New Globe Online Shop"));	
			System.out.println("Launched Aplication");
			LP.isElementExist("TokenInput", "TokenInput", 20);
			LP.get_TokenInput().sendKeys(Constant.Token);
			Control.takeScreenshot();
			LP.jsClick("TokenSubmit", "TokenSubmit");
		}
		else if (Constant.environment.equalsIgnoreCase("Dev_Desktop")) {
			DriverManager.getDriver().get(Constant.DevUrl);
//			assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
			System.out.println("Accessed Preprod aplication successfully");
		}
	}
	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void GHPW_BPHPW_Thankyoupage() throws Exception {
		TP.isElementExist("Thankyou_label", "Thankyoulabel", 10);
		TP.isElementExist("Confirm_label", "Confirmlabel", 10);
		TP.isElementExist("Order_Recieved", "OrderRecieved", 10);
		TP.isElementExist("Refrcenum_Label", "RefrcenumLabel", 10);
		TP.isElementExist("copy_icon", "copyicon", 10);
		TP.isElementExist("Itemsorder_label", "Itemsorderlabel", 10);
		TP.isElementExist("Track_myorder", "Trackmyorder", 10);
	}

	/**
	 * @throws InterruptedException
	 ******************************************************************************************************************************/
	public void WaitLoading(int seconds) throws InterruptedException {

		// boolean waitGCashFunction=
		// DriverManager.getDriver().findElement(By.xpath("//img[@src='img/gcash_logo.f988652']")).isDisplayed();
		if (Base.GCASHwaitForElementVisibility(By.xpath("//div[@class='pulse-container']/img"), 3)) {
			System.out.println("Waiting for 5 Secs to load.............");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browserstack.idleTimeout", 5);
			Thread.sleep(5000);
		} else {

			System.out.println("Loading is done.");
		}
	}

	/**
	 * /
	 ********************************************************************************************************************************/

	/**
	 * @throws InterruptedException
	 ******************************************************************************************************************************/
	public void BrowserStackPageWait(int seconds) throws InterruptedException {

		// boolean waitGCashFunction=
		// DriverManager.getDriver().findElement(By.xpath("//img[@src='img/gcash_logo.f988652']")).isDisplayed();
		if (Base.GCASHwaitForElementVisibility(By.xpath("//img[@src='img/gcash_logo.f988652']"), 3)) {
			System.out.println("Waiting failed!!");
		} else {
			System.out.println("Waiting for " + seconds + " Secs.............");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browserstack.idleTimeout", seconds);
			Thread.sleep(seconds + 000);

		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void MobileNumError() throws Exception {
		// checkout.get_mobileNumber().sendKeys("1");
		checkout.enterText("mobileNumber", "mobileNumber", "1");
		Control.takeScreenshot();
		checkout.get_mobileNumber().sendKeys(Keys.TAB);
		checkout.isElementExist("Please use the correct format: 09XX XX XXXX. No need for country or area code.",
				"InvalidMobNumError", 10);
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void PrefilledMobNum() throws Exception {
		String MobnumPrefilledd = checkout.get_mobileNumber().getAttribute("value");
		if (MobnumPrefilledd == null || MobnumPrefilledd.isEmpty()) {
			Control.takeScreenshot();
			System.out.println("Mobile Number textbox is NOT prefilled : FAILED");
		} else {
			System.out.println("Mobile Number textbox is prefilled : PASSED");
		}

	}

	/**
	 * /
	 * 
	 * @throws Exception
	 ********************************************************************************************************************************/
	public void insert_phoneNo_select_checkout_option(String phoneNo, String checkoutOption) throws Exception {

		PrefilledMobNum();
//		MobileNumError();
		checkout.enterText("mobileNumber", "mobileNumber", phoneNo);
		Control.takeScreenshot();
		System.out.println("Inserted mobile no : " + phoneNo);
//		Constant.dataMap.get().put("GO_MobileNumber", phoneNo);

		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				checkout.get_PrivacyClause());
		if (checkout.isElementExist("Privacy Clause", "PrivacyClause", 10)) {
			System.out.println("Privacy Clause : " + checkout.get_PrivacyClause().getText());
//			checkout.get_PrivacyClause().click();	
//			checkout.clickOnElement("Click On Privacy Clause", "PrivacyClause", "PrivacyClause");
			Control.takeScreenshot();
		} else {
			System.out.println("Privacy Clause: FAILED - Not displayed");
		}

		if (checkoutOption.equalsIgnoreCase("StandardCheckout")) {
			if (checkout.isClickable("StanCheckout", 10)) {
				Control.takeScreenshot();
//				checkout.get_standardCheckout().click();
				PC.js_clickOnElement("Click On Standard Checkout", "standardCheckout", "standardCheckout");
//				checkout.clickOnElement("Click On Standard Checkout", "standardCheckout", "standardCheckout");
				System.out.println("Clicked on Standard Checkout");
			}

		} else if (checkoutOption.equalsIgnoreCase("GCash")) {

			if (checkout.isElementExist("Button - Gcash Checkout", "gcashCheckout", 10)) {
				Control.takeScreenshot();
//				checkout.get_gcashCheckout().click();
				PC.js_clickOnElement("Click On Gcash Checkout", "gcashCheckout", "gcashCheckout");
//				checkout.clickOnElement("Click On Gcash Checkout", "gcashCheckout", "gcashCheckout");
				System.out.println("Clicked on gcash Pay");
			}
			By btnGcashCheckout = By.xpath("//button[contains(text(), 'Checkout using GCash')]");
		}
	}

	/******************************************************************************************************************************/

	public void NavbarValidation(String env) throws Exception {
		if (env.equalsIgnoreCase("UAT")) {
			LP.isElementExist("Link Globe logo", "link_LogoGlobe", 10);
			LP.isElementExist("Menu bar link - Apply", "link_Apply", 10);
			LP.isElementExist("Menu bar link - Renew", "link_Renew", 10);
			LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);

			if (LP.isElementExist("Menu bar link - Buy", "link_MenuBuy", 10)) {
				Thread.sleep(2000L);
				LP.moveToElement("menuBuy");
				Thread.sleep(1000L);
				System.out.println("Moved to Buy icon on menu bar");
//				LP.isElementExist("Link - Buy - Xtreme Home Prepaid WiFi", "link_XtremeHomePrepaidWiFi", 10);
				LP.isElementExist("Link - Buy - Globe At Home Prepaid WiFi", "link_GlobeAtHomePrepaidWiFi", 10);
				LP.isElementExist("Link - Buy - LTE Advanced", "link_LTE_Advanced", 10);
				LP.isElementExist("Link - Buy - BLACKPINK Limited Edition", "link_BLACKPINKLimitedEdition", 10);
				LP.isElementExist("Link - Buy - MyFi LTE", "link_MyFiLTE", 10);
				LP.isElementExist("Link - Buy - MyFi LTE-Advanced", "link_MyFiLTE_Advanced", 10);
			}
			LP.isElementExist("Menu bar link - Help", "link_Help", 10);
			LP.isElementExist("Menu bar link - Cart Icon", "CartIcon", 10);
			LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);
			Control.takeScreenshot();
			// Menu BAR VALIDATION
			if (LP.isElementExist("Menu bar link - Buy", "link_MenuBuy", 10)) {
				Thread.sleep(2000L);
				// LP.moveToElement("floatingBuyNow");
				LP.moveToElement("menuBuy");
				Thread.sleep(3000L);
				System.out.println("Moved to Buy icon on menu bar");
//				LP.isElementExist("Link - Buy - Xtreme Home Prepaid WiFi", "link_XtremeHomePrepaidWiFi", 10);
				LP.isElementExist("Link - Buy - Globe At Home Prepaid WiFi", "link_GlobeAtHomePrepaidWiFi", 10);
				LP.isElementExist("Link - Buy - LTE Advanced", "link_LTE_Advanced", 10);
				LP.isElementExist("Link - Buy - BLACKPINK Limited Edition", "link_BLACKPINKLimitedEdition", 10);
				Control.takeScreenshot();
			}
		} 
		
		else if (env.equalsIgnoreCase("Dev_Desktop")) {
			Thread.sleep(3000);
			if (LP.isElementExist("Menu bar link - EasyPaymentTetx", "EasyPaymentTetx", 10)) {
				LP.isElementExist("Link Globe logo", "CancelIcon", 10);
				LP.isElementExist("Menu bar link - Mobile", "Link_Mobile", 10);
				LP.isElementExist("Menu bar link - Home Internet", "Link_HomeInternet", 10);
				LP.isElementExist("Menu bar link - Deals", "Link_Deals", 10);
				LP.isElementExist("Menu bar link - Quick Links", "Link_QuickLinks", 10);
				LP.isElementExist("Menu bar link - Track my order", "Link_TrackMyorder", 10);
				Control.takeScreenshot();
				// step 2 : Hover on Mobile Link button
				LP.isElementExist("Menu bar link - Mobile", "Link_Mobile", 10);
				LP.moveToElement("Link_Mobile");
				LP.isElementExist("postpaid", "Link_Postpaid", 10);
				LP.isElementExist("New online", "Link_NewOnline", 10);
				LP.isElementExist("Sim Only", "Link_SimOnly", 10);
				LP.isElementExist("Plan With Device", "Link_PlanWithDevice", 10);
				LP.isElementExist("Renewal", "Link_Renewal", 10);
				Control.takeScreenshot();
				// step 3 : Hover on HomeInternet Link button
				LP.isElementExist("Menu bar link - Internet", "Link_HomeInternet", 10);
				LP.moveToElement("Link_HomeInternet");
				LP.isElementExist("Home Internet postpaid", "Link_HIpostpaid", 10);	
				LP.isElementExist("Apply Gfiber Plan", "Link_ApplyGfiberPlan", 10);
				LP.isElementExist("Upgrade Internet Plan", "Link_UpgradeInternetPlan", 10);
				LP.isElementExist("Prepaid", "Link_Prepaid", 10);
				LP.isElementExist("Gfiber Prepaid", "GFiber_Prepaid", 10);
//	         	LP.isElementExist("Prepaid Wifi", "Link_PrepaidWifi", 10);
	         	LP.isElementExist("Prepaid Wifi SIM", "Link_PrepaidWifiSIM", 10);
    	
				LP.isElementExist("Link Deals", "Link_Deals", 10);	
				LP.moveToElement("Link_Deals");
				LP.isElementExist("GPlanPLUS Discounted Devices", "Link_GPlanPLUS_Discounted_Devices", 10);
		     	LP.isElementExist("Link GlobePrepaidExclusives", "Link_Globe_Prepaid_Exclusives", 10);
				// step 4 : Hover on HomeInternet Link button
				
				LP.isElementExist("Menu bar link - BuyLoad", "Link_QuickLinks", 10);
				LP.moveToElement("Link_QuickLinks");
				LP.isElementExist("Menu bar link - BuyLoad", "Link_BUYLoad", 10);
				LP.isElementExist("Home Internet postpaid", "Link_Register_your_SIM", 10);
				LP.isElementExist("Switch to Globe", "Link_SwitchtoGlobe", 10);
				LP.isElementExist("Help Support", "Link_HelpSupport", 10);
				Control.takeScreenshot();
				} else {
					System.out.println("It is not Hovered on Mobile Plan");
				}
			}
		
		else {
			LP.isElementExist("Mobile postpaid", "link_MobilePostPaid", 10);
			LP.isElementExist("Menu bar link - GFiber", "link_Gfiber", 10);
			LP.isElementExist("Menu bar link - Prepaidwifi", "Link_Prepaidwifi", 10);
			LP.isElementExist("Menu bar link - Deals", "link_Deals", 10);
			LP.isElementExist("Menu bar link - Reload", "link_Reload", 10);
			LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);
			LP.isElementExist("Menu bar link - Help", "link_Help", 10);
			LP.isElementExist("RegisterSim link", "link_Registersim", 10);
			LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);
			Control.takeScreenshot();
			if (LP.isElementExist("Menu bar link - Prepaidwifi", "Link_Prepaidwifi", 10)) {
				Thread.sleep(2000L);
				LP.moveToElement("Link_Prepaidwifi");
				Thread.sleep(3000L);
				System.out.println("Moved to Prepaidwifi icon on menu bar");
				LP.isElementExist("Link - PrePaid WIFI - Xtreme Home Prepaid WiFi", "link_XtremeHomePrepaidWiFi", 10);
				LP.isElementExist("Link - PrePaid WIFI - Globe At Home Prepaid WiFi", "link_GlobeAtHomePrepaidWiFi",
						10);
				LP.isElementExist("Link - PrePaid WIFI- MyFiLTE_Advanced", "link_MyFiLTE_Advanced", 10);
				Control.takeScreenshot();

			}
		}
	}

	// Validating XtremePrepaidWifiValidation And Footer Validation
	public void XtremeHomePrepaidWiFi(String env) throws Exception {
		if (env.equalsIgnoreCase("UAT")) {
			LP.moveToElement("menuBuy");
			if (LP.isElementExist("Menu bar link - BUY", "link_XtremeHomePrepaidWiFi", 10)) {
				if (LP.isClickable("link_XtremeHomePrepaidWiFi", 5)) {
					LP.clickOnElement("Link", "Xtreme Home Prepaid WiFi", "link_XtremeHomePrepaidWiFi");
					Thread.sleep(2000L);

				}
			}

		} else {
			Thread.sleep(2000L);
			LP.moveToElement("Link_Prepaidwifi");
			if (LP.isClickable("link_XtremeHomePrepaidWiFi", 5)) {
				LP.clickOnElement("Xtreme HomePrepaid WiFi", "", "link_XtremeHomePrepaidWiFi");
				Thread.sleep(2000L);
			}
		}
//		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(),
//				"Xtreme Home Prepaid WiFi with Internet TV | Globe at Home");
		// Validate XHPW Landing Page including
		Thread.sleep(3000L);
		LP.moveToElement("floatingBuyNow");
		Thread.sleep(1000L);
		LP.isElementExist("Button - Download Manual", "downloadManual", 10);
		LP.isElementExist("Button - Buy now", "buyNow", 10);
		LP.isElementExist("Button - Floating Buy now", "floatingBuyNow", 10);
		Control.takeScreenshot();
		if (LP.get_floatActualPrice().getCssValue("text-decoration").contains("line-through")) {
			System.out.println("Float Actual Price is 'Strikethrough'");
		} else {
			System.out.println("Float Actual Price is not 'Strikethrough'");
		}
	}

	/********************************************************************************************************************************/
	// Validate GHPW Landing Page including
	/********************************************************************************************************************************/
	public void GPHWProductValidation(String env) throws Exception {
//		if (env.equalsIgnoreCase("UAT")) {
//			LP.moveToElement("menuBuy");
//			if (LP.isElementExist("Menu bar link - BUY", "link_GlobeAtHomePrepaidWiFi", 10)) {
//				if (LP.isClickable("link_GlobeAtHomePrepaidWiFi", 5)) {
//					LP.clickOnElement("Link", "Globe Home Prepaid WiFi", "link_GlobeAtHomePrepaidWiFi");
//					Thread.sleep(2000L);
//				}
//			}
//		} else {
//			Thread.sleep(3000L);
//			LP.moveToElement("Link_Prepaidwifi");
//			if (LP.isClickable("Link_Prepaidwifi", 5)) {
//				LP.clickOnElement("Link", "Click on Prepaidwifi", "Link_Prepaidwifi");
//			}
//		}
////			util.assertContainText("Validated title", DriverManager.getDriver().getTitle(),
//					"Home Prepaid WiFi  | Globe at Home");
		// Validate XHPW Landing Page including
		Thread.sleep(3000L);
//			LP.moveToElement("floatingBuyNow");
		LP.isElementExist("Button - Floating Buy now", "floatingBuyNow", 10);
		LP.isElementExist("Button - Download Manual", "downloadManual", 10);
		LP.isElementExist("Button - Buy now", "buyNow", 10);
		LP.isElementExist("Button - Floating Buy now", "floatingBuyNow", 10);
		Control.takeScreenshot();
	}

	/********************************************************************************************************************************/

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void handle_and_insert_OTP() throws Exception {
//		if (Otp.isElementExist("OTPInput", "otpInput", 10)) {
//			if (Otp.isElementExist("otpInput1", "otpInput1", 15)) {
//				//Otp.jsClick("getCodeButton", "getCodeButton");
//				Otp.isElementExist("ResendCode", "ResendCode", 20);
//				for (int j = 0; j < Otp.get_otpInput1().size(); j++) {
//					Otp.get_otpInput().get(j).sendKeys(String.valueOf(j + 1));
//				}
//			} else
//				for (int j = 0; j < Otp.get_otpInput1().size(); j++) {
//					Otp.get_otpInput().get(j).sendKeys(String.valueOf(j + 1));
//				}
//			System.out.println("Inserted OTP");
//		}
//		if (Otp.isElementExist("submitButton", "submitButton", 10)) {
//			Control.takeScreenshot();
//			Otp.jsClick("submitButton", "submitButton");
//		}	}
//	
	
//	public void handle_and_insert_OTP() throws Exception {	
//		Thread.sleep(10000L);
//		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
//			for (int j = 0; j < checkout.get_OTP().size(); j++) {
//				checkout.get_OTP().get(j).sendKeys(String.valueOf(j + 1));
//			}
//			System.out.println("Inserted OTP");
//		}		Thread.sleep(5000L);
//		
//		if (Form.isElementExist("Heading - Form", "hdrForm", 10)) {
//			System.out.println("Waiting... for FORM page to load");
//		}
//		;
	}
	
	public void insert_OTP_From_Console() throws Exception {	
		checkout.isElementExist("Text OTP", "otpText", 30);
		{
			util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "One-Time Password");
			Control.takeScreenshot();
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter OTP HERE");
			String OTP = myObj.nextLine();  // Read user input
			System.out.println("OTP : " + OTP);
		
			String number = String.valueOf(OTP);
		
			String[] digits = number.split("(?<=.)");
		
			for (int i = 1; i <= 6; i++) {
				Thread.sleep(1000);
				String xPathWithVariable = "//input[contains(@id,'otpInput')]" + "[" + i + "]";
				DriverManager.getDriver().findElement(By.xpath(xPathWithVariable)).sendKeys(digits[i - 1]);
		   }
			System.out.println("OTP entered successfully");
		}	
	}
	

	/**
	 * @throws Exception
	 ****************************************************************************************************************************/
	public void handle_and_insert_OTPAndroid() throws Exception {
		if (checkout.isElementExist("Text OTP", "otpText", 30)) {

//			checkout.get_MobileOTP().sendKeys("123456");
			checkout.enterText("MobileOTP", "MobileOTP", "123456");

			System.out.println("Inserted OTP");
		}
		if (checkout.isElementExist("Transaction timeout", "transactionTimeOut", 15)) {
			DriverManager.getDriver().navigate().refresh();
			Thread.sleep(10000);
//			checkout.get_MobileOTP().sendKeys("123456");
			checkout.enterText("MobileOTP", "MobileOTP", "123456");

		} else
			System.out.println("able to proceed");
	}

	public void Link_deals() throws Exception {
		if (LP.isElementExist("Menu bar link - DEALS", "link_Deals", 10)) {
			Thread.sleep(2000L);
			LP.moveToElement("link_Deals");
			Thread.sleep(2000L);
			System.out.println("Moved to DEALS on menu bar");
			LP.isElementExist("Link - Deals - Lifestyle Sanitizer", "link_UVSanitizer", 10);
			LP.isElementExist("Link - Deals - Lifestyle Water Bottle", "link_UVWaterBottle", 10);
		}
	}

	public void UVsanitizer_Validation() throws Exception {
		// Step - 5, line - 152
		// common.select_UVSanitizer_on_home_page();
		assertTrue(DriverManager.getDriver().getTitle().contains("UV Sanitizer"));
		System.out.println("Validated title(Lifetyle): " + DriverManager.getDriver().getTitle());
		// util.assertContainText("Validated title",
		// DriverManager.getDriver().getTitle(), "UV Sanitizer");
		// common.Validate_Deals_Sanitizer_Page();

		// Step - 12, line - 153
		// Validate and click Express Checkout button for GHPW - not covered
		LP.clickOnElement("Button", "float_buy", "float_buy");
		System.out.println("Clicked on Buy icon on UV Sanitizer");
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validateTotalAMount(String cashoutAmt, String shipping, String totalAmt) throws Exception {
		float iCashoutAmt = 0;
		float iShipping = 0;
		float itotalAmt = 0;

		cashoutAmt = (String) cashoutAmt.subSequence(1, cashoutAmt.length());
		iCashoutAmt = Float.valueOf(cashoutAmt.replace(",", ""));

		if (shipping.equalsIgnoreCase("free")) {
			iShipping = 0;
		} else {
			shipping = (String) shipping.subSequence(1, shipping.length());
			iShipping = Float.valueOf(shipping.replace(",", ""));
		}

		totalAmt = (String) totalAmt.subSequence(1, totalAmt.length());
		itotalAmt = Float.valueOf(totalAmt.replace(",", ""));

		if (itotalAmt == (iCashoutAmt + iShipping)) {
			System.out.println("Total Amount is same as Cashout + Shipping :" + itotalAmt);
		} else {
			System.out.println("Total Amount is not same as Cashout + Shipping. Total :" + itotalAmt
					+ " - CaShout+Shipping : " + (iCashoutAmt + iShipping));
		}
		Control.takeScreenshot();
	}

	/********************************************************************************************************************************/
	public static String RandomString(int intvalue) throws Exception {
		char c[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		// ,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
		int randomPosition;
		String RandomString = "";
		for (int i = 0; i < intvalue; i++) {
			randomPosition = generateRandomIntIntRange(0, 51);
			RandomString = RandomString + c[randomPosition];
		}
		// System.out.println(RandomString);
		return RandomString;
	}

	/********************************************************************************************************************************/
	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	/****************************************************************************/

	public void insert_personal_info_on_form_RandomName(String email, String payOption) throws Exception {
		Form.scroll_vertical(25);
		if (payOption.equalsIgnoreCase("GCash")) {
			Thread.sleep(8000L);
		} else {
			Thread.sleep(2000L);
		}
		String Fname = RandomString(1) + "arian";
		String Mname = RandomString(1) + "anos";
		String Lname = RandomString(1) + "allado";

		Form.get_firstName().clear();

		Form.enterText("firstName", "firstName", Fname);
		// Form.entertextget_firstName().sendKeys(Fname);
		System.out.println("First Name : " + Fname);

		Form.get_middleName().clear();
		Form.enterText("middleName", "middleName", Mname);
		// Form.get_middleName().sendKeys(Mname);
		System.out.println("Middle Name : " + Mname);

		Form.get_lastName().clear();
		Form.enterText("lastName", "lastName", Lname);
		Form.get_lastName().sendKeys(Lname);
		System.out.println("Last Name : " + Lname);

		Form.get_email().clear();
		// Form.get_email().sendKeys(email);
		Form.enterText("email", "email", "zsshettappa@globe.com.ph");
		System.out.println("Email : " + email);

//		Constant.dataMap.get().put("CustomerDetails", Fname + " " + Mname + " " + Lname + " " + email);
		Thread.sleep(1500L);
		Control.takeScreenshot();
	}

	/********************************************************************************************************************************/
	public void insert_personal_info_on_form(String email, String payOption) throws InterruptedException {
		Form.scroll_vertical(25);
		if (payOption.equalsIgnoreCase("GCash")) {
			Thread.sleep(8000L);
		} else {
			Thread.sleep(2000L);
		}

		Form.get_firstName().clear();
		Form.get_firstName().sendKeys("ABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJ");
		Form.get_firstName().clear();
		Form.get_firstName().sendKeys("TestAutomateFname");

		System.out.println("First Name : TestF");
		Form.get_middleName().clear();
		Form.get_middleName().sendKeys("ABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJ");
		Form.get_middleName().clear();
		Form.get_middleName().sendKeys("TestAutomateMiddlename");
		System.out.println("Middle Name : TestM");

		Form.get_lastName().clear();
		Form.get_lastName().sendKeys("ABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJ");
		Form.get_lastName().clear();
		Form.get_lastName().sendKeys("TestAutomateLname");
		System.out.println("Last Name : TestL");
		Form.get_email().clear();
		Form.get_email().sendKeys(email);
		System.out.println("Email : " + email);

		Constant.dataMap.get().put("CustomerDetails", "TestF - TestM - TestL - " + email);

		Form.scroll_vertical(450);
		Thread.sleep(1500L);
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void insert_address_details(String House_Condo, String HouseNo_FloorNo, String Street,
			String Subdi_BuildingName, String Prov, String City, String Brgy) throws Exception {

		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				Form.get_AddressLbl());
		// LP.get_condominium().click();

		Form.isElementExist("Address Header", "AddressLbl", 10);
		Form.isElementExist("Address House Rbtn", "rBtb_House", 10);
		Form.isElementExist("Address Condo Rbtn", "rBtn_condominium", 10);

		if (House_Condo.equalsIgnoreCase("Condo")) {
			Form.javascript_clickCondominium();
			Control.takeScreenshot();
			System.out.println("Selected radio button : Condominium");

			System.out.println("Condominium Signal Strength Warning Text 1 : "
					+ Form.get_SignalStrengthWarning().get(0).getText());
			System.out.println("Condominium Signal Strength Warning Text 2 : "
					+ Form.get_SignalStrengthWarning().get(1).getText());

			((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
					Form.get_floor());
			Thread.sleep(2000L);

			// Form.get_floor().sendKeys("123456789012");
			Thread.sleep(2000);
			Form.enterText("floor", "floor", "123456789012");
			Thread.sleep(2000);
			Form.get_floor().clear();
			// Form.get_floor().sendKeys(HouseNo_FloorNo);
			Thread.sleep(2000);
			Form.enterText("floor", "floor", HouseNo_FloorNo);
			Control.takeScreenshot();
			System.out.println("Floor : " + HouseNo_FloorNo);

			// Form.get_buildingName().sendKeys("adbcedfghiadbcedfghiadbcedfghiadbcedfghiadbcedfghi");
			((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
					Form.get_buildingName());
			Thread.sleep(2000);
			Form.enterText("buildingName", "buildingName", "ABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJ");
			Control.takeScreenshot();
			Form.get_buildingName().clear();
			Thread.sleep(2000);
			Control.takeScreenshot();
			Thread.sleep(2000);
			Form.enterText("buildingName", "buildingName", Subdi_BuildingName);
			Control.takeScreenshot();
			// Form.get_buildingName().sendKeys(Subdi_BuildingName);
			System.out.println("Building Name : " + Subdi_BuildingName);

			Thread.sleep(2000);
			Form.enterText("street", "street", "AXXXSASDEDABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJ");
			Thread.sleep(2000);
			Control.takeScreenshot();
			// Form.get_street().sendKeys("adbcedfghiadbcedfghiadbcedfghiadbcedfghiadbcedfghi");
			Form.get_street().clear();
			Thread.sleep(2000);
			Control.takeScreenshot();
			Form.enterText("street", "street", Street);
			Form.get_street().sendKeys(Street);
			Control.takeScreenshot();
			System.out.println("Street : " + Street);

			Form.select_province(Prov);
			System.out.println("Province : " + Prov);
			Thread.sleep(2000L);
			Control.takeScreenshot();

			Form.select_city(City);
			System.out.println("City : " + City);
			Thread.sleep(2000L);
			Control.takeScreenshot();

			Form.select_barangay(Brgy);
			System.out.println("Barangay : " + Brgy);
			Thread.sleep(2000L);
			Thread.sleep(1000L);
			Control.takeScreenshot();

		} else {
			Form.javascript_clickRadioBtn_House();
			System.out.println("Selected radio button : House");
			Control.takeScreenshot();
			Form.scroll_vertical(375);
			Thread.sleep(2000L);

			Form.get_house().sendKeys(HouseNo_FloorNo);
			System.out.println("House No : " + HouseNo_FloorNo);

			Form.get_subDivision().sendKeys(Subdi_BuildingName);
			System.out.println("Subdivision : " + Subdi_BuildingName);

			Form.get_street().sendKeys(Street);
			System.out.println("Street : " + Street);

			Form.select_province(Prov);
			System.out.println("Province : " + Prov);
			Thread.sleep(2000L);

			Form.select_city(City);
			System.out.println("City : " + City);
			Thread.sleep(2000L);

			Form.select_barangay(Brgy);
			System.out.println("Barangay : " + Brgy);
			Thread.sleep(3000L);
			Control.takeScreenshot();
		}

		Constant.dataMap.get().put("ShippingAddress",
				HouseNo_FloorNo + ", " + Subdi_BuildingName + ", " + Street + ", " + Prov + ", " + City + ", " + Brgy);
		Constant.dataMap.get().put("CustomerDetails",
				HouseNo_FloorNo + ", " + Subdi_BuildingName + ", " + Street + ", " + Prov + ", " + City + ", " + Brgy);
		Constant.dataMap.get().put("Magento_AddressInformation",
				HouseNo_FloorNo + ", " + Subdi_BuildingName + ", " + Street + ", " + Prov + ", " + City + ", " + Brgy);

	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void insert_address_details_Condominium() throws Exception {
		// LP.get_condominium().click();
		Form.javascript_clickCondominium();
		System.out.println("Selected radio button : Condominium");

		System.out.println(
				"Condominium Signal Strength Warning Text 1 : " + Form.get_SignalStrengthWarning().get(0).getText());
		System.out.println(
				"Condominium Signal Strength Warning Text 2 : " + Form.get_SignalStrengthWarning().get(1).getText());

		Form.scroll_vertical(375);
		Thread.sleep(2000L);

		Form.get_floor().sendKeys("10");
		System.out.println("Floor : 10");

		Form.get_buildingName().sendKeys("Test");
		System.out.println("Building Name : Test");

		Form.get_street().sendKeys("Test");
		System.out.println("Street : Test");

		Form.select_province("METRO MANILA");
		System.out.println("Province : METRO MANILA");

		Form.select_city("MANILA CITY (BINONDO)");
		System.out.println("City : MANILA CITY (BINONDO)");

		Form.select_barangay("Barangay 290");
		System.out.println("Barangay : Barangay 290");
		Thread.sleep(1000L);

		Constant.dataMap.get().put("ShippingAddress",
				"10 - Test - Test - METRO MANILA - MANILA CITY (BINONDO) - Barangay 290");
		Constant.dataMap.get().put("CustomerDetails",
				"10 - Test - Test - METRO MANILA - MANILA CITY (BINONDO) - Barangay 290");
		Constant.dataMap.get().put("Magento_AddressInformation",
				"10 - Test - Test - METRO MANILA - MANILA CITY (BINONDO) - Barangay 290");
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void insert_address_details_House() throws Exception {
		// LP.get_condominium().click();
		Form.javascript_clickRadioBtn_House();
		System.out.println("Selected radio button : House");

		Form.scroll_vertical(275);
		Thread.sleep(2000L);

		Form.get_house().sendKeys("100");
		System.out.println("House : 100");

		Form.get_street().sendKeys("Test");
		System.out.println("Street : Test");

		Form.get_village_subDivision().sendKeys("Test");
		System.out.println("Village/SubDivision : Test");

		Form.select_province("METRO MANILA");
		Form.select_city("MANILA CITY (BINONDO)");
		Form.select_barangay("Barangay 290");
		Thread.sleep(1000L);

		Constant.dataMap.get().put("OMT_ShippingAddress",
				"10 - Test - Test - METRO MANILA - MANILA CITY (BINONDO) - Barangay 290");
		Constant.dataMap.get().put("OMT_AddressDetails",
				"10 - Test - Test - METRO MANILA - MANILA CITY (BINONDO) - Barangay 290");
		Constant.dataMap.get().put("Magento_AddressInformation",
				"10 - Test - Test - METRO MANILA - MANILA CITY (BINONDO) - Barangay 290");
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void select_chkbx_acceptAllTerms() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				Form.get_checkbox_acceptAll());
		Thread.sleep(2000L);
		if (Form.isElementExist("Checkbox - Accept All", "chkbx_acceptAll", 10)) {
			Control.takeScreenshot();
			LP.jsClick("checkbox_acceptAll", "chkbx_acceptAll");
//			Form.clickOnElement("Click On T&C Button", "checkbox_acceptAll", "chkbx_acceptAll");
//			Form.get_checkbox_acceptAll().click();
			System.out.println("I accept all Terms and Conditions. - CHECKED");
			Control.takeScreenshot();
			Thread.sleep(2000L);
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void click_pay_btn_on_form(String Env) throws Exception {
//		if (Constant.platformName.equalsIgnoreCase("android") | Constant.platformName.equalsIgnoreCase("iOS")) 
		if(Env.equalsIgnoreCase("android") || Env.equalsIgnoreCase("iOS")){
			((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",Form.get_btnPay_Android());
			if (Form.isClickable("btnPay_Android", 10)) {
				Control.takeScreenshot();
//				Form.get_btnPay_Android().click();
				Form.js_clickOnElement("Button", " Pay", "Pay");
			}
		} else {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
					Form.get_btnPay());
//			if (Form.isClickable("Pay", 10)) {
				Control.takeScreenshot();
//				Form.get_btnPay().click();
				Form.js_clickOnElement("Button", " Pay", "Pay");
//		}
		}
		System.out.println("Clicked on Pay button on Form page");
		if (Pay.isElementExist("Heading - Pay", "hdrPay", 10)) {
			System.out.println("Waiting... for PAY page to load");
		}
		Control.takeScreenshot();
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void select_payment_option_proceed_with_payment(String payOption,String SCN) throws Exception {

		if ((payOption.equalsIgnoreCase("StandardCheckout")) || (payOption.equalsIgnoreCase("COD"))) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",Pay.get_cod());
			Control.takeScreenshot();
//			Pay.get_cod().click();
			LP.clickOnElement("COD Pay option Button", "cod", "cod");
			System.out.println("Selected COD on Pay page");
			Control.takeScreenshot();
			clickPayOrderOnPayScreen();
			
		} 
		else if (payOption.equalsIgnoreCase("GCash")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browserstack.idleTimeout", "20");
			Thread.sleep(20000);
			Control.takeScreenshot();
//			Pay.get_payOpt_Gcash().click();ss
			Pay.clickOnElement("Button", "payOpt_Gcash", "payOpt_Gcash");
			Control.takeScreenshot();
			System.out.println("Selected Gcash on Pay page");
			clickPayOrderOnPayScreen();
			DesiredCapabilities caps1 = new DesiredCapabilities();
			caps1.setCapability("browserstack.idleTimeout", "30");
			Thread.sleep(35000);
			// util.assertContainText("Validated title",
			// DriverManager.getDriver().getTitle(), "GCash");
			GCash.isElementExist("GCash Logo", "HeaderText", 20);
			GCash.isElementExist("Globe Bills Pay Merchant", "Merchant", 20);
			if (GCash.isElementExist("Amount Due", "AmountDue", 10)) {
				System.out.println("GCash Amount Due: " + GCash.getText("AmountDue"));
			}
			String sufficientmobNum = "9271014269";
			String PinVal = "1111";
			Thread.sleep(5000L);
			GCash.get_GCashEnterNum().sendKeys(sufficientmobNum);
			System.out.println("GCash Mobile Number: " + sufficientmobNum);
			GCash.get_GCashNextBtn().click();
			//GCash.clickOnElement("Button", "GCashNextBtn", "GCashNextBtn");

			for (int i1 = 0; i1 < PinVal.length(); i1++) {
				int i2 = i1 + 1;
				// WebElement ele =
				// DriverManager.driver.findElement(By.xpath("//div[contains(text(),' We sent
				// the code to')]//following::form//input["+i2+"]"));
				Character otpEntered = PinVal.charAt(i1);
				GCash.get_GCashPIN().sendKeys(otpEntered.toString());
			}
			Thread.sleep(5000);
			GCash.clickOnElement("Gcash submit Button", "GCashSubmit", "GCashSubmit");
//			GCash.get_GCashSubmit().click();
			GCash.clickOnElement("Gcash Agree Button", "GCashAgreeBtn", "GCashAgreeBtn");
//			GCash.get_GCashAgreeBtn().click();
			GCash.clickOnElement("Pay Gcash PHP Button", "PayGCashPHPBtn", "PayGCashPHPBtn");
//			GCash.get_PayGCashPHPBtn().click();
			// GCash.isElementExist("Button: BACK TO MERCHANT", "BackToMerchant", 10);
			// GCash.clickOnElement("Button", "BACK TO MERCHANT", "BackToMerchant");
			// Thread.sleep(10000);
			DesiredCapabilities caps11 = new DesiredCapabilities();
			caps11.setCapability("browserstack.idleTimeout", "20");
			Thread.sleep(20000);
		}

		else if (payOption.equalsIgnoreCase("OTC")) {
			Pay.get_payOpt_overTheCounter().click();
			System.out.println("Selected Over The Counter (OTC) on Pay page");
			clickPayOrderOnPayScreen();
		}

		else if (payOption.equalsIgnoreCase("Card")) {
//			Pay.get_payOpt_VisaMasterCard().click();
			Pay.clickOnElement("Pay  VisaMasterCard  Button", "payOpt_VisaMasterCard", "payOpt_VisaMasterCard");
			System.out.println("Selected Visa/MasterCard on Pay page");
			clickPayOrderOnPayScreen();
		}

		else if (payOption.equalsIgnoreCase("InsufficientGCash")) {

			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browserstack.idleTimeout", "20");
			Thread.sleep(20000);
//			Pay.get_payOpt_Gcash().click();
			GCash.clickOnElement("Gcash Pay option Button", "payOpt_Gcash", "payOpt_Gcash");
			System.out.println("Selected Insufficient Gcash on Pay page");
			clickPayOrderOnPayScreen();
			DesiredCapabilities caps1 = new DesiredCapabilities();
			caps1.setCapability("browserstack.idleTimeout", "35");
			Thread.sleep(35000);
			GCash.isElementExist("GCash Logo", "HeaderText", 15);
			GCash.isElementExist("Globe Bills Pay Merchant", "Merchant", 15);
			if (GCash.isElementExist("Amount Due", "AmountDue", 10)) 
			{
				System.out.println("GCash Amount Due: " + GCash.getText("AmountDue"));
			}
			String InsufficientmobNum = "9456715330";
			String PinVal = "4958";
			Thread.sleep(5000);
			GCash.get_GCashEnterNum().sendKeys(InsufficientmobNum);
			System.out.println("GCash Mobile Number: " + InsufficientmobNum);
			// NOTE: !!!! WAIT 5mins in GCash page to see TRY ANOTHER PAGE
			System.out.println(
					".........WAIT FOR 1MIN IN GCASH PAGE TO SEE TRY ANOTHER PAYMENT PAGE AFTER CLICKING BACK........."
							+ "\n");

			for (int i = 0; i <= 7; i++) {
				if (Base.GCASHwaitForElementVisibility(By.xpath("//img[@src='img/gcash_logo.f988652']"), 3)) {
					System.out.println("Waiting failed!!");
				} else {
					System.out.println("Waiting for 60 Secs.............");
					// caps.setCapability("browserstack.idleTimeout", "60");
					Thread.sleep(60000);
				}

			}

			GCash.get_GCashNextBtn().click();

			for (int i1 = 0; i1 < PinVal.length(); i1++) {
				int i2 = i1 + 1;
				// WebElement ele =
				// DriverManager.driver.findElement(By.xpath("//div[contains(text(),' We sent
				// the code to')]//following::form//input["+i2+"]"));
				Character otpEntered = PinVal.charAt(i1);
				GCash.get_GCashPIN().sendKeys(otpEntered.toString());
			}
			Thread.sleep(5000);
			GCash.get_GCashSubmit().click();
			GCash.isElementExist("GCash Insufficient Icon", "GcashBalanceErrorIcon", 10);
			System.out.println("GCash Status: " + GCash.getText("NotEnoughGcashBalance_Label"));
			GCash.isElementExist("Not Enough Message", "GcashBalanceErrorMessage", 10);
			GCash.isElementExist("Button: BACK TO MERCHANT", "BackToMerchant", 10);
			caps.setCapability("browserstack.idleTimeout", "300");
			GCash.clickOnElement("Button", "BACK TO MERCHANT", "BackToMerchant");
			DesiredCapabilities caps3 = new DesiredCapabilities();
			caps3.setCapability("browserstack.idleTimeout", "30");
			Thread.sleep(30000);
		}

		Pay.scroll_vertical(2500);
		Thread.sleep(2000L);
		Control.takeScreenshot();
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void verify_handle_survey_popup_withInput(String Q1rate, String Q1Text, String Q2rate, String Q2Text)
			throws Exception {

		String expShopExperience = "How did you like your shopping experience?";
		String expRecommendGlobe = "Based on your online purchases, how likely are you to recommend Globe to others?";
		String expTxtTellUs = "Tell us how you feel";
		String expshareWithOther = "Don’t keep it to yourself. Share the love! Send the link to your friends and let them know.";
		String exptxtThatsNice = "Awww that's nice.";

		String logSuccess = "Validated survery text. ";
		String logFail = "Failed to validate survey text. ";

		if (Survey.isElementExist("Survery popup", "surveyForm", 15)) {

			// validate text messages for shopping experience

			String actShopExperience = Survey.get_txt_shoppingExperience().getText();
			if (actShopExperience.equals(expShopExperience)) {
				System.out.println(logSuccess + " : " + expShopExperience);
			} else {
				System.out.println(logFail + "Expected : " + expShopExperience + " - Actual : " + actShopExperience);
			}

			String act_ShopExp_TellUs = Survey.get_txt_shopExperience_feedback_().getText();
			if (act_ShopExp_TellUs.equals(expTxtTellUs)) {
				System.out.println(logSuccess + " : " + expTxtTellUs);
			} else {
				System.out.println(logFail + "Expected : " + expTxtTellUs + " - Actual : " + act_ShopExp_TellUs);
			}

			// validate text messages for recommend Globe

			String actRecommendGlobe = Survey.get_txt_recommendGlobe().getText();
			if (actRecommendGlobe.equals(expRecommendGlobe)) {
				System.out.println(logSuccess + ": " + expRecommendGlobe);
			} else {
				System.out.println(logFail + "Expected : " + expRecommendGlobe + " - Actual : " + actRecommendGlobe);
			}

			String act_Recommend_TellUs = Survey.get_txt_recommend_feedback().getText();
			if (act_Recommend_TellUs.equals(expTxtTellUs)) {
				System.out.println(logSuccess + ": " + expTxtTellUs);
			} else {
				System.out.println(logFail + ". Expected : " + expTxtTellUs + " - Actual : " + act_Recommend_TellUs);
			}

			// validate shopping experience emoji
			System.out.println("Printing Shopping Experience Emoji");
			for (int i = 0; i < Survey.get_shopExpEmoji().size(); i++) {
				System.out.println(Survey.get_shopExpEmoji().get(i).getAttribute("id"));
			}

			if (Q1rate.equalsIgnoreCase("VERY DISSATISFIED")) {
				// select VERY DISSATISFIED emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(4).click();
				Control.takeScreenshot();
				System.out.println("Select Shopping exp emoji : 5 - VERY DISSATISFIED");
				Survey.get_shopExpFeedbackTextArea().sendKeys(Q1Text);
				Thread.sleep(2500);
				System.out.println("Q1 Inserted feedback : " + Q1Text + "\n");
			}

			else if (Q1rate.equalsIgnoreCase("DISSATISFIED")) {
				// select DISSATISFIED emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(3).click();
				Control.takeScreenshot();
				System.out.println("Select Shopping exp emoji : 4 - DISSATISFIED");
				Survey.get_shopExpFeedbackTextArea().sendKeys(Q1Text);
				Thread.sleep(2500);
				System.out.println("Q1 Inserted feedback : " + Q1Text + "\n");
			}

			else if (Q1rate.equalsIgnoreCase("FAIR")) {
				// select FAIR emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(2).click();
				Control.takeScreenshot();
				Thread.sleep(2500);
				System.out.println("Select Shopping exp emoji : 3 - FAIR");
			}

			else if (Q1rate.equalsIgnoreCase("HAPPY")) {
				// select HAPPY emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(1).click();
				Control.takeScreenshot();
				Thread.sleep(2500);
				System.out.println("Select Shopping exp emoji : 2 - HAPPY");
			}

			else if (Q1rate.equalsIgnoreCase("VERY HAPPY")) {
				// select HAPPY emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(0).click();
				Control.takeScreenshot();
				Thread.sleep(5000);
				System.out.println("Select Shopping exp emoji : 1 - VERY HAPPY");
			}

			// validate recommend globe emoji
			System.out.println("Printing Recommend Globe Emoji");
			for (int i = 0; i < Survey.get_recomGlobeEmoji().size(); i++) {
				System.out.println(Survey.get_recomGlobeEmoji().get(i).getAttribute("id"));
			}

			if (Q2rate.equalsIgnoreCase("VERY DISSATISFIED")) {
				// select VERY DISSATISFIED emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(4).click();
				Control.takeScreenshot();
				System.out.println("Select Recommend Globe emoji : 5 - VERY DISSATISFIED");
				Survey.get_RecomGlobeTextArea().sendKeys(Q2Text);
				Control.takeScreenshot();
				Thread.sleep(5000);
				System.out.println("Inserted feedback : " + Q2Text + "\n");
			}

			else if (Q2rate.equalsIgnoreCase("DISSATISFIED")) {
				// select DISSATISFIED emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(3).click();
				Control.takeScreenshot();
				System.out.println("Select Recommend Globe emoji : 4 - DISSATISFIED");
				Survey.get_RecomGlobeTextArea().sendKeys(Q2Text);
				Thread.sleep(5000);
				System.out.println("Inserted feedback : " + Q2Text + "\n");
			}

			else if (Q2rate.equalsIgnoreCase("FAIR")) {
				// select FAIR emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(2).click();
				Thread.sleep(5000);
				Control.takeScreenshot();
				System.out.println("Select Recommend Globe emoji : 3 - FAIR");
			}

			else if (Q2rate.equalsIgnoreCase("HAPPY")) {
				// select FAIR emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(1).click();
				Thread.sleep(5000);
				System.out.println("Select Recommend Globe emoji : 2 - HAPPY");
			}

			else if (Q2rate.equalsIgnoreCase("VERY HAPPY")) {
				// select FAIR emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(0).click();
				Thread.sleep(5000);
				Control.takeScreenshot();
				System.out.println("Select Recommend Globe emoji : 1 - VERY HAPPY");
			}
			Control.takeScreenshot();
			// submit survey
			Survey.get_submitSurver().click();
			Thread.sleep(2000L);
			Control.takeScreenshot();

			// validate thumbs up image
			if (Survey.isElementExist("Image - Survey success", "imgSurveySuccess", 10)) {
				System.out.println("Thumbs up image displayed");

				String actThatsNice = Survey.get_txt_thatsNice().getText();
				if (actThatsNice.equals(exptxtThatsNice)) {
					System.out.println(logSuccess + " : " + exptxtThatsNice);
				} else {
					System.out.println(logFail + " Expected : " + exptxtThatsNice + " - Actual : " + actThatsNice);
				}

				String actShareOthers = Survey.get_txt_shareOthers().getText();
				if (actShareOthers.equals(expshareWithOther)) {
					System.out.println(logSuccess + " : " + expshareWithOther);
				} else {
					System.out.println(logFail + " Expected : " + expshareWithOther + " - Actual : " + actShareOthers);
				}

				if (Survey.isElementExist("Survey - Close button", "closeButton", 15)) {
					Survey.get_closeButton().click();
					Control.takeScreenshot();
				} else {
					System.out.println("Close icon not found on survey popup");
				}

			} else {
				System.out.println("Thumbs image not displayed");
			}

		} else {
			System.out.println("Feedback popup do not open");
			Assert.assertTrue(false);
		}

		Control.takeScreenshot();

	}

	/********************************************************************************************************************************/

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void verify_handle_survey_popup() throws Exception {

		Thread.sleep(15000L);
		String expShopExperience = "How did you like your shopping experience?";
		String expRecommendGlobe = "Based on your online purchases, how likely are you to recommend Globe to others?";
		String expTxtTellUs = "Tell us how you feel";
		String expshareWithOther = "Don’t keep it to yourself. Share the love! Send the link to your friends and let them know.";
		String exptxtThatsNice = "Awww that's nice.";

		String logSuccess = "Validated survery text. ";
		String logFail = "Failed to validate survey text. ";

		if (ThankYou.isElementExist("Survery popup", "surveyForm", 50)) {

			// validate text messages for shopping experience

			String actShopExperience = ThankYou.get_txt_shoppingExperience().getText();
			if (actShopExperience.equals(expShopExperience)) {
				System.out.println(logSuccess + " : " + expShopExperience);
			} else {
				System.out.println(logFail + "Expected : " + expShopExperience + " - Actual : " + actShopExperience);
			}

			String act_ShopExp_TellUs = ThankYou.get_txt_shopExperience_feedback_().getText();
			if (act_ShopExp_TellUs.equals(expTxtTellUs)) {
				System.out.println(logSuccess + " : " + expTxtTellUs);
			} else {
				System.out.println(logFail + "Expected : " + expTxtTellUs + " - Actual : " + act_ShopExp_TellUs);
			}

			// validate text messages for recommend Globe

			String actRecommendGlobe = ThankYou.get_txt_recommendGlobe().getText();
			if (actRecommendGlobe.equals(expRecommendGlobe)) {
				System.out.println(logSuccess + ": " + expRecommendGlobe);
			} else {
				System.out.println(logFail + "Expected : " + expRecommendGlobe + " - Actual : " + actRecommendGlobe);
			}

			String act_Recommend_TellUs = ThankYou.get_txt_recommend_feedback().getText();
			if (act_Recommend_TellUs.equals(expTxtTellUs)) {
				System.out.println(logSuccess + ": " + expTxtTellUs);
			} else {
				System.out.println(logFail + ". Expected : " + expTxtTellUs + " - Actual : " + act_Recommend_TellUs);
			}

			// validate shopping experience emoji
			System.out.println("Printing Shopping Experience Emoji");
			for (int i = 0; i < ThankYou.get_shopExpEmoji().size(); i++) {
				System.out.println(ThankYou.get_shopExpEmoji().get(i).getAttribute("id"));
			}

			// select DISSATISFIED emoji for shopping experience and give feedback
			ThankYou.get_shopExpEmoji().get(3).click();
			System.out.println("Select Shopping exp emoji : DISSATISFIED");
			ThankYou.get_shopExpFeedbackTextArea().sendKeys("Test1");
			System.out.println("Inserted feedback : Test1");

			// validate recommend globe emoji
			System.out.println("Printing Recommend Globe Emoji");
			for (int i = 0; i < ThankYou.get_recomGlobeEmoji().size(); i++) {
				System.out.println(ThankYou.get_recomGlobeEmoji().get(i).getAttribute("id"));
			}

			// select VERY DISSATISFIED emoji for recommend globe and give feedback
			ThankYou.get_recomGlobeEmoji().get(4).click();
			System.out.println("Select Recommend Globe emoji : VERY DISSATISFIED");
			ThankYou.get_RecomGlobeTextArea().sendKeys("Test2");
			System.out.println("Inserted feedback : Test2");

			// submit survey
			ThankYou.get_submitSurver().click();
			Thread.sleep(2000L);

			// validate thumbs up image
			if (ThankYou.isElementExist("Image - Survey success", "imgSurveySuccess", 10)) {
				System.out.println("Thumbs up image displayed");

				String actThatsNice = ThankYou.get_txt_thatsNice().getText();
				if (actThatsNice.equals(exptxtThatsNice)) {
					System.out.println(logSuccess + " : " + exptxtThatsNice);
				} else {
					System.out.println(logFail + " Expected : " + exptxtThatsNice + " - Actual : " + actThatsNice);
				}

				String actShareOthers = ThankYou.get_txt_shareOthers().getText();
				if (actShareOthers.equals(expshareWithOther)) {
					System.out.println(logSuccess + " : " + expshareWithOther);
				} else {
					System.out.println(logFail + " Expected : " + expshareWithOther + " - Actual : " + actShareOthers);
				}

				if (ThankYou.isElementExist("Survey - Close button", "closeButton", 15)) {
					ThankYou.get_closeButton().click();
				} else {
					System.out.println("Close icon not found on survey popup");
				}

			} else {
				System.out.println("Thumbs image not displayed");
			}

		} else {
			System.out.println("Feedback popup do not open");
			Assert.assertTrue(false);
		}

		// validate text

	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public String verifyUserGuideTitle() throws Exception {

		String downloadManualTitle = "";
		if (LP.isClickable("downloadManual", 10)) {
			LP.get_downloadManual().click();
			System.out.println("Clicked on Download Manual");
			Thread.sleep(3000L);
			downloadManualTitle = LP.getURLOfNewTab();
		} else {
			System.out.println("FAIL : Download Manual button not found");
		}

		return downloadManualTitle;
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void capture_orderID() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				LP.get_OrderID());
		String orderID = LP.get_OrderID().getText();
		Control.takeScreenshot();
		System.out.println("Order Completed successfully : " + orderID);
		// LP.write_OrderID_in_PropertiesFile(dateTimeStamp, orderID);
		Constant.dataMap.get().put("OrderID", orderID);

	}

	/**********************************************************
	 * Click on Track My order
	 * 
	 * @throws Exception
	 **************************************/
	public void Login_Trackymyorder() throws Exception {

		if (Constant.platformName.equalsIgnoreCase("android") || Constant.platformName.equalsIgnoreCase("iOS")) {
			if (LP.isElementExist("Menu Icon", "menuIconAndroid", 10)) {
				Control.takeScreenshot();
				Thread.sleep(3000L);
				if (LP.isClickable("menuIconAndroid", 5)) {
					((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
							LP.get_menuIconAndroid());
					LP.clickOnElement("Link", "menu Icon", "menuIconAndroid");
					Control.takeScreenshot();
				}
			}
		}
		ThankYou.get_linkTrackOrder().click();
		Control.takeScreenshot();
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void selectGiftOptionOnForm() throws Exception {
		if (Form.getAttributeValue("imgGiftOption", "src").contains("inactive")) {
			Thread.sleep(3000L);
			Control.takeScreenshot();
			if (Form.isClickable("toggleGiftOption", 10)) {
				Form.javascript_clickOnElement(Form.get_toggleGiftOption());
				System.out.println("Clicked on Gift option");
				Control.takeScreenshot();
			}
		} else {
			System.out.println("Gift option is already selected");
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void insert_and_validate_recipientMobile(String mobCategory, String mobNumber) throws Exception {

		String expErrMessage = "";
		String actErrMessage = "";

		Form.get_recipientMobile().clear();
		Form.enterText("recipientMobile", "recipientMobile", mobNumber);
		Form.get_recipientMobile().clear();
		// Form.enterText("recipientMobile","recipientMobile", mobNumber);
		Form.get_recipientMobile().sendKeys(mobNumber);
		Form.get_recipientMobile().sendKeys(Keys.TAB);

		System.out.println("Inserted value in recipient mobile : " + mobNumber);

		if (mobCategory.contains("specialChar") || mobCategory.contains("incompleteNumber")) {
			if (mobCategory.contains("specialChar")) {
				expErrMessage = "Mobile Number is mandatory.";
			} else if (mobCategory.contains("incompleteNumber")) {
				expErrMessage = "Please provide valid Mobile Number.";
			}

			if (Form.isElementExist("Recipient Error Message", "errRecipientMobile", 10)) {
				actErrMessage = Form.getText("errRecipientMobile");
				if (actErrMessage.equals(expErrMessage)) {
					System.out.println("Recipient Mobile : Error message displayed : " + expErrMessage);
				} else {
					System.out.println("Incorrect 'Recipient Mobile'err msg displayed. Expected-" + expErrMessage
							+ " Actual - " + actErrMessage);
				}
			} else {
				System.out.println("Recipient Mobile err message not displayed. Expected : " + expErrMessage);
			}
		}

		if (mobCategory.contains("validNumber")) {
			System.out.println("Valid Recipient Mobile successfully inserted: " + mobNumber);
			if (Base.GCASHwaitForElementVisibility(
					By.xpath("//input[@formcontrolname='recipientMobile'] /../following-sibling::div/span"), 5)) {
				actErrMessage = Form.getText("errRecipientMobile");
				System.out.println("FAIL - Recipient Mobile error displayed : " + actErrMessage);
			} else {
				System.out.println("No error message displayed for valid Recipient Mobile");
			}

		}
		Control.takeScreenshot();

	}

	/**
	 * @throws Exception
	 * @throws InterruptedException
	 ******************************************************************************************************************************/
	public void validate_order_details_on_checkout() throws Exception {
		 {
			for (int i = 0; i < checkout.get_productsName().size(); i++) {
				DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				if (checkout.get_productsName().get(i).getText().contains("Sanitizer")
						|| checkout.get_productsName().get(i).getText().contains("Water Bottle")) {
					System.out.println("Product Name : " + checkout.get_productsName().get(i).getText());
				}

				else {
					for (int a = 0; a < checkout.get_productsCategory().size(); a++) {
						System.out.println("Product Category : " + checkout.get_productsCategory().get(a).getText());
						System.out.println("Product Name : " + checkout.get_productsName().get(i).getText());
						System.out.println("Product overview : " + checkout.get_productsOverview().get(a).getText());
						Control.takeScreenshot();
					}
				}

//				System.out.println("Price : " + checkout.get_productsPrice().get(i).getText());
//				System.out.println("Quantity : " + checkout.get_quantities().get(i).getText());
				Control.takeScreenshot();

				if (checkout.get_productsName().get(i).getText().contains("LTE Advanced with TPLink Repeater")) {
					checkout.isElementExist("Image - Product - LTE", "imgLTE", 10);
					Control.takeScreenshot();
				} else if (checkout.get_productsName().get(i).getText().contains("Globe At Home Prepaid WiFi")) {
					checkout.isElementExist("Image - Product - GHPW", "imgGHPW", 10);
					Control.takeScreenshot();
				} else if (checkout.get_productsName().get(i).getText().contains("Xtreme Home Prepaid WiFi")) {
					checkout.isElementExist("Image - Product - XPW", "imgXPW", 10);
					Control.takeScreenshot();

				} else if (checkout.get_productsName().get(i).getText().contains("Blackpink Limited Edition")) {
					checkout.isElementExist("Image - Product - BlackPink", "imgBlackPink", 10);
					Control.takeScreenshot();
				} else if (checkout.get_productsName().get(i).getText().contains("Water Bottle")) {
					checkout.isElementExist("Image - Product - Water Bottle", "imgBottle", 10);
				} else if (checkout.get_productsName().get(i).getText().contains("Sanitizer")) {
					checkout.isElementExist("Image - Product - Sanitizer", "imgSanitizer", 10);
					Control.takeScreenshot();
				} else {
					System.out.println("Unable to get Product name - FAILED");
				}
			}
			System.out.println("Get Next Delivery : " + checkout.getText("txtNextDayDelivery"));
			System.out.println("Get Next Delivery : " + checkout.getText("txt_gCashChckout"));
			Control.takeScreenshot();

			// Applicable only in UAT
			System.out.println("Get Next Delivery : " + checkout.getText("txt_gCashChckout2"));
			Control.takeScreenshot();

		}

//		catch (IndexOutOfBoundsException e) {

//			System.out.println("FAILED - Order Details in Checkout Page : " + e);
		}
	

	/******************************************************************************************************************************/

	public void Producttab_validation(String product) throws Exception {
		// Validate All banner for XHPW
		// Click Highlight tab - Validation
		// Click Feature tab - validation
		// Click Specifications - validation
//		if (product.equalsIgnoreCase("Xtreme Home Prepaid WiFi")) {
//			PC.isElementExist("Image - XPW Specification", "img_XPW_Spec", 10);
//
//		} else if (product.equalsIgnoreCase("Home Prepaid Wifi")) {
//			PC.isElementExist("Image - GPHW Specification", "img_GPHW_specification", 10);
//
//		} else if (product.equalsIgnoreCase("BLACKPINK Prepaid WiFi")) {
//			PC.isElementExist("Image - BLACKPINK Specification", "img_BlackPink_specification", 10);
//		} else if (product.equalsIgnoreCase("Lifestyle Water Bottle")) {
//			PC.isElementExist("Image - Lifestyle Water Bottle", "img_DealsBottle_Spec", 10);
//		} else if (product.equalsIgnoreCase("Lifestyle Sanitizer")) {
//			PC.isElementExist("Image - Lifestyle Sanitizer", "img_DealsSanitizer_Spec", 10);
//		}
		LP.implicitWait();
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				LP.get_link_highlights());
		LP.implicitWait();
		if (LP.isElementExist("Header - Highlights", "link_highlights", 10)) {
			Thread.sleep(3000L);
			Control.takeScreenshot();
			if (LP.isClickable("link_highlights", 5)) {
				//LP.clickOnElement("Link", "Highlights", "link_highlights");
				JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
				jse.executeScript("arguments[0].click();", LP.get_link_highlights());		
				
				((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
						LP.get_link_highlights());
				System.out.println("Highlight Content : " + LP.getText("CommonHighlight"));
				System.out.println("Highlight Content : " + LP.getText("Highlightdescription"));
				Control.takeScreenshot();
			}
		}
		LP.implicitWait();
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				LP.get_link_features());
		LP.implicitWait();
		if (LP.isElementExist("Header - Features", "link_features", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_features", 5)) {
				//LP.clickOnElement("Link", "Features", "link_features");
				JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
				jse.executeScript("arguments[0].click();", LP.get_link_features());	
				System.out.println("Feature Content : " + LP.getText("featurecontentdescription"));
				System.out.println("Feature Content : " + LP.getText("FeatureStreamingmadefaster"));
				System.out.println("Feature Content : " + LP.getText("Homesurface"));
				System.out.println("Feature Content : " + LP.getText("Famsurface"));
				System.out.println("Feature Description : " + LP.getText("Bigthingstext"));
				System.out.println(" Internet Features  : " + LP.getText("FeatureInternetDescrption"));
				System.out.println("Clear Free Features : " + LP.getText("FeatureclearFreetextDescrption"));
				System.out.println("Fasthomeinternet Features : " + LP.getText("Featurefasthomeinternet"));
				Control.takeScreenshot();
			}
		}
		LP.implicitWait();
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				LP.get_link_compare());
		LP.implicitWait();
		if (LP.isElementExist("Header - link_compare", "link_compare", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_compare", 5)) {
				//LP.clickOnElement("Link", "link_compare", "link_compare");
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_link_compare());
	
			}
		}
	
	}

	/******************************************************************************************************************************/
	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validate_product_specification(String product) throws Exception {

		if (product.equalsIgnoreCase("Xtreme Home Prepaid WiFi")) {
			Control.takeScreenshot();
			PC.isElementExist("Image - XPW Specification", "img_XPW_Spec", 10);

		} else if (product.equalsIgnoreCase("Home Prepaid Wifi")) {
			Control.takeScreenshot();
			PC.isElementExist("Image - Home Prepaid Wifi", "img_GPHW_specification", 10);
		}

		else if (product.equalsIgnoreCase("BLACKPINK Prepaid WiFi")) {
			Control.takeScreenshot();
			PC.isElementExist("Image - BLACKPINK Specification", "img_BlackPink_specification", 10);
		} else if (product.equalsIgnoreCase("Lifestyle Water Bottle")) {
			Control.takeScreenshot();
			PC.isElementExist("Image - Lifestyle Water Bottle", "img_DealsBottle_Spec", 10);
		} else if (product.equalsIgnoreCase("Lifestyle Sanitizer")) {
			Control.takeScreenshot();
			PC.isElementExist("Image - Lifestyle Sanitizer", "img_DealsSanitizer_Spec", 10);
		} else if (product.equalsIgnoreCase("iPhone SE (3rd Gen) 64GB Midnight")) {
			Control.takeScreenshot();
			PC.isElementExist("Image - Lifestyle Sanitizer", "iPhone SE (3rd Gen) 64GB Midnight", 10);
		}
		System.out.println("LAN Support : " + PC.getText("LanSupport"));
		System.out.println("Suport Network : " + PC.getText("SuportNetwork"));
		System.out.println("WiFi Support : " + PC.getText("WiFiSupport"));
		System.out.println("Features : " + PC.getText("Features"));
		System.out.println("Freebies : " + PC.getText("Freebies"));
		System.out.println("Best With : " + PC.getText("BestWith"));
		Control.takeScreenshot();
		Thread.sleep(5000L);
		LP.scroll_vertical(300);
		Thread.sleep(1500L);
		System.out.println("Stock Avalability : " + PC.getText("stockAvalability"));
		System.out.println("Offered Price : " + PC.getText("offeredPrice"));
		System.out.println("Actual Price : " + PC.getText("actualPrice"));
		Control.takeScreenshot();

		if (PC.get_ActualPrice().getCssValue("text-decoration").contains("line-through")) {
			System.out.println("Actual Price on specification is 'Strikethrough'");
		} else {
			System.out.println("Actual Price on specification is not 'Strikethrough'");
		}

		PC.isElementExist("Button - BuyNow/Checkout", "btnBuyNow_Checkout", 10);

		if (product.equalsIgnoreCase("Lifestyle Water Bottle") || product.equalsIgnoreCase("Lifestyle Sanitizer")) {
			System.out.println(
					"No 'Pay via Cash on Delivery, Credit/Debit Card, GCash, or Over the Counter' spiel for LIFESTYLE - PASSED");
		} else {
			System.out.println("Payment Option : " + PC.getText("PaymentOption"));
		}

		if (product.equalsIgnoreCase("Xtreme Home Prepaid WiFi") || product.equalsIgnoreCase("Home Prepaid Wifi")
				|| product.equalsIgnoreCase("Lifestyle Water Bottle")
				|| product.equalsIgnoreCase("Lifestyle Sanitizer")) {
			validate_XtremeWifi_deliveryCaveat();
		}

	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validate_termsConditions_checkbox_toggle() throws Exception {

		int pauseTime = 0;
		if (getBrowserName().toUpperCase().contains("SAFARI")) {
			pauseTime = 4000;
		} else {
			pauseTime = 250;
		} // read all check boxes
		try {
			int countTerms = Form.get_chkbxTermsConditions().size();
			String labelTerms = "";
			for (int i = 0; i < countTerms - 1; i++) {
				labelTerms = Form.get_chkbxLabelTermsConditions().get(i).getText();
				Control.takeScreenshot();
				Thread.sleep(pauseTime);
				Form.get_chkbxTermsConditions().get(i + 1).click();
				System.out.println("Selected Terms/Conditions : " + labelTerms);
				Thread.sleep(pauseTime);
				Form.get_chkbxTermsConditions().get(i + 1).click();
				Control.takeScreenshot();
				System.out.println("Unselected Terms/Conditions : " + labelTerms);

			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error - IndexOutOfBound :" + e.getMessage());
		} catch (Exception e1) {
			System.out.println("Error :" + e1.getMessage());
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void clickPayOrderOnPayScreen() throws Exception {
		if (Pay.isClickable("payOrder", 100)) {
			Thread.sleep(5000);
			Control.takeScreenshot();
			Pay.get_payOrder().click();
			System.out.println("Clicked on pay on payment page");
		} else {
			System.out.println("Fail : to click on pay button on payment page");
		}
		Control.takeScreenshot();
	}

	/********************************************************************************************************************************/
	public String getBrowserName() {
		Capabilities cap = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
		return cap.getBrowserName();
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void acceptCookies() throws Exception {

		if (LP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			Control.takeScreenshot();
			LP.get_privacyAccept().click();
			System.out.println("Clicked on 'Privacy - I accept' button");
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void clickBuyLinkOnHeader() throws Exception {
		if (LP.isClickable("menuBuy", 5)) {
			LP.clickOnElement("Link", "Menu Buy", "menuBuy");
			Thread.sleep(2000L);
		}
	}
	
	public void Token(String token) throws Exception {	
		LP.isElementExist("TokenInput", "TokenInput", 20);
		LP.get_TokenInput().sendKeys(token);
		LP.jsClick("TokenSubmit", "TokenSubmit");
	
}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void clickDealsLinkOnHeader() throws Exception {
		if (LP.isClickable("link_Deals", 5)) {
			LP.get_Deals().click();
			Thread.sleep(2000L);
		}
	}

	/********************************************************************************************************************************/
	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void select_LTE_Advanced_on_home_page() throws Exception {

		if (LP.isElementExist("Menu - Buy link", "link_MenuBuy", 10)) {
			LP.moveToElement("menuBuy");
			Control.takeScreenshot();
			System.out.println("Moved to Buy icon on menu bar");
		}
		if (LP.isClickable("link_LTE_Advanced", 10)) {
			Control.takeScreenshot();
			LP.get_LTE_Advanced().click();
			System.out.println("Clicked on LTE Advanced");
		}

		if (LP.isElementExist("Floating button - Buy now", "floatingBuyNow", 10)) {
			LP.moveToElement("floatingBuyNow");
			Control.takeScreenshot();
			System.out.println("Moved to floating Buy now icon");
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void select_BPHWhome_page(String env) throws Exception {

		if (env.equalsIgnoreCase("UAT")) {
			if (Constant.platformName.equalsIgnoreCase("iOS") || Constant.platformName.equalsIgnoreCase("android")) {
				if (LP.isElementExist("Menu Icon", "menuIconAndroid", 10)) {
					Thread.sleep(1000L);
					if (LP.isClickable("menuIconAndroid", 5)) {
						LP.clickOnElement("Link", "menu Icon", "menuIconAndroid");	
						if (LP.isElementExist("Menu Icon", "link_MenuBuyAndroid", 10)) {
							Thread.sleep(1000L);
							if (LP.isClickable("link_MenuBuyAndroid", 5)) {
								LP.clickOnElement("Link", "Buy", "link_MenuBuyAndroid");
								Control.takeScreenshot();
							}
						}
						
					}
				}
				
			}	
			if (LP.isElementExist("Menu bar link - Buy", "menuBuy", 10)) {
				LP.moveToElement("menuBuy");
				System.out.println("Moved to Buy icon on menu bar");
			}
			if (LP.isClickable("link_BLACKPINKLimitedEdition", 5)) {
				LP.clickOnElement("Link", "BLACKPINK Limited Edition", "link_BLACKPINKLimitedEdition");
				LP.moveToElement("floatingBuyNow");
				Thread.sleep(1000L);
				LP.isElementExist("Button - Download Manual", "downloadManual", 10);
			}

		} else {

			if (Constant.platformName.equalsIgnoreCase("iOS") || Constant.platformName.equalsIgnoreCase("android")) {
				if (LP.isElementExist("Menu Icon", "menuIconAndroid", 10)) {
					Thread.sleep(1000L);
					if (LP.isClickable("menuIconAndroid", 5)) {
						LP.clickOnElement("Link", "menu Icon", "menuIconAndroid");
					}
				}
				if (LP.isElementExist("Menu bar link - Prepaid WIFI", "Link_Prepaidwifi", 10)) {
					Thread.sleep(3000L);
					LP.moveToElement("Link_Prepaidwifi");
						if (LP.isClickable("link_BLACKPINKLimitedEdition", 5)) {
							LP.clickOnElement("Link", "BLACKPINK Limited Edition", "link_BLACKPINKLimitedEdition");
							LP.moveToElement("floatingBuyNow");
							Thread.sleep(1000L);
							LP.isElementExist("Button - Download Manual", "downloadManual", 10);
						}
					}
				}
			}

		}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void Validate_Deals_MainLandingPage() throws Exception {
		LP.get_Deals().click();
		Thread.sleep(3000L);
		LP.isElementExist("0917 Lifesyle - New Normal Essentials", "MainLP_NewNormalEssential", 10);
		LP.scroll_vertical(500);
		LP.isElementExist("0917 Lifesyle - 0917 UV Sanitizer", "MainLP_0917UVSanitizer", 10);
		if (LP.isClickable("MainLP_0917UVSanitizer_ShopNow", 10)) {
			System.out.println("0917 UV Sanitizer ShopNow button is clickable - PASS");
		} else {
			System.out.println("0917 UV Sanitizer ShopNow button is clickable - FAILED");
		}

		LP.scroll_vertical(800);
		LP.isElementExist("0917 Lifesyle - 0917 UVC Insulated Water Bottle", "MainLP_0917UVBottle", 10);
		if (LP.isClickable("MainLP_0917UVBottle_ShopNow", 10)) {
			System.out.println("0917 UV Bottle ShopNow button is clickable - PASS");
		} else {
			System.out.println("0917 UV Bottle ShopNow button is clickable - FAILED");
		}

	}

	public void select_Deals_Iphone_home_page() throws Exception {
		if (LP.isElementExist("Menu - Deals", "link_Deals", 10)) {
			LP.moveToElement("link_Deals");
			System.out.println("Moved to DEALS on menu bar");
			LP.isElementExist("Deals- Iphone IES", "Iphone", 10);
			LP.isElementExist("Deals- Samsung Devices", "Samsung", 10);
			LP.moveToElement("Iphone");
			JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
			jse.executeScript("arguments[0].click();", LP.get_Iphone());

			if (LP.isElementExist("Deals- Iphone IES", "Iphone", 10)) {
				System.out.println("iPhone SE Midnight 3rd Generation - with P500 load Buy 64GB");
				LP.scroll_vertical(800);

				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_Iphone64GB());
				System.out.println("IPHONE 64 GB");
			} else {
				System.out.println(
						"iPhone SE Midnight 3rd Generation - with P500 load Buy 64GB button is clickable - FAILED");
			}
		}

		if (LP.isElementExist("Floating button - Buy now", "floatingBuyNow", 10)) {
			LP.moveToElement("floatingBuyNow");
			System.out.println("Moved to floating Buy now icon");
		}
	}

	/**
	 * @throws Exception
	 ***********************************************************************************/
	public void Validate_Deals_Water_Bottle_Page() throws Exception {
		LP.isElementExist("Button - Buy now", "buyNow", 10);
		LP.isElementExist("Button - Floating Buy now", "floatingBuyNow", 10);

		if (LP.get_floatActualPrice().getCssValue("text-decoration").contains("line-through")) {
			System.out.println("Float Actual Price is 'Strikethrough'");
		} else {
			System.out.println("Float Actual Price is not 'Strikethrough'");
		}

		validateFooter();

		LP.scroll_vertical(600);
		if (LP.isElementExist("Header - Highlights", "link_highlights", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_highlights", 5)) {
				LP.clickOnElement("Link", "Highlights", "link_highlights");
			}
		}
		if (LP.isElementExist("Header - Specifications", "link_specifications", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_specifications", 5)) {
				LP.clickOnElement("Link", "Specifications", "link_specifications");
			}
		}
		validate_product_specification("Lifestyle Water Bottle");
	}

	/**
	 * @throws Exception
	 ***********************************************************************************/
	public void Validate_Deals_Sanitizer_Page() throws Exception {
		LP.isElementExist("Button - Buy now", "buyNow", 10);
		LP.isElementExist("Button - Floating Buy now", "floatingBuyNow", 10);

		if (LP.get_floatActualPrice().getCssValue("text-decoration").contains("line-through")) {
			System.out.println("Float Actual Price is 'Strikethrough'");
		} else {
			System.out.println("Float Actual Price is not 'Strikethrough'");
		}

		validateFooter();

		LP.scroll_vertical(600);
		if (LP.isElementExist("Header - Highlights", "link_highlights", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_highlights", 5)) {
				LP.clickOnElement("Link", "Highlights", "link_highlights");
			}
		}

		if (LP.isElementExist("Header - Features", "link_features", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_features", 5)) {
				LP.clickOnElement("Link", "Features", "link_features");
			}
		}

		if (LP.isElementExist("Header - Specifications", "link_specifications", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_specifications", 5)) {
				LP.clickOnElement("Link", "Specifications", "link_specifications");
			}
		}
		validate_product_specification("Lifestyle Sanitizer");
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void select_UVBottledWater_on_home_page() throws Exception {
		if (LP.isElementExist("Menu - Deals", "link_Deals", 10)) {
			LP.moveToElement("link_Deals");
			System.out.println("Moved to DEALS on menu bar");

			if (LP.isClickable("link_UVWaterBottle", 10)) {
				LP.get_WatterBottle().click();
				System.out.println("Clicked on 09 Watter Bottle");
			}
		}

		if (LP.isElementExist("Floating button - Buy now", "floatingBuyNow", 10)) {
			LP.moveToElement("floatingBuyNow");
			System.out.println("Moved to floating Buy now icon");
		}
	}

	/********************************************************************************************************************************/
	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void select_UVSanitizer_on_home_page() throws Exception {
		if (LP.isElementExist("Menu - Deals", "link_Deals", 10)) {
			LP.moveToElement("link_Deals");
			System.out.println("Moved to DEALS on menu bar");

			if (LP.isClickable("link_UVSanitizer", 10)) {
				LP.get_Sanitizer().click();
				System.out.println("Clicked on 09 Sanitizer");
			}
		}

		if (LP.isElementExist("Floating button - Buy now", "floatingBuyNow", 10)) {
			LP.moveToElement("floatingBuyNow");
			System.out.println("Moved to floating Buy now icon");
		}
	}

	/**
	 * @throws InterruptedException 
	 * @throws Exception
	 ******************************************************************************************************************************/
public void invalidedeatils_Withtryanotherpayment() throws InterruptedException, Exception
{
	if(ThankYou.isElementExist("Sorry, your purchase was declined.", "msgPurchaseDeclined", 30)) {
	if(ThankYou.isClickable("tryDifferentPayment", 15)) {
		ThankYou.get_tryDifferentPayment().click();	
		//ThankYou.clickOnElement("Button", "tryDifferentPayment", "tryDifferentPayment");
		
		System.out.println("Clicked on Try different payment option");
		
		DesiredCapabilities caps3 = new DesiredCapabilities();
	caps3.setCapability("browserstack.idleTimeout", "20");
		Thread.sleep(20000L);
	//	util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "Pay");
	}else {
		System.out.println("FAIL: Try different payment button is not clickable");
	}
}else {
	System.out.println("Purchase declined messagge do not appear.");
	
	
}

}
	public void validateFooter() throws Exception {

		int iFooter = 0;

		boolean blnFooter = false;
		boolean blnFooterPrivacy = false;
		boolean blnFooterTerms = false;
		boolean blnFooterSiteMap = false;

		DriverManager.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		for (iFooter = 0; iFooter < 10; iFooter++) {
			if (LP.isElementExist("Landing Page - Footer", "footer", 0)) {
				blnFooter = true;

				if (LP.isElementExist("Landing Page - Footer Privacy Policy", "footerPrivacyPolicy", 0)) {
					blnFooterPrivacy = true;
				}
				if (LP.isElementExist("Landing Page - Footer Terms of use", "footerTermsOfUse", 0)) {
					blnFooterTerms = true;
				}
				if (LP.isElementExist("Landing Page - Footer Site Map", "footerSiteMap", 0)) {
					blnFooterSiteMap = true;
				}

				break;
			} else {
				LP.scroll_vertical(5000);
			}
		}

		// scroll back on top
		for (int i = 0; i <= iFooter; i++) {
			LP.scroll_vertical(-5000);
		}

		if (blnFooter) {
			System.out.println("Validated footer - © 2024 Globe Telecom, Inc.");
		} else {
			System.out.println("Failed to validate footer - © 2024 Globe Telecom, Inc.");
		}

		if (blnFooterPrivacy) {
			System.out.println("Validated footer - Privacy Policy link");
		} else {
			System.out.println("Failed to validate footer - Privacy Policy link");
		}

		if (blnFooterTerms) {
			System.out.println("Validated footer - Terms Of Use link");
		} else {
			System.out.println("Failed to validate footer - Terms Of Use link");
		}

		if (blnFooterSiteMap) {
			System.out.println("Validated footer - Site Map link");
		} else {
			System.out.println("Failed to validate footer - Site Map link");
		}

		DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Control.takeScreenshot();

	}

	public void TabsValidation() throws Exception {
		// ****************************************************
		// Validate Highlight Tab
		// ****************************************************
		LP.scroll_vertical(600);
		if (LP.isElementExist("Header - Highlights", "link_highlights", 10)) {
			Control.takeScreenshot();
			Thread.sleep(1000L);
			if (LP.isClickable("link_highlights", 5)) {
				LP.clickOnElement("Link", "Highlights", "link_highlights");
				Control.takeScreenshot();
			}
		}
		// ****************************************************
		// Validate Feature Tab
		// ****************************************************
		if (LP.isElementExist("Header - Features", "link_features", 10)) {
			Control.takeScreenshot();
			Thread.sleep(4000L);
			if (LP.isClickable("link_features", 5)) {
				LP.clickOnElement("Link", "Features", "link_features");
				Control.takeScreenshot();
				// System.out.println("Feature Content : " + LP.get_FeatureContent().getText());
				// System.out.println("Feature Content Info: " +
				// LP.get_FeatureContent_Text().getText());
				// System.out.println("Surf Text: " + LP.get_Surf_Content().getText());
				// System.out.println("Download Text : " + LP.get_Download_Content().getText());
				Control.takeScreenshot();
			}
		}
		// ****************************************************
		// Validate Compare Tab
		// ****************************************************

		if (LP.isElementExist("Header - Compare", "link_compare", 10)) {
			Control.takeScreenshot();
			Thread.sleep(1000L);
			if (LP.isClickable("link_Compare", 5)) {
				LP.clickOnElement("Link", "Compare", "link_compare");
				Control.takeScreenshot();
			}
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void compareProducts() throws Exception {

		String parentID = "";

		for (int i = 0; i < PC.get_Products().size(); i++) {
			System.out.println("Specification for Product : " + (i + 1));
			parentID = String.valueOf((i + 1));

			String commercialName = PC.reportProductCommercialName(parentID);
			PC.reportProductImage(parentID, commercialName);
			PC.reportProductFeatures(parentID);
			PC.reportProductFreebies(parentID);
			PC.reportProductBestWith(parentID);
			PC.reportProductLanSupport(parentID);
			PC.reportProductSupportedNetwork(parentID);
			PC.reportProductWiFiSupport(parentID);

			// LP.scroll_vertical(400);

			PC.reportStockAvalability(parentID);

			PC.reportProductOfferedPrice(parentID);
			PC.reportProductActualPrice(parentID);
			PC.reportProductPaymentOption(parentID);

			PC.reportProductBtnExpressCheckout(parentID);

			// LP.scroll_vertical(-400);
			Control.takeScreenshot();
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void verifyWhatIsGCash() throws Exception {

		if (checkout.isClickable("gCashDefinitionLink", 5)) {
			Control.takeScreenshot();
			checkout.get_linkGCashDefinition().click();
			System.out.println("Clicked on link - What is GCash");
			System.out.println("Text : What is GCash : " + checkout.getText("gCashDefinition"));

		} else {
			System.out.println("link - What is GCash -  is not clickable");
		}
	}

	/********************************************************************************************************************************/
	public void addQuantityOnCheckout() throws InterruptedException {
		Thread.sleep(5000L);
		int qty = Integer.parseInt(checkout.get_quantities().get(0).getText());
		System.out.println("Current Quantity : " + qty);

		if (checkout.isClickable("addQuantity", 10)) {
			checkout.get_btnAddQuantity().click();
			Thread.sleep(5000L);
			int newQty = Integer.parseInt(checkout.get_quantities().get(0).getText());

			if (newQty == (qty + 1)) {
				System.out.println("Quantity is successfully incremented by '1'. New quantity : " + newQty);
			} else {
				System.out.println("Quantity is not incremented by '1'. New quantity : " + newQty);
			}

		} else {
			System.out.println("Button to 'Add Quantity' is not available");
		}
	}

	/********************************************************************************************************************************/
	public void removeQuantityOnCheckout() throws InterruptedException {
		Thread.sleep(5000L);
		int qty = Integer.parseInt(checkout.get_quantities().get(0).getText());
		System.out.println("Current Quantity : " + qty);

		if (checkout.isClickable("removeQuantity", 5)) {
			checkout.get_btnRemoveQuantity().click();
			Thread.sleep(5000L);
			int newQty = Integer.parseInt(checkout.get_quantities().get(0).getText());

			if (newQty == (qty - 1)) {
				System.out.println("Quantity is successfully decremented by '1'. New quantity : " + newQty);
			} else {
				System.out.println("Quantity is not decremented by '1'. New quantity : " + newQty);
			}

		} else {
			System.out.println("Button to 'Remove Quantity' is not available");
		}
	}

	/********************************************************************************************************************************/
	public void btnCloseToRemoveProductFromCheckout() throws InterruptedException {

		if (checkout.isClickable("closeButton", 5)) {
			checkout.get_btnClose().click();
			System.out.println("Clicked on 'close' icon to remove added product from checkout screen");

			if (checkout.isClickable("confirm_removeProduct", 5)) {
				checkout.get_btnConfirmRemoveProduct().click();
				System.out.println("Clicked on 'Yes' button to remove product");
			}

		} else {
			System.out.println("Button 'Close' is not available to remove added product on checkout");
		}
	}

	/********************************************************************************************************************************/
	public boolean isAttribtuePresent(WebElement element, String attribute) {

		boolean result = false;
		try {
			String value = element.getAttribute(attribute);
			if (value != null) {
				result = true;
			}
		} catch (Exception e) {
		}

		return result;
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validate_order_shipAdddress_Details_screenPay_afterTryanotherPage() throws Exception {
		System.out.println("Validating Order details on Pay screen");

		for (int i = 0; i < Pay.get_productName().size(); i++) {
			System.out.println("Product Name : " + Pay.get_productName().get(i).getText());
			System.out.println("Quantity : " + Pay.get_quantity().get(i).getText());
			System.out.println("Price : " + Pay.get_price().get(i).getText());
		}
		if (Pay.isElementExist("PROMOCODE", "PromoCode", 10)) {
			System.out.println("PROMO CODE: " + Pay.getText("PromoCode"));
			System.out.println("PROMO CODE DISCOUNT: " + Pay.getText("PromoCodeDiscountAmt"));

		} else {
			System.out.println("NO PROMO CODE");
		}

		System.out.println("Shipping : " + Pay.get_shipping().getText());

		Pay.isElementExist("Address Image", "AddImg", 10);
		Pay.isElementExist("Ship to this address", "AddShiptoAddLbl", 10);
		System.out.println("Shipping Address : " + Pay.get_shipAddress().getText());
		/*
		 * Pay.isElementExist("Change Address link", "changeAdd", 10);
		 * 
		 * 
		 * if(Pay.isElementExist("PROMOCODE", "PromoCode", 10)) {
		 * Pay.isElementExist("Applied Promo Image", "PromoImgApplied", 10);
		 * Pay.isElementExist("Applied Promo Code", "PromoCodeApplied", 10);
		 * System.out.println("Shipping Address : " +
		 * Pay.get_PromoCodeApplied().getText());
		 * Pay.isElementExist("Applied Promo Image", "EditPromoCodeApplied", 10);
		 * 
		 * }
		 * 
		 * else { Pay.isElementExist("Got Promo Icon", "PromoIcon", 10);
		 * Pay.isElementExist("Got Promo code?", "PromoGotPromoLbl", 10);
		 * Pay.isElementExist("Click Here", "PromoClickHere", 10);
		 * Pay.isElementExist("Total Label", "TotalLbl", 10);
		 * System.out.println("Total Price: " + Pay.getText("TotalVal"));
		 * Pay.isElementExist("Pay button", "payOrder", 10); }
		 */

		System.out.println("Total Amount : " + Pay.get_totalAmount().getText());
	}

	/**
	 * /
	 * 
	 * @throws Exception
	 ********************************************************************************************************************************/
	public void validate_order_shipAdddress_Details_screenPay() throws Exception {
		System.out.println("Validating Order details on Pay screen");

		for (int i = 0; i < Pay.get_productName().size(); i++) {
			System.out.println("Product Name : " + Pay.get_productName().get(i).getText());
			System.out.println("Quantity : " + Pay.get_quantity().get(i).getText());
			System.out.println("Price : " + Pay.get_price().get(i).getText());
			Control.takeScreenshot();
		}
		if (Pay.isElementExist("PROMOCODE", "PromoCode", 10)) {
			System.out.println("PROMO CODE: " + Pay.getText("PromoCode"));
			System.out.println("PROMO CODE DISCOUNT: " + Pay.getText("PromoCodeDiscountAmt"));
			Control.takeScreenshot();

		} else {
			System.out.println("NO PROMO CODE");
			Control.takeScreenshot();
		}

		System.out.println("Shipping : " + Pay.get_shipping().getText());

		Pay.isElementExist("Address Image", "AddImg", 10);
		Pay.isElementExist("Ship to this address", "AddShiptoAddLbl", 10);
		System.out.println("Shipping Address : " + Pay.get_shipAddress().getText());
		Pay.isElementExist("Change Address link", "changeAdd", 10);

		if (Pay.isElementExist("PROMOCODE", "PromoCode", 10)) {
			Pay.isElementExist("Applied Promo Image", "PromoImgApplied", 10);
			Pay.isElementExist("Applied Promo Code", "PromoCodeApplied", 10);
			System.out.println("Shipping Address : " + Pay.get_PromoCodeApplied().getText());
			Pay.isElementExist("Applied Promo Image", "EditPromoCodeApplied", 10);
			Control.takeScreenshot();
		}

		else {
			Pay.isElementExist("Got Promo Icon", "PromoIcon", 10);
			Pay.isElementExist("Got Promo code?", "PromoGotPromoLbl", 10);
			Pay.isElementExist("Click Here", "PromoClickHere", 10);
			Pay.isElementExist("Total Label", "TotalLbl", 10);
			System.out.println("Total Price: " + Pay.getText("TotalVal"));
			Pay.isElementExist("Pay button", "payOrder", 10);
			Control.takeScreenshot();
		}

		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				OrderDetails.get_totalAmount());
		System.out.println("Total Amount : " + Pay.get_totalAmount().getText());
		Control.takeScreenshot();
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validate_PaymentPage() throws Exception {
		// Validate Payment Page
//		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "Pay");
		System.out.println("\n" + "*********  PAYMENT Page ************");
		Pay.isElementExist("Image: Xendit", "ImgXendit", 10);
		Pay.isElementExist("Button: Xendit", "Xendit", 10);
		Pay.isElementExist("Image: Visa /MasterCard", "ImgVisaCC", 10);
		Pay.isElementExist("Button: Visa /MasterCard", "BtnVisaCC", 10);
		Pay.isElementExist("Image: GCash", "ImgGCash", 10);
		Pay.isElementExist("Button: GCash", "BtnGCash", 10);
		Pay.isElementExist("Image: OTC", "ImgOTC", 10);
		Pay.isElementExist("Button: OTC", "BtnOTC", 10);
		Pay.isElementExist("Image: COD", "ImgCOD", 10);
		Pay.isElementExist("Button: COD", "BtnCOD", 10);		
		System.out.print("\n");
		Pay.isElementExist("Order Details Header", "OrderDetailsHeader", 10);
		Pay.isElementExist("Shipping", "ShippingLbl", 10);
		Pay.isElementExist("Shipping: Free", "ShippingVal", 10);
		
		Pay.isElementExist("Address Image", "AddImg", 10);
		Pay.isElementExist("Ship to this address", "AddShiptoAddLbl", 10);
		Pay.isElementExist("Shipping Address Val", "AddVal", 10);
		System.out.println("Shipping Address: " + Pay.getText("AddVal"));
		Pay.isElementExist("Change Address link", "changeAdd", 10);

		Pay.isElementExist("Got Promo Icon", "PromoIcon", 10);
		Pay.isElementExist("Got Promo code?", "PromoGotPromoLbl", 10);
		Pay.isElementExist("Click Here", "PromoClickHere", 10);
		Pay.isElementExist("Total Label", "TotalLbl", 10);
		System.out.println("Total Price: " + Pay.getText("TotalVal"));
		Pay.isElementExist("Pay button", "payOrder", 10);
		Control.takeScreenshot();

	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void resendOTP() throws Exception {

		for (int i = 1; i <= 15; i++) {
			checkout.scroll_vertical(300);
			if (!isAttribtuePresent(checkout.get_btnResendOTP(), "disabled")) {
				System.out.println("Resend OTP button gets enabled");

				Thread.sleep(2000L);
				checkout.get_btnResendOTP().click();
				Thread.sleep(2000L);
				System.out.println("Clicked on Resend OTP button");

				if (checkout.isElementExist("Resend OTP - Confirmation", "confirmationResendOTP", 20)) {
					System.out.println("Got the confirmation for Resend OTP");
				} else {
					System.out.println("Did not got the confirmation for Resend OTP in given time");
				}

				break;
			} else {
				Thread.sleep(5000L);
				System.out.println("Waiting for Resend OTP button to get enabled. Seconds Elapsed : " + (i * 3));
			}
		}
		Control.takeScreenshot();
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void insertDetailsOnTrackYourOrder() throws Exception {

		String orderID = Constant.dataMap.get().get("OrderID");
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				TrackOrder.get_referenceNumber());
		Control.takeScreenshot();
		TrackOrder.get_referenceNumber().sendKeys(orderID);
		Control.takeScreenshot();
		System.out.println("Inserted Reference Number on Track your order screen : " + orderID);
		TrackOrder.get_email().sendKeys("zsshettappa@globe.com.ph");
		Control.takeScreenshot();
		System.out.println("Inserted email on Track your order screen : zsshettappa@globe.com.ph");
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				TrackOrder.get_btn_trackOrder());
		Thread.sleep(1500L);
		Control.takeScreenshot();
		TrackOrder.get_btn_trackOrder().click();
		Control.takeScreenshot();
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validateOrderDetails() throws Exception {

		System.out.println("Reference Number : " + OrderDetails.get_referenceNumber().getText());
		System.out.println("Order Active Status : " + OrderDetails.get_orderActiveStatus().getText());
		// ((JavascriptExecutor)
		// DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
		// OrderDetails.get_productName().getText());
		// System.out.println("Product Name : " +
		// OrderDetails.get_productName().getText());
		System.out.println("Quantity : " + OrderDetails.get_quantity().getText());
		System.out.println("Product Image : " + OrderDetails.getAttributeValue("productImage", "alt"));
		System.out.println("Update Date : " + OrderDetails.get_updateDate().getText());
		System.out.println("Date Ordered : " + OrderDetails.get_dateOrdered().getText());
		System.out.println("Payment Method : " + OrderDetails.get_paymentMethod().getText());
		System.out.println("Amount Paid : " + OrderDetails.get_amountPaid().getText());
		System.out.println("Shipping Address : " + OrderDetails.get_shippingAddress().getText());

		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				OrderDetails.get_estDayOfDelivery());
		System.out.println("Estimated Day of Delivery : " + OrderDetails.get_estDayOfDelivery().getText());
		Control.takeScreenshot();
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validate_XtremeWifi_deliveryCaveat() throws Exception {
		LP.implicitWait();
		// ((JavascriptExecutor)
		// DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
		// PC.getText("XtremeWifiDeliveryCaveat_1"));
		System.out.println("Delivery Caveat : " + PC.getText("XtremeWifiDeliveryCaveat_1"));
		System.out.println("Delivery Caveat : " + PC.getText("XtremeWifiDeliveryCaveat_2"));
		Control.takeScreenshot();
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validate_paymentOptionsOnPayScreen() throws Exception {
		Pay.isElementExist("Payment Option - Visa/MasterCard", "payOpt_VisaMaster", 10);
		Pay.isElementExist("Payment Option - GCash", "payOpt_GCash", 10);
		Pay.isElementExist("Payment Option - Over The Counter", "payOpt_overTheCounter", 10);
		Pay.isElementExist("Payment Option - Cash On Delivery", "payOpt_COD", 10);
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validate_overTheCounter_payment_notification() throws Exception {

		if (Pay.isElementExist("Over The Counter - Notification", "notification_OTC", 10)) {
			Pay.get_notification_OTC().click();
			System.out.println("Clicked on 'Over The Counter - Notification'");
			System.out.println("Over The Counter - Notification Text : " + Pay.get_notification_OTC_text().getText());
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public String verifyAccreditedECPayMerchants() throws Exception {

		String url = "";
		if (Pay.isClickable("nearestECPay", 10)) {
			Pay.get_nearestECPay().click();
			System.out.println("Clicked on 'Find the nearest ECPay near me' link");
			Thread.sleep(10000L);
			url = LP.getURLOfNewTab();
		} else {
			System.out.println("FAIL : Download Manual button not found");
		}

		return url;
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validate_purchaseSummaryDetails() throws Exception {

		// Validate purchase summary
		ThankYou.scroll_vertical(700);
		System.out.println("Purchase Summary - Shipping Address : " + ThankYou.get_summaryShippingAddress().getText());
		System.out.println("Purchase Summary - Amount To Pay : " + ThankYou.get_summaryAmtToPay().getText());

		// Validate item ordered
		ThankYou.scroll_vertical(300);
		int productCount = ThankYou.get_summaryProductCount().size();

		for (int i = 0; i < productCount; i++) {
			System.out.println("Purchase Summary - Product Image :"
					+ ThankYou.get_summaryProductImage().get(i).getAttribute("src"));
			System.out
					.println("Purchase Summary - Product Name :" + ThankYou.get_summaryProductName().get(i).getText());
			ThankYou.scroll_vertical(500);
			// System.out.println(
			// "Purchase Summary - Product Description :" +
			// ThankYou.get_summaryDescription().get(i).getText());
			System.out
					.println("Purchase Summary - Product Quantity :" + ThankYou.get_summaryQuantity().get(i).getText());

		}

		// validate reminder
		if (ThankYou.isElementExist("Reminder - Thank you page", "summaryReminder1", 10)) {
			ThankYou.scroll_vertical(700);
			System.out.println("Purchase Summary - Reminder - Text : " + ThankYou.get_summaryReminder1().getText());
			System.out.println("Purchase Summary - Reminder - Text : " + ThankYou.get_summaryReminder2().getText());
		}

		else {
			System.out.println("Thank you page - Over the Counter payment Reminder : FAILED!!!");
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void applyPromoCodeOnCheckout(String promo) throws Exception {
		if (checkout.isClickable("btnPromoCode", 10)) {
			checkout.get_btnPromoCode().click();
			System.out.println("Clicked on 'Click Here' button to insert promo code");

			checkout.get_txtbx_promoCode().sendKeys(promo);
			System.out.println("Inserted promo code : " + promo);

			Thread.sleep(1500L);
			checkout.get_btn_applyPromo().click();
			System.out.println("Clicked on apply button to apply promo code");

			checkout.isElementExist("Promo code applied successfully - Success Message", "promoSuccessMsg", 5);

		} else {
			System.out.println("FAIL : Could not insert promo code on checkout screen");
		}
	}

	/********************************************************************************************************************************/
	public void verifyAddQuantityDisbaledOnCheckout(int totalQty) throws InterruptedException {

		// System.out.println("Total Quantity on checkout page is : " + totalQty);

		for (int i = 0; i < checkout.get_buttonsAddQuantity().size(); i++) {

			Thread.sleep(2000L);
			int qty = Integer.parseInt(checkout.get_quantities().get(i).getText());
			checkout.get_buttonsAddQuantity().get(i).click();
			Thread.sleep(2000L);
			int newQty = Integer.parseInt(checkout.get_quantities().get(i).getText());

			if (newQty == (qty)) {
				System.out.println("PASS: + icon is disabled for product :" + (i + 1));
			} else {
				System.out.println("FAIL: + icon is enabled for product :" + (i + 1));
			}
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void verify_invalid_and_valid_promo_code(String promo) throws Exception {
		if (checkout.isClickable("btnPromoCode", 10)) {

			checkout.get_btnPromoCode().click();
			System.out.println("Clicked on 'Click Here' button to insert promo code");

			checkout.enterText("txtbx_promoCode", "txtbx_promoCode", "GLOB-10-OFF");

//			checkout.get_txtbx_promoCode().sendKeys("GLOB-10-OFF");

			System.out.println("Inserted promo code : GLOB-10-OFF");

			Thread.sleep(1500L);
//			checkout.isClickable("btn_applyPromo", 10);
			checkout.clickOnElement("Clicking On PromoCode", "btn_applyPromo", "btn_applyPromo");

			System.out.println("Clicked on apply button to apply promo code");
//			checkout.isElementExist("That’s not a valid promo code. - Failure Message", "promoFailMsg", 5);

			checkout.get_txtbx_promoCode().clear();

//			checkout.get_txtbx_promoCode().sendKeys(promo);
			checkout.enterText("txtbx_promoCode", "txtbx_promoCode", "HPWTEST");

			System.out.println("Inserted promo code : " + promo);

			Thread.sleep(1500L);
//			checkout.get_btn_applyPromo().click();

			checkout.clickOnElement("Clicking On PromoCode", "btn_applyPromo", "btn_applyPromo");
//			checkout.isClickable("btn_applyPromo", 10);

			System.out.println("Clicked on apply button to apply promo code");
//			checkout.isElementExist("Promo code applied successfully - Success Message", "promoSuccessMsg", 5);

		} else {
			System.out.println("FAIL: failed to click on promo code");
		}
	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void validate_form_onClick_of_changeAddress(String addressType) throws Exception {
		Thread.sleep(5000);
		Pay.get_changeAddress().click();
		System.out.println("Clicked on Change Address button");

		Form.scroll_vertical(200);

		System.out.println("Validate FORM field values are pre-populated");

		System.out.println("First Name : " + Form.getAttributeValue("firstName", "value"));
		System.out.println("Middle Name : " + Form.getAttributeValue("middleName", "value"));
		System.out.println("Last Name : " + Form.getAttributeValue("lastName", "value"));
		System.out.println("Email : " + Form.getAttributeValue("email", "value"));
		System.out.println("Mobile Number : " + Form.getAttributeValue("mobileNumber", "value"));

		Form.scroll_vertical(600);

		if (addressType.equalsIgnoreCase("house")) {
			System.out.println("House radio button is selected");

			System.out.println("House : " + Form.getAttributeValue("houseNo", "value"));
			System.out.println("Street : " + Form.getAttributeValue("street", "value"));
			System.out.println("Village/Subdivision : " + Form.getAttributeValue("village_subDivision", "value"));
			System.out.println("Province : " + Form.getAttributeValue("drpdwnProvince", "value"));
			System.out.println("City : " + Form.getAttributeValue("drpdwnCity", "value"));
			System.out.println("Barangay : " + Form.getAttributeValue("drpdwnBarangay", "value"));
			System.out.println("ZipCode : " + Form.getAttributeValue("zipCode", "value"));
		}
		Form.scroll_vertical(300);

		System.out.println("Special Instruction : " + Form.getAttributeValue("specialInstruction", "value"));

		Form.scroll_vertical(1500);
		Thread.sleep(5000);
		select_chkbx_acceptAllTerms();

		click_pay_btn_on_form("android");
//		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "Pay");

	}

	/**
	 * @throws Exception
	 ******************************************************************************************************************************/
	public void pay_via_creditCard() throws Exception {

		String cardNumber = "4421 8815 4231 5201";
		String expiryDate = "0726";
		String cvv = "777";

		select_payment_option_proceed_with_payment("Card", "NoGCash");
		clickPayOrderOnPayScreen();
		Thread.sleep(30000L);
		if (Pay.isElementExist("Credit Card Page", "creditCardPage", 30)) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browserstack.idleTimeout", 30);
			Thread.sleep(30000L);

			DriverManager.getDriver().switchTo().frame(Pay.get_cardNumberFrame());
			Pay.get_cardNumber().sendKeys(cardNumber);

			//Pay.enterText("cardNumber", "cardNumber", cardNumber);

			System.out.println("Inserted Card number : " + cardNumber);
			DriverManager.getDriver().switchTo().defaultContent();

			DriverManager.getDriver().switchTo().frame(Pay.get_cardExpiryDateFrame());
			Pay.get_cardExpiryDate().sendKeys(expiryDate);
			//Pay.enterText("cardExpiryDate", "cardExpiryDate", expiryDate);
			System.out.println("Inserted Expiry Date : " + expiryDate);
			DriverManager.getDriver().switchTo().defaultContent();

			DriverManager.getDriver().switchTo().frame(Pay.get_cvvFrame());
			Pay.get_cvv().sendKeys(cvv);
			//Pay.enterText("cvv", "cvv", cvv);
			System.out.println("Inserted CVV : " + cvv);
			DriverManager.getDriver().switchTo().defaultContent();

			if (Pay.isClickable("btnPay_CC", 5)) {
				//Pay.get_btnPay_CC().click();
				Pay.clickOnElement("Button", "btnPay_CC", "btnPay_CC");
				System.out.println("Clicked on Pay button");
			}
		} else {
			System.out.println("Credit Card Page do not open");
		}

	}

	/********************************************************************************************************************************/
	public void pressKeyboardKey(String key) throws InterruptedException {

		Actions a = new Actions(DriverManager.getDriver());
		Thread.sleep(500L);

		switch (key.toUpperCase()) {
		case "TAB":
			a.sendKeys(Keys.TAB).build().perform();
			break;
		case "SPACE":
			a.sendKeys(Keys.SPACE).build().perform();
			break;
		case "SHIFT_TAB":
			a.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();
			break;
		}

	}

	/********************************************************************************************************************************/
	public void toggle_and_select_terms_checkboxes() throws InterruptedException {

		// // navigate to terms and condition check boxes
		// Form.get_zipCode().click();
		// for (int ctr = 0; ctr < 16; ctr++) {
		// Thread.sleep(1500L);
		// pressKeyboardKey("TAB");
		// }

		Form.get_label_accept_all_terms().click();
		Thread.sleep(1000L);
		Form.get_label_accept_all_terms().click();
		Thread.sleep(1500L);
		pressKeyboardKey("TAB");

		try {
			int countTerms = Form.get_chkbxTermsConditions().size();
			String labelTerms = "";
			for (int i = 0; i < countTerms - 1; i++) {
				labelTerms = Form.get_chkbxLabelTermsConditions().get(i).getText();

				Thread.sleep(1500L);
				pressKeyboardKey("SPACE");
				System.out.println("Selected Terms/Conditions : " + labelTerms);

				Thread.sleep(1500L);
				pressKeyboardKey("SPACE");
				System.out.println("Unselected Terms/Conditions : " + labelTerms);

				Thread.sleep(1500L);
				pressKeyboardKey("TAB");
				Thread.sleep(1500L);
				pressKeyboardKey("TAB");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error - IndexOutOfBound :" + e.getMessage());
		} catch (Exception e1) {
			System.out.println("Error :" + e1.getMessage());
		}

		// navigate back to accept all term checkbox
		for (int ctr = 0; ctr < 13; ctr++) {
			Thread.sleep(1500L);
			pressKeyboardKey("SHIFT_TAB");
		}
		Thread.sleep(1500L);
		pressKeyboardKey("SPACE");
	}

	public void hover_On_Menu_Buy_Link() throws Exception {

		if (noti.isElementExist("Link Menu Buy", "link_MenuBuy", 10)) {
			// noti.jsClick("Menu buy link","link_MenuBuy");
			noti.moveToElement("link_MenuBuy");

		}

		// noti.moveToElement("link_MenuBuy");

		if (LP.isElementExist("Link Globe at home prepaid wifi", "link_GlobeAtHomePrepaidWiFi", 10)) {
			LP.clickOnElement("Link", "link Globe At Home Prepaid WiFi", "link_GlobeAtHomePrepaidWiFi");
		}

	}

	public void validateOutofStock() throws InterruptedException {

		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				noti.get_Out_Of_Stock_Msg());
		Thread.sleep(2000);

		// LP.isElementExist("Link Globe at home prepaid wifi",
		// "link_GlobeAtHomePrepaidWiFi", 10);

		// click on notify me button
		if (noti.isElementExist("Notify me button", "Notify_Me_button", 10)) {
			noti.jsClick("Notify me button", "Notify_Me_button");
			Thread.sleep(3000);
		}

	}

	public void validateNotifyScreen() throws InterruptedException {

		noti.isElementExist("Let me know message", "Let_Me_Know_Msg", 10);

		noti.isElementExist("Email Address Field", "Email_Address_Field", 10);

		noti.isElementExist("Mobile Number Field", "Mobile_Number_Field", 10);

		noti.isElementExist("Cancel Button", "Cancel_Button", 10);

		noti.isElementExist("Notify Me Button1", "Notify_Me_Button1", 10);

	}

	public void leaveMandatoryFieldBlank() throws InterruptedException {

		Thread.sleep(3000);

		noti.clickOnElement("Input Field", "Mobile Number Field", "Mobile_Number_Field");

		Thread.sleep(3000);

		noti.clickOnElement("Email", "Email Address Field", "Email_Address_Field");

		Thread.sleep(3000);

		noti.isElementExist("MobileNo Is mandatory Error Msg", "MobileNo_Is_mandatory_Error_Msg", 10);

		noti.clickOnElement("Input Field", "Mobile Number Field", "Mobile_Number_Field");

		Thread.sleep(6000);

		noti.isElementExist("Email Is mandatory Error Msg", "Email_Is_mandatory_Error_Msg", 10);

	}

	public void enterInvalidData() throws InterruptedException {

		noti.get_Email_Address_Field().sendKeys("abc@123");

		noti.get_Mobile_Number_Field().sendKeys("12345678");

		// noti.clickOnElement("Button","Notify Me Button1","Notify_Me_Button1");

		noti.isElementExist("Please Provide Valid Email Error Msg", "Please_Provide_Valid_Email_Error_Msg", 10);

		noti.isElementExist("Please Provide Valid Number Error Msg", "Please_Provide_Valid_Number_Error_Msg", 10);

	}

	public void enterValidData() throws InterruptedException {

		noti.get_Email_Address_Field().clear();
		noti.get_Mobile_Number_Field().clear();

		noti.get_Email_Address_Field().sendKeys("lavanya.sakhamuri@testingxperts.com");

		noti.get_Mobile_Number_Field().sendKeys("09270000112");

		noti.clickOnElement("Button", "Cancel Button", "Cancel_Button");

		noti.jsClick("Notify me button", "Notify_Me_button");

		noti.get_Email_Address_Field().sendKeys("lavanya.sakhamuri@testingxperts.com");

		noti.get_Mobile_Number_Field().sendKeys("09270000112");

		noti.clickOnElement("Button", "Notify Me Button1", "Notify_Me_Button1");

	}

	public void validateNotifyPopUp() throws InterruptedException {

		noti.isElementExist("You Are In Loop Msg", "You_Are_In_Loop_Msg", 10);

		noti.isElementExist("We Will Let You Know When HPW Available", "We_Will_Let_You_Know_When_HPW_Available", 10);

		// click on Okay button
		if (noti.isElementExist("Notify me button", "Notify_Me_button", 10)) {
			noti.clickOnElement("Button", "Okay Button", "Okay_Button");
		}
	}

	public void enteringUsedData() throws InterruptedException {

		noti.jsClick("Notify me button", "Notify_Me_button");

		noti.get_Email_Address_Field().sendKeys("lavanya.sakhamuri@testingxperts.com");

		noti.get_Mobile_Number_Field().sendKeys("09270000112");

		noti.clickOnElement("Button", "Notify Me Button1", "Notify_Me_Button1");

		noti.isElementExist("Already A Subscriber Error Msg", "Already_A_Subscriber_Error_Msg", 10);

	}

	public void hover_On_Menu_Buy() throws InterruptedException {

		if (noti.isElementExist("Link Menu Buy", "link_MenuBuy", 10)) {
			// noti.jsClick("Menu buy link","link_MenuBuy");
			noti.moveToElement("link_MenuBuy");

		}

		// noti.moveToElement("link_MenuBuy");

		if (noti.isElementExist("LTE Advanced link", "LTE_AdvancedLink", 10)) {
			noti.clickOnElement("Link", "LTE advanced", "LTE_AdvancedLink");
		}

	}

	public void IacceptClick() throws Exception {
			if (LP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
				Control.takeScreenshot();
				if (LP.isClickable("privacyAccept", 5)) {
					LP.clickOnElement("Link", "privacy Accept", "privacyAccept");
				}
			}
		}

	 public void menuBar(String env) throws Exception {

			if(env.equalsIgnoreCase("UAT"))	{
			    LP.isElementExist("Menu bar link - Apply", "link_Apply", 10);
				LP.isElementExist("Link Globe logo", "link_LogoGlobe", 10);
				LP.isElementExist("Menu bar link - Renew", "link_Renew", 10);
				LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);
				LP.isElementExist("Menu bar link - Buy", "link_MenuBuy", 10);
				LP.isElementExist("Menu bar link - Help", "link_Help", 10);
				LP.isElementExist("Menu bar link - Cart Icon", "CartIcon", 10);
				LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);
				Control.takeScreenshot();	
				// step 2 : Hover on Apply button
				LP.moveToElement("link_Apply");
				LP.isElementExist("Mobile postpaid", "link_MobilePostpaid", 10);
				LP.isElementExist("View all devices", "link_ViewAllDevices", 10);
				Control.takeScreenshot();
		
		
				if (LP.isClickable("link_MobilePostpaid", 5)) {
					LP.clickOnElement("Link", "Mobile postpaid", "link_MobilePostpaid");
					Thread.sleep(4000);
					Control.takeScreenshot();
				}
		
				// step 5: validating redirection of View All Devices
				LP.moveToElement("link_Apply");
				LP.isElementExist("View all devices", "link_ViewAllDevices", 10);
		
				// Clicking on View all devices
				if (LP.isClickable("link_ViewAllDevices", 5)) {
					LP.clickOnElement("Link", "View all devices", "link_ViewAllDevices");
					Thread.sleep(4000);
					Control.takeScreenshot();
				}
				LP.isElementExist("Postpaid Devices", "postpaidDevices", 10);
				LP.isElementExist("Filters", "filters", 10);
			} 
			
			else if (env.equalsIgnoreCase("Dev_Desktop")) {
				Thread.sleep(3000);
//				if (LP.isElementExist("Menu bar link - EasyPaymentTetx", "EasyPaymentTetx", 10)) {
//					LP.isElementExist("Link Globe logo", "CancelIcon", 10);
					if(LP.isElementExist("Menu bar link - Mobile", "Link_Mobile", 10)) {
					LP.isElementExist("Menu bar link - Home Internet", "Link_HomeInternet", 10);
					LP.isElementExist("Menu bar link - Deals", "Link_Deals", 10);
					LP.isElementExist("Menu bar link - Quick Links", "Link_QuickLinks", 10);
					LP.isElementExist("Menu bar link - Track my order", "Link_TrackMyorder", 10);
					Control.takeScreenshot();
					// step 2 : Hover on Mobile Link button
					LP.isElementExist("Menu bar link - Mobile", "Link_Mobile", 10);
					LP.moveToElement("Link_Mobile");
					LP.isElementExist("postpaid", "Link_Postpaid", 10);
					LP.isElementExist("New online", "Link_NewOnline", 10);
					LP.isElementExist("Sim Only", "Link_SimOnly", 10);
					LP.isElementExist("Plan With Device", "Link_PlanWithDevice", 10);
					LP.isElementExist("Renewal", "Link_Renewal", 10);
					Control.takeScreenshot();
					// step 3 : Hover on HomeInternet Link button
					LP.isElementExist("Menu bar link - Internet", "Link_HomeInternet", 10);
					LP.moveToElement("Link_HomeInternet");
					LP.isElementExist("Home Internet postpaid", "Link_HIpostpaid", 10);	
					LP.isElementExist("Apply Gfiber Plan", "Link_ApplyGfiberPlan", 10);
					LP.isElementExist("Upgrade Internet Plan", "Link_UpgradeInternetPlan", 10);
					LP.isElementExist("Prepaid", "Link_Prepaid", 10);
					LP.isElementExist("Gfiber Prepaid", "GFiber_Prepaid", 10);
		         	LP.isElementExist("Prepaid Wifi", "Link_PrepaidWifi", 10);
		         	LP.isElementExist("Prepaid Wifi SIM", "Link_PrepaidWifiSIM", 10);
	    	
					LP.isElementExist("Link Deals", "Link_Deals", 10);	
					LP.moveToElement("Link_Deals");
					LP.isElementExist("GPlanPLUS Discounted Devices", "Link_GPlanPLUS_Discounted_Devices", 10);
			     	LP.isElementExist("Link GlobePrepaidExclusives", "Link_Globe_Prepaid_Exclusives", 10);
					// step 4 : Hover on HomeInternet Link button
					
					LP.isElementExist("Menu bar link - BuyLoad", "Link_QuickLinks", 10);
					LP.moveToElement("Link_QuickLinks");
					LP.isElementExist("Menu bar link - BuyLoad", "Link_BUYLoad", 10);
					LP.isElementExist("Home Internet postpaid", "Link_Register_your_SIM", 10);
					LP.isElementExist("Switch to Globe", "Link_SwitchtoGlobe", 10);
					LP.isElementExist("Help Support", "Link_HelpSupport", 10);
					Control.takeScreenshot();
					} else {
						System.out.println("It is not Hovered on Mobile Plan");
					}
				}
			
			else if(env.equalsIgnoreCase("Dev"))
			{
				
				LP.isElementExist("Quick Links", "QuickLink_Mobileview", 10);
				LP.isElementExist("Globe Logo", "GlobeLogo_MobileView", 5);
//				LP.isElementExist("Easy Payments via GCash GGives", "EasyPayments_MobileView", 5);
				
				LP.jsClick("QuickLink", "QuickLink_MobileView");
				LP.jsClick("QuickLinks", "QuickLinksDropdown_MobileView");

//				LP.clickOnElement("Quick Links Icon", "Quick Link", "QuickLink_MobileView");
//				LP.clickOnElement("Quick Link Dropdown ", "QuickLinks", "QuickLinksDropdown_MobileView");
				
				LP.isElementExist("QuickLink Dropdown BuyLoad option", "QuickLinkDropdown_BuyLoad_MobileView", 5);
				LP.isElementExist("QuickLink Dropdown Register Your Sim option", "QuickLinkDropdown_RegisterYourSim_MobileView", 5);
//				LP.isElementExist("QuickLink Dropdown Switch to Globe option", "QuickLinkDropdown_SwitchtoGlobe_MobileView", 5);
				LP.isElementExist("QuickLink Dropdown Help and Support option", "QuickLinkDropdown_HelpandSupport_MobileView", 5);
				
				LP.isElementExist("Menu Icon", "MenuIcon_MobileView", 5);
//				LP.jsClick("MenuIcon_MobileView", "MenuIcon_MobileView");
//				LP.jsClick("Mobile Label", "MobileExpandOption");

				LP.clickOnElement("Menu Icon Option", "MenuIcon_MobileView", "MenuIcon_MobileView");
				LP.clickOnElement("Mobile Option", "Mobile Label", "MobileExpandOption");
				LP.isElementExist("SimOnlyPlan", "SimOnlyPlan_MobileView", 5);
				LP.isElementExist("PlanWithDevice", "PlanWithDevice_MobileView", 5);
				LP.isElementExist("Renewal link", "RenewalLink_MobileView", 5);
				LP.isElementExist("HomeInternet Option",  "HomeInternet_MobileView",5);
				
				LP.clickOnElement("HomeInternet Option", "HomeInternet_MobileView", "HomeInternet_MobileView");

				LP.isElementExist("ApplyForaGFiberPlan", "ApplyForaGFiberPlan_MobileView", 5);
				LP.isElementExist("UpgradeMyInternet", "UpgradeMyInternet_MobileView", 5);
				LP.isElementExist("GFiber Prepaid", "GFiberPrepaid_MobileView", 5);
				LP.isElementExist("PrepaidWifi", "PrepaidWifi_MobileView", 5);
				LP.isElementExist("HomePrepaid Wifi Sim", "HomePrepaidWifiSim_MobileView", 5);
				
				LP.isElementExist("Deals option", "Deals_MobileView", 5);
				LP.clickOnElement("Deals option", "Deals option", "Deals_MobileView");
				
				LP.isElementExist(" Gplan Plus * Discounted Devices", "DiscountedDevices_MobileView", 5);
				LP.isElementExist("Globe Prepaid Exclusives", "GlobePrepaidExclusives_MobileView", 5);
				
				LP.isElementExist("QuickLinks Option", "QuickLinks_MobileView", 5);
				LP.clickOnElement("QuickLinks Option", "QuickLinks_MobileView", "QuickLinks_MobileView");
				LP.isElementExist("Buy Load", "BuyLoad_MobileView", 5);
				
				LP.isElementExist("Register Your Sim", "RegisterYourSim_MobileView", 5);

				LP.isElementExist("Switch to Globe", "SwitchtoGlobe_MobileView", 5);
				LP.isElementExist("Help and Support", "HelpandSupport_MobileView", 5);

				LP.isElementExist("Menu close icon", "ExitMenu_MobileView", 5);
//				LP.clickOnElement("Menu Close Icon", "Menu Close", "ExitMenu_MobileView");
				
				
			}
			
			
			else {
				LP.isElementExist("Mobile postpaid", "link_MobilePostpaid", 10);
				//LP.isElementExist("Menu bar link - Internet", "internetLink", 10);
				LP.isElementExist("Menu bar link - Deals", "dealsLink", 10);
				LP.isElementExist("Menu bar link - Reload", "reloadLink", 10);
				LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);
				LP.isElementExist("Menu bar link - Help", "link_Help", 10);
				LP.isElementExist("RegisterSim link", "RegisterSim", 10);
				LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);
				Control.takeScreenshot();

				LP.moveToElement("link_MobilePostpaid");

				if (LP.isClickable("postpaidDevicesLink", 5)) {
					LP.clickOnElement("Link", "postpaidDevicesLink", "postpaidDevicesLink");
				}

			}
		}

	 public void NavigateThroughHomeInternetPrepaidWifi() throws Exception {
			LP.clickOnElement("Menu Option", "Menu Icon", "MenuIcon_MobileView");
			if(LP.isElementExist("Prepaid WIFI  Option", "PrepaidWifi_MobileView", 5))
			{
			
			LP.clickOnElement("HomeInternet Prepaid Wifi Option", "HomeInternet Expand Option PlanWithDevice link", "PrepaidWifi_MobileView");
			}
			
			else
			{
				LP.clickOnElement("HomeInternet Option", "HomeInternet Expand Option", "HomeInternet_MobileView");
				
				LP.clickOnElement("HomeInternet Prepaid Wifi Option", "HomeInternet Expand Option PlanWithDevice link", "PrepaidWifi_MobileView");
			}
			Thread.sleep(1000);
			//LP.isElementExist("PlanWithDeviceSearchField_MobileView", "PlanWithDeviceSearchField_MobileView", 10);
			
			Control.takeScreenshot();
		}

	// Globe Online Phase 2 Click on Prepaid Wifi link
		public void ClickonPrepaidWifi(String env) throws Exception {
			// Go to Sim Only Landing Page
			if (env.equalsIgnoreCase("Dev_Desktop")) {
				Thread.sleep(5000);
				LP.moveToElement("Link_HomeInternet");
				if (LP.isElementExist("Menu bar link - PrepaidWifi", "Link_PrePaidWifi", 10)) {
					if (LP.isClickable("Link_PrePaidWifi", 5)) {
						LP.clickOnElement("Link", "Link_PrePaidWifi", "Link_PrePaidWifi");
					}
					else {
						System.out.println("It is not clicked on PrePaidWifi Plan");
					}
				} 
			}
		}	

}
