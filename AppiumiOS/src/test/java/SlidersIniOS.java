import java.net.MalformedURLException;

import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SlidersIniOS extends DesiredCapabilitiesiOS {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		IOSDriver driver = DesiredCapabilities();
		driver.findElementByAccessibilityId("Sliders").click();
		IOSElement slider =(IOSElement)driver.findElementByXPath("//XCUIElementTypeSlider");
		Thread.sleep(2000);
		/*
		 * Sliding and all are iOS specific so we make use of IOSElement class to get the extra
		 * iOS specific functionality
		 * Above, we have cast the element to iOSElement (since it initially behaves as webelement
		 */
		slider.setValue("0%");
		Thread.sleep(2000);
		System.out.println(slider.getAttribute("value"));
		slider.setValue("1%");
		Thread.sleep(2000);
		System.out.println(slider.getAttribute("value"));
		/*
		 * Setvalue method accepts value between 0 to 1
		 * to set value of 42 we need 0.42
		 * Similarly to set 100 we need 1
		 */
		Assert.assertEquals("100%",slider.getAttribute("value"));
	}

}
