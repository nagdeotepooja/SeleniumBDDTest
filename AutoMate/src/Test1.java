import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test1{
	
	public static WebDriver driver;
	
	@Test(priority=1)
	public void MSEdgeTest() throws MalformedURLException {
		EdgeOptions options = new EdgeOptions();
		driver = new RemoteWebDriver(new URL("http://192.168.1.222:4444/"), options);
		driver.get("https://www.baeldung.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	@Test(priority=1)
	public void ChromeTest() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://192.168.1.222:4444/"), options);
		driver.get("https://www.baeldung.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	@Test(priority=1)
	public void FirefoxTest() throws MalformedURLException {
		FirefoxOptions options = new FirefoxOptions();
		driver = new RemoteWebDriver(new URL("http://192.168.1.222:4444/"), options);
		driver.get("https://www.baeldung.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	
}