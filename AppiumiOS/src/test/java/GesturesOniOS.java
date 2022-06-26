import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class GesturesOniOS extends DesiredCapabilitiesForLongTap{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		IOSDriver driver= DesiredCapabilities2();
		//Gesture is specific to mobile
		MobileElement e = (MobileElement)driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Long tap\"]");
		IOSTouchAction touch= new IOSTouchAction(driver);
		touch.longPress(longPressOptions().withElement(element(e)).withDuration(ofSeconds(2))).release().perform();
		//We have to release after a long press
	}

}

