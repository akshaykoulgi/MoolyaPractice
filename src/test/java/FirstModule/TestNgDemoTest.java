package FirstModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemoTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		Thread.sleep(2000);
		
	}
	
	@Test(priority=0)
	public void teststep() throws InterruptedException {
		
		WebElement username =  driver.findElement(By.name("username"));
		
		WebElement password =  driver.findElement(By.name("password"));
		WebElement Loginbtn =  driver.findElement(By.xpath("//button"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		Loginbtn.click();
		Thread.sleep(2000);
		
	}
	
	
	@Test(priority = 1)
	public void SearchUSerTest() throws InterruptedException {
		Thread.sleep(4000);

		WebElement Admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		WebElement Username = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	    WebElement UserroleDropdown = driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]"));
	    WebElement StatusDropdown = driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]"));
		WebElement SearchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(4000);
		Admin.click();
		//js.executeScript("arguments[0].click()",Admin);

		Thread.sleep(2000);
		Username.sendKeys("Admin");
		Thread.sleep(500);
		SearchButton.click();
		
		
	}
	
	@Test(enabled= false)
	public void logoutTest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebElement dropdown =  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		
		dropdown.click();
		
		Thread.sleep(500);

		
		WebElement logout = driver.findElement(By.xpath("//a[@href=\"/web/index.php/auth/logout\"]"));
		
		logout.click();
		
	}
	
	@AfterTest
	public void laststep() {
		
		driver.quit();
			
	}
	
	

}
