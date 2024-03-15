package com.pages.renewal;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.BasePage;
import globeOnline_CommonMethods.DriverManager;
import utility.Generic;

public class Renewal_SuccessPage extends BasePage {
	
	
	
	By AddOns = By.xpath("//div[contains(text(),' Add ons ')]");
	By AmazonPrimeVideo = By.xpath("//div[contains(text(),'Amazon Prime Video')]  | //div[contains(text(),'Prime Video')]");
	By MySuperDuo = By.xpath("//div[contains(normalize-space(text()),'MySuperDuo')]");
	By Viupremium = By.xpath("//div[contains(text(),' Viu Premium ')]");
	By Spotifypremium = By.xpath("//div[contains(text(),' Spotify Premium ')]");
	By easyRoam = By.xpath("//div[contains(text(),' Easy Roam')]");
	By Gocallid199 = By.xpath("//div[contains(text(),' GOCALLIDD 199')]");
	By GSAdd = By.xpath("//div[contains(text(),'GS Add Surf 99')]");
	
	
	
	By Gplanwithdevice1799= By.xpath("//div[contains(text(), 'Gplan with Device 1799')]");
	
	By surveyForm = By.xpath("//div[@id='feedback-block'] //div[@class='modal-box']");
	By txtSurveyShoppingExperience = By.xpath("//h2[contains(text(),'shopping experience?')]");
	By surveyText1 = By.xpath("//h2[contains(text(),'shopping experience?')]/../p");
	By txtSurveyRecommend = By.xpath("//h2[contains(text(),'are you to recommend Globe to others?')]");
	By surveyText2 = By.xpath("//h2[contains(text(),'are you to recommend Globe to others?')]/../p");
	By Emoji_ShoppingExp = By.xpath(
			"//h2[contains(text(),'shopping experience?')]/.. //ul[@class='rating'] //li[contains(@id,'rating-icon')]");
	By Emoji_Recommendation = By.xpath(
			"//h2[contains(text(),'are you to recommend Globe to others?')]/.. //ul[@class='rating'] //li[contains(@id,'rating-icon')]");
	By feedbackTextAread1 = By.xpath("//textarea[@id='feedback-block-feedback-1']");
	By feedbackTextAread2 = By.xpath("//textarea[@id='feedback-block-feedback-2']");
	By submitSurvey = By.xpath("//span[@id='rater-button']");
	By imgFeedbackSuccess = By.xpath("//div[@class='success-image']");
	By txtFeedbackSuccess_1 = By.xpath("//div[@class='success-image']/../h1");
	By txtFeedbackSuccess_2 = By.xpath("//div[@class='success-image']/../p");
	By btnClose = By.xpath("//span[@class='close-button']");
	By PurchaseSummary=By.xpath("//span[text()='Purchase Summary']");


	By copyOrderID = By.xpath("//div[@class='row ng-star-inserted'] | //div[@class='reference-img']");

	By linkTrackOrder = By.xpath("//a[text()=' Track my order ']");
	By printIcon = By.xpath("//div[@class='print-icon']");
	By copyRefrerenceNoSuccessMsg = By.xpath("//div[text()='Reference number copied to clipboard!']");
	By shippingheader=By.xpath("//span[normalize-space(text())='Shipping Address']");
	By summaryShippingAddress = By.xpath("//div[@class='shipping-address']/../div[2]/span");
	By summaryAmtToPay = By.xpath("//span[text()='Amount to pay']/../following-sibling::div/span");
	By summaryProductCount = By.xpath("//div[@class='leftCard']");
	By summaryProductImage = By.xpath("//img[@class='globeImage1']");
	By summaryProductName = By.xpath("//div[@class='cardtitleheading']/following-sibling::div");
	By summaryDescription = By.xpath("//div[@class='description']");
	By summaryQuantity = By.xpath("//div[contains(@class,'unit-section')]/div/span");
	By summaryReminder1 = By.xpath("//div[contains(@class,'reminder-content')]/div/span");
	By summaryReminder2 = By.xpath("//div[contains(@class,'reminder-content')]/div[2]/p");
	By tryDifferentPayment = By.xpath("//button[@id='tryDifferentPaymentbtn']");
	By msgPurchaseDeclined = By.xpath("//span[text()='Sorry, your purchase was declined. ']");
	
	By paymentdeatilsheader=By.xpath("//span[normalize-space(text())='Payment Details']");
	By paymentdetailsamount=By.xpath("//span[normalize-space(text())='Payment Details']//following::span[1]");
	
	
	
	
	
	
	//Thankyou page 
	
	
		By Thankyoulabel = By.xpath("//h1[contains(text(),' Thank you! ')]");
		By Confirmlabel = By.xpath("//h1[contains(text(),'Confirm')]");
		By OrderRecieved = By.xpath("//h2[contains(text(),' Order received ')]");
	//	By OrderConfirmed = By.xpath("//h2[text()='Order confirmed']");

		By RefrcenumLabel = By.xpath("//div[contains(text(),'Reference number')]");
		By Referencenum = By.xpath("//div[contains(text(),'PRE')]");
		By copyicon = By.xpath("//img[@class='copy-icon']  | //span[@class='go_sc-order-success__copy-wrap']");
		By Itemsorderlabel = By.xpath("//div[contains(text(),' Item ordered ')]");
		

		
		By CheckEmailSPiel = By.xpath("//p[contains(text(), ' Please check your registered email address and phone for a confirmation message from us. ')]");
		By Trackmyorder = By.xpath("(//a[contains(text(),' Track my order ')])[1]");

