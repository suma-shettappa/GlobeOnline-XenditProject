 /*Description: Control Functions library 
'Author :Sunanda Tirunagari and Ankit Kumar
 */

package utility;

import java.util.HashMap;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import globeOnline_CommonMethods.util;

/*import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;*/

public class Constant {
	private static util util = new util();
	//*********omt parameters need to change before execution of each scenario**********//

	public static String UAT_URL ="https://onlineuat.globe.com.ph/";
	
	public static String PreProd_URL ="https://onlinepreprod.globe.com.ph/";
	public static String platformName;
		public static String ScenarioName = "ADASc2_HomePage_Regression";
		public static String platform1="env5";
	    public static String platform2="env6";
		//public static String OMT_FlowID = "ReservationRenewal_PhysicalStock";
		public static String FlowType = "FTA";
		public static String AssignOrderTL = "FTA_Acqui_TL";
		public static String OMT_RegAddressType="House";
		public static String OMT_DispoFirstTime="For Stock Checking";
		public static String Email_GO = "tcoe_globe_online_team@globe.com.ph";

		public static String OrderSubType="";
		public static String EnvProceedbtn="Prod";

		//*********************************************************//
		public static String ScenarioNameHPW = "HPWDEMO";
		//public static String OMT_FlowID = "ReservationRenewal_PhysicalStock";
		//public static String OMT_FlowID = "HPW_THREE_DELIVERY";
		public static String FlowTypeHPW = "HPW";
		public static String AssignOrderTLHPW = "HPW_TL";
		public static String OMT_RegAddressTypeHPW="House";
		public static String OMT_DispoFirstTimeHPW=" For Processing ";
		//public static String Email_GOHPW = "shaik.asma@globe.com.ph";
		//public static String OrderSubTypeHPW="PreOrder";
		public static String   RvnUserName = "ms221419";
		public static String   RvnPassword = "Raven_new@2023";
		public static String   MSISDN = "639270009314";
		public static String   DateFrom = "02/16/2023 16:39";
		public static String   DateTo = "02/16/2023 16:39";

		public static String deviceName;
		public static String environment ="preprod";
		public static String Runin="Lambda";
		public static int Runincol=3;
		public static String DevUrl="https://new.globe.com.ph";
		public static String Maintenance="https://new.globe.com.ph/maintenance-token";
		public static String   Token ="DGTx229IJ6glJ3BL7Br4cNpxDsaokCwXeALD0B";
		public static String DEV_URL1 ="https://onlineuat.globe.com.ph/postpaid-plans/customize-plan/device?plan=&device=Acqui_AppleiPhone14ProMax&variant=Acqui_AppleiPhone14ProMax128GBSpaceBlack&preorder=";

    		
        public void runinfunction() throws Exception
    		{
    	   String  Runin=util.ReadFromRowExcel(Constant.RowValueforenvironment, "AI_TestData", Constant.Runincol);
    		}
    	public static 	String cashoutAmount_checkout = "";
		public static String shipping = "";
		public static String totalAmount = "";
		public static String RowValueforenvironment = "1";
	
		public static String RowValue = "103";
		public static String RowValue_FlowDetails = "78";

		public static int Login_NetworkIDColm = 3;
		public static int Login_PasswordColm = 4;

		public static int FlowIdColumnValue = 30;
		public static int OrderRefID = 4;
		public static int environmentname = 2;
		// public static String ORDERID="4";
		public static int PaymentMenthod = 14;
		public static int ScenarioColumn = 1;
		public static int TimeStamp = 2;
		public static int CustomerDetails = 29;
		public static int OrderState = 5;

		
		
