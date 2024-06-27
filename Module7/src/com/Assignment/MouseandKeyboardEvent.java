package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseandKeyboardEvent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("http://demo.guru99.com/test/newtours/register.php");	
		Thread.sleep(2000);

		//Mouse Hover Event
	WebElement Ho=driver.findElement(By.linkText("Home"));
	WebElement Fl=driver.findElement(By.linkText("Flights"));
	WebElement Ht=driver.findElement(By.linkText("Hotels"));
	WebElement CR=driver.findElement(By.linkText("Car Rentals"));
	WebElement C=driver.findElement(By.linkText("Cruises"));
	WebElement Dt=driver.findElement(By.linkText("Destinations"));
	WebElement Vc=driver.findElement(By.linkText("Vacations"));

	Actions act= new Actions(driver);
	act.moveToElement(Ho).build().perform();
	Thread.sleep(1000);
	act.moveToElement(Fl).build().perform();
	Thread.sleep(1000);
	act.moveToElement(Ht).build().perform();
	Thread.sleep(1000);
	act.moveToElement(CR).build().perform();
	Thread.sleep(1000);
	act.moveToElement(C).build().perform();
	Thread.sleep(1000);
	act.moveToElement(Dt).build().perform();
	Thread.sleep(1000);
	act.moveToElement(Vc).build().perform();
	Thread.sleep(1000);

	//Keyboard Event
	WebElement email=driver.findElement(By.name("firstName"));
	
	Actions actions=new Actions(driver);
	
	Action a1=actions.moveToElement(email)
			.click()
			.keyDown(email, Keys.SHIFT)
			.sendKeys("Don")
			.keyUp(email, Keys.SHIFT)
			.doubleClick()
			.contextClick()
			.build();
	
	a1.perform();
	Thread.sleep(2000);
	driver.close();

	}

}
