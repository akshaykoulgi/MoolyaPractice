package FirstModule;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// This code is incomplete and is work in progress, 

// need to modify the loop i.e to make sure that every cell read is happening only once and after that closing the test.

public class DataDriven {

	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		Thread.sleep(2000);
		
	}
	
	
	
	@Test
	public void ExcelTest() throws Throwable {
		File excel = new File("G:\\Data\\data.xlsx");
		FileInputStream fis = new FileInputStream(excel);
		XSSFWorkbook book = new XSSFWorkbook(fis);

		
		XSSFSheet sheet = book.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		
		
		for(int i=0;i<lastrow;i++) {
			
			String username = sheet.getRow(i).getCell(1).getStringCellValue();
			
			String password = sheet.getRow(i).getCell(2).getStringCellValue();
			
			 driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);			
			 driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
			 driver.findElement(By.xpath("//*[@type='submit']")).click();

			
			if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
				
				
				driver.findElement(By.xpath("//*[@class='oxd-userdropdown-img']")).click();
				driver.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();

				
			}
			else  {

				String username1 = sheet.getRow(i+1).getCell(0).getStringCellValue();
				
				String password1 = sheet.getRow(i+1).getCell(0).getStringCellValue();
				
				 driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);			
				 driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
				 driver.findElement(By.xpath("//*[@type='submit']")).click();

				
				
			}
			
			
		}
		
		
	}
	
}
