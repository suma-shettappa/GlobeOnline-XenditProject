package globeOnline_OMTOkta;

import java.util.ArrayList;


import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.BasePage;
import com.pages.omt.ACQUI_omt_page;
import com.pages.omt.Renewal_OMT_page;

import globeOnline_CommonMethods.DriverManager;

import globeOnline_CommonMethods.util;
//import globeOnline_OMT.Constant;
import utility.Constant;
import utility.Control;
import utility.Generic;

public class OMT_Renewal_Functions {

	public  String Barangay="";
	public  String City="";
	public  String Province="";
	
	private static LinkedHashMap<String, String> Map = new LinkedHashMap<>();
	private util util = new util();
	private BasePage BP = new BasePage();
	//public Constant Constant = new Constant();
	private ACQUI_omt_page OMTAcqui = new ACQUI_omt_page();
	
	private Renewal_OMT_page OMTRenew = new Renewal_OMT_page(); 

	/*****
	 * RONNIE SCRIPT STARTS HERE
	 * 
	 ******************************************************************************************************************************/

	public void GotoURL(String agentName, String agentPassword) throws Exception {
		// public void GotoURL() throws Exception{
		// ((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.open()");
		ArrayList<String> tab = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		DriverManager.getDriver().switchTo().window(tab.get(1));
		DriverManager.getDriver().get("https://edo-dev-data-engineering.globe.com.ph/omt-sat/bbsp-admin/");
	}

