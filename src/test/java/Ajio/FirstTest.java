package Ajio;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.ajio.com/");	
		Thread.sleep(4000);
		
		
		  Alert al = driver.switchTo().alert(); 
		  al.accept();
		 
		}
	
	
	@Test
	public void test() throws InterruptedException {
		
		WebElement Men =driver.findElement(By.xpath("//a[@title='MEN']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);

		act.moveToElement(Men);
		Thread.sleep(1000);

		driver.findElement(By.linkText("Jackets & Coats")).click();
		
		
		
		
	}
		
}
