package FirstModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAppTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement username =  driver.findElement(By.id("username"));
		
	    WebElement password = driver.findElement(By.id("password"));
	    
	    WebElement logout = driver.findElement(By.xpath("//i[@class='icon-lock']"));
	    
	    WebElement loginbtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
	    
	    username.sendKeys("tomsmith ");
	    
	    password.sendKeys("SuperSecretPassword");
	    
	    loginbtn.click();
	    
	    logout.click();
	    
	    
	}

}
