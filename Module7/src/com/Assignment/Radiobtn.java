package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		//to open a website
		driver.get("https://demo.guru99.com/test/radio.html");
		//to maxmize the window
		driver.manage().window().maximize();
		
		//Radio button
		for (int i = 1; i <=3; i++) {
			driver.findElement(By.id("vfb-7-"+i)).click();
			Thread.sleep(1000);
		}
		//driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
