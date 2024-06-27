package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	

	//to open a website
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	//to maxmize the window
	driver.manage().window().maximize();
	
	WebElement e1=driver.findElement(By.name("country"));
	
	Select s1=new Select(e1);
	s1.selectByIndex(10);
	Thread.sleep(1000);
	s1.selectByValue("INDIA");
	Thread.sleep(1000);
	s1.selectByVisibleText("NEPAL");
	s1.selectByVisibleText("PAKISTAN");
	
//	for (int i = 0; i <=10; i++) {
//		s1.selectByIndex(i);
//		Thread.sleep(1000);
//	}
	Thread.sleep(2000);
	driver.close();
	
}

}