		// SC4
		By OrderSummary=By.xpath("//span[text()='Order Summary']");
		By OrderReceived=By.xpath("//h2[contains(text(),'Pre-order received')]");
		By ForProcessingSpeil = By.xpath("//li[contains(text(),'For Processing')]");
		By ForProcessing = By.xpath("//h1[contains(text(),'For processing')]");
		By OrderConfirmed = By.xpath("//h2[contains(text(),'Order confirmed')] | //label[normalize-space(text())='Order confirmed']");
		//By PurchaseSummary = By.xpath("//span[contains(text(),'Purchase Summary')]");
		By ShippingAddress = By.xpath("//span[contains(text(),'Shipping Address')]");

		By ShippipingAdressSummary =  By.xpath("//div[@class='payment-method-value']/../div[2]/span");
		By Paymentmethod = By.xpath("//span[contains(text(),'PaymentMethod') or contains(text(),'Payment method')]");
		By MonthlyOB = By.xpath("//span[contains(text(),'Monthly amount will be charged-to-bill')]");
		By AmountPaid = By.xpath("//span[contains(text(),'Amount paid')]");
		By AmountPaidValue = By.xpath("//span[contains(text(),'₱ ')]");
		
		By Productname = By.xpath("//div[contains(text(),' GPlan SIM-Only All Data 2499 ')]");
		By PlanName=By.xpath("//div[@class='plan-name']");
		By PlanDetail=By.xpath("//div[@class='plan-Detail']");
		By PlanInclusions=By.xpath("//div[text()=' Plan inclusions ']");
		By Registredmail = By.xpath("//div[contains(text(), ' Please check your registered email address for your order confirmation. ')]");
		
		By Addons=By.xpath("//div[contains(text(), ' Add ons ')]");
		
		
		///new
		By orderconfirm=By.xpath("//label[contains(text(),'Order confirmed')]");
		By reference=By.xpath(" //span[normalize-space(text())='Reference No.'] | //span[contains(text(),' Reference No. ')]");
		By Orderid=By.xpath("//span[contains(text(),'PRE-')]");
		By msg=By.xpath("//h1[text()=' Success! ']");
		By plane=By.xpath("//div[text()=' GPlan 2499 with GCash ']");
		By allaccess=By.xpath("//span[text()='All-access data']");
		By gowifi=By.xpath("//span[text()='GoWifi access']");
		By call=By.xpath("//span[text()='Call and text']");
		By contractdur=By.xpath("//span[text()='Contract duration']");
		By gsadd=By.xpath("//div[text()='GS Add Surf 99']");
		By apv=By.xpath("//div[text()='Amazon Prime Video']");
		By viu=By.xpath("//div[text()='Viu Premium']");
		By duo=By.xpath("//div[text()='MyDuo']");
		By easy=By.xpath("//div[text()='Easy Roam']");
		By monthly=By.xpath("//span[text()=' Monthly bill ']");
		By monthlyvalue=By.xpath("//div[@class='go_total-bill-header']//span");
		By trackmyorder=By.xpath("(//button[text()=' Track my order '])[2]");
		
		By inclusion=By.xpath("//span[text()=' Inclusions ']");
		By personalsubscripation=By.xpath("//div[text()=' Free personal subscription ']");
		By threemonthssub=By.xpath("//div[text()=' 3-months subscription ']");
		By threemonthsvip=By.xpath("//div[text()=' 3 months standard VIP access ']");
		By premiumaccess=By.xpath("//div[text()=' 1 month Premium Access ']");
		By premembershipaccess=By.xpath("//div[text()=' 1 month Premium Membership ']");
		By addonsubscription=By.xpath("//span[text()=' Add-ons and subscriptions ']");
		
		By inclusioncrosal=By.xpath("//span[text()=' Inclusions ']//i");
		By addonsubscriptioncrosal=By.xpath("//span[text()=' Add-ons and subscriptions ']//i");
		
		By breakdown=By.xpath("//span[text()=' Show breakdown ']");
		By planetype=By.xpath("(//span[text()='GPlan 2499 with GCash'])");
		By planetype2=By.xpath("(//span[text()='GPlan 2499 with Device']");
		By planetypeamount=By.xpath("//div[@class='go_sc-rnp-bill__breakdown-item']//span[2]");
		By addon=By.xpath("(//span[text()='Add-ons'])");
		By addonsamount=By.xpath("//div[@class='go_sc-rnp-bill__breakdown-item ng-star-inserted']//span[2]");
		By gsaddsurf=By.xpath("(//span[text()='GS Add Surf 99'])");
		By gsaddamount=By.xpath("//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted']//span[2]");
		//By apv=By.xpath("(//span[text()='Amazon Prime Video'])");
		By apvamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[2]//span[2]");
		//By viu=By.xpath("(//span[text()='Viu Premium'])");
		By viuamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[3]//span[2]");
		By myduo=By.xpath("(//span[text()='MyDuo'])");
		By myduoamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[4]//span[2]");
		By easyroam=By.xpath("(//span[text()='Easy Roam'])");
		By easyroamamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-item go_sc-rnp-bill__addons-group ng-star-inserted'])[5]//span[2]");
		By Monthlybill=By.xpath("//span[text()='Monthly bill']");
		By monthlybillamount=By.xpath("(//div[@class='go_sc-rnp-bill__breakdown-footer'])//span[2]");
		
