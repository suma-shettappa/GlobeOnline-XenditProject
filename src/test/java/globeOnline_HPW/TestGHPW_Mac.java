package globeOnline_HPW;

import static org.testng.Assert.assertTrue;
import utility.*;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.pagesHPW.LandingPage;
import com.pagesHPW.CheckoutPage;
import com.pagesHPW.FormPage;
import com.pagesHPW.PayPage;
import com.pagesHPW.ProductComparatorPage;
import com.pagesHPW.ThankYouPage;
import java.util.LinkedHashMap;
//import org.openqa.selenium.JavascriptExecutor;
import globeOnline_CommonMethods.*;
public class TestGHPW_Mac extends SetDriver {

	// ***********************************************************************************************************************

	private String invalid_GCash_No = "01234567890";

	private static TestGHPW_Mac multipleCartWithPromo = new TestGHPW_Mac();
	private util util = new util();
	private CommonMethods common = new CommonMethods();

	private LandingPage LP = new LandingPage();
	private ProductComparatorPage PC = new ProductComparatorPage();
	private CheckoutPage checkout = new CheckoutPage();
	private FormPage Form = new FormPage();
	private PayPage Pay = new PayPage();
	private ThankYouPage ThankYou = new ThankYouPage();
	private static  LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	private String Status = "failed";
	
