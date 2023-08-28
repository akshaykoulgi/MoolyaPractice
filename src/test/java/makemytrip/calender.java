package makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class calender {
WebDriver driver;
WebDriverWait wait;
	@BeforeTest
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://www.makemytrip.com/flights/");	
		Thread.sleep(2000);
		driver.navigate().refresh();		
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@Test(priority = 0)
	public void calenderTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@class='fswTabs latoRegular darkGreyText ']/li[@data-cy='roundTrip']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='fromCity']")).sendKeys("BLR");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='calc60' ])[5]")).click();
		
		driver.findElement(By.xpath("//*[@id='toCity']")).sendKeys("Dubai");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='calc60' ])[5]")).click();
		
		driver.findElement(By.xpath("(//*[@class='lbl_input appendBottom10'])[3]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@aria-label='Wed Aug 23 2023']")).click();
		
		driver.findElement(By.xpath("//*[@aria-label='Thu Aug 31 2023']")).click();
				
		driver.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn ' ]")).click();
	
	}
	
	
	  @Test(priority = 1) public void nextstep() throws InterruptedException {

		  //ok got it button(popup)
		  wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='makeFlex hrtlCenter right']/button")));
		  driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter right']/button")).click();
	  	 
	  }
	 
	
	
	
}
