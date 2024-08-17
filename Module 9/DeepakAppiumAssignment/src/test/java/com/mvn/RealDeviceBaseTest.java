package com.mvn;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class RealDeviceBaseTest {
public AppiumDriver driver;
AppiumDriverLocalService service;
//	@BeforeMethod
	public void test() throws Exception, InterruptedException {
//		service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\tops\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		
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
		
	}
	
	public void longPressAction(WebElement ele ,AppiumDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	
	
	public void swipeAction(WebElement ele,String direction, AndroidDriver driver)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.75
			));	
	}


	
//	@AfterMethod
	public void Closing() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
