import java.net.MalformedURLException;
import java.util.HashMap;

import io.appium.java_client.ios.IOSDriver;

public class ScrollingIniOS extends DesiredCapabilitiesiOS{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		IOSDriver driver = DesiredCapabilities();
		//scroll
		HashMap<String,Object>scrollObject=new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("name", "Web View");
		driver.executeScript("mobile:scroll", scrollObject);
		/*
		 * There are no appium commands for scroll in iOS
		 * so, we run script that scrolls until our required object is found on screen
		 * we pass the object parameter in HasMap that accpets a string and its respective object
		 * This hashmap contains all the detials required to find element by appium on iOS screen
		 */
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Web View\"]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UIKitCatalog\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Picker View\"]").click();
		//Handling DatePickers
		//For date picker we can select object and then sendkeys the required value
		driver.findElementByXPath("//XCUIElementTypePickerWheel[@name=\"Red color component value\"]").sendKeys("80");
		driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
		driver.findElementByAccessibilityId("Blue color component value").sendKeys("105");
		System.out.println(driver.findElementByAccessibilityId("Blue color component value").getText());
	}

}
