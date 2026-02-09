package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

	LoginPage loginPage;
    DashboardPage dashboard;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        loginPage = new LoginPage(DriverFactory.getDriver());  // driver
    }

    @When("user logs in with valid credentials")
    public void user_logs_in() throws InterruptedException {
    	Thread.sleep(5000);
        loginPage.login("Admin", "admin123");
        dashboard = new DashboardPage(DriverFactory.getDriver());
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() throws InterruptedException {
    	
    	Thread.sleep(5000);
        Assert.assertTrue(dashboard.isDashboardDisplayed());
    }
	
	
}
