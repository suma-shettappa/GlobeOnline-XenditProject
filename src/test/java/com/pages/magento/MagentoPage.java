package com.pages.magento;

import org.testng.AssertJUnit;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class MagentoPage extends BasePage {
	
	By AdvancedBtn = By.xpath("//button[@id='details-button' and contains(text(),'Advanced')]");
	By proceedtocommerceuat = By.xpath("//a[@id='proceed-link' and contains(text(),'Proceed to commercepreprod.globetel.com (unsafe)')]");
	By proceedtocommerceProd = By.xpath("//a[@id='proceed-link' and contains(text(),'Proceed to commerce.globetel.com (unsafe)')]");
	
	By Username = By.xpath("//input[@id='username']");
	By Password = By.xpath("//input[@id='login']");
	By SignInBtn = By.xpath("//span[contains(text(), 'Sign in')]");
	By SalesBtn = By.xpath("//li[@id='menu-magento-sales-sales']");
	By OrdersBtn = By.xpath("//span[contains(text(),'Orders')]");
			//a[contains(@href,'https://commerceuat.globetel.com/globestore/sales/order/')]");
	By actionremove=By.xpath("//button[@class='action-remove']");
	
	By intoclick=By.xpath("//button[@class='action-remove']");
	By SearchBoxField = By.xpath("(//input[@id='fulltext' and @placeholder='Search by keyword'])[1]");
	
	By ViewBtn = By.xpath("//a[@class='action-menu-item']");
			//a[contains(@href,'https://commerceuat.globetel.com/globestore/sales/order/view/')]");
	//asma
	By ID=By.xpath("(//span[text()='ID'])[3]");
	By purchagepoint=By.xpath("(//span[text()='Purchase Point'])[3]");
	By purchaseDate=By.xpath("(//span[text()='Purchase Date'])[3]");
	By billtoname=By.xpath("(//span[text()='Bill-to Name'])[3]");
	By shiptoname=By.xpath("(//span[text()='Ship-to Name'])[3]");
	By grandtotalbase=By.xpath("(//span[text()='Grand Total (Base)'])[3]");
	By grandtootalppurchage=By.xpath("(//span[text()='Grand Total (Purchased)'])[3]");
	By status=By.xpath("(//span[text()='Status'])[3]");
	By action=By.xpath("(//span[text()='Action'])[2]");//need to check these one
	By allocatedsource=By.xpath("(//span[text()='Allocated sources'])[2]");
	By nameofrecipt=By.xpath("(//span[text()='Name of the Recipient'])[3]");
	By coupencode=By.xpath("(//span[text()='Coupon Code'])[2]");
	By mobilenumber=By.xpath("(//span[text()='Mobile Number'])[3]");
	By msanumber=By.xpath("(//span[text()='MSA Number'])[3]");
	By braintreetrns=By.xpath("(//span[text()='Braintree Transaction Source'])[3]");
	By barangy=By.xpath("(//span[text()='Barangay'])[3]");
	By ordertypehead=By.xpath("(//span[text()='Order Type'])[3]");
	By tncdetails=By.xpath("(//span[text()='Tnc Details'])[3]");
	
	//endhere
	
	
	
	By OrderID = By.xpath("//div[@class='data-grid-cell-content' and contains(text(), 'PRE')]");
	By OrderPurchagepoint=By.xpath("//div[@class='data-grid-cell-content' and contains(text(), 'Main Website')]");
	By OrderPurchaseDate = By.xpath("//div[@class='data-grid-cell-content' and contains(text(), '202')]");
	By OrderBilltoDate = By.xpath("(//div[@class='data-grid-cell-content'])[4]");	
	By OrderGrandTotalBase = By.xpath("(//div[@class='data-grid-cell-content'])[6]");
	By OrderGrandTotalPurchased = By.xpath("(//div[@class='data-grid-cell-content'])[7]");
	By OrderStatus = By.xpath("(//div[@class='data-grid-cell-content'])[8]");
	By OrderMobileNumber = By.xpath("(//div[@class='data-grid-cell-content'])[11]");
	By OrderMSANumber = By.xpath("(//div[@class='data-grid-cell-content'])[13]");
	By OrderBrgy = By.xpath("(//div[@class='data-grid-cell-content'])[14]");
	By OrderType = By.xpath("(//div[@class='data-grid-cell-content'])[15]");
	
	By OrdeTransac_OrderId = By.xpath("(//div[@class='data-grid-cell-content'])[16]");
	//asma script
	
	//By orderidvalue=By.xpath("//div[text()='"+Orderid+"']/parent::td/following-sibling::td[1]");
	//DriverManager.getDriver().findElement(By.xpath("//div[text()="+Orderid+"]"));
			//String pp=DriverManager.getDriver().findElement(By.xpath("//div[text()='"+Orderid+"']/parent::td/following-sibling::td[1]")).getText();
			

//	By orderidvalue=By.xpath("//div[contains(text(),'UAT-000')]");
//	By purchagepointvalue=By.xpath("//div[contains(text(),'UAT-000')]/parent::td/following-sibling::td");
//	By purchagedatevalue=By.xpath("//div[contains(text(),'UAT-000')]/parent::td/following-sibling::td[2]");
//	By billtonamevalue=By.xpath("//div[contains(text(),'UAT-000')]/parent::td/following-sibling::td[3]");
//	By shiptonamevalue=By.xpath("//div[contains(text(),'UAT-000')]/parent::td/following-sibling::td[4]");
//	By grandtotalbasevalue=By.xpath("//div[contains(text(),'UAT-000')]/parent::td/following-sibling::td[5]");
//	By grandtotalpurchagedvalue=By.xpath("//div[contains(text(),'UAT-000')]/parent::td/following-sibling::td[6]");
//	By statusvalue=By.xpath("//div[contains(text(),'UAT-000')]/parent::td/following-sibling::td[7]");
//	
//	
	
	
	
	By reorder=By.xpath("//span[contains(text(),'Reorder')]");
	By loginascustomer=By.xpath("//span[contains(text(),'Login as Customer')]");
	By backbutton=By.xpath("//span[contains(text(),'Back')]");
	By cancelbutton=By.xpath("//button[@id='order-view-cancel-button']");
	By sendemail=By.xpath("//button[@id='send_notification']");
	By hold=By.xpath("//button[@id='order-view-hold-button']");
	By invoice=By.xpath("//button[@id='order_invoice']");
	By ship=By.xpath("//button[@id='order_ship']");
	By edit=By.xpath("//button[@id='order_edit']");	
	By orderview=By.xpath("//strong[contains(text(),'Order View')]");
	By information=By.xpath("//a[@id='sales_order_view_tabs_order_info']//span");
	By orderaccountinfo=By.xpath("//span[contains(text(),'Order & Account Information')]");
	
	By orderconformationemail=By.xpath("//span[@class='title']//span");
	By orderdate=By.xpath("//table[@class='admin__table-secondary order-information-table']//th");
	By orderdatevalue=By.xpath("//table[@class='admin__table-secondary order-information-table']//td");
	By orderstatus=By.xpath("//table[@class='admin__table-secondary order-information-table']//th[contains(text(),'Order Status')]");
	By orderstatusvalue=By.xpath("//span[@id='order_status']");
	By purchagefrom=By.xpath("//table[@class='admin__table-secondary order-information-table']//th[contains(text(),'Purchased From')]");
	By purchagefromvalue=By.xpath("//td[contains(text(),'Main Website')]");
	
	By accountinformation=By.xpath("//span[@class='title' and text()='Account Information']");
	By editcustomer=By.xpath("//a[contains(@href,'https://commerceuat.globetel.com/globestore/customer/index/edit/id/')]");
	By cutomername=By.xpath("//table[@class='admin__table-secondary order-account-information-table']//th");	
	By customernameis=By.xpath("//th[text()='Customer Name']//following::td[1]//span");
		//a[contains(@href,'https://commerceuat.globetel.com/globestore/customer/index/edit/id/')]//span"); in uat
	By email=By.xpath("//th[contains(text(),'Email')]");
	By emailid=By.xpath("//th[contains(text(),'Email')]/parent::tr/td/a");
	By custgroup=By.xpath("//th[contains(text(),'Customer Group')]");
	By customergroupname=By.xpath("//td[contains(text(),'General')]");
	
	
	By addressinfo=By.xpath("//span[contains(text(),'Address Information')]");
	By billingaddress=By.xpath("//span[contains(text(),'Billing Address')]");
	By editbillingaddress=By.xpath("(//a[contains(text(),'Edit')])[2]");
	By billingaddressdetails=By.xpath("//address[@class='admin__page-section-item-content']");	
	By shippingaddress=By.xpath("//span[contains(text(),'Shipping Address')]");
	By editshipingaddress=By.xpath("(//a[contains(text(),'Edit')])[3]");
	By shippingaddressdetails=By.xpath("(//address[@class='admin__page-section-item-content'])[2]");
	
	By payshippingmethod=By.xpath("//span[contains(text(),'Payment & Shipping Method')]");
	By payinfo=By.xpath("//span[contains(text(),'Payment Information')]");
	By paymentname=By.xpath("//div[@class='admin__page-section-item-content']//div");
	By orderusd=By.xpath("//div[contains(text(),'The order was placed using PHP.')]");
			//div[contains(text(),'The order was placed using USD.')]");
	By handlinginfo=By.xpath("//span[contains(text(),'Shipping & Handling Information')]");
	By sdelivery=By.xpath("//strong[contains(text(),'Standard Delivery - Free')]");
	
	
	By validateinfo=By.xpath("//span[contains(text(),'Validate Info')]");
	By validateid=By.xpath("//table[@class='admin__table-secondary order-account-information-table']//th[text()='Validate Id']");
	By ordertype=By.xpath("//table[@class='admin__table-secondary order-account-information-table']//th[text()='Order Type']");
	By subordertype=By.xpath("//table[@class='admin__table-secondary order-account-information-table']//th[text()='Sub Orde Type']");
	By qoutetype=By.xpath("//table[@class='admin__table-secondary order-account-information-table']//th[text()='Quote Id']");
	
	//
	By validateidvalue=By.xpath("//table[@class='admin__table-secondary order-account-information-table']//th[text()='Validate Id']/parent::tr/following-sibling::tr/th[1]/span");
	By ordertypevalue=By.xpath("//table[@class='admin__table-secondary order-account-information-table']//th[text()='Validate Id']/parent::tr/following-sibling::tr/th[2]/span");
	By subordertypevalue=By.xpath("//table[@class='admin__table-secondary order-account-information-table']//th[text()='Validate Id']/parent::tr/following-sibling::tr/th[3]/span");
	By qtyvalue1=By.xpath("//table[@class='admin__table-secondary order-account-information-table']//th[text()='Validate Id']/parent::tr/following-sibling::tr/th[4]/span");
	//
	
	
	By itemorder=By.xpath("//span[contains(text(),'Items Ordered')]");
	By proudct=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Product']");
	By itemstatus=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Item Status']");
	By originalprice=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Original Price']");
	By price=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Price']");
	By qty=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Qty']");
	By subtotal=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Subtotal']");
	By taxamount=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Tax Amount']");
	By taxpercent=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Tax Percent']");
	By discountamount=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Discount Amount']");
	By rowtotal=By.xpath("//table[@class='data-table admin__table-primary edit-order-table']//span[text()='Row Total']");

	By productvalue=By.xpath("//div[@class='product-title']");
	By productvaluSKU=By.xpath("//div[@class='product-sku-block']");
	By itemstatusvalue=By.xpath("//td[@class='col-status']");
	By originalpricevalue=By.xpath("//td[@class='col-price-original']//span");
	By pricevalue=By.xpath("//div[@class='price-excl-tax']//span");
	By qtyvalue=By.xpath("//table[@class='qty-table']");
	By subtotalvale=By.xpath("(//div[@class='price-excl-tax'])[2]");
	By taxamountvalue=By.xpath("//td[@class='col-tax-amount']//span");
	By taxpercentvalue=By.xpath("//td[@class='col-tax-percent']");
	By discountamountvalue=By.xpath("//td[@class='col-discont']//span");
	By rowtotalvalue=By.xpath("//td[@class='col-total last']//span");
	
	
	By planes=By.xpath("//div[contains(text(),'Plans')]");
	By palnename=By.xpath("//div[@class='option-value']");
	By itemstatus1=By.xpath("(//td[@class='col-status'])[2]");
	By originalprice1=By.xpath("(//span[@class='price'])[2]");
	By pricevalue1=By.xpath("(//span[@class='price'])[3]");
	By qtyvalue2=By.xpath("(//table[@class='qty-table'])[2]");
	By device=By.xpath("//div[contains(text(),'Device Variants')]");
	By deivename=By.xpath("(//div[@class='option-value'])[2]");
	By devicestatus2=By.xpath("(//td[@class='col-status'])[3]");
	By deviceoroginalprice=By.xpath("(//td[@class='col-price-original']//span)[2]");
	By deviceprice=By.xpath("(//div[@class='price-excl-tax']//span)[3]");
	By qtyvalue3=By.xpath("(//table[@class='qty-table'])[3]");
	//need to check here
	By myduo=By.xpath("//div[contains(text(),'Duo')]");
	By myduoprice=By.xpath("//div[contains(text(),'Duo')]//following::div[1]");
	By addonduostatus=By.xpath("//div[contains(text(),'Duo')]//following::td[1]");
	By addonpriceduo=By.xpath("//div[contains(text(),'Duo')]//following::td[2]");
	By duoqty=By.xpath("//div[contains(text(),'Duo')]//following::td[4]");
	
	By viu=By.xpath("//div[contains(text(),'Premium')]");
	//div[contains(text(),'GS')]//following::div[1]
	By viupricetitle=By.xpath("//div[contains(text(),'Premium')]//following::div[1]");
	By viustatus=By.xpath("//div[contains(text(),'Premium')]//following::td[1]");
	By viuprice=By.xpath("//div[contains(text(),'Premium')]//following::td[2]");
	By viuqty=By.xpath("//div[contains(text(),'Premium')]//following::td[4]");
	
	By APV=By.xpath("//div[contains(text(),' Amazon')]");
	By APVpricetitle=By.xpath("//div[contains(text(),' Amazon')]//following::div[1]");
	By APVstatus=By.xpath("//div[contains(text(),' Amazon')]//following::td[1]");
	By APVprice=By.xpath("//div[contains(text(),' Amazon')]//following::td[2]");
	By APVqty=By.xpath("//div[contains(text(),' Amazon')]//following::td[4]");
	
	By spotify=By.xpath("//div[@id='order_item_842_title']");
	By spotifypricetitle=By.xpath("(//div[@class='product-sku-block'])[5]");
	By spotifystatus=By.xpath("(//td[@class='col-status'])[7]");
	By spotifyprice=By.xpath("(//td[@class='col-price-original']//span)[6]");
	By spotifyqty=By.xpath("(//table[@class='qty-table'])[7]");
	
	By easyroam=By.xpath("//div[contains(text(),'Easy')]");
	By easyroampricetitle=By.xpath("//div[contains(text(),'Easy')]//following::div[1]");
	By easyroamstatus=By.xpath("//div[contains(text(),'Easy')]//following::td[1]");
	By easyroamprice=By.xpath("//div[contains(text(),'Easy')]//following::td[2]");
	By easyroamqty=By.xpath("//div[contains(text(),'Easy')]//following::td[4]");
	
	By gocallid=By.xpath("//div[contains(text(),'GOCALLIDD')]");
	By gocallidpricetitle=By.xpath("//div[contains(text(),'GOCALLIDD')]//following::div[1]");
	By gocallidstatus=By.xpath("//div[contains(text(),'GOCALLIDD')]//following::td[1]");
	By gocallidprice=By.xpath("//div[contains(text(),'GOCALLIDD')]//following::td[2]");
	By gocallidqty=By.xpath("//div[contains(text(),'GOCALLIDD')]//following::td[4]");
	
	By gsadd=By.xpath("//div[contains(text(),'GS')]");
	By gsaddpricetitle=By.xpath("//div[contains(text(),'GS')]//following::div[1]");
	By gsaddstatus=By.xpath("//div[contains(text(),'GS')]//following::td[1]");
	By gsaddprice=By.xpath("//div[contains(text(),'GS')]//following::td[2]");
	By gsaddqty=By.xpath("//div[contains(text(),'GS')]//following::td[4]");
	
	By gadget=By.xpath("//div[@id='order_item_846_title']");
	By gadgetpricetitle=By.xpath("(//div[@class='product-sku-block'])[9]");
	By gadgetstatus=By.xpath("(//td[@class='col-status'])[11]");
	By gadgetprice=By.xpath("(//td[@class='col-price-original']//span)[10]");
	By gadgetqty=By.xpath("(//table[@class='qty-table'])[11]");
	
	
	
	
	
	//end here
	
	
	
	
	//****************//
	By ordertotal=By.xpath("(//div[@class='admin__page-section-title']//span)[6]");
	By notes=By.xpath("//span[contains(text(),'Notes for this Order')]");
	By statuscheck=By.xpath("//div[@class='admin__field']//label");
	By orderconfirmstatus=By.xpath("//select[@id='history_status']");
	
	//By statuscheckvalue=By.xpath("//select[@id='history_status']//option[2]");
	By comment=By.xpath("(//label[@class='admin__field-label'])[2]");
	By commenttextare=By.xpath("//textarea[@id='history_comment']");
	//
	By ordertotal2=By.xpath("//span[contains(text(),'Order Totals')]");
	By subtotal2=By.xpath("//td[contains(text(),'Subtotal')]");
	By subtotal2price=By.xpath("//td[contains(text(),'Subtotal')]//following::span[1]");
			//(//span[@class='price'])[12]");
	
	By shipinghandling=By.xpath("//td[contains(text(),'Shipping')]");	
	By shipinghandlingprice=By.xpath("//td[contains(text(),'Shipping')]//following::span[1]");
	
	By pretermfee=By.xpath("//td[contains(text(),'Preterm')]");	
	By pretermefeeprice=By.xpath("//td[contains(text(),'Preterm')]//following::span[1]");
	
	By overdue=By.xpath("//td[contains(text(),'Overdue')]");
	By overdueprice=By.xpath("//td[contains(text(),'Overdue')]//following::span[1]");
	
	By tax=By.xpath("(//td[@class='label'])[9]");
	By taxvalue=By.xpath("(//span[@class='price'])[70]");
	
	By grandtotal=By.xpath("//strong[contains(text(),'Grand Total')]");
	By grandttalprice=By.xpath("//strong[contains(text(),'Grand Total')]//following::td[1]");
	
	By totalpaid=By.xpath("//strong[contains(text(),'Total Paid')]");
	By totalpaidprice=By.xpath("//strong[contains(text(),'Total Paid')]//following::td[1]");	
	
	By totalrefounded=By.xpath("//strong[contains(text(),'Total Refunded')]");
	By totalrefoundprice=By.xpath("//strong[contains(text(),'Total Refunded')]//following::td[1]");
	
	By totaldue=By.xpath("//strong[contains(text(),'Total Due')]");
	By totaldueprice=By.xpath("//strong[contains(text(),'Total Due')]//following::td[1]");
	
	By notificationbyemail=By.xpath("(//label[@class='admin__field-label'])[3]");
	By visibleonstorefront=By.xpath("(//label[@class='admin__field-label'])[4]");
	By submintcomment=By.xpath("//span[contains(text(),'Submit Comment')]");
	/**********************************************************************************************/
	public WebElement get_AdvancedBtn()
	{
		return DriverManager.getDriver().findElement(AdvancedBtn);
	}
	public WebElement get_addressinfo()
	{
		return DriverManager.getDriver().findElement(addressinfo);
	}
	public void select_get_orderconfirmstatus(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(orderconfirmstatus));
		s.selectByValue(option);
	}
	public WebElement get_payshippingmethod()
	{
		return DriverManager.getDriver().findElement(payshippingmethod);
	}
	public WebElement get_proceedtocommerceuat()
	{
		return DriverManager.getDriver().findElement(proceedtocommerceuat);
	}
	public WebElement get_proceedtocommerceProd ()
	{
		return DriverManager.getDriver().findElement(proceedtocommerceProd );
	}
	
	public WebElement get_itemorder()
	{
		return DriverManager.getDriver().findElement(itemorder);
	}
	public WebElement get_username() {
		return DriverManager.getDriver().findElement(Username);
		
	}
	public WebElement get_gsadd()
	{
		return DriverManager.getDriver().findElement(gsadd);
	}
	public WebElement get_actionremove()
	{
		return DriverManager.getDriver().findElement(actionremove);
	}
	public WebElement get_Password() {
		return DriverManager.getDriver().findElement(Password);
		
	}
	public WebElement get_viu()
	{
		return DriverManager.getDriver().findElement(viu);
	}
	public WebElement get_ordertotal()
	{
		return DriverManager.getDriver().findElement(ordertotal);
	}
	public WebElement get_SignInBtn()
	{
		return DriverManager.getDriver().findElement(SignInBtn);
	}
	public WebElement get_submintcomment()
	{
		return DriverManager.getDriver().findElement(submintcomment);
	}
	public WebElement get_SalesBtn()
	{
		return DriverManager.getDriver().findElement(SalesBtn);
		
	}
	public WebElement get_OrdersBtn()
	{
		return DriverManager.getDriver().findElement(OrdersBtn);
		
	}
	public WebElement get_SearchBoxField()
	{
		return DriverManager.getDriver().findElement(SearchBoxField);
		
	
	}
	public WebElement get_intoclick()
	{
		return DriverManager.getDriver().findElement(intoclick);
	}
	public WebElement get_ViewBtn()
	{
		return DriverManager.getDriver().findElement(ViewBtn);
	}
	public WebElement get_information()
	{
		return DriverManager.getDriver().findElement(information);
	}
	public WebElement get_OrderPurchagepoint()
	{
		return DriverManager.getDriver().findElement(OrderPurchagepoint);
	}
