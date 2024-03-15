package globeOnline_Magento;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.magento.MagentoPage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.*;

public class Magento extends SetDriver {

	private MagentoCommonMethods common = new MagentoCommonMethods();
	private MagentoPage MP =new MagentoPage();
	public static WebDriver Driver=DriverManager.getDriver();
	public String OrderID="000009084";
			

	@Test
	public void MagentoScenario() throws Exception {
		Generic.TestScriptStart("Megento");
		Generic.WriteTestCase("validating Magento", "user should be able to  validate order details in magento ", "ExpectedResult","ActualResult");
//		JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
//		jse.executeScript("lambda-name=Magento");

		System.out.println("Magento Scenario");
		DriverManager.getDriver().get("https://commerce.globetel.com/globestore/");
//		assertTrue(DriverManager.getDriver().getTitle().contains("Privecy error"));

		
//		if(MP.isElementExist("AdvancedBtn", "AdvancedBtn", 10)){
//	        JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
//			js2.executeScript("arguments[0].click();", MP.get_AdvancedBtn());
//		}
		
//		common.Proceed();   
        
		// Login into Magento
		        
		common.logintoMagento();
		
		common.magentoDasahboard();
		
		//String OrderID=util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
		common.Orderpage(OrderID);
		
		common.orderpagevalidationheader();
		
		common.Validate_orderpage_values();
		
		common.click_view();
		
		common.Order_andAccountvalidation();
		
		
		common.validate_billing_shipping_address();
		
//		common.validateinformation();
	
//		common.itemorder_validation("No","No","No","No","No","No","No","No");
		
		common.ordertotalvalidation();
		
		common.submitexist();

		System.out.println("!!! Execution Completed for " + this.getClass().getName() + " !!!");
		
		Generic.TestScriptEnds();
	}

//	@AfterClass
//	public void tearDown() throws Exception {
//		if (DriverManager.getDriver() != null) {
//			((JavascriptExecutor) DriverManager.getDriver()).executeScript("lambda-status=" + Status);
//			DriverManager.getDriver().quit();
//		}
//
//	}

}