		public static int AgentName = 5;

		
		public static String BSSorderID = "764532";
		public static String BSSorderCaseID = "43725";
		public static String MobilenUmb = "09270000112";
		public static String CustFAID = "452738";
		public static String CustBAID = "829384";
		public static String CustContactID = "09270000133";
		public static String DeliveryCaseID="12345";

		
		public static String ForVerification="For Verification";
		public static String ForOrderCreation = "For Order Creation";
		public static String Renewal_Completed = "Renewal Completed";
		public static String PreOrderWithStock="Pre-order With Stock";
		public static String PreOrderWithoutStock="Pre-order Without Stock";
		public static String ForReservationConfirmation = "For Reservation Confirmation";
		public static int ForcomplinceCount=1;

		public static String OrderCreated = "Order Created";
		public static String  ManualCaseCreation  = "Manual Case Creation";
		public static String OngoingVerification = "ONGOING VERIFICATION";
		public static String  ForManualDeliveryCaseCreation ="For Manual Delivery Case Creation";
		public static String  ForManualOrderDeliveryCaseCreation ="For Manual Order & Delivery Case Creation";
		public static String Approved = "Approved";

		public static String RequestPayment = "Request Payment";

		public static String ReservedPhysicalStock = "Reserved Physical Stock";

		public static String AwaitingPayment = "Awaiting Payment";

		public static String DateLinkSeeding = "07/25/2022";
		public static String  ForActivation = "For Activation";

		public static String ReservationID = "9845673216";
		public static String ReservationID1 = "98456732160";

		public static String PayementRef_happypath = "free";

		public static String PayementRef_NONhappypath = "Pending";

		public static String StatusPay_happypath = "Paid";
		
		public static String ForPickup = "For Pickup";
		
		public static String ForActivated = "ForActivated";
		
		public static String ReservedVirtuallStock = "Reserved Virtual Stock";

		public static String ForProcessing = "For Processing";

		public static String Processed = "Processed";
		
		public static String PreorderWithStock ="Pre-order With Stock";
		
		public static String PreorderWithoutStock ="Pre-order Without Stock";
  
		public static String ForDispatch ="For Dispatch";
		
		public static String Cancelled = "Cancelled";

		public static String ForDelivery = "For Delivery";

		public static String Delivered = "Delivered";

		public static String Activated = "Activated";

		public static String Completed = "Completed";

		public static String ForCompliancePOFC = "For Compliance - POFC";
		public static String ForCompliancePOID_POFC = "For Compliance - POID/POFC";
		public static String ForCompliancePOID = "For Compliance - POID";
		public static String ForRedelivery2 = "For Redelivery2";
		public static String ForRedelivery1 = "For Redelivery1";

		public static String ForRedelivery3 = "For Redelivery3";

		public static String PostDet_Transactiondate = "05262022";

		public static String PostDet_PayId = "3472892";

		public static String PostDet_PostingRemarks = "4327156";

		public static String PostDet_InvoiceID = "56831854842";

