package com.mvn;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	AppiumDriverLocalService service;
//	@Test
	@BeforeMethod
	public void test() throws Exception, InterruptedException {
		service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\tops\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options=new UiAutomator2Options();
		
		options.setDeviceName("Deepak");
		options.setApp("C:\\Users\\tops\\Documents\\Deepak\\apk file\\ApiDemos-debug.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void dragNDrop(WebElement source) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 619,
			    "endY", 560
			));

	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	
	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.75
			));		
	}


	
	@AfterMethod
	public void Closing() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
