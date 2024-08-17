package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class OpenAPIEmulator  {
	@Test
	public void open() throws InterruptedException, MalformedURLException  {

	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("Deepak");
//	options.setApp("C:\\Users\\tops\\Documents\\Deepak\\apk file\\ApiDemos-debug.apk");
	options.setApp("C:\\Users\\tops\\Workspace\\DeepakAppiumAssignment\\apk file\\ApiDemos-debug.apk");
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	Thread.sleep(3000);	
		
		
	driver.quit();
		
		
		
		
		}

}
