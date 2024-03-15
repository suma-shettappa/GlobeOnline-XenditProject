package globeOnline_renewal;

import static org.junit.Assert.assertTrue;



import java.awt.AWTException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

//import com.pages.HPW.TrackOrderPage;
import com.pages.renewal.Notifyme_page;
import com.pages.renewal.Renewal_CustmizeplanPage;
import com.pages.renewal.Renewal_OrderTrackerPage;
import com.pages.renewal.Renewal_Otp_Page;
import com.pages.renewal.Renewal_PaymentPage;
import com.pages.renewal.Renewal_ProductDetails_Page;
import com.pages.renewal.Renewal_SuccessPage;
import com.pages.renewal.renewal_landingpage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;



public class Renewal_commonmethods {
	private static LinkedHashMap<String, String> Map = new LinkedHashMap<>();
	private util util = new util();
	private Notifyme_page NP = new Notifyme_page();


	private renewal_landingpage LP = new renewal_landingpage();
	private Renewal_CustmizeplanPage Custm=new Renewal_CustmizeplanPage();
	private Renewal_ProductDetails_Page PP = new Renewal_ProductDetails_Page();	
	private Renewal_SuccessPage TP = new Renewal_SuccessPage();
	private Renewal_PaymentPage PayP = new Renewal_PaymentPage();	
	private Renewal_Otp_Page Otp = new Renewal_Otp_Page();
	//private TrackOrderPage TrackOrder = new TrackOrderPage();
	private Renewal_OrderTrackerPage OrderDetails = new Renewal_OrderTrackerPage();

	/************************************************************************************************************************/
	// ************************************//

	public void insert_phoneNo(String phoneNo) throws Exception {


		System.out.println(" ************OTP Page Validation***********");
		Otp.isElementExist("verificationNeeded", "verificationNeeded", 10);
		Otp.isElementExist("enterYourMobileNumber", "enterYourMobileNumber", 10);
		Otp.isElementExist("codeExpiresIn", "codeExpiresIn", 10);
		Otp.isElementExist("privacyPolicy", "privacyPolicy", 10);
		Control.takeScreenshot();

		if(Otp.isElementExist("mobileNumField", "mobileNumField", 10)) {
			Otp.enterText("mobileNumField", "mobileNumField", phoneNo);
			Control.takeScreenshot();
		}
		//Constant.dataMap.get().put("GO_MobileNumber", mobileNumber);
		if(Otp.isElementExist("getCodeButton", "getCodeButton", 10)) {
			Otp.jsClick("getCodeButton", "getCodeButton");
		}

		Thread.sleep(1000);
		Constant.dataMap.get().put("GO_MobileNumber", phoneNo);
	}

	/********************************************************************************************************************************/
	private boolean isAttribtuePresent(WebElement get_btn_resendOPT, String string) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public void handle_and_insert_OTP() throws Exception {
		if (Otp.isElementExist("OTPInput", "otpInput", 10)) {
			if (Otp.isElementExist("otpInput1", "otpInput1", 15)) {
				//Otp.jsClick("getCodeButton", "getCodeButton");
				Otp.isElementExist("ResendCode", "ResendCode", 20);
				for (int j = 0; j < Otp.get_otpInput1().size(); j++) {
					Otp.get_otpInput().get(j).sendKeys(String.valueOf(j + 1));
				}
			} else
				for (int j = 0; j < Otp.get_otpInput1().size(); j++) {
					Otp.get_otpInput().get(j).sendKeys(String.valueOf(j + 1));
				}
			System.out.println("Inserted OTP");
		}
		if (Otp.isElementExist("submitButton", "submitButton", 10)) {
			Control.takeScreenshot();
			Otp.jsClick("submitButton", "submitButton");
		}	}
	public void loadingScreenValidation() throws Exception {
		Otp.isElementExist("checkingOutstandingBalance", "checkingOutstandingBalance", 20);
        Otp.scroll_vertical(300);
		Otp.isElementExist("DontExitPage", "DontExitPage", 10);
		Control.takeScreenshot();
//		Otp.isElementExist("checkingYourEligibility", "checkingYourEligibility", 20);
//		Otp.isElementExist("checkingPlanDetails", "checkingPlanDetails", 50);
		Otp.isElementExist("youareAllSet", "youareAllSet", 60);
		Control.takeScreenshot();
		//Otp.isElementExist("renewalProcessing", "renewalProcessing", 10);	
	}
	public void ODAADDRSSCHECK(String HouseNo_FloorNo, String Street, String Subdi_BuildingName, String Prov, String City, String Brgy) throws Exception
	{

		WindowsZoomInOut(80);
		Thread.sleep(4000);

		Custm.isElementExist("house", "house", 10);
		Custm.isElementExist("condo", "condo", 10);
		WindowsZoomInOut(100);
		Custm.get_houseNo().sendKeys(HouseNo_FloorNo);
		System.out.println("Floor : "+HouseNo_FloorNo);
		//		CP.get_buildingname().sendKeys(Subdi_BuildingName); 
		//		System.out.println("Building Name : "+Subdi_BuildingName);
		Custm.get_street().sendKeys(Street); 
		System.out.println("Street : "+Street);

		WebElement provience =DriverManager.getDriver().findElement(By.xpath("(//i[@class='gk-icon-nav chevron-down-gray-md'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", provience);
		List<WebElement> allOptions = DriverManager.getDriver().findElements(By.xpath("//div[@class='gk-combobox__select-list expanded']//span[@class='gk-combobox__option-item']"));
		System.out.println(allOptions.size());                                           
		for(int i = 0; i<=allOptions.size()-1; i++) {
			if(allOptions.get(i).getText().contains(Prov)) {
				Thread.sleep(3000);
//				allOptions.get(i).click();
				JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
				jse.executeScript("arguments[0].click();", allOptions.get(i));	
				break;
			}   
		} 
		
		Thread.sleep(4000);

		WebElement city =DriverManager.getDriver().findElement(By.xpath("(//i[@class='gk-icon-nav chevron-down-gray-md'])[2]"));
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", city);
		List<WebElement> allOptions1 = DriverManager.getDriver().findElements(By.xpath("//div[@class='gk-combobox__select-list expanded']//span[@class='gk-combobox__option-item']"));
		System.out.println(allOptions1.size());                                           
		for(int i = 0; i<=allOptions1.size()-1; i++) {
			if(allOptions1.get(i).getText().contains(City)) {
				Thread.sleep(3000);
				JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
				jse.executeScript("arguments[0].click();", allOptions1.get(i));
				break;
			}   
		} 
		
		Thread.sleep(4000);

		WebElement barangay =DriverManager.getDriver().findElement(By.xpath("(//i[@class='gk-icon-nav chevron-down-gray-md'])[3]"));
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", barangay);
		List<WebElement> allOptions2 = DriverManager.getDriver().findElements(By.xpath("//div[@class='gk-combobox__select-list expanded']//span[@class='gk-combobox__option-item']"));
		System.out.println(allOptions2.size());                                           
		for(int i = 0; i<=allOptions2.size()-1; i++) {
			if(allOptions2.get(i).getText().contains(Brgy)) {
				Thread.sleep(3000);
//				allOptions2.get(i).click();
				JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
				jse.executeScript("arguments[0].click();", allOptions2.get(i));
				break;
			}   
		}   

		Thread.sleep(1000L);
		Custm.isElementExist("Submit", "submitButton", 10);
		Control.takeScreenshot();
		Custm.jsClick("Submit", "submitButton");
	}
	public void DuplicityPage() throws Exception {

		Otp.isElementExist("Duplicate order", "DuplicateOrder", 10);
		Otp.isElementExist("Plan Application", "PlanApplication", 10);
		Otp.isElementExist("Duplicate Confirm", "DuplicateConfirm", 10);
		System.out.println("this is duplicate order");
	}
	
	public static void WindowsZoomInOut(double Parcentage)throws Exception
	{

		String zoomParcentage = Double.toString(Parcentage/100);
		JavascriptExecutor executor = (JavascriptExecutor)DriverManager.getDriver();
		executor.executeScript("document.body.style.zoom = '"+zoomParcentage+"'");
		System.out.println("Windows Size Reduce to : "+Parcentage+" %");
	}

	// ************************************************************************************************//
	public void Gcashplan2499() throws Exception
	{
		Custm.isElementExist("tittle", "tittle", 10);
		Custm.isElementExist("change", "change", 10);

		JavascriptExecutor jsgetcode = (JavascriptExecutor) DriverManager.getDriver();
		jsgetcode.executeScript("arguments[0].click();", Custm.get_change());
		Thread.sleep(4000);

		Custm.isElementExist("Gcash", "Gcash", 10);
		Custm.isElementExist("Simonly", "Simonly", 10);
		Custm.isElementExist("device", "device", 10);
		Custm.isElementExist("alldata", "alldata", 10);

		JavascriptExecutor jsgcash = (JavascriptExecutor) DriverManager.getDriver();
		jsgcash.executeScript("arguments[0].click();", Custm.get_Gcash());

		Custm.isElementExist("plane2499", "plane2499", 10);
		JavascriptExecutor js2499 = (JavascriptExecutor) DriverManager.getDriver();
		js2499.executeScript("arguments[0].click();", Custm.get_plane2499());
		Custm.isElementExist("datapermonth", "datapermonth", 10);
		Custm.isElementExist("call", "call", 10);
		Custm.isElementExist("wifi", "wifi", 10);
		Custm.isElementExist("unlimited", "unlimited", 10);
		Custm.isElementExist("inclusiontypes", "inclusiontypes", 10);
		//Custm.isElementExist("plane2499", "plane2499", 10);


		Custm.isElementExist("selectplan", "selectplan", 10);
		JavascriptExecutor jsslectplan = (JavascriptExecutor) DriverManager.getDriver();
		jsslectplan.executeScript("arguments[0].click();", Custm.get_selectplan());






	}
	public void Gcashplanalldata2499() throws Exception
	{
		Custm.isElementExist("tittle", "tittle", 10);
		Custm.isElementExist("change", "change", 10);

		JavascriptExecutor jsgetcode = (JavascriptExecutor) DriverManager.getDriver();
		jsgetcode.executeScript("arguments[0].click();", Custm.get_change());
		Thread.sleep(4000);

		Custm.isElementExist("Gcash", "Gcash", 10);
		Custm.isElementExist("Simonly", "Simonly", 10);
		Custm.isElementExist("device", "device", 10);
		Custm.isElementExist("alldata", "alldata", 10);

		JavascriptExecutor jsgcash = (JavascriptExecutor) DriverManager.getDriver();
		jsgcash.executeScript("arguments[0].click();", Custm.get_alldata());

		Custm.isElementExist("plane2499", "plane2499", 10);
		JavascriptExecutor js2499 = (JavascriptExecutor) DriverManager.getDriver();
		js2499.executeScript("arguments[0].click();", Custm.get_planealldata2499());
		Custm.isElementExist("datapermonth", "datapermonth", 10);
		Custm.isElementExist("call", "call", 10);
		Custm.isElementExist("wifi", "wifi", 10);
		Custm.isElementExist("unlimited", "unlimited", 10);
		Custm.isElementExist("inclusiontypes", "inclusiontypes", 10);
		//Custm.isElementExist("plane2499", "plane2499", 10);


		Custm.isElementExist("selectplan", "selectplan", 10);
		JavascriptExecutor jsslectplan = (JavascriptExecutor) DriverManager.getDriver();
		jsslectplan.executeScript("arguments[0].click();", Custm.get_selectplan());






	}
	public void Gplanwithdevice2499() throws Exception
	{
		Custm.isElementExist("Customize plan tittle", "tittle", 10);
		Custm.isElementExist("change", "change", 10);

		JavascriptExecutor jsgetcode = (JavascriptExecutor) DriverManager.getDriver();
		jsgetcode.executeScript("arguments[0].click();", Custm.get_change());
		//		Thread.sleep(4000);
		//		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		//		js1.executeScript("arguments[0].click();", Custm.get_editmyplan());
		//		//		
		Custm.isElementExist("Gcash", "Gcash", 10);
		Custm.isElementExist("Simonly", "Simonly", 10);
		Custm.isElementExist("device", "device", 10);
		Custm.isElementExist("alldata", "alldata", 10);

		JavascriptExecutor jsgcash = (JavascriptExecutor) DriverManager.getDriver();
		jsgcash.executeScript("arguments[0].click();", Custm.get_device());
		LP.scroll_vertical(150);
		Custm.isElementExist("plane2499withdevice", "plane2499withdevice", 10);
		JavascriptExecutor js2499 = (JavascriptExecutor) DriverManager.getDriver();
		js2499.executeScript("arguments[0].click();", Custm.get_plane2499withdevice());
		Custm.isElementExist("datapermonth", "datapermonth", 10);
		Custm.isElementExist("call", "call", 10);
		Custm.isElementExist("wifi", "wifi", 10);
		Custm.isElementExist("unlimited", "unlimited", 10);
		Custm.isElementExist("inclusiontypes", "inclusiontypes", 10);
		//Custm.isElementExist("plane2499", "plane2499", 10);


		Custm.isElementExist("selectplan", "selectplan", 10);

		JavascriptExecutor jsslectplan = (JavascriptExecutor) DriverManager.getDriver();
		jsslectplan.executeScript("arguments[0].click();", Custm.get_selectplan());

		//		Custm.isElementExist("continuetheplan", "continuetheplan", 10);
		//		Custm.isElementExist("stayhere", "stayhere", 10);
		//		Custm.isElementExist("gopdgpage", "gopdgpage", 10);
		//
		//		JavascriptExecutor jspdp = (JavascriptExecutor) DriverManager.getDriver();
		//		jspdp.executeScript("arguments[0].click();", Custm.get_gopdgpage());





	}

	public void Gplanwithdevice2499recomanded() throws Exception
	{
		Custm.isElementExist("Customize plan tittle", "tittle", 10);
		Custm.isElementExist("change", "change", 10);
		Custm.jsClick("change", "change");


		Thread.sleep(4000);
		//Custm.jsClick("editmyplan", "editmyplan");

		Custm.isElementExist("Gcash", "Gcash", 10);
		Custm.isElementExist("Simonly", "Simonly", 10);
		Custm.isElementExist("device", "device", 10);
		Custm.isElementExist("alldata", "alldata", 10);

		Custm.jsClick("device", "device");

		LP.scroll_vertical(150);
		Custm.isElementExist("plane2499withdevice", "plane2499withdevice", 10);
		JavascriptExecutor js2499 = (JavascriptExecutor) DriverManager.getDriver();
		js2499.executeScript("arguments[0].click();", Custm.get_plane2499withdevice());
		Custm.isElementExist("datapermonth", "datapermonth", 10);
		Custm.isElementExist("call", "call", 10);
		Custm.isElementExist("wifi", "wifi", 10);
		Custm.isElementExist("unlimited", "unlimited", 10);
		Custm.isElementExist("inclusiontypes", "inclusiontypes", 10);



		Custm.isElementExist("selectplan", "selectplan", 10);

		JavascriptExecutor jsslectplan = (JavascriptExecutor) DriverManager.getDriver();
		jsslectplan.executeScript("arguments[0].click();", Custm.get_selectplan());

		//		Custm.isElementExist("continuetheplan", "continuetheplan", 10);
		//		Custm.isElementExist("stayhere", "stayhere", 10);
		//		Custm.isElementExist("gopdgpage", "gopdgpage", 10);
		//		
		//		JavascriptExecutor jspdp = (JavascriptExecutor) DriverManager.getDriver();
		//		jspdp.executeScript("arguments[0].click();", Custm.get_gopdgpage());
		//		
		//		

	}

	public void planChangeInCustomizePage(String planChange, String PlanName) throws Exception {

		Custm.isElementExist("change", "change", 10);
		Custm.jsClick("change", "change");
		
		Custm.isElementExist("ChooseYourPlan", "ChooseYourPlan", 10);
		Custm.isElementExist("iIcon", "iIcon", 10);
		Custm.moveToElement("iIcon");
		Control.takeScreenshot();
		//Custm.isElementExist("Gcash", "Gcash", 10);
		Custm.isElementExist("Simonly", "Simonly", 10);
		Custm.isElementExist("device", "device", 10);
		//Custm.isElementExist("alldata", "alldata", 10);
		switch (planChange) {
		case "Gcash":
			Custm.jsClick("Gcash", "Gcash");
			break;
		case "device":
			Custm.jsClick("device", "device");
			break;
		case "alldata":
			Custm.jsClick("alldata", "alldata");
			break;
		default :
			System.out.println("Given  CORRECT CTB BUTTON");
		}
		Control.captureScreenshot();
		WebElement plan=DriverManager.getDriver().findElement(By.xpath("//div[normalize-space(text())='GPlan "+PlanName+"']"));
		plan.click();
		Custm.isElementExist("selectplan", "selectplan", 10);
		Custm.jsClick("selectplan", "selectplan");
		Thread.sleep(4000);
		plan.isDisplayed();

	}

	public void customizePlan() throws Exception {
		System.out.println("****************customizePlan************************");
		if(Custm.isElementExist("Customize Plan Text","customizePlan", 60)) {
			System.out.println("We are in Customize Plan Page");
		}
		Custm.isElementExist("change button","change", 10);
		Custm.isElementExist("Change Link For Plans","changeLinkForPlans", 10);
		Custm.isElementExist("Gplan plan type","gplan599WithDevice", 10);		
		if(Custm.isElementExist("Right side planetype","secondplantype", 10))
		{
			String Rightsideplanetype = Custm.get_secondplantype().getText();
			System.out.println("all_AccessData details of the device:"+Rightsideplanetype);
		}

		if(Custm.isElementExist("all_AccessData","all_AccessData", 10)) {
			String all_AccessData = Custm.get_all_AccessData().getText();
			System.out.println("all_AccessData details of the device:"+all_AccessData);
		}

		if(Custm.isElementExist("GoWifi_Access","GoWifi_Access", 10)) {
			String GoWifi_Access = Custm.get_GoWifi_Access().getText();
			System.out.println("GoWifi_Access details of the device:"+GoWifi_Access);
		}

		if(Custm.isElementExist("Contract_duration","Contract_duration", 10)) {
			String Contract_duration = Custm.get_Contract_duration().getText();
			System.out.println("Contract_duration details of the device:"+Contract_duration);
		}

		if(Custm.isElementExist("Call_and_text","Call_and_text", 10))
		{
			String Call_and_text = Custm.get_Call_and_text().getText();
			System.out.println("Call_and_text details of the device:"+Call_and_text);
		}

		if(Custm.isElementExist("Choose Your Phone","chooseYourPhone", 10))
		{

			String device_Name = Custm.get_deviceName().getText();
			System.out.println("Device Selcted:"+device_Name);
			Custm.isElementExist("Device Details Text","deviceDetails", 10);

			if(Custm.isElementExist("specifications Text","specifications", 10))
			{			
				String specifications = Custm.get_specifications().getText();
				System.out.println("Screen Size of the device:"+specifications);
			}		

			Custm.isElementExist("Hide Details link","hideDetails", 10);
			Custm.isElementExist("Show More Devices Button","showMoreDevices", 10);				
			Custm.isElementExist("chooseContractDuration","chooseContractDuration", 10);//need 
			Custm.isElementExist("chooseYourColor","chooseYourColor", 10);//need
			Custm.isElementExist("deviceColors","deviceColors", 10);//need
			if(Custm.isElementExist("chooseStorageCapacity","chooseStorageCapacity", 10)) {//need
				String StorageCapacity = Custm.get_chooseStorageCapacity().getText();
				System.out.println("Storage Capacity details of the device:"+StorageCapacity);
			}

			if(Custm.isElementExist("Prefer eSIM Or Physical SIMCard","PrefereSIMOrPhysicalSIMCard", 10)) {
				Custm.jsClick("physicalSimCard", "physicalSimCard");
			}
		}

		Custm.isElementExist("Pick Your Add_ons Text","pickYourAdd_ons", 10);
		Custm.isElementExist("Add_ons_Go_On_TopOfYour_Month Text","add_ons_Go_On_TopOfYour_Month", 10);

		if(Custm.isElementExist("Do_you_use_lots_of_data","Do_you_use_lots_of_data", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Do_you_use_lots_of_data());
			Thread.sleep(3000);
			Custm.jsClick("Do_you_use_lots_of_data", "Do_you_use_lots_of_data");
			Custm.jsClick("GS_Add_Surf_99", "GS_Add_Surf_99");
		}

		if(Custm.isElementExist("Do_you_love_watching_shows_and_movies","Do_you_love_watching_shows_and_movies", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Do_you_love_watching_shows_and_movies());
			Thread.sleep(3000);
			Custm.jsClick("Amazon_Prime_Video", "Amazon_Prime_Video");
			Custm.jsClick("Viu_Premium", "Viu_Premium");
		}

		if(Custm.isElementExist("Prefer_talking_over_messaging","Prefer_talking_over_messaging", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Prefer_talking_over_messaging());
			Thread.sleep(3000);
			Custm.jsClick("My_Super_Duo", "My_Super_Duo");
		}

		if(Custm.isElementExist("Are_you_all_about_the_jet_setting_lifestyle","Are_you_all_about_the_jet_setting_lifestyle", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Are_you_all_about_the_jet_setting_lifestyle());
			Thread.sleep(3000);
			Custm.jsClick("Easy_Roam", "Easy_Roam");
			Custm.jsClick("GOCALLIDD_199", "GOCALLIDD_199");
		}

		if(Custm.isElementExist("Shipping Address Text","shiipindaddress", 10))
		{
			String shippingAddress = Custm.get_shippingaddressvalue().getText();
			System.out.println("Screen Size of the device:"+shippingAddress);
		}
		Custm.isElementExist("Change Link For Address Text","changeLinkForAddress", 10);//need
	}
	public void customizePlanValidationinsuffiecentchange() throws Exception {

		System.out.println("****************customizePlan************************");
		if(Custm.isElementExist("Customize Plan Text","customizePlan", 10)) {
			System.out.println("We are in Customize Plan Page");
		}
		Custm.isElementExist("change button","change", 10);
		Control.captureScreenshot();
		planChangeInCustomizePage("device","599 with Device");
		Custm.isElementExist("Change Link For Plans","changeLinkForPlans", 10);
		Custm.isElementExist("Gplan plan type","gplan599WithDevice", 10);		
		if(Custm.isElementExist("Right side planetype","secondplantype", 10))
		{
			String Rightsideplanetype = Custm.get_secondplantype().getText();
			System.out.println("all_AccessData details of the device:"+Rightsideplanetype);
		}

		if(Custm.isElementExist("all_AccessData","all_AccessData", 10)) {
			String all_AccessData = Custm.get_all_AccessData().getText();
			System.out.println("all_AccessData details of the device:"+all_AccessData);
		}

		if(Custm.isElementExist("GoWifi_Access","GoWifi_Access", 10)) {
			String GoWifi_Access = Custm.get_GoWifi_Access().getText();
			System.out.println("GoWifi_Access details of the device:"+GoWifi_Access);
		}

		if(Custm.isElementExist("Contract_duration","Contract_duration", 10)) {
			String Contract_duration = Custm.get_Contract_duration().getText();
			System.out.println("Contract_duration details of the device:"+Contract_duration);
		}

		if(Custm.isElementExist("Call_and_text","Call_and_text", 10))
		{
			String Call_and_text = Custm.get_Call_and_text().getText();
			System.out.println("Call_and_text details of the device:"+Call_and_text);
		}


		Custm.javascript_clickOnElement(Custm.get_showmoredevices());

		searchingDeviceInCustomPage("Apple iPhone 11");

		if(Custm.isElementExist("Choose Your Phone","chooseYourPhone", 10))
		{

			String device_Name = Custm.get_deviceName().getText();
			System.out.println("Device Selcted:"+device_Name);
			Custm.isElementExist("Device Details Text","deviceDetails", 10);

			if(Custm.isElementExist("specifications Text","specifications", 10))
			{			
				String specifications = Custm.get_specifications().getText();
				System.out.println("Screen Size of the device:"+specifications);
			}		

			Custm.isElementExist("Hide Details link","hideDetails", 10);
			Custm.isElementExist("Show More Devices Button","showMoreDevices", 10);	




			//label[text()=' eSim ']


			Custm.isElementExist("chooseContractDuration","chooseContractDuration", 10);//need 
			Custm.isElementExist("chooseYourColor","chooseYourColor", 10);//need
			Custm.isElementExist("deviceColors","deviceColors", 10);//need
			if(Custm.isElementExist("chooseStorageCapacity","chooseStorageCapacity", 10)) {//need
				String StorageCapacity = Custm.get_chooseStorageCapacity().getText();
				System.out.println("Storage Capacity details of the device:"+StorageCapacity);
			}


			if(Custm.isElementExist("Prefer eSIM Or Physical SIMCard","PrefereSIMOrPhysicalSIMCard", 10)) {
				Custm.jsClick("physicalSimCard", "physicalSimCard");
			}
			Custm.isElementExist("ESIMIMG", "ESIMIMG", 10);

			Custm.isElementExist("esimmmm in inclustion", "esimmmm", 10);
		}
		Control.captureScreenshot();
		Custm.isElementExist("Pick Your Add_ons Text","pickYourAdd_ons", 10);
		Custm.isElementExist("Add_ons_Go_On_TopOfYour_Month Text","add_ons_Go_On_TopOfYour_Month", 10);

		if(Custm.isElementExist("Do_you_use_lots_of_data","Do_you_use_lots_of_data", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Do_you_use_lots_of_data());
			Thread.sleep(3000);
			Custm.jsClick("Do_you_use_lots_of_data", "Do_you_use_lots_of_data");
			Custm.jsClick("GS_Add_Surf_99", "GS_Add_Surf_99");
		}

		if(Custm.isElementExist("Do_you_love_watching_shows_and_movies","Do_you_love_watching_shows_and_movies", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Do_you_love_watching_shows_and_movies());
			Thread.sleep(3000);
			Custm.jsClick("Do_you_love_watching_shows_and_movies", "Do_you_love_watching_shows_and_movies");
			Custm.jsClick("Amazon_Prime_Video", "Amazon_Prime_Video");
			Custm.jsClick("Viu_Premium", "Viu_Premium");
		}

		if(Custm.isElementExist("Prefer_talking_over_messaging","Prefer_talking_over_messaging", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Prefer_talking_over_messaging());
			Thread.sleep(3000);
			Custm.jsClick("Prefer_talking_over_messaging", "Prefer_talking_over_messaging");
			Custm.jsClick("My_Super_Duo", "My_Super_Duo");
		}

		if(Custm.isElementExist("Are_you_all_about_the_jet_setting_lifestyle","Are_you_all_about_the_jet_setting_lifestyle", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Are_you_all_about_the_jet_setting_lifestyle());
			Thread.sleep(3000);
			Custm.jsClick("Are_you_all_about_the_jet_setting_lifestyle", "Are_you_all_about_the_jet_setting_lifestyle");
			Custm.jsClick("Easy_Roam", "Easy_Roam");
			Custm.jsClick("GOCALLIDD_199", "GOCALLIDD_199");
		}

		if(Custm.isElementExist("Shipping Address Text","shiipindaddress", 10))
		{
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_shippingaddressvalue());
			String shippingAddress = Custm.get_shippingaddressvalue().getText();
			System.out.println("Screen Size of the device:"+shippingAddress);
		}
		Custm.isElementExist("Change Link For Address Text","changeLinkForAddress", 10);//need

		Control.captureScreenshot();

	}

	//
	public void customizePlanwithdevice(String palnchange,String Devicechange,String esim,String Deviceplan,String Plancardvalue, String DeviceName,String PlanValue) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("****************customizePlan************************");
		if(Custm.isElementExist("Customize Plan Text","customizePlan", 50)) {
			System.out.println("We are in Customize Plan Page");
		}
		Control.captureScreenshot();
		
