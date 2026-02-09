import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/menu/");
		//WebElement el = driver.findElement(By.id("fsdsd"));
		
		//action.moveToElement(el).build().perform();
		//action.scrollToElement(el).build().perform();
		 //= "//a[text()='Main Item 2']";
        Actions action = new Actions(driver);
		WebElement mainItem = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        
		Thread.sleep(3000);
		action.moveToElement(mainItem).perform();
		System.out.println("Main item 2");
		
		WebElement subSubList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
		Thread.sleep(3000);
		action.moveToElement(subSubList).perform();
		System.out.println("Sub Sub list");
		
		WebElement subSubItem2 = driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));
		
		Thread.sleep(3000);
		action.moveToElement(subSubItem2).perform();
		System.out.println("Sub sub Item 2");	
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("alert('hello world');");
		Thread.sleep(10000);
		driver.quit();
		
		

	}

}
