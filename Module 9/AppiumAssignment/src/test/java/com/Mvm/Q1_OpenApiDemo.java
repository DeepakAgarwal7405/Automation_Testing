package com.Mvm;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Q1_OpenApiDemo {

	@Test
public void open() throws InterruptedException, MalformedURLException  {

UiAutomator2Options options=new UiAutomator2Options();
options.setDeviceName("Tejas");
options.setApp("C:\\TejasAppium\\ApiDemos-debug.apk");
AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
Thread.sleep(10000);	
	
	
driver.quit();
	
	
	
	
	}
}