		By ordersummery=By.xpath("//span[normalize-space(text())='Order Summary']");
		By ordersummerytext=By.xpath("//span[normalize-space(text())='This is what your monthly bill will look like']");
		By ordersummeryamount=By.xpath("//span[normalize-space(text())='This is what your monthly bill will look like']//following::span[1]");
        By view1plantype=By.xpath("//span[normalize-space(text())='Hide breakdown']//following::span[1]");
        By view1planevalue=By.xpath("//span[normalize-space(text())='Hide breakdown']//following::span[2]");
        By view1totalvlaue=By.xpath("//span[normalize-space(text())='Hide breakdown']//following::span[4]");
        
		
		By ReferenceNo = By.xpath("//span[text()=' Reference No. ']//following-sibling::span[1]");
		By Success = By.xpath("//h1[text()=' Success! ']");
		
		By YourRenewalIsNowInProgress = By.xpath("//p[text()=' Your renewal is now in progress. Congratulations! ']");
		By planType = By.xpath("//div[text()=' GPlan 599 with Device ']");
		By deviceImg = By.xpath("//div[@class='go_sc-rnp-device-vw']//img | //img[@class='device-image']");
		By deviceName = By.xpath("//div[@class='go_sc-rnp-device-vw__details']//span[1]");
		By devicecolor_Data = By.xpath("//div[@class='go_sc-rnp-device-vw__details']//span[2]");
		By AllAccessData = By.xpath("//span[normalize-space(text())='All-access data']");
		By allacesssvalue=By.xpath("//span[normalize-space(text())='All-access data']//following::span[1]");
		By GoWifiAccess = By.xpath("//span[normalize-space(text())='GoWiFi access']");
		By gowifiacesssvalue=By.xpath("//span[normalize-space(text())='GoWiFi access']//following::span[1]");
		By CallAndText = By.xpath("//span[normalize-space(text())='Call and text']");
		By callandtextvalue=By.xpath("//span[normalize-space(text())='Call and text']//following::span[1]");
		By ContractDuration = By.xpath("//span[normalize-space(text())='Contract duration']");
		By contractdurationvalue=By.xpath("//span[normalize-space(text())='Contract duration']//following::span[1]");
		By Inclusions = By.xpath("//span[text()=' Inclusions ']");
		By KonsultaMD = By.xpath("//div[text()=' Free subscription to KonsultaMD ']");
		By ThreemonthVIPAccessToIQIYI = By.xpath("//div[text()=' 3-month VIP Access to iQIYI ']");
		By ThreemonthVIPAccessToWeTV = By.xpath("//div[text()=' 3-month VIP Access to weTV ']");
		By inclusionsChevron = By.xpath("(//i[@class='go_sc-icon-16 go_sc-icon:chevron'])[1]");
		By AddOnsAndSubscriptions = By.xpath("//span[text()=' Add-ons and subscriptions ']");
		By GSAddSurf = By.xpath("//div[text()='GS Add Surf 99']");
		
		By ViuPremium = By.xpath("//div[text()='Viu Premium']");
		
		By EasyRoam = By.xpath("//div[text()='Easy Roam']");
		By GOCALLIDD = By.xpath("//div[text()='GOCALLIDD 199']");
	
		By ShippingAddressDisplayed = By.xpath("//span[text()='Shipping Address']//following-sibling::span");
		By MonthlyBill = By.xpath("//span[normalize-space(text())='Monthly bill']");
		By ShowBreakdown = By.xpath("//span[normalize-space(text())='Show breakdown']");
		By Viewbreakdown=By.xpath("//span[normalize-space(text())='View breakdown']");
		
		By view2devicename=By.xpath("//span[normalize-space(text())='Hide breakdown']//following::span[1]");
		By devicecolor=By.xpath("//span[normalize-space(text())='Hide breakdown']//following::span[2]");
		By VIEW2DEVICEPROCE=By.xpath("//span[normalize-space(text())='Hide breakdown']//following::span[3]");
		
		By shippingfeeheader=By.xpath("//span[normalize-space(text())='Shipping fee']");
		By shippingfeetext=By.xpath("//span[normalize-space(text())='Shipping fee']//following::span[1]");
		By shippingamount=By.xpath("//span[normalize-space(text())='Shipping fee']//following::span[2]");
		By shippingtotalamountpaidheader=By.xpath("//span[normalize-space(text())='Shipping fee']//following::span[3]");
		By shiipingtotalamountvalue=By.xpath("//span[normalize-space(text())='Shipping fee']//following::span[4]");
		By onetimeheader=By.xpath("//a[normalize-space(text())='One time payment']");
		
		
		
		
		By MonthlyBillGenerated = By.xpath("//span[text()='Monthly bill']//following::span[1]");
		By WhatsNext = By.xpath("(//span[contains(normalize-space(text()), 'What')])[2]");
		By PleaseGiveUsTimeToProcessYourOrder = By.xpath("(//p[normalize-space(text())='Please give us time to process your order. We’ve sent the details to'])[2]");
		By TrackMyOrder = By.xpath("(//button[text()=' Track my order '])[2]");
		
