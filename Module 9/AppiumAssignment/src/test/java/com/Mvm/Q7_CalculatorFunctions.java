package com.Mvm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Q7_CalculatorFunctions {
	
	@Test
	public void OpenCalci() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
			
		cap.setCapability("deviceName", "motorola moto e13");
		cap.setCapability("udid","ZD2228TJX2");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13.0");
		cap.setCapability( "appPackage","com.dencreak.dlcalculator");
		cap.setCapability("appActivity","com.dencreak.dlcalculator.DLCalculatorActivity");
		cap.setCapability("automationName", "UIAutomator2");

		URL url= new URL("http://127.0.0.1:4723/");

		AppiumDriver driver=new AppiumDriver(url, cap);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);

		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_b_d")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_b")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);

		String Ans =driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		System.out.println("Eight Into Two & its answere is "+Ans);

		Thread.sleep(2000);

		driver.quit();


		}
}
