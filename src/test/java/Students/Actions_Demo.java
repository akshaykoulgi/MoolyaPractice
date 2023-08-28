package Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_Demo {
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);

		
	}
	
	
	@Test
	public void DoubleclickTest() throws InterruptedException {
		
		
		 WebElement doubleclickButton = driver.findElement(By.id("doubleClickBtn"));
		 
		 Actions act = new Actions(driver);
		 
		 Thread.sleep(1000);
		 
		 act.doubleClick(doubleclickButton).build().perform();
		 

		
		
		
	}
	
	
	
}
