package Students;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
	
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}

	@Test
	public void HomePageTest() {
		
		
		
	}
	
	
	
}
