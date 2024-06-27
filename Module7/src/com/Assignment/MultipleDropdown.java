package com.Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) throws InterruptedException {
		//to open a browser
				System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//to open a website
				driver.get("https://output.jsbin.com/osebed/2");
				//to maxmize the window
				driver.manage().window().maximize();
				
				Thread.sleep(1000);
				
				WebElement e1=driver.findElement(By.id("fruits"));
				Select s1=new Select(e1);
				
				
				s1.selectByIndex(1);
				Thread.sleep(1000);
				
				s1.selectByValue("grape");
				Thread.sleep(1000);
				driver.close();
				
	}

}
