package globeOnline_Magento;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.pages.magento.MagentoPage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;
import utility.Generic;


public class MagentoCommonMethods {

	private MagentoPage MP = new MagentoPage();
	private globeOnline_CommonMethods.util util1 = new globeOnline_CommonMethods.util();
	
	public void logintoMagento() throws Exception 
	{
		
		String username="kummithi.tcoe";
		String password="Globe@2023!";
		MP.get_username().clear();
		MP.get_username().sendKeys(username);
		System.out.println("username :"+username);
		MP.get_Password().clear();
		MP.get_Password().sendKeys(password);
		System.out.println("password :"+password);
		Control.takeScreenshot();
		
		 Thread.sleep(2000L);
	     JavascriptExecutor SignInbutton = (JavascriptExecutor) DriverManager.getDriver();
	     SignInbutton.executeScript("arguments[0].click();", MP.get_SignInBtn());
	     
         System.out.println("Click signin Button. Validation passed.");     

		if(MP.isElementExist("sales button ", "SalesBtn", 10))
				{
			Generic.WriteTestData("agent should be able to login magento successfully  : ", "", "", "agent "+username+"should be able to login magento successfully ","agent "+username+" is able to  login magento successfully", "Passed");
				}
		else
		{
			Generic.WriteTestData("agent should be able to login  magento successfully  : ", "", "", "agent "+username+"should be able to login magento successfully ","agent "+username+" is unable to  login magento successfully", "Failed");
		}
	}
		/////////////////////////////////////////////////////////////////////
	public void Proceed() throws Exception {	
		   // Perform Proceed  validation

	      if (Constant.EnvProceedbtn.equalsIgnoreCase("UAT")) {
	    	  JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
	    		js3.executeScript("arguments[0].click();", MP.get_proceedtocommerceuat());
	            System.out.println("proceed to commerceuat. Validation passed.");
	            
	       } else {
	            System.out.println("Order is not processing. Validation failed.");
	       }
	       //proceed to commerce Prod    
	      if (Constant.EnvProceedbtn.equalsIgnoreCase("Prod")) {
	    	  
	    	  if(MP.isElementExist("proceedtocommerceProd", "proceedtocommerceProd", 10)){
	    		  JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		    		js3.executeScript("arguments[0].click();", MP.get_proceedtocommerceProd());
		            System.out.println("proceed to commerceProd. Validation passed."); 
	  		}
	    	  
	          
	       } else {
	            System.out.println("proceed to commerce Prod. Validation failed.");
	       }
		}	/////////////////////////////////////////////////////////////////////////////////////////////////////
	      
	public void magentoDasahboard() throws Exception
	{
		MP.isElementExist("sales button ", "SalesBtn", 10);
		Control.takeScreenshot();
		JavascriptExecutor js25 = (JavascriptExecutor) DriverManager.getDriver();
		js25.executeScript("arguments[0].click();", MP.get_SalesBtn());
		Thread.sleep(3000);
		MP.isElementExist("order button", "OrdersBtn", 10);
		Control.takeScreenshot();
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", MP.get_OrdersBtn());
		if(MP.isElementExist("Search box field ", "SearchBoxField", 10))
		{
	      Generic.WriteTestData("agent should be able see the Search field -  : ", "", "", "agent should be able to validate searchfeild in Dashboard ","agent is  able to validate searchfeild in Dashboard ", "Passed");
		}
        else
            {
	          Generic.WriteTestData("agent should be able to login  magento successfully  : ", "", "", "agent should be able to validate searchfeild in Dashboard  ","agent is   not able to validate searchfeild in Dashboard ", "Failed");
             }
		}
	