		By planPrice = By.xpath("//div[@class='go_gpon-plan-details-title go_text-s-medium_v2 -go_bold -go_label']");
		
		
		
		
		By  Freepersonalsubscription  = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[1]");
		By  monthssubscription  = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[2]");
		By monthstandardVIPaccess = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[3]");
		By monthstandardVIPaccesss = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[4]");
		By  monthPremiumAccess  = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[5]");
		By monthPremiumMembership = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[6]");

		
		By   Unli1app   = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[1]");
		By   Unli5Gforsixmonths   = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[2]");
		By  GBstoPointsuptGBmonth  = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[3]");
		By  Freeindividualsubscription  = By.xpath("(//div[@class='go_inclusions-addons-list-title go_text-small_v2 -go_bold'])[4]");
		
		By  Inclusionaddons  = By.xpath("(//div[@class='go_inclusions-addons-list-header'])[1]");
		By  Inclusionaddons1  = By.xpath("(//div[@class='go_inclusions-addons-list-header'])[2]");
		By  Inclusionaddons2  = By.xpath("(//div[@class='go_inclusions-addons-list-header'])[3]");
		By  Inclusionaddons3  = By.xpath("(//div[@class='go_inclusions-addons-list-header'])[4]");
		By  Inclusionaddons4  = By.xpath("(//div[@class='go_inclusions-addons-list-header'])[5]");
		By  Inclusionaddons5  = By.xpath("(//div[@class='go_inclusions-addons-list-header'])[6]");	
		By  Inclusionaddons6  = By.xpath("(//div[@class='go_inclusions-addons-list-header'])[7]");	

		//////////////////////////////
		
		/********************************************************************************************************************************/
		public WebElement get_ReferenceNo() {
			return DriverManager.getDriver().findElement(ReferenceNo);
		}

		/********************************************************************************************************************************/
		public WebElement get_deviceName() {
			return DriverManager.getDriver().findElement(deviceName);
		}

		/********************************************************************************************************************************/
		public WebElement get_devicecolor_Data() {
			return DriverManager.getDriver().findElement(devicecolor_Data);
		}

		/********************************************************************************************************************************/
		public WebElement get_inclusionsChevron() {
			return DriverManager.getDriver().findElement(inclusionsChevron);
		}

		/********************************************************************************************************************************/
		public WebElement get_ShippingAddressDisplayed() {
			return DriverManager.getDriver().findElement(ShippingAddressDisplayed);
		}

		/********************************************************************************************************************************/
		public WebElement get_ShowBreakdown() {
			return DriverManager.getDriver().findElement(ShowBreakdown);
		}
		public WebElement get_Viewbreakdown() {
			return DriverManager.getDriver().findElement(Viewbreakdown);
		}


		/********************************************************************************************************************************/
		public WebElement get_MonthlyBillGenerated() {
			return DriverManager.getDriver().findElement(MonthlyBillGenerated);
		}
		public WebElement get_view2devicename() {
			return DriverManager.getDriver().findElement(view2devicename);
		}
		public WebElement get_paymentdeatilsheader() {
			return DriverManager.getDriver().findElement(paymentdeatilsheader);
		}


		public WebElement get_VIEW2DEVICEPROCE() {
			return DriverManager.getDriver().findElement(VIEW2DEVICEPROCE);
		}

		public WebElement get_shippingamount() {
			return DriverManager.getDriver().findElement(shippingamount);
		}

		public WebElement get_shiipingtotalamountvalue() {
			return DriverManager.getDriver().findElement(shiipingtotalamountvalue);
		}


		/********************************************************************************************************************************/
		public WebElement get_TrackMyOrder() {
			return DriverManager.getDriver().findElement(TrackMyOrder);
		}

		/********************************************************************************************************************************/
				
