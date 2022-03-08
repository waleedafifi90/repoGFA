package tests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.*;

public class BaseTest {
	public BaseTest() {
		PageFactory.initElements(new AppiumFieldDecorator(BaseTest.driver), this);
	}

	public static AndroidDriver<MobileElement> driver;
	static DesiredCapabilities caps = new DesiredCapabilities();

	@BeforeClass
	public static void driverSetUp() {
		caps.setCapability("deviceName", "Masa");
		caps.setCapability("udid", "RF8NC08PAMF");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11");
		caps.setCapability("app", "C:\\Users\\MSI\\Downloads\\app.apk");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void waitVisibilityOf(MobileElement element){
		WebDriverWait webDriverWait = new WebDriverWait(driver, 40);
		webDriverWait.until(ExpectedConditions.visibilityOf(element));
	}
}
