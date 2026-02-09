package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {


	private static WebDriver driver;

	public static WebDriver initDriver() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		String headless = System.getProperty("headless");

		if ("true".equalsIgnoreCase(headless)) {
			options.addArguments("--headless=new");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
		}
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void quitDriver() {
		if (driver != null)
			driver.quit();
	}
}