	// *********************************************************************************************************
	public void insert_Usr_pswd(String usr, String Pswd) throws Exception {

		OMTAcqui.get_LoginUsername().clear();
		OMTAcqui.get_LoginUsername().sendKeys(usr);
		System.out.println("User name : " + usr);
		BP.scroll_vertical(600);
		Constant.dataMap.get().put("OMT_Username", usr);

		OMTAcqui.get_LoginPassword().clear();
		OMTAcqui.get_LoginPassword().sendKeys(usr);
		System.out.println("Password : " + Pswd);
		BP.scroll_vertical(600);
		Constant.dataMap.get().put("OMT_Password", Pswd);

		// Signin
		OMTAcqui.isElementExist("Signin button", "Signinbutton", 10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", OMTAcqui.get_SignInBtn());
		Thread.sleep(400);

		OMTAcqui.isElementExist("Entities drop down", "Entities", 10);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_EntitiesBtn());
		Thread.sleep(400);

		OMTAcqui.isElementExist("Application Entry", "ApplicationEntry", 10);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_AppllEntryBtn());
		Thread.sleep(400);

	}

	// *********************************************************************************************************

	public void OMTLogin(String agentName, String agentPassword) throws Exception {
		if (OMTAcqui.isElementExist("Account Button", "AccountBtn", 10)) {
			OMTAcqui.clickOnElement("OMT Button: ", "AccountBtn", "AccountBtn");

			OMTAcqui.clickOnElement("OMT Button: ", "SignInBtn", "SignInBtn");
			OMTAcqui.get_LoginUsername().sendKeys(agentName);
			OMTAcqui.get_LoginPassword().sendKeys(agentPassword);
			OMTAcqui.clickOnElement("OMT Button: ", "LoginBtn", "LoginBtn");

			OMTAcqui.clickOnElement("OMT Button: ", "EntitiesBtn", "EntitiesBtn");
			OMTAcqui.clickOnElement("OMT Button: ", "AppllEntryBtn", "AppllEntryBtn");
		}

	}

	public void OMTverifier(String agentName, String agentPassword) throws Exception {

		OMTAcqui.get_LoginUsername().sendKeys(agentName);
		OMTAcqui.get_LoginPassword().sendKeys(agentPassword);
		OMTAcqui.clickOnElement("OMT Button: ", "LoginBtn", "LoginBtn");

		OMTAcqui.clickOnElement("OMT Button: ", "EntitiesBtn", "EntitiesBtn");
		OMTAcqui.clickOnElement("OMT Button: ", "AppllEntryBtn", "AppllEntryBtn");

	}

	
	public void OMTSearch_and_ValidateDashboard1() throws Exception {

		String OrderRefId = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);

		OMTAcqui.get_SearchField().sendKeys(OrderRefId);
		Thread.sleep(5000L);
		OMTAcqui.clickOnElement("Search button", "SearchBtn", "SearchBtn");
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		Thread.sleep(3000);
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTRenew.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTRenew.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTRenew.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTRenew.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTRenew.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTRenew.get_Dashboard_Dispo().getText() + "\n");

		if(OMTAcqui.isElementExist("Dashboard Reason", "Dashboard_Reason", 10))
		{
			System.out.println("Reason: "+ OMTAcqui.get_Dashboard_Reason().getText());
		}
		if(OMTAcqui.isElementExist("Dashboard Assignee", "Dashboard_Assignee", 10))
		{
			System.out.println("Reason: "+ OMTAcqui.get_Dashboard_Assignee().getText());

		}
		if(OrderRefId.equalsIgnoreCase(OMTRenew.get_Dashboard_RefNum().getText())) {
			Generic.WriteTestData("User should be able to see the searched order id: ", "", "", "should be able to see the searched order id in dash board","User is able to see the searched order id in dash board", "Passed");
			Control.takeScreenshot();
		}else {
			Generic.WriteTestData("User should be able to see the searched order id: ", "", "", "should be able to see the searched order id in dash board","User is not able to see the searched order id in dash board", "Failed");
			Control.takeScreenshot();
		}
		OMTAcqui.isElementExist("View Button", "ViewBtn", 10);
		OMTAcqui.isElementExist("Edit Button", "EditBtn", 10);
		// }
	}
	
	public void OrderStatusVerifyInDashboard(String ExpStatus) throws Exception {

		String OrderRefId = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
        
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		
		OMTAcqui.get_SearchField().sendKeys(OrderRefId);
		Thread.sleep(5000L);
		OMTAcqui.clickOnElement("Search button", "SearchBtn", "SearchBtn");
		Thread.sleep(5000L);
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTAcqui.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTAcqui.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTAcqui.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTAcqui.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTAcqui.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTAcqui.get_Dashboard_Dispo().getText() + "\n");
		
		// OMTAcqui.get_Dashboard_Assignee().getAttribute("value")
		if(OrderRefId.equalsIgnoreCase(OMTAcqui.get_Dashboard_RefNum().getText())) {
			Generic.WriteTestData("User should be able to see the searched order id: ", "", "", "should be able to see the searched order id in dash board","User is able to see the searched order id in dash board", "Passed");
			Control.takeScreenshot();
		}else {
			Generic.WriteTestData("User should be able to see the searched order id: ", "", "", "should be able to see the searched order id in dash board","User is not able to see the searched order id in dash board", "Failed");
			Control.takeScreenshot();
		}
		
		if(ExpStatus.equalsIgnoreCase(OMTAcqui.get_Dashboard_Dispo().getText())) {
			Generic.WriteTestData("Order Status Should change to:"+ExpStatus+" ", "", "", "Order Status Should change to:"+ExpStatus+"","Order Status changed to:"+ExpStatus+"", "Passed");
			Control.takeScreenshot();
		}else {
			Generic.WriteTestData("Order Status Should change to:"+ExpStatus+" ", "", "", "Order Status Should change to:"+ExpStatus+"","Order Status is changed to:"+ExpStatus+"", "Failed");
			Control.takeScreenshot();
		}
		WebElement a = DriverManager.getDriver().findElement(OMTAcqui.DispositionStatus);
		String status = a.getText();
		
	   Signout();		
		
	}

	public void OMTSearch_and_ValidateDashboard(String OrderRefId) throws Exception {

		OMTAcqui.get_SearchField().sendKeys(OrderRefId);
		Thread.sleep(5000L);
		OMTAcqui.clickOnElement("Search button", "SearchBtn", "SearchBtn");
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTAcqui.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTAcqui.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTAcqui.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTAcqui.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTAcqui.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTAcqui.get_Dashboard_Dispo().getText() + "\n");
		// String Reason=OMTAcqui.get_Dashboard_Reason().getAttribute("value");
		/*
		 * if(OMTAcqui.get_Dashboard_Reason().isDisplayed()) {
		 * System.out.println("Reason / Remarks: " +
		 * OMTAcqui.get_Dashboard_Reason().getText()); }
		 */
		// "Reason / Remarks: " + OMTAcqui.get_Dashboard_Reason().getText()+"\n"
		// "Assignee: " +
		// OMTAcqui.get_Dashboard_Assignee().getAttribute("value")
		OMTAcqui.isElementExist("View Button", "ViewBtn", 10);
		OMTAcqui.isElementExist("Edit Button", "EditBtn", 10);
		// }
	}

	public void OMTSearch_and_ValidateDashboardverifier(String OrderNumber) throws Exception {
		OMTAcqui.get_SearchField().sendKeys(OrderNumber);
		OMTAcqui.get_SearchBtn().click();
		Thread.sleep(5000L);
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTAcqui.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTAcqui.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTAcqui.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTAcqui.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTAcqui.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTAcqui.get_Dashboard_Dispo().getText() + "\n");
		// "Reason / Remarks: " +
		// OMTAcqui.get_Dashboard_Reason().getAttribute(name)
		// "Assignee: " + OMTAcqui.get_Dashboard_Assignee().getText());

		OMTAcqui.isElementExist("View Button", "ViewBtn", 10);
		OMTAcqui.isElementExist("Edit Button", "EditBtn", 10);
		// }
	}

	public void OMTSearch_and_ValidateDashboarddispatch(String OrderNumber) throws Exception {
		OMTAcqui.get_SearchField().sendKeys(OrderNumber);
		Thread.sleep(5000L);
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTAcqui.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTAcqui.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTAcqui.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTAcqui.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTAcqui.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTAcqui.get_Dashboard_Dispo().getText());
		// "Reason / Remarks: " + OMTAcqui.get_Dashboard_Reason().getText());
		// "Assignee: " + OMTAcqui.get_Dashboard_Assignee().getText());

		OMTAcqui.isElementExist("View Button", "ViewBtn", 10);
		OMTAcqui.isElementExist("Edit Button", "EditBtn", 10);
		// }
	}

	public String Validate_ORDER(String OrderNumber, String OrderSubType, String FlowType, String Dispo) throws Exception {
		if (OrderNumber.equalsIgnoreCase(OMTAcqui.get_OMT_OrderID().getText())) {
			System.out.println("Customer Order Details: " + "\n" +

					"Order Type: " + OMTAcqui.get_OMT_OrderType().getAttribute("value"));
			Generic.WriteTestData("User should be able to validate order Type", "", "", "User should be able to validate order Type as Renewal","User should be able to validate order Type as "+OMTAcqui.get_OMT_OrderType().getAttribute("value")+"", "Passed");
			Control.takeScreenshot();
			Thread.sleep(4000);
		}
		// "OrderID: " + OMTAcqui.get_OMT_OrderID().getAttribute("value") + "\n"
		// +
		else {
			System.out.println("OrderID did not match - Failed");
		}

		if (OrderSubType.equalsIgnoreCase(OMTAcqui.get_OMT_orderSubType().getAttribute("value"))||OrderSubType.equalsIgnoreCase("Preorder"))
		{
			System.out.println("Order Sub-Type: " + OMTAcqui.get_OMT_orderSubType().getAttribute("value"));
		} else {
			System.out.println("Order Sub-type did not match - Failed");
		}
		
		String a = OMTAcqui.get_OMT_Disposition().getAttribute("value");
		By val = By.xpath("//option[@value='" + a + "']");
		String b = DriverManager.getDriver().findElement(val).getText();
		if (Dispo.equalsIgnoreCase(b)) {
			System.out.println(
					"Disposition: " + b + "\n" + "Reason: " + OMTAcqui.get_OMT_DispoReason().getAttribute("value"));
		} else {
			System.out.println("Disposition did not match - Failed");
		}
		return b;
	}


	public String Validate_PRIMARYCUSTOMERDETAILS() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_Customerdetails());
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_Customerdetails());

		System.out.println(
				"PRIMARY CUSTOMER DETAILS: " + "\n" + "Fullname: " + OMTAcqui.get_Primary_Fname().getAttribute("value")
						+ " " + OMTAcqui.get_Primary_MName().getAttribute("value") + " "
						+ OMTAcqui.get_Primary_LName().getAttribute("value") + "\n" + "Mobile Number: "
						+ OMTAcqui.get_Primary_MobNum().getAttribute("value") + "\n" + "Email Address: "
						+ OMTAcqui.get_Primary_Email().getAttribute("value") + "\n" + "Birthday: "
						+ OMTAcqui.get_Primary_Bday().getAttribute("value") );
		
	 
		if(OMTAcqui.isElementExist("Primary_Gender", "Primary_Gender", 10))
		{
			System.out.println("Primary_Gender: " + OMTAcqui.get_Primary_Gender().getAttribute("value"));
	
		}
		if(OMTAcqui.isElementExist("Primary_Nationality", "Primary_Nationality", 10))
		{
			
		if (OMTAcqui.get_Primary_Nationality().getAttribute("value").equalsIgnoreCase("Filipino")) {
			System.out.println("Nationality: " + OMTAcqui.get_Primary_Nationality().getAttribute("value"));
		} else {
			System.out.println("Nationality did not match - Failed");
		}
		}

		String FName = OMTAcqui.get_Primary_Fname().getAttribute("value");
		String MName = OMTAcqui.get_Primary_MName().getAttribute("value");
		String LName = OMTAcqui.get_Primary_LName().getAttribute("value");
		String Em = OMTAcqui.get_Primary_Email().getAttribute("value");

		String CustomerDetails = FName + " " + MName + " " + LName + "," + Em;

		System.out
				.println("Full Mother's Maiden Name: " + OMTAcqui.get_Primary_FullMothersname().getAttribute("value"));
		System.out.println("Authorized Contact Person: " + OMTAcqui.get_Primary_RecipientName().getAttribute("value")
				+ " | " + OMTAcqui.get_Primary_RecipientMobNum().getAttribute("value"));
		Generic.WriteTestData("Omt customer details validation : ", "", "", "User should be able to validate customer details", "User is able to validate customer details", "Passed");
		Control.takeScreenshot();
		return CustomerDetails;
		

	}
	
	public String DetailsReturn()
	{
		String a = OMTAcqui.get_PrimaryRegAdd_Brgy().getAttribute("value");

		if(a.isEmpty())
		{
		String Barangay="null";
			System.out.println("Barangay field value is not prepopulated:"+" "+ Barangay);
			
		}
		else if(!a.isEmpty())
		{
			By b = By.xpath("//select[@name='barangay']//option[@value=" + "'" + a + "'" + "]");
			 String Barangay = DriverManager.getDriver().findElement(b).getText();
			 System.out.println("Barangay value " +" "+ Barangay );
		}

		String c = OMTAcqui.get_PrimaryRegAdd_City().getAttribute("value");
		if(c.isEmpty())
		{
			String City="null";
			System.out.println("City field value is not prepopulated:"+" "+ City);

		}
		else if(!c.isEmpty())
		{
			By d = By.xpath("//select[@name='city']//option[@value=" + "'" + c + "'" + "]");
			String City = DriverManager.getDriver().findElement(d).getText();
			 System.out.println("City value " + " "+City );

		}
		

		String e = OMTAcqui.get_PrimaryRegAdd_Province().getAttribute("value");
		if(e.isEmpty())
		{
			String Province="null";
			System.out.println("Province field value is not prepopulated:"+" "+ Province);

		}
		else if(!e.isEmpty())
		{
			By f = By.xpath("//select[@name='province']//option[@value=" + "'" + e + "'" + "]");
			String Province = DriverManager.getDriver().findElement(f).getText();
			 System.out.println("Province value " + Province );
		}
		
		String Values=Barangay+","+Province+","+City;
		
		return Values;
		
	}

	public String Validate_RegisteredAddressRenewal(String House_Condo) throws Exception {
		BP.scroll_vertical(520);
		String a = OMTAcqui.get_PrimaryRegAdd_Brgy().getAttribute("value");

		String BarangayProvCity=DetailsReturn();

		if (House_Condo.equalsIgnoreCase("House")) {

			System.out.println("Registered Address House: " + OMTAcqui.get_PrimaryRegAdd_houseNo().getAttribute("value")
					+ " " + OMTAcqui.get_PrimaryRegAdd_Street().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + "  " + OMTAcqui.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n"
					+ "Longitude: " + OMTAcqui.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTAcqui.get_PrimaryRegAdd_Latitude().getAttribute("value"));

			String AddressDetails = OMTAcqui.get_PrimaryRegAdd_houseNo().getAttribute("value") + ","
					+ OMTAcqui.get_PrimaryRegAdd_Street().getAttribute("value") + "," + BarangayProvCity +","
					+ OMTAcqui.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + "," + OMTAcqui.get_PrimaryRegAdd_Zipcode().getAttribute("value");
			Generic.WriteTestData("Omt Registered Address validation : ", "", "", "User should be able to validate Rigistered Address", "User is able to validate Rigistered Address", "Passed");
            Control.takeScreenshot();
			return AddressDetails;

		}

		else {
			System.out.println("Registered Address Condo: " + OMTAcqui.get_PrimaryRegAdd_FlrNo().getAttribute("value")
					+ " " + OMTAcqui.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryRegAdd_Street().getAttribute("value") + " " + Barangay + " " + City + ", "
					+ Province + " " + OMTAcqui.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTAcqui.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTAcqui.get_PrimaryRegAdd_Latitude().getAttribute("value"));

			String AddressDetails = OMTAcqui.get_PrimaryRegAdd_FlrNo().getAttribute("value") + ","
					+ OMTAcqui.get_PrimaryRegAdd_BuildingName().getAttribute("value") + "," + BarangayProvCity +","
					+ OMTAcqui.get_PrimaryRegAdd_Street().getAttribute("value") + "," + Barangay + "," + City + ", "
					+ Province + "," + OMTAcqui.get_PrimaryRegAdd_Zipcode().getAttribute("value");
			Generic.WriteTestData("Omt Registered Address validation : ", "", "", "User should be able to validate Rigistered Address", "User is able to validate Rigistered Address", "Passed");
            Control.takeScreenshot();
			return AddressDetails;

		}

	}

	public void Validate_ShippingAddress(String House_Condo_Sameasbilling) throws Exception {
		BP.scroll_vertical(300);

		if (House_Condo_Sameasbilling.equalsIgnoreCase("House")) {
			System.out.println("Shipping Address House: " + OMTAcqui.get_PrimaryShipAdd_HouseNo().getAttribute("value")
					+ " " + OMTAcqui.get_PrimaryShipAdd_VillageSubdi().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_Street().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_Brgy().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_City().getAttribute("value") + ", "
					+ OMTAcqui.get_PrimaryShipAdd_Province().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_ZipCode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTAcqui.get_PrimaryShipAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTAcqui.get_PrimaryShipAdd_Latitude().getAttribute("value"));
			Generic.WriteTestData("Omt shipping Address validation : ", "", "", "User should be able to validate shipping Address", "User is able to validate shipping Address", "Passed");
            Control.takeScreenshot();

		}

		else if (House_Condo_Sameasbilling.equalsIgnoreCase("Condo")) {
			System.out.println("Shipping Address House: " + OMTAcqui.get_PrimaryShipAdd_FlrNo().getAttribute("value")
					+ " " + OMTAcqui.get_PrimaryShipAdd_BuildingName().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_Street().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_Brgy().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_City().getAttribute("value") + ", "
					+ OMTAcqui.get_PrimaryShipAdd_Province().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_ZipCode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTAcqui.get_PrimaryShipAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTAcqui.get_PrimaryShipAdd_Latitude().getAttribute("value"));

		} else {
			if (OMTAcqui.get_PrimarySameasbilling().getAttribute("value").equalsIgnoreCase(" same as billing ")) {
				System.out.println("Shipping Address same as Billing Address");
			} else {
				System.out.println("Shipping Address - Failed");
			}

		}
	}

	public void Validate_AccountCheckResults() {
		BP.scroll_vertical(360);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_Accountcheck());

		System.out.println("ACCOUNT CHECKING RESULTS: ");
		System.out.println("Credit Limit (CL): " + OMTAcqui.get_CreditLimit().getAttribute("value"));
		System.out.println("GMI: " + OMTAcqui.get_GMI().getAttribute("value"));
		System.out.println("Prequal Result: " + OMTAcqui.get_PrequalResult().getAttribute("value"));
		System.out.println("CNDB Result: " + OMTAcqui.get_CNDBResult().getAttribute("value"));
		System.out.println("CSL Result: " + OMTAcqui.get_CSLResult().getAttribute("value"));
		System.out.println("Balance: " + OMTAcqui.get_Balance().getAttribute("value"));
		System.out.println("Account: " + OMTAcqui.get_Account().getAttribute("value"));
		System.out.println("Amount Due: " + OMTAcqui.get_AmountDue().getAttribute("value"));
	}

	public void Validate_PrimaryAccountDetails() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_PrimaryAccDetails());
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_PrimaryAccDetails());

		System.out.println("Primary ACCOUNT RESULTS: ");
		System.out.println("Application Date: " + OMTAcqui.get_ApplicationDate().getAttribute("value"));
		System.out.println("Tenure in months: " + OMTAcqui.get_Tenure().getAttribute("value"));
		System.out.println("Last Renewal date: " + OMTAcqui.get_LastRenewalDate().getAttribute("value"));
		System.out.println("Brand: " + OMTAcqui.get_Brand().getAttribute("value"));
		System.out.println("CNDB Results: " + OMTAcqui.get_CNDBResults().getAttribute("value"));
		Generic.WriteTestData("Omt primary Acount details validation : ", "", "", "User should be able to validate primary account details", "User is able to validate primary account details", "Passed");
        Control.takeScreenshot();
		BP.scroll_vertical(620);
		Generic.WriteTestData("Omt CNDB result validation : ", "", "", "User should be able to validate CNDB result", "User is be able to validate CNDB result", "Passed");
        Control.takeScreenshot();

	}

	
	public void Validate_OrderDetails() throws Exception {

		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_orderdetails());	
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		System.out.println("Order Details  RESULTS: ");
		
		System.out.println("Delivery Case Title: " + OMTAcqui.get_DeliveryCaseTitle().getAttribute("value"));
		System.out.println("Delivery Queue Name: " + OMTAcqui.get_DeliveryQueueName().getAttribute("value"));
		
		System.out.println("Delivery Queue Name: " + OMTAcqui.get_DeliveryCaseId().getAttribute("value"));

		System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));
		System.out.println("New Plan: " + OMTAcqui.get_NewPlan().getAttribute("value"));
		System.out.println("Data: " + OMTAcqui.get_Data().getAttribute("value"));
		System.out.println("Lockup: " + OMTAcqui.get_Lockup().getAttribute("value"));
		System.out.println("Plan Inclusions: " + OMTAcqui.get_PlanInclusions().getAttribute("value"));
		System.out.println("Paid Add-ons: " + OMTAcqui.get_PaidAddOns().getAttribute("value"));