/******************************************************************************************************/
	//public String getText(String ele,String ExcepectedText) 
	public String getText(String ele){
		String text = "";

		try {
			switch (ele) {
			case "Username":
				text = DriverManager.getDriver().findElement(Username).getText();
				break;
			case "orderconfirmstatus":
				text = DriverManager.getDriver().findElement(orderconfirmstatus).getText();
				break;
			case "Password":
				text = DriverManager.getDriver().findElement(Password).getText();
				break;
			case "SearchBoxField":
				text = DriverManager.getDriver().findElement(SearchBoxField).getText();
				break;
			case "OrderID":
				text = DriverManager.getDriver().findElement(OrderID).getText();
				break;
			case "OrderPurchagepoint":
				text = DriverManager.getDriver().findElement(OrderPurchagepoint).getText();
				break;
			case "OrderPurchaseDate":
				text = DriverManager.getDriver().findElement(OrderPurchaseDate).getText();
				break;
			case "OrderBilltoDate":
				text = DriverManager.getDriver().findElement(OrderBilltoDate).getText();
				break;
			case "OrderGrandTotalBase":
				text = DriverManager.getDriver().findElement(OrderGrandTotalBase).getText();
				break;
			case "OrderGrandTotalPurchased":
				text = DriverManager.getDriver().findElement(OrderGrandTotalPurchased).getText();
				break;
			case "OrderStatus":
				text = DriverManager.getDriver().findElement(OrderStatus).getText();
				break;
			case "OrderMobileNumber":
				text = DriverManager.getDriver().findElement(OrderMobileNumber).getText();
				break;
			case "OrderMSANumber":
				text = DriverManager.getDriver().findElement(OrderMSANumber).getText();
				break;
			case "OrderBrgy":
				text = DriverManager.getDriver().findElement(OrderBrgy).getText();
				break;
			case "OrderType":
				text = DriverManager.getDriver().findElement(OrderType).getText();
				break;
			case "OrdeTransac_OrderId":
				text = DriverManager.getDriver().findElement(OrdeTransac_OrderId).getText();
				break;
			case "orderdatevalue":
				text = DriverManager.getDriver().findElement(orderdatevalue).getText();
				break;
			case "orderstatusvalue":
				text = DriverManager.getDriver().findElement(orderstatusvalue).getText();
				break;
			case "purchagefromvalue":
				text = DriverManager.getDriver().findElement(purchagefromvalue).getText();
				break;
			case "customernameis":
				text = DriverManager.getDriver().findElement(customernameis).getText();
				break;
			case "emailid":
				text = DriverManager.getDriver().findElement(emailid).getText();
				break;
			case "customergroupname":
				text = DriverManager.getDriver().findElement(customergroupname).getText();
				break;
			case "billingaddressdetails":
				text = DriverManager.getDriver().findElement(billingaddressdetails).getText();
				break;
			case "shippingaddressdetails":
				text = DriverManager.getDriver().findElement(shippingaddressdetails).getText();
				break;
			case "productvalue":
				text = DriverManager.getDriver().findElement(productvalue).getText();
				break;
			case "productvaluSKU":
				text = DriverManager.getDriver().findElement(productvaluSKU).getText();
				break;
			case "itemstatusvalue":
				text = DriverManager.getDriver().findElement(itemstatusvalue).getText();
				break;
			case "originalpricevalue":
				text = DriverManager.getDriver().findElement(originalpricevalue).getText();
				break;
			case "pricevalue":
				text = DriverManager.getDriver().findElement(pricevalue).getText();
				break;
			case "qtyvalue":
				text = DriverManager.getDriver().findElement(qtyvalue).getText();
				break;
			case "subtotalvale":
				text = DriverManager.getDriver().findElement(subtotalvale).getText();
				break;
			case "taxamountvalue":
				text = DriverManager.getDriver().findElement(taxamountvalue).getText();
				break;
			case "taxpercentvalue":
				text = DriverManager.getDriver().findElement(taxpercentvalue).getText();
				break;
			case "discountamountvalue":
				text = DriverManager.getDriver().findElement(discountamountvalue).getText();
				break;
			case "rowtotalvalue":
				text = DriverManager.getDriver().findElement(rowtotalvalue).getText();
				break;
			case "validateidvalue":
				text = DriverManager.getDriver().findElement(validateidvalue).getText();
				break;
			case "ordertypevalue":
				text = DriverManager.getDriver().findElement(ordertypevalue).getText();
				break;
			case "subordertypevalue":
				text = DriverManager.getDriver().findElement(subordertypevalue).getText();
				break;
			case "qtyvalue1":
				text = DriverManager.getDriver().findElement(qtyvalue1).getText();
				break;
			case "planes":
				text = DriverManager.getDriver().findElement(planes).getText();
				break;
			case "palnename":
				text = DriverManager.getDriver().findElement(palnename).getText();
				break;
			case "itemstatus1":
				text = DriverManager.getDriver().findElement(itemstatus1).getText();
				break;
			case "originalprice1":
				text = DriverManager.getDriver().findElement(originalprice1).getText();
				break;
			case "pricevalue1":
				text = DriverManager.getDriver().findElement(pricevalue1).getText();
				break;
			case "qtyvalue2":
				text = DriverManager.getDriver().findElement(qtyvalue2).getText();
				break;
			case "device":
				text = DriverManager.getDriver().findElement(device).getText();
				break;
			case "deivename":
				text = DriverManager.getDriver().findElement(deivename).getText();
				break;
			case "devicestatus2":
				text = DriverManager.getDriver().findElement(devicestatus2).getText();
				break;
			case "deviceoroginalprice":
				text = DriverManager.getDriver().findElement(deviceoroginalprice).getText();
				break;
			case "deviceprice":
				text = DriverManager.getDriver().findElement(deviceprice).getText();
				break;
			case "qtyvalue3":
				text = DriverManager.getDriver().findElement(qtyvalue3).getText();
				break;
			case "myduoprice":
				text = DriverManager.getDriver().findElement(myduoprice).getText();
				break;
			case "myduo":
				text = DriverManager.getDriver().findElement(myduo).getText();
				break;
			case "addonduostatus":
				text = DriverManager.getDriver().findElement(addonduostatus).getText();
				break;
			case "addonpriceduo":
				text = DriverManager.getDriver().findElement(addonpriceduo).getText();
				break;
			case "duoqty":
				text = DriverManager.getDriver().findElement(duoqty).getText();
				break;
			case "viu":
				text = DriverManager.getDriver().findElement(viu).getText();
				break;
			case "viupricetitle":
				text = DriverManager.getDriver().findElement(viupricetitle).getText();
				break;
			case "viustatus":
				text = DriverManager.getDriver().findElement(viustatus).getText();
				break;
			case "viuprice":
				text = DriverManager.getDriver().findElement(viuprice).getText();
				break;
			case "viuqty":
				text = DriverManager.getDriver().findElement(viuqty).getText();
				break;
			case "APV":
				text = DriverManager.getDriver().findElement(APV).getText();
				break;
			case "APVpricetitle":
				text = DriverManager.getDriver().findElement(APVpricetitle).getText();
				break;
			case "APVstatus":
				text = DriverManager.getDriver().findElement(APVstatus).getText();
				break;
			case "APVprice":
				text = DriverManager.getDriver().findElement(APVprice).getText();
				break;
			case "APVqty":
				text = DriverManager.getDriver().findElement(APVqty).getText();
				break;
			case "spotify":
				text = DriverManager.getDriver().findElement(spotify).getText();
				break;
			case "spotifypricetitle":
				text = DriverManager.getDriver().findElement(spotifypricetitle).getText();
				break;
			case "spotifystatus":
				text = DriverManager.getDriver().findElement(spotifystatus).getText();
				break;
			case "spotifyprice":
				text = DriverManager.getDriver().findElement(spotifyprice).getText();
				break;
			case "spotifyqty":
				text = DriverManager.getDriver().findElement(spotifyqty).getText();
				break;
			case "easyroam":
				text = DriverManager.getDriver().findElement(easyroam).getText();
				break;
			case "easyroampricetitle":
				text = DriverManager.getDriver().findElement(easyroampricetitle).getText();
				break;
			case "easyroamstatus":
				text = DriverManager.getDriver().findElement(easyroamstatus).getText();
				break;
			case "easyroamprice":
				text = DriverManager.getDriver().findElement(easyroamprice).getText();
				break;
			case "easyroamqty":
				text = DriverManager.getDriver().findElement(easyroamqty).getText();
				break;
			case "gocallid":
				text = DriverManager.getDriver().findElement(gocallid).getText();
				break;
			case "gocallidpricetitle":
				text = DriverManager.getDriver().findElement(gocallidpricetitle).getText();
				break;
			case "gocallidstatus":
				text = DriverManager.getDriver().findElement(gocallidstatus).getText();
				break;
			case "gocallidprice":
				text = DriverManager.getDriver().findElement(gocallidprice).getText();
				break;
			case "gocallidqty":
				text = DriverManager.getDriver().findElement(gocallidqty).getText();
				break;
			case "gsadd":
				text = DriverManager.getDriver().findElement(gsadd).getText();
				break;
			case "gsaddpricetitle":
				text = DriverManager.getDriver().findElement(gsaddpricetitle).getText();
				break;
			case "gsaddstatus":
				text = DriverManager.getDriver().findElement(gsaddstatus).getText();
				break;
			case "gsaddprice":
				text = DriverManager.getDriver().findElement(gsaddprice).getText();
				break;
			case "gsaddqty":
				text = DriverManager.getDriver().findElement(gsaddqty).getText();
				break;
			case "gadget":
				text = DriverManager.getDriver().findElement(gadget).getText();
				break;
			case "gadgetpricetitle":
				text = DriverManager.getDriver().findElement(gadgetpricetitle).getText();
				break;
			case "gadgetstatus":
				text = DriverManager.getDriver().findElement(gadgetstatus).getText();
				break;
			case "gadgetprice":
				text = DriverManager.getDriver().findElement(gadgetprice).getText();
				break;
			case "gadgetqty":
				text = DriverManager.getDriver().findElement(gadgetqty).getText();
				break;
			case "subtotal2price":
				text = DriverManager.getDriver().findElement(subtotal2price).getText();
				break;
			case "shipinghandlingprice":
				text = DriverManager.getDriver().findElement(shipinghandlingprice).getText();
				break;
			case "pretermefeeprice":
				text = DriverManager.getDriver().findElement(pretermefeeprice).getText();
				break;
			case "overdueprice":
				text = DriverManager.getDriver().findElement(overdueprice).getText();
				break;
			case "taxvalue":
				text = DriverManager.getDriver().findElement(taxvalue).getText();
				break;
			case "grandttalprice":
				text = DriverManager.getDriver().findElement(grandttalprice).getText();
				break;
			case "totalpaidprice":
				text = DriverManager.getDriver().findElement(totalpaidprice).getText();
				break;
			case "totalrefoundprice":
				text = DriverManager.getDriver().findElement(totalrefoundprice).getText();
				break;
			case "totaldueprice":
				text = DriverManager.getDriver().findElement(totaldueprice).getText();
				break;
//			case "":
//				text = DriverManager.getDriver().findElement().getText();
//				break;
//				
			}
//			if(text.equalsIgnoreCase(ExcepectedText))
//			{
//				Generic.WriteTestData("", text, text, ele, ExcepectedText, text);
//			}
//			else
//				
//				Generic.WriteTestData("", text, text, ele, ExcepectedText, text);

	} catch (NoSuchElementException e) {
		System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
	} catch (Exception e) {
		System.out.println("Method : getText - Error : " + e.getMessage());
	}

	return text;
}
	/*************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element)
		{
		case "SignInBtn":
			flag = waitForElementClickable(SignInBtn, waitTime);
			break;
		case "actionremove":
			flag = waitForElementClickable(actionremove, waitTime);
			break;
		case "SalesBtn":
			flag = waitForElementClickable(SalesBtn, waitTime);
			break;
		case "OrdersBtn":
			flag = waitForElementClickable(OrdersBtn, waitTime);
			break;
		case "SearchBoxField":
			flag = waitForElementClickable(SearchBoxField, waitTime);
			break;
		case "ViewBtn":
			flag = waitForElementClickable(ViewBtn, waitTime);
			break;
		case "information":
			flag = waitForElementClickable(information, waitTime);
			break;
			
			
			
			
		}
//		if(flag)
//		{
//			//Generic.WriteTestData("", text, text, ele, ExcepectedText, text);
//		}
//		else
//			
//			//Generic.WriteTestData("", text, text, ele, ExcepectedText, text);

	
	return flag;
}
/**
 * @throws Exception ********************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;
		
		switch (element) {
		case "SignInBtn":
			flag = waitForElementVisibility(SignInBtn, waitTime);
			break;
		case "AdvancedBtn":
			flag = waitForElementVisibility(AdvancedBtn, waitTime);
			break;
			
		case "SalesBtn":
			flag = waitForElementVisibility(SalesBtn, waitTime);
			break;
		case "OrdersBtn":
			flag = waitForElementVisibility(OrdersBtn, waitTime);
			break;
		case "SearchBoxField":
			flag = waitForElementVisibility(SearchBoxField, waitTime);
			break;
		case "actionremove":
			flag = waitForElementVisibility(actionremove, waitTime);
			break;
		case "ID":
			flag = waitForElementVisibility(ID, waitTime);
			break;
		case "purchagepoint":
			flag = waitForElementVisibility(purchagepoint, waitTime);
			break;
		case "purchaseDate":
			flag = waitForElementVisibility(purchaseDate, waitTime);
			break;		
		case "billtoname":
			flag = waitForElementVisibility(billtoname, waitTime);
			break;		
		case "shiptoname":
			flag = waitForElementVisibility(shiptoname, waitTime);
			break;		
		case "grandtotalbase":
			flag = waitForElementVisibility(grandtotalbase, waitTime);
			break;		
		case "grandtootalppurchage":
			flag = waitForElementVisibility(grandtootalppurchage, waitTime);
			break;		
		case "status":
			flag = waitForElementVisibility(status, waitTime);
			break;		
		case "action":
			flag = waitForElementVisibility(action, waitTime);
			break;		
		case "allocatedsource":
			flag = waitForElementVisibility(allocatedsource, waitTime);
			break;		
		case "nameofrecipt":
			flag = waitForElementVisibility(nameofrecipt, waitTime);
			break;		
		case "coupencode":
			flag = waitForElementVisibility(coupencode, waitTime);
			break;		
		case "mobilenumber":
			flag = waitForElementVisibility(mobilenumber, waitTime);
			break;		
		case "msanumber":
			flag = waitForElementVisibility(msanumber, waitTime);
			break;			
		case "braintreetrns":
			flag = waitForElementVisibility(braintreetrns, waitTime);
			break;		
		case "barangy":
			flag = waitForElementVisibility(barangy, waitTime);
			break;
		case "ordertypehead":
			flag = waitForElementVisibility(ordertypehead, waitTime);
			break;
		case "tncdetails":
			flag = waitForElementVisibility(tncdetails, waitTime);
			break;
		case "ViewBtn":
			flag = waitForElementVisibility(ViewBtn, waitTime);
			break;
		case "backbutton":
			flag = waitForElementVisibility(backbutton, waitTime);
			break;
		case "loginascustomer":
			flag = waitForElementVisibility(loginascustomer, waitTime);
			break;
		case "reorder":
			flag = waitForElementVisibility(reorder, waitTime);
			break;		
		case "cancelbutton":
			flag = waitForElementVisibility(cancelbutton, waitTime);
			break;		
		case "hold":
			flag = waitForElementVisibility(hold, waitTime);
			break;		
		case "sendemail":
			flag = waitForElementVisibility(sendemail, waitTime);
			break;		
		case "invoice":
			flag = waitForElementVisibility(invoice, waitTime);
			break;
		
		case "ship":
			flag = waitForElementVisibility(ship, waitTime);
			break;		
		case "edit":
			flag = waitForElementVisibility(edit, waitTime);
			break;		
		case "orderview":
			flag = waitForElementVisibility(orderview, waitTime);
			break;		
		case "information":
			flag = waitForElementVisibility(information, waitTime);
			break;		
		case "orderaccountinfo":
			flag = waitForElementVisibility(orderaccountinfo, waitTime);
			break;
		case "orderconformationemail":
			flag = waitForElementVisibility(orderconformationemail, waitTime);
			break;
		case "orderdate":
			flag = waitForElementVisibility(orderdate, waitTime);
			break;
		case "orderstatus":
			flag = waitForElementVisibility(orderstatus, waitTime);
			break;
		case "purchagefrom":
			flag = waitForElementVisibility(purchagefrom, waitTime);
			break;
		case "accountinformation":
			flag = waitForElementVisibility(accountinformation, waitTime);
			break;
		case "cutomername":
			flag = waitForElementVisibility(cutomername, waitTime);
			break;
		case "email":
			flag = waitForElementVisibility(email, waitTime);
			break;
		case "custgroup":
			flag = waitForElementVisibility(custgroup, waitTime);
			break;
		case "editcustomer":
			flag = waitForElementVisibility(editcustomer, waitTime);
			break;
		case "addressinfo":
			flag = waitForElementVisibility(addressinfo, waitTime);
			break;
		case "billingaddress":
			flag = waitForElementVisibility(billingaddress, waitTime);
			break;
		case "editbillingaddress":
			flag = waitForElementVisibility(editbillingaddress, waitTime);
			break;
		case "shippingaddress":
			flag = waitForElementVisibility(shippingaddress, waitTime);
			break;
		case "editshipingaddress":
			flag = waitForElementVisibility(editshipingaddress, waitTime);
			break;
		case "payshippingmethod":
			flag = waitForElementVisibility(payshippingmethod, waitTime);
			break;
		case "payinfo":
			flag = waitForElementVisibility(payinfo, waitTime);
			break;
		case "paymentname":
			flag = waitForElementVisibility(paymentname, waitTime);
			break;
		case "orderusd":
			flag = waitForElementVisibility(orderusd, waitTime);
			break;
		case "handlinginfo":
			flag = waitForElementVisibility(handlinginfo, waitTime);
			break;
		case "sdelivery":
			flag = waitForElementVisibility(sdelivery, waitTime);
			break;
		case "validateinfo":
			flag = waitForElementVisibility(validateinfo, waitTime);
			break;
		case "validateid":
			flag = waitForElementVisibility(validateid, waitTime);
			break;
		case "ordertype":
			flag = waitForElementVisibility(ordertype, waitTime);
			break;
		case "subordertype":
			flag = waitForElementVisibility(subordertype, waitTime);
			break;
		case "qoutetype":
			flag = waitForElementVisibility(qoutetype, waitTime);
		   break;
		case "itemorder":
			flag = waitForElementVisibility(itemorder, waitTime);
			break;
		case "proudct":
			flag = waitForElementVisibility(proudct, waitTime);
		    break;
		case "itemstatus":
			flag = waitForElementVisibility(itemstatus, waitTime);
			break;
		case "originalprice":
			flag = waitForElementVisibility(originalprice, waitTime);
			 break;
		case "price":
			flag = waitForElementVisibility(price, waitTime);
			break;
		case "qty":
			flag = waitForElementVisibility(qty, waitTime);
		    break;
		case "subtotal":
			flag = waitForElementVisibility(subtotal, waitTime);
		     break;
		case "taxamount":
			flag = waitForElementVisibility(taxamount, waitTime);
		    break;
		case "taxpercent":
			flag = waitForElementVisibility(taxpercent, waitTime);
			 break;
		case "discountamount":
			flag = waitForElementVisibility(discountamount, waitTime);
			break;
		case "rowtotal":
			flag = waitForElementVisibility(rowtotal, waitTime);
			 break;
		case "ordertotal":
			flag = waitForElementVisibility(ordertotal, waitTime);
			 break;
		case "notes":
			flag = waitForElementVisibility(notes, waitTime);
			 break;
		case "statuscheck":
			flag = waitForElementVisibility(statuscheck, waitTime);
			 break;
		case "comment":
			flag = waitForElementVisibility(comment, waitTime);
			 break;
		case "commenttextare":
			flag = waitForElementVisibility(commenttextare, waitTime);
			 break;
		case "notificationbyemail":
			flag = waitForElementVisibility(notificationbyemail, waitTime);
			 break;
		case "visibleonstorefront":
			flag = waitForElementVisibility(visibleonstorefront, waitTime);
			 break;
		case "ordertotal2":
			flag = waitForElementVisibility(ordertotal2, waitTime);
			 break;
		case "subtotal2":
			flag = waitForElementVisibility(subtotal2, waitTime);
			 break;
		case "shipinghandling":
			flag = waitForElementVisibility(shipinghandling, waitTime);
			 break;
		case "pretermfee":
			flag = waitForElementVisibility(pretermfee, waitTime);
			 break;
		case "overdue":
			flag = waitForElementVisibility(overdue, waitTime);
			 break;
		case "grandtotal":
			flag = waitForElementVisibility(grandtotal, waitTime);
			 break;
		case "totalpaid":
			flag = waitForElementVisibility(totalpaid, waitTime);
			 break;
		case "totalrefounded":
			flag = waitForElementVisibility(totalrefounded, waitTime);
			 break;
		case "totaldue":
			flag = waitForElementVisibility(totaldue, waitTime);
			 break;
		case "tax":
			flag = waitForElementVisibility(tax, waitTime);
			 break;
		case "submintcomment":
			flag = waitForElementVisibility(submintcomment, waitTime);
			 break;
		case "proceedtocommerceProd":
			flag = waitForElementVisibility(proceedtocommerceProd, waitTime);
			 break;
			 
		
			
			
			
			
			
			
			



	
	
		}

		if (flag) {
			Generic.WriteTestData("Checking the Visibility ofelement - "+element+ " ", element, element, "element should be displayed"+element+"", "element is  displayed"+element+"", "Passed");
			
			System.out.println(message + " - exists");
		} else {
			Generic.WriteTestData("Checking the Visibility ofelement - "+message+ "", element, element, "element should be displayed"+element+"", "element is  not  displayed"+element+"", "Faild");
			System.out.println(message + " - do not exist");
		}

		return flag;
	}
/************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			case "SignInBtn":
				get_SignInBtn().click();
				break;
			case "SalesBtn":
				get_SalesBtn().click();
				break;
			case "actionremove":
				get_actionremove().click();
				break;
			case "OrdersBtn":
				get_OrdersBtn().click();
				break;
			case "SearchBoxField":
				get_SearchBoxField().click();
				break;
			case "ViewBtn":
				get_ViewBtn().click();
				break;
			case "information":
				get_information().click();
				break;
			case "intoclick":
				get_intoclick().click();
				break;
				

	
			
			}
			
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + eleName + " : " + "Element is not clickable : " + e1.getMessage());
			AssertJUnit.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + eleName + " : " + "Element not found : " + e2.getMessage());
			AssertJUnit.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + eleName + " : " + "Exception : " + e.getMessage());
			AssertJUnit.assertTrue(false);
		}

		System.out.println("Clicked on " + type + " : " + eleName);
	}

	/********************************************************************************************************************************/
	public String getAttributeValue(String ele, String attribute) {
		String text = "";

		try {
			switch (ele) {
			case "SearchBoxField":
				text = DriverManager.getDriver().findElement(SearchBoxField).getAttribute(attribute);
				break;
	
			}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
		}

		return text;
	}
     //****************************************************************************************************//
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {

		}	

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}
	public boolean equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	/********************************************************************************************************************************/
	
	



}
