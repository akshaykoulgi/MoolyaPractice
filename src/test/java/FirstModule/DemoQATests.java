package FirstModule;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQATests {
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();

		Thread.sleep(2000);

		
	}
	
	@Test(enabled=true)
	public void TextBoxTest() {
		driver.get("https://demoqa.com/text-box");		

		WebElement Fullname =  driver.findElement(By.id("userName"));
		
		WebElement Email =  driver.findElement(By.id("userEmail"));
		
		WebElement CurrentAddress =  driver.findElement(By.id("currentAddress"));
		
		WebElement PermanentAddress =  driver.findElement(By.id("permanentAddress"));
		
		WebElement SubmitButton =  driver.findElement(By.id("submit"));

		
		Fullname.sendKeys("Akshay");
		Email.sendKeys("akshay.kou@gmail.com");
		CurrentAddress.sendKeys("20 / b vijaynagar");
		PermanentAddress.sendKeys("Hubli");
		
	}
	
	@Test(enabled=false)
	public void RadioTest() {
		driver.get("https://demoqa.com/radio-button");
		
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
		
		
	}
	
	
	
	@Test(enabled=true)
	public void CheckBoxTest() throws InterruptedException {
		driver.get("https://demoqa.com/checkbox");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@class='rct-collapse rct-collapse-btn'])[1]")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//*[@class='rct-collapse rct-collapse-btn'])[2]")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//*[@class='rct-checkbox'])[3]")).click();
		
		
	}
	
	@Test(enabled=false)
	public void WebTablesTest() {
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.id("addNewRecordButton")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("akshay");
		driver.findElement(By.id("lastName")).sendKeys("koulgi");
		driver.findElement(By.id("age")).sendKeys("21");

		driver.findElement(By.id("salary")).sendKeys("100000");
		//department
		driver.findElement(By.id("department")).sendKeys("100000");
		//submit
		driver.findElement(By.id("submit")).click();

		
	}
	
	@Test
	public void clickactionsTest() {
		
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement dblclick = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		
		//Actions act = new Actions(driver);
		
		Actions act = new Actions(driver);
		act.moveToElement(rightclick).build().perform();
		
		//act.doubleClick(dblclick).build().perform();
		//act.contextClick(rightclick).build().perform();
		
		
		
		String title =  driver.getTitle();
		
		System.out.println(title);
		
	}
	
	

	@Test
	public void AlertTest() throws InterruptedException {
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(500);
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(2000);
		
		// allert appears after clicking
		
		Alert alt = driver.switchTo().alert();
		
		//alt.accept();
		alt.dismiss();
		
	
	}
	
	

	
	
	@Test
	public void WindiwswitchTest2() {
		
		driver.get("https://demoqa.com/browser-windows");
		String windId = driver.getWindowHandle();
		System.out.println(windId);
		WebElement WindowButton = driver.findElement(By.id("windowButton"));
		for(int i =0;i<3;i++) {
			
			WindowButton.click();
			
		}
		
	 Set<String> WindowIds = driver.getWindowHandles();
		
		System.out.println(WindowIds.size());
		
		String sa = "";
		
		
		for(String id:WindowIds) {
			
			driver.switchTo().window(id);
			driver.get("https://www.google.com/");
		}
		
		driver.switchTo().window(windId);
		
	}
		

	
	@AfterTest
	public void laststep() {
		
		driver.quit();
			
	}
	
	
	

}