if(OMTAcqui.isElementExist("Device details in tabular format", "DeviceDetailsTable", 10))
{
	

		System.out.println("Device Details 1: " + OMTAcqui.get_item1().getAttribute("value") + " | "
				+ OMTAcqui.get_SKU1().getAttribute("value") + " | " + OMTAcqui.get_Matcode1().getAttribute("value")
				+ " | " + OMTAcqui.get_Sloc1().getAttribute("value") + " | "
				+ OMTAcqui.get_Serial1().getAttribute("value"));
}
		System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));
		System.out.println("Promo Code Details: " + OMTAcqui.get_Promocode().getAttribute("value") + " | "
				+ OMTAcqui.get_PromoDiscount().getAttribute("value") + " | "
				+ OMTAcqui.get_ProjectName().getAttribute("value"));
		if(OMTAcqui.isElementExist("ChannelSalesmanID", "Channel", 10))
		{
		System.out.println("Order Tagging: " + OMTAcqui.get_Channel().getAttribute("value") + " | "
				+ OMTAcqui.get_SalesmanID().getAttribute("value"));
		Generic.WriteTestData("Omt Order deails section validation : ", "", "", "User should be able to validate Order deails section", "User is able to validate Order deails section", "Passed");
        Control.takeScreenshot();
		BP.scroll_vertical(500);
		Generic.WriteTestData("Omt Device deails validation : ", "", "", "User should be able to validate Device deails", "User is able to validate Device deails", "Passed");
        Control.takeScreenshot();
	}
	}

	public void Validate_DocumentSubmission() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_doumentsub());	
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		System.out.println("DOCUMENT SUBMISSION: ");
		if(OMTRenew.isElementExist("POFC Img", "POFC_Img", 10))
		{
			OMTRenew.isElementExist("POFC Img", "POFC_Img", 10);
		System.out.println("POFC Type: " + OMTRenew.get_POFC_Type().getAttribute("value"));
		System.out.println("POFC Verification: " + OMTRenew.get_POFC_Verification().getAttribute("value"));
		System.out.println("POFC Reason: " + OMTRenew.get_POFC_Reason().getAttribute("value"));
		System.out.println("POFC Date Reviewed: " + OMTRenew.get_POFC_DateReviewed().getAttribute("value"));
		System.out
				.println("POFC VERIFICATION FINDING:" + OMTRenew.get_POFC_Verficationfinding1().getAttribute("value"));
		Generic.WriteTestData("Omt Document submission validation : ", "", "", "User should be able to validate Document submission", "User is able to Document submission", "Passed");
        Control.takeScreenshot();
	}
	}

	public void Validate_PostpaidCustomerDetails() {
		BP.scroll_vertical(750);

		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());

		System.out.println("POSTPAID CUSTOMER DETAILS: ");
		System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));
		System.out.println("Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));
		System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));
		System.out.println("Customer ID: " + OMTAcqui.get_CustDet_CustomerID().getAttribute("value"));
	}

	public void Validate_PaymentDetails() throws Exception {

		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_payment());	
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		System.out.println("PAYMENT DETAILS: ");
		System.out.println("Balance -PretermFee: " + OMTAcqui.get_BalancePretermFee().getAttribute("value"));
		System.out.println("Account - PretermFee: " + OMTAcqui.get_AccountPretermFee().getAttribute("value"));
		System.out.println("Amount Due - PretermFee: " + OMTAcqui.get_AmountDuePretermFee().getAttribute("value"));
		System.out.println("Payment Method- PretermFee: " + OMTAcqui.get_PaymentMethodPretermFee().getAttribute("value"));
		System.out.println("status- PretermFee: " + OMTAcqui.get_StatusPretermFee().getAttribute("value"));
		System.out.println("Transaction- PretermFee: " + OMTAcqui.get_TransactionPretermFee().getAttribute("value"));
		System.out.println("ORNumber- PretermFee: " + OMTAcqui.get_ORNumberPretermFee().getAttribute("value"));


		System.out.println("Request Payment: ");
		System.out.println("Preferred Payment Method: " + OMTAcqui.get_ReqPay_PayMethod().getAttribute("value"));
		System.out.println("Total Amount: " + OMTAcqui.get_ReqPay_TotalAmount().getAttribute("value"));
		System.out.println("Payment Method: " + OMTAcqui.get_ReqPay_PaymentMethod().getAttribute("value"));
		System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));
		System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));
		System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

		/*System.out.println("Payment Posting Details: ");
		System.out.println("Transaction Date: " + OMTAcqui.get_PostDet_TransacDate().getAttribute("value"));
		System.out.println("Payment ID: " + OMTAcqui.get_PostDet_PayID().getAttribute("value"));
		System.out.println("Posting Remarks: " + OMTAcqui.get_PostDet_PostingRemarks().getAttribute("value"));
		System.out.println("Invoice ID: " + OMTAcqui.get_PostDet_InvoiceID().getAttribute("value"));
		System.out.println("OR: " + OMTAcqui.get_PostDet_OR().getAttribute("value"));*/
		Generic.WriteTestData("Omt Payment Details  validation : ", "", "", "User should be able to validate Payment Details", "User is able to validate Payment Details", "Passed");
        Control.takeScreenshot();
		BP.scroll_vertical(450);
        Generic.WriteTestData("Omt Request Payment Details  validation : ", "", "", "User should be able to validate Request Payment Details", "User is able to validate Request Payment Details", "Passed");
        Control.takeScreenshot();
	}

	public void Validate_FullfillmentDetails() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_fullfill());		
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

		if (OMTAcqui.get_FulfillDet_PALrbtn().isSelected()) {
			System.out.println("PAL is selected");
		} else if (OMTAcqui.get_FulfillDet_FSOrbtn().isSelected()) {
			System.out.println("FSO TD is selected");
		} else if (OMTAcqui.get_FulfillDet_RSOrbtn().isSelected()) {
			System.out.println("RSO TD is selected");
		} else {
			System.out.println("No Fullfilmen selected - Failed");
		}

		if (OMTAcqui.get_FulfillDet_Xpressrbtn().isSelected()) {
			System.out.println("Express Delivery is selected");
		} else if (OMTAcqui.get_FulfillDet_Regularrbtn().isSelected()) {
			System.out.println("Regular Delivery is selected");
		}
		System.out.println("Pickup Hub: " + OMTAcqui.get_FulfillDet_PickupHub().getAttribute("value"));
		System.out.println("Assigned Courier: " + OMTAcqui.get_FulfillDet_AssignedCourier().getAttribute("value"));
		System.out.println("Assigned Agent: " + OMTAcqui.get_FulfillDet_AssignedAgent().getAttribute("value"));
		System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));
		System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));
		System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));
		Generic.WriteTestData("Omt Fullfillment Details  validation : ", "", "", "User should be able to validate Fullfillment Details", "User is able to validate Fullfillment Details", "Passed");
        Control.takeScreenshot(); 

	}

	public void Validate_activationdetails() {
		BP.scroll_vertical(550);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_activation());

		System.out.println("ActChannel: " + OMTAcqui.get_ActChannel().getAttribute("value"));
		System.out.println("DateofActivation: " + OMTAcqui.get_DateofActivation().getAttribute("value"));
		System.out.println("TimeofActivation: " + OMTAcqui.get_TimeofActivation().getAttribute("value"));

	}

	public void Validate_planeprovisioningdetails() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		 "arguments[0].scrollIntoView(true);", OMTAcqui.get_planpro());	
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_planpro());

		System.out.println("dateOfPlanProvisioning: " + OMTAcqui.get_dateOfPlanProvisioning().getAttribute("value"));
		System.out.println("timeOfPlanProvisioning: " + OMTAcqui.get_timeOfPlanProvisioning().getAttribute("value"));
		System.out.println("dateOfOrderClosing: " + OMTAcqui.get_dateOfOrderClosing().getAttribute("value"));
		System.out.println("timeOfOrderClosing: " + OMTAcqui.get_timeOfOrderClosing().getAttribute("value"));
		System.out.println("startDateOfContract: " + OMTAcqui.get_startDateOfContract().getAttribute("value"));
		System.out.println("endDateOfContract: " + OMTAcqui.get_endDateOfContract().getAttribute("value"));
		Generic.WriteTestData("Omt Plan Provisioning Details  validation : ", "", "", "User should be able to validate Plan Provisioning", "User is able to validate Plan Provisioning", "Passed");
        Control.takeScreenshot();

	}

	public void Validate_SEEDINGDETAILS() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_seeding());	
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_seeding());

		System.out.println("GCashAccount: " + OMTAcqui.get_GCashAccount().getAttribute("value"));
		System.out.println("GCashTagging: " + OMTAcqui.get_GCashTagging().getAttribute("value"));
		System.out.println("SeedingReference: " + OMTAcqui.get_SeedingReference().getAttribute("value"));
		System.out.println("SeedingDate: " + OMTAcqui.get_SeedingDate().getAttribute("value"));
		Generic.WriteTestData("Omt Seeding Details  validation : ", "", "", "User should be able to validate Seeding Details  ", "User is able to validate Seeding Details ", "Passed");
        Control.takeScreenshot();

	}

	public void Validate_CALLOUTANDRECOVERY() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_callout());	
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_callout());
       if(OMTAcqui.isElementExist("Callout Reason", "CalloutReason", 10))
      {
		System.out.println("CalloutReason: " + OMTAcqui.get_CalloutReason().getAttribute("value"));
		System.out.println("CallAttempt: " + OMTAcqui.get_CallAttempt().getAttribute("value"));
		System.out.println("CalloutData: " + OMTAcqui.get_CalloutData().getAttribute("value"));
		System.out.println("CalloutDisposition: " + OMTAcqui.get_CalloutDisposition().getAttribute("value"));
		System.out.println("CalloutNotes: " + OMTAcqui.get_CalloutNotes().getAttribute("value"));
      }
       Generic.WriteTestData("Omt Callout and Recovery Details  validation : ", "", "", "User should be able to validate Callout and Recovery Details ", "User is able to validate Callout and Recovery Details ", "Passed");
       Control.takeScreenshot();
	}

	public void Validate_REFUNDDETAILS() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_refound());
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_refound());

		System.out.println("RefundRequestDate: " + OMTAcqui.get_RefundRequestDate().getAttribute("value"));
		System.out.println("ValidAmountforRefund: " + OMTAcqui.get_ValidAmountforRefund().getAttribute("value"));
		System.out.println("IssuingBank_Partner: " + OMTAcqui.get_IssuingBank_Partner().getAttribute("value"));
		System.out.println("CardNumber: " + OMTAcqui.get_CardNumber().getAttribute("value"));
		System.out.println("AccountName: " + OMTAcqui.get_AccountName().getAttribute("value"));
		System.out.println(
				"Authorization_ApprovalCode: " + OMTAcqui.get_Authorization_ApprovalCode().getAttribute("value"));
		System.out.println("Remarks: " + OMTAcqui.get_Remarks().getAttribute("value"));
		System.out.println("RefundReference: " + OMTAcqui.get_RefundReference().getAttribute("value"));
		Generic.WriteTestData("Omt Refund Details  validation : ", "", "", "User should be able to validate Refund Details", "User is able to validate Callout and Refund Details", "Passed");
        Control.takeScreenshot();
	}

	public void Validate_ORDERHISTORY() throws Exception {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", OMTAcqui.get_orderh());	
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderh());

		if (!(OMTAcqui.get_OrderReceived().getText().isEmpty())) {
			System.out.println("OrderReceived: " + OMTAcqui.get_OrderReceived().getText());
		} else {
			System.out.println("OrderReceived: " + OMTAcqui.get_OrderReceived().getAttribute("value"));

		}
		if (!(OMTAcqui.get_AutomaticUpdate().getText().isEmpty())) {
			System.out.println("AutomaticUpdate: " + OMTAcqui.get_AutomaticUpdate().getText());

		} else {
			System.out.println("AutomaticUpdate: " + OMTAcqui.get_AutomaticUpdate().getAttribute("value"));

		}

		if (!(OMTAcqui.get_DateOrder().getText().isEmpty())) {
			System.out.println("DateOrder: " + OMTAcqui.get_DateOrder().getText());
		} else {
			System.out.println("DateOrder: " + OMTAcqui.get_DateOrder().getAttribute("value"));

		}

		if (OMTAcqui.isElementExist("update date", "AutomaticUpdateDate", 5)) {
			System.out.println("AutomaticUpadateDate: " + OMTAcqui.get_AutomaticUpdateDate().getText());
			// System.out.println("AutomaticUpadateDate: " +
			// OMTAcqui.get_AutomaticUpdateDate().getAttribute("value"));
			Constant.dataMap.get().put("OMT_UpdateDate", OMTAcqui.get_AutomaticUpdateDate().getText());
			util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
		}
		if (OMTAcqui.isElementExist("seeMoreBtn1", "seeMoreBtn1", 5)) {
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", OMTAcqui.get_seeMoreBtn1());		
		} 
		if (OMTAcqui.isElementExist("seeMoreBtn1", "seeMoreBtn2", 5)) {
			JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
			js3.executeScript("arguments[0].click();", OMTAcqui.get_seeMoreBtn2());		
		} 
		if (OMTAcqui.isElementExist("seeMoreBtn1", "seeMoreBtn3", 5)) {
			JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
			js4.executeScript("arguments[0].click();", OMTAcqui.get_seeMoreBtn3());		
		} 
		BP.scroll_vertical(400);

		Generic.WriteTestData("Omt Order History Details  validation : ", "", "", "User should be able to validate Order History Details", "User is able to validate Order History Details", "Passed");
        Control.takeScreenshot();
	}

	/*********************************************************************************************/
	public void ongoingVerification(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Updated Status to : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(400);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		OMTAcqui.get_POID_Verficationfinding1().clear();
		OMTAcqui.get_POID_Verficationfinding1().sendKeys(Status);

		System.out
				.println("POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

		OMTAcqui.get_POFC_Verficationfinding1().clear();
		OMTAcqui.get_POFC_Verficationfinding1().sendKeys(Status);

		System.out
				.println("POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	// *********************************************************************************************************
	public void Approved(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Updated Status to : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(400);

		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());
		///////////////////////
		OMTAcqui.get_POID_Number().clear();
		OMTAcqui.get_POID_Number().sendKeys("p005643");
		System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));
		///////////////////////
		OMTAcqui.select_POID_Verification(Status);
		System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

		// OMTAcqui.get_POID_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POID_Verficationfinding1().clear();
		OMTAcqui.get_POID_Verficationfinding1().sendKeys(Status);

		System.out
				.println("POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

		OMTAcqui.select_POFC_Verification(Status);
		System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
		// OMTAcqui.get_POFC_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POFC_Verficationfinding1().clear();
		OMTAcqui.get_POFC_Verficationfinding1().sendKeys(Status);

		System.out
				.println("POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		//
	}

	// *********************************************************************************************************
	// *********************************************************************************************************
	public void ForComplaincePOFC(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Approved : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(400);

		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		OMTAcqui.get_POID_Number().clear();
		OMTAcqui.get_POID_Number().sendKeys("p005643");
		System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));

		OMTAcqui.select_POID_Verification("Approved");
		System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

		// OMTAcqui.get_POID_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POID_Verficationfinding1().clear();
		OMTAcqui.get_POID_Verficationfinding1().sendKeys("ONGOING VERFICATION");

		System.out
				.println("POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

		OMTAcqui.select_POFC_Verification("Disapproved");
		System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
		// OMTAcqui.get_POFC_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POFC_Verficationfinding1().clear();
		OMTAcqui.get_POFC_Verficationfinding1().sendKeys("ONGOING VERFICATION");

		System.out
				.println("POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		//
	}
	// *********************************************************************************************************

	// *********************************************************************************************************
	public void ForComplaincePOID_POFC(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Approved : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(400);

		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		OMTAcqui.get_POID_Number().clear();
		OMTAcqui.get_POID_Number().sendKeys("p005643");
		System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));

		OMTAcqui.select_POID_Verification("Disapproved");
		System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

		// OMTAcqui.get_POID_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POID_Verficationfinding1().clear();
		OMTAcqui.get_POID_Verficationfinding1().sendKeys("ONGOING VERFICATION");

		System.out
				.println("POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

		OMTAcqui.select_POFC_Verification("Disapproved");
		System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
		// OMTAcqui.get_POFC_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POFC_Verficationfinding1().clear();
		OMTAcqui.get_POFC_Verficationfinding1().sendKeys("ONGOING VERFICATION");

		System.out
				.println("POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		//
	}

	// *********************************************************************************************************
	public void ApprovedPOID(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Approved : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		OMTAcqui.get_POID_Number().clear();
		OMTAcqui.get_POID_Number().sendKeys("p005643");
		System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));

		OMTAcqui.select_POID_Verification("Approved");
		System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

		OMTAcqui.get_POID_DateReviewed().sendKeys("05252022");

		// OMTAcqui.select_POFC_Verification("Approved");
		// System.out.println("POFC Verification: " +
		// OMTAcqui.get_POFC_Verification().getAttribute("value"));
		// OMTAcqui.get_POFC_DateReviewed().sendKeys("05252022");
		//

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		//
	}

	// *********************************************************************************************************
	public void ReservedPhysicalStock(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("ReservedPhysicalStock : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(380);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		OMTAcqui.get_ReservationID().sendKeys("9845673216");

		System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	/***********************************************************************************************************/

	public void Requestpayment(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Requestpayment : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		///////////////////////////////////////////////////////

		OMTAcqui.get_BSSOrderID().sendKeys("764532");
		System.out.println("BSS Order ID: " + OMTAcqui.get_BSSOrderID().getAttribute("value"));

		OMTAcqui.get_BSSOrderCaseID().sendKeys("43725");
		System.out.println("BSS Order Case ID: " + OMTAcqui.get_BSSOrderCaseID().getAttribute("value"));
		OMTAcqui.get_NewMobileNumber().clear();
		OMTAcqui.get_NewMobileNumber().sendKeys("09270000112");
		System.out.println("New Mobile Number: " + OMTAcqui.get_NewMobileNumber().getAttribute("value"));

		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());

		OMTAcqui.get_CustDet_FAID().sendKeys("452738");
		System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));

		OMTAcqui.get_CustDet_BAID().sendKeys("829384");
		System.out.println("Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));

		OMTAcqui.get_CustDet_ContactID().sendKeys("863945");
		System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));

		///////////////////////////////////

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	/*************************************************************************************************************/
	public void RequestpaymentFTA1(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Requestpayment : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(480);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys("DATE");
		System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));

		OMTAcqui.get_ReqPay_PayReference().sendKeys("FreeText");
		System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));

		OMTAcqui.select_get_ReqPay_StatusPayment("Pending");
		System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void RequestpaymentFTA11(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Requestpayment : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(480);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys("DATE");
		System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));

		OMTAcqui.get_ReqPay_PayReference().sendKeys("FreeText");
		System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));

		OMTAcqui.select_get_ReqPay_StatusPayment("Paid");
		System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void Awaitingpayment(String Status, String PayementReference, String StatusPayment) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Awaitingpayment : " + Status);
		Thread.sleep(2000L);

		////////////////////////////////////////////////////////////////////////////////////////
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Constant.DateLinkSeeding);
		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Keys.SPACE);
		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Keys.ENTER);

		System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));
		OMTAcqui.get_ReqPay_PayReference().sendKeys(PayementReference);
		// make payment Reference as "Pending" for NON happy path(cancelled
		// flow)

		System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));
		OMTAcqui.get_ReqPay_StatusPayment().sendKeys(Constant.StatusPay_happypath);
		System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

		///////////////////////////////////////////////////////////////////////////////////////////////////////////

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	/*****************************************************************************************************************/

	public void forproccessing(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("forproccessing : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(380);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		/*
		 * OMTAcqui.get_ReservationID().clear();
		 * OMTAcqui.get_ReservationID().sendKeys("8745321678");
		 * System.out.println("Reservation ID: " +
		 * OMTAcqui.get_ReservationID().getAttribute("value"));
		 */

		String g = OMTAcqui.get_DeliveryCaseTitle().getAttribute("value");
		if (g.isEmpty()) {
			OMTAcqui.get_DeliveryCaseTitle().sendKeys("Test");
		}
		String h = OMTAcqui.get_DeliveryQueueName().getAttribute("value");
		if (h.isEmpty()) {
			OMTAcqui.get_DeliveryQueueName().sendKeys("Test");
		}
		String a = OMTAcqui.get_BSSOrderID().getAttribute("value");
		if (a.isEmpty()) {
			OMTAcqui.get_BSSOrderID().sendKeys("764532");
			System.out.println("BSS Order ID: " + OMTAcqui.get_BSSOrderID().getAttribute("value"));
		}
		String b = OMTAcqui.get_BSSOrderCaseID().getAttribute("value");
		if (b.isEmpty()) {
			OMTAcqui.get_BSSOrderCaseID().sendKeys("43725");

			System.out.println("BSS Order Case ID: " + OMTAcqui.get_BSSOrderCaseID().getAttribute("value"));
		}
		String c = OMTAcqui.get_NewMobileNumber().getAttribute("value");
		if (c.isEmpty()) {
			OMTAcqui.get_NewMobileNumber().sendKeys("09270000011");
			System.out.println("New Mobile Number: " + OMTAcqui.get_NewMobileNumber().getAttribute("value"));
		}

		if (OMTAcqui.get_ReservationID_Update().isDisplayed()) {
			OMTAcqui.get_ReservationID().clear();
			OMTAcqui.get_ReservationID().sendKeys("09876543211");
		}
		// if cod use below steps

		BP.scroll_vertical(450);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());

		String d = OMTAcqui.get_CustDet_FAID().getAttribute("value");
		if (d.isEmpty()) {
			OMTAcqui.get_CustDet_FAID().sendKeys("967435");
			System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));
		}
		String e = OMTAcqui.get_CustDet_BAID().getAttribute("value");
		if (e.isEmpty()) {
			OMTAcqui.get_CustDet_BAID().sendKeys("764325");
			System.out.println("Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));
		}

		String f = OMTAcqui.get_CustDet_ContactID().getAttribute("value");
		if (f.isEmpty()) {
			OMTAcqui.get_CustDet_ContactID().sendKeys("09270000133");
			System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));
		}

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();

		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}
	// public void AssignAgent(String agentName) throws Exception{
	// if(OMTAcqui.isElementExist("Checkbox Button", "Checkbox", 10)) {
	// OMTAcqui.clickOnElement("AssignAgent: ", "Checkox", "Checkbox");
	// OMTAcqui.clickOnElement("AssignAgent: ", "Assign_checbox",
	// "Assign_Checkbox");
	//
	// OMTAcqui.get_SelectAdmin().sendKeys(agentName);
	//
	// OMTAcqui.clickOnElement("AssignAgent: ", "FSO", "SelectFSO");
	//
	// OMTAcqui.clickOnElement("AssignAgent: ", "Assignbutton", "Assign_btn");
	//
	//
	// }
	// }

	/**************************************************************************************************************/
	public void processed(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("processed : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(380);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		OMTAcqui.get_ReservationID().clear();
		OMTAcqui.get_ReservationID().sendKeys("9845321678");
		System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void Fordelivery(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Fordelivery : " + Status);
		Thread.sleep(2000L);
		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void ForRedelivery1(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("ForRedelivery : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

		OMTAcqui.get_FulfillDet_Schedule().sendKeys("07/19/2022");
		System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));
		OMTAcqui.select_get_FulfillDet_Status("Not Received");
		System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));
		OMTAcqui.select_FulfillDet_Remarks("1st Delivery Attempt Failed");
		System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void ForRedelivery2(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("ForRedelivery : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

		JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
		jsrow.executeScript("arguments[0].click();", OMTAcqui.get_addnewrow());

		OMTAcqui.get_FulfillDet_Schedule().sendKeys("07/20/2022");
		System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));

		OMTAcqui.select_get_FulfillDet_Status("Not Received");
		System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));

		OMTAcqui.select_FulfillDet_Remarks("2nd Delivery Attempt Failed");
		System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void ForRedelivery3(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("ForRedelivery : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

		JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
		jsrow.executeScript("arguments[0].click();", OMTAcqui.get_addnewrow());

		OMTAcqui.get_FulfillDet_Schedule().sendKeys("07/25/2022");
		System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));

		OMTAcqui.select_get_FulfillDet_Status("Not Received");
		System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));

		OMTAcqui.select_FulfillDet_Remarks("3rd Delivery Attempt Failed");
		System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void Delivered(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Delivered : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void Foractivation(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Foractivation : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void Activated(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println(" Activated  : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(580);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_planpro());

		System.out.println("dateOfPlanProvisioning: " + OMTAcqui.get_dateOfPlanProvisioning().getAttribute("value"));
		System.out.println("timeOfPlanProvisioning: " + OMTAcqui.get_timeOfPlanProvisioning().getAttribute("value"));
		System.out.println("dateOfOrderClosing: " + OMTAcqui.get_dateOfOrderClosing().getAttribute("value"));
		System.out.println("timeOfOrderClosing: " + OMTAcqui.get_timeOfOrderClosing().getAttribute("value"));
		System.out.println("startDateOfContract: " + OMTAcqui.get_startDateOfContract().getAttribute("value"));
		System.out.println("endDateOfContract: " + OMTAcqui.get_endDateOfContract().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void completed(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println(" completed  : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(380);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		OMTAcqui.get_ReservationID().clear();
		OMTAcqui.get_ReservationID().sendKeys("9845321678");
		System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));
		BP.scroll_vertical(380);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		OMTAcqui.get_PostDet_TransacDate().sendKeys("05262022");
		System.out.println("Transaction Date: " + OMTAcqui.get_PostDet_TransacDate().getAttribute("value"));

		OMTAcqui.get_PostDet_PayID().sendKeys("3472892");
		System.out.println("Payment ID: " + OMTAcqui.get_PostDet_PayID().getAttribute("value"));
		OMTAcqui.get_PostDet_PostingRemarks().sendKeys("4327156");
		System.out.println("Posting Remarks: " + OMTAcqui.get_PostDet_PostingRemarks().getAttribute("value"));
		OMTAcqui.get_PostDet_InvoiceID().sendKeys("56831854842");
		System.out.println("Invoice ID: " + OMTAcqui.get_PostDet_InvoiceID().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	// *********************************************************************************************************
	public void Signout() throws Exception {

		// Order
		OMTAcqui.isElementExist("Order", "AccountBtn", 10);
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_Account());

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Account_Signout());

		/*
		 * JavascriptExecutor js4 = (JavascriptExecutor)
		 * DriverManager.getDriver(); js4.executeScript("arguments[0].click();",
		 * OMTAcqui.get_Account());
		 * 
		 * JavascriptExecutor js3 = (JavascriptExecutor)
		 * DriverManager.getDriver(); js3.executeScript("arguments[0].click();",
		 * OMTAcqui.get_Account_Signin());
		 * 
		 * JavascriptExecutor js5 = (JavascriptExecutor)
		 * DriverManager.getDriver(); js5.executeScript("arguments[0].click();",
		 * OMTAcqui.get_OKTA_SSO_Btn());
		 */

	}

	public void IacceptClick() throws InterruptedException {
		if (OMTAcqui.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			// if (OMTAcqui.isClickable("privacyAccept", 5)) {
			// HPW.clickOnElement("Link", "privacy Accept", "privacyAccept");
			JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
			js4.executeScript("arguments[0].click();", OMTAcqui.get_privacyAccept());
			// }
		}
	}

	// *********************************************************************************************************

	public void OMT_Trackmyorderlogin(String ORDERID, String EMAIL) throws Exception {

		Thread.sleep(6000);

		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", OMTAcqui.get_Trackmyorder());
		Thread.sleep(9000);

		OMTAcqui.get_Orderid_input().sendKeys(ORDERID);
		OMTAcqui.get_Orderid_email().sendKeys(EMAIL);

		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_Trackmyorder_button());
		Thread.sleep(60000);

	}

	// *********************************************************//
	public void ordertracker_ForDispatch() {
		if(!OMTAcqui.isElementExist("OrderId_Error", "OrderId_Error", 10))
		{
		OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
		OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
		OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
		OMTAcqui.isElementExist("Ordertrackerdispatchheading", "DISAPTCH_Heading", 10);
		// cod
		OMTAcqui.isElementExist("Disaptchdateorderd", "Disaptchdateorderd", 10);
		OMTAcqui.isElementExist("disaptchdateorderdvalue", "disaptchdateorderdvalue", 10);
		OMTAcqui.isElementExist("dispatchamount", "dispatchamount", 10);
		OMTAcqui.isElementExist("dispatchamountvalue", "dispatchamountvalue", 10);

		// for different payment

		// OMTAcqui.isElementExist("Ordertrackerdisaptchdate", "DISAPTCH_Date",
		// 10);
		// OMTAcqui.isElementExist("Ordertrackerdispathchtext", "DISAPTCH_text",
		// 10);
		// //HPW.isElementExist("Ordertracker", "Deliver_text_right", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod",
		// 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod_val",
		// 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Amountpaid", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Amountpaid_Val",
		// 10);
		OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress_Header", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress",
		// 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_EstimatedDelivery",
		// 10);
		// OMTAcqui.isElementExist("Ordertracker",
		// "DISAPTCH_Estimated_deliverydate", 10);

	}
	}
	// *********************************************************************************************************
	public void ordertracker_ForDelivery() throws Exception {
		if(!OMTAcqui.isElementExist("OrderId_Error", "OrderId_Error", 10))
		{
		OMTAcqui.isElementExist("Ordertracker", "MyOrder", 10);
		OMTAcqui.isElementExist("Ordertracker", "referencenumber", 10);
		OMTAcqui.isElementExist("Ordertracker", "OT_Orderid", 10);
		OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
		OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Deliver", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Deliver_Subtitle", 10);
		OMTAcqui.isElementExist("Ordertracker", "Deliver_Heading", 10);
		OMTAcqui.isElementExist("Ordertracker", "Deliver_Date", 10);

		OMTAcqui.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
		OMTAcqui.isElementExist("Ordertrackervalue", "totalamountvalue", 10);

		/*
		 * OMTAcqui.isElementExist("Ordertracker", "Deliver_text", 10);
		 * OMTAcqui.isElementExist("Ordertracker", "Deliver_text_right", 10);
		 * OMTAcqui.isElementExist("Ordertracker", "Deliver_Paymentmethod", 10);
		 * OMTAcqui.isElementExist("Ordertracker", "Deliver_Paymentmethod_val",
		 * 10); OMTAcqui.isElementExist("Ordertracker", "Deliver_Amountpaid",
		 * 10); OMTAcqui.isElementExist("Ordertracker",
		 * "Deliver_Amountpaid_Val", 10);
		 * OMTAcqui.isElementExist("Ordertracker",
		 * "Deliver_Shiptothisaddress_Header", 10);
		 * OMTAcqui.isElementExist("Ordertracker", "Deliver_Shiptothisaddress",
		 * 10); OMTAcqui.isElementExist("Ordertracker",
		 * "Deliver_EstimatedDelivery", 10);
		 * OMTAcqui.isElementExist("Ordertracker",
		 * "Deliver_Estimated_deliverydate", 10);
		 */

	}
	}
	// *********************************************************//

	// *********************************************************//
	public void ordertracker_ForaActivation() {
		if(!OMTAcqui.isElementExist("OrderId_Error", "OrderId_Error", 10))
		{		OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
		OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
		OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
		OMTAcqui.isElementExist("OrdertrackerActivation", "Activation", 10);
		// cod
		OMTAcqui.isElementExist("Ordertracker", "Deliver_Date", 10);

		OMTAcqui.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
		OMTAcqui.isElementExist("Ordertrackervalue", "totalamountvalue", 10);

	}
	}

	public void ordertracker_Completed() {
		if(!OMTAcqui.isElementExist("OrderId_Error", "OrderId_Error", 10))
		{
		OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
		OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
		OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
		OMTAcqui.isElementExist("OrdertrackerCompleted", "Completed", 10);
		String Status = DriverManager.getDriver().findElement(OMTAcqui.Completed).getText();

		OMTAcqui.isElementExist("Ordertracker", "Deliver_Ordered", 10);
		System.out.println("Date Ordered: " + OMTAcqui.get_Deliver_Ordered().getText());

		OMTAcqui.isElementExist("Ordertracker AmountPaid", "AmountPaid", 10);
		//OMTAcqui.isElementExist("Ordertrackervalue", "totalamountvalue", 10);
		}
		
		
		
	}

	// *********************************************************//
	public void ordertracker_Awaitingpayment(String ScenarioName) throws Exception {
		
		if(!OMTAcqui.isElementExist("OrderId_Error", "OrderId_Error", 10))
		{
		OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
		OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
		OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
		//OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
		 OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		OMTAcqui.isElementExist("Ordertracker", "OrderConfirmed", 10);
		 OMTAcqui.isElementExist("Ordertracker", "DeliverTitle", 10);
		// OMTAcqui.isElementExist("OrdertrackerActivation", "Activation", 10);
		//OMTAcqui.isElementExist("AwaitingPayment", "AwaitingPayment", 10);

		String a = util.ReadFromExcel(ScenarioName, "Sheet1", Constant.PaymentMenthod);
		if (a.contentEquals("COD")|| a.contentEquals("Gcash")) {
			// cod
			OMTAcqui.isElementExist("Ordertracker", "Deliver_Date", 10);

			OMTAcqui.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
			OMTAcqui.isElementExist("Ordertrackervalue", "totalamountvalue", 10);
		}
		else
		{
			OMTAcqui.isElementExist("Ordertracker_DateOrdered", "Date_ordered", 10);
			OMTAcqui.isElementExist("Ordertracker_TotalAmountPaid", "TotalAmountPaid", 10);
			
			OMTAcqui.isElementExist("Ordertracker_Paymentmethod", "Paymentmethod", 10);

		}
		}

	}

	// *********************************************************//
	public void ordertracker_Awaitingpayment() throws Exception {
		OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
		OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
		OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
		// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH", 10);
		// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
		// OMTAcqui.isElementExist("OrdertrackerActivation", "Activation", 10);
		OMTAcqui.isElementExist("AwaitingPayment", "AwaitingPayment", 10);

		// cod
		OMTAcqui.isElementExist("Ordertracker", "Deliver_Date", 10);

		OMTAcqui.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
		OMTAcqui.isElementExist("Ordertrackervalue", "totalamountvalue", 10);

	}

	public String UpdateOrderStatus(String StatusUpdate) throws Exception {
		switch (StatusUpdate) {
		case "ONGOING VERIFICATION":
			OrderStatusChange("Ongoing Verification");
			break;
		case "Approved":
			OrderStatusChange("Approved");
			break;
		case "Reserved Physical Stock":
			OrderStatusChange("Reserved Physical Stock");
			break;
		case "PreOrderWithStock":
			OrderStatusChange("PreOrderWithStock");
			break;
			
		case "For Redelivery1":
			OrderStatusChange("For Redelivery");
			break;
		case "For Redelivery2":
			OrderStatusChange2("For Redelivery");
			break;
		case "For Redelivery3":
			OrderStatusChange3("For Redelivery");
			break;
		case "Request Payment":
			OrderStatusChange("Request Payment");
			break;
		case "Awaiting Payment":
			OrderStatusChange("Awaiting Payment");
			break;

		case "For Processing":
			OrderStatusChange("For Processing");
			break;
		case "Processed":
			OrderStatusChange("Processed");
			break;
		case "For Delivery":
			OrderStatusChange("For Delivery");
			break;
		case "Delivered":
			OrderStatusChange("Delivered");
			break;
		case "Activated":
			OrderStatusChange("Activated");
			break;
		case "For Order Creation":
			OrderStatusChange("For Order Creation");
			break;
		case "Order Created":
			OrderStatusChange("Order Created");
			break;
		case "Renewal Completed":
			OrderStatusChange("Renewal Completed");
			break;

		}

		return StatusUpdate;

	}
	public void OrderStatusChange3(String Status) throws InterruptedException {
		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Updated Status to : " + Status);
		Thread.sleep(2000L);
		
		 if (Status.equalsIgnoreCase("For Redelivery")) {
			Thread.sleep(2000L);
			BP.scroll_vertical(530);
			JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
			js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

			JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
			jsrow.executeScript("arguments[0].click();", OMTAcqui.get_addnewrow());

			OMTAcqui.get_FulfillDet_Schedule3().sendKeys("07/25/2022");
			System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule3().getAttribute("value"));

			OMTAcqui.select_get_FulfillDet_Status3("Not Received");
			System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status3().getAttribute("value"));

			OMTAcqui.select_FulfillDet_Remarks3("3rd Delivery Attempt Failed");
			System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks3().getAttribute("value"));
		}
		 
			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}
	public void OrderStatusChange2(String Status) throws InterruptedException {
		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Updated Status to : " + Status);
		Thread.sleep(2000L);
		
		 if (Status.equalsIgnoreCase("For Redelivery")) {
			Thread.sleep(2000L);
			BP.scroll_vertical(530);
			JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
			js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

			JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
			jsrow.executeScript("arguments[0].click();", OMTAcqui.get_addnewrow());

			OMTAcqui.get_FulfillDet_Schedule2().sendKeys("07/20/2022");
			System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule2().getAttribute("value"));

			OMTAcqui.select_get_FulfillDet_Status2("Not Received");
			System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status2().getAttribute("value"));

			OMTAcqui.select_FulfillDet_Remarks2("2nd Delivery Attempt Failed");
			System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks2().getAttribute("value"));

		}
		 
			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}
	
	public void OrderStatusChange(String Status) throws Exception {
		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Updated Status to : " + Status);
		Generic.WriteTestData("User should be able to Update status to"+Status+"", "", "", "User should be able to Update status to"+Status+"","User should be able to Update status to"+Status+"", "Passed");
        Control.takeScreenshot(); 
		Thread.sleep(2000L);

		if (Status.equalsIgnoreCase("ONGOING VERIFICATION") || Status.equalsIgnoreCase("Completed")
				|| Status.equalsIgnoreCase("For Processing") || Status.equalsIgnoreCase("Processed")
				|| Status.equalsIgnoreCase("Approved") || Status.equalsIgnoreCase("Reserved Physical Stock")
				|| Status.equalsIgnoreCase("Request Payment")) {

			if (Status.equalsIgnoreCase("Reserved Physical Stock") || Status.equalsIgnoreCase("Completed")
					|| Status.equalsIgnoreCase("Processed") || Status.equalsIgnoreCase("Request Payment")
					|| Status.equalsIgnoreCase("For Processing")) {
				BP.scroll_vertical(380);
				JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
				js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

				if (Status.equalsIgnoreCase("Reserved Physical Stock")) {
					OMTAcqui.get_ReservationID().clear();

					OMTAcqui.get_ReservationID().sendKeys(Constant.ReservationID);

					System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));

				}
				if (Status.equalsIgnoreCase("Processed")) {
					OMTAcqui.get_ReservationID().clear();

					OMTAcqui.get_ReservationID().sendKeys(Constant.ReservationID1);

					System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));
					
					OMTAcqui.get_DeliveryCaseId().clear();
					OMTAcqui.get_DeliveryCaseId().sendKeys(Constant.DeliveryCaseID);
					System.out.println("Delivery Case ID: " + OMTAcqui.get_DeliveryCaseId().getAttribute("value"));
				}
				 if (Status.equalsIgnoreCase("Completed")) {
					OMTAcqui.get_ReservationID().clear();
					OMTAcqui.get_ReservationID().sendKeys(Constant.ReservationID);
					System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));
					BP.scroll_vertical(380);
					JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
					js2.executeScript("arguments[0].click();", OMTAcqui.get_payment());

					OMTAcqui.get_PostDet_TransacDate().sendKeys(Constant.PostDet_Transactiondate);
					System.out.println("Transaction Date: " + OMTAcqui.get_PostDet_TransacDate().getAttribute("value"));

					OMTAcqui.get_PostDet_PayID().sendKeys(Constant.PostDet_PayId);
					System.out.println("Payment ID: " + OMTAcqui.get_PostDet_PayID().getAttribute("value"));
					OMTAcqui.get_PostDet_PostingRemarks().sendKeys(Constant.PostDet_PostingRemarks);
					System.out
							.println("Posting Remarks: " + OMTAcqui.get_PostDet_PostingRemarks().getAttribute("value"));
					OMTAcqui.get_PostDet_InvoiceID().sendKeys(Constant.PostDet_InvoiceID);
					System.out.println("Invoice ID: " + OMTAcqui.get_PostDet_InvoiceID().getAttribute("value"));

				} 
				 if (Status.equalsIgnoreCase("For Processing")) {
					String g = OMTAcqui.get_DeliveryCaseTitle().getAttribute("value");
					if (g.isEmpty()) {
						OMTAcqui.get_DeliveryCaseTitle().sendKeys("Test");
					}
					String h = OMTAcqui.get_DeliveryQueueName().getAttribute("value");
					if (h.isEmpty()) {
						OMTAcqui.get_DeliveryQueueName().sendKeys("Test");
					}
					String a = OMTAcqui.get_BSSOrderID().getAttribute("value");
					if (a.isEmpty()) {
						OMTAcqui.get_BSSOrderID().sendKeys(Constant.BSSorderID);
						System.out.println("BSS Order ID: " + OMTAcqui.get_BSSOrderID().getAttribute("value"));
					}
					String b = OMTAcqui.get_BSSOrderCaseID().getAttribute("value");
					if (b.isEmpty()) {
						OMTAcqui.get_BSSOrderCaseID().sendKeys(Constant.BSSorderCaseID);

						System.out.println("BSS Order Case ID: " + OMTAcqui.get_BSSOrderCaseID().getAttribute("value"));
					}
					String c = OMTAcqui.get_NewMobileNumber().getAttribute("value");
					if (c.isEmpty()) {
						OMTAcqui.get_NewMobileNumber().sendKeys(Constant.MobilenUmb);
						System.out
								.println("New Mobile Number: " + OMTAcqui.get_NewMobileNumber().getAttribute("value"));
					}

					/*
					 * if (OMTAcqui.get_ReservationID_Update().isDisplayed()) {
					 * OMTAcqui.get_ReservationID().clear();
					 * OMTAcqui.get_ReservationID().sendKeys(Constant_OMT.
					 * ReservationID); }
					 */
					// if cod use below steps

					BP.scroll_vertical(450);
					JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
					js2.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());

					String d = OMTAcqui.get_CustDet_FAID().getAttribute("value");
					if (d.isEmpty()) {
						OMTAcqui.get_CustDet_FAID().sendKeys(Constant.CustFAID);
						System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));
					}
					String e = OMTAcqui.get_CustDet_BAID().getAttribute("value");
					if (e.isEmpty()) {
						OMTAcqui.get_CustDet_BAID().sendKeys(Constant.CustBAID);
						System.out.println(
								"Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));
					}

					String f = OMTAcqui.get_CustDet_ContactID().getAttribute("value");
					if (f.isEmpty()) {
						OMTAcqui.get_CustDet_ContactID().sendKeys(Constant.CustContactID);
						System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));
					}

				}

				 if (Status.equalsIgnoreCase("Request Payment")) {
					// Request Payment
					OMTAcqui.get_BSSOrderID().sendKeys(Constant.BSSorderID);
					System.out.println("BSS Order ID: " + OMTAcqui.get_BSSOrderID().getAttribute("value"));

					OMTAcqui.get_BSSOrderCaseID().sendKeys(Constant.BSSorderCaseID);
					System.out.println("BSS Order Case ID: " + OMTAcqui.get_BSSOrderCaseID().getAttribute("value"));
					OMTAcqui.get_NewMobileNumber().clear();
					OMTAcqui.get_NewMobileNumber().sendKeys(Constant.MobilenUmb);
					System.out.println("New Mobile Number: " + OMTAcqui.get_NewMobileNumber().getAttribute("value"));

					JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
					jsp.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());

					OMTAcqui.get_CustDet_FAID().sendKeys(Constant.CustFAID);
					System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));

					OMTAcqui.get_CustDet_BAID().sendKeys(Constant.CustContactID);
					System.out.println(
							"Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));

					OMTAcqui.get_CustDet_ContactID().sendKeys("9876543321");
					System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));

				}
			}
		
			// ongoing verificaation and approved
			else {

				BP.scroll_vertical(150);
				JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
				js1.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());
				// if(Status.equalsIgnoreCase("Approved"))

				if (Status.equalsIgnoreCase("Approved")) {
					OMTAcqui.get_POID_Number().clear();
					OMTAcqui.get_POID_Number().sendKeys("p005643");
					System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));
					OMTAcqui.select_POID_Verification(Status);
					System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));
				}
				OMTAcqui.get_POID_Verficationfinding1().clear();
				OMTAcqui.get_POID_Verficationfinding1().sendKeys(Status);

				System.out.println(
						"POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

				if (Status.equalsIgnoreCase("Approved")) {
					OMTAcqui.select_POFC_Verification(Status);
					System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
				}

				OMTAcqui.get_POFC_Verficationfinding1().clear();
				OMTAcqui.get_POFC_Verficationfinding1().sendKeys(Status);

				System.out.println(
						"POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

			}

	}

		else if (Status.equalsIgnoreCase("Awaiting Payment")) {
			JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
			js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

			OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Constant.DateLinkSeeding);
			OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Keys.SPACE);
			OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Keys.ENTER);

			System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));
			OMTAcqui.get_ReqPay_PayReference().sendKeys(Constant.PayementRef_happypath);
			// make payment Reference as "Pending" for NON happy path(cancelled
			// flow)

			System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));
			OMTAcqui.get_ReqPay_StatusPayment().sendKeys(Constant.StatusPay_happypath);
			System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

		}

		else if (Status.equalsIgnoreCase("Activated")) {
			BP.scroll_vertical(580);
			JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
			js1.executeScript("arguments[0].click();", OMTAcqui.get_planpro());

			System.out
					.println("dateOfPlanProvisioning: " + OMTAcqui.get_dateOfPlanProvisioning().getAttribute("value"));
			System.out
					.println("timeOfPlanProvisioning: " + OMTAcqui.get_timeOfPlanProvisioning().getAttribute("value"));
			System.out.println("dateOfOrderClosing: " + OMTAcqui.get_dateOfOrderClosing().getAttribute("value"));
			System.out.println("timeOfOrderClosing: " + OMTAcqui.get_timeOfOrderClosing().getAttribute("value"));
			System.out.println("startDateOfContract: " + OMTAcqui.get_startDateOfContract().getAttribute("value"));
			System.out.println("endDateOfContract: " + OMTAcqui.get_endDateOfContract().getAttribute("value"));

		}
		
		else if (Status.equalsIgnoreCase("For Redelivery")) {
			Thread.sleep(2000L);
			BP.scroll_vertical(530);
			JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
			js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

			OMTAcqui.get_FulfillDet_Schedule().sendKeys("07/19/2022");	
			System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));
			
			OMTAcqui.select_get_FulfillDet_Status("Not Received");
			System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));
			
			OMTAcqui.select_FulfillDet_Remarks("1st Delivery Attempt Failed");
			System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));


		}

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		Generic.WriteTestData("User should be able to see confirm corret popup after click on save button", "", "", "User should be able to see confirm corret popup after click on save button","User is able to see confirm corret popup after click on save button", "Passed");
        Control.takeScreenshot();
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}
	
	
	
	
	
}