		public static String InComplete_USCNum = "1234";
		public static String InValidEven_USCNum = "123456789";
		public static String InValidODD_USCNum = "133456789";
		// DAF PAGE EDGE Condo ADDRESS
		public static String HouseNo = "14";
		public static String Street = "Avida Towers Sucat";
		public static String Village = "Dr Arcadio Santos Ave";
		public static String ZipCode = "1408";
		public static String Barangay = "Don Bosco";
		public static String City = "CITY OF PARAï¿½AQUE";
		public static String Province = "METRO MANILA";
		public static String   OrderID = "PRE-000007625";
		public static String   Name = "Rosa jossaline corinne!";
		public static String   DeliverySMS ="Hi! Your order with reference no. "+ OrderID +" is now on its way to you! You may also track your order at https://new.globe.com.ph/track-order. Thank you for choosing Globe!";
		public static String   CompletedSMS ="Hi! Your order with reference no. "+ OrderID +" is now activated! Thank you for choosing Globe!";
		public static String   RedeliverySMS ="Hi "+ Name +" We tried to deliver your order with ref no. "+ OrderID +", but you weren't able to receive it. You may choose to reschedule your delivery via https://new.globe.com.ph/track-order or expect us to redeliver it by tomorrow.";
	    public static String   ForCompliancePOIDPOFC_SMS ="Hi! Your proof of identification and financial capacity need to be updated. To send an updated document, please go to <URL> and send it to us within 48 hours to continue with your order. Thank you.";
	    public static String   ForCompliancePOID_SMS ="Hi! Your proof of identification needs to be updated. To send an updated document, please go to <URL> and send it to us within 48 hours to continue with your order. Thank you.";
	    public static String   ForCompliancePOFC_SMS ="Hi! Your proof of income document needs to be updated. To send an updated document, please go to <URL> and send it to us within 48 hours to continue with your order. Thank you.";
	    public static String   ForCalloutSMS ="Hi! Please expect a call from us to check the submitted documents for your application before proceeding with your ordered plan. Thank you.";
	    public static String   AwatingstockD07_SMS ="Hello! We're sending this update about your reservation for Acqui with reference no. "+ OrderID +". As of today, there are still no available stocks due to limited global supply. Rest assured that we're working hard to get your device to you and we will continue to keep you informed of updates on your order. Thank you for your understanding.";
	    public static String   AwatingstockD21_SMS ="Hello! We're sending this update about your reservation for Acqui with Ref #. "+ OrderID +". As of today, there are still no available stocks due to limited global supply. Rest assured that we are working hard to get your device to you and we will continue to keep you informed of updates on your order.";
	    public static String   AwatingstockD35_SMS ="Hello! We're sending this update about your reservation for Acqui with reference no. "+ OrderID +". As of today, there are still no available stocks due to limited global supply. Rest assured that we're working hard to get your device to you and we will continue to keep you informed of updates on your order. Thank you for your understanding.";
	    public static String   AwatingstockD49_SMS ="Hello! We're sending this update about your reservation for Acqui with reference no. "+ OrderID +". As of today, there are still no available stocks due to limited global supply. Rest assured that we're working hard to get your device to you and we will continue to keep you informed of updates on your order. Thank you for your understanding.";
	    public static String   CancelledSMS ="Hi, "+ Name +". We've reached the maximum number of delivery attempts for your order with ref. no. "+ OrderID +". This transaction has now been cancelled. Please check your email for the details of your order.";
	    public static String   AwatingBSS_SMS ="Your order with ref no. "+ OrderID +" is on its way to you! Thank you for choosing Globe/TM!";
	    public static String   MNPCancelled_SMS ="Hi, "+ Name +". We've reached the maximum number of delivery attempts for your order with ref. no. "+ OrderID +". This transaction has now been cancelled. Please check your email for the details of your order.";
	    public static String   ForConfirmation_SMS ="Hi! We noticed that you placed another order under ref no "+ OrderID +". We'll get in touch with you to confirm this order.";
	    public static String   ForPayment_SMS ="Hi! Your payment for order ref no. "+ OrderID +" has been received! As the community quarantine continues, deliveries may take longer than expected. Thank you and take #ExtraCareAtHome.";
	    public static String   ForDeliveryHPW_SMS ="Hi! Your order with reference no. "+ OrderID +" is now on its way to you! You may also track your order at <URL>. Thank you for choosing Globe!";
	    public static String   ForActivation_SMS ="Hi! Your order with order ref no. "+ OrderID +" has been successfully delivered! To activate your device, just visit <URL here>";
	    public static String   HPWCancelled_SMS ="Hello. Your Globe order with reference no. "+ OrderID +" has been canceled. If you want to avail another product, please visit https://new.globe.com.ph/";
	    public static String   Refunded_SMS ="Hi! Your refund for order ref no. "+ OrderID +" has been completed. To place a new order, just visit The Globe Online Shop at https://new.globe.com.ph/";
		

		// MAC DAF PAGE ADDRESS

		public static String HouseNo_MAC = "11";
		public static String Street_MAC = "Annex 7";
		public static String Village_MAC = "Amity Circle";
		public static String ZipCode_MAC = "1700";
		public static String Barangay_MAC = "Don Bosco";
		public static String City_MAC = "PARANAQUE CITY";
		public static String Province_MAC = "METRO MANILA";

