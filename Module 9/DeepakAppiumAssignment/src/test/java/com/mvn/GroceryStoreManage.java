package com.mvn;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class GroceryStoreManage extends GroceryStoreBaseFile {
	
	@Test
	public void functions() throws InterruptedException {
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("James Bond");
		Thread.sleep(2000);
		
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"India\"));")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).click();
		Thread.sleep(2000);
}

}
