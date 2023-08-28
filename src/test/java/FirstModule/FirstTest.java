package FirstModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstTest {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
	
		//WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);

		WebElement username =  driver.findElement(By.name("username"));
		
		WebElement password =  driver.findElement(By.name("password"));
		WebElement Loginbtn =  driver.findElement(By.xpath("//button"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		Loginbtn.click();
		
		driver.close();
		
		
		
	}

}
