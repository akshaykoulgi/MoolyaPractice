
package Students;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TextBoxTest {
	
WebDriver driver;	
	
@BeforeTest
public void setup() {
	
	//Local Variable Inside the method 
	
	// Write the code that is common for all the test cases/ Scripts 	
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	
}


	
@Test
public void firstTest() {
	
	
	
	
}

@Test
public void SecondTest()
	{

	
	
	
	
}

@Test
public void ThirdTest() {
	
	
	
	
}


@Test
public void FourthTest() {
	

	
	
}


@AfterTest
public void dissolve() {
	
// Logout 
	// click on settings and click on Logout
	driver.quit();
	
	
}
	
	

}