	@Test
	public void testMultipleCartWithPromo() throws Exception {
	JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
	//jse.executeScript("lambda-name=MultipleCartWithPromo");
		
		String cashoutAmount_checkout = "";
		String shipping = "";
		String totalAmount = "";
		Constant.dataMap.set(Constant.LinkedMap);
		Constant.dataMap.get().put("TestClassName",multipleCartWithPromo.getClass().getSimpleName());
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

		Constant.dataMap.get().put("Magento_Details","NOT_FOUND");
		Constant.dataMap.get().put("Magento_OrderAccountInfo","NOT_FOUND");
		Constant.dataMap.get().put("Magento_AddressInformation","NOT_FOUND");
		Constant.dataMap.get().put("Magento_PaymentShippingMethod","NOT_FOUND");
		Constant.dataMap.get().put("Magento_ItemsOrdered","NOT_FOUND");
		Constant.dataMap.get().put("Magento_OrderTotal","NOT_FOUND");
		
		Generic.TestScriptStart("HPWScenario1");
		Generic.WriteTestCase("Validating and Processing HPW Order",
				"User should be able to Place HPW", "ExpectedResult", "ActualResult");
		common.openApplication();		
		common.acceptCookies();		
		common.menuBar("Dev");
		common.ClickonPrepaidWifi("Dev_Desktop");	
		common.GPHWProductValidation(Constant.environment);		
		common.Producttab_validation("Home Prepaid Wifi");	   
		PC.isElementExist("Image - Home Prepaid Wifi", "img_GPHW_specification", 10);			
		common.validateFooter();
//		// ************************************************************************************
//		// line 27 - Validate and click Express Checkout button
//		// ************************************************************************************
		PC.scroll_vertical(1200);
		if (PC.isClickable("BuyNow_Checkout", 50)) {
			Thread.sleep(500L);
			PC.js_clickOnElement("Button", "BuyNow_Checkout", "BuyNow_Checkout");
		Control.takeScreenshot();

//		// ************************************************************************************
//		// line - 37 , Validate Express Checkout Page
//		// ************************************************************************************
		System.out.println("*********  Express Checkout Page ************");
		checkout.scroll_vertical(400);
		int totalQuantity = 0;
		String dataMap_qty = "";
		for (int i = 0; i < checkout.get_quantities().size(); i++) {
			String pName = checkout.get_productsName().get(i).getText();
			String qty = checkout.get_quantities().get(i).getText();
			totalQuantity = totalQuantity + Integer.parseInt(qty);
			System.out.println("For product : " + pName + " Quantity is : " + qty);
			dataMap_qty = dataMap_qty.concat(" | ").concat(qty);
		}

		System.out.println("Cashout Amount : " + checkout.getText("cashoutAmount"));
		cashoutAmount_checkout = checkout.getText("cashoutAmount");

		System.out.println("Shipping : " + checkout.getText("shipping"));
		shipping = checkout.getText("shipping");

		System.out.println("Total Amount : " + checkout.getText("totalAmount"));
		totalAmount = checkout.getText("totalAmount");
		Constant.dataMap.get().put("OMT_AmountPaid", totalAmount);
		Constant.dataMap.get().put("Magento_OrderTotal", totalAmount);
		common.validateTotalAMount(cashoutAmount_checkout, shipping, totalAmount);
		// ************************************************************************************
		// line - 38, Validate Order Details
		// line - 39 - Validate Delivery caveat
		// ************************************************************************************
		System.out.println("*********  Order details ************");		
		common.validate_order_details_on_checkout();
//		// ************************************************************************************
//		// line - 40 - Validate What is GCash
		// ************************************************************************************
		checkout.scroll_vertical(400);
		common.verifyWhatIsGCash();

		// ************************************************************************************
		// line - 41 : Click + : Should be disable if quantity reach maximum qty of 2
		// ************************************************************************************
		System.out.print(totalQuantity+":totalQuantity");
		//common.verifyAddQuantityDisbaledOnCheckout(totalQuantity);
		// ************************************************************************************
		// line - 44, 45, 46 - Clcik the link on "Got a promo code. Click Here"
		// ************************************************************************************
		common.verify_invalid_and_valid_promo_code(Constant.promo);	
		// ************************************************************************************
		// Input Gcash mobile number
		// ************************************************************************************
		System.out.println("Validation for correct GCash number");
		checkout.scroll_vertical(400);
		common.insert_phoneNo_select_checkout_option(Constant.MSISDN_number, "GCash");

		// ************************************************************************************
		// line - 50 - Validate OTP prompt
		// ************************************************************************************
		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			System.out.println("Navigated to screen to insert OTP");
		}
		common.handle_and_insert_OTPAndroid();

		// ************************************************************************************
		// line - 54 - Validate and click bag displayed in the top section
		// ************************************************************************************
		Form.isElementExist("Form-Top Section-Image-Product - GHPW", "topSectionImgGHPW", 10);
		
		String omt_pName = "";
		for (int i = 0; i < Form.get_topSectionProductsName().size(); i++) {
			String topSection_pName = Form.get_topSectionProductsName().get(i).getText();
			System.out.println("Form-TopSection-ProductName : " + topSection_pName);
			System.out.println("Form-TopSection-Price : " + Form.get_topSectionProductsPrice().get(i).getText());

			omt_pName = omt_pName.concat(" | ").concat(topSection_pName);
		}
		// ************************************************************************************
		// line - 55 - Go back to DAF form
		// ************************************************************************************
		Form.scroll_vertical(200);
		System.out.println("Form-Prefilled Mobile No : " + Form.getAttributeValue("mobileNumber", "value"));

		// ************************************************************************************
		// line - 56 - Click Review my bag
		// ************************************************************************************
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", Form.get_reviewBag());
		if (Form.isClickable("reviewBag", 5)) {
			PC.js_clickOnElement("Button", "Review my bag", "reviewBag");
			Thread.sleep(1500L);
		}
//		// ************************************************************************************
//		// line - 57 - Go back to DAF form
//		// ************************************************************************************
		checkout.scroll_vertical(500);
		Thread.sleep(1000);
		if (checkout.isClickable("btnGcashCheckout", 5)) {
			PC.js_clickOnElement("Click On Gcash Checkout", "gcashCheckout", "gcashCheckout");
		}
		// ************************************************************************************
		// line - 58 - Validate Application Form
		// ************************************************************************************
		Form.isElementExist("Form-Personal Information", "formPersonalInfo", 10);
		// ************************************************************************************
		// line - 59 to 62
		// ************************************************************************************
		common.insert_personal_info_on_form_RandomName("zsshettappa@globe.com.ph ", "StandardCheckout");

		// ************************************************************************************
		// line - 63 to 69 - Validate Address field
		// ************************************************************************************
		common.insert_address_details("House", "11", "Amity Circle", "Betterliving", "METRO MANILA", "CITY OF PARAÑAQUE", "Don Bosco");
		// ************************************************************************************
		// line - 70 - Validate Postal Code
		// ************************************************************************************
		String zipCOde = Form.get_zipCode().getAttribute("value");
		if (zipCOde == null || zipCOde.isEmpty()) {
			System.out.println("FAIL : ZIP Code -  is blank");
		} else {
			System.out.println("ZIP Code is pre-populated : " + zipCOde);
		}

		// ************************************************************************************
		// line - 71 - validate Next day delivery
		// ************************************************************************************
		Form.scroll_vertical(350);
		if (Form.check_AttirbuteNotEmpty("imgnextDayDelivery", "src", 10)) {
			if (Form.getAttributeValue("imgnextDayDelivery", "src").contains("inactive")) {
			
				System.out.println("FAIL: Same day delivery toggle is NOT AUTO - selected");
			} else {
				System.out.println("PASS : Same day delivery toggle is auto - selected");
			}
		}
		// ************************************************************************************
		// line - 72 - Validate delivery caveat
		// ************************************************************************************
		System.out.println("Text - 1 : Delivery Caveat : " + Form.getText("txtdeliveryCaveat_1"));
		System.out.println("Text - 1 : Delivery Caveat : " + Form.getText("txtdeliveryCaveat_2"));

		// ************************************************************************************
		// line - 73 - Enter special instructions
		// ************************************************************************************
		String specialInstruct = "testSpecialInstruction";
		if (Form.isElementExist("Enter special instructions", "specialInstruction", 5)) {
			Form.enterText("specialInstruction", "specialInstruction", "call Me after 10AM");		
			System.out.println("Inserted special Instruction : " + specialInstruct);
		} else {
			System.out.println("FAIL: special Instruction field do not exist");
		}
		// ************************************************************************************
		// line - 75 to 81 - Checked i accept all terms and conditions
		// ************************************************************************************
		LP.scroll_vertical(5000);
		Thread.sleep(2000L);
//		common.validate_termsConditions_checkbox_toggle();
		common.select_chkbx_acceptAllTerms();

		// ************************************************************************************
		// line - 82 - Click Pay
		// ************************************************************************************
		Thread.sleep(1500L);
		common.click_pay_btn_on_form("android");
		Thread.sleep(3000L);
	// ************************************************************************************
		// line - 83 - Click change address
		// ************************************************************************************
//		Pay.scroll_vertical(800);
//		common.validate_form_onClick_of_changeAddress("House");	
//		// ************************************************************************************
//		// line - 88 - Validate Payment Page
//		// ************************************************************************************
		common.validate_PaymentPage();

		// ************************************************************************************
//		//  Select PayOptions
//		// ************************************************************************************
//		common.select_payment_option_proceed_with_payment("COD","NoGCash");
//		common.select_payment_option_proceed_with_payment("Gcash","sufficientmobNumber");
//		common.select_payment_option_proceed_with_payment("Gcash","InsufficientGCash");
//		common.select_payment_option_proceed_with_payment("Card","Valid");
//		common.select_payment_option_proceed_with_payment("OTC","PayOverTheCounter");
//		Pay.scroll_vertical(800);
		
//		// ************************************************************************************
//		//  Pay  Give Invalid via  credit card details Try With different option
//		// ************************************************************************************
		common.pay_via_creditCard();
////	common.invalidedeatils_Withtryanotherpayment();

		
//		// ************************************************************************************
//		// line - 89, 90 - Validate order details, shipping address
//		// ************************************************************************************
//		Pay.scroll_vertical(-500);
//		//common.validate_order_shipAdddress_Details_screenPay();
////		common.validate_order_shipAdddress_Details_screenPay_afterTryanotherPage();
		
//		// ************************************************************************************
//		// line - 93 to 96 - validate the Survey Form
//		// ************************************************************************************
		Thread.sleep(10000L);	
		System.out.println("\n"+"*********  SURVEY MODAL ************");
		common.verify_handle_survey_popup_withInput("VERY HAPPY", "", "VERY DISSATISFIED", "Unresponsive");
//		// ************************************************************************************
//		// line - 97 - Validate Thank you page
//		// ************************************************************************************
		common.capture_orderID();
		common.GHPW_BPHPW_Thankyoupage();
//		// ************************************************************************************
//		// line - 98 - Click Copy icon
//		// ************************************************************************************
		ThankYou.get_copyOrderID().click();
		System.out.println("Copied Order ID");
//		// ************************************************************************************
//		//  Click Track my order
//		// ************************************************************************************
		ThankYou.get_linkTrackOrder().click();
		ThankYou.js_clickOnElement("linkTrackOrder", "TrackMyOrder", "linkTrackOrder");
		System.out.println("Clicked on Track Order link");
		common.insertDetailsOnTrackYourOrder();
		common.validateOrderDetails();

		Status = "passed";
		DriverManager.getDriver().quit();
		System.out.println("!!! Execution Completed for "+this.getClass().getName()+" !!!");
		}

	}
	@AfterClass
    public void tearDown() throws Exception {
       if (DriverManager.getDriver() != null) {
            ((JavascriptExecutor) DriverManager.getDriver()).executeScript("lambda-status=" + Status);
            Generic.TestScriptEnds();
			Control.GeneratePDFReport();
            DriverManager.getDriver().quit();
        }
    }
	/********************************************************************************************************************************/

}