package globeonline_buyload;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;
import utility.Generic;

public class BuyLoad extends SetDriver {
	private static BuyLoad BuyLoadScenario = new BuyLoad();
	private util util = new util();
	private Buyloadcommonmethods common = new Buyloadcommonmethods();

	
	
	private String Status = "failed";

	@Test
	public void BuyloadScenario() throws Exception {

		if(Constant.Runin.equalsIgnoreCase("Lambda1"))
		{
			JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
			jse.executeScript("lambda-name=ADA3");
		}

		Generic.TestScriptStart("GO-BuyLoad");

		Generic.WriteTestCase("Validate if user is able to able to place an BuyLoad order","User should be able to place BuyLoad order", "ExpectedResult", "ActualResult");
		
		// User access URL
		common.openApplication();
		
		//Accept Cookies
		common.IacceptClick();
		
		//Redirecting to BuyLoad Landing Page
//		common.NavigateTo_BuyLoad();
		common.NavigateTo_BuyLoad_Mobile();
		
		//Testdata entering
        common.ProcessingwithBuyLoad("09050415665","20");
        
        common.paymentpageValidation("creditcard");
        common.clickpaybutton();
        common.enteringVisaMasterCardDetails("4508750015741019","01 / 39","100");
        Thread.sleep(60000);
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