		// IPAD DAF PAGE ADDRESS
		public static String HouseNo_IPad = "4";
		public static String Street_IPad = "Madison st";
		public static String Village_IPad = "Metro Circle";
		public static String ZipCode_IPad = "1550";
		public static String Barangay_IPad = "Barangka Ilaya";
		public static String City_IPad = "Mandaluyong CITY";
		public static String Province_IPad = "METRO MANILA";

		// IPhone DAF PAGE ADDRESS
		public static String HouseNo_IPhone = "251";
		public static String Street_IPhone = "Salvador St";
		public static String Village_IPhone = "Metro Circle";
		public static String ZipCode_IPhone = "1970";
		public static String Barangay_IPhone = "Rizal";
		public static String City_IPhone = "BARAS";
		public static String Province_IPhone = "RIZAL";

		// Android Condo DAF PAGE ADDRESS
		
	// ***************OMT******************//
		public static String InvalidEmailAddress = "12@gmail.com";
		public static String ValidEmailAddress = "kummithi.vishnuvardhanreddy@globe.com.ph";
		public static String InvalidBdy = "24/12/2000";
		public static String ValidBdy = "12/12/2000";
		//public static String FirstName = "Vishnu";
		public static String LastName = "Kummithi";
		public static String MiddleName = "Vardhan Reddy";


	
		public static String HouseNo_Android = "5";
		public static String Street_Android = "8 Burgos Ext";
		public static String Village_Android = "Metro Circle";
		public static String ZipCode_Android = "6100";
		public static String Barangay_Android = "Villamonte";
		public static String City_Android = "BACOLOD";
		public static String Province_Android = "NEGROS OCCIDENTAL";
		public static String pass = "Password@1997";



	public static String CheckigMNPStatus = "CheckigMNPStatus";

	public static String PortingUnderView = "PortingUnderView";

	public static String PortingReqStatusSuccess = "PortingReqStatusSuccess";

	public static String PortingReqStatusPeding = "PortingReqStatusPeding";

	public static String PortingReqStatusFailed = "PortingReqStatusFailed";



	//		public static String OngoingVerification = "ONGOING VERIFICATION";



	// public static final String TestDataFilePath = "NF_WebTool.xlsx";
	public static final String TestDataFilePath = "OMT.xlsx";
	public static final String Environment = "SIT";
	public static final String Browser = "Chrome";
	//	public static final String PropertiesFilePath = TestDataFilePath;
	public static int SeqID = 1;
	public static int StepIndex = 0;
	public static int TestStepIndex = 0;
	public static int StepStatus = 0;
	public static int TestCaseIndex = 0;
	public static int TestCaseNumber = 0;
	public static int PassedCases = 0;
	public static int FailedCases = 0;
	public static int RowNo = 0;
	public static int lastTestCaseNumber = -1;
	public static boolean atleastOneFailure = false;
	public static boolean testFailed = false;
	public static HashMap<String, HashMap<String, String>> TestData_All = new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, String> TestData1 = new HashMap<String, String>();
	public static HashMap<String, HashMap<String, String>> Map = new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, HashMap<String, String>> Map2 = new HashMap<String, HashMap<String, String>>();
	public static LinkedHashMap<String,String> LinkedMap = new LinkedHashMap<>();
	//public static final int defaultBrowserTimeOut = 15;
	public static String Qrcodetext = null;
	//public static String UserStoryName = null;
	//public static String ResultFilePath = null;
	public static String ScreenshotFolderName = "Screenshot";
	public static String PageName = "screenshotpage";
	public static String locator = "screenshotlocator";
	public static String RecentScreenshot = null;
	public static WebDriver driver = null;
	//	public static AppiumDriver driver = null;
	//	public static AndroidDriver<MobileElement> driver = null;
	public static List<WebElement> webelements;
	public static boolean DefaultoptionalFlag = true;
	public static boolean NF_AddOperationFlag = true;

