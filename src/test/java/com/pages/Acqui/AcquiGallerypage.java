package com.pages.Acqui;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.BasePage;
import utility.Generic;




public class AcquiGallerypage extends BasePage{
	
	
	By FilterBtn = By.xpath("//h2[contains(text(), ' Filters ')]");

	By ProdTypeBtn = By.xpath("//span[contains(text(), 'Product type')]");

	By PlanValueBtn = By.xpath("//span[contains(text(), 'Plan Value')]");
	By BrandBtn = By.xpath("//span[contains(text(), 'Brand')]");
	By FeaturedBtn = By.xpath("//span[contains(text(), 'Featured Products')]");
	By ClearFilterBtn = By.xpath("//span[contains(text(), 'Clear filters')]");
	By ApplyFilterBtn = By.xpath("//button[contains(text(), ' Apply Filter ')]");
	By SearchField = By.xpath("//input[@placeholder='Search by brand, model, feature, plan value']");
	By SortByList = By.xpath("//select[@name='sort']");
	
	By DeviceFound = By.xpath("//p[contains(normalize-space(text()),'1 device(s) found')]");
	By ProdName = By.xpath("//h2[contains(text(), 'Samsung Galaxy S21 Plus 5G')]");
	By ProdIdentifier = By.xpath("//span[@class='go_tag go_text-preamble-chip ng-star-inserted']");
	By ProdImg = By.xpath("//img[@class='go_device-image']");
	By ProdColor = By.xpath("//div[@class='go_card-row go_color-palette-block']");
	By ProdStorage = By.xpath("//span[@class='go_selection-value']");
	By ProdCashout = By.xpath("//span[@class='go_text-small-bold-content']");
	By ProdCashoutValue = By.xpath("//div[contains(text(), ' GPlan 1499 with Device ')] ");
	
	By ProdStockAvailability = By.xpath("//div[@class='go_card-row go_status-block']/span");
	
	By ProdApplywithDevice = By.xpath("//a[normalize-space(text())='Apply with this device']");
	By BackToTopBtn   = By.xpath("//div[@class='back-to-top-btn']");
	
	
   //selecting the planvalue	
	By Planvalue = By.xpath("//span[text()='Plan Value']");	
	By Planvale_dropdownbtn = By.xpath("(//span[@class='go_filter-dropdown-icon'])[3]");//preprod
	By plan2499 = By.xpath("//h2[contains(text(),'2499')]");	
	By Applybutton = By.xpath("//button[contains(text(),' Apply Filter ')]");	

   //selecting the plan value 1499
	By plan1499 = By.xpath("//h2[contains(text(),'1499')]");
	By magnifybutton = By.xpath("//div[@class='go_card-zoom']");
	By ApplyWithThisDevice = By.xpath("//button[text()='Apply with this device']");
	By Colour = By.xpath("(//input[@class='go_color-radio'])[1]");
	By plane1799=By.xpath("//h2[contains(text(),'1799')]");
	
	By Filters = By.xpath("//h2[text()=' Filters ']");
	By planValue = By.xpath("//span[contains(text(), 'Plan Value')]");
	
	
	

	
	//selecting the plan value 1499
	By search_field = By.xpath("//input[@placeholder='Search by brand, model, feature, plan value']");
	By applyFilter_Button = By.xpath("//button[text()=' Apply Filter ']");
	By colours = By.xpath("//input[@class='go_color-radio']");
	By cashoutAmountinGalleryPage = By.xpath("//span[text()='Cashout']//following-sibling::div//span");
	By ForReservation = By.xpath("(//span[text()=' For reservation '])[1]");
	By ForReservationButton = By.xpath("//a[text()=' Reserve this device ']");


 
	
