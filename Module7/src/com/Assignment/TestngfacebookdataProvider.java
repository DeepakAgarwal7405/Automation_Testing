package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngfacebookdataProvider {
	WebDriver driver;
	@DataProvider(name = "Deepak")
	public Object[][] input() {
		return new Object[][] {{"deepakagarwal7405@gmail.com","deepak7405"},
		{"dagarwal913@gmail.com","deepak7405"}};
	}
	@Test(dataProvider = "Deepak")
  public void test(String username,String password) throws InterruptedException {
	  System.setProperty("webdriver.edge.driver",

				"G:\\Selenium\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("email"))
		.sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass"))
		.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		Thread.sleep(10000);
		driver.close();

}

}
