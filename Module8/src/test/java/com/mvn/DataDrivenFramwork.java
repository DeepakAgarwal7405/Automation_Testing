package com.mvn;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFramwork {
	public String[][] readData() throws InvalidFormatException, IOException {
		String[][] data=null;
		
		//1.to select a particular file
		String filepath="G:\\Material\\tops\\Loginautomationexercise.xlsx";

		//2.to make file
		File file=new File(filepath);
		
		//3.to open this excel file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//4.to open a particular sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		
		//5.to check total rows
		int nrow=sheet.getPhysicalNumberOfRows();
		System.out.println("total row is :"+nrow);
		
		data=new String[nrow][];		

		for (int i = 0; i < data.length; i++) {
			//6.to select a row
			Row row=sheet.getRow(i);
			//7.to check total cols
			int ncol=row.getPhysicalNumberOfCells();
			
			
			System.out.println("total no of cols :"+ncol);
			data[i]=new String[ncol];
			for (int j = 0; j < data[i].length; j++) {
				Cell cell=row.getCell(j);
				//8.to convert cell value into string
				cell.setCellType(CellType.STRING);
				//9.to get value from cell
				data[i][j]=cell.getStringCellValue();
				}

			}

				return data;

				
			}
			@Test
			public void test() throws InterruptedException, InvalidFormatException, IOException {
				String[][] data=readData();
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--incognito");
				WebDriverManager.chromedriver().setup();

				for (int i = 0; i < data.length; i++) {

				WebDriver driver=new ChromeDriver(options);
				driver.get("https://automationexercise.com/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();


				driver.findElement(By.name("email")).sendKeys(data[i][0]);
				Thread.sleep(2000);
				
				driver.findElement(By.name("password")).sendKeys(data[i][1]);
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
				Thread.sleep(2000);

				driver.close();

				}

			}

}