		Custm.isElementExist("change button","change", 10);
		if(palnchange.equalsIgnoreCase("palnchange"))
		{
			planChangeInCustomizePage(Plancardvalue,PlanValue);
		}
		Custm.isElementExist("Gplan plan type","gplan599WithDevice", 10);
		if(Custm.isElementExist("Right side planetype","secondplantype", 10))
		{
			String Rightsideplanetype = Custm.get_secondplantype().getText();
			System.out.println("all_AccessData details of the device:"+Rightsideplanetype);
		}

		if(Custm.isElementExist("all_AccessData","all_AccessData", 10)) {
			String all_AccessData = Custm.get_all_AccessData().getText();
			System.out.println("all_AccessData details of the device:"+all_AccessData);
		}

//		if(Custm.isElementExist("GoWifi_Access","GoWifi_Access", 10)) {
//			String GoWifi_Access = Custm.get_GoWifi_Access().getText();
//			System.out.println("GoWifi_Access details of the device:"+GoWifi_Access);
//		}

		if(Custm.isElementExist("Contract_duration","Contract_duration", 10)) {
			String Contract_duration = Custm.get_Contract_duration().getText();
			System.out.println("Contract_duration details of the device:"+Contract_duration);
		}

		if(Custm.isElementExist("Call_and_text","Call_and_text", 10))
		{
			String Call_and_text = Custm.get_Call_and_text().getText();
			System.out.println("Call_and_text details of the device:"+Call_and_text);
		}



		if(Deviceplan.equalsIgnoreCase("DeviceRelateddetails"))
		{
			Custm.isElementExist("Choose Your Phone","chooseYourPhone", 10);

			if(Devicechange.equalsIgnoreCase("Devicechange"))
			{
				Custm.jsClick("showmoredevices", "showmoredevices");

				searchingDeviceInCustomPage(DeviceName);
			}

			String device_Name = Custm.get_deviceName().getText();
			System.out.println("Device Selcted:"+device_Name);
			Custm.isElementExist("Device Details Text","deviceDetails", 10);

			if(Custm.isElementExist("specifications Text","specifications", 10))
			{

				String specifications = Custm.get_specifications().getText();
				System.out.println("Screen Size of the device:"+specifications);
			}	

			Custm.isElementExist("Hide Details link","hideDetails", 10);
			Custm.isElementExist("Show More Devices Button","showMoreDevices", 10);	




			//label[text()=' eSim ']
			if(esim.equalsIgnoreCase("esim"))
			{
				((JavascriptExecutor) DriverManager.getDriver()).executeScript(
						"arguments[0].scrollIntoView(true);", Custm.get_physicalSimCard());
				Custm.isElementExist("Prefer eSIM Or Physical SIMCard","PrefereSIMOrPhysicalSIMCard", 10);

				Custm.jsClick("EsimCard", "physicalSimCard");

				Custm.isElementExist("ESIMIMG", "ESIMIMG", 10);

//				Custm.isElementExist("esimmmm in inclustion", "esimmmm", 10);
				Custm.isElementExist("esimmmm in inclustion", "EsimInfo", 10);
				Custm.isElementExist("esimmmm in inclustion", "PhysicalSIMInfo", 10);

				Control.takeScreenshot();
			}
		}

//		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", Custm.get_chooseStorageCapacity());
		Custm.isElementExist("chooseContractDuration","chooseContractDuration", 10);//need 
		Custm.isElementExist("chooseYourColor","chooseYourColor", 10);//need
//		Custm.isElementExist("deviceColors","deviceColors", 10);//need
		int colors=DriverManager.getDriver().findElements(By.xpath("//input[@class='gk-color-selector__radio']")).size();
		System.out.println(colors);
		if(Custm.isElementExist("chooseStorageCapacity","chooseStorageCapacity", 10)) {//need
			String StorageCapacity = Custm.get_chooseStorageCapacity().getText();
			System.out.println("Storage Capacity details of the device:"+StorageCapacity);
			Control.takeScreenshot();
		}




		Custm.isElementExist("Pick Your Add_ons Text","pickYourAdd_ons", 10);
		Custm.isElementExist("Add_ons_Go_On_TopOfYour_Month Text","add_ons_Go_On_TopOfYour_Month", 10);

		if(Custm.isElementExist("Do_you_use_lots_of_data","Do_you_use_lots_of_data", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Do_you_use_lots_of_data());
			Thread.sleep(3000);
			Custm.jsClick("Do_you_use_lots_of_data", "Do_you_use_lots_of_data");
			Custm.jsClick("GS_Add_Surf_99", "GS_Add_Surf_99");
			Control.takeScreenshot();
		}

		if(Custm.isElementExist("Do_you_love_watching_shows_and_movies","Do_you_love_watching_shows_and_movies", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Do_you_love_watching_shows_and_movies());
			Thread.sleep(3000);
			Custm.jsClick("Do_you_love_watching_shows_and_movies", "Do_you_love_watching_shows_and_movies");
			Custm.jsClick("Amazon_Prime_Video", "Amazon_Prime_Video");
			Custm.jsClick("Viu_Premium", "Viu_Premium");
			Control.takeScreenshot();
		}

//		if(Custm.isElementExist("Prefer_talking_over_messaging","Prefer_talking_over_messaging", 10)) {
//			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
//					"arguments[0].scrollIntoView(true);", Custm.get_Prefer_talking_over_messaging());
//			Thread.sleep(3000);
//			Custm.jsClick("Prefer_talking_over_messaging", "Prefer_talking_over_messaging");
//			Custm.jsClick("MyDuo", "MyDuo");
//			Control.takeScreenshot();
//		}

		if(Custm.isElementExist("Are_you_all_about_the_jet_setting_lifestyle","Are_you_all_about_the_jet_setting_lifestyle", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Are_you_all_about_the_jet_setting_lifestyle());
			Thread.sleep(3000);
			Custm.jsClick("Are_you_all_about_the_jet_setting_lifestyle", "Are_you_all_about_the_jet_setting_lifestyle");
			Custm.jsClick("Easy_Roam", "Easy_Roam");
			Custm.jsClick("GOCALLIDD_199", "GOCALLIDD_199");
			Control.takeScreenshot();
		}

