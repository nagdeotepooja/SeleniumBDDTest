package SingletonWithFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	public WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = DriverFactory.getDriver("firefox").createDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void testAppTitle() {
	 System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
