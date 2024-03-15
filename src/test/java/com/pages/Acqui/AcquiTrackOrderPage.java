package com.pages.Acqui;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.BasePage;
import utility.Generic;

public class AcquiTrackOrderPage extends BasePage {

	By referenceNumber = By.xpath("//input[@formcontrolname='referenceNumber']");
	By email = By.xpath("//input[@formcontrolname='email']");
	By btn_trackOrder = By.xpath("//button[text()=' Track order']");
	By trackOrderLink = By.xpath("//a[normalize-space(text())='Track my order']");
	By TrackMyorderLink = By.xpath("//button[text()=' Track my Order ']");
	
	


	/********************************************************************************************************************************/
	public WebElement get_referenceNumber() {
		return DriverManager.getDriver().findElement(referenceNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_email() {
		return DriverManager.getDriver().findElement(email);
	}

	/********************************************************************************************************************************/
	public WebElement get_btn_trackOrder() {
		return DriverManager.getDriver().findElement(btn_trackOrder);
	}
	/********************************************************************************************************************************/
	public WebElement get_trackOrderLink() {
		return DriverManager.getDriver().findElement(trackOrderLink);
	}
	public WebElement get_TrackMyorderLink() {
		return DriverManager.getDriver().findElement(TrackMyorderLink);
	}
	
	
	public void enterText(String type, String ele, String value) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

			
			switch (ele) {	
			 case "email":
				 get_email().clear();
				 get_email().sendKeys(value);;
				break;
			 case "referenceNumber":
				 get_referenceNumber().clear();
				 get_referenceNumber().sendKeys(value);;
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
		
	
    public void jsClick(String message, String ele) throws Exception {
		
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (ele) {
			case "trackOrderLink":
				jse.executeScript("arguments[0].click();", get_trackOrderLink());
				break;
			case "btn_trackOrder":
				jse.executeScript("arguments[0].click();", get_btn_trackOrder());
				break;
			case "TrackMyorderLink":
				jse.executeScript("arguments[0].click();", get_TrackMyorderLink());
				break;
			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println( " : " + ele + " : " + "Element is not clickable : " + e1.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println( " : " + ele + " : " + "Element not found : " + e2.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println( " : " + ele + " : " + "Exception : " + e.getMessage());
			 Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicking on '"+ele+"' button is unsuccessfull.","Failed");	
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + " : " + ele);
		Generic.WriteTestData("Click on '"+ele+"'",ele,"","Able to click on '"+ele+"' button.","Clicked on '"+ele+"' button.","Passed");	

		
	}

}
