import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShadowRoot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		//Map<String, Object> prefs=new HashMap<String,Object>();
        //prefs.put("profile.default_content_setting_values.notifications", 2);
        
        //1-Allow, 2-Block, 0-default
        //options.setExperimentalOption("prefs",prefs);
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTest\\drivers\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://www.qatarairways.com/en-in/homepage.html");
		//driver.switchTo().frame("destination_publishing_iframe_qatarairways_0");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cookiebarNew")));
		System.out.println("expected cond..");
		WebElement modalContainerBefore = driver.findElement(By.id("cookiebarNew"));
		WebElement modalContainer = modalContainerBefore.findElement(By.className("modal-dialog"));
		
		//WebElement modalContentBody = modalContainer.findElement(By.xpath(".//div[@class='modal-body']"));
		
		WebElement modalAgreeButton = modalContainer.findElement(By.xpath(".//a[contains(text(),'Agree')]"));
		modalAgreeButton.click();
		
		//WebElement alert = (WebElement)js.executeScript("return document.querySelector(\"#cookie-accept-all\")");
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", alert);
		Robot r = new Robot();
		Thread.sleep(10000);
        
        WebElement sourceFrom =  (WebElement)js.executeScript("return document.querySelector(\"#cmp-container > div.booking-widget.section > app-nbx-explore\").shadowRoot.querySelector(\"#mat-input-3\")");
        WebElement destinationTo =  (WebElement)js.executeScript("return document.querySelector(\"#cmp-container > div.booking-widget.section > app-nbx-explore\").shadowRoot.querySelector(\"#mat-input-4\")");
	    
        String from = "arguments[0].setAttribute('value','Mumbai')";
        String to = "arguments[0].setAttribute('value','Pune')";
	
        sourceFrom.click();
        sourceFrom.clear();
        Thread.sleep(2000);
        sourceFrom.sendKeys("Mumbai");
        //((JavascriptExecutor)driver).executeScript(from, sourceFrom);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        //sourceFrom.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", destinationTo);
        Thread.sleep(2000);
        //((JavascriptExecutor)driver).executeScript(to, destinationTo);
        destinationTo.sendKeys("Pune");
        Thread.sleep(2000);
        //destinationTo.sendKeys(Keys.ENTER);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        WebElement continueBtn = (WebElement)js.executeScript("return document.querySelector(\"#cmp-container > div.booking-widget.section > app-nbx-explore\").shadowRoot.querySelector(\"app-bw-main > section > div > div > div > div:nth-child(1) > div > app-fl-tab-container > app-fh-tabs > app-fh-tab > div > app-flight-book > div.fl-desktop > form > div.ng-star-inserted > div > app-calendar > div > form > div > div.ng-tns-c86-6.dp-hidden.position-absolute.range > div > ngb-datepicker > div.footer-content.ng-tns-c86-6.ng-star-inserted > button\")");
        continueBtn.click();
        Thread.sleep(2000);
        WebElement searchFlights = (WebElement)js.executeScript("return document.querySelector(\"#cmp-container > div.booking-widget.section > app-nbx-explore\").shadowRoot.querySelector(\"app-bw-main > section > div > div > div > div:nth-child(1) > div > app-fl-tab-container > app-fh-tabs > app-fh-tab > div > app-flight-book > div.fl-desktop > form > div.fl-desktop-action-row > button\")");
        searchFlights.click();
	}

}
