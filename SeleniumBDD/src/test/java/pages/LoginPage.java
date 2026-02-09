package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ElementUtil;

public class LoginPage {

	WebDriver driver;
    ElementUtil util;

    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        util = new ElementUtil(driver);
    }

    public void login(String user, String pass){
        util.enterText(username, user);
        util.enterText(password, pass);
        util.click(loginBtn);
    }
	
	
}
