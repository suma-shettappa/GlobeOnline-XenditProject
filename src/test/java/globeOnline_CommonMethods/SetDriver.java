package globeOnline_CommonMethods;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.ios.IOSDriver;
import utility.Control;

public class SetDriver {
	public WebDriver driver;
	
	public String Browser = "chrome";
	public String Scenario = "chrome";
	public String AddressType = "Condo";

	@BeforeMethod(alwaysRun = true)
	@org.testng.annotations.Parameters(value = { "config", "environment" })
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setUp(String config_file, String environment) throws Exception {
		JSONParser parser = new JSONParser();
		JSONObject config = (JSONObject) parser.parse(new FileReader("src/test/resources/conf/" + config_file));

		JSONObject envs = (JSONObject) config.get("environments");
		JSONObject array = (JSONObject) envs.get(environment);
		String platform1 = (String) array.get("platformName");
		System.out.println(platform1);

		DesiredCapabilities capabilities = new DesiredCapabilities();

		Map<String, String> envCapabilities = (Map<String, String>) envs.get(environment);
		Iterator it = envCapabilities.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
		}

		Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
		it = commonCapabilities.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			if (capabilities.getCapability(pair.getKey().toString()) == null) {
				capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
			}
		}

		String username = System.getenv("BROWSERSTACK_USERNAME");
		if (username == null) {
			username = (String) config.get("user");
		}

		String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
		if (accessKey == null) {
			accessKey = (String) config.get("key");
		}

		if (capabilities.getCapability("local") != null && capabilities.getCapability("local") == "true") {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
			DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
			options.addArguments("user-data-dir=< path of the folder >");
			options.addArguments("user-data-dir=C:\\ChromeData");
			desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
			 //driver = new ChromeDriver();
		}

		
		  else 
		  {
			    
			  			driver = new IOSDriver(new URL("http://"+username+":"+accessKey+"@mobile-hub.lambdatest.com/wd/hub"), capabilities);
			  
//		  capabilities.setCapability("platformName", "android");
//		  capabilities.setCapability("deviceName", "Galaxy A22");
//		  capabilities.setCapability("platformVersion", "11");
//		  capabilities.setCapability("isRealMobile", true);
//		  //capabilities.setCapability("newCommandTimeout", 30);
		  
				  	
			 // driver.get("https://the-internet.herokuapp.com/upload");
			 // AndroidDriver
//			  WebElement cde = driver.findElement(By.id("file-upload"));
//			  
//			  
//			driver.pushFile("/sdcard/Download/POIDF.jpg", new File("D:\\final project go\\abhinav\\LAVANYA\\testng-geotestingUAT\\testng-geotestingUAT\\src\\test\\resources\\Documents\\POIDF.jpg"));
//
//			  cde.sendKeys("/sdcard/Download/POIDF.jpg");
//			  driver.findElement(By.id("terms")).click();
//
//
//			  driver.findElement(By.id("file-submit")).click();
		  			 
		 
		  
		//else {			
			 /* driver = new RemoteWebDriver( new URL("http://" + username + ":" + accessKey
			  + "@" + config.get("server") + "/wd/hub"), capabilities);*/
		}
		  
		
		
	

	DriverManager.setWebDriver(driver);

	DriverManager.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	// DriverManager.getDriver().manage().window().maximize();
	DriverManager.getDriver().manage().deleteAllCookies();

	}
	
	

	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		Control.GeneratePDFReport();
	}
}