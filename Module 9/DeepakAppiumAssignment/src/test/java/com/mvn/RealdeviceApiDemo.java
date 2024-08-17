package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class RealdeviceApiDemo {
	@Test
	public void opencalc() throws Exception {

		DesiredCapabilities cap=new DesiredCapabilities();

		cap.setCapability("deviceName", "Xiaomi M2010J19SI");
		cap.setCapability("udid","84b1ddd91220");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12.0");
		cap.setCapability( "appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");

		URL url=new URL("http://127.0.0.1:4723/");
		
		AppiumDriver driver=new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.quit();	}

}