	public void Orderpage(String Orderid) throws Exception { 
		MP.isElementExist("Search box field ", "SearchBoxField", 10);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", MP.get_SearchBoxField());	
		
		MP.get_SearchBoxField().clear();
		MP.isElementExist("actionremove ", "actionremove", 10);
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", MP.get_actionremove());
		
		MP.get_SearchBoxField().sendKeys(Orderid);
		
		//DriverManager.getDriver().navigate().refresh();
		Thread.sleep(5000);
		MP.get_SearchBoxField().sendKeys(Keys.ENTER);
		Control.takeScreenshot();
		if(MP.isElementExist("orderid", "ID", 10))
		{
	Generic.WriteTestData("agent should be able see the searched orderid details in the dashboard -  : ", "", "", "agent should be able see the searched orderid details in the dashboard - ","agent is able see the searched orderid details in the dashboard - ", "Passed");
		}
else
{
	Generic.WriteTestData("agent should be able see the searched orderid details in the dashboard -  : ","","", "agent should be able see the searched orderid details in the dashboard - ","agent is able see the searched orderid details in the dashboard - ", "Failed");
}

		
	}
	public void orderpagevalidationheader() throws Exception {
		
		MP.isElementExist("orderid", "ID", 10);		
		MP.isElementExist("order purchage point", "purchagepoint", 10);
		MP.isElementExist("order bill date ", "purchaseDate", 10);
		MP.isElementExist("bill to name","billtoname",10);
		MP.isElementExist("ship to name", "shiptoname",10);
		MP.isElementExist(" order grade total base", "grandtotalbase", 10);
		MP.isElementExist("order gran total purchaged", "grandtootalppurchage", 10);
		MP.isElementExist("order status", "status", 10);
		MP.isElementExist("action","action",10);
		MP.isElementExist("allocated source","allocatedsource",10);
		MP.isElementExist("name of recipt","nameofrecipt",10);
		MP.isElementExist("coupen code", "coupencode",10);
		
		MP.isElementExist("order mobile number ", "mobilenumber", 10);
		MP.isElementExist("order MSA number", "msanumber", 10);
		MP.isElementExist("brain tree transactions", "braintreetrns",10);
		
		MP.isElementExist("order brgy", "barangy", 10);
		MP.isElementExist("order type","ordertypehead", 10);
		MP.isElementExist("order trnsactionorderid", "tncdetails",10);
		Control.takeScreenshot();
		if(MP.isElementExist("orderid", "ID", 10))
		{
	Generic.WriteTestData("agent should be able see the searched orderid headers in the dashboard -  : ", "", "", "agent should be able see the searched orderid headers in the dashboard - ","agent is able see the searched orderid headers in the dashboard - ", "Passed");
		}
else
{
	Generic.WriteTestData("agent should be able see the searched orderid headers in the dashboard -  : ","","", "agent should be able see the searched orderid headers in the dashboard - ","agent is  not able see  to the searched orderid headers in the dashboard - ", "Failed");
}

		
	}
	public void Validate_orderpage_values() throws Exception
	{
		String ID=MP.getText("OrderID");
		System.out.println("ID is:"+ID);
		
		String PP=MP.getText("OrderPurchagepoint");
		System.out.println("OrderPurchagepoint is:"+PP);
		
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				  "arguments[0].scrollIntoView(true);", MP.get_OrderPurchagepoint());
		
		//String PD=MP.getText("OrderPurchaseDate",util1.ReadFromExcel("TimeStamp", "Sheet1",Constant.iCol));
		String PD=MP.getText("OrderPurchaseDate");
		System.out.println("OrderPurchaseDate is:"+PD);
		
		String BD=MP.getText("OrderBilltoDate");
		System.out.println("OrderBilltoDate is:"+BD);
		
		String GT=MP.getText("OrderGrandTotalBase");
		System.out.println("OrderGrandTotalBase is:"+GT);
		
		String GP=MP.getText("OrderGrandTotalPurchased");
		System.out.println("OrderGrandTotalPurchased is:"+GP);
		
		String OS=MP.getText("OrderStatus");
		System.out.println("OrderStatus is:"+OS);
		
		String MN=MP.getText("OrderMobileNumber");
		System.out.println("OrderMobileNumber is:"+MN);
		
		String MSA=MP.getText("OrderMSANumber");
		System.out.println("OrderMSANumber is:"+MSA);
		
		String BR=MP.getText("OrderBrgy");
		System.out.println("OrderBrgy is:"+BR);
		
		String TP=MP.getText("OrderType");
		System.out.println("OrderType is:"+TP);
		 
		String Tnc=MP.getText("OrdeTransac_OrderId");
		System.out.println("OrdeTransac_OrderId is:"+Tnc);
		
