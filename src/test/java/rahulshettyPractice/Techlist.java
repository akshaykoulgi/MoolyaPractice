package rahulshettyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Techlist {
	WebDriver driver;
	
@BeforeTest
public void setup() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	driver.get("https://www.techlistic.com/");
	Thread.sleep(2000);

	
}
	

@Test
public void TechTest() throws InterruptedException {
	Thread.sleep(2000);

	
	WebElement automation = driver.findElement(By.xpath("(//a[@href='https://www.techlistic.com/p/selenium-tutorials.html'])[3]"));

	Actions act = new Actions(driver);

	act.moveToElement(automation).build().perform();



  List<WebElement> Options = driver.findElements(By.tagName("a"));

//we will create a for loop and iterate over these 8 options

//We will get the text of each option and compare it with our desired option to select

String desiredOption = "JMETER: Performance Testing";

//WebElement automation = driver.findElement(By.linkText("Automation"));

//Mousehover action

Thread.sleep(5000);

for (WebElement we : Options) {
	
	//String opt= we.getText();
	//System.out.println(opt);
	
	if(we.getText().contains("APP")) {
		we.click();
		System.out.println("clicked");
		break;
	}
	
}

///*
//  for(int i=0;i<Options.size();i++) {
//  
//  System.out.println(Options.get(i).getText());
//  
//  //we want to check each option and get text from it
//  
//  if(Options.get(i).getText().contains("Appium")) { 
////In these 8 options we are iterating over each option(get(i)) and we are getting the text from each option
//  
//  Thread.sleep(2000);
//  
//  Options.get(i).click();
//  
//  System.out.println("Clicked");
//  
//  break;
//  
//  }*/
  
  }
 
}




	

