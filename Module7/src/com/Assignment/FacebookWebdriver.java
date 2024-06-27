package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookWebdriver {
	WebDriver driver=null;
	@BeforeTest

	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

	}

	

	@Test(priority = 1)
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.id("pass"))
		.sendKeys("deepak7405");
		Thread.sleep(2000);
	}

	

	@Test(priority = 0)

	public void enterUsername() throws InterruptedException {
		driver.findElement(By.id("email"))
		.sendKeys("deepakagarwal7405@gmail.com");
		Thread.sleep(2000);

	}

	

	@Test(priority = 2)
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		Thread.sleep(10000);
	}

	

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
