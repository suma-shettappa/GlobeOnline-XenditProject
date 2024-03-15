package globeOnline_Accquisition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.Acqui.AcquiDAF_Page;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;
import utility.Generic;

public class AcquiADA extends SetDriver {

	private static AcquiADA ADA3Scenario = new AcquiADA();
	private util util = new util();

	private AcquiCommonMethods common = new AcquiCommonMethods();
	private AcquiDAF_Page Form = new AcquiDAF_Page();
	

	private String Status = "failed";

	@Test
	public void ADA3Scenario() throws Exception {

		if(Constant.Runin.equalsIgnoreCase("Lambda1"))
		{
			JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
			jse.executeScript("lambda-name=ADA3");
		}

		Generic.TestScriptStart("GO-ADASc3");

		Generic.WriteTestCase("Validate if user is able to able to place ADA order","User should be able to place ADA order", "ExpectedResult", "ActualResult");
		
		// User access URL
		common.openApplication();
		
		
		Constant.dataMap.set(Constant.LinkedMap);

		Constant.dataMap.get().put("TestClassName", ADA3Scenario.getClass().getSimpleName());
		Constant.dataMap.get().put("OMT_TimeStamp", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_OrderState", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_OrderID", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_LAS", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_MobileNumber", "NOT_FOUND");
		Constant.dataMap.get().put("ProductName", "NOT_FOUND");
		Constant.dataMap.get().put("ProductQty", "NOT_FOUND");

		Constant.dataMap.get().put("AmountPaid", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_CustomerDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_RecipientDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_AddressDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_PaymentDetails", "NOT_FOUND");

		Constant.dataMap.get().put("Magento_Details", "NOT_FOUND");
		Constant.dataMap.get().put("Magento_OrderAccountInfo", "NOT_FOUND");
		Constant.dataMap.get().put("Magento_AddressInformation", "NOT_FOUND");
		Constant.dataMap.get().put("Magento_PaymentShippingMethod", "NOT_FOUND");
		Constant.dataMap.get().put("Magento_ItemsOrdered", "NOT_FOUND");
		Constant.dataMap.get().put("Magento_OrderTotal", "NOT_FOUND");

		// ************************************************************************************
		
		//Accept cookies
		common.IacceptClick();
		
		common.menuBar("Dev_Desktop");
		

		// line 421 -422 Go back to hamburger menu and click on View all devices
		common.NavigateTo_Apply_ViewAllDevices(Constant.environment);
		
		common.ValidateGalleryPageWithGplan(2499,"Huawei Mate 50 Pro");
			
		
		// ================ PDP PAGE ===============

		common.PDP_Page_Validation("Noesim","NoDevice","Huawei Mate 50 Pro");

		common.insert_phoneNo("09171135236");

		// line 435 - Enter the valid 6 digit otp code, Validate if user can input only
		// 6 digit code not more than
		common.insert_OTP_From_Console();

		// line 437-438 - Validate brand Globe postpaid && click "I 'm applying for a
		// additional plan "
		common.validate_acquiConfirmationPage();

		//common.DuplicityPage();
		common.validate_BreakdownPage();
		

		// line 447 - Verify the Mandatory fields in Personal info page
		common.validatePersonalInfo_MandatoryFields();

		// line 447 - Validate Personal information && input perosonal information
		common.insert_personal_info_on_form_RandomName("sakhamuri.lavanya@globe.com.ph", "NoOB");

		// line 448 - Validate Billing address && line 171 - input perosonal information
		common.insert_billing_address_details("House", "222", "Jstreet", "Betterliving", "BOHOL",
				"ALICIA", "Cabatang");

		//line 580 - click "Next: Delivery Information" 
		Form.js_clickOnElement("Button","NextDeliinfo","NextDeliinfo");

		//Shipping Address
		common.insertShippingDetails("Same","5","Light Residences","Madison St","METRO MANILA","CITY OF MANDALUYONG","Burol");
		
		// line 454 - input Alternate recipients and contact details fields
		common.Select_Alternative_recipentDetails();

		// line - 455- Next Upload Documents button
		common.Next_uploadDocument();

		common.Upload_RequiredDocPOID();

		common.Upload_File1_3Times();

		common.upload_file();

		// Form.DropDownDisplay2();
		common.Upload_RequiredDocPOFC();

		common.Upload_file2();
		common.acceptTerms_Conditions();

		common.OrderSummary_Validation("NoOB", "NoPromo", "Noesim");
		// Pay "Submit" and process payment
		common.paymentpageValidation("Gcash","NoOB", "NoPromo");
		// ********************SRUVEY MODAL**********************
		System.out.println("\n" + "*********  SURVEY MODAL ************");
		common.verify_handle_survey_popup_withInput("HAPPY", "", "DISSATISFIED", "Unresponsive");
		common.validateThankYouPage("Noesim");
		common.capture_orderID();
		common.validate_OrderTrackerDetails("sakhamuri.lavanya@globe.com.ph", "NoOB");

		Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		util.writeToExcelLastRowFromMap("Sheet1", Constant.dataMap.get());

		Status = "passed";
		System.out.println("!!! Execution Completed for " + this.getClass().getName() + " !!!");

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