	//preorder clours
	By devicegreyclour=By.xpath("//input[@id='new-radio00']");
	By deviceorange=By.xpath("//input[@id='new-radio01']");
	By deviceblueclour=By.xpath("//input[@id='new-radio02']");
	
	
	By clours=By.xpath("//input[@class='go_color-radio']");
	By preorderavilable=By.xpath("//span[text()=' Available for Pre-order']");
	
	
	//selecting the plan value 1499
	By plan1999 = By.xpath("//h2[contains(text(),'1999')]");
	By plan599 = By.xpath("//h2[contains(text(),'599')]");
	By cashoutamount=By.xpath("//span[text()='Cashout']//following-sibling::div//span");
	By avilableforpreorder=By.xpath("//span[@class='go_availability-status go_text-small-regular-content ng-star-inserted']");
	


	
	/********************************************************************************************************************************/
	public WebElement get_magnifybutton() {
		return DriverManager.getDriver().findElement(magnifybutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_Applybutton() {
		return DriverManager.getDriver().findElement(Applybutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_plan1499() {
		return DriverManager.getDriver().findElement(plan1499);
	}
	
	public WebElement get_BackToTopBtn() {
		return DriverManager.getDriver().findElement(BackToTopBtn);
	}

	/********************************************************************************************************************************/
	public WebElement get_plan2499() {
		return DriverManager.getDriver().findElement(plan2499);
	}
	/********************************************************************************************************************************/
	public WebElement get_Planvale_dropdownbtn() {
		return DriverManager.getDriver().findElement(Planvale_dropdownbtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_DeviceFound() {
		return DriverManager.getDriver().findElement(DeviceFound);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProdName() {
		return DriverManager.getDriver().findElement(ProdName);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProdIdentifier() {
		return DriverManager.getDriver().findElement(ProdIdentifier);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProdCashout() {
		return DriverManager.getDriver().findElement(ProdCashout);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_ProdCashoutValue() {
			return DriverManager.getDriver().findElement(ProdCashoutValue);
		}
		/********************************************************************************************************************************/
	public WebElement get_ProdStockAvailability() {
		return DriverManager.getDriver().findElement(ProdStockAvailability);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProdApplywithDevice() {
		return DriverManager.getDriver().findElement(ProdApplywithDevice);
	}
	/********************************************************************************************************************************/
	public WebElement get_SearchField() {
		return DriverManager.getDriver().findElement(SearchField);
	}
	/********************************************************************************************************************************/
	public WebElement get_ApplyWithThisDevice() {
		return DriverManager.getDriver().findElement(ApplyWithThisDevice);
	}
	/********************************************************************************************************************************/
	public WebElement get_Colour() {
		return DriverManager.getDriver().findElement(Colour);
	}
	/********************************************************************************************************************************/
	public WebElement get_plane1799()
	{
		return DriverManager.getDriver().findElement(plane1799);
	}
	/********************************************************************************************************************************/
	
	
	
	//Change
	
	
	/********************************************************************************************************************************/
	public WebElement get_ForReservation() {
		return DriverManager.getDriver().findElement(ForReservation);
	}
	/********************************************************************************************************************************/
	public List<WebElement> get_colours() {
		return DriverManager.getDriver().findElements(colours);
	}
	/********************************************************************************************************************************/
	public WebElement get_planValue() {
		return DriverManager.getDriver().findElement(planValue);
	}
	/********************************************************************************************************************************/
	public WebElement get_search_field() {
		return DriverManager.getDriver().findElement(search_field);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_applyFilter_Button() {
		return DriverManager.getDriver().findElement(applyFilter_Button);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_cashoutAmountinGalleryPage() {
		return DriverManager.getDriver().findElement(cashoutAmountinGalleryPage);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_ForReservationButton() {
		return DriverManager.getDriver().findElement(ForReservationButton);
	}
	
	/********************************************************************************************************************************/

	public WebElement get_cashoutamount()
	{
		return DriverManager.getDriver().findElement(cashoutamount);
	}
	/********************************************************************************************************************************/
	public WebElement get_plan1999() {
		return DriverManager.getDriver().findElement(plan1999);
	}
	public WebElement get_plan599() {
		return DriverManager.getDriver().findElement(plan599);
	}

	public List<WebElement> get_clours()
	{
		return DriverManager.getDriver().findElements(clours);
		
	}
	
	public WebElement get_preorderavilable()
	{
		return DriverManager.getDriver().findElement(preorderavilable);
		
	}
	/**
	 * @throws Exception ******************************************************************************************************************************/
	
	
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		
		boolean flag = false;
		
		switch (element) {
		case "FilterBtn":
			flag = waitForElementVisibility(FilterBtn, waitTime);
			break;
		case "Planvalue":
			flag = waitForElementVisibility(Planvalue, waitTime);
			break;
			
		case "ProdTypeBtn":
			flag = waitForElementVisibility(ProdTypeBtn, waitTime);
			break;
	
		case "PlanValueBtn":
			flag = waitForElementVisibility(PlanValueBtn, waitTime);
			break;

		case "BrandBtn":
			flag = waitForElementVisibility(BrandBtn, waitTime);
			break;
		case "BackToTopBtn":
			flag = waitForElementVisibility(BackToTopBtn, waitTime);
			break;
		
		case "FeaturedBtn":
			flag = waitForElementVisibility(FeaturedBtn, waitTime);
			break;
		
		case "ClearFilterBtn":
			flag = waitForElementVisibility(ClearFilterBtn, waitTime);
			break;
				
		case "ApplyFilterBtn":
			flag = waitForElementVisibility(ApplyFilterBtn, waitTime);
			break;
				
		case "SearchField":
			flag = waitForElementVisibility(SearchField, waitTime);
			break;
			
		case "SortByList":
			flag = waitForElementVisibility(SortByList, waitTime);
			break;	
		case "DeviceFound":
			flag = waitForElementVisibility(DeviceFound, waitTime);
			break;	
		case "ProdName":
			flag = waitForElementVisibility(ProdName, waitTime);
			break;
			case "ProdIdentifier":
			flag = waitForElementVisibility(ProdIdentifier, waitTime);
			break;		
		case "ProdImg":
			flag = waitForElementVisibility(ProdImg, waitTime);
			break;
		case "ProdColor":
			flag = waitForElementVisibility(ProdColor, waitTime);
			break;
		case "ProdStorage":
			flag = waitForElementVisibility(ProdStorage, waitTime);
			break;
		case "ProdCashout":
			flag = waitForElementVisibility(ProdCashout, waitTime);
			break;	
		case "ProdCashoutValue":
			flag = waitForElementVisibility(ProdCashoutValue, waitTime);
			break;
		case "ProdStockAvailability":
			flag = waitForElementVisibility(ProdStockAvailability, waitTime);
			break;
		case "ProdApplywithDevice":
			flag = waitForElementVisibility(ProdApplywithDevice, waitTime);
			break;
		case "ApplyWithThisDevice":
			flag = waitForElementVisibility(ApplyWithThisDevice, waitTime);
			break;	
		case "Applybutton":
			flag = waitForElementVisibility(Applybutton, waitTime);
			break;	
			
			
		//Change
			
		case "ForReservation":
			flag = waitForElementVisibility(ForReservation, waitTime);
			break;	
		case "search_field":
			flag = waitForElementVisibility(search_field, waitTime);
			break;
		case "cashoutAmountinGalleryPage":
			flag = waitForElementVisibility(cashoutAmountinGalleryPage, waitTime);
			break;	
		case "Filters":
			flag = waitForElementVisibility(Filters, waitTime);
			break;					
}
			

		if (flag) {
			System.out.println(message + " - exists");
            Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");    
		} else {
			System.out.println(message + " - do not exist");
            Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should not visible on the Application","'"+element+"' is visbile on the page","Failed");    
		}

		return flag;
	}
	
	public void moveToElement(String element) throws Exception {

		WebElement ele = null;

		switch (element) {
		case "Colour":
			ele = DriverManager.getDriver().findElement(Colour);
			break;
		}	

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
		Generic.WriteTestData("Hover on '"+element+"'",element,"","Able to Hover on '"+element+"' button.","Hovered on '"+element+"' .","Passed");
	}
	
	
	public void enterText(String type, String ele, String value) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


			switch (ele) {	
			 case "SearchField":
				get_SearchField().sendKeys(value);;
				break;
			}
			
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + ele + " : " + "Element is not clickable : " + e1.getMessage());
			Generic.WriteTestData("Entering text '"+value+"' in '"+ele+"' text field",ele,value,"Unable to identify the '"+ele+"' text field","Not able to identify the  '"+ele+"' text field","Failed");
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + ele + " : " + "Element not found : " + e2.getMessage());
			Generic.WriteTestData("Entering text '"+value+"' in '"+ele+"' text field",ele,value,"Unable to identify the '"+ele+"' text field","Not able to identify the  '"+ele+"' text field","Failed");
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + ele + " : " + "Exception : " + e.getMessage());
			Generic.WriteTestData("Entering text '"+value+"' in '"+ele+"' text field",ele,value,"Unable to identify the '"+ele+"' text field","Not able to identify the  '"+ele+"' text field","Failed");
			Assert.assertTrue(false);
		}
		Generic.WriteTestData("Entering text '"+value+"' in '"+ele+"' text field",ele,value,"Should able to enter data'"+value+"' into  '"+ele+"' text field","Entered data'"+value+"' into  '"+ele+"' text field successfully","Passed");
	}	
// *******************************************************************************************************************************
	
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "ProdApplywithDevice":
			flag = waitForElementClickable(ProdApplywithDevice, waitTime);
			break;
		case "Planvale_dropdownbtn":
			flag = waitForElementClickable(Planvale_dropdownbtn, waitTime);
			break;	
		case "magnifybutton":
			flag = waitForElementClickable(magnifybutton, waitTime);
			break;
		case "applyFilter_Button":
			flag = waitForElementClickable(applyFilter_Button, waitTime);
			break;
		case "SearchField":
			flag = waitForElementClickable(SearchField, waitTime);
			break;
		}
		return flag;
	}
	// *******************************************************************************************************************************
	
	public void clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			switch (ele) {
			
			case "ProdApplywithDevice":
				get_ProdApplywithDevice().click();
				break;
			case "Planvale_dropdownbtn":
				get_Planvale_dropdownbtn().click();
				break;
			case "plan1499":
				get_plan1499().click();
				break;		
			case "plan2499":
				get_plan2499().click();
				break;
			case "Applybutton":
				get_Applybutton().click();
				break;
			case "ApplyWithThisDevice":
				get_ApplyWithThisDevice().click();
				break;	
			case "Colour":
				get_Colour().click();
				break;	
				
			//Change
			case "planValue":
				get_planValue().click();
				break;	
			case "applyFilter_Button":
				get_applyFilter_Button().click();
				break;
			case "ForReservationButton":
				get_ForReservationButton().click();
				break;
			case "magnifybutton":
				get_magnifybutton().click();
				break;		
			case "plane1799":
				get_plane1799().click();
				break;
			case "plan599":
				get_plan599().click();
				break;
			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + eleName + " : " + "Element is not clickable : " + e1.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + eleName + " : " + "Element not found : " + e2.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + eleName + " : " + "Exception : " + e.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + type + " : " + eleName);
		  Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicked on '"+ele+"' button.","Passed");	
	}
	
	public void jsClick(String message, String element) throws Exception {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "ForReservationButton":
		         jse.executeScript("arguments[0].click();", get_ForReservationButton());		
		         break;
			case "magnifybutton":
		         jse.executeScript("arguments[0].click();", get_magnifybutton());		
		         break;
			case "ProdApplywithDevice":
		         jse.executeScript("arguments[0].click();", get_ProdApplywithDevice());		
		         break;
			case "Applybutton":
		         jse.executeScript("arguments[0].click();", get_Applybutton());		
		         break;
			 }
		
		 
		} catch (ElementClickInterceptedException e1) {
			System.out.println( " : " + element + " : " + "Element is not clickable : " + e1.getMessage());
			 Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println( " : " + element + " : " + "Element not found : " + e2.getMessage());
			 Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println( " : " + element + " : " + "Exception : " + e.getMessage());
			 Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicking on '"+element+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + " : " + element);	
		Generic.WriteTestData("Click on '"+element+"'",element,"","Able to click on '"+element+"' button.","Clicked on '"+element+"' button.","Passed");	
		
	}




}

