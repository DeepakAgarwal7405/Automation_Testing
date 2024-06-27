package com.Assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestngLoginFacebook {
WebDriver driver;
	
	@Before
	public void SetBrowserAndUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);	
	}
@Test	
public void Login () throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys("don432@yopmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("pass")).sendKeys("don432");
	Thread.sleep(1000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);	
	
}	
@After
public void CLosingbrowser () {
	driver.close();
}

}
