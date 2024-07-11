package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngAutomationWebdriver {
	WebDriver driver=null;
	@BeforeTest

	public void openBrowser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		Thread.sleep(2000);

	}
	@Test
	public void openLogin() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		Thread.sleep(1000);
	}
	

	@Test(priority = 2)
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("Abcd@1234");
		Thread.sleep(2000);
	}

	

	@Test(priority = 1)

	public void enterEmail() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("don321@yopmail.com");
		Thread.sleep(2000);

	}

	

	@Test(priority = 3)
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}


}
