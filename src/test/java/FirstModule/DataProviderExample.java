package FirstModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();


		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		Thread.sleep(2000);
	
	
		
		}
		
	@DataProvider
	public Object[][] provider(){
		
		return new Object[][]{
			new Object[]{"Admin","admin123"},
			new Object[]{"Admin","admin123"},
			new Object[]{"Admin","Admin123"},

			
			
		};
		
		
	}
	
	
		@Test(dataProvider="provider")
		public void Logintest(String username,String password) throws InterruptedException {
			 driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);			
			 driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
			 driver.findElement(By.xpath("//*[@type='submit']")).click();
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@class='oxd-userdropdown-img']")).click();
			driver.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();
			
			Thread.sleep(2000);

					
			
		}
	

		
	}
	
	

