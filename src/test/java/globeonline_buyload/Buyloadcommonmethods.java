package globeonline_buyload;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.Acqui.AcquiLanding_Page;
import com.pages.Buyload.BuyLoadLandingPage;
import com.pages.Buyload.PayPage;
import com.pages.renewal.Renewal_PaymentPage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;

public class Buyloadcommonmethods {
	private util util = new util();
	private PayPage PP = new PayPage();
	private Renewal_PaymentPage PayP = new Renewal_PaymentPage();
	private AcquiLanding_Page LP = new AcquiLanding_Page();
	private  BuyLoadLandingPage  BL = new BuyLoadLandingPage();

	public void openApplication() throws Exception {
		
		if(Constant.environment.equalsIgnoreCase("UAT")) {
			DriverManager.getDriver().get(Constant.UAT_URL);
			assertTrue(DriverManager.getDriver().getTitle().contains("Customize your GPlan with Device"));	
			System.out.println("Accessed aplication successfully");
		}
		else if(Constant.environment.equalsIgnoreCase("preprod")) {
			DriverManager.getDriver().get(Constant.PreProd_URL);
    		assertTrue(DriverManager.getDriver().getTitle().contains("Home"));	
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
			assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
			System.out.println("Accessed Preprod aplication successfully");
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




	public void paymentpageValidation(String PaymentMode) throws Exception {
		
		PP.isElementExist("paybreadcrum", "paybreadcrum", 10);
		PP.isElementExist("subtext", "subtext", 10);
		PP.isElementExist("gcashimg", "gcashimg", 10);
		PP.isElementExist("creditimg", "creditimg", 10);
		PP.isElementExist("creditcard", "creditcard", 10);
		PP.isElementExist("amounttopay", "amounttopay", 10);
		PP.isElementExist("load", "load", 10);
		PP.isElementExist("loadamount", "loadamount", 10);
		PP.isElementExist("total", "total", 10);
		PP.isElementExist("totalamount", "totalamount", 10);
		PP.isElementExist("paybutton", "paybutton", 10);
		Control.takeScreenshot();
		switch (PaymentMode) {
		case "Gcash":
    		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", PP.get_Gcash());
    		PP.js_clickOnElement("Button", "Payment", "Gcash");
    		
			break;
		case "creditcard":
    		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", PP.get_creditcard());
    		PP.js_clickOnElement("Button", "Payment", "creditcard");
			break;
		
		default:
			System.out.println("Given mode of payment not exist");
		}
		Thread.sleep(4000);
		Control.takeScreenshot();
		
	}
	public void clickpaybutton() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", PP.get_paybutton());
		PP.js_clickOnElement("Button", "Payment", "paybutton");
		
	}
	
	public void NavigateTo_BuyLoad() throws Exception {

			if (BL.isElementExist("QuickLinks_Link", "QuickLinks_Link", 10)) {
				//Thread.sleep(3000);
				((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", BL.get_QuickLinks_Link());
				BL.moveToElement("QuickLinks_Link");
				Thread.sleep(3000L);
	
			    BL.moveToElement("BuyLoad_Link");
				Control.takeScreenshot();
				Thread.sleep(5000);
			    BL.jsClick("Link", "BuyLoad_Link");
			    Thread.sleep(2000);
			    BL.moveToElement("link_TrackMyOrder");
			}
	
				Thread.sleep(5000L);
				System.out.println(": Reached to BuyLoad landing page");
				Control.takeScreenshot();
  }
	
	public void NavigateTo_BuyLoad_Mobile() throws Exception {
		
		if (BL.isElementExist("MenuBtn", "MenuBtn", 10)) {
			Control.takeScreenshot();
    		BL.jsClick("MenuBtn", "MenuBtn");
        }		


		if (BL.isElementExist("QuickLinks_Link_Mobile", "QuickLinks_Link_Mobile", 20)) {
			//Thread.sleep(3000);
			((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", BL.get_QuickLinks_Link_Mobile());

			Control.takeScreenshot();
		    BL.jsClick("Link", "QuickLinks_Link_Mobile");
		    Thread.sleep(2000);
			Control.takeScreenshot();
		    BL.jsClick("Link", "BuyLoad_Link");

		}

			Thread.sleep(5000L);
			System.out.println(": Reached to BuyLoad landing page");
			Control.takeScreenshot();
}

	
    // Function to check if element is visible
    private static boolean isElementVisible(WebDriver driver, WebElement element) {
        try {
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e) {
            return false;
        }
    }
    
    // Function to wait for element presence
    private static WebElement waitForElementPresence(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    
    // Function to wait for element to be clickable
    private static WebElement waitForElementClickable(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

	

	public void BuyloadValidation() throws Exception {
		BL.isElementExist("Iload_Text", "Iload_Text", 10);
		BL.isElementExist("Magkano_text", "Magkano_text", 10);
		BL.isElementExist("MobileNumber_Field", "MobileNumber_Field", 10);
		BL.isElementExist("GlobePrepaidBuyLoadFlex", "GlobePrepaidBuyLoadFlex", 10);
		BL.isElementExist("TMBuyLoadFlex", "TMBuyLoadFlex", 10);
		BL.isElementExist("HomePrepaidWifiBuyloadFlex", "HomePrepaidWifiBuyloadFlex", 10);
		BL.isElementExist("GlobesTermsCondition", "GlobesTermsCondition", 10);
		BL.isElementExist("Sa_iYoungText", "Sa_iYoungText", 10);
		BL.isElementExist("PrivacyPolicy", "PrivacyPolicy", 10);
		Control.takeScreenshot();

	}
	
	public void ProcessingwithBuyLoad(String Testdata, String Planvalue) throws Exception {
		BL.enterText("MobileNumber_Field", "MobileNumber_Field", Testdata);
        WebElement element = waitForElementPresence(DriverManager.getDriver(), By.xpath("//button[normalize-space(text())='₱"+Planvalue+"']"), 60);
        WebElement elementclick = waitForElementClickable(DriverManager.getDriver(), By.xpath("//button[normalize-space(text())='₱"+Planvalue+"']"), 20);
		Control.takeScreenshot();
		DriverManager.getDriver()
		.findElement(By.xpath("//button[normalize-space(text())='₱"+Planvalue+"']")).click();
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", BL.get_NextButton());
		Thread.sleep(2000);
		Control.takeScreenshot();
		BL.isElementExist("NextButton", "NextButton", 10);
		BL.jsClick("NextButton", "NextButton");

	}
	
	public void enteringVisaMasterCardDetails(String CardNum,String Expiry,String CVV) throws Exception {
		PP.isElementExist("Xendit_CardNumber", "Xendit_CardNumber", 20);
		PP.get_Xendit_CardNumber().sendKeys(CardNum);
		PP.isElementExist("Xendit_ExpiryDate", "Xendit_ExpiryDate", 20);
		PP.get_Xendit_ExpiryDate().sendKeys(Expiry);
		PP.isElementExist("Xendit_CVV", "Xendit_CVV", 20);
		PP.get_Xendit_CVV().sendKeys(CVV);
		PP.isElementExist("PayBill_Btn", "PayBill_Btn", 20);
		PP.js_clickOnElement("PayBill_Btn", "PayBill_Btn", "PayBill_Btn");

	}

	

	public void enterPayment_Details(String payMethod,String GcashNum,String cardNumber,String expiryDate, String cvv) throws Exception {
		if(payMethod.equalsIgnoreCase("Visa")) {
			PayP.isElementExist("Credit Card Page", "creditCardPage", 100);
//			String cardNumber = "3569 9900 1009 5841";
//			String expiryDate = "0330";
//			String cvv = "737";


			//3569 9900 1009 5841 03/2030 737
			// clickPayOrderOnPayScreen();

			if (PayP.isElementExist("Credit Card Page", "creditCardPage", 30)) {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("browserstack.idleTimeout", 30);

				DriverManager.getDriver().switchTo().frame(PayP.get_cardNumberFrame());
				PayP.get_cardNumber().sendKeys(cardNumber);
				System.out.println("Inserted Card number : " + cardNumber);
				DriverManager.getDriver().switchTo().defaultContent();

				DriverManager.getDriver().switchTo().frame(PayP.get_cardExpiryDateFrame());
				PayP.get_cardExpiryDate().sendKeys(expiryDate);
				System.out.println("Inserted Expiry Date : " + expiryDate);
				DriverManager.getDriver().switchTo().defaultContent();

				DriverManager.getDriver().switchTo().frame(PayP.get_cvvFrame());
				PayP.get_cvv().sendKeys(cvv);
				System.out.println("Inserted CVV : " + cvv);
				DriverManager.getDriver().switchTo().defaultContent();

				//			if (PayP.isClickable("btnPay_CC", 5)) {
				//				PayP.get_btnPay_CC().click();
				Control.captureScreenshot();
				JavascriptExecutor jssubmit = (JavascriptExecutor) DriverManager.getDriver();
				jssubmit.executeScript("arguments[0].click();", PayP.get_btnPay_CC());
				System.out.println("Clicked on Pay button");
		}
		 if(payMethod.equalsIgnoreCase("Gcash")) {
			 if(PayP.isElementExist("Merchant", "Merchant", 90)) {
					String Merchant = PayP.get_Merchant().getText();
					System.out.println("Merchant: "+Merchant);
				}

				if(PayP.isElementExist("AmountDue", "AmountDue", 10)) {
					String AmountDue = PayP.get_AmountDue().getText();
					System.out.println("AmountDue: "+AmountDue);
				}

				PayP.isElementExist("LoginToPayWithGCash", "LoginToPayWithGCash", 10);

				if(PayP.isElementExist("NumberField", "NumberField", 10)) {
					PayP.get_NumberField().sendKeys(GcashNum);		
				} 

				PayP.jsClick("nextButton", "nextButton");			

				if (PayP.isElementExist("Enteryour4digitMPIN", "Enteryour4digitMPIN", 40)) {
					for (int j = 1; j <=4; j++) {
						PayP.get_gcashPin().sendKeys("1");			
					}
				}

				PayP.jsClick("nxtButton", "nxtButton");	


				if(PayP.isElementExist("GCashBalance", "GCashBalance", 60)) {
					String GCashBalance = PayP.get_GCashBalance().getText();
					System.out.println("GCashBalance: "+GCashBalance);
				}

				PayP.jsClick("Agree Button", "agree");	

                PayP.isElementExist("payBtn", "payBtn", 40);
				PayP.jsClick("payBtn", "payBtn");	

		 }
		} 
	}

}
