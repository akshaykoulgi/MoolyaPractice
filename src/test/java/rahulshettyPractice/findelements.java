package rahulshettyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
			WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.olffi.com/about.html");
		
		 // List<WebElement> Options = driver.findElements(By.xpath("//*[@class='dropdown-toggle' and text()='tools']/following-sibling::ul/li"));

		
			List<WebElement> elements = driver.findElements(By.tagName("li"));
		  System.out.println("Program starts");
		  
		  
		  for (WebElement webElement : elements) {
			
			  String text = webElement.getText();
			  System.out.println(text);
		}
		 System.out.println("ENds"); 
	}

}
