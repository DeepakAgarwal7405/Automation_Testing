package com.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		//driver.manage().window().maximize();
		
		List<WebElement> total_links= driver.findElements(By.tagName("a"));
		int links= total_links.size();
		System.out.println("Total Links availabale on the webpage is "+links);
		
		List<WebElement> th=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Total no of column:- "+th.size());
		
		List<WebElement> tr=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total no of Row:- "+tr.size());
		
		for (int i = 1; i <=tr.size(); i++) {
			for (int j = 1; j <=th.size(); j++) {
				String data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("      |     "+data);
			}
			System.out.println();
			Thread.sleep(1000);
		}
		
	Thread.sleep(1500);
	driver.close();
	}
}
