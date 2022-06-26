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
		slider.setValue("0%");
		Thread.sleep(2000);
		System.out.println(slider.getAttribute("value"));
		slider.setValue("1%");
		Thread.sleep(2000);
		System.out.println(slider.getAttribute("value"));
		Assert.assertEquals("100%",slider.getAttribute("value"));
	}

}
