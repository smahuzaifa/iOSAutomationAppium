import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;

public class BasiciOSTest extends DesiredCapabilitiesiOS {

	public static void main(String[] args) throws MalformedURLException {
		IOSDriver driver = DesiredCapabilities();
		driver.findElementByAccessibilityId("Alert Views").click();
		//driver.findElementByAccessibilityId("Text Entry").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Text Entry\"]").click(); 
		driver.findElementByXPath("//XCUIElementTypeCell").sendKeys("Hello");
		/*
		 * When unique id is not available we make use of type or class type in xpath ignoring
		 * the atrribute part
		 */
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"OK\"]").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Confirm / Cancel\"]").click();
		System.out.println(driver.findElementByXPath("//*[contains(@name,'message')]").getText());
		/*
		 * What above expression does is, in the whole view it will find if it sees any "message" keyword
		 * in name attribute. if it finds then it will get the whole text present in that attribute
		 */
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Confirm\"]").click();
	}

}