	public static String ForCallback="For Callback";
	public static String DisapprovedApplication="Disapproved Application";

	
	public static final String path_to_python_scripts = "D:\\PDF_SolutionComp\\PDF_SolutionComp\\";

	public static final String Device_Type = "PC";

	//public static URL url = null;
	public static SessionId sid = null;

	public static String SheetName = null;
	public static String StepParameters_Flag = "n";
	public static String Messagetypes = "";
	public static final String DriverPath = "D:\\TechM\\WedDriver\\";
	public static String Reward = "";
	public static int iCol;

	public static String GCashNum1 = "9270002678";
	public static String promo = "HPW2023";



	public static String ADA5_Testdata = "09270011488";
	public static String ADA8_Testdata = "09270009582"; 

	public static String ReferenceNo;

	public static String PreorderWaitlistADA_TestData = "09270009760";
	public static String PreorderWaitlistRenewal_TestData = "09270009596";
	public static String device = "Huawei nova 9 + FREE Backpack Swift";

	public static String ReservationADA_TestData = "09270009814";
	public static String ReservationFTA_TestData = "09270009569";
	public static String deviceUsed = "Xiaomi Redmi 9C";

	public static String ReservationRenewal_TestData = "09270009745";
			//09270009755";
	public static String ResRenewaldevice = "Xiaomi Redmi 9C";
	public static String deviceStartWord = "Xiaomi";


	/**********************************************************************************************************************************************/









	//***************OMT******************//




	public static String senderList="8080,2652,2882,9451926523,2916,2884,AutoLoadMAX,GLOBE,3373";//comma seperated values


	public static float smsPercentageMatch=0.70f;

	public static int smsWaitingTime=30; //in seconds

	public static int sleepTimeBeforeCheckingMessages=120000;//milliseconds
	public static String WorkSpace = System.getProperty("user.dir");
	public static String ProjectName = "GlobeOne";
	public static String gCash_number = "09496755579"; 
	public static String MSISDN_number = "09058121416"; 
	public static String url = "https://onlineuat.globe.com.ph/"; 

	//public static  LinkedHashMap<String,String> dataMap = new LinkedHashMap<>();

	public static ThreadLocal<LinkedHashMap<String, String>> dataMap =new ThreadLocal<LinkedHashMap<String, String>>();
	public static ThreadLocal<LinkedHashMap<String, Integer>> dataMap1 =new ThreadLocal<LinkedHashMap<String, Integer>>();

	public static HashMap<String, HashMap<String, String>> Map3 = new HashMap<String,HashMap<String,String>>();
	public static HashMap<String, HashMap<String, String>> Map4 = new HashMap<String,HashMap<String,String>>();
	//private static LinkedHashMap<String, Integer> Map1 = new LinkedHashMap<>();


	/*
	 * ***********************************************************
	 * System Parameters - shall NOT be modified by END users
	 * ***********************************************************
	 */

	public static String ipToListen=null;


	public static final String Brand[] = null;

	public static boolean MultipleTCInOneMethod = false;

	public static int MaxDriverTimeOut =30;
	public static String UserStoryName = null;
	public static String ResultFilePath = null;
	public static String strScenarioDesc=null;
	public static String strExpectedResult=null;
	public static String strActualResult=null;
	public static WebDriver driver_w = null;
	public static WebElement webelement;	

	public static int flag_init=0;
	public static String lastSMSTime="";
	public static long youtubeElapsedTime=0;
	public static long updatedStartTime=0;
	public static boolean timerRunning=false;

	//this is only for critical func, like checking balance, turning on/off internet, making voice call
	public static int retryOnFailureCount=3;

	public static int numberOfFreeMessages=0;

	public static WebElement youtubeScreen=null;
	public static int youtubeX=-1;
	public static int youtubeY=-1;
	public static String lastReadSMSFileName="";


	public static int comparisonType=2;//ignore tagged texts
	public static String dynamicLine="";
	public static float numberOfFreetexts=0;

