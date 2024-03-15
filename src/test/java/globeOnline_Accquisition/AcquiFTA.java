
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



//***********************************************************************************************************************

public class AcquiFTA  extends SetDriver  {

	private static AcquiFTA FTA1Scenario = new AcquiFTA();
	private util util = new util();
	private AcquiCommonMethods common = new AcquiCommonMethods();

	private AcquiDAF_Page Form = new AcquiDAF_Page();
	private String Status = "failed";


    @Test
	public void FTA1Scenario() throws Exception {

    	if(Constant.Runin.equalsIgnoreCase("Lambda1"))
		{
			JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
			jse.executeScript("lambda-name=ADA3");
		}
    	
		Generic.TestScriptStart("GO-FTA");

		Generic.WriteTestCase("Validate if user is able to able to place FTA order","User should be able to place FTA order", "ExpectedResult", "ActualResult");

		

		Constant.dataMap.set(Constant.LinkedMap);

		Constant.dataMap.get().put("TestClassName", FTA1Scenario.getClass().getSimpleName());
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
		
		
		common.openApplication();
		
     	common.IacceptClick();
     	
     	
		
		common.menuBar("Dev_Desktop");
		
		// line 421 -422 Go back to hamburger menu and click on View all devices
	    common.NavigateTo_Apply_ViewAllDevices(Constant.environment);
				
	    common.ValidateGalleryPageWithGplan(599,"Huawei Mate 50 Pro");
					
				
	    // ================ PDP PAGE ===============

		common.PDP_Page_Validation("Noesim","NoDevice","Huawei Mate 50 Pro");

		common.insert_phoneNo("09065188230");

		// line 435 - Enter the valid 6 digit otp code, Validate if user can input only
		// 6 digit code not more than
		common.insert_OTP_From_Console();
	
		common.validate_BreakdownPage();
		
		// validation DAF page FTA 27
		common.validatePersonalInfo_MandatoryFields();
		

		// step 28 validate personal infor
		common.insert_personal_info_on_form_RandomName("sakhamuri.lavanya@globe.com.ph");

		// validate billing address
		common.insert_address_details("House","111","pioneer st","BetterLiving","MOUNTAIN PROVINCE","TADIAN","Batayan");
		
		
		Form.js_clickOnElement("Button","NextDeliinfo","NextDeliinfo");
		
		common.insertShippingDetails("Same","5","Light Residences","Madison St","METRO MANILA","CITY OF MANDALUYONG","Burol");
		
		
		// alternative Receipent
		common.Select_Alternative_recipentDetails();
			
		// next Upload Documents button
     	common.Next_uploadDocument();

		common.Upload_RequiredDocPOID();

		common.Upload_File1();


		common.upload_file();


		common.Upload_RequiredDocPOFC();

		common.Upload_file2();
		
		
		common.acceptTerms_Conditions();
		
		
    	// plan order summery page
		common.OrderSummary_Validation("NoOB", "NoPromo", "Noesim");

		
		// Payment page
		common.paymentpageValidation("HSBC","NoOB", "NoPromo");

    	
    	
		// survey
		System.out.println("\n" + "*********  SURVEY MODAL ************");
		common.verify_handle_survey_popup_withInput("VERY HAPPY", "", "VERY DISSATISFIED", "Unresponsive");

		// Thank you Page
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