		/********************************************************************************************************************************/
		public WebElement get_Freepersonalsubscription() {
			return DriverManager.getDriver().findElement(Freepersonalsubscription);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Unli1app() {
			return DriverManager.getDriver().findElement(Unli1app);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Unli5Gforsixmonths() {
			return DriverManager.getDriver().findElement(Unli5Gforsixmonths);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_GBstoPointsuptGBmonth() {
			return DriverManager.getDriver().findElement(GBstoPointsuptGBmonth);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Freeindividualsubscription() {
			return DriverManager.getDriver().findElement(Freeindividualsubscription);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Inclusionaddons() {
			return DriverManager.getDriver().findElement(Inclusionaddons);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Inclusionaddons1() {
			return DriverManager.getDriver().findElement(Inclusionaddons1);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Inclusionaddons2() {
			return DriverManager.getDriver().findElement(Inclusionaddons2);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Inclusionaddons3() {
			return DriverManager.getDriver().findElement(Inclusionaddons3);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Inclusionaddons4() {
			return DriverManager.getDriver().findElement(Inclusionaddons4);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Inclusionaddons5() {
			return DriverManager.getDriver().findElement(Inclusionaddons5);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_Inclusionaddons6() {
			return DriverManager.getDriver().findElement(Inclusionaddons6);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_planPrice() {
			return DriverManager.getDriver().findElement(planPrice);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_monthssubscription() {
			return DriverManager.getDriver().findElement(monthssubscription);
			
		}
		
		/********************************************************************************************************************************/
		public WebElement get_monthstandardVIPaccesss() {
			return DriverManager.getDriver().findElement(monthstandardVIPaccesss);
			
		}

		/********************************************************************************************************************************/
		public WebElement get_monthstandardVIPaccess() {
			return DriverManager.getDriver().findElement(monthstandardVIPaccess);
			
		}
		

		/********************************************************************************************************************************/
		public WebElement get_monthPremiumAccess() {
			return DriverManager.getDriver().findElement(monthPremiumAccess);
			
		}
		/********************************************************************************************************************************/
		public WebElement get_monthPremiumMembership() {
			return DriverManager.getDriver().findElement(monthPremiumMembership);
			
		}
		
	/********************************************************************************************************************************/
		
		public WebElement get_PleaseGiveUsTimeToProcessYourOrder() {
			return DriverManager.getDriver().findElement(PleaseGiveUsTimeToProcessYourOrder);
			
		}
		
		/********************************************************************************************************************************/
		
		/********************************************************************************************************************************/

		
		
				
		
 
	/********************************************************************************************************************************/
		public WebElement get_breakdown()
		{
			return DriverManager.getDriver().findElement(breakdown);
		}
		public WebElement get_trackmyorder()
		{
			return DriverManager.getDriver().findElement(trackmyorder);
		}
		public WebElement get_inclusioncrosal() {
			return DriverManager.getDriver().findElement(inclusioncrosal);
		}
		public WebElement get_addonsubscriptioncrosal() {
			return DriverManager.getDriver().findElement(addonsubscriptioncrosal);
		}
		public WebElement get_txt_shoppingExperience() {
		return DriverManager.getDriver().findElement(txtSurveyShoppingExperience);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_recommendGlobe() {
		return DriverManager.getDriver().findElement(txtSurveyRecommend);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_shopExperience_feedback_() {
		return DriverManager.getDriver().findElement(surveyText1);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_recommend_feedback() {
		return DriverManager.getDriver().findElement(surveyText2);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_shopExpEmoji() {
		return DriverManager.getDriver().findElements(Emoji_ShoppingExp);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_recomGlobeEmoji() {
		return DriverManager.getDriver().findElements(Emoji_Recommendation);
	}

	/********************************************************************************************************************************/
	public WebElement get_shopExpFeedbackTextArea() {
		return DriverManager.getDriver().findElement(feedbackTextAread1);
	}

	/********************************************************************************************************************************/
	public WebElement get_RecomGlobeTextArea() {
		return DriverManager.getDriver().findElement(feedbackTextAread2);
	}

	/********************************************************************************************************************************/
	public WebElement get_submitSurver() {
		return DriverManager.getDriver().findElement(submitSurvey);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_thatsNice() {
		return DriverManager.getDriver().findElement(txtFeedbackSuccess_1);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_shareOthers() {
		return DriverManager.getDriver().findElement(txtFeedbackSuccess_2);
	}

	/********************************************************************************************************************************/
	public WebElement get_closeButton() {
		return DriverManager.getDriver().findElement(btnClose);
	}

	/********************************************************************************************************************************/
	public WebElement get_copyOrderID() {
		return DriverManager.getDriver().findElement(copyOrderID);
	}

	/********************************************************************************************************************************/
	public WebElement get_linkTrackOrder() {
		return DriverManager.getDriver().findElement(linkTrackOrder);
	}

	/********************************************************************************************************************************/
	public WebElement get_printIcon() {
		return DriverManager.getDriver().findElement(printIcon);
	}

	/********************************************************************************************************************************/
	public WebElement get_summaryShippingAddress() {
		return DriverManager.getDriver().findElement(summaryShippingAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_summaryAmtToPay() {
		return DriverManager.getDriver().findElement(summaryAmtToPay);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_summaryProductCount() {
		return DriverManager.getDriver().findElements(summaryProductCount);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_summaryProductImage() {
		return DriverManager.getDriver().findElements(summaryProductImage);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_summaryProductName() {
		return DriverManager.getDriver().findElements(summaryProductName);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_summaryDescription() {
		return DriverManager.getDriver().findElements(summaryDescription);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_summaryQuantity() {
		return DriverManager.getDriver().findElements(summaryQuantity);
	}

	/********************************************************************************************************************************/
	public WebElement get_summaryReminder1() {
		return DriverManager.getDriver().findElement(summaryReminder1);
	}

	/********************************************************************************************************************************/
	public WebElement get_summaryReminder2() {
		return DriverManager.getDriver().findElement(summaryReminder2);
	}

	/********************************************************************************************************************************/
	public WebElement get_tryDifferentPayment() {
		return DriverManager.getDriver().findElement(tryDifferentPayment);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_msgPurchaseDeclined() {
		return DriverManager.getDriver().findElement(msgPurchaseDeclined);
	}
	public WebElement get_Referencenum() {
		return DriverManager.getDriver().findElement(Referencenum);
	}
	public WebElement get_Orderid() {
		return DriverManager.getDriver().findElement(Orderid);
	}
	
	
	

	/**
	 * @throws Exception ******************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) throws Exception {
		boolean flag = false;

		switch (element) {
		
		
		case "OrderSummary":
			flag = waitForElementVisibility(OrderSummary, waitTime);
			break;
		case "shippingfeeheader":
			flag = waitForElementVisibility(shippingfeeheader, waitTime);
			break;
		case "shippingfeetext":
			flag = waitForElementVisibility(shippingfeetext, waitTime);
			break;
		case "shippingamount":
			flag = waitForElementVisibility(shippingamount, waitTime);
			break;
		case "shippingtotalamountpaidheader":
			flag = waitForElementVisibility(shippingtotalamountpaidheader, waitTime);
			break;
		case "shiipingtotalamountvalue":
			flag = waitForElementVisibility(shiipingtotalamountvalue, waitTime);
			break;
		case "onetimeheader":
			flag = waitForElementVisibility(onetimeheader, waitTime);
			break;
		case "PleaseGiveUsTimeToProcessYourOrder":
			flag = waitForElementVisibility(PleaseGiveUsTimeToProcessYourOrder, waitTime);
			break;
		case "OrderReceived":
			flag = waitForElementVisibility(OrderReceived, waitTime);
			break;
		case "ordersummery":
			flag = waitForElementVisibility(ordersummery, waitTime);
			break;
		case "ordersummerytext":
			flag = waitForElementVisibility(ordersummerytext, waitTime);
			break;
		case "ordersummeryamount":
			flag = waitForElementVisibility(ordersummeryamount, waitTime);
			break;
		case "view1plantype":
			flag = waitForElementVisibility(view1plantype, waitTime);
			break;
		case "view1planevalue":
			flag = waitForElementVisibility(view1planevalue, waitTime);
			break;
		case "paymentdeatilsheader":
			flag = waitForElementVisibility(paymentdeatilsheader, waitTime);
			break;
		case "paymentdetailsamount":
			flag = waitForElementVisibility(paymentdetailsamount, waitTime);
			break;
		case "Viewbreakdown":
			flag = waitForElementVisibility(Viewbreakdown, waitTime);
			break;
		case "view2devicename":
			flag = waitForElementVisibility(view2devicename, waitTime);
			break;
		case "devicecolor":
			flag = waitForElementVisibility(devicecolor, waitTime);
			break;
		case "VIEW2DEVICEPROCE":
			flag = waitForElementVisibility(VIEW2DEVICEPROCE, waitTime);
			break;
		
		case "closeButton":
			flag = waitForElementVisibility(btnClose, waitTime);
			break;
		case "PurchaseSummary":
			flag = waitForElementVisibility(PurchaseSummary, waitTime);
			break;
		case "allacesssvalue":
			flag = waitForElementVisibility(allacesssvalue, waitTime);
			break;
		case "gowifiacesssvalue":
			flag = waitForElementVisibility(gowifiacesssvalue, waitTime);
			break;
		case "callandtextvalue":
			flag = waitForElementVisibility(callandtextvalue, waitTime);
			break;
		case "contractdurationvalue":
			flag = waitForElementVisibility(contractdurationvalue, waitTime);
			break;
			
		case "ShippingAddress":
			flag = waitForElementVisibility(ShippingAddress, waitTime);
			break;
		case "Paymentmethod":
			flag = waitForElementVisibility(Paymentmethod, waitTime);
			break;
		case "AmountPaid":
			flag = waitForElementVisibility(AmountPaid, waitTime);
			break;
		case "AmountPaidValue":
			flag = waitForElementVisibility(AmountPaidValue, waitTime);
			break;
		case "PlanName":
			flag = waitForElementVisibility(PlanName, waitTime);
			break;
			
		case "PlanDetail":
			flag = waitForElementVisibility(PlanDetail, waitTime);
			break;
		case "PlanInclusions":
			flag = waitForElementVisibility(PlanInclusions, waitTime);
			break;
		case "Registredmail":
			flag = waitForElementVisibility(Registredmail, waitTime);
			break;
		case "Addons":
			flag = waitForElementVisibility(Addons, waitTime);
			break;
			
			
		case "surveyForm":
			flag = waitForElementVisibility(surveyForm, waitTime);
			break;
		case "imgSurveySuccess":
			flag = waitForElementVisibility(imgFeedbackSuccess, waitTime);
			break;
		case "printIcon":
			flag = waitForElementVisibility(printIcon, waitTime);
			break;
		case "copyRefrerenceNoSuccessMsg":
			flag = waitForElementVisibility(copyRefrerenceNoSuccessMsg, waitTime);
			break;
		case "tryDifferentPayment":
			flag = waitForElementVisibility(tryDifferentPayment, waitTime);
			break;
		case "msgPurchaseDeclined":
			flag = waitForElementVisibility(msgPurchaseDeclined, waitTime);
			break;
			
	
		case "Thankyoulabel":
			flag = waitForElementVisibility(Thankyoulabel, waitTime);
			break;
		case "Confirmlabel":
			flag = waitForElementVisibility(Confirmlabel, waitTime);
			break;
		case "OrderRecieved":
			flag = waitForElementVisibility(OrderRecieved, waitTime);
			break;
		
		case "RefrcenumLabel":
			flag = waitForElementVisibility(RefrcenumLabel, waitTime);
			break;		
		case "copyicon":
			flag = waitForElementVisibility(copyicon, waitTime);
			break;
		
		case "Itemsorderlabel":
			flag = waitForElementVisibility(Itemsorderlabel, waitTime);
			break;	
		case "Viupremium":
			flag = waitForElementVisibility(Viupremium, waitTime);
			break;  
		case "Spotifypremium":
			flag = waitForElementVisibility(Spotifypremium, waitTime);
			break;  
		case "easyRoam":
			flag = waitForElementVisibility(easyRoam, waitTime);
			break;  
		case "Gocallid199":
			flag = waitForElementVisibility(Gocallid199, waitTime);
			break;  
		case "Gplanwithdevice1799":
			flag = waitForElementVisibility(Gplanwithdevice1799, waitTime);
			break;  
			
		case "Trackmyorder":
			flag = waitForElementVisibility(Trackmyorder, waitTime);
			break;				
		case "CheckEmailSPiel":
			flag = waitForElementVisibility(CheckEmailSPiel, waitTime);
			break;
		
		case "summaryReminder1":
			flag = waitForElementVisibility(summaryReminder1, waitTime);
			break;	
			//new 
		case "orderconfirm":
			flag = waitForElementVisibility(orderconfirm, waitTime);
			break;	
		case "reference":
			flag = waitForElementVisibility(reference, waitTime);
			break;	
		case "Orderid":
			flag = waitForElementVisibility(Orderid, waitTime);
			break;	
		case "msg":
			flag = waitForElementVisibility(msg, waitTime);
			break;	
		case "plane":
			flag = waitForElementVisibility(plane, waitTime);
			break;	
		case "allaccess":
			flag = waitForElementVisibility(allaccess, waitTime);
			break;	
		case "gowifi":
			flag = waitForElementVisibility(gowifi, waitTime);
			break;	
		case "call":
			flag = waitForElementVisibility(call, waitTime);
			break;	
		case "contractdur":
			flag = waitForElementVisibility(contractdur, waitTime);
			break;	
		case "gsadd":
			flag = waitForElementVisibility(gsadd, waitTime);
			break;	
		case "apv":
			flag = waitForElementVisibility(apv, waitTime);
			break;	
		case "viu":
			flag = waitForElementVisibility(viu, waitTime);
			break;
		case "duo":
			flag = waitForElementVisibility(duo, waitTime);
			break;
		case "easy":
			flag = waitForElementVisibility(easy, waitTime);
			break;
		case "monthly":
			flag = waitForElementVisibility(monthly, waitTime);
			break;
		case "monthlyvalue":
			flag = waitForElementVisibility(monthlyvalue, waitTime);
			break;
		case "trackmyorder":
			flag = waitForElementVisibility(trackmyorder, waitTime);
			break;
		case "inclusion":
			flag = waitForElementVisibility(inclusion, waitTime);
			break;
		case "personalsubscripation":
			flag = waitForElementVisibility(personalsubscripation, waitTime);
			break;
		case "threemonthssub":
			flag = waitForElementVisibility(threemonthssub, waitTime);
			break;
		case "threemonthsvip":
			flag = waitForElementVisibility(threemonthsvip, waitTime);
			break;
		case "premiumaccess":
			flag = waitForElementVisibility(premiumaccess, waitTime);
			break;
		case "premembershipaccess":
			flag = waitForElementVisibility(premembershipaccess, waitTime);
			break;
		case "addonsubscription":
			flag = waitForElementVisibility(addonsubscription, waitTime);
			break;
		case "inclusioncrosal":
			flag = waitForElementVisibility(inclusioncrosal, waitTime);
			break;
		case "addonsubscriptioncrosal":
			flag = waitForElementVisibility(addonsubscriptioncrosal, waitTime);
			break;
//		case "premembershipaccess":
//				flag = ElementVisibility(premembershipaccess, waitTime);
//				break;
//		case "premembershipaccess":
//			flag = ElementVisibility(premembershipaccess, waitTime);
//			break;
//			
		case "planetype":
			flag = waitForElementVisibility(planetype, waitTime);
			break;
		case "planetype2":
			flag = waitForElementVisibility(planetype2, waitTime);
			break;
		case "planetypeamount":
			flag = waitForElementVisibility(planetypeamount, waitTime);
			break;
		case "addon":
			flag = waitForElementVisibility(addon, waitTime);
			break;
		case "addonsamount":
			flag = waitForElementVisibility(addonsamount, waitTime);
			break;
		case "gsaddsurf":
			flag = waitForElementVisibility(gsaddsurf, waitTime);
			break;
		case "gsaddamount":
			flag = waitForElementVisibility(gsaddamount, waitTime);
			break;
//		case "apv":
//			flag = waitForElementVisibility(apv, waitTime);
//			break;
		case "apvamount":
			flag = waitForElementVisibility(apvamount, waitTime);
			break;
//		case "viu":
//			flag = waitForElementVisibility(viu, waitTime);
//			break;
		case "viuamount":
			flag = waitForElementVisibility(viuamount, waitTime);
			break;
		case "myduo":
			flag = waitForElementVisibility(myduo, waitTime);
			break;
		case "myduoamount":
			flag = waitForElementVisibility(myduoamount, waitTime);
			break;
		case "easyroam":
			flag = waitForElementVisibility(easyroam, waitTime);
			break;
		case "easyroamamount":
			flag = waitForElementVisibility(easyroamamount, waitTime);
			break;
		case "Monthlybill":
			flag = waitForElementVisibility(Monthlybill, waitTime);
			break;
		case "monthlybillamount":
			flag = waitForElementVisibility(monthlybillamount, waitTime);
			break;
		case "OrderConfirmed":
			flag = waitForElementVisibility(OrderConfirmed, waitTime);
			break;
		case "ReferenceNo":
			flag = waitForElementVisibility(ReferenceNo, waitTime);
			break;
		case "Success":
			flag = waitForElementVisibility(Success, waitTime);
			break;
		case "YourRenewalIsNowInProgress":
			flag = waitForElementVisibility(YourRenewalIsNowInProgress, waitTime);
			break;
		case "planType":
			flag = waitForElementVisibility(planType, waitTime);
			break;
		case "deviceImg":
			flag = waitForElementVisibility(deviceImg, waitTime);
			break;
		case "deviceName":
			flag = waitForElementVisibility(deviceName, waitTime);
			break;
		case "devicecolor_Data":
			flag = waitForElementVisibility(devicecolor_Data, waitTime);
			break;
		case "AllAccessData":
			flag = waitForElementVisibility(AllAccessData, waitTime);
			break;
		case "GoWifiAccess":
			flag = waitForElementVisibility(GoWifiAccess, waitTime);
		case "CallAndText":
			flag = waitForElementVisibility(CallAndText, waitTime);
			break;
		case "ContractDuration":
			flag = waitForElementVisibility(ContractDuration, waitTime);
			break;
		case "Inclusions":
			flag = waitForElementVisibility(Inclusions, waitTime);
			break;
		case "KonsultaMD":
			flag = waitForElementVisibility(KonsultaMD, waitTime);
			break;
		case "ThreemonthVIPAccessToIQIYI":
			flag = waitForElementVisibility(ThreemonthVIPAccessToIQIYI, waitTime);
			break;
		case "ThreemonthVIPAccessToWeTV":
			flag = waitForElementVisibility(ThreemonthVIPAccessToWeTV, waitTime);
			break;
		case "inclusionsChevron":
			flag = waitForElementVisibility(inclusionsChevron, waitTime);
			break;
		case "AddOnsAndSubscriptions":
			flag = waitForElementVisibility(AddOnsAndSubscriptions, waitTime);
			break;
		case "GSAddSurf":
			flag = waitForElementVisibility(GSAddSurf, waitTime);
			break;
		case "AmazonPrimeVideo":
			flag = waitForElementVisibility(AmazonPrimeVideo, waitTime);
			break;
		case "ViuPremium":
			flag = waitForElementVisibility(ViuPremium, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
		
		case "ShippingAddressDisplayed":
			flag = waitForElementVisibility(ShippingAddressDisplayed, waitTime);
			break;
		case "MonthlyBill":
			flag = waitForElementVisibility(MonthlyBill, waitTime);
			break;
		case "ShowBreakdown":
			flag = waitForElementVisibility(ShowBreakdown, waitTime);
			break;
		case "MonthlyBillGenerated":
			flag = waitForElementVisibility(MonthlyBillGenerated, waitTime);
			break;
		case "WhatsNext":
			flag = waitForElementVisibility(WhatsNext, waitTime);
			break;
		case "TrackMyOrder":
			flag = waitForElementVisibility(TrackMyOrder, waitTime);
			break;
	
			
		case "planPrice":
			flag = waitForElementVisibility(planPrice, waitTime);
			break;
	
		case "Freepersonalsubscription":
			flag = waitForElementVisibility(Freepersonalsubscription, waitTime);
			break;
		case "monthssubscription":
			flag = waitForElementVisibility(monthssubscription, waitTime);
			break;
		case "monthstandardVIPaccess":
			flag = waitForElementVisibility(monthstandardVIPaccess, waitTime);
			break;
		case "monthstandardVIPaccesss":
			flag = waitForElementVisibility(monthstandardVIPaccesss, waitTime);
			break;
		case "monthPremiumAccess":
			flag = waitForElementVisibility(monthPremiumAccess, waitTime);
			break;
		case "monthPremiumMembership":
			flag = waitForElementVisibility(monthPremiumMembership, waitTime);
			break;
		case "Unli1app":
			flag = waitForElementVisibility(Unli1app, waitTime);
			break;
		case "Freeindividualsubscription":
			flag = waitForElementVisibility(Freeindividualsubscription, waitTime);
			break;
		case "Unli5Gforsixmonths":
			flag = waitForElementVisibility(Unli5Gforsixmonths, waitTime);
			break;
		case "GBstoPointsuptGBmonth":
			flag = waitForElementVisibility(GBstoPointsuptGBmonth, waitTime);
			break;
		case "Inclusionaddons":
			flag = waitForElementVisibility(Inclusionaddons, waitTime);
			break;
		case "Inclusionaddons1":
			flag = waitForElementVisibility(Inclusionaddons1, waitTime);
			break;
		case "Inclusionaddons2":
			flag = waitForElementVisibility(Inclusionaddons2, waitTime);
			break;
		case "Inclusionaddons3":
			flag = waitForElementVisibility(Inclusionaddons3, waitTime);
			break;
		case "Inclusionaddons4":
			flag = waitForElementVisibility(Inclusionaddons4, waitTime);
			break;
		case "Inclusionaddons5":
			flag = waitForElementVisibility(Inclusionaddons5, waitTime);
			break;
		case "Inclusionaddons6":
			flag = waitForElementVisibility(Inclusionaddons6, waitTime);
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

	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "tryDifferentPayment":
			flag = waitForElementClickable(tryDifferentPayment, waitTime);
			break;

		}

		return flag;
	}
	
	/********************************************************************************************************************************/

	public String getText(String ele) {
		String text = "";

		try {
			switch (ele) {
			
		
		//	case "inputcardnumber":
		//		text = DriverManager.getDriver().findElement(inputcardnumber).getText();
		//		break;	

	
	

			}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
		}

		return text;
	}
public void jsClick(String message, String element) throws Exception {
		
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "inclusionsChevron":
		         jse.executeScript("arguments[0].click();", get_inclusionsChevron());		
		         break; 
			case "TrackMyOrder":
		         jse.executeScript("arguments[0].click();", get_TrackMyOrder());		
		         break; 
			case "ShowBreakdown":
				 jse.executeScript("arguments[0].click();", get_ShowBreakdown());		
		         break; 
			case "Viewbreakdown":
				 jse.executeScript("arguments[0].click();", get_Viewbreakdown());		
		         break; 
			}
		}
		catch (ElementClickInterceptedException e1) {
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
