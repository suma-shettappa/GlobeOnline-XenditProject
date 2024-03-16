package com.pages.Buyload;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import globeOnline_CommonMethods.BasePage;

import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;
import utility.Generic;

public class BuyLoadLandingPage extends BasePage {
	
	
	//Scripting By Lavanya
	By MenuBtn =  By.xpath("//img[@class='menu']");
	By QuickLinks_Link_Mobile = By.xpath("(//a[normalize-space(text())='Quick Links'])[2]//following::img[@alt='collapse']");
	By QuickLinks_Link = By.xpath("//a[normalize-space(text())='Quick Links'] | (//a[normalize-space(text())='Quick Links'])[2]//following::img[@alt='collapse']");
	By BuyLoad_Link = By.xpath("//a[normalize-space(text())='Buy Load']");
	By link_TrackMyOrder = By.xpath("//form[contains(@class,'menu-bar-height')] | //a[normalize-space(text())='Track my order']");
    By MobileNumber_Field  = By.xpath("//input[@type='tel']");
    By Iload_Text    =By.xpath("//h2[contains(@class,'bLoadPD')]");
    By Magkano_text  = By.xpath("//p[contains(@class,'bLoadSD')]"); 
    By NextButton   = By.xpath("//button[normalize-space(text())='Next']");
    By GlobePrepaidBuyLoadFlex  =  By.xpath("//p[normalize-space(text())='Globe Prepaid']//following-sibling::div[@class='bLoadFlex']");
    By TMBuyLoadFlex   =  By.xpath("//p[normalize-space(text())='TM']//following-sibling::div[@class='bLoadFlex']");
    By HomePrepaidWifiBuyloadFlex  = By.xpath("//p[normalize-space(text())='Home Prepaid WiFi']//following-sibling::div[@class='bLoadFlex']");
    By GlobesTermsCondition  = By.xpath("//a[contains(normalize-space(text()),'s Terms and Conditions')]");
    By Sa_iYoungText   = By.xpath("//p[normalize-space(text())='Sa iyong pag-confirm, sumasang-ayon ka sa']"); 
    By PrivacyPolicy  = By.xpath("//a[normalize-space(text())='Privacy Policy.']");
    
    
	/********************************************************************************************************************************/
	public WebElement get_QuickLinks_Link() {
		return DriverManager.getDriver().findElement(QuickLinks_Link);
	}
	
	public WebElement get_BuyLoad_Link() {
		return DriverManager.getDriver().findElement(BuyLoad_Link);
	}

	public WebElement get_MobileNumber_Field() {
		return DriverManager.getDriver().findElement(MobileNumber_Field);
	}
	
	public WebElement get_GlobePrepaidBuyLoadFlex() {
		return DriverManager.getDriver().findElement(GlobePrepaidBuyLoadFlex);
	}
	
	public WebElement get_TMBuyLoadFlex() {
		return DriverManager.getDriver().findElement(TMBuyLoadFlex);
	}

	public WebElement get_HomePrepaidWifiBuyloadFlex() {
		return DriverManager.getDriver().findElement(HomePrepaidWifiBuyloadFlex);
	}
	public WebElement get_link_TrackMyOrder() {
		return DriverManager.getDriver().findElement(link_TrackMyOrder);
	}
	public WebElement get_NextButton() {
		return DriverManager.getDriver().findElement(NextButton);
	}
	public WebElement get_MenuBtn() {
		return DriverManager.getDriver().findElement(MenuBtn);
	}
	public WebElement get_QuickLinks_Link_Mobile() {
		return DriverManager.getDriver().findElement(QuickLinks_Link_Mobile);
	}





	
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		case "QuickLinks_Link":
			flag = waitForElementVisibility(QuickLinks_Link, waitTime);
			break;
		case "BuyLoad_Link":
			flag = waitForElementVisibility(BuyLoad_Link, waitTime);
			break;
		case "MobileNumber_Field":
			flag = waitForElementVisibility(MobileNumber_Field, waitTime);
			break;	
		case "GlobePrepaidBuyLoadFlex":
			flag = waitForElementVisibility(GlobePrepaidBuyLoadFlex, waitTime);
			break;		
		case "TMBuyLoadFlex":
			flag = waitForElementVisibility(TMBuyLoadFlex, waitTime);
			break;		
		case "HomePrepaidWifiBuyloadFlex":
			flag = waitForElementVisibility(HomePrepaidWifiBuyloadFlex, waitTime);
			break;		
		case "Sa_iYoungText":
			flag = waitForElementVisibility(Sa_iYoungText, waitTime);
			break;		
		case "GlobesTermsCondition":
			flag = waitForElementVisibility(GlobesTermsCondition, waitTime);
			break;		
		case "PrivacyPolicy":
			flag = waitForElementVisibility(PrivacyPolicy, waitTime);
			break;
		case "NextButton":
			flag = waitForElementVisibility(NextButton, waitTime);
			break;	
		case "MenuBtn":
			flag = waitForElementVisibility(MenuBtn, waitTime);
			break;	
		case "QuickLinks_Link_Mobile":
			flag = waitForElementVisibility(QuickLinks_Link_Mobile, waitTime);
			break;		



		}
		if (flag) {
			//			ExtentTestManager.logInfo(message + " - exists");
			System.out.println(message + " - exists");
            Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should be visible on the Application","'"+element+"' is visbile on the page","Passed");    
		} else {
			//			ExtentTestManager.logFail(message + " - do not exists");
			System.out.println(message + " - do not exist");
            Generic.WriteTestData("Check visibility of locator '"+element+"' in Page ",element,"","'"+element+"' should not visible on the Application","'"+element+"' is visbile on the page","Failed");    
		}

		return flag;

	}
	
	
	public void moveToElement(String element) {
		
		WebElement ele = null;

		switch (element) {
		case "QuickLinks_Link":
			ele = DriverManager.getDriver().findElement(QuickLinks_Link);
			break;
		case "link_TrackMyOrder":
			ele = DriverManager.getDriver().findElement(link_TrackMyOrder);
			break;
		}
		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}	

	
	public void jsClick(String message, String element) {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "BuyLoad_Link":
		         jse.executeScript("arguments[0].click();", get_BuyLoad_Link());		
		         break;
			case "NextButton":
		         jse.executeScript("arguments[0].click();", get_NextButton());		
		         break;
			case "MenuBtn":
		         jse.executeScript("arguments[0].click();", get_MenuBtn());		
		         break;
			case "QuickLinks_Link_Mobile":
		         jse.executeScript("arguments[0].click();", get_QuickLinks_Link_Mobile());		
		         break;



			 }
		} catch (ElementClickInterceptedException e1) {
			System.out.println( " : " + element + " : " + "Element is not clickable : " + e1.getMessage());
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println( " : " + element + " : " + "Element not found : " + e2.getMessage());
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println( " : " + element + " : " + "Exception : " + e.getMessage());
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + " : " + element);	
		
	}
	
	public void enterText(String type, String ele, String value) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


			switch (ele) {	
			 case "MobileNumber_Field":
				 get_MobileNumber_Field().clear();
				 Thread.sleep(3000);
				 get_MobileNumber_Field().sendKeys(value);;
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





 	


}
