package com.Mvm;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class Q6_ApiDemoScrolling extends ApiDemoRealDeviceBaseFile {

	@Test
	public void test() throws InterruptedException, MalformedURLException   {
		
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("Tejas");
		options.setApp("C:\\TejasAppium\\ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(4000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));")).click();
		Thread.sleep(2000);
}
}