package day6;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.selenium.dev/");
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		String windowid=driver.getWindowHandle();
		System.out.println(windowid);
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		
        WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement submitBtn= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submit']")));
		
		submitBtn.click();
		//driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		
		//Thread.sleep(5000);
		
		//To check if user is logged in successfully
		
		String Title=driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).getText();
		
		System.out.println(Title);
		
		boolean displayStatus=driver.findElement(By.xpath("//a[contains(text(),\"Log out\")]")).isDisplayed();
		
		System.out.println(displayStatus);
		
		boolean enableStatus=driver.findElement(By.xpath("//a[contains(text(),\"Log out\")]")).isEnabled();
		
		System.out.println(enableStatus);
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Log out\")]")).click();
		

	}

}