		Control.takeScreenshot();
		if(MP.isElementExist("orderid", "ID", 10))
		{
	Generic.WriteTestData("agent should be able to get  the searched orderid details in the dashboard -  : ", "", "", "agent should be able  to get the searched orderid details in the dashboard - ","agent is able to get the searched orderid details in the dashboard - ", "Passed");
		}
else
{
	Generic.WriteTestData("agent should be able to get the searched orderid details in the dashboard -  : ","","", "agent should be able  to get the searched orderid details in the dashboard - - ","agent is  not able  to get  the searched orderid details in the dashboard - ", "Failed");
}

		
	}
	public  void click_view() throws Exception
	{
		MP.isElementExist("view button", "ViewBtn", 10);
//		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
//				  "arguments[0].scrollIntoView(true);", MP.get_ViewBtn());
//		
		if(MP.isElementExist("view button", "ViewBtn", 10))
		{
	Generic.WriteTestData("agent should be able to   see  view button in the dashboard -  : ", "", "", "agent should be able to  see  view button in the dashboard- ","agent is able to   see  view button in the dashboard- ", "Passed");
		}
else
{
	Generic.WriteTestData("agent should be able to   see  view button in the dashboard -  : ","","", "agent should be able to   see  view button in the dashboard: ","agent is not  able to   see  view button in the dashboard - ", "Failed");
}

		//MP.clickOnElement("button view ", "ViewBtn", "ViewBtn");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", MP.get_ViewBtn());
		Thread.sleep(5000);
		Control.takeScreenshot();
	}
	public void viewpagevalidation() throws Exception
	{
		MP.isElementExist("reorder button", "reorder",10);
		
		MP.isElementExist(" login as customer button", "loginascustomer",10);
		MP.isElementExist(" back buuton", "backbutton",10);
		MP.isElementExist(" cancel button", "cancelbutton",10);
		MP.isElementExist("send e mail button", "sendemail",10);
		MP.isElementExist("hold button", "hold",10);
		MP.isElementExist("invoice button", "invoice",10);
		MP.isElementExist(" ship button", "ship",10);
		MP.isElementExist("edit button", "edit",10);
		MP.isElementExist("order view ", "orderview",10);
		MP.isElementExist(" information", "information",10);
		MP.clickOnElement("button", "information","information");
		Control.takeScreenshot();
		
		//MP.isElementExist("orderaccount information","orderaccountinfo",10);
		if(MP.isElementExist("Order and account information", "orderaccountinfo", 10))
		{
	Generic.WriteTestData("agent should be able to redirecting to the order details page  after click on  view button : ", "", "", "agent should be able to redirecting to the order details page  after click on  view button :","agent is able to redirecting to the order details page  after click on  view button : ", "Passed");
		}
else
{
	Generic.WriteTestData("agent should be able to redirecting to the order details page  after click on  view button :  : ","","", "agent should be able to redirecting to the order details page  after click on  view button : ","agent is not able to redirecting to the order details page  after click on  view button : ", "Failed");
}

		
	}
	public void Order_andAccountvalidation() throws Exception
	{
		MP.isElementExist("Order and account information", "orderaccountinfo", 10);
		MP.isElementExist("order conformation email", "orderconformationemail", 10);
		MP.isElementExist("order date", "orderdate", 10);
		MP.isElementExist("order status", "orderstatus", 10);
		MP.isElementExist(" purchaged from ", "purchagefrom", 10);
		
		String OD=MP.getText("orderdatevalue");
	System.out.println("orderdatevalue is:"+OD);
		
		String status=MP.getText("orderstatusvalue");
		System.out.println("orderstatusvalue id:"+status);
		
		String PF=MP.getText("purchagefromvalue");
		System.out.println("purchagefromvalue IS:"+PF);
		Control.takeScreenshot();
		
		
		MP.isElementExist(" Account information ", "accountinformation",10);
		MP.isElementExist("customer name", "cutomername",10);
		MP.isElementExist(" email id", "email",10);
		MP.isElementExist("customer group", "custgroup",10);
		//MP.isElementExist("edit customer","editcustomer",10); not in preprod
		
		String cusomername=MP.getText("customernameis");
		System.out.println("customernameis is:"+cusomername);
		String customeremail=MP.getText("emailid");
		System.out.println("emailid is :"+customeremail);
		String customergroupname=MP.getText("customergroupname");
		System.out.println("customergroupname is:"+customergroupname);
		Control.takeScreenshot();
		
		if(MP.isElementExist(" Account information ", "accountinformation",10))
		{
	Generic.WriteTestData("agent should able to validate account information section : ", "", "", "agent should able to validate account information section :","agent is  able to validate account information section : ", "Passed");
		}
else
{
	Generic.WriteTestData("agent should able to validate account information section : ","","", "agent should able to validate account information section : ","agent is not able to validate account information section :", "Failed");
}

		
	}
	public void validate_billing_shipping_address() throws Exception
	{
		MP.isElementExist("Adderss information", "addressinfo",10);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				  "arguments[0].scrollIntoView(true);", MP.get_addressinfo());
		
		MP.isElementExist("Billing address", "billingaddress",10);
		MP.isElementExist("Billing address edit", "editbillingaddress",10);
		MP.isElementExist("shipping address", "shippingaddress",10);
		MP.isElementExist("shipping address edit", "editshipingaddress",10);
		String BA=MP.getText("billingaddressdetails");
		System.out.println("billingaddressdetails IS:"+BA);
		String SA=MP.getText("shippingaddressdetails");
		System.out.println("shippingaddressdetails IS:"+SA);
		Control.takeScreenshot();
	if(MP.isElementExist("Billing address", "billingaddress",10))
		{
	Generic.WriteTestData("agent should able to validate billingaddress information section : ", "", "", "agent should able to validate billingaddress information section :","agent is  able to validate billingaddress information section : ", "Passed");
		}
