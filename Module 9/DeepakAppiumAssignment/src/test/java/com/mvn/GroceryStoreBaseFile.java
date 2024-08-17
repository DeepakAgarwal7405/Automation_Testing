package com.mvn;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class GroceryStoreBaseFile {
	AndroidDriver driver;
	AppiumDriverLocalService service;
	@BeforeMethod
//	@Test
	public void test() throws Exception{
		UiAutomator2Options opt=new UiAutomator2Options();
		opt.setDeviceName("Deepak");					
		opt.setApp("C:\\Users\\tops\\Workspace\\DeepakAppiumAssignment\\apk file\\General-Store.apk"); 
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), opt);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);	
		
		
	}
	
	public void longPressAction(WebElement ele) {
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}


	public void swipeAction(WebElement ele,String direction){
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.75));		
	}

	public void DragandDrop(WebElement source) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 619,
			    "endY", 560
			));
	}
	
	
	@AfterMethod
	public void ClosingTst() throws InterruptedException {
	Thread.sleep(10000);
	driver.quit();
	}

}
