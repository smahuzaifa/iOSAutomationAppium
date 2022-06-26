import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;

public class DesiredCapabilitiesiOS {
	public static IOSDriver DesiredCapabilities() throws MalformedURLException
	{
		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");
		c.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
		c.setCapability(MobileCapabilityType.UDID, "F9AF42B4-522F-49B4-BED5-07A930DBC9CC");
		c.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		c.setCapability(IOSMobileCapabilityType.WDA_LAUNCH_TIMEOUT, 500000 );
		c.setCapability("commandTimeouts", "12000");
		c.setCapability(MobileCapabilityType.APP, "Users/smahuzaifa/Downloads/Appium File and Folders/UIKitCatalog.app");
		IOSDriver driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"),c);
		return driver;
	}

}
 