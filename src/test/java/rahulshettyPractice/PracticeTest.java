package rahulshettyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class PracticeTest {
	
WebDriver driver;

	@Parameters("MyBrowser")
	@BeforeTest()
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		//Parent p = new Child()
		Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Automation"));
		
	}
	
	
	@Test()
	public void DropdownTest() throws InterruptedException {
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sel = new Select(dropdown);
		
		Thread.sleep(2000);
		
		// To select Option1 from dropdown
		sel.selectByValue("option1");
		Thread.sleep(2000);

		// To select option 2 
		Thread.sleep(2000);

		sel.selectByIndex(2);
		
		Thread.sleep(2000);

		// To select option 3 

		sel.selectByVisibleText("Option3");
		
		
	}

	
	
	@Test
	public void radioTest() throws InterruptedException {
		
		WebElement radio1  = driver.findElement(By.xpath("//input[@value='radio1']"));
		WebElement radio2  = driver.findElement(By.xpath("//input[@value='radio2']"));
		WebElement radio3  = driver.findElement(By.xpath("//input[@value='radio3']"));
		
		radio1.click();
		radio2.click();
		radio3.click();
		
		
		String actual =  driver.getTitle();
		System.out.println(actual);
		
		if(actual.equals("Practice Page")) {
			
			System.out.println("Assertion pass");
			
		}else
			
			System.out.println("Assertion fail");
		 // Assert.assertEquals(actual,"Practice Page");
		
	} 
	
	@Test
	public void CheckBoxTest() throws InterruptedException {
		
		WebElement checkbox1  = driver.findElement(By.id("checkBoxOption1"));
		WebElement checkbox2  = driver.findElement(By.id("checkBoxOption2"));
		WebElement checkbox3  = driver.findElement(By.id("checkBoxOption3"));

		System.out.println("Checking action");
		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
		
		Thread.sleep(3000);
		System.out.println("Uncheck action");
		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
	
	
	
	}
	
	
	@Test
	public void SuggestionBoxTest() throws InterruptedException {
		
		WebElement suggestbox  = driver.findElement(By.id("autocomplete"));
				
		suggestbox.sendKeys("India");
		Thread.sleep(3000);
		//India_option.click();
		Thread.sleep(1000);
		// iMPLEMENTING THROUGH Robot Class

	}
	
	
	
	@Test
	public void GmailTest() {
		
		driver.get("");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,50)");
		
		
		
		
		
	}
	
	
	@AfterTest
	public void laststep() {
		
		driver.quit();
			
	}
	
	
}
