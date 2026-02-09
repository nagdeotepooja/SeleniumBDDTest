package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;
import utils.ScreenshotUtil;

public class Hooks {

	 @Before
	    public void setUp() {
	        DriverFactory.initDriver();
	        //System.out.println("^^^^^^^^^^^^^^^^"+DriverFactory.initDriver());
	    }
	 
	 @After
	    public void tearDown(Scenario scenario) {
		 if (scenario.isFailed()) {
			 ScreenshotUtil.capture(DriverFactory.getDriver(),
					 scenario.getName().replaceAll(" ", "_"));
		 }
		 DriverFactory.quitDriver();
	 }
	
	
}
