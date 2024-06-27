package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/help/contact/183000765122339/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='helpCenterRootID']/div[1]/div/h1/a")).click();
		Thread.sleep(2000);



		driver.close();

		}

}
