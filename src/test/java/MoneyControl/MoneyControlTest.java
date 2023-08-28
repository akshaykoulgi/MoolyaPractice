package MoneyControl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoneyControlTest {
	
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://www.moneycontrol.com/");

	}
	
	
	@Test(enabled=true)
	public void MCTest() throws InterruptedException {
		
		//
		
		WebElement Firstlink = driver.findElement(By.xpath("//a[@href=\'https://www.moneycontrol.com\']"));

		
		WebElement PersonalFinanceLink = driver.findElement(By.xpath("(//a[@title='Personal Finance' and @href=\'https://www.moneycontrol.com/personal-finance/\'])[1]"));
		
		WebElement HomeLoanLink = driver.findElement(By.xpath("//a[@title=\"Home Loan Calculator\"]"));
		
		
		
		//Actions 
		
		// Mouse Hover on Personal Finance Link
		Thread.sleep(2000);

		
		Firstlink.click();
		
		Actions act = new Actions(driver);
		act.moveToElement(PersonalFinanceLink);
		
		
		// Click on HomeLoanLink
		Thread.sleep(2000);

		HomeLoanLink.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,350)","");
		
		js.executeScript("document.getElementById('promtButton').scrollIntoView()");
		
		
		
		
		
		
		
		
	
	}
}
