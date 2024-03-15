package com.pages.Buyload;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class PayPage extends BasePage {
	By paybreadcrum =By.xpath("//span[normalize-space(text())='Pay']");
	By subtext=By.xpath("//p[normalize-space(text())='Ano ang gusto mong gamitin pambayad?']");
	By Gcash=By.xpath("//p[normalize-space(text())='GCash']");
	By gcashimg=By.xpath("//img[@src='/globe-online-assets/media/buyload-gcash.png']");
	By creditimg=By.xpath("//img[@src='/globe-online-assets/media/buyload-debit.png']");
	By creditcard=By.xpath("//p[normalize-space(text())='Credit/Debit Card']");
	By amounttopay=By.xpath("//b[normalize-space(text())='Amount to Pay']");
	By load=By.xpath("//p[@class='loadFor']");
	By loadamount=By.xpath("//p[@class='loadFor']//following::p[1]");
	By total=By.xpath("//p[@class='loadFor']//following::p[2]");
	By totalamount=By.xpath("//p[@class='loadFor']//following::p[3]");
	By paybutton=By.xpath("//button[@id='bLoadPay']");
	
	public WebElement get_Gcash()
	{
		return DriverManager.getDriver().findElement(Gcash);
		
	}
	public WebElement get_creditcard()
	{
		return DriverManager.getDriver().findElement(creditcard);
		
	}
	public WebElement get_paybutton()
	{
		return DriverManager.getDriver().findElement(paybutton);
		
	}
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		case "paybreadcrum":
			flag = waitForElementVisibility(paybreadcrum, waitTime);
			break;
		case "subtext":
			flag = waitForElementVisibility(subtext, waitTime);
			break;
		case "Gcash":
			flag = waitForElementVisibility(Gcash, waitTime);
			break;
		case "gcashimg":
			flag = waitForElementVisibility(gcashimg, waitTime);
			break;			
			
		case "creditimg":
			flag = waitForElementVisibility(creditimg, waitTime);
			break;
		case "creditcard":
			flag = waitForElementVisibility(creditcard, waitTime);
			break;
		case "amounttopay":
			flag = waitForElementVisibility(amounttopay, waitTime);
			break;
		case "load":
			flag = waitForElementVisibility(load, waitTime);
			break;
		case "loadamount":
			flag = waitForElementVisibility(loadamount, waitTime);
			break;
		case "total":
			flag = waitForElementVisibility(total, waitTime);
			break;
		case "totalamount":
			flag = waitForElementVisibility(totalamount, waitTime);
			break;
		case "paybutton":
			flag = waitForElementVisibility(paybutton, waitTime);
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
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;
		switch (element) {
	
		case "Gcash":
			flag = waitForElementClickable(Gcash, waitTime);
			break;
		case "creditcard":
			flag = waitForElementClickable(creditcard, waitTime);
			break;	
		case "paybutton":
			flag = waitForElementClickable(paybutton, waitTime);
			break;
		}

		return flag;
	}
	public void js_clickOnElement(String type, String eleName, String ele) throws Exception {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            
			
			switch (ele) {
			case "Gcash":
				js.executeScript("arguments[0].click();", get_Gcash());
				break;
			case "creditcard":
				js.executeScript("arguments[0].click();", get_creditcard());
				break;			
			case "paybutton":
				js.executeScript("arguments[0].click();", get_paybutton());
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




	
	

}
