package com.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterGmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://accounts.google.com/&ddm=0&dsh=S1024066703:1719138009352244&flowEntry=SignUp&flowName=GlifWebSignIn&followup=https://accounts.google.com/&ifkv=AS5LTAR-ljr4ihi-0jeTBpJqZ9EZprebw8GMsKBCu9UUhFZ7uD-I0GRYPIUzEpd90a_cbDC0nb4eYA&TL=AC3PFD6zEFIbM-fVET1d7TZFtYguiLK7qUktVrQeGrvEQsq5RHLu-dLqP7gKoFkJ");
		Thread.sleep(1000);

		driver.findElement(By.name("firstName")).sendKeys("Babbii");
		Thread.sleep(1000);

		driver.findElement(By.name("lastName")).sendKeys("Pehelwan");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("day")).sendKeys("1");
		Thread.sleep(1000);

		WebElement we= driver.findElement(By.id("month"));
		Select select= new Select(we);
		select.selectByValue("4");
		Thread.sleep(1000);

		driver.findElement(By.id("year")).sendKeys("2010");
		Thread.sleep(1000);

		WebElement wee= driver.findElement(By.id("gender"));
		Select selectt= new Select(wee);
		selectt.selectByValue("1");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='Create your own Gmail address']")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("Username")).sendKeys("MajbootiGurantted");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("Passwd")).sendKeys("MoyeMoye");
		Thread.sleep(1000);

		driver.findElement(By.name("PasswdAgain")).sendKeys("MoyeMoye");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);

		driver.close();

	}

}