else
{
	Generic.WriteTestData("agent should able to validate billingaddress information section : ","","", "agent should able to validate billingaddress information section : ","agent is not able to validate billingaddress information section :", "Failed");
}

		

		
	}
	public void payment_shipping_validation() throws Exception
	{
		MP.isElementExist("payment and shipping method", "payshippingmethod",10);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				  "arguments[0].scrollIntoView(true);", MP.get_payshippingmethod());
		MP.isElementExist("payment information", "payinfo",10);
		MP.isElementExist("name ", "paymentname",10);
		MP.isElementExist("USD", "orderusd",10);
		MP.isElementExist("Handling information", "handlinginfo",10);
		MP.isElementExist("Delivery free", "sdelivery",10);
		Control.takeScreenshot();
		if(MP.isElementExist("payment and shipping method", "payshippingmethod",10))
		{
	Generic.WriteTestData("agent should able to validate payment@shipingmethod  information section : ", "", "", "agent should able to validate payment@shipingmethod information section :","agent is  able to validate payment@shipingmethod information section : ", "Passed");
		}
else
{
	Generic.WriteTestData("agent should able to validate payment@shipingmethod information section : ","","", "agent should able to validate payment@shipingmethod information section : ","agent is not able to validate payment@shipingmethod information section :", "Failed");
}

		
	}
	public void validateinformation() throws Exception
	{
		MP.isElementExist("validate information","validateinfo", 10);
		MP.isElementExist("validate ID","validateid", 10);
		MP.isElementExist(" order type","ordertype", 10);
		MP.isElementExist("sub order type","subordertype", 10);
		MP.isElementExist("qoute type","qoutetype", 10);
		Control.takeScreenshot();
		
		
		String VA=MP.getText("validateidvalue");
		System.out.println("validateidvalue IS:"+VA);
		String OV=MP.getText("ordertypevalue");
		System.out.println("ordertypevalue IS:"+OV);
		String SV=MP.getText("subordertypevalue");
		System.out.println("subordertypevalue IS:"+SV);
		String QV=MP.getText("qtyvalue1");
		System.out.println("qtyvalue1 IS:"+QV);
		Control.takeScreenshot();
		if(MP.isElementExist("validate information","validateinfo", 10))
		{
	Generic.WriteTestData("agent should able to validate  information section : ", "", "", "agent should able to validate information section :","agent is  able to validate  information section : ", "Passed");
		}
else
{
	Generic.WriteTestData("agent should able to validate information section : ","","", "agent should able to validate  information section : ","agent is not able to validate information section :", "Failed");
}

		
	}
	public void itemorder_validation(String myduoaddon, String Viuaddon, String APVaddon,String spotifyaddon, String easyroamaddon, String gocallAddon, String gsaddadddon, String gadgetaddon) throws Exception
	     
	{
		MP.isElementExist("itemorder", "itemorder", 10);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				  "arguments[0].scrollIntoView(true);", MP.get_itemorder());
		MP.isElementExist("product", "proudct", 10);
		MP.isElementExist(" item status", "itemstatus", 10);
		MP.isElementExist("original price", "originalprice", 10);
		MP.isElementExist("price", "price", 10);
		MP.isElementExist("QTY", "qty", 10);
		MP.isElementExist("sub total", "subtotal", 10);
		MP.isElementExist("tax amount ", "taxamount", 10);
		MP.isElementExist("tax percentage", "taxpercent", 10);
		MP.isElementExist("discount amount", "discountamount", 10);
		MP.isElementExist("row wise total", "rowtotal", 10);
		Control.takeScreenshot();
		
		String PM=MP.getText("productvalue");
		System.out.println("productvalue IS:"+PM);
		String PSKU =MP.getText("productvaluSKU");
		System.out.println("productvaluSKU IS:"+PSKU);
		String STATUS =MP.getText("itemstatusvalue");
		System.out.println("itemstatusvalue IS:"+STATUS);
		String OP =MP.getText("originalpricevalue");
		System.out.println("originalpricevalue IS:"+OP);
		String PRICE=MP.getText("pricevalue");
		System.out.println("pricevalue IS:"+PRICE);
		String QTY=MP.getText("qtyvalue");
		System.out.println("qtyvalue:"+QTY);
		String ST=MP.getText("subtotalvale");
		System.out.println("subtotalvale IS:"+ST);
		String TA=MP.getText("taxamountvalue");
		System.out.println("taxamountvalue IS:"+TA);
		String TP=MP.getText("taxpercentvalue");
		System.out.println("taxpercentvalue IS:"+TP);
		String DISCOUNT=MP.getText("discountamountvalue");
		System.out.println("discountamountvalue:"+DISCOUNT);
		String RT=MP.getText("rowtotalvalue");
		System.out.println("rowtotalvalue:"+RT);
	
		
		
		String planes=MP.getText("planes");
		System.out.println("planes is:"+planes);
		String palnename=MP.getText("palnename");
		System.out.println("palnename is:"+palnename);
		String itemstatus1=MP.getText("itemstatus1");
		System.out.println("itemstatus1 is:"+itemstatus1);
		String originalprice1=MP.getText("originalprice1");
		System.out.println("originalprice1 is:"+originalprice1);
		String pricevalue1=MP.getText("pricevalue1");
		System.out.println("pricevalue1 is:"+pricevalue1);
		String qtyvalue2=MP.getText("qtyvalue2");
		System.out.println("qtyvalue2 is:"+qtyvalue2);
		String device=MP.getText("device");
		System.out.println("device is:"+device);
		String deivename=MP.getText("deivename");
		System.out.println("deivename:"+deivename);
		String devicestatus2=MP.getText("devicestatus2");
		System.out.println("devicestatus2:"+devicestatus2);
		String deviceoroginalprice=MP.getText("deviceoroginalprice");
		System.out.println("deviceoroginalprice:"+deviceoroginalprice);
		String deviceprice=MP.getText("deviceprice");
		System.out.println("deviceprice:"+deviceprice);
		String qtyvalue3=MP.getText("qtyvalue3");
		System.out.println("qtyvalue3:"+qtyvalue3);
		
		 if (MP.equalsIgnoreCase("myduoaddon")) {
		String myduo=MP.getText("myduo");
		System.out.println("myduo is:"+myduo);
		String myduoprice=MP.getText("myduoprice");
		System.out.println("myduoprice is:"+myduoprice);
		String addonduostatus=MP.getText("addonduostatus");
		System.out.println("addonduostatus is:"+addonduostatus);
		String addonpriceduo=MP.getText("addonpriceduo");
		System.out.println(" addonpriceduois:"+addonpriceduo);
		String duoqty=MP.getText("duoqty");
		System.out.println("duoqty is:"+duoqty);
		 }
		 
		
		 if (MP.equalsIgnoreCase("Viuaddon")) {
			 ((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					 "arguments[0].scrollIntoView(true);", MP.get_viu());				
					 String viu=MP.getText("viu"); System.out.println("viu is:"+viu); String
					 viupricetitle=MP.getText("viupricetitle");
					 System.out.println(" viupricetitleis:"+viupricetitle); String
					 viustatus=MP.getText("viustatus");
					 System.out.println("viustatus is:"+viustatus); String
					 viuprice=MP.getText("viuprice"); System.out.println(" viupriceis:"+viuprice);
					 String viuqty=MP.getText("viuqty"); System.out.println("viuqty is:"+viuqty);			
	       } 
		 
		 if (MP.equalsIgnoreCase("APVaddon")) {
				String APV=MP.getText("APV");
				System.out.println("APV is:"+APV);
				String APVpricetitle=MP.getText("APVpricetitle");
				System.out.println(" APVpricetitleis:"+APVpricetitle);
				String APVstatus=MP.getText("APVstatus");
				System.out.println(" APVstatusis:"+APVstatus);
				String APVprice=MP.getText("APVprice");
				System.out.println(" APVpriceis:"+APVprice);
				String APVqty=MP.getText("APVqty");
				System.out.println("APVqty is:"+APVqty);
				
		 }
		 if (MP.equalsIgnoreCase("spotifyaddon")) {
				String spotify=MP.getText("spotify");
				System.out.println("spotify is:"+spotify);
				String spotifypricetitle=MP.getText("spotifypricetitle");
				System.out.println(" spotifypricetitleis:"+spotifypricetitle);
				String spotifystatus=MP.getText("spotifystatus");
				System.out.println(" spotifystatusis:"+spotifystatus);
				String spotifyprice=MP.getText("spotifyprice");
				System.out.println(" spotifypriceis:"+spotifyprice);
				String spotifyqty=MP.getText("spotifyqty");
				System.out.println(" spotifyqtyis:"+spotifyqty);
		
		 }
	
		 if (MP.equalsIgnoreCase("easyroamaddon")) {
		 String easyroam=MP.getText("easyroam");
		 System.out.println("easyroam is:"+easyroam); String
		 easyroampricetitle=MP.getText("easyroampricetitle");
		 System.out.println(" easyroampricetitleis:"+easyroampricetitle); String
		 easyroamstatus=MP.getText("easyroamstatus");
		 System.out.println("easyroamstatus is:"+easyroamstatus); String
		 easyroamprice=MP.getText("easyroamprice");
		 System.out.println("easyroamprice is:"+easyroamprice); String
		 easyroamqty=MP.getText("easyroamqty");
		 System.out.println("easyroamqty is:"+easyroamqty);
		 
		 }
		 if (MP.equalsIgnoreCase("gocallAddon")) {
		 String gocallid=MP.getText("gocallid");
		  System.out.println("gocallid is:"+gocallid); String
		 gocallidpricetitle=MP.getText("gocallidpricetitle");
		 System.out.println("gocallidpricetitle is:"+gocallidpricetitle); String
		 gocallidstatus=MP.getText("gocallidstatus");
		 System.out.println("gocallidstatus is:"+gocallidstatus); String
		 gocallidprice=MP.getText("gocallidprice");
		 System.out.println("gocallidprice is:"+gocallidprice); String
		 gocallidqty=MP.getText("gocallidqty");
		 System.out.println(" gocallidqtyis:"+gocallidqty);
		 }
		
		 
		 if (MP.equalsIgnoreCase("gsaddadddon")) {			 
				String gsadd=MP.getText("gsadd");
					System.out.println("gsadd is:"+gsadd);
					String gsaddpricetitle=MP.getText("gsaddpricetitle");
					System.out.println("gsaddpricetitle is:"+gsaddpricetitle);
					String gsaddstatus=MP.getText("gsaddstatus");
					System.out.println("gsaddstatus is:"+gsaddstatus);
					String gsaddprice=MP.getText("gsaddprice");
					System.out.println("gsaddprice is:"+gsaddprice);
					String gsaddqty=MP.getText("gsaddqty");
					System.out.println(" gsaddqtyis:"+gsaddqty);
		 }
		 if (MP.equalsIgnoreCase("gadgetaddon")) {			 
				String gadget=MP.getText("gadget");
				System.out.println(" gadgetis:"+gadget);
				String gadgetpricetitle=MP.getText("gadgetpricetitle");
				System.out.println("gadgetpricetitle is:"+gadgetpricetitle);
				String gadgetstatus=MP.getText("gadgetstatus");
				System.out.println(" gadgetstatusis:"+gadgetstatus);
				String gadgetprice=MP.getText("gadgetprice");
				System.out.println("gadgetprice is:"+gadgetprice);
				String gadgetqty=MP.getText("gadgetqty");
				System.out.println(" gadgetqtyis:"+gadgetqty); 
		 }
 	Control.takeScreenshot();
		
		if(MP.isElementExist("itemorder", "itemorder", 10))
		{
	Generic.WriteTestData("agent should able to validate  item order details table : ", "", "", "agent should able to validate  item order details table :","agent is  able to validate  item order details table :", "Passed");
		}
else
{
	Generic.WriteTestData("agent should able to validate  item order details table : ","","", "agent should able to validate  item order details table : ","agent is not able to validate  item order details table :", "Failed");
}

	
	}
	public void ordertotalvalidation() throws Exception
	{
		//MP.isElementExist(" ", "", 10);
		MP.isElementExist("ordertotal is ", "ordertotal", 10);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				  "arguments[0].scrollIntoView(true);", MP.get_ordertotal());
		
		MP.isElementExist("notes ", "notes", 10);
		MP.isElementExist(" statuscheck", "statuscheck", 10);
		
		
		MP.isElementExist("comment ", "comment", 10);
		MP.isElementExist(" commenttextare", "commenttextare", 10);
		MP.isElementExist("notificationbyemail ", "notificationbyemail", 10);
		MP.isElementExist("visibleonstorefront ", "visibleonstorefront", 10);
		MP.isElementExist(" ordertotal2", "ordertotal2", 10);
		MP.isElementExist("subtotal2 ", "subtotal2", 10);
		MP.isElementExist("shipinghandling ", "shipinghandling", 10);
		MP.isElementExist(" pretermfee", "pretermfee", 10);
		MP.isElementExist(" overdue", "overdue", 10);
		MP.isElementExist(" grandtotal", "grandtotal", 10);
		MP.isElementExist("totalpaid ", "totalpaid", 10);
		MP.isElementExist(" totalrefounded", "totalrefounded", 10);
		MP.isElementExist("totaldue ", "totaldue", 10);
		//MP.isElementExist("tax ", "tax", 10);
		
		//MP.select_get_orderconfirmstatus().getAttribute("value");
		
		//System.out.println("orderconfirmstatus: " +MP.select_get_orderconfirmstatus().getAttribute("value"));
		
		String subtotal2price=MP.getText("subtotal2price");
		System.out.println(" subtotal2price is:"+subtotal2price);
		String shipinghandlingprice=MP.getText("shipinghandlingprice");
		System.out.println("shipinghandlingprice  is:"+shipinghandlingprice);
		String pretermefeeprice=MP.getText("pretermefeeprice");
		System.out.println("pretermefeeprice  is:"+pretermefeeprice);
		String overdueprice=MP.getText("overdueprice");
		System.out.println("overdueprice  is:"+overdueprice);
		String taxvalue=MP.getText("taxvalue");
		System.out.println("taxvalue  is:"+taxvalue);
		String grandttalprice=MP.getText("grandttalprice");
		System.out.println("grandttalprice  is:"+grandttalprice);
		String totalpaidprice=MP.getText("totalpaidprice");
		System.out.println("totalpaidprice  is:"+totalpaidprice);
		String totalrefoundprice=MP.getText("totalrefoundprice");
		System.out.println("totalrefoundprice  is:"+totalrefoundprice);
		String totaldueprice=MP.getText("totaldueprice");
		System.out.println(" totaldueprice is:"+totaldueprice);
		Control.takeScreenshot();
		if(MP.isElementExist("ordertotal is ", "ordertotal", 10))
		{
	Generic.WriteTestData("agent should able to validate  ordertotal  details  : ", "", "", "agent should able to validate  ordertotal details  :","agent is  able to validate  ordertotal details :", "Passed");
		}
else
{
	Generic.WriteTestData("agent should able to validate  ordertotal details table : ","","", "agent should able to validate  ordertotal details  : ","agent is not able to validate  ordertotal details :", "Failed");
}

	}
	public void submitexist() throws Exception
	{
		MP.isElementExist(" button submintcomment ", "submintcomment", 10);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				  "arguments[0].scrollIntoView(true);", MP.get_submintcomment());
		
		
		Control.takeScreenshot();
		if(MP.isElementExist(" button submintcomment ", "submintcomment", 10))
		{
	Generic.WriteTestData("agent should able to validate  Order was submitted to OMT : ", "", "", "agent should able to validate  Order was submitted to OMT.  :","agent is  able to validate  Order was submitted to OMT.:", "Passed");
		}
else
{
	Generic.WriteTestData("agent should able to validate Order was submitted to OMT.: ","","", "agent should able to validate  Order was submitted to OMT.  : ","agent is not able to validate  Order was submitted to OMT. :", "Failed");
}

	}
	
}