	public static double lastSmsOrUssdTime=0;
	public static boolean flagMultipleMessages=false;


	public static float lastSmsPercentMatch=0.0f;
	public static boolean flagOnlySpecificSenders=true;


	public static String textViewerPackageName="com.example.hp_pc.simpletextviewer";
	public static String textViewerActivityName="com.example.hp_pc.simpletextviewer.MainActivity";
	public static String[] specificSenderList=senderList.split(",");
	public static int numberOfExpectedSms=1;
	public static int numberOfExpectedReply=1;
	public static int maxNumberOfColumns=50;
	public static int globalRowNumber=0;
	public static int lastRepliedRowNumber=0;
	public static String brandType="Regular";
	public static boolean alreadyWaited=false;
	public static String commandPullSS = "adb shell input keyevent 4";
	public static String commandPullSSS = "adb shell input touchscreen swipe 830 1120 530 1120";

	public static boolean flag = true;

	public static boolean Broadband = false;

	public static boolean SGTier1 = false;

	public static int scrolLimit=0;

	public static String midX;

	public static String Failures;

	public static boolean paperlessBillinhDisabled = false;

	public static boolean GoGreen = false;

	public static int defaultBrowserTimeOut = 30;

	public static int defaultBrowserTimeOut1 = 5;

	public static int NumberOfTriesToDownloadApp = 3;

	public static boolean BillGenerated = true;

	public static int MinDriverTimeOut = 2;

	public static boolean AppLaunched = false;
	public static HashMap<String, HashMap<String, String>> labelMap = new HashMap<String, HashMap<String, String>>();
	public static String UnitNo ;
	public static String FirstName;
	public static String StreetName;
//	public static String Province;
//	public static String City;
//	public static String Barangay;
//	public static String ZipCode;
	public static String Platform;
	public static String AcceptText = "Our website uses cookies to help enhance your browsing experience. Continue to browse our site if you agree to our use of cookies as described in Globe's Cookie Policy. Otherwise, you may change your cookie settings. For information on how we protect your privacy, please read our Privacy Policy.";

	public static String DataPrivacyMNPText = " By submitting your number, you agree to the collection and use of the data you provided through this website for the purpose of purchasing a Globe product and/or service. You understand that the collection and use of this data, which may include sensitive and personal information, shall be in accordance with the Data Privacy Act of 2012 and Privacy Policy of Globe. ";

	public static String SwitchGlobeContent = "We've made it easier than ever to ";
	public static String LipatNaSaContent = "Sali na sa #SamahangPinaEasy para sa tuloy-tuloy na saya! I-activate ang iyong TM 5G SIM at mag-enjoy ng hanggang 9 GB freebies para sa â€˜yo!";
	// Chrome Test data and USC COde
		public static String MobileNo = "09440000921";
		public static String USCNum = "111225842";
		//public static String MSISDN = "639440000921";

		// Edge Test data and USC COde
		public static String MobileNo_Edge = "440000768";
		public static String USCNum_Edge = "154866623";
		public static String MSISDN_Edge = "639440000768";

		// For Mac USED chrome data
		public static String MAC_UsedMobileNum = "09440000747";
		public static String USCNum_MAC = "155852431";
		public static String MSISDN_MAC = "639440000747";

		// Ipad Test data and USC COde
		public static String MobileNo_IPad = "440000747";
		public static String USCNum_IPad = "151426567";
		public static String MSISDN_IPad = "639440000747";

		// Iphone Test data and USC COde
		public static String MobileNo_IPhone = "09440000921";
		public static String USCNum_IPhone = "111225842";
		public static String MSISDN_IPhone = "639440000921";

		// Android Test data and USC COde
		public static String MobileNo_Android = "440000923";
		public static String USCNum_Android = "156287712";
		public static String MSISDN_Android = "639440000923";

		// Landaing page starts with 09
		public static String MobNoStarts = "09";


	//public static Object driver;


}
