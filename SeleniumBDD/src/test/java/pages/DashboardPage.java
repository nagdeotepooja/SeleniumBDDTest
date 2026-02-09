package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	
	WebDriver driver;
    
	
	// Elements xpath
    By dashboardText = By.xpath("//h6[text()='Dashboard']");
    // Parametrized Constructor
    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }
    
    // Browser actions
    public boolean isDashboardDisplayed(){
        return driver.findElement(dashboardText).isDisplayed();
    }

}
