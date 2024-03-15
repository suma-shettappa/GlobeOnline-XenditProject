package globeOnline_CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.pages.Acqui.AcquiLanding_Page;


import utility.Constant;
import utility.Control;
import utility.Generic;

public class SelectionPlansPDPPage {

	private util util = new util();
	private AcquiLanding_Page LP = new AcquiLanding_Page();


	// Selecting Plan In PDP Page
	public void SelectPlaninPDP(String planetype) throws Exception
	{
		LP.isElementExist("Sim only", "Sim_Only", 10);
		LP.isElementExist("Gcash", "Gcash_Plan", 10);
		LP.isElementExist("WithDevice", "Device_Plan", 10);
		LP.isElementExist("AllData ", "AllData_Plan", 10);
		switch (planetype) {
		case "Sim_Only":
			LP.jsClick("Sim_Only", "Sim_Only");			
			break;
		case "Device_Plan":
			LP.jsClick("Device_Plan", "Device_Plan");
			break;
		case "Gcash_Plan":
			LP.jsClick("Gcash_Plan", "Gcash_Plan");
			break;
		case "AllData_Plan":
			LP.jsClick("AllData_Plan", "AllData_Plan");
			break;
		default :
			System.out.println("Given mode planes noT exist");
		}

		//		WebElement planValue=DriverManager.getDriver().findElement(By.xpath("//span[text()=' "+planevalue+"']"));			
		//		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		//		js.executeScript("arguments[0].click();", planValue);
		//		Control.takeScreenshot();
		//		Thread.sleep(5000);

	}
	/************************************************************************************************************************/

	/**
	 * @throws InterruptedException ******************************************************************************************************************************/
	public void planevalues_inlandingpage(String planevalue) throws Exception
	{	
		switch (planevalue) {
		case "799":
			WebElement plan799=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
			jse.executeScript("arguments[0].click();", planevalue);
			break;				
		case "599":			
			for (int i = 0; i<2; i++) {
				if (LP.isClickable("Owl_Prev", 5)) {
					Thread.sleep(3000L);
					LP.jsClick("Owl_Prev", "Owl_Prev");				
				}
			}
			WebElement plan599=DriverManager.getDriver().findElement(By.xpath("(//span[normalize-space(text())='"+planevalue+"'])"));
			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", plan599);
			break;	
		case "1299":
			WebElement planW1299=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor jsee = (JavascriptExecutor) DriverManager.getDriver();
			jsee.executeScript("arguments[0].click();", planevalue);
			break;
		case "1499":
			for (int i = 0; i<=2; i++) {
				if (LP.isClickable("next2", 5)) {
					Thread.sleep(3000L);	
					LP.jsClick("Owl_Next", "Owl_Next");			
				}  
			}
			WebElement plan1499=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor jses = (JavascriptExecutor) DriverManager.getDriver();
			jses.executeScript("arguments[0].click();", planevalue);
			break;
		case "1799":
			for (int i = 0; i<=2; i++) {
				if (LP.isClickable("next2", 5)) {
					Thread.sleep(3000L);	
					LP.jsClick("Owl_Next", "Owl_Next");			
				}  
			}
			WebElement plan1799=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor js1799 = (JavascriptExecutor) DriverManager.getDriver();
			js1799.executeScript("arguments[0].click();", planevalue);
			break;
		case "1999":
			for (int i = 0; i<=2; i++) {
				if (LP.isClickable("next2", 5)) {
					Thread.sleep(3000L);	
					LP.jsClick("Owl_Next", "Owl_Next");			
				}  
			}
			WebElement plan1999=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor js1999 = (JavascriptExecutor) DriverManager.getDriver();
			js1999.executeScript("arguments[0].click();", planevalue);
			break;
		case "2499":
			for (int i = 0; i<=3; i++) {
				if (LP.isClickable("next2", 5)) {
					Thread.sleep(3000L);	
					LP.jsClick("Owl_Next", "Owl_Next");			
				}  
			}
			WebElement plan2499=DriverManager.getDriver().findElement(By.xpath("(//div[text()=' "+planevalue+" '])[2]"));
			JavascriptExecutor js2499 = (JavascriptExecutor) DriverManager.getDriver();
			js2499.executeScript("arguments[0].click();", planevalue);
			break;
		default :
			System.out.println("Given mode planes noT exist");
		}

	}
}
