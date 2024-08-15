package com.Mvm;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Q2_openApiDemo {

	public void OpenApidemoRealDevice() throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability("deviceName", "motorola moto e13");
		cap.setCapability("udid","ZD2228TJX2");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13.0");
		cap.setCapability( "appPackage","io.appium.android");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");

		URL url= new URL("http://127.0.0.1:4723/");
		
		
		AppiumDriver driver=new AppiumDriver(url, cap);
		
}
}
