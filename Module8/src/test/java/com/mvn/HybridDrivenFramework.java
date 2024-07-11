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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HybridDrivenFramework {
	@DataProvider(name="Deepak")
	public Object[][] readData() throws InvalidFormatException, IOException {
		Object[][] data=null;
		

		//1.to select a particular file
		String filepath="G:\\Material\\tops\\Loginautomationexercise.xlsx";
		//2.to make file
		File file=new File(filepath);
		//3.to open this excel file
		XSSFWorkbook workbook=new XSSFWorkbook(file);

		//4.to open a particular sheet
		Sheet sheet=workbook.getSheet("Sheet3");

		//5.to check total rows
		int nrow=sheet.getPhysicalNumberOfRows();

		System.out.println("total row is :"+nrow);

		data=new Object[nrow][];		
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

	

	WebDriver driver=null;
	@Test(dataProvider = "Deepak")
	public void test(String keyword,String data) throws InterruptedException, InvalidFormatException, IOException {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		if(keyword.equals("open browser")) {
			driver=new ChromeDriver(options);
			Thread.sleep(2000);
		}

		

		else if (keyword.equals("enter url")) {
			driver.get(data);
			Thread.sleep(2000);	

		}else if (keyword.equals("open loginpage")) {
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			Thread.sleep(2000);
		}else if (keyword.equals("enter email")) {
			driver.findElement(By.name("email")).sendKeys("don321@yopmail.com");
			Thread.sleep(2000);

		}else if (keyword.equalsIgnoreCase("Enter password")) {
			driver.findElement(By.name("password")).sendKeys("Abcd@1234");
			Thread.sleep(2000);

		}else if (keyword.equals("click login")) {
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
			Thread.sleep(2000);
		}else if (keyword.equals("click logout")) {
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			Thread.sleep(2000);
		}
		else if (keyword.equals("close browser")) {
			driver.close();

		}



		

//		}

	}
}
