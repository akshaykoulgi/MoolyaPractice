package Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException  {

		// Setup for opening browser and Entering URL.
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	// Below are the Webelements locators for the textbox page elements
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='userName']"));
				
		WebElement email = driver.findElement(By.id("userEmail"));
						
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
	
		WebElement submitButton = driver.findElement(By.id("submit"));
		
		// Actions - for entering the details in textbox page.
		
		firstname.sendKeys("Meghana");
		email.sendKeys("meghana@gmail.com");
		currentAddress.sendKeys("Hyderabad");
		permanentAddress.sendKeys("america");
		Thread.sleep(2000);
		submitButton.click();
		
		Thread.sleep(2000);
		
		// Closing the browser
		driver.close();
		
		
	}

}
