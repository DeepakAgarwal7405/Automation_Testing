package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatingLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize(); 
		driver.get("https://www.geeksforgeeks.org/");
		Thread.sleep(3000);

		driver.findElement(By.linkText("Java")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Machine")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
