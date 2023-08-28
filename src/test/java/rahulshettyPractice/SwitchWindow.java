package rahulshettyPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchWindow {
	WebDriver driver;

	@BeforeTest()
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		//Parent p = new Child()
		Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
	}
	
@Test
public void switchwindowTest() {
	WebElement switchbutton = driver.findElement(By.xpath("//button[@id='openwindow']"));
	switchbutton.click();
	// now the window is switched	

	Set<String> windows = driver.getWindowHandles();
	
	for (String individual : windows) {
		
		
		
		
	}
	

	
	
	
	
	
}
	
	
	
	
	
}
