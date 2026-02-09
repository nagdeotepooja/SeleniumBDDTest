
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		//WebElement el = driver.findElement(By.id("fsdsd"));
		
		//action.moveToElement(el).build().perform();
		//action.scrollToElement(el).build().perform();
		
		//Select select = new Select(el);
		String elements = "//button[contains(text(),'Elements')]";
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elements)));
		element.click();
		String webTables = "//a[contains(text(),'Web Tables')]";
		WebElement webTable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webTables)));
		webTable.click();
		Actions action = new Actions(driver);
		WebElement add = driver.findElement(By.xpath("//button[text()='Add']"));
		WebElement addButton = wait.until(ExpectedConditions.visibilityOf(add));
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("C:\\redd"));
				
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);		
		
		action.moveToElement(addButton).build();
		
		 
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("alert('hello world');");
		Thread.sleep(10000);
		driver.quit();
		
		

	}

}
