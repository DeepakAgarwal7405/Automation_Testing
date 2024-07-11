package com.mvn;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitAutomationWebdriver {
	WebDriver driver;

	@Before
	public void beforeclass() throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		Thread.sleep(2000);

	}

	

	@Test

	public void login() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();


		driver.findElement(By.name("email")).sendKeys("don321@yopmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Abcd@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		Thread.sleep(2000);

	}
	
	@Test
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
	}

	

	@After

	public void after() {

		driver.close();

	}

	


}
