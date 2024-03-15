package globeOnline_renewal;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.renewal.Renewal_CustmizeplanPage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;
import utility.Generic;
public class renewalsc extends SetDriver {
	private static renewalsc RENEWALScenario = new renewalsc();
	private util util = new util();		
	private Renewal_commonmethods common = new Renewal_commonmethods();	
	private String Status = "failed";
	private Renewal_CustmizeplanPage Custm=new Renewal_CustmizeplanPage();

	@Test
	public void RENEWALScenario() throws Exception {
				JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
				//jse.executeScript("lambda-name=RENEWALScenario1");

		Generic.TestScriptStart("renewalscl");
		Generic.WriteTestCase("Validating and Processing devicegallery Order",
				"User should be able to place order", "ExpectedResult", "ActualResult");

		Constant.dataMap.set(Constant.LinkedMap);

		Constant.dataMap.get().put("TestClassName",RENEWALScenario.getClass().getSimpleName());
		Constant.dataMap.get().put("OMT_TimeStamp", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_OrderState", "0");
		Constant.dataMap.get().put("OMT_OrderID", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_LAS", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_MobileNumber", "NOT_FOUND");
		//Constant.dataMap.get().put("ProductName", "NOT_FOUND");
		Constant.dataMap.get().put("ProductQty", "NOT_FOUND");

		//Constant.dataMap.get().put("AmountPaid", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_CustomerDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_RecipientDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_AddressDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_PaymentDetails", "NOT_FOUND");

		Constant.dataMap.get().put("Magento_Details","NOT_FOUND");
		Constant.dataMap.get().put("Magento_OrderAccountInfo","NOT_FOUND");
		Constant.dataMap.get().put("Magento_AddressInformation","NOT_FOUND");
		Constant.dataMap.get().put("Magento_PaymentShippingMethod","NOT_FOUND");
		Constant.dataMap.get().put("Magento_ItemsOrdered","NOT_FOUND");
		Constant.dataMap.get().put("Magento_OrderTotal","NOT_FOUND");
		Constant.dataMap.get().put("CustomerDetails","NOT_FOUND");


		common.openApplication();
		common.IacceptClick();
		//Validate home page links
		common.menuBar("Web");
		common.ClickonRenewalLink();
		//common.IacceptClick();
		common.Renew_LandingPage("Prod");

		common.CTBbuttonLanding("continueCTBbutton");	


		common.insert_phoneNo("09171194728");



		
		// Create a Scanner object
	    Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter OTP HERE"); 
		String OTP = myObj.nextLine(); 
		// Read  user input 
	    System.out.println("OTP : " + OTP); 
	    
	    // Output user input
	    common.OTPPage_(OTP);
	    
		//Validate loading changes
		common.loadingScreenValidation();



		common.customizePlanwithdevice("palnchange","noDevicechange","noesim","DeviceRelateddetails","device","Xiaomi Redmi 9C","1499 with Device");

		//See my new plan validation
		common.seeMyNewPlanValidation("noesim");
		
		
		//Pay page validation
		common.payPageValidation("Device","OneTimePayment","nopromoinput","viewBreakdown","noesim","Samsung Galaxy A34 5G","PTF","OB");
//		common.uploadPOFC();
//		common.selectPayment("COD");
		
		common.Acceptallconditionswithdevice();
		
		common.enterPayment_Details("Visa","9270002676");

		//success page
		common.successPageValidation("devicevalidation","onetimepayment");

		Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		util.writeToExcelLastRowFromMap("Sheet1", Constant.dataMap.get());
		//order tracker
		common.orderTrackerValidation();

		Status = "passed";
		System.out.println("!!! Execution Completed for " + this.getClass().getName() + "s !!!");
	}
	@AfterClass
	public void tearDown() throws Exception {
		if (DriverManager.getDriver() != null) {
		
			Generic.TestScriptEnds();
			Control.GeneratePDFReport();

			((JavascriptExecutor) DriverManager.getDriver()).executeScript("lambda-status=" + Status);
			DriverManager.getDriver().quit();
		}
	}
}