		if(Custm.isElementExist("Shipping Address Text","shiipindaddress", 10))
		{
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_shippingaddressvalue());
			String shippingAddress = Custm.get_shippingaddressvalue().getText();
			System.out.println("Screen Size of the device:"+shippingAddress);
		}
		Custm.isElementExist("Change Link For Address Text","changeLinkForAddress", 10);//need



	}
	public void searchingDeviceInCustomPage(String device) throws Exception {

		System.out.println("Searching for " + device);
//		Custm.get_searching_field().sendKeys(device);
		Custm.enterText("searching_field","searching_field",device);
		Thread.sleep(8000);
		Control.takeScreenshot();
//		Custm.get_searching_field().sendKeys(Keys.ENTER);
		//		if (DriverManager.getDriver()
		//				.findElement(By.xpath("//div[text()='" + device + "']"))
		//				.isDisplayed()) {
		//			System.out.println("Able to display searched device:"+device);
		//		}
		//Thread.sleep(1000);
		//Custm.moveToElement("Selecteddevice");
		Custm.jsClick("Selecteddevice", "Selecteddevice");
		Custm.jsClick("selectButton", "selectButton");
	}
	
	

	public void payPageValidation(String planType,String payType,String promoinput,String viewBreakdown,String esim, String NameofDevice, String PTF, String OB) throws Exception {
		//need to check
		
		if(PayP.isElementExist("payText","payText", 30)) {
			System.out.println("*********************We are in payment page***********************");		
		}

		if(planType.equalsIgnoreCase("Device")) {
			PayP.isElementExist("howWouldYouLikeToPay","howWouldYouLikeToPay", 10);
			PayP.isElementExist("chargeToBill","chargeToBill", 10);
			PayP.isElementExist("OneTimePayment","OneTimePayment", 10);
			//PayP.jsClick("OneTimePayment", "OneTimePayment");
			switch (payType) {
			case "chargeToBill":
				PayP.jsClick("chargeToBill", "chargeToBill");
				break;
			case "OneTimePayment":
				PayP.jsClick("OneTimePayment", "OneTimePayment");
				break;

			default :
				System.out.println("how Would You Like To Pay METHOD");
			} 
			
			Control.takeScreenshot();

			if(PayP.isElementExist("defaultshippingAddress","defaultshippingAddress", 10)) {
				((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", PayP.get_defaultshippingAddress());
                 Thread.sleep(3000);
                 Control.takeScreenshot();
				String shippingAddress = PayP.get_defaultshippingAddress().getText();
				System.out.println("Default shipping address:"+shippingAddress); 
				Constant.dataMap.get().put("ShippingAddress",shippingAddress); 

				Constant.dataMap.get().put("Magento_AddressInformation",shippingAddress);

			}
			((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", PayP.get_OneTimePayment());
	        Thread.sleep(3000);

		}

		PayP.isElementExist("planType","planType", 10);
		PayP.isElementExist("Change Link for plans & addons","ChangeLink", 10);
		PayP.isElementExist("AllAccessData","AllAccessData", 10);
		//PayP.isElementExist("GoWifiAccess","GoWifiAccess", 10);
		PayP.isElementExist("Call_Text","Call_Text", 10);
		PayP.isElementExist("ContractDuration","ContractDuration", 10);

		//inclusions
		if(PayP.isElementExist("Inclusions Text","Inclusions", 10))
		{
           // PayP.isElementExist("KonsultaMD","KonsultaMD", 10);
//			PayP.isElementExist("VIPAccessToiQIYI","VIPAccessToiQIYI", 10);
//			PayP.isElementExist("VIPAccessToWeTV","VIPAccessToWeTV", 10);
            if(esim.equalsIgnoreCase("esim")) {
			   PayP.isElementExist("esim","esim", 10);
            }   
		}
		Control.captureScreenshot();
		//AddonsAndSubscriptions
		if(PayP.isElementExist("Addons And Subscriptions Text","AddonsAndSubscriptions", 10)) {
			PayP.isElementExist("GSAddSurf","GSAddSurf", 10);
			PayP.isElementExist("AmazonPrimeVideo","AmazonPrimeVideo", 10);
			PayP.isElementExist("ViuPremium","VIUPremiumAddon", 10);
			
			PayP.isElementExist("EasyRoam","EasyRoamAddon", 10);
			PayP.isElementExist("GOCALLIDD","GOCALLIDDP", 10);
			PayP.isElementExist("Change Link For Address","ChangeLinkForAddress", 10);
		}


		//need to check
		PayP.isElementExist("OrderSummary","OrderSummary", 10);
		PayP.isElementExist("This Is What Your Monthly Bill Will Look Like Text","thisIsWhatYourMonthlyBillWillLookLike", 10);
		/////////////////////////////////////////////////////////////////////////////////
		if(PayP.isElementExist("showBreakdown","showBreakdown", 10)) {
			PayP.jsClick("showBreakdown", "showBreakdown");
		}


       
		if(PayP.isElementExist("palntypepay","palntypepay", 10)) {
			String palntypepay = PayP.get_palntypepay().getText();
			System.out.println("palntypepay: "+palntypepay);  		
		}
		if(PayP.isElementExist("GSADDPAY","GSADDPAY", 10)) {
			String GSADDPAY = PayP.get_GSADDPAY().getText();
			System.out.println("GSADDPAY Fee: "+GSADDPAY);  		
		}
		if(PayP.isElementExist("APVPAY","APVPAY", 10)) {
			String APVPAY = PayP.get_APVPAY().getText();
			System.out.println("APVPAY Fee: "+APVPAY);  		
		}
		if(PayP.isElementExist("VIU","VIU", 10)) {
			String VIU = PayP.get_VIU().getText();
			System.out.println("VIU Fee: "+VIU);  		
		}
//		if(PayP.isElementExist("myDuo","myDuo", 10)) {
//			String Musuperduo = PayP.get_myDuo().getText();
//			System.out.println("myDuo Fee: "+Musuperduo);  		
//		}
		if(PayP.isElementExist("EseyRoam","EseyRoam", 10)) {
			String EseyRoam = PayP.get_EseyRoam().getText();
			System.out.println("EseyRoam Fee: "+EseyRoam);  		
		}
		if(PayP.isElementExist("Gloicod","Gloicod", 10)) {
			String Gloicod = PayP.get_Gloicod().getText();
			System.out.println("Gloicod Fee: "+Gloicod);  		
		}
		if(planType.equalsIgnoreCase("Device")&& payType.equalsIgnoreCase("CTB")) {
			if(PayP.isElementExist("shippingFee","shippingFee", 10)) {
				String shippingFee = PayP.get_shippingFee().getText();
				System.out.println("Shipping Fee: "+shippingFee);  		
			}
		}		

		if(PayP.isElementExist("monthlyBill","monthlyBill", 10)) {
			String monthlyBill = PayP.get_monthlyBill().getText();
			System.out.println("monthlyBill: "+monthlyBill);  		
		}
		Control.captureScreenshot();
		if(planType.equalsIgnoreCase("Device")&& payType.equalsIgnoreCase("CTB")) {
	        WebElement deviceName=DriverManager.getDriver().findElement(By.xpath("//span[text()=' Hide breakdown ']//following::span[normalize-space(text())='"+NameofDevice+"']//following::span[3]"));
	        deviceName.isDisplayed();
		}
		if(PayP.isElementExist("hideBreakdown","hideBreakdown", 10)) {
			PayP.jsClick("hideBreakdown", "hideBreakdown");
		}
		/////////////////////////////////////////////////////////////////////////////////////

		if(promoinput.equalsIgnoreCase("promoinput"))
		{
			if(PayP.isElementExist("promoinput","promoinput", 10))
			{
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", PayP.get_promoinput());
				PayP.get_promoinput().sendKeys("100offDevice");
			    //Renewal_100");
				System.out.println("Promocode: :" + "\n" +PayP.get_promoinput().getAttribute("value"));
				JavascriptExecutor j5 = (JavascriptExecutor) DriverManager.getDriver();
				j5.executeScript("arguments[0].click();", PayP.get_promoapply());

			}
		}
		if(viewBreakdown.equalsIgnoreCase("viewBreakdown"))
		{
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", PayP.get_viewBreakdown());
			Thread.sleep(5000);
			if(PayP.isElementExist("viewBreakdown","viewBreakdown", 10)) {
				PayP.jsClick("viewBreakdown", "viewBreakdown");
			}
			Control.captureScreenshot();
			//PayP.isElementExist("ThisIsWhatYouPayNow","ThisIsWhatYouPayNow", 10);
			if(OB.equalsIgnoreCase("OB")) {
				PayP.isElementExist("overdue","overdue", 10);	
				PayP.isElementExist("TotalFromUnpaidBills","TotalFromUnpaidBills", 10);
				PayP.isElementExist("unpaidBillStatement","unpaidBillStatement", 10);
				PayP.isElementExist("MobileNumber","MobileNumber", 10);
				if(PayP.isElementExist("OverdueBalnce","OverdueBalnce", 10)) {//need to 
					((JavascriptExecutor) DriverManager.getDriver()).executeScript(
							"arguments[0].scrollIntoView(true);", PayP.get_OverdueBalnce());
					String OverdueBalnce = PayP.get_OverdueBalnce().getText();
					System.out.println("OverdueBalnce Selected: "+OverdueBalnce);  		
				}
			}	
			
			if(PTF.equalsIgnoreCase("PTF")) {
				PayP.isElementExist("preterminationFee","preterminationFee", 10);
				PayP.isElementExist("RenewingPlanBefore","RenewingPlanBefore", 10);
			
				if(PayP.isElementExist("UnpaidMonthlyBill","UnpaidMonthlyBill", 10)) {
					String unpaidBilling = PayP.get_UnpaidMonthlyBill().getText();
					System.out.println("Shipping: "+unpaidBilling);       	  	
				}
				
				if(PayP.isElementExist("GadgetPenalityFee","GadgetPenalityFee", 10)) {
					String GadgetPenalityFee = PayP.get_GadgetPenalityFee().getText();
					System.out.println("Shipping: "+GadgetPenalityFee);       	  	
				}
				
				if(PayP.isElementExist("AdminFee","AdminFee", 10)) {
					String AdminFee = PayP.get_AdminFee().getText();
					System.out.println("Shipping: "+AdminFee);       	  	
				}
				
	
				if(PayP.isElementExist("pretermination","pretermination", 10)) {//need to 
					((JavascriptExecutor) DriverManager.getDriver()).executeScript(
							"arguments[0].scrollIntoView(true);", PayP.get_pretermination());
					String pretermination = PayP.get_pretermination().getText();
					System.out.println("pretermination fee: "+pretermination); 
				}
			}	
			
			if(planType.equalsIgnoreCase("Device")&& payType.equalsIgnoreCase("OneTimePayment")) {
		        WebElement deviceName=DriverManager.getDriver().findElement(By.xpath("(//span[contains(normalize-space(text()),'"+NameofDevice+"')])[1]"));
		        deviceName.isDisplayed();
		    	String deviceSelected = deviceName.getText();
				System.out.println("Device Selected: "+deviceSelected); 
				Constant.dataMap.get().put("ProductName",deviceSelected);
				
			    
	            WebElement costOfDevice= DriverManager.getDriver().findElement(By.xpath("(//span[text()=' Hide breakdown ']//following::div[1]//span)[3]"));			
				String deviceCost = costOfDevice.getText();
				System.out.println("Cost Of Device: "+deviceCost);  	
//				
			   // PayP.isElementExist("DeviceCost", "DeviceCost", 10);

			    
				if(PayP.isElementExist("Shipping","Shipping", 10)) {
					String Shipping = PayP.get_Shipping().getText();
					System.out.println("Shipping: "+Shipping);       	  	
				}
			    
//			    if(PayP.isElementExist("TotalDeviceCost","TotalDeviceCost", 10)) {
//					String TotaldeviceCost = PayP.get_TotalDeviceCost().getText();
//					System.out.println("Shipping: "+TotaldeviceCost);       	  	
//				}
//				if(PayP.isElementExist("promocodeapply", "promocodeapply", 10))
//				{
//					String promocodeapply=PayP.get_promocodeapply().getText();
//					System.out.println("promocodeapply:"+promocodeapply);
//	
//				}
//				if(PayP.isElementExist("promocodediscount", "promocodediscount", 10))
//				{
//					String promocodediscount=PayP.get_promocodediscount().getText();
//					System.out.println("promocodediscount:"+promocodediscount);
//	
//				}
			}		


			if(PayP.isElementExist("totalAmountToPay","totalAmountToPay", 10)) {//need
				String totalAmountToPay = PayP.get_totalAmountToPay().getText();
				System.out.println("Total Amount To Pay: "+totalAmountToPay);
				Constant.dataMap.get().put("AmountPaid",totalAmountToPay);
			}
		}



		/*******************************************************************************/
		/*if(PayP.isElementExist("payText","payText", 10)) {
			System.out.println("*********************We are in payment page***********************");		
		}

		PayP.isElementExist("howWouldYouLikeToPay","howWouldYouLikeToPay", 10);
		PayP.isElementExist("chargeToBill","chargeToBill", 10);
		PayP.isElementExist("OneTimePayment","OneTimePayment", 10);
		PayP.jsClick("OneTimePayment", "OneTimePayment");
		PayP.isElementExist("Installment Is Available Only For Selected CreditCards","installmentIsAvailableOnlyFoSelectCreditCards", 10);
		PayP.isElementExist("Supporting Document Needed please prepare your POFC","supportingDocumentNeeded", 10);

		PayP.isElementExist("planType","planType", 10);
		PayP.isElementExist("Change Link for plans & addons","ChangeLink", 10);
		PayP.isElementExist("AllAccessData","AllAccessData", 10);
		PayP.isElementExist("GoWifiAccess","GoWifiAccess", 10);
		PayP.isElementExist("Call_Text","Call_Text", 10);
		PayP.isElementExist("ContractDuration","ContractDuration", 10);

		PayP.isElementExist("esim","esim", 10);

		//inclusions
		PayP.isElementExist("Inclusions Text","Inclusions", 10);
		PayP.isElementExist("KonsultaMD","KonsultaMD", 10);
		PayP.isElementExist("VIPAccessToiQIYI","VIPAccessToiQIYI", 10);
		PayP.isElementExist("VIPAccessToWeTV","VIPAccessToWeTV", 10);


		//AddonsAndSubscriptions
		PayP.isElementExist("Addons And Subscriptions Text","AddonsAndSubscriptions", 10);
		PayP.isElementExist("GSAddSurf","GSAddSurf", 10);
		PayP.isElementExist("AmazonPrimeVideo","AmazonPrimeVideo", 10);
		PayP.isElementExist("ViuPremium","ViuPremium", 10);
		PayP.isElementExist("myDuo","myDuo", 10);
		PayP.isElementExist("EasyRoam","EasyRoam", 10);
		//PayP.isElementExist("GOCALLIDD","GOCALLIDD", 10);
		PayP.isElementExist("Change Link For Address","ChangeLinkForAddress", 10);

		if(PayP.isElementExist("defaultshippingAddress","defaultshippingAddress", 10)) {
			String shippingAddress = PayP.get_defaultshippingAddress().getText();
			System.out.println("Default shipping address:"+shippingAddress); 
			Constant.dataMap.get().put("ShippingAddress",shippingAddress); 

			Constant.dataMap.get().put("Magento_AddressInformation",shippingAddress);

		}


		PayP.isElementExist("This Is What Your Monthly Bill Will Look Like Text","thisIsWhatYourMonthlyBillWillLookLike", 10);

		if(PayP.isElementExist("showBreakdown","showBreakdown", 10)) {
			PayP.jsClick("showBreakdown", "showBreakdown");
		}

		if(PayP.isElementExist("shippingFee","shippingFee", 10)) {
			String shippingFee = PayP.get_shippingFee().getText();
			System.out.println("Shipping Fee: "+shippingFee);  		
		}

		if(PayP.isElementExist("monthlyBill","monthlyBill", 10)) {
			String monthlyBill = PayP.get_monthlyBill().getText();
			System.out.println("monthlyBill: "+monthlyBill);  		
		}

		if(PayP.isElementExist("hideBreakdown","hideBreakdown", 10)) {
			PayP.jsClick("hideBreakdown", "hideBreakdown");
		}

		PayP.isElementExist("This Is What Your Monthly Bill Will Look Like Text","thisIsWhatYourMonthlyBillWillLookLike", 10);

		if(PayP.isElementExist("promoinput","promoinput", 10))
		{
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].click();", PayP.get_promoinput());
            PayP.get_promoinput().sendKeys("DDEVICE20");
            System.out.println("Promocode: :" + "\n" +PayP.get_promoinput().getAttribute("value"));
            JavascriptExecutor j5 = (JavascriptExecutor) DriverManager.getDriver();
            j5.executeScript("arguments[0].click();", PayP.get_promoapply());

		}

		if(PayP.isElementExist("viewBreakdown","viewBreakdown", 10)) {
			PayP.jsClick("viewBreakdown", "viewBreakdown");
		}

//		if(PayP.isElementExist("deviceSelected","deviceSelected", 10)) {
//			String deviceSelected = PayP.get_deviceSelected().getText();
//			System.out.println("Device Selected: "+deviceSelected);  		
//		}

		if(PayP.isElementExist("costOfDevice","costOfDevice", 10)) {
			String costOfDevice = PayP.get_costOfDevice().getText();
			System.out.println("Cost Of Device: "+costOfDevice);  		
		}

		if(PayP.isElementExist("Shipping","Shipping", 10)) {
			String Shipping = PayP.get_Shipping().getText();
			System.out.println("Shipping: "+Shipping);       	  	
		}
		if(PayP.isElementExist("promocodeapply", "promocodeapply", 10))
		{
			String promocodeapply=PayP.get_promocodeapply().getText();
			System.out.println("promocodeapply:"+promocodeapply);

		}
		if(PayP.isElementExist("promocodediscount", "promocodediscount", 10))
		{
			String promocodediscount=PayP.get_promocodediscount().getText();
			System.out.println("promocodediscount:"+promocodediscount);

		}

		if(PayP.isElementExist("totalAmountToPay","totalAmountToPay", 10)) {
			String totalAmountToPay = PayP.get_totalAmountToPay().getText();
			System.out.println("Total Amount To Pay: "+totalAmountToPay);       	  	
		}*/
	}
	public void payPageValidation(String CTB) throws Exception {

		if(PayP.isElementExist("payText","payText", 10)) {
			System.out.println("*********************We are in payment page***********************");		
		}
		//if(DeviceRelateddetails.equalsIgnoreCase("DeviceRelateddetails")) {
		if(PayP.isElementExist("howWouldYouLikeToPay","howWouldYouLikeToPay", 10)) {
			PayP.isElementExist("chargeToBill","chargeToBill", 10);
			PayP.isElementExist("OneTimePayment","OneTimePayment", 10);
			switch (CTB) {
			case "chargeToBill":
				PayP.jsClick("chargeToBill", "chargeToBill");
				break;
			case "OneTimePayment":
				PayP.jsClick("OneTimePayment", "OneTimePayment");
				break;

			default :
				System.out.println("how Would You Like To Pay METHOD");
			} 



		}

		PayP.isElementExist("planType","planType", 10);
		PayP.isElementExist("Change Link for plans & addons","ChangeLink", 10);
		PayP.isElementExist("AllAccessData","AllAccessData", 10);
		PayP.isElementExist("GoWifiAccess","GoWifiAccess", 10);
		PayP.isElementExist("Call_Text","Call_Text", 10);
		PayP.isElementExist("ContractDuration","ContractDuration", 10);

		//inclusions
		if(PayP.isElementExist("Inclusions Text","Inclusions", 10))
		{
			PayP.isElementExist("KonsultaMD","KonsultaMD", 10);
			PayP.isElementExist("VIPAccessToiQIYI","VIPAccessToiQIYI", 10);
			PayP.isElementExist("VIPAccessToWeTV","VIPAccessToWeTV", 10);

		}

		//AddonsAndSubscriptions
		if(PayP.isElementExist("Addons And Subscriptions Text","AddonsAndSubscriptions", 10)) {
			PayP.isElementExist("GSAddSurf","GSAddSurf", 10);
			PayP.isElementExist("AmazonPrimeVideo","AmazonPrimeVideo", 10);
			PayP.isElementExist("ViuPremium","VIUPremiumAddon", 10);
			PayP.isElementExist("MySuperDuo","MySuperDuo", 10);
			PayP.isElementExist("EasyRoam","EasyRoamAddon", 10);
			PayP.isElementExist("GOCALLIDD","GOCALLIDDP", 10);
			PayP.isElementExist("Change Link For Address","ChangeLinkForAddress", 10);
		}
		if(PayP.isElementExist("defaultshippingAddress","defaultshippingAddress", 10)) {
			String shippingAddress = PayP.get_defaultshippingAddress().getText();
			System.out.println("Default shipping address:"+shippingAddress); 
			Constant.dataMap.get().put("ShippingAddress",shippingAddress); 

			Constant.dataMap.get().put("Magento_AddressInformation",shippingAddress);

		}
		//need to check
		PayP.isElementExist("This Is What Your Monthly Bill Will Look Like Text","thisIsWhatYourMonthlyBillWillLookLike", 10);

		if(PayP.isElementExist("showBreakdown","showBreakdown", 10)) {
			PayP.jsClick("showBreakdown", "showBreakdown");
		}		

		if(PayP.isElementExist("palntypepay","palntypepay", 10)) {
			String palntypepay = PayP.get_palntypepay().getText();
			System.out.println("palntypepay: "+palntypepay);  		
		}
		if(PayP.isElementExist("GSADDPAY","GSADDPAY", 10)) {
			String GSADDPAY = PayP.get_GSADDPAY().getText();
			System.out.println("GSADDPAY Fee: "+GSADDPAY);  		
		}
		if(PayP.isElementExist("APVPAY","APVPAY", 10)) {
			String APVPAY = PayP.get_APVPAY().getText();
			System.out.println("APVPAY Fee: "+APVPAY);  		
		}
		if(PayP.isElementExist("VIU","VIU", 10)) {
			String VIU = PayP.get_VIU().getText();
			System.out.println("VIU Fee: "+VIU);  		
		}
		if(PayP.isElementExist("Musuperduo","Musuperduo", 10)) {
			String Musuperduo = PayP.get_Musuperduo().getText();
			System.out.println("Musuperduo Fee: "+Musuperduo);  		
		}
		if(PayP.isElementExist("EseyRoam","EseyRoam", 10)) {
			String EseyRoam = PayP.get_EseyRoam().getText();
			System.out.println("EseyRoam Fee: "+EseyRoam);  		
		}
		if(PayP.isElementExist("Gloicod","Gloicod", 10)) {
			String Gloicod = PayP.get_Gloicod().getText();
			System.out.println("Gloicod Fee: "+Gloicod);  		
		}
		if(PayP.isElementExist("shippingFee","shippingFee", 10)) {
			String shippingFee = PayP.get_shippingFee().getText();
			System.out.println("shippingFee Fee: "+shippingFee);  		
		}

		if(PayP.isElementExist("monthlyBill","monthlyBill", 10)) {
			String monthlyBill = PayP.get_monthlyBill().getText();
			System.out.println("monthlyBill: "+monthlyBill);  		
		}

		if(PayP.isElementExist("hideBreakdown","hideBreakdown", 10)) {
			PayP.jsClick("hideBreakdown", "hideBreakdown");
		}

		PayP.isElementExist("This Is What Your Monthly Bill Will Look Like Text","thisIsWhatYourMonthlyBillWillLookLike", 10);

		if(PayP.isElementExist("viewBreakdown","viewBreakdown", 10)) {
			PayP.jsClick("viewBreakdown", "viewBreakdown");
		}
		if(PayP.isElementExist("OverdueBalnce","OverdueBalnce", 10)) {//need to 
			String OverdueBalnce = PayP.get_OverdueBalnce().getText();
			System.out.println("OverdueBalnce Selected: "+OverdueBalnce);  		
		}
		if(PayP.isElementExist("pretermination","pretermination", 10)) {//need to 
			String pretermination = PayP.get_pretermination().getText();
			System.out.println("pretermination fee: "+pretermination);  		
		}

		if(PayP.isElementExist("deviceSelected","deviceSelected", 10)) {//need to 
			String deviceSelected = PayP.get_deviceSelected().getText();
			System.out.println("Device Selected: "+deviceSelected);  
			Constant.dataMap.get().put("ProductName",deviceSelected);

		}

		if(PayP.isElementExist("costOfDevice","costOfDevice", 10)) {
			String costOfDevice = PayP.get_costOfDevice().getText();
			System.out.println("Cost Of Device: "+costOfDevice);  		
		}
		if(PayP.isElementExist("deviceColorPAy","deviceColorPAy", 10)) {
			String deviceColorPAy = PayP.get_deviceColorPAy().getText();
			System.out.println("deviceColorPAy Of Device: "+deviceColorPAy);  		
		}

		if(PayP.isElementExist("Shipping","Shipping", 10)) {
			String Shipping = PayP.get_Shipping().getText();
			System.out.println("Shipping: "+Shipping);       	  	
		}

		if(PayP.isElementExist("totalAmountToPay","totalAmountToPay", 10)) {//need
			String totalAmountToPay = PayP.get_totalAmountToPay().getText();
			System.out.println("Total Amount To Pay: "+totalAmountToPay); 
			Constant.dataMap.get().put("AmountPaid",totalAmountToPay);
		}
	}


	public void successPageValidation(String Devicedetails,String Modeofpay) throws Exception {

		if (TP.isElementExist("OrderConfirmed", "OrderConfirmed", 40)) {
			System.out
					.println("***********************************We are in Success Page******************************");
		}
		TP.isElementExist("reference", "reference", 10);
		if (TP.isElementExist("ReferenceNo", "ReferenceNo", 10)) {
			String ReferenceNo = TP.get_ReferenceNo().getText();
			System.out.println("ReferenceNo: " + ReferenceNo);
			Constant.dataMap.get().put("OrderID",ReferenceNo);
		}
		TP.isElementExist("copyicon", "copyicon", 10);
		TP.isElementExist("Success", "Success", 10);	
		TP.isElementExist("Your Renewal Is Now In Progress Text", "YourRenewalIsNowInProgress", 10);
		Control.takeScreenshot();
		
		//TP.isElementExist("planType", "planType", 10);

		if (TP.isElementExist("planPrice", "planPrice", 10)) {
			String planPrice = TP.get_planPrice().getText();
			System.out.println("Plan Type: " + planPrice);
		}

		if(Devicedetails.equalsIgnoreCase("devicevalidation")) {
			TP.isElementExist("deviceImg", "deviceImg", 10);
			TP.isElementExist("deviceName", "deviceName", 10);
			String deviceName = TP.get_deviceName().getText();
			System.out.println("Plan Type: " + deviceName);
			TP.isElementExist("devicecolor_Data", "devicecolor_Data", 10);
			LP.scroll_vertical(300);
//			if(TP.isElementExist("shippingheader", "shippingheader", 10)) {
//			TP.isElementExist("Shipping Address Text", "ShippingAddress", 10);
//	
//			TP.isElementExist("ShippingAddressDisplayed","ShippingAddressDisplayed", 10);
//			String ShippingAddressDisplayed = TP.get_ShippingAddressDisplayed().getText();
//		    System.out.println("Shipping Address Displayed: "+ShippingAddressDisplayed);  
//	
//			Constant.dataMap.get().put("ShippingAddress",ShippingAddressDisplayed); 
//	
//			Constant.dataMap.get().put("Magento_AddressInformation",ShippingAddressDisplayed);
//			}
//		
		}
		
		TP.isElementExist("AllAccessData", "AllAccessData", 10);
		//TP.isElementExist("GoWifiAccess", "GoWifiAccess", 10);
		TP.isElementExist("CallAndText", "CallAndText", 10);
		TP.isElementExist("ContractDuration", "ContractDuration", 10);
		
		TP.isElementExist("allacesssvalue", "allacesssvalue", 10);
		//TP.isElementExist("gowifiacesssvalue", "gowifiacesssvalue", 10);
		TP.isElementExist("callandtextvalue", "callandtextvalue", 10);
		TP.isElementExist("contractdurationvalue", "contractdurationvalue", 10);
		Control.takeScreenshot();
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"arguments[0].scrollIntoView(true);", TP.get_inclusionsChevron());
		TP.isElementExist("Inclusions Text", "Inclusions", 10);
		TP.jsClick("inclusionsChevron", "inclusionsChevron");

//		if (TP.isElementExist("Unli1app", "Unli1app", 10)) {
//			String Unli1app = TP.get_Unli1app().getText();
//			System.out.println("Inclusions: " + Unli1app);
//		}
//
//		if (TP.isElementExist("Unli5Gforsixmonths", "Unli5Gforsixmonths", 10)) {
//			String Unli5Gforsixmonths = TP.get_Unli5Gforsixmonths().getText();
//			System.out.println("Inclusions: " + Unli5Gforsixmonths);
//		}
//
//		if (TP.isElementExist("GBstoPointsuptGBmonth", "GBstoPointsuptGBmonth", 10)) {
//			String GBstoPointsuptGBmonth = TP.get_GBstoPointsuptGBmonth().getText();
//			System.out.println("Inclusions: " + GBstoPointsuptGBmonth);
//		}

//		if (TP.isElementExist(" Freeindividualsubscription", " Freeindividualsubscription", 10)) {
//			String Freeindividualsubscription = TP.get_Freeindividualsubscription().getText();
//			System.out.println("Inclusions: " + Freeindividualsubscription);
//		}

//		if (TP.isElementExist("Inclusionaddons", "Inclusionaddons", 10)) {
//			String Inclusionaddons = TP.get_Inclusionaddons().getText();
//			System.out.println("Inclusions: " + Inclusionaddons);
//		}
//
//		if (TP.isElementExist("Inclusionaddons1", "Inclusionaddons1", 10)) {
//			String Inclusionaddons1 = TP.get_Inclusionaddons1().getText();
//			System.out.println("Inclusions: " + Inclusionaddons1);
//		}
//
//		if (TP.isElementExist("Inclusionaddons2", "Inclusionaddons2", 10)) {
//			String Inclusionaddons2 = TP.get_Inclusionaddons2().getText();
//			System.out.println("Inclusions: " + Inclusionaddons2);
//		}
//		if (TP.isElementExist("Inclusionaddons3", "Inclusionaddons3", 10)) {
//			String Inclusionaddons3 = TP.get_Inclusionaddons3().getText();
//			System.out.println("Inclusions: " + Inclusionaddons3);
//		}
//		if (TP.isElementExist("Inclusionaddons4", "Inclusionaddons4", 10)) {
//			String Inclusionaddons4 = TP.get_Inclusionaddons4().getText();
//			System.out.println("Inclusions: " + Inclusionaddons4);
//		}
//		if (TP.isElementExist("Inclusionaddons5", "Inclusionaddons5", 10)) {
//			String Inclusionaddons5 = TP.get_Inclusionaddons5().getText();
//			System.out.println("Inclusions: " + Inclusionaddons5);
//		}
//		if (TP.isElementExist("Inclusionaddons6", "Inclusionaddons6", 10)) {
//			String Inclusionaddons6 = TP.get_Inclusionaddons6().getText();
//			System.out.println("Inclusions: " + Inclusionaddons6);
//		}
//
//		if (TP.isElementExist("KonsultaMD", "KonsultaMD", 10)) {
//			System.out.println("Inclusion chevron is not working");
//		} else {
//			System.out.println("Inclusion chevron is working properly");
//		}
//
		TP.isElementExist("AddOns And Subscriptions Text", "AddOnsAndSubscriptions", 10);
		TP.isElementExist("GSAddSurf", "GSAddSurf", 10);
		TP.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
		TP.isElementExist("ViuPremium", "ViuPremium", 10);
		
		TP.isElementExist("EasyRoam", "EasyRoam", 10);
		TP.isElementExist("GOCALLIDD", "GOCALLIDD", 10);
		Control.takeScreenshot();
		TP.isElementExist("ordersummery", "ordersummery", 10);//
		TP.isElementExist("ordersummerytext", "ordersummerytext", 10);//
		TP.isElementExist("ordersummeryamount", "ordersummeryamount", 10);//
		TP.jsClick("ShowBreakdown", "ShowBreakdown");
		TP.isElementExist("view1plantype", "view1plantype", 10);//
		TP.isElementExist("view1planevalue", "view1planevalue", 10);//
		
		TP.isElementExist("MonthlyBill", "MonthlyBill", 10);
		if (TP.isElementExist("MonthlyBillGenerated", "MonthlyBillGenerated", 10)) {
			String MonthlyBillGenerated = TP.get_MonthlyBillGenerated().getText();
			System.out.println("Monthly Bill Generated: " + MonthlyBillGenerated);
		}
		if(Modeofpay.equalsIgnoreCase("onetimepayment")) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", TP.get_paymentdeatilsheader());

			TP.isElementExist("paymentdeatilsheader", "paymentdeatilsheader", 10);//
			TP.isElementExist("paymentdetailsamount", "paymentdetailsamount", 10);//
			TP.isElementExist("Viewbreakdown", "Viewbreakdown", 10);
			TP.jsClick("Viewbreakdown", "Viewbreakdown");
			}
		if(Devicedetails.equalsIgnoreCase("devicevalidation")) {
		TP.isElementExist("view2devicename", "view2devicename", 10);//
		String view2devicenameGenerated = TP.get_view2devicename().getText();
		System.out.println("view2devicename Generated: " + view2devicenameGenerated);
		TP.isElementExist("devicecolor", "devicecolor", 10);//
		TP.isElementExist("VIEW2DEVICEPROCE", "VIEW2DEVICEPROCE", 10);//
		String VIEW2DEVICEPROCEGenerated =TP.get_VIEW2DEVICEPROCE().getText();
		System.out.println("Monthly Bill Generated: " + VIEW2DEVICEPROCEGenerated);
		
		}
		TP.isElementExist("shippingfeeheader", "shippingfeeheader", 10);
		TP.isElementExist("shippingfeetext", "shippingfeetext", 10);
		TP.isElementExist("shippingamount", "shippingamount", 10);
		Control.takeScreenshot();
		String shippingamountGenerated = TP.get_shippingamount().getText();
		System.out.println("Monthly Bill Generated: " + shippingamountGenerated);
		if(Modeofpay.equalsIgnoreCase("onetimepayment")) {
			TP.isElementExist("shippingtotalamountpaidheader", "shippingtotalamountpaidheader", 10);
			TP.isElementExist("shiipingtotalamountvalue", "shiipingtotalamountvalue", 10);
			
			String shiipingtotalamountvalueGenerated = TP.get_shiipingtotalamountvalue().getText();
			System.out.println("Monthly Bill Generated: " + shiipingtotalamountvalueGenerated);
			
			TP.isElementExist("onetimeheader", "onetimeheader", 10);
			TP.isElementExist("WhatsNext", "WhatsNext", 10);
			Control.takeScreenshot();
			TP.isElementExist("PleaseGiveUsTimeToProcessYourOrder", "PleaseGiveUsTimeToProcessYourOrder", 10);
			}
		
		
		if (TP.isElementExist("TrackMyOrder", "TrackMyOrder", 10)) {
			TP.jsClick("TrackMyOrder", "TrackMyOrder");
		}

	}


	public void customizePlanwithCTB() throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("****************customizePlan************************");
		if(Custm.isElementExist("Customize Plan Text","customizePlan", 10)) {
			System.out.println("We are in Customize Plan Page");
		}
		Custm.isElementExist("change button","change", 10);
		Control.captureScreenshot();
		planChangeInCustomizePage("device","599 with Device");
		Custm.isElementExist("Change Link For Plans","changeLinkForPlans", 10);
		Custm.isElementExist("Gplan plan type","gplan599WithDevice", 10);		
		if(Custm.isElementExist("Right side planetype","secondplantype", 10))
		{
			String Rightsideplanetype = Custm.get_secondplantype().getText();
			System.out.println("all_AccessData details of the device:"+Rightsideplanetype);
		}

		if(Custm.isElementExist("all_AccessData","all_AccessData", 10)) {
			String all_AccessData = Custm.get_all_AccessData().getText();
			System.out.println("all_AccessData details of the device:"+all_AccessData);
		}

		if(Custm.isElementExist("GoWifi_Access","GoWifi_Access", 10)) {
			String GoWifi_Access = Custm.get_GoWifi_Access().getText();
			System.out.println("GoWifi_Access details of the device:"+GoWifi_Access);
		}

		if(Custm.isElementExist("Contract_duration","Contract_duration", 10)) {
			String Contract_duration = Custm.get_Contract_duration().getText();
			System.out.println("Contract_duration details of the device:"+Contract_duration);
		}

		if(Custm.isElementExist("Call_and_text","Call_and_text", 10))
		{
			String Call_and_text = Custm.get_Call_and_text().getText();
			System.out.println("Call_and_text details of the device:"+Call_and_text);
		}


		Custm.javascript_clickOnElement(Custm.get_showmoredevices());

		searchingDeviceInCustomPage("Apple iPhone 11");

		if(Custm.isElementExist("Choose Your Phone","chooseYourPhone", 10))
		{

			String device_Name = Custm.get_deviceName().getText();
			System.out.println("Device Selcted:"+device_Name);
			Custm.isElementExist("Device Details Text","deviceDetails", 10);

			if(Custm.isElementExist("specifications Text","specifications", 10))
			{			
				String specifications = Custm.get_specifications().getText();
				System.out.println("Screen Size of the device:"+specifications);
			}		

			Custm.isElementExist("Hide Details link","hideDetails", 10);
			Custm.isElementExist("Show More Devices Button","showMoreDevices", 10);	




			//label[text()=' eSim ']


			Custm.isElementExist("chooseContractDuration","chooseContractDuration", 10);//need 
			Custm.isElementExist("chooseYourColor","chooseYourColor", 10);//need
			Custm.isElementExist("deviceColors","deviceColors", 10);//need
			if(Custm.isElementExist("chooseStorageCapacity","chooseStorageCapacity", 10)) {//need
				String StorageCapacity = Custm.get_chooseStorageCapacity().getText();
				System.out.println("Storage Capacity details of the device:"+StorageCapacity);
			}


			if(Custm.isElementExist("Prefer eSIM Or Physical SIMCard","PrefereSIMOrPhysicalSIMCard", 10)) {
				Custm.jsClick("physicalSimCard", "physicalSimCard");
			}
			Custm.isElementExist("ESIMIMG", "ESIMIMG", 10);

			Custm.isElementExist("esimmmm in inclustion", "esimmmm", 10);
		}
		Control.captureScreenshot();
		Custm.isElementExist("Pick Your Add_ons Text","pickYourAdd_ons", 10);
		Custm.isElementExist("Add_ons_Go_On_TopOfYour_Month Text","add_ons_Go_On_TopOfYour_Month", 10);

		if(Custm.isElementExist("Do_you_use_lots_of_data","Do_you_use_lots_of_data", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Do_you_use_lots_of_data());
			Thread.sleep(3000);
			Custm.jsClick("Do_you_use_lots_of_data", "Do_you_use_lots_of_data");
			Custm.jsClick("GS_Add_Surf_99", "GS_Add_Surf_99");
		}

		if(Custm.isElementExist("Do_you_love_watching_shows_and_movies","Do_you_love_watching_shows_and_movies", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Do_you_love_watching_shows_and_movies());
			Thread.sleep(3000);
			Custm.jsClick("Do_you_love_watching_shows_and_movies", "Do_you_love_watching_shows_and_movies");
			Custm.jsClick("Amazon_Prime_Video", "Amazon_Prime_Video");
			Custm.jsClick("Viu_Premium", "Viu_Premium");
		}

		if(Custm.isElementExist("Prefer_talking_over_messaging","Prefer_talking_over_messaging", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Prefer_talking_over_messaging());
			Thread.sleep(3000);
			Custm.jsClick("Prefer_talking_over_messaging", "Prefer_talking_over_messaging");
			Custm.jsClick("My_Super_Duo", "My_Super_Duo");
		}

		if(Custm.isElementExist("Are_you_all_about_the_jet_setting_lifestyle","Are_you_all_about_the_jet_setting_lifestyle", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_Are_you_all_about_the_jet_setting_lifestyle());
			Thread.sleep(3000);
			Custm.jsClick("Are_you_all_about_the_jet_setting_lifestyle", "Are_you_all_about_the_jet_setting_lifestyle");
			Custm.jsClick("Easy_Roam", "Easy_Roam");
			Custm.jsClick("GOCALLIDD_199", "GOCALLIDD_199");
		}

		if(Custm.isElementExist("Shipping Address Text","shiipindaddress", 10))
		{
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", Custm.get_shippingaddressvalue());
			String shippingAddress = Custm.get_shippingaddressvalue().getText();
			System.out.println("Screen Size of the device:"+shippingAddress);
		}
		Custm.isElementExist("Change Link For Address Text","changeLinkForAddress", 10);//need



	}
	//	public void ODAADDRSSCHECK(String HouseNo_FloorNo, String Street, String Subdi_BuildingName, String Prov, String City, String Brgy) throws Exception
	//	{
	//		Custm.isElementExist("changeaddress", "changeaddress", 10);
	//		JavascriptExecutor jsget = (JavascriptExecutor) DriverManager.getDriver();
	//		jsget.executeScript("arguments[0].click();", Custm.get_changeaddress());
	//
	//		Custm.isElementExist("house", "house", 10);
	//		Custm.isElementExist("condo", "condo", 10);
	//		JavascriptExecutor jsgetcode = (JavascriptExecutor) DriverManager.getDriver();
	//		jsgetcode.executeScript("arguments[0].click();", Custm.get_condo());
	//
	//		Custm.get_floor().sendKeys(HouseNo_FloorNo);
	//		System.out.println("Floor : "+HouseNo_FloorNo);
	//		Thread.sleep(2000L);
	//		Custm.get_buildingname().clear();
	//		Custm.get_buildingname().sendKeys(Subdi_BuildingName); 
	//		System.out.println("Building Name : "+Subdi_BuildingName);
	//		Thread.sleep(2000L);
	//		Custm.get_street().clear();
	//		Custm.get_street().sendKeys(Street); 
	//		System.out.println("Street : "+Street);
	//		Thread.sleep(2000L);
	//
	//
	////		Custm.select_province(Prov);
	////		System.out.println("Province : "+Prov);
	////		Thread.sleep(2000L);
	//		Custm.get_Province().clear();
	//		Custm.get_Province().sendKeys(Prov);
	//	    DriverManager.getDriver().findElement(Custm.input_Result).click();
	//		
	//	    /*Custm.select_city(City); 
	//		System.out.println("City : "+City);*/
	//	     Custm.get_City().clear();
	//		Custm.get_City().sendKeys(City);
	//		DriverManager.getDriver().findElement(Custm.input_Result).click();
	//		
	//		Thread.sleep(2000L);
	//		/*Custm.select_barangay(Brgy); 
	//		System.out.println("Barangay : "+Brgy);*/
	//		
	//		//DriverManager.getDriver().findElement(Custm.Barangay_Result).click();
	//		Custm.get_Barangay().clear();
	//		Custm.get_Barangay().sendKeys(Brgy);
	//		DriverManager.getDriver().findElement(Custm.input_Result).click();
	//
	//		Thread.sleep(2000L);
	//
	//		String zipCOde = Custm.get_ZIPcode1().getAttribute("value");
	//		if (zipCOde == null || zipCOde.isEmpty()) {
	//			System.out.println("FAIL : ZIP Code -  is blank");
	//		} else {
	//			System.out.println("ZIP Code is pre-populated : " + zipCOde);
	//		}
	//
	//		Thread.sleep(1000L);
	//		Custm.isElementExist("outofdeliveryaddress", "outofdeliveryaddress", 10);
	//		
	//		
	//	}
	public void seeMyNewPlanValidation(String esim) throws Exception {

//		if(Custm.isElementExist("See_my_new_plan","See_my_new_plan", 10)) {//need
//			Custm.jsClick("See_my_new_plan", "See_my_new_plan");
//		}
	
		if(Custm.isElementExist("See_my_new_plan","SeeMyNewPlan", 10)) {//need
			Custm.jsClick("See_my_new_plan", "SeeMyNewPlan");
		}

		if(Custm.isElementExist("gplan type value ","gplan599With_Device", 10))//newly add
		{
			String planvalue = Custm.get_gplan599With_Device().getText();
			System.out.println("Name of the device selected:"+planvalue); 
		}
		Custm.isElementExist("AllAccessData","AllAccessData", 10);
		//Custm.isElementExist("GoWifiAccess","GoWifiAccess", 10);
		Custm.isElementExist("Callandtext","Callandtext", 10);
		Custm.isElementExist("ContractDuration","ContractDuration", 10);
		if(esim.equalsIgnoreCase("esim")) {
			Custm.isElementExist("esimbreak", "esimbreak", 10);
		}
		if(Custm.isElementExist("nameOfDevice","nameOfDevice", 10)) {//need
			String NameOfDevice = Custm.get_nameOfDevice().getText();
			System.out.println("Name of the device selected:"+NameOfDevice);  		
		}

		if(Custm.isElementExist("subscriptionsandAddons","subscriptionsandAddons", 10))
		{//need below
			Custm.isElementExist("GSAddSurf","GSAddSurf", 10);
			Custm.isElementExist("AmazonPrimeVideo","AmazonPrimeVideo", 10);
			Custm.isElementExist("ViuPremium","ViuPremiumbreak", 10);//
			
			Custm.isElementExist("EasyRoam","EasyRoambreak", 10);//
			Custm.isElementExist("GOCALLIDD","GOCALLIDD", 10);
		}

		if(Custm.isElementExist("Totalsubscriptionsandaddons","Totalsubscriptionsandaddons", 10)) {
			String costOfSubscriptions = Custm.get_Totalsubscriptionsandaddons().getText();
			System.out.println("Total subscriptions and addons cost:"+costOfSubscriptions);  		
		}

		if(Custm.isElementExist("MonthlyPayment","MonthlyPayment", 10)) {
			String MonthlyPayment = Custm.get_MonthlyPayment().getText();
			System.out.println("MonthlyPayment :"+MonthlyPayment);  		
		}

		Custm.isElementExist("Monthlypaymentincludes","Monthlypaymentincludes", 10);

		if(Custm.isElementExist("RenewingFor","renewingfor", 10)) {
			String renewingFor = Custm.get_renewingfor().getText();
			System.out.println("Renewing For :"+renewingFor);  		
		}


		if(Custm.isElementExist("SelectPlan","SelectPlan", 10)) {
			Control.captureScreenshot();
			Custm.jsClick("SelectPlan", "SelectPlan"); 		
		} 
	}

	//	public void ODAADDRSSCHECK2(String HouseNo_FloorNo, String Street, String Subdi_BuildingName, String Prov, String City, String Brgy) throws Exception
	//	{
	//		Custm.isElementExist("changeaddress", "changeaddress", 10);
	//		Custm.isElementExist("house", "house", 10);
	//		Custm.isElementExist("condo", "condo", 10);
	//		//		JavascriptExecutor jsgetcode = (JavascriptExecutor) DriverManager.getDriver();
	//		//		jsgetcode.executeScript("arguments[0].click();", Custm.get_condo());
	//		Custm.get_floor().clear();
	//		Custm.get_floor().sendKeys(HouseNo_FloorNo);
	//		System.out.println("Floor : "+HouseNo_FloorNo);
	//		Custm.get_buildingname().clear();
	//		Custm.get_buildingname().sendKeys(Subdi_BuildingName); 
	//		System.out.println("Building Name : "+Subdi_BuildingName);
	//		Custm.get_street().clear();
	//		Custm.get_street().sendKeys(Street); 
	//		System.out.println("Street : "+Street);
	//
	//		/*Custm.select_province(Prov);
	//		System.out.println("Province : "+Prov);
	//		Thread.sleep(2000L);*/
	//		Custm.get_Province().clear();
	//		Custm.get_Province().sendKeys(Prov);
	//	DriverManager.getDriver().findElement(Custm.input_Result).click();
	//		
	//		/*Custm.select_city(City); 
	//		System.out.println("City : "+City);*/
	//	Custm.get_City().clear();
	//		Custm.get_City().sendKeys(City);
	//		DriverManager.getDriver().findElement(Custm.input_Result).click();
	//		
	//		Thread.sleep(2000L);
	//		/*Custm.select_barangay(Brgy); 
	//		System.out.println("Barangay : "+Brgy);*/
	//		
	//		//DriverManager.getDriver().findElement(Custm.Barangay_Result).click();
	//		Custm.get_Barangay().clear();
	//		Custm.get_Barangay().sendKeys(Brgy);
	//		DriverManager.getDriver().findElement(Custm.input_Result).click();
	//
	//
	//
	//
	//		String zipCOde = Custm.get_ZIPcode1().getAttribute("value");
	//		if (zipCOde == null || zipCOde.isEmpty()) {
	//			System.out.println("FAIL : ZIP Code -  is blank");
	//		} else {
	//			System.out.println("ZIP Code is pre-populated : " + zipCOde);
	//		}
	//
	//		Thread.sleep(1000L);
	//		DriverManager.getDriver().findElement(Custm.submitbutton).click();
	//
	//
	//
	//
	//	}
	//



	public void seemyplan() throws Exception {
		if(Custm.isElementExist("see my New plan", "SeeMyNewPlan", 10))
		{
			//Custm.clickOnElement("drag option see my new plan", "SeeMyNewPlan", "SeeMyNewPlan");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", Custm.get_SeeMyNewPlan());

		}

		Thread.sleep(2000);
		Custm.isElementExist("plantype2", "plantype2", 10);
		Custm.isElementExist("deviceimage", "deviceimage", 10);
		Custm.isElementExist("allaccessdata", "allaccessdata", 10);
		Custm.isElementExist("Gowifi", "Gowifi", 10);
		Custm.isElementExist("calltext", "calltext", 10);
		Custm.isElementExist("contarct", "contarct", 10);
		Custm.isElementExist("inclusion2", "inclusion2", 10);
		Custm.isElementExist("Konsulta2", "Konsulta2", 10);
		Custm.isElementExist("Glnsure2", "Glnsure2", 10);
		//		Custm.isElementExist("VIP2", "VIP2", 10);
		//		Custm.isElementExist("wetv2", "wetv2", 10);
		//		Custm.isElementExist("Kids2", "Kids2", 10);
		//		Custm.isElementExist("skillshare2", "skillshare2", 10);
		Custm.javascript_clickOnElement(Custm.get_inclusion2());

		//		Custm.isElementExist("plnefinal", "plnefinal", 10);
		//		Custm.isElementExist("planevalue", "planevalue", 10);
		Custm.isElementExist("monthlypayment", "monthlypayment", 10);
		Custm.isElementExist("mothlypaymentvalue", "mothlypaymentvalue", 10);
		Custm.isElementExist("gsadd", "gsadd", 10);
		Custm.isElementExist("apv", "apv", 10);
		Custm.isElementExist("viu", "viu", 10);
		Custm.isElementExist("Duo", "Duo", 10);
		Custm.isElementExist("easy", "easy", 10);
		Custm.isElementExist("total", "total", 10);
		Custm.isElementExist("taotalvalue", "taotalvalue", 10);
		Custm.isElementExist("maothlyaddons", "maothlyaddons", 10);
		Custm.isElementExist("mothlyaddonvalue", "mothlyaddonvalue", 10);
		Custm.isElementExist("reviwingfor", "reviwingfor", 10);
		if(Custm.isElementExist("select plan", "select", 10))
		{
			Custm.clickOnElement("Select Plan", "select", "select");
		}
		Thread.sleep(4000);

	}



	public void pay() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		PayP.isElementExist("ChargeToBill", "ChargeToBill", 10);
		//PayP.isElementExist("SupportingDocs needed", "SupportingDocs", 10);
		PayP.isElementExist("Show Breakdown", "ShowBreakdown", 10);
		//PayP.clickOnElement("Select ShowBreakdown", "ShowBreakdown", "ShowBreakdown");
		PayP.jsClick("ShowBreakdown", "ShowBreakdown");
		Thread.sleep(1000);

		PayP.isElementExist("GPlan 2499 with GCash", "planetype", 10);
		PayP.isElementExist("planetypeamount", "planetypeamount", 10);
		PayP.isElementExist("Show addon", "addon", 10);
		PayP.isElementExist("Show addonsamount", "addonsamount", 10);
		PayP.isElementExist("Show gsaddsurf", "gsaddsurf", 10);
		PayP.isElementExist("Show gsaddamount", "gsaddamount", 10);
		PayP.isElementExist("Show apv", "apv", 10);
		PayP.isElementExist("Show apvamount", "apvamount", 10);
		PayP.isElementExist("Show viu", "viu", 10);
		PayP.isElementExist("Show viuamount", "viuamount", 10);
		PayP.isElementExist("Show myduo", "myduo", 10);
		PayP.isElementExist("Show myduoamount", "myduoamount", 10);
		PayP.isElementExist("Show easyroam", "easyroam", 10);
		PayP.isElementExist("Show easyroamamount", "easyroamamount", 10);
		PayP.isElementExist("Show Monthlybill", "Monthlybill", 10);
		PayP.isElementExist("Show monthlybillamount", "monthlybillamount", 10);

		PayP.isElementExist("Show allaccess", "allaccess", 10);
		PayP.isElementExist("Show Gowi", "Gowi", 10);
		PayP.isElementExist("Show callText", "callText", 10);
		PayP.isElementExist("Show contractduration", "contractduration", 10);
		PayP.isElementExist("Show inclusion", "inclusion", 10);
		PayP.isElementExist("Show Konsulta", "Konsulta", 10);
		PayP.isElementExist("Show Glnsure", "Glnsure", 10);
		//		PayP.isElementExist("Show VIP", "VIP", 10);
		//		PayP.isElementExist("Show wetv", "wetv", 10);
		//		PayP.isElementExist("Show Kids", "Kids", 10);
		//		PayP.isElementExist("Show skillshare", "skillshare", 10);
		//PayP.clickOnElement("Select inclusion", "inclusion", "inclusion");
		PayP.jsClick("inclusion", "inclusion");

		PayP.isElementExist("Show addonsubscripation", "addonsubscripation", 10);
		PayP.isElementExist("Show GS", "GS", 10);
		PayP.isElementExist("Show APV2", "APV2", 10);
		PayP.isElementExist("Show VIU2", "VIU2", 10);
		PayP.isElementExist("Show MYDUO2", "MYDUO2", 10);

		//PayP.clickOnElement("Select addonsubscripation", "addonsubscripation", "addonsubscripation");
		JavascriptExecutor jsgetcode = (JavascriptExecutor) DriverManager.getDriver();
		jsgetcode.executeScript("arguments[0].click();", PayP.get_addonsubscripation());





	}
	public void paywithdevice() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);

		PayP.isElementExist("howwouldyouliketopay", "howwouldyouliketopay", 10);
		PayP.isElementExist("chargetobillbutton", "chargetobillbutton", 10);
		PayP.isElementExist("ontimecashout", "ontimecashout", 10);
		PayP.javascript_clickOnElement(PayP.get_ontimecashout());

		PayP.isElementExist("ChargeToBill", "ChargeToBill", 10);


		//PayP.isElementExist("SupportingDocs needed", "SupportingDocs", 10);
		PayP.isElementExist("Show Breakdown", "ShowBreakdown", 10);
		PayP.javascript_clickOnElement(PayP.get_ShowBreakdown());
		//PayP.clickOnElement("Select ShowBreakdown", "ShowBreakdown", "ShowBreakdown");
		Thread.sleep(1000);


		PayP.isElementExist("planetype2", "planetype2", 10);
		PayP.isElementExist("planetypeamount", "planetypeamount", 10);
		PayP.isElementExist("Show addon", "addon", 10);
		PayP.isElementExist("Show addonsamount", "addonsamount", 10);
		PayP.isElementExist("Show gsaddsurf", "gsaddsurf", 10);
		PayP.isElementExist("Show gsaddamount", "gsaddamount", 10);
		PayP.isElementExist("Show apv", "apv", 10);
		PayP.isElementExist("Show apvamount", "apvamount", 10);
		PayP.isElementExist("Show viu", "viu", 10);
		PayP.isElementExist("Show viuamount", "viuamount", 10);
		PayP.isElementExist("Show spotify", "spotify", 10);
		PayP.isElementExist("Show spotifymeamount", "spotifymeamount", 10);
		PayP.isElementExist("Show myduo", "myduo", 10);
		PayP.isElementExist("Show myduoamount", "myduoamount", 10);
		PayP.isElementExist("Show easyroam", "easyroam", 10);
		PayP.isElementExist("Show easyroamamount", "easyroamamount", 10);
		PayP.isElementExist("Show Monthlybill", "Monthlybill", 10);
		PayP.isElementExist("Show monthlybillamount", "monthlybillamount", 10);

		PayP.isElementExist("Show viewbreakdown", "viewbreakdown", 10);
		PayP.javascript_clickOnElement(PayP.get_viewbreakdown());
		PayP.isElementExist("GPlan 2499 with device", "planetypewithdevice", 10);
		PayP.isElementExist("GPlan 2499 with device deviceimage", "deviceimage", 10);

		PayP.isElementExist("Show allaccess", "allaccess", 10);
		PayP.isElementExist("Show Gowi", "Gowi", 10);
		PayP.isElementExist("Show callText", "callText", 10);
		PayP.isElementExist("Show contractduration", "contractduration", 10);
		PayP.isElementExist("Show inclusion", "inclusion", 10);
		PayP.isElementExist("Show Konsulta", "Konsulta", 10);
		PayP.isElementExist("Show Glnsure", "Glnsure", 10);
		//		PayP.isElementExist("Show VIP", "VIP", 10);
		//		PayP.isElementExist("Show wetv", "wetv", 10);
		//		PayP.isElementExist("Show Kids", "Kids", 10);
		//		PayP.isElementExist("Show skillshare", "skillshare", 10);
		//		//PayP.clickOnElement("Select inclusion", "inclusion", "inclusion");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PayP.get_inclusion());

		PayP.isElementExist("Show addonsubscripation", "addonsubscripation", 10);
		PayP.isElementExist("Show GS", "GS", 10);
		PayP.isElementExist("Show APV2", "APV2", 10);
		PayP.isElementExist("Show VIU2", "VIU2", 10);
		PayP.isElementExist("Show MYDUO2", "MYDUO2", 10);
		PayP.isElementExist("Show EasyRoame", "EasyRoame", 10);
		PayP.isElementExist("Show spotify2", "spotify2", 10);

		//PayP.clickOnElement("Select addonsubscripation", "addonsubscripation", "addonsubscripation");
		JavascriptExecutor jsgetcode = (JavascriptExecutor) DriverManager.getDriver();
		jsgetcode.executeScript("arguments[0].click();", PayP.get_addonsubscripation());




		PayP.isElementExist("How Will you be paying?", "Paying", 10);
		PayP.isElementExist("visamaster", "visamaster", 10);
		PayP.isElementExist("gcash", "gcash", 10);

		//		JavascriptExecutor jspay = (JavascriptExecutor) DriverManager.getDriver();
		//		jspay.executeScript("arguments[0].click();", PayP.get_VisaMastercard());
		//				
		//
		//		Constant.dataMap.get().put("Magento_PaymentShippingMethod", PaymentOption);
		//		Constant.dataMap.get().put("OMT_PaymentMethodUsed", PaymentOption);

	}
	public void payCTB() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);

		PayP.isElementExist("howwouldyouliketopay", "howwouldyouliketopay", 10);
		PayP.isElementExist("chargetobillbutton", "chargetobillbutton", 10);
		PayP.isElementExist("ontimecashout", "ontimecashout", 10);
		PayP.javascript_clickOnElement(PayP.get_chargetobillbutton());

		PayP.isElementExist("ChargeToBill", "ChargeToBill", 10);


		//PayP.isElementExist("SupportingDocs needed", "SupportingDocs", 10);
		PayP.isElementExist("Show Breakdown", "ShowBreakdown", 10);
		PayP.javascript_clickOnElement(PayP.get_ShowBreakdown());
		//PayP.clickOnElement("Select ShowBreakdown", "ShowBreakdown", "ShowBreakdown");
		Thread.sleep(1000);


		PayP.isElementExist("planetype2", "planetype2", 10);
		PayP.isElementExist("planetypeamount", "planetypeamount", 10);
		PayP.isElementExist("Show addon", "addon", 10);
		PayP.isElementExist("Show addonsamount", "addonsamount", 10);
		PayP.isElementExist("Show gsaddsurf", "gsaddsurf", 10);
		PayP.isElementExist("Show gsaddamount", "gsaddamount", 10);
		PayP.isElementExist("Show apv", "apv", 10);
		PayP.isElementExist("Show apvamount", "apvamount", 10);
		PayP.isElementExist("Show viu", "viu", 10);
		PayP.isElementExist("Show viuamount", "viuamount", 10);
		PayP.isElementExist("Show spotify", "spotify", 10);
		PayP.isElementExist("Show spotifymeamount", "spotifymeamount", 10);
		PayP.isElementExist("Show myduo", "myduo", 10);
		PayP.isElementExist("Show myduoamount", "myduoamount", 10);
		PayP.isElementExist("Show easyroam", "easyroam", 10);
		PayP.isElementExist("Show easyroamamount", "easyroamamount", 10);
		PayP.isElementExist("Show Monthlybill", "Monthlybill", 10);
		PayP.isElementExist("Show monthlybillamount", "monthlybillamount", 10);

		PayP.isElementExist("Show viewbreakdown", "viewbreakdown", 10);
		PayP.javascript_clickOnElement(PayP.get_viewbreakdown());
		PayP.isElementExist("GPlan 2499 with device", "planetypewithdevice", 10);
		PayP.isElementExist("GPlan 2499 with device deviceimage", "deviceimage", 10);

		PayP.isElementExist("Show allaccess", "allaccess", 10);
		PayP.isElementExist("Show Gowi", "Gowi", 10);
		PayP.isElementExist("Show callText", "callText", 10);
		PayP.isElementExist("Show contractduration", "contractduration", 10);
		PayP.isElementExist("Show inclusion", "inclusion", 10);
		PayP.isElementExist("Show Konsulta", "Konsulta", 10);
		PayP.isElementExist("Show Glnsure", "Glnsure", 10);
		//		PayP.isElementExist("Show VIP", "VIP", 10);
		//		PayP.isElementExist("Show wetv", "wetv", 10);
		//		PayP.isElementExist("Show Kids", "Kids", 10);
		//		PayP.isElementExist("Show skillshare", "skillshare", 10);
		//PayP.clickOnElement("Select inclusion", "inclusion", "inclusion");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PayP.get_inclusion());

		PayP.isElementExist("Show addonsubscripation", "addonsubscripation", 10);
		PayP.isElementExist("Show GS", "GS", 10);
		PayP.isElementExist("Show APV2", "APV2", 10);
		PayP.isElementExist("Show VIU2", "VIU2", 10);
		PayP.isElementExist("Show MYDUO2", "MYDUO2", 10);
		PayP.isElementExist("Show EasyRoame", "EasyRoame", 10);
		PayP.isElementExist("Show spotify2", "spotify2", 10);

		//PayP.clickOnElement("Select addonsubscripation", "addonsubscripation", "addonsubscripation");
		JavascriptExecutor jsgetcode = (JavascriptExecutor) DriverManager.getDriver();
		jsgetcode.executeScript("arguments[0].click();", PayP.get_addonsubscripation());




		PayP.isElementExist("How Will you be paying?", "Paying", 10);
		PayP.isElementExist("visamaster", "visamaster", 10);
		PayP.isElementExist("gcash", "gcash", 10);
		//		PayP.isElementExist("hsbc in payment payge", "hsbc", 10);
		//		PayP.isElementExist("bpi in payment mode", "bpi", 10);
		//		
		//	PayP.js_clickOnElement("Button", "paymentpage: Visa Mastercard", "VisaMastercard1");

		//		WebElement element = DriverManager.getDriver().findElement(PayP.Paying);
		//		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		//		Thread.sleep(500);
		//		
		//		if (PaymentOption.equalsIgnoreCase("COD")) {
		//			PayP.js_clickOnElement("Button", "paymentpage: COD", "COD1");
		//			//PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);
		//		} else if (PaymentOption.equalsIgnoreCase("VisaMasterCard")) {
		//			PayP.js_clickOnElement("Button", "paymentpage: Visa Mastercard", "VisaMastercard1");
		//			// PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);
		//		} else if (PaymentOption.equalsIgnoreCase("Gcash")) {
		//			PayP.js_clickOnElement("Button", "paymentpage: Gcash", "Gcash1");
		//			// PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);
		//		}
		//
		//		Constant.dataMap.get().put("Magento_PaymentShippingMethod", PaymentOption);
		//		Constant.dataMap.get().put("OMT_PaymentMethodUsed", PaymentOption);
		//		
	}
	public void  Successpage2499() throws Exception{

		TP.isElementExist("orderconfirm", "orderconfirm", 10);
		TP.isElementExist("reference", "reference", 10);
		TP.isElementExist("Orderid", "Orderid", 10);
		TP.isElementExist("msg", "msg", 10);
		TP.isElementExist("plane", "plane", 10);
		TP.isElementExist("allaccess", "allaccess", 10);
		//TP.isElementExist("gowifi", "gowifi", 10);
		TP.isElementExist("call", "call", 10);
		TP.isElementExist("contractdur", "contractdur", 10);
		TP.isElementExist("inclusion", "inclusion", 10);
		TP.isElementExist("personalsubscripation", "personalsubscripation", 10);
		TP.isElementExist("threemonthssub", "threemonthssub", 10);
		TP.isElementExist("threemonthsvip", "threemonthsvip", 10);
		TP.isElementExist("premiumaccess", "premiumaccess", 10);
		TP.isElementExist("premembershipaccess", "premembershipaccess", 10);
		TP.isElementExist("addonsubscription", "addonsubscription", 10);
		TP.isElementExist("inclusioncrosal", "inclusioncrosal", 10);
		JavascriptExecutor jssubmit = (JavascriptExecutor) DriverManager.getDriver();
		jssubmit.executeScript("arguments[0].click();", TP.get_inclusioncrosal());
		TP.isElementExist("addonsubscriptioncrosal", "addonsubscriptioncrosal", 10);

		TP.isElementExist("gsadd", "gsadd", 10);
		TP.isElementExist("apv", "apv", 10);
		TP.isElementExist("viu", "viu", 10);
		TP.isElementExist("duo", "duo", 10);
		TP.isElementExist("easy", "easy", 10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", TP.get_addonsubscriptioncrosal());

		//TP.isElementExist("monthly", "monthly", 10);
		TP.isElementExist("breakdown", "breakdown", 10);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", TP.get_breakdown());
		TP.isElementExist("GPlan 2499 with GCash", "planetype", 10);
		TP.isElementExist("planetypeamount", "planetypeamount", 10);
		TP.isElementExist("Show addon", "addon", 10);
		TP.isElementExist("Show addonsamount", "addonsamount", 10);
		TP.isElementExist("Show gsaddsurf", "gsaddsurf", 10);
		TP.isElementExist("Show gsaddamount", "gsaddamount", 10);
		TP.isElementExist("Show apv", "apv", 10);
		TP.isElementExist("Show apvamount", "apvamount", 10);
		TP.isElementExist("Show viu", "viu", 10);
		TP.isElementExist("Show viuamount", "viuamount", 10);
		TP.isElementExist("Show myduo", "myduo", 10);
		TP.isElementExist("Show myduoamount", "myduoamount", 10);
		TP.isElementExist("Show easyroam", "easyroam", 10);
		TP.isElementExist("Show easyroamamount", "easyroamamount", 10);
		TP.isElementExist("Show Monthlybill", "Monthlybill", 10);
		TP.isElementExist("Show monthlybillamount", "monthlybillamount", 10);



		TP.isElementExist("trackmyorder", "trackmyorder", 10);
		//TP.isElementExist("monthly", "monthly", 10);
		if(TP.isElementExist("TrackMyOrder","TrackMyOrder", 10)) {
			System.out.println("Tracking the order");
			TP.jsClick("TrackMyOrder", "TrackMyOrder");	
		}

	}
	public void  Successpage2499withdevice() throws Exception{

		TP.isElementExist("orderconfirm", "orderconfirm", 10);
		TP.isElementExist("reference", "reference", 10);
		TP.isElementExist("Orderid", "Orderid", 10);
		TP.isElementExist("msg", "msg", 10);
		TP.isElementExist("plane", "plane", 10);
		TP.isElementExist("allaccess", "allaccess", 10);
		//TP.isElementExist("gowifi", "gowifi", 10);
		TP.isElementExist("call", "call", 10);
		TP.isElementExist("contractdur", "contractdur", 10);
		TP.isElementExist("inclusion", "inclusion", 10);
		TP.isElementExist("personalsubscripation", "personalsubscripation", 10);
		TP.isElementExist("threemonthssub", "threemonthssub", 10);
		//TP.isElementExist("threemonthsvip", "threemonthsvip", 10);
		//TP.isElementExist("premiumaccess", "premiumaccess", 10);
		//TP.isElementExist("premembershipaccess", "premembershipaccess", 10);
		TP.isElementExist("addonsubscription", "addonsubscription", 10);
		TP.isElementExist("inclusioncrosal", "inclusioncrosal", 10);
		JavascriptExecutor jssubmit = (JavascriptExecutor) DriverManager.getDriver();
		jssubmit.executeScript("arguments[0].click();", TP.get_inclusioncrosal());
		TP.isElementExist("addonsubscriptioncrosal", "addonsubscriptioncrosal", 10);

		TP.isElementExist("gsadd", "gsadd", 10);
		TP.isElementExist("apv", "apv", 10);
		TP.isElementExist("viu", "viu", 10);
		TP.isElementExist("duo", "duo", 10);
		TP.isElementExist("easy", "easy", 10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", TP.get_addonsubscriptioncrosal());

		//TP.isElementExist("monthly", "monthly", 10);
		TP.isElementExist("breakdown", "breakdown", 10);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", TP.get_breakdown());
		TP.isElementExist("GPlan 2499 GPlan 2499 with Device", "planetype2", 10);
		TP.isElementExist("planetypeamount", "planetypeamount", 10);
		TP.isElementExist("Show addon", "addon", 10);
		TP.isElementExist("Show addonsamount", "addonsamount", 10);
		TP.isElementExist("Show gsaddsurf", "gsaddsurf", 10);
		TP.isElementExist("Show gsaddamount", "gsaddamount", 10);
		TP.isElementExist("Show apv", "apv", 10);
		TP.isElementExist("Show apvamount", "apvamount", 10);
		TP.isElementExist("Show viu", "viu", 10);
		TP.isElementExist("Show viuamount", "viuamount", 10);
		TP.isElementExist("Show myduo", "myduo", 10);
		TP.isElementExist("Show myduoamount", "myduoamount", 10);
		TP.isElementExist("Show easyroam", "easyroam", 10);
		TP.isElementExist("Show easyroamamount", "easyroamamount", 10);
		TP.isElementExist("Show Monthlybill", "Monthlybill", 10);
		TP.isElementExist("Show monthlybillamount", "monthlybillamount", 10);



		TP.isElementExist("trackmyorder", "trackmyorder", 10);
		//TP.isElementExist("monthly", "monthly", 10);

	}
	public void Acceptallconditions1() throws Exception {
		// TODO Auto-generated method stub
		LP.scroll_vertical(100);
		//PayP.clickOnElement("Subscribers Declaration", "SubscDeclaration", "SubscDeclaration");
		//PayP.clickOnElement("GlobePrivacyNotes", "GlobePrivacyNotes", "GlobePrivacyNotes");
		//PayP.clickOnElement("GlobeGroup", "GlobeGroup", "GlobeGroup");

		//		PayP.isElementExist("GPlan Deliverymethod", "Deliverymethod", 10);	
		//		PayP.isElementExist("GPlan standeddelivey", "standeddelivey", 10);	
		//		
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		//js.executeScript("arguments[0].click();", PayP.get_standeddelivey());
		PayP.isElementExist("GPlan Terms & Conditions", "termsconditions", 10);	

		//LP.isElementExist("acccordionText1", "acccordionText1", 10);
		PayP.scroll_vertical(4053);

		js.executeScript("arguments[0].click();", PayP.get_privacycrosal());
		PayP.isElementExist("Privacy Policy of Globe.", "privacytext", 10);	
		//LP.isElementExist("acccordionText2", "acccordionText2", 10);
		PayP.scroll_vertical(4300);

		js.executeScript("arguments[0].click();", PayP.get_globespatnercrosal());
		PayP.isElementExist("How to upload your IDs", "globepatnertext", 10);
		//LP.isElementExist("acccordionText3", "acccordionText3", 10);
		PayP.scroll_vertical(4600);

		//PayP.clickOnElement("check box", "accept", "accept");
		js.executeScript("arguments[0].click();", PayP.get_accept());
		PayP.isElementExist("Submitbutton", "Submitbutton", 10);


		JavascriptExecutor jssubmit = (JavascriptExecutor) DriverManager.getDriver();
		jssubmit.executeScript("arguments[0].click();", PayP.get_Submitbutton());
		Thread.sleep(50000);


	}
	public void Acceptallconditionswithdevice() throws Exception {
		

		PayP.isElementExist("GPlan Deliverymethod", "Deliverymethod", 10);	
//		PayP.isElementExist("GPlan standeddelivey", "standeddelivey", 10);	
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", LP.get_AboutUs());
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		
		PayP.isElementExist("AcceptAllTerms", "AcceptAllTerms", 10);	
		PayP.isElementExist("subscriberDeclaration", "subscriberDeclaration", 10);	
		PayP.jsClick("chevron1", "chevron1");
		PayP.isElementExist("SuscriberDescription", "SuscriberDescription", 10);	
		Control.takeScreenshot();
//		preprod
//		PayP.isElementExist("GlobePrivacyNote", "GlobePrivacyNote", 10);	
//		PayP.jsClick("chevron1", "chevron2");
//		PayP.isElementExist("GlobePrivacyDescription", "GlobePrivacyDescription", 10);
		
		PayP.isElementExist("SharingWithGlobeGroup", "SharingWithGlobeGroup", 10);	
		PayP.jsClick("chevron2", "chevron2");
		PayP.isElementExist("SharingWithGlobeDescription", "SharingWithGlobeDescription", 10);
		PayP.isElementExist("subtext", "subtext", 10);
		
		js.executeScript("arguments[0].click();", PayP.get_accept());
		PayP.isElementExist("Submitbutton", "Submitbutton", 10);
		Control.takeScreenshot();

		JavascriptExecutor jssubmit = (JavascriptExecutor) DriverManager.getDriver();
		jssubmit.executeScript("arguments[0].click();", PayP.get_Submitbutton());
	}




	public void GCashPlan2499() throws Exception {

		// Thread.sleep(90000);
		if (LP.isElementExist("GCash", "GCash", 30)) {
			LP.clickOnElement("Option", "GCash", "GCash");
		}
		for (int i = 0; i <= 7; i++) {

			if (LP.isElementExist("GCash2499Plan", "GCash2499Plan", 10)) {
				LP.clickOnElement("Option", "GCash2499Plan", "GCash2499Plan");
				break;

			} else {

				System.out.println("GCashPlan 2499 is not yet displayed");

				PP.isElementExist("PDP Page: Plan  Device Carousel", "CarouselDeviceplanNext", 5);
				PP.clickOnElement("Next Icon", "CarouselDeviceplanNext", "CarouselDeviceplanNext");

			}
		}
		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);
		// Thread.sleep(3000L);

		PP.isElementExist("Contract Duration", "Contractduration_header", 10);
		// PP.isElementExist("Banner", "Banner", 10);

		// Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(353);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Data_checkbox());

		PP.isElementExist("GS99", "GSAddsurf99", 10);
		// PP.clickOnElement("Button", "GSAddsurf99", "GSAddsurf99");

		JavascriptExecutor js99 = (JavascriptExecutor) DriverManager.getDriver();
		js99.executeScript("arguments[0].click();", PP.get_GSAddsurf99());

		// Banner
		// PP.isElementExist("withDevice_Banner", "Banner", 10);

		// Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		// PP.clickOnElement("Button", "Amazon", "Amazonprime");
		JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
		jsa.executeScript("arguments[0].click();", PP.get_Amazonprime());

		JavascriptExecutor Viupremium = (JavascriptExecutor) DriverManager.getDriver();
		Viupremium.executeScript("arguments[0].click();", PP.get_Viupremium());

		JavascriptExecutor Spotifypremium = (JavascriptExecutor) DriverManager.getDriver();
		Spotifypremium.executeScript("arguments[0].click();", PP.get_Spotifypremium());

		// Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());

		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		// PP.clickOnElement("Button", "MySuperDuo", "MySuperDuo");
		JavascriptExecutor MyDuo = (JavascriptExecutor) DriverManager.getDriver();
		MyDuo.executeScript("arguments[0].click();", PP.get_MyDuo());

		// Lifestyle Addon
		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());

		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		JavascriptExecutor easyRoam = (JavascriptExecutor) DriverManager.getDriver();
		easyRoam.executeScript("arguments[0].click();", PP.get_easyRoam());

		JavascriptExecutor Gocallid199 = (JavascriptExecutor) DriverManager.getDriver();
		Gocallid199.executeScript("arguments[0].click();", PP.get_Gocallid199());

		if (PP.isElementExist("PDP Plan Icon", "PDPplanIcon", 10)) {
			PP.clickOnElement("PDPIcon", "PDPplanIcon", "PDPplanIcon");
			if (PP.isElementExist("PDPPlanSection", "PDPPlanSection", 10)) {
				System.out.println("redirected to PDP plan section");
			} else

			{
				System.out.println("Not redirected to PDP plan section");

			}
		}
		if (PP.isElementExist("PDP Data Icon", "PDPdataIcon", 10)) {
			PP.clickOnElement("PDPdataIcon", "PDPdataIcon", "PDPdataIcon");
			if (PP.isElementExist("PDP Phone section ", "message_addon", 10)) {
				System.out.println("redirected to PDP phone section");
			} else

			{
				System.out.println("Not redirected to PDP phone section");

			}
		}
		if (PP.isElementExist("PDP Data Icon", "PDPdataIcon", 10)) {
			PP.clickOnElement("PDPdataIcon", "PDPdataIcon", "PDPdataIcon");
			if (PP.isElementExist("PDP Data section ", "Data_addon", 10)) {
				System.out.println("redirected to PDP data section");
			} else

			{
				System.out.println("Not redirected to PDP data section");

			}
		}
		if (PP.isElementExist("PDP Call Icon", "PDPcallIcon", 10)) {
			PP.clickOnElement("PDPcallIcon", "PDPcallIcon", "PDPcallIcon");
			if (PP.isElementExist("PDP call section ", "message_addon", 10)) {
				System.out.println("redirected to PDP call section");
			} else

			{
				System.out.println("Not redirected to PDP call section");

			}
		}
		if (PP.isElementExist("PDP roaming Icon", "PDProamingIcon", 10)) {
			PP.clickOnElement("PDProamingIcon", "PDProamingIcon", "PDProamingIcon");
			if (PP.isElementExist("PDP roaming  section ", "lifestyle_addon", 10)) {
				System.out.println("redirected to PDP roaming section");
			} else

			{
				System.out.println("Not redirected to PDP roaming section");

			}
		}
		// uncheck the addons lifestyle to get insufficient csl sapiel banner

		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
		js5.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());

		PP.isElementExist("Review", "Reviewmyplan", 10);

		JavascriptExecutor Reviewmyplan = (JavascriptExecutor) DriverManager.getDriver();
		Reviewmyplan.executeScript("arguments[0].click();", PP.get_Reviewmyplan());

		// JavascriptExecutor jsd = (JavascriptExecutor)
		// DriverManager.getDriver();
		// jsd.executeScript("arguments[0].click();", PP.get_Dragbutton());

		Thread.sleep(1000);

		PP.isElementExist("PlanName2499", "PlanName2499", 10);
		PP.isElementExist("Planamount", "PlanValue", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuoaddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("Viu", "ViuAddon", 10);
		PP.isElementExist("Spotify", "SpotifyAddon", 10);
		PP.isElementExist("EasyRoama", "EasyRoamaddon", 10);

		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);
		PP.isElementExist("Untick", "UntickMyDuo", 10);

		PP.isElementExist("Insufficient CSL msg", "SupportingDocsReq", 10);

		PP.clickOnElement("untick My duo", "UntickMyDuo", "UntickMyDuo");

		PP.isElementExist("Re computemy plan", "Recomputemyplan", 10);

		JavascriptExecutor Recomputemyplan = (JavascriptExecutor) DriverManager.getDriver();
		Recomputemyplan.executeScript("arguments[0].click();", PP.get_Recomputemyplan());

		Thread.sleep(1000L);
		if (PP.isElementExist("Proceed with the plan", "proceedbtn1", 30)) {
			Thread.sleep(6000);

			PP.moveToElement("Proceed");
			System.out.println("moved to proceed");
			PP.clickOnElement("Button", "proceedbtn1", "proceedbtn1");
			// DriverManager.getDriver().findElement(By.xpath("//button[@id='sticky-proceed-plan']")).click();
		}
		/*
		 * WebElement element = DriverManager.getDriver().findElement(By.xpath(
		 * "//button[@id='sticky-proceed-plan']"));
		 * 
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
		 * element);
		 */

	}

	/********************************************************************************************************************************/

	public void ThankYouPage_ADA5() throws Exception {
		TP.isElementExist("Thank you label", "Thankyoulabel", 10);
		TP.isElementExist("for Processing", "forProcessing", 10);
		TP.isElementExist("notification", "notification", 10);
		TP.isElementExist("order", "order", 10);
		TP.isElementExist("reference Number", "referenceNumber", 10);
		TP.isElementExist("order Number", "orderNumber", 10);
		TP.isElementExist("purchase Summary", "purchaseSummary", 10);
		TP.isElementExist("Shipping Adress", "shippingAdress", 10);
		TP.isElementExist("shipping Adress Value", "shippingAdressValue", 10);
		TP.isElementExist("PaymentMethod", "paymentMethod", 10);
		TP.isElementExist("payment Method Value", "paymentMethodValue", 10);
		TP.isElementExist("Amount To Pay", "amountToPay", 10);
		TP.isElementExist("amount To Pay Value", "amountToPayValue", 10);

		TP.isElementExist("plan Inclusions", "planInclusions", 10);
		TP.isElementExist("konsulta MD", "konsultaMD", 10);
		TP.isElementExist("Glnsure", "glnsure", 10);
		TP.isElementExist("Addons", "addons", 10);
		TP.isElementExist("GS Add Surf 99", "GS99", 10);

		// System.out.println(TP.get_orderNumber().getText());
	}

	public void paymentPage_ADA5_GS99withOB(String PaymentOption) throws Exception {
		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Pay"));
		System.out.println("Validated title : Pay");

		PayP.moveToElement("Onetimepayment");

		PayP.isElementExist("paymentpage: Reminder", "PayReminder", 10);
		PayP.isElementExist("paymentpage: Select payment method ", "Selectpaymentmethod", 10);
		PayP.isElementExist("paymentpage: Gcash", "Gcash", 10);
		PayP.isElementExist("paymentpage: CCStraightpayment", "CCStraightpayment", 10);
		PayP.isElementExist("paymentpage: CCHSBC", "CCHSBC", 10);
		PayP.isElementExist("paymentpage: CCBPI", "CCBPI", 10);
		PayP.isElementExist("paymentpage: COD", "COD", 10);

		if (PaymentOption.equalsIgnoreCase("COD")) {
			PayP.js_clickOnElement("Button", "paymentpage: COD", "COD");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);
		} else if (PaymentOption.equalsIgnoreCase("CCStraightpayment")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCStraightpayment", "CCStraightpayment");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);
		} else if (PaymentOption.equalsIgnoreCase("CCHSBC")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCHSBC", "CCHSBC");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);
		} else if (PaymentOption.equalsIgnoreCase("CCBPI")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCBPI", "CCBPI");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);
		} else if (PaymentOption.equalsIgnoreCase("Gcash")) {
			PayP.js_clickOnElement("Button", "paymentpage: Gcash", "Gcash");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);
		}

		PayP.isElementExist("paymentpage: Onetimepayment", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage: planApplicationHeader", "planApplicationHeader", 10);
		PayP.isElementExist("paymentpage: Colapsebutton1", "Colapsebutton1", 10);

		PayP.clickOnElement("Button", "paymentpage: Colapsebutton1", "Colapsebutton1");

		PayP.isElementExist("paymentpage: OBLabel", "OBLabel", 10);
		PayP.isElementExist("paymentpage: OBPrice", "OBPrice", 10);
		PayP.isElementExist("paymentpage: Planname", "Planname", 10);
		PayP.isElementExist("paymentpage: Planamount", "Planamount", 10);
		PayP.isElementExist("paymentpage: TotalAmountHeader", "TotalAmountHeader", 10);
		PayP.isElementExist("paymentpage: TotalAmount", "TotalAmount", 10);
		PayP.isElementExist("paymentpage: Gotapromocodeheader", "Gotapromocodeheader", 10);
		PayP.isElementExist("paymentpage: PromoClickhere", "PromoClickhere", 10);
		PayP.isElementExist("paymentpage: ShiptothisaddressHeader", "ShiptothisaddressHeader", 10);

		PayP.isElementExist("paymentpage: Submitbutton", "Submitbutton", 10);
		PayP.isElementExist("paymentpage: Monthlypayment", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage: Noneedtopaythistoday", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage: Planname1", "Planname1", 10);
		PayP.isElementExist("paymentpage: Addons", "Addons", 10);

		PayP.moveToElement("Onetimepayment");
		PayP.isElementExist("paymentpage: TotalMonthlybill", "TotalMonthlybill", 10);
		PayP.isElementExist("paymentpage: MonthlysvcplusAddons", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("paymentpage: Tptalmonthlyamount", "Tptalmonthlyamount", 10);

		// PayP.isElementExist("paymentpage: Colapsebutton2", "Colapsebutton2",
		// 10);
		// PayP.clickOnElement("Button", "paymentpage: Colapsebutton2",
		// "Colapsebutton2");

		PayP.isElementExist("paymentpage: Colapsebutton1", "Colapsebutton1", 10);
		PayP.js_clickOnElement("Button", "paymentpage: Colapsebutton1", "Colapsebutton1");

		PayP.isElementExist("paymentpage:", "GSADD", 10);
		// PayP.isElementExist("paymentpage:", "AmazonPrime", 10);

		PayP.js_clickOnElement("Button", "Payment", "Submitbutton");

	}

	// ***********************************************************************************************************************************


	public void NavigateTo_Apply_MobilePostpaid() throws Exception {
		Thread.sleep(2000L);
		LP.moveToElement("link_Apply");
		Thread.sleep(2000L);
		LP.isElementExist("Mobile postpaid", "link_MobilePostpaid", 10);
		LP.isElementExist("View all devices", "link_ViewAllDevices", 10);

		if (LP.isClickable("link_MobilePostpaid", 5)) {
			LP.clickOnElement("Link", "Apply: Mobile Postpaid", "link_MobilePostpaid");
		}

		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Plans and Postpaid Smartphones"));
		System.out.println("Validated title : [Mobile Postpaid Page] Globe Plans and Postpaid Smartphones");
	}

	public void NavigateTo_Apply_ViewAllDevices() throws Exception {
		Thread.sleep(5000L);
		LP.moveToElement("link_Apply");
		Thread.sleep(3000L);
		LP.moveToElement("link_Apply");
		LP.isElementExist("Mobile postpaid", "link_MobilePostpaid", 10);
		LP.isElementExist("View all devices", "link_ViewAllDevices", 10);

		if (LP.isClickable("link_ViewAllDevices", 10)) {
			LP.moveToElement("link_Apply");
			LP.clickOnElement("Link", "Apply: View All Devices", "link_ViewAllDevices");
		}

		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Postpaid Devices"));
		System.out.println("Validated title : Apply Device Gallery page");
	}

	public void NavigateTo_ApplyMenu() throws Exception {
		Thread.sleep(2000L);
		LP.moveToElement("link_Apply");
		Thread.sleep(2000L);
		LP.moveToElement("link_Apply");
		LP.isElementExist("Mobile postpaid", "link_MobilePostpaid", 10);
		LP.isElementExist("View all devices", "link_ViewAllDevices", 10);

		if (LP.isClickable("link_Apply", 10)) {
			Thread.sleep(5000L);
			LP.moveToElement("link_Apply");
			LP.clickOnElement("Link", "Apply Menu", "link_Apply");
			LP.moveToElement("link_Apply");
		}

		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Plans and Postpaid Smartphones"));
		System.out.println("Validated title : [MAIN LANDING PAGE] Globe Plans and Postpaid Smartphones");
	}

	public void ValidateMenu() throws Exception{
		LP.isElementExist("Link Globe logo", "link_LogoGlobe", 10);
		LP.isElementExist("Menu bar link - Apply", "link_Apply", 10);
		LP.isElementExist("Menu bar link - Renew", "link_Renew", 10);
		LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);
		LP.isElementExist("Menu bar link - Buy", "link_MenuBuy", 10);
		LP.isElementExist("Menu bar link - Help", "link_Help", 10);
		LP.isElementExist("Menu bar link - Cart Icon", "CartIcon", 10);
		LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);
	}

	public void IacceptClick() throws Exception {
		if (LP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			Control.takeScreenshot();
			if (LP.isClickable("privacyAccept", 5)) {
				LP.jsClick("privacyAccept","privacyAccept");

			}
		}
	}
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
	public void Token(String token) throws Exception {

		
		LP.isElementExist("TokenInput", "TokenInput", 20);
		LP.get_TokenInput().sendKeys(token);
		LP.jsClick("TokenSubmit", "TokenSubmit");
	
}





	public void SelectPlanType(String plan)throws Exception {
		LP.clickOnElement("Listbox", "Gplan with Device", "gplanWithDevice");
		LP.isElementExist("GPlan with Device", "gplanWithDevice", 10);
		LP.isElementExist("GPlan with GCash", "gplanWithGCash", 10);
		LP.isElementExist("GPlan Plus SIM-Only", "gplanPlusSIMOnly", 10);
		LP.isElementExist("GPlan SIM-Only All Data", "gplanSIMOnlyAllData", 10);

		if (plan.equalsIgnoreCase("GCash")) {
			LP.clickOnElement("Listbox", "Gplan with GCash", "gplanWithGCash");
		} else if (plan.equalsIgnoreCase("Sim Only")) {
			LP.clickOnElement("Listbox", "Gplan with Sim Only", "gplanPlusSIMOnly");
		} else if (plan.equalsIgnoreCase("All Data")) {
			LP.clickOnElement("Listbox", "Gplan with All Data", "gplanSIMOnlyAllData");
		} else {
			LP.clickOnElement("Listbox", "Gplan with Device", "gplanWithDevice");
		}
	}

	/********************************************************************************************************************************/

	/************************************************************************************************************************/

	public void menuBar(String env) throws Exception {


		LP.isElementExist("Link Globe logo", "GlobeLogo", 10);
			Thread.sleep(3000);
			
			if(env.equalsIgnoreCase("Web"))
			{
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
				LP.isElementExist("Link_DeviceGallery", "Link_DeviceGallery", 10);
				LP.isElementExist("Link_ViewPlans", "Link_ViewPlans", 10);
				LP.isElementExist("Link_Brands", "Link_Brands", 10);
				LP.isElementExist("Link_Apple", "Link_Apple", 10);
				LP.isElementExist("Link_Samsung", "Link_Samsung", 10);
				LP.isElementExist("Link_Services", "Link_Services", 10);
				LP.isElementExist("Link_Gadget", "Link_Gadget", 10);
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
				Control.takeScreenshot();

				LP.isElementExist("Link Deals", "Link_Deals", 10);	
				LP.moveToElement("Link_Deals");
				LP.isElementExist("GPlanPLUS Discounted Devices", "Link_GPlanPLUS_Discounted_Devices", 10);
				LP.isElementExist("Link GlobePrepaidExclusives", "Link_Globe_Prepaid_Exclusives", 10);
				// step 4 : Hover on HomeInternet Link button
				Control.takeScreenshot();

				LP.isElementExist("Menu bar link - BuyLoad", "Link_QuickLinks", 10);
				LP.moveToElement("Link_QuickLinks");
				LP.isElementExist("Menu bar link - BuyLoad", "Link_BUYLoad", 10);
				LP.isElementExist("Home Internet postpaid", "Link_Register_your_SIM", 10);
				LP.isElementExist("Switch to Globe", "Link_SwitchtoGlobe", 10);
				LP.isElementExist("Help Support", "Link_HelpSupport", 10);
				Control.takeScreenshot();
			} 
			
			else if(env.equalsIgnoreCase("Android"))
			{
				System.out.println("**********Menu Bar Validation***********");
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
		
				

	}

	/**
	 * @throws InterruptedException ******************************************************************************************************************************/

	public void planevalues_inlandingpage(String planevalue) throws Exception
	{	
		switch (planevalue) {
		case "GPlan SIM-Only All Data 599":
			WebElement plan599=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' GPlan PLUS "+planevalue+" '])[2]"));			
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", plan599);

			WebElement gettheseplan=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' GPlan PLUS "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js41 = (JavascriptExecutor) DriverManager.getDriver();
			js41.executeScript("arguments[0].click();", gettheseplan);
			Control.captureScreenshot();
			break;
		case "GPlan 599 with Device":
			WebElement planW599=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
			jse.executeScript("arguments[0].click();", planW599);

			WebElement getplan=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js11 = (JavascriptExecutor) DriverManager.getDriver();
			js11.executeScript("arguments[0].click();", getplan);
			break;	

		case "GPlan 799 with Device":			
			for (int i = 0; i<2; i++) {
				if (LP.isClickable("prev2", 5)) {
					Thread.sleep(3000L);
					LP.jsClick("prev2", "prev2");				
				}
			}
			WebElement planW799=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", planW799);

			WebElement getplan799=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js12 = (JavascriptExecutor) DriverManager.getDriver();
			js12.executeScript("arguments[0].click();", getplan799);
			break;	

		case "GPlan 1999 with Device":

			for (int i = 0; i<=6; i++) {
				if (LP.isClickable("prev2", 5)) {
					Thread.sleep(3000L);
					LP.jsClick("prev2", "prev2");

				}
			}
			WebElement planW1999=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[1]"));
			JavascriptExecutor jss1 = (JavascriptExecutor) DriverManager.getDriver();
			jss1.executeScript("arguments[0].click();", planW1999);

			WebElement getplan1999=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[1]//following::button[1]"));
			JavascriptExecutor js13 = (JavascriptExecutor) DriverManager.getDriver();
			js13.executeScript("arguments[0].click();", getplan1999);
			break;	
		case "GPlan 1299 with Device":

			for (int i = 0; i<=2; i++) {
				if (LP.isClickable("next2", 5)) {
					Thread.sleep(3000L);	
					LP.jsClick("next2", "next2");

				}
			}
			WebElement planW1299=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor jsrr = (JavascriptExecutor) DriverManager.getDriver();
			jsrr.executeScript("arguments[0].click();", planW1299);
			LP.isElementExist("plan1299withdevice", "plan1299withdevice", 10);
			Control.captureScreenshot();
			WebElement getplan1299=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js77 = (JavascriptExecutor) DriverManager.getDriver();
			js77.executeScript("arguments[0].click();", getplan1299);
			break;
		case "GPlan SIM-Only All Data 799":

			WebElement plan799=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
			js1.executeScript("arguments[0].click();", plan799);


			WebElement gettheseplan1=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js45= (JavascriptExecutor) DriverManager.getDriver();
			js45.executeScript("arguments[0].click();", gettheseplan1);
			break;
		case "GPlan SIM-Only All Data 999":
			for (int i = 0; i < 3; i++) {
				if (LP.isClickable("prev2", 5)) {
					Thread.sleep(3000);
					LP.jsClick("prev2", "prev2");

				}
			}

			WebElement plan999=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+"  '])[2]"));
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", plan999);

			WebElement gettheseplan2=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js40 = (JavascriptExecutor) DriverManager.getDriver();
			js40.executeScript("arguments[0].click();", gettheseplan2);
			break;
		case "GPlan SIM-Only All Data 1299":
			for (int i = 0; i < 5; i++) {
				if (LP.isClickable("prev2", 5)) {
					Thread.sleep(3000);
					LP.jsClick("prev2", "prev2");

				}
			}

			WebElement plan1299=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+"  '])[2]"));
			JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
			js3.executeScript("arguments[0].click();", plan1299);

			WebElement gettheseplan3=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js14 = (JavascriptExecutor) DriverManager.getDriver();
			js14.executeScript("arguments[0].click();", gettheseplan3);
			break;
		case "GPlan SIM-Only All Data 1499":
			for (int i = 0; i < 5; i++) {
				if (LP.isClickable("prev2", 5)) {
					Thread.sleep(3000);	
					LP.jsClick("prev2", "prev2");

				}
			}

			WebElement plan1499=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
			js4.executeScript("arguments[0].click();", plan1499);

			WebElement gettheseplan4=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js15 = (JavascriptExecutor) DriverManager.getDriver();
			js15.executeScript("arguments[0].click();", gettheseplan4);
			break;
		case "GPlan SIM-Only All Data 1799":
			WebElement plan1799=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+"  '])[2]"));
			JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
			js5.executeScript("arguments[0].click();", plan1799);

			WebElement gettheseplan5=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+"  '])[2]//following::button[1]"));
			JavascriptExecutor js16 = (JavascriptExecutor) DriverManager.getDriver();
			js16.executeScript("arguments[0].click();", gettheseplan5);
			break;
		case "GPlan SIM-Only All Data 1999":
			WebElement plan1999=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", plan1999);

			//validation
			WebElement gettheseplan7=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js17 = (JavascriptExecutor) DriverManager.getDriver();
			js17.executeScript("arguments[0].click();", gettheseplan7);

			break;
		case "GPlan SIM-Only All Data 2499":
			WebElement plan2499=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor js7 = (JavascriptExecutor) DriverManager.getDriver();
			js7.executeScript("arguments[0].click();", plan2499);
			//validation
			WebElement gettheseplan8=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js18 = (JavascriptExecutor) DriverManager.getDriver();
			js18.executeScript("arguments[0].click();", gettheseplan8);
			break;
		case "GPlan 599 with GCash":
			WebElement plang599=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor js8 = (JavascriptExecutor) DriverManager.getDriver();
			js8.executeScript("arguments[0].click();", plang599);
			//validation

			WebElement gettheseplan9=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js19 = (JavascriptExecutor) DriverManager.getDriver();
			js19.executeScript("arguments[0].click();", gettheseplan9);
			break;
		case "1299":
			WebElement plan=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' GPlan PLUS "+planevalue+" '])[2]"));			
			JavascriptExecutor jssim = (JavascriptExecutor) DriverManager.getDriver();
			jssim.executeScript("arguments[0].click();", plan);

			WebElement simonly=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' GPlan PLUS "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor sim = (JavascriptExecutor) DriverManager.getDriver();
			sim.executeScript("arguments[0].click();", simonly);
			Control.captureScreenshot();
			break;
		case "GPlan 1499 with Device":
			for (int i = 0; i < 5; i++) {
				if (LP.isClickable("prev2", 5)) {
					Thread.sleep(2000);
					LP.jsClick("prev2", "prev2");

				}
			}

			WebElement planw1499=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor js99 = (JavascriptExecutor) DriverManager.getDriver();
			js99.executeScript("arguments[0].click();", planw1499);

			WebElement gettheseplan11=DriverManager.getDriver()	.findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]//following::button[1]"));
			JavascriptExecutor js20 = (JavascriptExecutor) DriverManager.getDriver();
			js20.executeScript("arguments[0].click();", gettheseplan11);
			break;

		default :
			System.out.println("Given mode planes noT exist");
		}


	}
	public void plantype_inlandingpage(String planetype) throws Exception
	{

		//LP.isElementExist("alldata", "alldata", 10);
		//LP.isElementExist("gcash", "gcash", 10);
		LP.isElementExist("WithDevice", "WithDevice", 10);
		LP.isElementExist("SIM-Only ", "simonly", 10);
		//((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", LP.get_WithDevice());


		switch (planetype) {
		case "alldata":
			LP.jsClick("alldata", "alldata");
			break;
		case "gcash":
			LP.jsClick("gcash", "gcash");
			break;
		case "withdevice":
			LP.jsClick("withdevice", "withdevice");
			break;


		default :
			System.out.println("Given mode planes noT exist");
		}
		Control.takeScreenshot();
		Thread.sleep(5000);
	}	

	//	public void Renew_LandingPage(String env) throws Exception {
	//		// step 6 : Go to Renew Landing Page
	//
	//		if(env.equalsIgnoreCase("UAT"))
	//		{	
	//		LP.isElementExist("Menu bar link - Renew", "link_Renew", 10);
	//		if (LP.isClickable("link_Renew", 5)) {
	//			LP.jsClick("link_Renew", "link_Renew");
	//			Thread.sleep(4000);
	//		}
	//		Control.takeScreenshot();
	//		}
	//		else {
	//			LP.isElementExist("Menu bar link - mobilepostpaid", "mobilepostpaid", 10);		
	//			LP.moveToElement("mobilepostpaid");
	//		if (LP.isClickable("mobilepostpaid", 5)) {
	//			LP.jsClick("mobilepostpaid", "mobilepostpaid");
	//		}  
	//		
	//		LP.moveToElement("mobilepostpaid");
	//		LP.isElementExist("Menu bar link - newplan", "newplan", 10);
	//		LP.isElementExist("Menu bar link - mobilepostpiaddevice", "mobilepostpiaddevice", 10);
	//		LP.isElementExist("Menu bar link - renewdevice", "renewdevice", 10);
	//		Control.takeScreenshot();
	//		Thread.sleep(4000);
	//		LP.jsClick("newplan", "newplan");
	//		Thread.sleep(4000);
	//		Control.takeScreenshot();
	//		}
	//		
	//	//	LP.scroll_vertical(400);
	//		LP.isElementExist("Welcome back to Globe!", "WelcomeBack", 10);
	//		LP.isElementExist("Get the postpaid plan made just for you.", "banner1postpaidplan", 10);
	//		LP.isElementExist("Continue with my current plan value", "banner1continueplan", 10);
	//		LP.isElementExist("Check Recomended plan", "banner1checrecomendedkplan", 10);
	//
	//		Control.takeScreenshot();
	//		if(env.equalsIgnoreCase("Preprod")) {
	//			if(LP.isElementExist("banner1checkplan", "banner1checkplan", 10))
	//			{
	//				LP.isElementExist("Check out our newest plans", "banner2checkout", 10);
	//			LP.isElementExist("GPlan SIM-Only 3799", "banner2simonly3799", 10);
	//			LP.isElementExist("Unlimited data surfing", "banner2unlimit", 10);
	//			LP.isElementExist("Plan starts at", "banner2planstart", 10);
	//			LP.isElementExist("banner2planstartvalue", "banner2planstartvalue", 10);
	//			LP.isElementExist("GPlan SIM-only 2499", "banner2simonly2499", 10);
	//			LP.isElementExist("More data, more fun", "banner2moredata", 10);
	//			LP.isElementExist("Plan starts at", "banner2planstartat", 10);
	//			LP.isElementExist("banner2planstartvalue2", "banner2planstartvalue2", 10);			
	//			}
	//		}	
	//		//LP.scroll_vertical(400);
	//		LP.isElementExist("Looking for devices?", "looking", 10);
	//		LP.isElementExist("prev", "prev", 10);
	//		LP.isElementExist("next", "next", 10);
	//		Control.captureScreenshot();
	//		for (int i = 0; i < 3; i++) {
	//			if (LP.isClickable("next", 5)) {
	//				Thread.sleep(1000L);
	//				LP.jsClick("next", "next");
	//				
	//			}
	//			
	//		}
	//		
	//		for (int i = 0; i < 3; i++) {
	//			if (LP.isClickable("prev", 5)) {
	//				Thread.sleep(1000L);
	//				//DL.scroll_vertical(200);
	//				LP.jsClick("prev", "prev");				
	//				
	//			}
	//			
	//		}
	//		LP.scroll_vertical(400);
	//		LP.isElementExist("Enjoy a #LifeMadeGreater ", "enjoy", 10);
	//		LP.isElementExist("SIM-Only ", "simonly", 10);
	//		LP.isElementExist("Device", "device", 10);
	//		LP.isElementExist("GCash", "gcash", 10);
	//		LP.isElementExist("All-Data", "alldata", 10);
	//		LP.isElementExist("prev2", "prev2", 10);
	//		for (int i = 0; i < 3; i++) {
	//			if (LP.isClickable("prev2", 5)) {
	//				Thread.sleep(3000);
	//				LP.jsClick("prev2", "prev2");				
	//				
	//				
	//			}
	//		}
	//
	//		LP.isElementExist("next2", "next2", 10);
	//		Control.takeScreenshot();
	//	}
	public void OTPPage_(String b) throws Exception {

		//assertTrue(DriverManager.getDriver().getTitle().contains("One-Time Password"));

		System.out.println("Navigated to OTP page ");

		String number = String.valueOf(b);

		String[] digits = number.split("(?<=.)");
        Thread.sleep(15000);
		for (int i = 0; i <= 5; i++) {
			
			Otp.get_otpInput().get(i).sendKeys(digits[i]);
		}
			if(Otp.isElementExist("submitButton", "submitButton", 10)) {
				Control.takeScreenshot();
				Otp.jsClick("submitButton", "submitButton");
			}
		
	}

	public void Renew_LandingPage(String Env) throws Exception {
		if(Env == "Preprod")
		{
		System.out.println("*****Renewal Landing Page Validation******");
		LP.isElementExist("Welcome back to Globe!", "WelcomeBack", 10);
		LP.isElementExist("Get the postpaid plan made just for you.", "banner1postpaidplan", 10);
		LP.isElementExist("Continue with my current plan value", "banner1continueplan", 10);
		LP.isElementExist("Check Recomended plan", "banner1checrecomendedkplan", 10);
		LP.isElementExist("ournewestplan", "ournewestplan", 10);
		Control.takeScreenshot();		
		LP.scroll_vertical(400);
		LP.isElementExist("Looking for devices?", "looking", 10);
		LP.isElementExist("Enjoy a #LifeMadeGreater ", "enjoy", 10);
			}
		else if ((Env == "Prod"))
		{
			LP.isElementExist("Welcome back to Globe!", "WelcomeBack", 10);
			LP.isElementExist("Get the postpaid plan made just for you.", "banner1postpaidplan", 10);
			LP.isElementExist("Continue with my current plan value", "banner1continueplan", 10);
			LP.isElementExist("Check Recomended plan", "banner1checrecomendedkplan", 10);
			LP.isElementExist("ournewestplan", "ournewestplan", 10);
			LP.isElementExist("recomended", "recomended", 10);
			Control.takeScreenshot();		
			LP.scroll_vertical(400);	
			LP.isElementExist("Check out our newest plans", "banner2checkout", 10);
			LP.isElementExist("GPlan SIM-Only 3799", "banner2simonly3799", 10);
			LP.isElementExist("Unlimited data surfing", "banner2unlimit", 10);
			LP.isElementExist("Plan starts at", "banner2planstart", 10);
			LP.isElementExist("banner2planstartvalue", "banner2planstartvalue", 10);
			LP.isElementExist("GPlan SIM-only 2499", "banner2simonly2499", 10);
			LP.isElementExist("More data, more fun", "banner2moredata", 10);
			LP.isElementExist("Plan starts at", "banner2planstartat", 10);
			LP.isElementExist("banner2planstartvalue2", "banner2planstartvalue2", 10);
			Control.takeScreenshot();
			LP.scroll_vertical(600);
			Control.takeScreenshot();
			LP.isElementExist("Looking for devices?", "looking", 10);
		//	LP.scroll_vertical(400);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", LP.get_AboutUs());
		Thread.sleep(2000);
		LP.scroll_vertical(800);
		Control.takeScreenshot();
		LP.isElementExist("Enjoy a #LifeMadeGreater ", "enjoy", 10);
		LP.isElementExist("SIM-Only ", "simonly", 10);
		LP.isElementExist("Device", "device", 10);
//		LP.isElementExist("GCash", "gcash", 10);
		LP.isElementExist("Devicetext", "Devicetext", 10);
		
		LP.isElementExist("prev2", "prev2", 10);
		for (int i = 0; i < 3; i++) {
			if (LP.isClickable("prev2", 5)) {
				Thread.sleep(3000);
				LP.jsClick("prev2", "prev2");

			}
		
		LP.isElementExist("next2", "next2", 10);
		Control.takeScreenshot();
	}
	}
	}
	public void CTBbuttonLanding(String CTB) throws Exception
	{

		System.out.println(" *********Clicking on CTB Button *********");
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", LP.get_WelcomeBack());
        Thread.sleep(3000);
		LP.isElementExist("CHECK ELIGIBULITY", "banner1continueplan", 10);
		LP.isElementExist("CHECK ELIGIBULITY", "banner1checrecomendedkplan", 10);

//		LP.isElementExist("link_CheckYourEligibility", "link_CheckYourEligibility", 20);
		Control.takeScreenshot();
		switch (CTB) {
		case "continueCTBbutton":
			LP.jsClick("continueCTBbutton", "continueCTBbutton");
			break;
		case "recomendedCTBbutton":
			((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", LP.get_banner1checrecomendedkplan());
			LP.jsClick("recomendedCTBbutton", "recomendedCTBbutton");
			break;
		case "EligibulityCTBbutton":
			LP.jsClick("EligibulityCTBbutton", "EligibulityCTBbutton");
			break;
		default :
			System.out.println("Given  CORRECT CTB BUTTON");
		}
	}/********************************************************************************************************************************/

	public void TypesofDevicesandPlans() throws Exception{
		LP.isElementExist("GPlan with Device", "gplanWithDevice", 10);
		LP.isElementExist("GPlan with GCash", "gplanWithGCash", 10);
		LP.isElementExist("GPlan Plus SIM-Only", "gplanPlusSIMOnly", 10);
		LP.isElementExist("GPlan SIM-Only All Data", "gplanSIMOnlyAllData", 10);

	}
	// ***********************************************************************************************************************************

	// ********************************************************************//

	// Recommended page FAQS
	// step 9: validating FAQ
	public void FAQ() throws Exception {

		// Faq1 exists
		// Faq1 exists
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", LP.get_acccordionButton1());
		LP.isElementExist("What is Globe", "faqText1", 10);
		// LP.isElementExist("acccordionText1", "acccordionText1", 10);
		LP.scroll_vertical(4053);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton2());
		LP.isElementExist("What are the requirements", "faqText2", 10);
		// LP.isElementExist("acccordionText2", "acccordionText2", 10);
		LP.scroll_vertical(4300);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton3());
		LP.isElementExist("How to upload your IDs", "faqText3", 10);
		// LP.isElementExist("acccordionText3", "acccordionText3", 10);
		LP.scroll_vertical(4600);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton4());
		LP.isElementExist("What IDs are accepted", "faqText4", 10);
		// LP.isElementExist("acccordionText4", "acccordionText4", 10);
		LP.scroll_vertical(5000);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton5());
		LP.isElementExist("What documents are accepted", "faqText5", 10);
		// LP.isElementExist("acccordionText5", "acccordionText5", 10);
		LP.scroll_vertical(5500);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton6());
		LP.isElementExist("Are there additional requirements for foreign applicants?", "faqText6", 10);
		// LP.isElementExist("acccordionText6", "acccordionText6", 10);
		LP.scroll_vertical(5800);

	}

	/********************************************************************************************************************************/

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
			System.out.println("footer Section is present");
		} else {
			System.out.println("footer Section is not present");
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

	}

	/********************************************************************************************************************************/

	public void Checkyoureligibility() throws Exception {
		if (LP.isElementExist("Checkyoureligibility", "link_CheckYourEligibility", 10)) {
			if (LP.isClickable("link_CheckYourEligibility", 5)) {
				JavascriptExecutor jsCheck = (JavascriptExecutor) DriverManager.getDriver();
				jsCheck.executeScript("arguments[0].click();", LP.get_link_CheckYourEligibility());
			}
		}
	}

	/********************************************************************************************************************************/
	public void Plan1499withDevice() throws Exception{

		PP.isElementExist("Device", "PDP_Device", 10);
		PP.clickOnElement("Option", "PDP_Device", "PDP_Device");

		for (int i = 0; i <= 6; i++) {

			if (LP.isElementExist("GPlan1499", "GPlan1499", 10)) {
				LP.clickOnElement("Option", "GPlan1499", "GPlan1499");
				break;

			} else {

				System.out.println("GPlan599 is not yet displayed");

				PP.isElementExist("PDP Page: Plan  Device Carousel", "CarouselDeviceplanNext", 5);
				PP.clickOnElement("Next Icon", "CarouselDeviceplanNext", "CarouselDeviceplanNext");

			}
		}

	}

	/********************************************************************************************************************************/
	public void Plan599withDevice() throws Exception{

		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);

		PP.clickOnElement("Option", "PDP_Device", "PDP_Device");

		for (int i = 0; i <= 6; i++) {

			if (LP.isElementExist("GPlan599", "GPlan599", 10)) {
				LP.javascript_clickOnElement(LP.get_GPlan599());
				break;

			} else {

				System.out.println("GPlan599 is not yet displayed");

				PP.isElementExist("PDP Page: Plan  Device Carousel", "CarouselDeviceplanNext", 5);
				PP.clickOnElement("Next Icon", "CarouselDeviceplanNext", "CarouselDeviceplanNext");

			}
		}

	}
	/********************************************************************************************************************************/
	public void Plan2499withDevice()throws Exception {


		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);

		PP.isElementExist("Device", "PDP_Device", 10);
		PP.clickOnElement("Option", "PDP_Alldata", "PDP_Alldata");

		for (int i = 0; i <= 7; i++) {

			if (LP.isElementExist("GPlan2499", "GPlan2499", 10)) {
				LP.javascript_clickOnElement(LP.get_GPlan2499());
				break;

			} else {

				System.out.println("GPlan2499 is not yet displayed");

				PP.isElementExist("PDP Page: Plan  Device Carousel", "CarouselDeviceplanNext", 5);
				PP.clickOnElement("Next Icon", "CarouselDeviceplanNext", "CarouselDeviceplanNext");

			}
		}

	}
	// ***********************************************************************************************************************************


	public void PDPGplanwithDevicePlan_BrowseDevicesInCarousel() throws Exception {
		Thread.sleep(2000L);
		PP.moveToElement("CarouselDeviceplanprevious");
		PP.isElementExist("PDP Page: Plan Device Carousel", "CarouselDeviceplanprevious", 5);
		PP.isElementExist("PDP Page: Plan  Device Carousel", "CarouselDeviceplanNext", 5);
		/*
		 * JavascriptExecutor PDPAlldata = (JavascriptExecutor)
		 * DriverManager.getDriver();
		 * PDPAlldata.executeScript("arguments[0].click();",
		 * PP.get_PDP_Alldata()); //LP.scroll_vertical(453);
		 */ for (int i = 0; i < 5; i++) {

			 Thread.sleep(2000L);
			 JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			 js.executeScript("arguments[0].click();", PP.get_CarouselDeviceplanprevious());
		 }

		 for (int i = 0; i < 2; i++) {
			 Thread.sleep(2000L);
			 PP.get_CarouselDeviceplanNext().click();
		 }

		 PP.isElementExist("Device", "PDP_Device", 10);
		 PP.isElementExist("Gcash", "PDP_Gcash", 10);
		 PP.isElementExist("Simonly", "PDP_Simonly", 10);
		 PP.isElementExist("AllData", "PDP_Alldata", 10);

	}


	public void SearchDevice(String DeviceName) throws Exception {

		Constant.dataMap.set(Map);
		PP.get_SearchByDevice().clear();
		PP.get_SearchByDevice().sendKeys(DeviceName);
		PP.get_SearchByDevice().sendKeys(Keys.ENTER);
		PP.get_SearchByDevice().sendKeys(Keys.ENTER);

		System.out.println("Search Device : " + DeviceName);
		PP.scroll_vertical(600);
		Constant.dataMap.get().put("Search_Device", DeviceName);
	}

	public void PDPGplanwithDevice_BrowseDevicesInCarousel() throws Exception {
		Thread.sleep(5000L);
		PP.moveToElement("CarouselDevicePrevBtn");
		PP.isElementExist("PDP Page: Device Carousel", "CarouselDevicePrevBtn", 5);
		PP.isElementExist("PDP Page: Device Carousel", "CarouselDeviceNextBtn", 5);
		LP.scroll_vertical(-200);
		for (int i = 0; i < 5; i++) {

			// Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", PP.get_CarouselDeviceNextBtn());
		}

		for (int i = 0; i < 2; i++) {
			Thread.sleep(2000L);
			PP.get_CarouselDeviceNextBtn().click();
		}

	}

	public void PDPGplanwithDevice1799() throws Exception {

		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);
		Thread.sleep(3000L);
		PP.isElementExist("Plan 599 With Device", "Price_599WithDevice", 10);
		PP.isElementExist("Color header", "Color_header", 10);
		PP.isElementExist("Color", "Color_Click", 10);
		PP.isElementExist("Color With Border", "Color_color", 10);
		PP.isElementExist("Contract Duration", "Contractduration_header", 10);
		PP.isElementExist("Banner", "Banner", 10);

		// Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(353);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Data_checkbox());

		PP.isElementExist("GS99", "GSAddsurf99", 10);
		// PP.clickOnElement("Button", "GSAddsurf99", "GSAddsurf99");

		JavascriptExecutor js99 = (JavascriptExecutor) DriverManager.getDriver();
		js99.executeScript("arguments[0].click();", PP.get_GSAddsurf99());

		// Banner
		PP.isElementExist("withDevice_Banner", "Banner", 10);

		// Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		// PP.clickOnElement("Button", "Amazon", "Amazonprime");
		JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
		jsa.executeScript("arguments[0].click();", PP.get_Amazonprime());

		JavascriptExecutor Viupremium = (JavascriptExecutor) DriverManager.getDriver();
		Viupremium.executeScript("arguments[0].click();", PP.get_Viupremium());

		JavascriptExecutor Spotifypremium = (JavascriptExecutor) DriverManager.getDriver();
		Spotifypremium.executeScript("arguments[0].click();", PP.get_Spotifypremium());

		// Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());

		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		// PP.clickOnElement("Button", "MySuperDuo", "MySuperDuo");
		JavascriptExecutor MyDuo = (JavascriptExecutor) DriverManager.getDriver();
		MyDuo.executeScript("arguments[0].click();", PP.get_MyDuo());

		// Lifestyle Addon
		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());

		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		JavascriptExecutor easyRoam = (JavascriptExecutor) DriverManager.getDriver();
		easyRoam.executeScript("arguments[0].click();", PP.get_easyRoam());

		JavascriptExecutor Gocallid199 = (JavascriptExecutor) DriverManager.getDriver();
		Gocallid199.executeScript("arguments[0].click();", PP.get_Gocallid199());

		PP.isElementExist("Review", "Reviewmyplan", 10);

		JavascriptExecutor Reviewmyplan = (JavascriptExecutor) DriverManager.getDriver();
		Reviewmyplan.executeScript("arguments[0].click();", PP.get_Reviewmyplan());

		// JavascriptExecutor jsd = (JavascriptExecutor)
		// DriverManager.getDriver();
		// jsd.executeScript("arguments[0].click();", PP.get_Dragbutton());

		Thread.sleep(1000);

		// PP.clickOnElement("Button", "Reviewmyplan", "Reviewmyplan");
		// PP.isElementExist("lifestyleaddon", "Viewplanbreakdwn", 10);
		// PP.clickOnElement("Button", "Dropdown", "dropdown_Planbreakdwn");
		//
		// //ViewBreakdown
		PP.isElementExist("Planname", "Planname", 10);
		PP.isElementExist("Planamount", "PlanValue", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuoaddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("Viu", "ViuAddon", 10);
		PP.isElementExist("Spotify", "SpotifyAddon", 10);
		PP.isElementExist("EasyRoama", "EasyRoamaddon  ", 10);
		PP.isElementExist("GSAddSur99", "GSAddSur99addon  ", 10);

		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);
		PP.isElementExist("Untick", "UntickMyDuo", 10);

		PP.isElementExist("Re computemy plan", "Recomputemyplan", 10);

		JavascriptExecutor Recomputemyplan = (JavascriptExecutor) DriverManager.getDriver();
		Recomputemyplan.executeScript("arguments[0].click();", PP.get_Recomputemyplan());

	}

	public void PDPGplanwithDevice599() throws Exception {

		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);
		Thread.sleep(3000L);
		PP.isElementExist("Plan 599 With Device", "Price_599WithDevice", 10);
		PP.isElementExist("Color header", "Color_header", 10);
		PP.isElementExist("Color", "Color_Click", 10);
		PP.isElementExist("Color With Border", "Color_color", 10);
		PP.isElementExist("Contract Duration", "Contractduration_header", 10);
		PP.isElementExist("Banner", "Banner", 10);

		// Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(353);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Data_checkbox());

		PP.isElementExist("GS99", "GSAddsurf99", 10);
		// PP.clickOnElement("Button", "GSAddsurf99", "GSAddsurf99");

		JavascriptExecutor js99 = (JavascriptExecutor) DriverManager.getDriver();
		js99.executeScript("arguments[0].click();", PP.get_GSAddsurf99());

		// Banner
		PP.isElementExist("withDevice_Banner", "Banner", 10);

		// Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		// PP.clickOnElement("Button", "Amazon", "Amazonprime");
		JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
		jsa.executeScript("arguments[0].click();", PP.get_Amazonprime());

		JavascriptExecutor Viupremium = (JavascriptExecutor) DriverManager.getDriver();
		Viupremium.executeScript("arguments[0].click();", PP.get_Viupremium());

		JavascriptExecutor Spotifypremium = (JavascriptExecutor) DriverManager.getDriver();
		Spotifypremium.executeScript("arguments[0].click();", PP.get_Spotifypremium());

		// Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());

		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		// PP.clickOnElement("Button", "MySuperDuo", "MySuperDuo");
		JavascriptExecutor MyDuo = (JavascriptExecutor) DriverManager.getDriver();
		MyDuo.executeScript("arguments[0].click();", PP.get_MyDuo());

		// Lifestyle Addon
		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());

		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		JavascriptExecutor easyRoam = (JavascriptExecutor) DriverManager.getDriver();
		easyRoam.executeScript("arguments[0].click();", PP.get_easyRoam());

		JavascriptExecutor Gocallid199 = (JavascriptExecutor) DriverManager.getDriver();
		Gocallid199.executeScript("arguments[0].click();", PP.get_Gocallid199());

		PP.isElementExist("Review", "Reviewmyplan", 10);

		JavascriptExecutor Reviewmyplan = (JavascriptExecutor) DriverManager.getDriver();
		Reviewmyplan.executeScript("arguments[0].click();", PP.get_Reviewmyplan());

		// JavascriptExecutor jsd = (JavascriptExecutor)
		// DriverManager.getDriver();
		// jsd.executeScript("arguments[0].click();", PP.get_Dragbutton());

		Thread.sleep(1000);

		// PP.clickOnElement("Button", "Reviewmyplan", "Reviewmyplan");
		// PP.isElementExist("lifestyleaddon", "Viewplanbreakdwn", 10);
		// PP.clickOnElement("Button", "Dropdown", "dropdown_Planbreakdwn");
		//
		// //ViewBreakdown
		PP.isElementExist("Planname", "Planname", 10);
		PP.isElementExist("Planamount", "PlanValue", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuoaddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("Viu", "ViuAddon", 10);
		PP.isElementExist("Spotify", "SpotifyAddon", 10);
		PP.isElementExist("EasyRoama", "EasyRoamaddon  ", 10);
		PP.isElementExist("GSAddSur99", "GSAddSur99addon  ", 10);

		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);
		PP.isElementExist("Untick", "UntickMyDuo", 10);
		//PP.clickOnElement("UntickMyDuo", "UntickMyDuo", "UntickMyDuo");
		PP.javascript_clickOnElement(PP.get_UntickMyDuo());
		PP.isElementExist("Re computemy plan", "Recomputemyplan", 10);

		JavascriptExecutor Recomputemyplan = (JavascriptExecutor) DriverManager.getDriver();
		Recomputemyplan.executeScript("arguments[0].click();", PP.get_Recomputemyplan());

	}

	/********************
	 * DAF PAGE VALIDATION
	 * 
	 * @throws InterruptedException
	 *************************/

	/********************
	 * Personal And Billing ADDRESS In DAF PAGE
	 *************************/


	private String RandomString(int j) {
		// TODO Auto-generated method stub
		// return null;
		char c[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int randomPosition;
		String randomString = "";
		for (int i = 0; i < j; i++) {
			randomPosition = generateRandomIntIntRange(0, 51);
			randomString = randomString + c[randomPosition];
		}
		// System.out.println(randomString);
		return randomString;
	}

	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	/******************** Alternative RecipentDetails *************************/

	/********************************************************************/

	/*********************** Next Upload Document Button **********************/

	public void Upload_file2() throws AWTException, InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		// js1.executeScript("arguments[0].click();", Form.Choosefile3Click());
		//Form.Choosefile3Click().sendKeys(System.getProperty("user.dir") +"\\resources\\Documents\\POFCNEW.jpg");		    
		//Form.Choosefile3Click().sendKeys("D:\\lambda\\GlobeOnline_Lambda-master\\GlobeOnline_Lambda-master\\src\\test\\resources\\Documents\\POFCNEW.jpg");

		try
		{
			WebElement addFile = DriverManager.getDriver().findElement(By.xpath("//input[@id='pofcDocRef']"));
			((RemoteWebElement)addFile).setFileDetector(new LocalFileDetector());
			addFile.sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POFCNEW.jpg");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		Thread.sleep(3000);


	}
	public void uploadPOFC() throws Exception {

		if(PayP.isElementExist("Proof Of Financial Capacity Text", "ProofOfFinancialCapacity", 10)) {
			PayP.isElementExist("Your Chosen Plan MayBe Above Your Current Spending Limit text", "YourChosenPlanMayBeAboveYourCurrentSpendingLimit", 10);
	
			PayP.isElementExist("pofcDropdown", "pofcDropdown", 10);
	
			PayP.scroll_vertical(130);
			Thread.sleep(2000L);
			String POFC = "BIR Form 1700";
			PayP.Select_dropdown(POFC); 
			System.out.println("Select ID type: "+POFC);
	
			PayP.isElementExist("uploadScannedCopy", "uploadScannedCopy", 10);
			PayP.isElementExist("Maximum File Size Is 10MB", "MaximumFileSizeIs10MB", 10);
			PayP.isElementExist("Photos Must be In PNG, JPG, GIF,HEIC, PDF Format", "PhotosMustbeInPNG_JPG_GIF_HEIC_PDF_Format", 10);
			PayP.isElementExist("Make Sure Your Document Is Clear", "MakeSureYourDocumentIsClear", 10);
			PayP.isElementExist("Make Sure The Image Is Not Blurred And Not Cropped", "MakeSureTheImageIsNotBlurredAndNotCropped", 10);
	
			Thread.sleep(3000);
			try
			{
				WebElement addFile = DriverManager.getDriver().findElement(By.xpath("//input[@id='pofcDocRef']"));
				((RemoteWebElement)addFile).setFileDetector(new LocalFileDetector());
				addFile.sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POFCNEW.jpg");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			Thread.sleep(3000);
			}
	}


	/********************************************************************************************************************************/
	public String getBrowserName() {
		Capabilities cap = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
		return cap.getBrowserName();
	}

	public void personalInfoPageHeadingColors() throws Exception {
		// WebDriver driver = new ChromeDriver();
		// identify text
		WebElement personalInfoCss = DriverManager.getDriver()
				.findElement(By.xpath("//div[text()='Personal information']"));
		WebElement UploadDocsCss = DriverManager.getDriver().findElement(By.xpath("//div[text()='Upload documents']"));
		// System.out.println(personalInfoCss);
		// obtain color in rgba
		String personalInfoColor = personalInfoCss.getCssValue("color");
		String UploadDocsColor = UploadDocsCss.getCssValue("color");
		// System.out.println(s);
		if (personalInfoColor == "var(--color-functional--primary") {
			System.out.println("Personal information is in blue color");
		}
		if (PP.isElementExist("DeliveryInfoCss", "DeliveryInfoCss", 10)) {
			WebElement DeliveryInfoCss = DriverManager.getDriver()
					.findElement(By.xpath("//div[text()='Delivery information']"));
			String DeliveryInfoColor = DeliveryInfoCss.getCssValue("color");

			if (DeliveryInfoColor == "var(--color-functional-neutral-a4") {
				System.out.println("Personal information is in Grey color");
			}
		}
		if (UploadDocsColor == "var(--color-functional-neutral-a4") {
			System.out.println("Personal information is in Grey color");
		}
	}

	public void DeliveryInfoPageHeadingColors() throws Exception {
		// WebDriver driver = new ChromeDriver();
		// identify text
		WebElement personalInfoCss = DriverManager.getDriver()
				.findElement(By.xpath("//div[text()='Personal information']"));
		WebElement UploadDocsCss = DriverManager.getDriver().findElement(By.xpath("//div[text()='Upload documents']"));
		// System.out.println(personalInfoCss);
		// obtain color in rgba
		String personalInfoColor = personalInfoCss.getCssValue("color");
		String UploadDocsColor = UploadDocsCss.getCssValue("color");
		// System.out.println(s);
		if (personalInfoColor == "var(--color-functional--primary") {
			System.out.println("Personal information is in blue color");
		}
		if (PP.isElementExist("DeliveryInfoCss", "DeliveryInfoCss", 10)) {
			WebElement DeliveryInfoCss = DriverManager.getDriver()
					.findElement(By.xpath("//div[text()='Delivery information']"));
			String DeliveryInfoColor = DeliveryInfoCss.getCssValue("color");

			if (DeliveryInfoColor == "var(--color-functional--primary") {
				System.out.println("Personal information is in blue color");
			}
		}
		if (UploadDocsColor == "var(--color-functional-neutral-a4") {
			System.out.println("Personal information is in Grey color");
		}
	}

	public void UploadDocumentsPageHeadingColors() throws Exception {
		// WebDriver driver = new ChromeDriver();
		// identify text
		WebElement personalInfoCss = DriverManager.getDriver()
				.findElement(By.xpath("//div[text()='Personal information']"));
		WebElement UploadDocsCss = DriverManager.getDriver().findElement(By.xpath("//div[text()='Upload documents']"));
		// System.out.println(personalInfoCss);
		// obtain color in rgba
		String personalInfoColor = personalInfoCss.getCssValue("color");
		String UploadDocsColor = UploadDocsCss.getCssValue("color");
		// System.out.println(s);
		if (personalInfoColor == "var(--color-functional--primary") {
			System.out.println("Personal information is in blue color");
		}
		if (PP.isElementExist("DeliveryInfoCss", "DeliveryInfoCss", 10)) {
			WebElement DeliveryInfoCss = DriverManager.getDriver()
					.findElement(By.xpath("//div[text()='Delivery information']"));
			String DeliveryInfoColor = DeliveryInfoCss.getCssValue("color");

			if (DeliveryInfoColor == "var(--color-functional--primary") {
				System.out.println("Personal information is in blue color");
			}
		}
		if (UploadDocsColor == "var(--color-functional--primary") {
			System.out.println("Personal information is in blue color");
		}
	}

	// Order summary page


	public void paymentPageGplanewithVisaMastercard1799()throws Exception {
		PayP.isElementExist("paymentpage", "Selectpaymentmethod", 10);
		PayP.isElementExist("Gcash", "Gcash", 10);
		PayP.isElementExist("paymentpage", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage", "planApplicationHeader", 10);
		PayP.clickOnElement("Button", "Planapplication", "planApplicationHeader");
		PayP.isElementExist("Total Amount Header", "TotalAmountHeader", 10);
		PayP.isElementExist("Total Amount", "TotalAmount", 10);
		String s = PayP.get_TotalAmount().getText().substring(1);
		System.out.println("hi");
		/*if (Integer.parseInt(s) >= 50000) {
			if (!PayP.isElementExist("", "COD", 10)) {
				System.out.println(
						"The total amount for plan to be paid for renewal is above 50K. So COD Option is Disabled");
			}
		}*/
		PayP.isElementExist("Proo Header", "Gotapromocodeheader", 10);
		PayP.isElementExist("Promo", "PromoClickhere", 10);
		PayP.isElementExist("Shipaddress", "ShiptothisaddressHeader", 10);

		// JavascriptExecutor Visamastercard = (JavascriptExecutor)
		// DriverManager.getDriver();
		// Visamastercard.executeScript("arguments[0].click();",
		// PayP.get_VisaMastercard());

		PayP.isElementExist("paymentpage", "Submitbutton", 10);

		PayP.isElementExist("paymentpage", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage", "Plannamegcash21", 10);

		// Addons
		PayP.isElementExist("Addons", "Addons", 10);
		// Colapsebutton2
		//PayP.isElementExist("DevicePlan", "GPlan1799withDevice", 10);

		//PayP.clickOnElement("Button", "Addons", "Addons");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PayP.get_Addons());

		//		PayP.isElementExist("myDuo", "myDuo", 10);
		PayP.isElementExist("AmazonPrime", "AmazonPrime", 10);
		PayP.isElementExist("Viupremium", "Viupremium", 10);
		PayP.isElementExist("EasyRoam", "EasyRoam", 10);
		PayP.isElementExist("Gocallid", "Gocallid", 10);
		PayP.isElementExist("Gsaddsurf", "Gsaddsurf", 10);

		PayP.isElementExist("Total Monthly bill", "TotalMonthlybill", 10);
		PayP.isElementExist("Montlyserviceaddons", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("Totalamount", "Totalmontlyamount", 10);
	}

	public void paymentPageGplanewithVisaMastercard599()throws Exception {
		PayP.isElementExist("paymentpage", "Selectpaymentmethod", 10);
		PayP.isElementExist("Gcash", "Gcash", 10);
		PayP.isElementExist("paymentpage", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage", "planApplicationHeader", 10);
		PayP.clickOnElement("Button", "Planapplication", "planApplicationHeader");
		PayP.isElementExist("Total Amount Header", "TotalAmountHeader", 10);
		PayP.isElementExist("Total Amount", "TotalAmount", 10);
		String s = PayP.get_TotalAmount().getText().substring(1);
		if (Integer.parseInt(s) >= 50000) {
			if (!PayP.isElementExist("", "COD", 10)) {
				System.out.println(
						"The total amount for plan to be paid for renewal is above 50K. So COD Option is Disabled");
			}
		}
		PayP.isElementExist("Proo Header", "Gotapromocodeheader", 10);
		PayP.isElementExist("Promo", "PromoClickhere", 10);
		PayP.isElementExist("Shipaddress", "ShiptothisaddressHeader", 10);

		// JavascriptExecutor Visamastercard = (JavascriptExecutor)
		// DriverManager.getDriver();
		// Visamastercard.executeScript("arguments[0].click();",
		// PayP.get_VisaMastercard());

		PayP.isElementExist("paymentpage", "Submitbutton", 10);

		PayP.isElementExist("paymentpage", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage", "Plannamegcash21", 10);

		// Addons
		PayP.isElementExist("Addons", "Addons", 10);
		// Colapsebutton2
		PayP.isElementExist("DevicePlan", "GPlan599withDevice", 10);

		PayP.clickOnElement("Button", "Addons", "Addons");

		PayP.isElementExist("myDuo", "myDuo", 10);
		PayP.isElementExist("AmazonPrime", "AmazonPrime", 10);
		PayP.isElementExist("Viupremium", "Viupremium", 10);
		PayP.isElementExist("EasyRoam", "EasyRoam", 10);
		PayP.isElementExist("Gocallid", "Gocallid", 10);
		PayP.isElementExist("Gsaddsurf", "Gsaddsurf", 10);

		PayP.isElementExist("Total Monthly bill", "TotalMonthlybill", 10);
		PayP.isElementExist("Montlyserviceaddons", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("Totalamount", "Totalmontlyamount", 10);
	}

	public void paymentPageGplanewithGCash2499() throws Exception {
		Thread.sleep(2000);
		PayP.isElementExist("paymentpage", "Selectpaymentmethod", 10);
		PayP.isElementExist("Gcash", "Gcash", 10);
		PayP.isElementExist("paymentpage", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage", "planApplicationHeader", 10);
		PayP.isElementExist("Total Amount Header", "TotalAmountHeader", 10);
		PayP.isElementExist("Total Amount", "TotalAmount", 10);
		String s = PayP.get_TotalAmount().getText().substring(1);
		String a = s.replaceFirst(",", "");
		String[] b = a.split(".");
		// b.toString();
		// if (Integer.parseInt(b) >= 50000) {
		if (!PayP.isElementExist("", "COD", 10)) {
			System.out.println(
					"The total amount for plan to be paid for renewal is above 50K. So COD Option is Disabled");
		}

		// }
		PayP.isElementExist("Proo Header", "Gotapromocodeheader", 10);
		PayP.isElementExist("Promo", "PromoClickhere", 10);

		PayP.isElementExist("paymentpage", "Submitbutton", 10);

		PayP.isElementExist("paymentpage", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage", "Noneedtopaythistoday", 10);

		// Addons

		PayP.isElementExist("Addons", "Addons", 30);
		// Colapsebutton2
		PayP.scroll_vertical(100);
		PP.js_clickOnElement("dropdown toggle", "Addons", "Addons");
		// PayP.clickOnElement("Button", "Addons", "Addons");
		PayP.scroll_vertical(400);

		PayP.isElementExist("AmazonPrime", "AmazonPrime", 10);
		PayP.isElementExist("Viupremium", "Viupremium", 10);
		PayP.isElementExist("Gsaddsurf", "Gsaddsurf", 10);

		PayP.isElementExist("Spotifypremium", "Spotifypremium", 10);

		PayP.isElementExist("Total Monthly bill", "TotalMonthlybill", 10);
		PayP.isElementExist("Montlyserviceaddons", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("Totalamount", "Totalmontlyamount", 10);
	}

	public void SelectPaymentOption(String PaymentOption) throws Exception{
		PayP.moveToElement("Onetimepayment");
		// PayP.isElementExist("paymentpage: Reminder", "PayReminder", 10);
		PayP.isElementExist("paymentpage: Select payment method ", "Selectpaymentmethod", 10);
		PayP.isElementExist("paymentpage: VisaMastercard", "VisaMastercard", 10);
		PayP.isElementExist("paymentpage: Gcash", "Gcash", 10);
		String s = PayP.get_TotalAmount().getText().substring(1);
		// if (Integer.parseInt(s) >= 50000) {
		if (!PayP.isElementExist("", "COD", 10)) {
			System.out.println(
					"The total amount for plan to be paid for renewal is above 50K. So COD Option is Disabled");
		}
		// }
		else {
			PayP.isElementExist("paymentpage: COD", "COD", 10);
		}
		if (PaymentOption.equalsIgnoreCase("COD")) {
			PayP.js_clickOnElement("Button", "paymentpage: COD", "COD");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);
		} else if (PaymentOption.equalsIgnoreCase("VisaMasterCard")) {
			PayP.js_clickOnElement("Button", "paymentpage: Visa Mastercard", "VisaMastercard");
			// PayP.isElementExist("paymentpage: PayOption Statement",
			// "COD_Statment", 10);
		} else if (PaymentOption.equalsIgnoreCase("Gcash")) {
			PayP.js_clickOnElement("Button", "paymentpage: Gcash", "Gcash");
			// PayP.isElementExist("paymentpage: PayOption Statement",
			// "COD_Statment", 10);

		}
		else if (PaymentOption.equalsIgnoreCase("CCStraightpayment")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCStraightpayment", "CCStraightpayment");
			// PayP.isElementExist("paymentpage: PayOption Statement",
			// "COD_Statment", 10);
		}

		Constant.dataMap.get().put("Magento_PaymentShippingMethod", PaymentOption);
		Constant.dataMap.get().put("OMT_PaymentMethodUsed", PaymentOption);
	}

	public void pay_with_GCash() throws Exception {
		Thread.sleep(4000);
		// PP.isElementExist("Credit card", "CreditCard", 10);
		assertTrue(DriverManager.getDriver().getTitle().contains("GCash Login"));
		//9270002678
		PP.isElementExist("GCash Login", "GCashMobilenumber", 10);
		DriverManager.getDriver().findElement(PP.GCashMobilenumber).sendKeys("9270002678");
		DriverManager.getDriver().findElement(PP.GCashLoginNext).click();
		if (PP.isElementExist("MPIN", "MPIN", 10)) {

			for (int i = 1; i <= 4; i++) {
				WebElement a=DriverManager.getDriver().findElement(By.xpath("//input[@class='ap-password-focus']"));
				PP.javascript_clickOnElement(a);
				a.sendKeys("1");
			}
		}
		PP.javascript_clickOnElement(PP.get_NextBtn());
		Thread.sleep(3000);
		PP.clickOnElement("Agree Button", "AgreeBtn", "AgreeBtn");
		//PP.clickOnElement("Submit Button", "SubmitBtn", "SubmitBtn");
		PP.clickOnElement("Pay amount Button", "PayBtn", "PayBtn");

	}
	
	public void enterPayment_Details(String payMethod,String GcashNum) throws Exception {
		if(payMethod.equalsIgnoreCase("Visa")) {
			PayP.isElementExist("Credit Card Page", "creditCardPage", 100);
			String cardNumber = "3569 9900 1009 5841";
			String expiryDate = "0330";
			String cvv = "737";


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

	/********************************************************************************************************************************/
	public void pay_via_creditCard() throws Exception {
		PayP.isElementExist("Credit Card Page", "creditCardPage", 100);
		String cardNumber = "3569 9900 1009 5841";
		String expiryDate = "0330";
		String cvv = "737";


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


		} else {
			System.out.println("Credit Card Page do not open");
		}

	}
	public void selectalldata ()throws Exception
	{
		Custm.isElementExist("selected alldatapermonth", "alldatapermonth", 10);
		JavascriptExecutor jsCheck = (JavascriptExecutor) DriverManager.getDriver();
		jsCheck.executeScript("arguments[0].click();", Custm.get_alldatapermonth());
		Custm.isElementExist("selected calldata", "calldata", 10);
		Custm.isElementExist("selected wifidata", "wifidata", 10);
		Custm.isElementExist("selected unlimiteddata", "unlimiteddata", 10);
		Custm.isElementExist("selected inclusiontypesdata", "inclusiontypesdata", 10);
		Custm.isElementExist("selected gettheseplan", "gettheseplan", 10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", Custm.get_gettheseplan());
	}

	private void clickPayOrderOnPayScreen() throws InterruptedException {
		// TODO Auto-generated method stub
		if (PayP.isClickable("payOrder", 100)) {
			Thread.sleep(5000);
			PayP.get_payOrder().click();
			System.out.println("Clicked on pay on payment page");
		} else {
			System.out.println("Fail : to click on pay button on payment page");
		}
	}

	/********************************************************************************************************************************/
	public void capture_orderID() {
		String dateTimeStamp = "";
		String Referencenum = TP.get_Orderid().getText();
		dateTimeStamp = util.getTimeStamp();
		System.out.println("Order Completed successfully : " + Referencenum);
		// LP.write_OrderID_in_PropertiesFile(dateTimeStamp, orderID);
		Constant.dataMap.get().put("Referencenum", Referencenum);




	}
	public void selectPayment(String PayMode) throws Exception {
		if(PayP.isElementExist("How Will You Be Paying Text","howWillYouBePaying", 10))		
		{	
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", PayP.get_howWillYouBePaying());
			switch (PayMode) {
			case "Visa_MasterCard":
				PayP.jsClick("Visa_MasterCard", "Visa_MasterCard");
				break;
			case "GCash":
				PayP.jsClick("GCash", "GCash");
				break;
			case "COD":
				PayP.jsClick("cashOnDelivery", "cashOnDelivery");
				break;
			case "StrigtPay":
				PayP.jsClick("StrigtPay", "StrigtPay");
				break;
			case "CreditcardHSBC":
				PayP.jsClick("CreditcardHSBC", "CreditcardHSBC");
				break;
			case "CreditcardinstallBPI":
				PayP.jsClick("CreditcardinstallBPI", "CreditcardinstallBPI");
				break;



			default :
				System.out.println("Given mode of payment noT exist");
			} 
			Constant.dataMap.get().put("Magento_PaymentShippingMethod", PayMode);
			Constant.dataMap.get().put("PaymentMethodUsed", PayMode);
			Control.captureScreenshot();
		}
	}


	public void Renewal_Thankyoupage()throws Exception {
		TP.isElementExist("Thankyou_label", "Thankyoulabel", 10);
		/*
		 * TP.isElementExist("Confirm_label", "Confirmlabel", 10);
		 * TP.isElementExist("Order_Recieved", "OrderRecieved", 10);
		 */
		TP.isElementExist("Refrcenum_Label", "RefrcenumLabel", 10);
		if(TP.isElementExist("OrderConfirmed", "OrderConfirmed", 10))
		{
			System.out.println("Order Confirmed label is displayed");		}
		if(TP.isElementExist("OrderReceived", "OrderReceived", 10))
		{
			System.out.println("Order Received label is displayed");
		}
		// TP.isElementExist("Order_Confirmed", "Order_Confirmed", 10);
		if(TP.isElementExist("PurchaseSummary", "PurchaseSummary", 10))
		{
			System.out.println("Purchase Summary label is displayed");
		}
		if(TP.isElementExist("OrderSummary", "OrderSummary", 10))
		{
			System.out.println("Order Summary label is displayed");
		}
		TP.isElementExist("ShippingAddress", "ShippingAddress", 10);
		TP.isElementExist("AmountPaid", "AmountPaid", 10);
		TP.isElementExist("AmountPaidValue", "AmountPaidValue", 10);
		TP.isElementExist("PlanDetail", "PlanDetail", 10);
		//TP.isElementExist("Registredmail", "Registredmail", 10);
		TP.isElementExist("PlanInclusions", "PlanInclusions", 10);
		TP.isElementExist("Paymentmethod", "Paymentmethod", 10);

		TP.isElementExist("Addons", "Addons", 10);

	}

	/********************************************************************************************************************************/

//	public void insertDetailsOnTrackYourOrder() throws InterruptedException {
//		String orderID = Constant.dataMap.get().get("Referencenum");
//		TrackOrder.get_referenceNumber().sendKeys(orderID);
//		System.out.println("Inserted Reference Number on Track your order screen : " + orderID);
//
//		// TrackOrder.get_email().sendKeys("tcoe_go_automation@globe.com.ph");
//		TrackOrder.get_email().sendKeys("shaik.asma@globe.com.ph");
//
//		System.out.println("Inserted email on Track your order screen : shaik.asma@globe.com.ph");
//
//		TrackOrder.scroll_vertical(2000);
//		Thread.sleep(1500L);
//		TrackOrder.get_btn_trackOrder().click();
//	}

	/**************************************************
	 * Renewal Scenario2 Starts
	 ****************************************************/
	public void PDPGplanwithDevice1499() throws Exception {

		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);
		Thread.sleep(3000L);
		PP.isElementExist("Plan 1499 With Device", "Price_1499WithDevice", 10);
		PP.isElementExist("Color header", "Color_header", 10);
		PP.isElementExist("Color", "Color_Click", 10);

		PP.isElementExist("Color With Border", "Color_color", 10);
		WebElement ele = DriverManager.getDriver().findElement(By.xpath("(//input[@value='option1'])[1]"));
		System.out.println("Highlighted border" + ele.getCssValue("border-top-color"));

		PP.isElementExist("Contract Duration", "Contractduration_header", 10);
		PP.isElementExist("Banner", "Banner", 10);

		// Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(353);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Data_checkbox());

		PP.isElementExist("GS99", "GSAddsurf99", 10);
		// PP.clickOnElement("Button", "GSAddsurf99", "GSAddsurf99");

		JavascriptExecutor js99 = (JavascriptExecutor) DriverManager.getDriver();
		js99.executeScript("arguments[0].click();", PP.get_GSAddsurf99());

		// Banner
		PP.isElementExist("withDevice_Banner", "Banner", 10);

		// Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		// PP.clickOnElement("Button", "Amazon", "Amazonprime");
		JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
		jsa.executeScript("arguments[0].click();", PP.get_Amazonprime());

		JavascriptExecutor Viupremium = (JavascriptExecutor) DriverManager.getDriver();
		Viupremium.executeScript("arguments[0].click();", PP.get_Viupremium());

		JavascriptExecutor Spotifypremium = (JavascriptExecutor) DriverManager.getDriver();
		Spotifypremium.executeScript("arguments[0].click();", PP.get_Spotifypremium());

		// Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());

		PP.isElementExist("MyDuoaddon", "MyDuoaddon", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		// PP.clickOnElement("Button", "MySuperDuo", "MySuperDuo");
		JavascriptExecutor MyDuo = (JavascriptExecutor) DriverManager.getDriver();
		MyDuo.executeScript("arguments[0].click();", PP.get_MyDuo());

		// Lifestyle Addon
		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());

		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		JavascriptExecutor easyRoam = (JavascriptExecutor) DriverManager.getDriver();
		easyRoam.executeScript("arguments[0].click();", PP.get_easyRoam());

		JavascriptExecutor Gocallid199 = (JavascriptExecutor) DriverManager.getDriver();
		Gocallid199.executeScript("arguments[0].click();", PP.get_Gocallid199());

		PP.isElementExist("Review", "Reviewmyplan", 10);

		JavascriptExecutor Reviewmyplan = (JavascriptExecutor) DriverManager.getDriver();
		Reviewmyplan.executeScript("arguments[0].click();", PP.get_Reviewmyplan());

		// JavascriptExecutor jsd = (JavascriptExecutor)
		// DriverManager.getDriver();
		// jsd.executeScript("arguments[0].click();", PP.get_Dragbutton());

		Thread.sleep(1000);

		// PP.clickOnElement("Button", "Reviewmyplan", "Reviewmyplan");
		// PP.isElementExist("lifestyleaddon", "Viewplanbreakdwn", 10);
		// PP.clickOnElement("Button", "Dropdown", "dropdown_Planbreakdwn");
		//
		// //ViewBreakdown
		PP.isElementExist("Planname", "Planname", 10);
		PP.isElementExist("Planamount", "PlanValue", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuoaddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("Viu", "ViuAddon", 10);
		PP.isElementExist("Spotify", "SpotifyAddon", 10);
		PP.isElementExist("EasyRoama", "EasyRoamaddon", 10);
		PP.isElementExist("GSAddSur99", "GSAddSur99addon", 10);

		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);
		PP.isElementExist("UntickMySuperDuo", "UntickMySuperDuo", 10);
		WebElement a = DriverManager.getDriver().findElement(By.xpath("((//div[text()='MyDuo']))[1]"));

		// DriverManager.getDriver().findElement(PP.MyDuoaddon).click();
		PP.javascript_clickOnElement(a);
		Thread.sleep(1000);
		// PP.clickOnElement("UntickMyDuo", "MyDuoaddon", "MyDuoaddon");
		PP.isElementExist("Re computemy plan", "Recomputemyplan", 10);

		JavascriptExecutor Recomputemyplan = (JavascriptExecutor) DriverManager.getDriver();
		Recomputemyplan.executeScript("arguments[0].click();", PP.get_Recomputemyplan());

	}

	/********************
	 * DAF PAGE VALIDATION
	 * 
	 * @throws InterruptedException
	 *************************/
	public void validateOrderDetailsINORDERTRACKER() throws Exception {
		OrderDetails.isElementExist("myOrder", "myOrder", 10);
		System.out.println("Reference Number : " + OrderDetails.get_referenceNum().getText());
		System.out.println("Order Active Status : " + OrderDetails.get_orderActiveStatus().getText());
		OrderDetails.isElementExist("allAccessData", "allAccessData", 10);
		OrderDetails.isElementExist("allAccessDataVal", "allAccessDataVal", 10);
		OrderDetails.isElementExist("goWifiAccess", "goWifiAccess", 10);
		OrderDetails.isElementExist("goWifiAccessVal", "goWifiAccessVal", 10);
		OrderDetails.isElementExist("calltext", "calltext", 10);
		OrderDetails.isElementExist("planInclusion", "planInclusion", 10);
		OrderDetails.isElementExist("konsulta", "konsulta", 10);
		OrderDetails.isElementExist("freePersonalSubscription", "freePersonalSubscription", 10);
		OrderDetails.isElementExist("glnusure", "glnusure", 10);
		OrderDetails.isElementExist("monthsSsubscription", "monthsSsubscription", 10);
		OrderDetails.isElementExist("addOns", "addOns", 10);
		OrderDetails.isElementExist("myDuo1", "myDuo1", 10);
		OrderDetails.isElementExist("aPV", "aPV", 10);
		OrderDetails.isElementExist("Viupremiumaddons", "Viupremiumaddons", 10);
		OrderDetails.isElementExist("easyroam", "easyroam", 10);
		OrderDetails.isElementExist("GSAddsurf", "GSAddsurf", 10);
		OrderDetails.isElementExist("Viupremiumaddons", "Viupremiumaddons", 10);
		OrderDetails.isElementExist("Viupremiumaddons", "Viupremiumaddons", 10);
		//System.out.println("Completed Date : " + OrderDetails.get_completedDate().getText());
		OrderDetails.scroll_vertical(4000);
		System.out.println("orderconfirmed : " + OrderDetails.get_orderconfirmed().getText());		
		System.out.println("orderconfirmeddatae : " + OrderDetails.get_orderconfirmeddatae().getText());
		OrderDetails.isElementExist("dateOrdered", "dateOrdered", 10);

		System.out.println("dateOrdered value: " + OrderDetails.get_dateOrderedValue().getText());
		OrderDetails.isElementExist("overDueBalance", "overDueBalance", 10);
		System.out.println("Update Date : " + OrderDetails.get_overDueBalanceValue().getText());
		OrderDetails.isElementExist("amountPaid", "amountPaid", 10);
		System.out.println("Update Date : " + OrderDetails.get_amountPaidValue().getText());
		OrderDetails.isElementExist("paymentMethod", "paymentMethod", 10);
		System.out.println("Date Ordered : " + OrderDetails.get_paymentMethodName().getText());
		OrderDetails.isElementExist("totalAmountPaid", "totalAmountPaid", 10);

		System.out.println("Payment Method : " + OrderDetails.get_totalAmountPaidValue().getText());
		OrderDetails.isElementExist("shippingAdress", "shippingAdress", 10);
		System.out.println("Amount Paid : " + OrderDetails.get_shipingaddressvalue().getText());
		OrderDetails.isElementExist("estimatedDelivery", "estimatedDelivery", 10);
		System.out.println("Shipping Address : " + OrderDetails.get_esimatedeliverydatevalue().getText());

	}


	/********************
	 * Personal And Billing ADDRESS In DAF PAGE
	 *************************/


	public void PDPGplanwithalldata2499() throws Exception {
		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);
		// Thread.sleep(3000L);

		PP.isElementExist("Contract Duration", "Contractduration_header", 10);
		// PP.isElementExist("Banner", "Banner", 10);

		// Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(353);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Data_checkbox());

		PP.isElementExist("GS99", "GSAddsurf99", 10);
		// PP.clickOnElement("Button", "GSAddsurf99", "GSAddsurf99");

		JavascriptExecutor js99 = (JavascriptExecutor) DriverManager.getDriver();
		js99.executeScript("arguments[0].click();", PP.get_GSAddsurf99());

		// Banner
		// PP.isElementExist("withDevice_Banner", "Banner", 10);

		// Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		// PP.clickOnElement("Button", "Amazon", "Amazonprime");
		JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
		jsa.executeScript("arguments[0].click();", PP.get_Amazonprime());

		JavascriptExecutor Viupremium = (JavascriptExecutor) DriverManager.getDriver();
		Viupremium.executeScript("arguments[0].click();", PP.get_Viupremium());

		JavascriptExecutor Spotifypremium = (JavascriptExecutor) DriverManager.getDriver();
		Spotifypremium.executeScript("arguments[0].click();", PP.get_Spotifypremium());

		// Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());

		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		// PP.clickOnElement("Button", "MySuperDuo", "MySuperDuo");
		JavascriptExecutor MyDuo = (JavascriptExecutor) DriverManager.getDriver();
		MyDuo.executeScript("arguments[0].click();", PP.get_MyDuo());
		Thread.sleep(1000);
		// Lifestyle Addon
		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());

		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		JavascriptExecutor easyRoam = (JavascriptExecutor) DriverManager.getDriver();
		easyRoam.executeScript("arguments[0].click();", PP.get_easyRoam());

		JavascriptExecutor Gocallid199 = (JavascriptExecutor) DriverManager.getDriver();
		Gocallid199.executeScript("arguments[0].click();", PP.get_Gocallid199());


		// uncheck the addons lifestyle to get insufficient csl sapiel banner

		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
		js5.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());

		PP.isElementExist("Review", "Reviewmyplan", 10);

		JavascriptExecutor Reviewmyplan = (JavascriptExecutor) DriverManager.getDriver();
		Reviewmyplan.executeScript("arguments[0].click();", PP.get_Reviewmyplan());

		// JavascriptExecutor jsd = (JavascriptExecutor)
		// DriverManager.getDriver();
		// jsd.executeScript("arguments[0].click();", PP.get_Dragbutton());

		Thread.sleep(1000);

		PP.isElementExist("PlanName2499", "PlanName2499", 10);
		PP.isElementExist("Planamount", "PlanValue", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuoaddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("Viu", "ViuAddon", 10);
		PP.isElementExist("Spotify", "SpotifyAddon", 10);
		PP.isElementExist("EasyRoama", "EasyRoamaddon", 10);

		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);
		PP.isElementExist("Untick", "UntickMyDuo", 10);

		PP.isElementExist("Insufficient CSL msg", "SupportingDocsReq", 10);

		PP.clickOnElement("untick My duo", "UntickMyDuo", "UntickMyDuo");

		PP.isElementExist("Re computemy plan", "Recomputemyplan", 10);

		JavascriptExecutor Recomputemyplan = (JavascriptExecutor) DriverManager.getDriver();
		Recomputemyplan.executeScript("arguments[0].click();", PP.get_Recomputemyplan());

		Thread.sleep(1000L);
		if (PP.isElementExist("Proceed with the plan", "proceedbtn1", 30)) {
			Thread.sleep(6000);

			PP.moveToElement("Proceed");
			System.out.println("moved to proceed");

			// DriverManager.getDriver().findElement(By.xpath("//button[@id='sticky-proceed-plan']")).click();
		}

	}

	// ********************************************************************//
	/******************** ADRESS Insert Method *************************/

	// public void insert_and_validate_recipientMobile(String mobCategory,
	// String mobNumber) {
	// Form.get_Houseno().clear();
	// Form.get_Street().clear();
	// Form.get_Villagesub().clear();
	// Form.get_Province().clear();
	// Form.get_City().clear();
	// Form.get_Barangay().clear();
	//
	// }

	// RENEWAL SCENARIO 4

	public void PDPG99() throws Exception {

		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);
		Thread.sleep(3000L);
		PP.isElementExist("Gplan All Data", "GplanAllData2499", 10);
		PP.isElementExist("Gplan All Data 2499 Plan", "GplanAllData2499Plan", 10);
		PP.isElementExist("Contract Duration", "ContractDuration", 10);
		PP.isElementExist("Color", "Color_Click", 10);
		PP.isElementExist("Color With Border", "Color_color", 10);
		PP.isElementExist("Contract Duration", "Contractduration_header", 10);
		PP.isElementExist("Banner", "Banner", 10);

		// Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(353);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Data_checkbox());

		PP.isElementExist("GS99", "GSAddsurf99", 10);
		// PP.clickOnElement("Button", "GSAddsurf99", "GSAddsurf99");

		JavascriptExecutor js99 = (JavascriptExecutor) DriverManager.getDriver();
		js99.executeScript("arguments[0].click();", PP.get_GSAddsurf99());

		// Banner
		PP.isElementExist("withDevice_Banner", "Banner", 10);

		// Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		// PP.clickOnElement("Button", "Amazon", "Amazonprime");
		JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
		jsa.executeScript("arguments[0].click();", PP.get_Amazonprime());

		JavascriptExecutor Viupremium = (JavascriptExecutor) DriverManager.getDriver();
		Viupremium.executeScript("arguments[0].click();", PP.get_Viupremium());

		JavascriptExecutor Spotifypremium = (JavascriptExecutor) DriverManager.getDriver();
		Spotifypremium.executeScript("arguments[0].click();", PP.get_Spotifypremium());

		// Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());

		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		// PP.clickOnElement("Button", "MySuperDuo", "MySuperDuo");
		JavascriptExecutor MyDuo = (JavascriptExecutor) DriverManager.getDriver();
		MyDuo.executeScript("arguments[0].click();", PP.get_MyDuo());

		// Lifestyle Addon
		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		// PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());

		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		JavascriptExecutor easyRoam = (JavascriptExecutor) DriverManager.getDriver();
		easyRoam.executeScript("arguments[0].click();", PP.get_easyRoam());

		JavascriptExecutor Gocallid199 = (JavascriptExecutor) DriverManager.getDriver();
		Gocallid199.executeScript("arguments[0].click();", PP.get_Gocallid199());

		PP.isElementExist("Review", "Reviewmyplan", 10);

		JavascriptExecutor Reviewmyplan = (JavascriptExecutor) DriverManager.getDriver();
		Reviewmyplan.executeScript("arguments[0].click();", PP.get_Reviewmyplan());

		// JavascriptExecutor jsd = (JavascriptExecutor)
		// DriverManager.getDriver();
		// jsd.executeScript("arguments[0].click();", PP.get_Dragbutton());

		Thread.sleep(1000);

		// PP.clickOnElement("Button", "Reviewmyplan", "Reviewmyplan");
		// PP.isElementExist("lifestyleaddon", "Viewplanbreakdwn", 10);
		// PP.clickOnElement("Button", "Dropdown", "dropdown_Planbreakdwn");
		//
		// //ViewBreakdown
		PP.isElementExist("Plan Name", "PlanNameAllData2499", 10);
		PP.isElementExist("Plan Amount", "PlanNameAllDataCost", 10);
		PP.isElementExist("PlanConclusion", "PlanConclusion", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuoaddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("Viu", "ViuAddon", 10);
		PP.isElementExist("Spotify", "SpotifyAddon", 10);
		PP.isElementExist("EasyRoama", "EasyRoamaddon  ", 10);
		PP.isElementExist("GSAddSur99", "GSAddSur99addon  ", 10);

		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("Total subsaddon Amount", "Totalsubsandaddons_amont2499", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "MontlyAllData2499", 10);

		// PP.isElementExist("Untick", "UntickMyDuo", 10);
		// PP.isElementExist("Re computemy plan", "Recomputemyplan", 10);
		// JavascriptExecutor Recomputemyplan = (JavascriptExecutor)
		// DriverManager.getDriver();
		// Recomputemyplan.executeScript("arguments[0].click();",
		// PP.get_Recomputemyplan());

	}


	public void DeliveryInfoPageHeadingColorspersonalinfo() throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		// identify text
		WebElement personalInfoCss = DriverManager.getDriver().findElement(By.xpath("//div[text()='Personal information']"));
		// WebElement DeliveryInfoCss =
		// driver.findElement(By.xpath("//div[text()='Delivery information']"));
		WebElement UploadDocsCss = DriverManager.getDriver().findElement(By.xpath("//div[text()='Upload documents']"));
		// System.out.println(personalInfoCss);
		// obtain color in rgba
		String personalInfoColor = personalInfoCss.getCssValue("color");
		// String DeliveryInfoColor = DeliveryInfoCss.getCssValue("color");
		String UploadDocsColor = UploadDocsCss.getCssValue("color");
		// System.out.println(s);
		if (personalInfoColor == "var(--color-functional--primary") {
			System.out.println("Personal information is in blue color");
		}
		// if(DeliveryInfoColor == "var(--color-functional--primary")
		// {
		// System.out.println("Personal information is in blue color");
		// }
		if (UploadDocsColor == "var(--color-functional-neutral-a4") {
			System.out.println("Personal information is in Grey color");
		}
	}

	public void DeliveryInfoPageHeadingColorsUploaddocuments() throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		// identify text
		WebElement personalInfoCss = DriverManager.getDriver().findElement(By.xpath("//div[text()='Personal information']"));
		// WebElement DeliveryInfoCss =
		// driver.findElement(By.xpath("//div[text()='Delivery information']"));
		WebElement UploadDocsCss = DriverManager.getDriver().findElement(By.xpath("//div[text()='Upload documents']"));
		// System.out.println(personalInfoCss);
		// obtain color in rgba
		String personalInfoColor = personalInfoCss.getCssValue("color");
		// String DeliveryInfoColor = DeliveryInfoCss.getCssValue("color");
		String UploadDocsColor = UploadDocsCss.getCssValue("color");
		// System.out.println(s);
		if (personalInfoColor == "var(--color-functional--primary") {
			System.out.println("Personal information is in blue color");
		}
		// if(DeliveryInfoColor == "var(--color-functional--primary")
		// {
		// System.out.println("Personal information is in blue color");
		// }
		if (UploadDocsColor == "var(--color-functional-neutral-a4") {
			System.out.println("Personal information is in Grey color");
		}
	}

	// Validating 2499 plan order summary page


	public void validatePayorderPage() throws InterruptedException {

		System.out.println("Renewal Pay  : " + PayP.get_pay().getText());
		System.out.println("No Need To Pay : " + PayP.get_Noneedtopay().getText());
		System.out.println("Product Name : " + PayP.get_YourContactPeriod().getText());
		PP.scroll_vertical(4000);
		System.out.println("All-access Name : " + PayP.get_PreferUpfront().getText());
		// System.out.println("access Value : " +
		// OS.getAttributeValue("accessValue", "alt"));
		// System.out.println("Product Image : " +
		// OS.getAttributeValue("productImage", "alt"));
		System.out.println("Plan Name : " + PayP.get_RenewalHeading().getText());
		System.out.println("Plan Collapse : " + PayP.get_planRenewalcollapse1().getText());
		// System.out.println("Product Device Selected : " +
		// PayP.get_planRenewalcollapse1().getText());
		System.out.println("Renewal Product Cost : " + PayP.get_RenewalProductCost().getText());
		System.out.println("Addons : " + PayP.get_addons().getText());
		System.out.println("My Duo : " + PayP.get_myDuo().getText());
		System.out.println("APVideo : " + PayP.get_amazonprimeVideo().getText());
		System.out.println("Viu Premium Addon : " + PayP.get_ViuPremium().getText());
		System.out.println("Spotify Premiumaddon : " + PayP.get_SpotifyPremiumaddon().getText());
		System.out.println("Easy Roam : " + PayP.get_EasyRoam().getText());
		System.out.println("GOCALLIDD Addon : " + PayP.get_GOCALLIDD().getText());
		System.out.println("GSAdd Addon : " + PayP.get_GSAdd().getText());
		System.out.println("Total Addons : " + PayP.get_totaladdons().getText());
		System.out.println("Total Montlybill : " + PayP.get_totalMontlybill2().getText());
		System.out.println("Montly service : " + PayP.get_monthlyservice().getText());
		System.out.println("Montly and All AddonS Amount : " + PayP.get_totalmontlyBillPayment().getText());
		System.out.println("Submit Button: " + PayP.get_payOrder().getText());
		JavascriptExecutor submitOrder = (JavascriptExecutor) DriverManager.getDriver();
		submitOrder.executeScript("arguments[0].click();", PayP.get_payOrder());
	}

	public void ThankyoupageSC4()throws Exception {
		TP.isElementExist("Thankyou_label", "Thankyoulabel", 10);
		//TP.isElementExist("Confirm_label", "Confirmlabel", 10);
		TP.isElementExist("Order_Recieved", "OrderRecieved", 10);
		TP.isElementExist("Refrcenum_Label", "RefrcenumLabel", 10);
		//TP.isElementExist("copy_icon", "copyicon", 10);
		//TP.isElementExist("Itemsorder_label", "Itemsorderlabel", 10);

		TP.isElementExist("Globe_At_Home1", "GlobeAtHome1", 10);
		TP.isElementExist("GHPW_label", "GHPWlabel", 10);
		TP.isElementExist("Sub_text1", "Subtext1", 10);
		TP.isElementExist("Unit_1", "Unit1", 10);

		TP.isElementExist("Globe_At_Home2", "GlobeAtHome2", 10);
		TP.isElementExist("BPHPW_label", "BPHPWlabel", 10);
		TP.isElementExist("Sub_text2", "Subtext2", 10);
		TP.isElementExist("Unit_2", "Unit2", 10);
		TP.isElementExist("Check Email Spiel", "CheckEmailSPiel", 10);

		TP.isElementExist("Track_myorder", "Trackmyorder", 10);
	}

	public void validateOrderDetails2499() throws Exception {

		//	System.out.println("Reference Number : " + OrderDetails.get_refNumOrder().getText());
		System.out.println("Order Active Status : " + OrderDetails.get_myOrder().getText());
		// System.out.println("Completed Date : " +
		// OrderDetails.get_completedDate().getText());
		PP.scroll_vertical(1000);
		System.out.println("Product Name : " + OrderDetails.get_productNamedetails().getText());
		System.out.println("Quantity : " + OrderDetails.get_orderActiveStatus().getText());
		// System.out.println("Product Image : " +
		// OrderDetails.getAttributeValue("productImage", "alt"));
		// System.out.println("Update Date : " +
		// OrderDetails.get_completedDate().getText());
		System.out.println("allAccessData : " + OrderDetails.get_allAccessData().getText());
		System.out.println("Payment Method : " + OrderDetails.get_allAccessDataVal().getText());
		System.out.println("Payment Method : " + OrderDetails.get_goWifiAccess().getText());
		System.out.println("Payment Method : " + OrderDetails.get_goWifiAccessVal().getText());
		System.out.println("Payment Method : " + OrderDetails.get_planInclusion().getText());
		System.out.println("Payment Method : " + OrderDetails.get_konsulta().getText());
		System.out.println("Payment Method : " + OrderDetails.get_freePersonalSubscription().getText());
		System.out.println("Payment Method : " + OrderDetails.get_glnusure().getText());
		System.out.println("Payment Method : " + OrderDetails.get_monthsSsubscription().getText());
		System.out.println("Payment Method : " + OrderDetails.get_addOns().getText());
		System.out.println("Payment Method : " + OrderDetails.get_aPV().getText());
		// System.out.println("Payment Method : " +
		// OrderDetails.get_myDuo1().getText());
		System.out.println("Payment Method : " + OrderDetails.get_Viupremiumaddons().getText());
		System.out.println("Payment Method : " + OrderDetails.get_Spotifypremium().getText());
		// System.out.println("Payment Method : " +
		// OrderDetails.get_easyroam().getText());
		// System.out.println("Payment Method : " +
		// OrderDetails.get_Gocallidaddons().getText());
		System.out.println("Payment Method : " + OrderDetails.get_GSAddsurf().getText());
		System.out.println("Payment Method : " + OrderDetails.get_dateOrderedValue().getAttribute("value"));
		// System.out.println("Payment Method : " +
		// OrderDetails.get_overDueBalance().getText());
		// System.out.println("Payment Method : " +
		// OrderDetails.get_overDueBalanceValue().getAttribute("value"));
		// System.out.println("Amount Paid : " +
		// OrderDetails.get_amountPaid().getText());
		// System.out.println("Payment Method : " +
		// OrderDetails.get_amountPaidValue().getAttribute("value"));
		/*
		 * System.out.println("Payment Method : " +
		 * OrderDetails.get_totalAmountPaid().getText());
		 * System.out.println("Payment Method : " +
		 * OrderDetails.get_totalAmountPaidValue().getAttribute("value"));
		 * System.out.println("Shipping Address : " +
		 * OrderDetails.get_shippingAdress().getText());
		 * System.out.println("Estimated Day of Delivery : " +
		 * OrderDetails.get_estimatedDelivery().getText());
		 */
	}
	public void validateOrderDetails599() throws InterruptedException {

		//System.out.println("Reference Number : " + OrderDetails.get_refNumOrder().getText());
		System.out.println("Order Active Status : " + OrderDetails.get_myOrder().getText());

		PP.scroll_vertical(1000);
		System.out.println("Product Name : " + OrderDetails.get_productNamedetails().getText());
		System.out.println("Quantity : " + OrderDetails.get_orderActiveStatus().getText());

		System.out.println("allAccessData : " + OrderDetails.get_allAccessData().getText());
		System.out.println("Payment Method : " + OrderDetails.get_allAccessDataVal().getText());
		System.out.println("Payment Method : " + OrderDetails.get_goWifiAccess().getText());
		System.out.println("Payment Method : " + OrderDetails.get_goWifiAccessVal().getText());
		System.out.println("Payment Method : " + OrderDetails.get_planInclusion().getText());
		System.out.println("Payment Method : " + OrderDetails.get_konsulta().getText());
		System.out.println("Payment Method : " + OrderDetails.get_freePersonalSubscription().getText());
		System.out.println("Payment Method : " + OrderDetails.get_glnusure().getText());
		System.out.println("Payment Method : " + OrderDetails.get_monthsSsubscription().getText());
		System.out.println("Payment Method : " + OrderDetails.get_addOns().getText());
		System.out.println("Payment Method : " + OrderDetails.get_aPV().getText());

		System.out.println("Payment Method : " + OrderDetails.get_Viupremiumaddons().getText());
		System.out.println("Payment Method : " + OrderDetails.get_Spotifypremium().getText());
		System.out.println("Payment Method : " +OrderDetails.get_easyroam().getText());
		System.out.println("Payment Method : " +OrderDetails.get_Gocallidaddons().getText());
		System.out.println("Payment Method : " + OrderDetails.get_GSAddsurf().getText());
		System.out.println("Payment Method : " + OrderDetails.get_dateOrderedValue().getAttribute("value"));
		System.out.println("Payment Method : " +OrderDetails.get_overDueBalance().getText());
		System.out.println("Payment Method : " +OrderDetails.get_overDueBalanceValue().getAttribute("value"));
		System.out.println("Amount Paid : " +OrderDetails.get_amountPaid().getText());
		System.out.println("Payment Method : " +OrderDetails.get_amountPaidValue().getAttribute("value"));

		System.out.println("Payment Method : " +OrderDetails.get_totalAmountPaid().getText());
		System.out.println("Payment Method : " +OrderDetails.get_totalAmountPaidValue().getAttribute("value"));
		System.out.println("Shipping Address : " +OrderDetails.get_shippingAdress().getText());
		System.out.println("Estimated Day of Delivery : " +OrderDetails.get_estimatedDelivery().getText());

	}

	public void orderTrackerValidation() throws Exception {

		//if(OrderDetails.isElementExist("OrderDetails", "OrderDetails", 10)) {
			System.out.println("*****************************We are in order tracker page******************************");
		//} 

		OrderDetails.isElementExist("MyOrder", "MyOrder", 10);

		if(OrderDetails.isElementExist("REFERENCE NUMBER","REFERENCE_NUMBER", 10)) {
			String REFERENCE_NUMBER = OrderDetails.get_REFERENCE_NUMBER().getText();
			System.out.println("REFERENCE_NUMBER: "+REFERENCE_NUMBER);  
		}

		OrderDetails.isElementExist("Processing", "Processing", 10);
		OrderDetails.isElementExist("Deliver", "Deliver", 10);
		OrderDetails.isElementExist("Receive", "Receive", 10);
		Control.takeScreenshot();
		if(OrderDetails.isElementExist("orderTrackerStatus","orderTrackerStatus", 10)) {
			String orderTrackerStatus = OrderDetails.get_orderTrackerStatus().getText();
			System.out.println("orderTrackerStatus: "+orderTrackerStatus);  
		}

		if(OrderDetails.isElementExist("DateOrdered","DateOrdered", 10)) {
			String DateOrdered = OrderDetails.get_DateOrdered().getText();
			System.out.println("DateOrdered: "+DateOrdered);  
		}
		if(OrderDetails.isElementExist("AmountPaidForOverdueBalance","AmountPaidForOverdueBalance", 10)) {
			String AmountPaidForOverdueBalance = OrderDetails.get_AmountPaidForOverdueBalance().getText();
			System.out.println("AmountPaidForOverdueBalance: "+AmountPaidForOverdueBalance);  
		}

		if(OrderDetails.isElementExist("AmountPaid","AmountPaid", 10)) {
			String AmountPaid = OrderDetails.get_AmountPaid().getText();
			System.out.println("AmountPaid: "+AmountPaid);  
		}

		if(OrderDetails.isElementExist("PaymentMethod","PaymentMethod", 10)) {
			String PaymentMethod = OrderDetails.get_PaymentMethod().getText();
			System.out.println("PaymentMethod: "+PaymentMethod);  
		}

		if(OrderDetails.isElementExist("Total_Amount_Paid","Total_Amount_Paid", 10)) {
			String Total_Amount_Paid = OrderDetails.get_Total_Amount_Paid().getText();
			System.out.println("Total_Amount_Paid: "+Total_Amount_Paid);  
		}

		if(OrderDetails.isElementExist("ShipToThisAddress","ShipToThisAddress", 10)) {
			String ShipToThisAddress = OrderDetails.get_ShipToThisAddress().getText();
			System.out.println("ShipToThisAddress: "+ShipToThisAddress);  
		}

		if(OrderDetails.isElementExist("EstimatedDayOfDelivery","EstimatedDayOfDelivery", 10)) {
			String EstimatedDayOfDelivery = OrderDetails.get_EstimatedDayOfDelivery().getText();
			System.out.println("EstimatedDayOfDelivery: "+EstimatedDayOfDelivery);  
		}

		if(OrderDetails.isElementExist("planType","planType", 10)) {
			String planType = OrderDetails.get_planType().getText();
			System.out.println("planType: "+planType);  
		}

		OrderDetails.isElementExist("DeviceImg", "DeviceImg", 10);
		OrderDetails.isElementExist("AllAccessData", "AllAccessData", 10);
		//OrderDetails.isElementExist("GoWifi", "GoWifi", 10);
		OrderDetails.isElementExist("CallAndtext", "CallAndtext", 10);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"arguments[0].scrollIntoView(true);", OrderDetails.get_PlanInclusions());
		OrderDetails.isElementExist("PlanInclusions", "PlanInclusions", 10);
//		OrderDetails.isElementExist("KonsultaMD", "KonsultaMD", 10);
//		OrderDetails.isElementExist("iQIYI", "iQIYI", 10);
//		OrderDetails.isElementExist("weTV", "weTV", 10);
		OrderDetails.isElementExist("Add_ons", "Add_ons", 10);
		OrderDetails.isElementExist("GSAddSurf", "GSAddSurf", 10);
		OrderDetails.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
		OrderDetails.isElementExist("ViuPremium", "ViuPremium", 10);
		Control.takeScreenshot();
		OrderDetails.isElementExist("EasyRoam", "EasyRoam", 10);
		OrderDetails.isElementExist("GOCALLIDD", "GOCALLIDD", 10);		
	}


	public void paymentPageGplanDevice1499() throws Exception {

		Thread.sleep(2000);
		PayP.isElementExist("paymentpage", "Selectpaymentmethod", 10);
		PayP.isElementExist("Gcash", "Gcash", 10);
		PayP.isElementExist("paymentpage", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage", "planApplicationHeader", 10);
		PayP.isElementExist("Total Amount Header", "TotalAmountHeader", 10);
		PayP.isElementExist("Total Amount", "TotalAmount", 10);
		String s = PayP.get_TotalAmount().getText().substring(1);
		String a = s.replaceFirst(",", "");
		String[] b = a.split(".");
		// b.toString();
		// if (Integer.parseInt(b) >= 50000) {
		if (!PayP.isElementExist("", "COD", 10)) {
			System.out.println(
					"The total amount for plan to be paid for renewal is above 50K. So COD Option is Disabled");
		}

		// }
		PayP.isElementExist("Proo Header", "Gotapromocodeheader", 10);
		PayP.isElementExist("Promo", "PromoClickhere", 10);

		PayP.isElementExist("paymentpage", "Submitbutton", 10);

		PayP.isElementExist("paymentpage", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage", "Noneedtopaythistoday", 10);

		// Addons

		PayP.isElementExist("Addons", "Addons", 30);
		// Colapsebutton2
		PayP.scroll_vertical(100);
		PP.js_clickOnElement("dropdown toggle", "Addons", "Addons");
		// PayP.clickOnElement("Button", "Addons", "Addons");
		PayP.scroll_vertical(400);

		PayP.isElementExist("AmazonPrime", "AmazonPrime", 10);
		PayP.isElementExist("Viupremium", "Viupremium", 10);
		PayP.isElementExist("Gsaddsurf", "Gsaddsurf", 10);

		PayP.isElementExist("Spotifypremium", "Spotifypremium", 10);

		PayP.isElementExist("Total Monthly bill", "TotalMonthlybill", 10);
		PayP.isElementExist("Montlyserviceaddons", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("Totalamount", "Totalmontlyamount", 10);
		// TODO Auto-generated method stub

	}


	public void hover_On_Menu_LinkRenew() throws Exception {

		if(NP.isElementExist("link_Renew", "link_Renew", 10)) {
			Thread.sleep(4000);
			NP.moveToElement("link_Renew");
		}

		if(NP.isElementExist("link_ViewAllDevices", "link_ViewAllDevices", 10)) {
			Thread.sleep(4000);
			NP.jsClick("link_ViewAllDevices", "link_ViewAllDevices");
		}		
	}

	public void clickonMagnifyGlass(String Device) throws Exception {
		Thread.sleep(5000);
		NP.get_searchBar().sendKeys(Device);
		NP.get_searchBar().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		NP.jsClick("magnifyBtn", "magnifyBtn");
	}

	public void validateProductDetailsPageByClickonMagnifyGlass() throws Exception {

		if(NP.isElementExist("Product details link", "productDetails", 10)) {
			System.out.println("*****************WE ARE IN PRODUCT DETAILS PAGE******************");
			NP.isElementExist("product Gallery link", "productGallery", 10);
			NP.isElementExist("productGallery", "productGallery", 10);	
			NP.isElementExist("Device Name", "deviceNameinPDPage",10);
			String deviceName = NP.get_deviceNameinPDPage().getText();
			System.out.println("Device seleted:"+deviceName);

			List<WebElement> colors = NP.get_color_Finish();
			int size = colors.size();

			NP.isElementExist("Device capacity", "capacity",10);
			String devicecapacity = NP.get_capacity().getText();
			System.out.println("Capacity of the device is:"+devicecapacity);

			NP.isElementExist("Contract Duration", "contractDuration",10);
			String contractDuration = NP.get_contractDuration().getText();
			System.out.println("Contract duration  of the device is:"+contractDuration);

			NP.isElementExist("Note", "note",10);
			NP.isElementExist("Discover Gplan Below link", "discoverGplanBelow",10);


			NP.isElementExist("Plan Card", "planCard",10);
			NP.isElementExist("Notify_Me_button", "Notify_Me_button",10);
			NP.isElementExist("SelectAnotherDevice", "selectAnotherDevice",10);
			NP.isElementExist("Features", "features",10);
			NP.isElementExist("Promos", "promos",10);

			//Validate FAQ's
			NP.isElementExist("FaqText1", "faqText1",10);
			NP.isElementExist("FaqText2", "faqText2",10);
			NP.isElementExist("FaqText3", "faqText3",10);
			NP.isElementExist("FaqText4", "faqText4",10);
			NP.isElementExist("FaqText5", "faqText5",10);
			NP.isElementExist("FaqText6", "faqText6",10);	
		}	

		else {
			Thread.sleep(3000);
			System.out.println("Product details page does not contain any details about selected plan");
			DriverManager.getDriver().navigate().back();	
		}
	}

	public void clickonProductGallery() throws Exception {

		if(NP.isElementExist("productGallery", "productGallery", 10)) {
			NP.jsClick("productGallery", "productGallery");	
		}
		if(NP.isElementExist("filters", "filters", 10)){
			System.out.println("Successfully Navigated to Device Gallery Page");
		}
	}

	public void enterValidData() throws Exception {

		NP.jsClick("Notify_Me_button","Notify_Me_button");
		NP.get_Email_Address_Field().clear();
		NP.get_Mobile_Number_Field().clear();

		NP.get_Email_Address_Field().sendKeys("tcoe_globe_online_team@globe.com.ph");

		NP.get_Mobile_Number_Field().sendKeys("09270000112");

		NP.clickOnElement("Button","Cancel Button","Cancel_Button");

		NP.jsClick("Notify me button","Notify_Me_button");

		NP.get_Email_Address_Field().sendKeys("tcoe_globe_online_team@globe.com.ph");

		NP.get_Mobile_Number_Field().sendKeys("09270000112");

		NP.clickOnElement("Button","Notify Me Button1","Notify_Me_Button1");

	}

	public void validateNotifyPopUp() throws Exception {

		NP.isElementExist("You Are In Loop Msg", "You_Are_In_Loop_Msg", 10);

		NP.isElementExist("We Will Let You Know When device Available", "We_Will_Let_You_KnowText", 10);

		//click on Okay button
		if(NP.isElementExist("Okay_Button", "Okay_Button", 10)) {
			NP.clickOnElement("Button","Okay Button","Okay_Button");
		}	
	}

	public void NavigateToRenewalLinkThroughMenuMobile() throws Exception {

		LP.clickOnElement("Menu Option", "Menu Icon", "MenuIcon_MobileView");
		if(LP.isElementExist("Renewal Option", "MobileExpandOptionRenewal_MobileView", 5))
		{

			LP.clickOnElement("Renewal Option", "Mobile Expand Option Renewal link", "MobileExpandOptionRenewal_MobileView");
		}
		else
		{
			LP.clickOnElement("Mobile Option", "Mobile Expand Option", "MobileExpandOption");

			LP.clickOnElement("Renewal Option", "Mobile Expand Option Renewal link", "MobileExpandOptionRenewal_MobileView");
		}
		Control.takeScreenshot();

	}

	/************************************************************************************************************************/
	// Globe online Phase 2 Renewal link under Mobile
	
	public void ClickonRenewalLink() throws Exception{	

		System.out.println("**********Clicking on Renewal**********");
			LP.moveToElement("Link_Mobile");
//			LP.jsClick("Link_Mobile", "Link_Mobile");
//			LP.clickOnElement("Link", "Link_Mobile", "Link_Mobile");
//			Control.takeScreenshot();
			if (LP.isElementExist("Menu bar link - Mobile", "Link_Mobile", 10)) {
				LP.moveToElement("Link_Renewal");
//				if (LP.isClickable("Link_Renewal", 5)) {
					LP.clickOnElement("Link", "Link_Renewal", "Link_Renewal");
					Control.takeScreenshot();
	
				}
				else {
					System.out.println("It is not Hovered on Mobile Plan");
				}
			} 
				
	}




