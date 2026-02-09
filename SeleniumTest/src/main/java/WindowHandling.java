import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<>();
		int num = 0;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("profile.managed_default_content_settings.images=2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTest\\drivers\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(options);
        
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Capture handle of Parent Window
		String Window0 = driver.getWindowHandle();
		System.out.println("handle of Parent Window is: " + Window0);
		if(!map.containsKey(num)) {
			map.put(num++, Window0);
		}
		
		//Capture handle of First Child Window
		driver.findElement(By.id("windowButton")).click();
		Set<String> s1 = driver.getWindowHandles();
		String Window1=null;
		for(String secondWin : s1) {
			if(!secondWin.equalsIgnoreCase(Window0)) {
				driver.switchTo().window(secondWin);
				Window1 = driver.getWindowHandle();
				System.out.println("handle of first Child Window is: " + Window1);
				if(!map.containsKey(num)) {
					map.put(num++, Window1);
				}
			}
		}
		
		driver.switchTo().window(map.get(0));
		//Capture handle of Second Child Window
		driver.findElement(By.id("messageWindowButton")).click();
		Set<String> s2 = driver.getWindowHandles();
		String Window2 = null;
		for(String thirdWin : s2) {
			if(!thirdWin.equalsIgnoreCase(Window0) && !thirdWin.equalsIgnoreCase(Window1)) {   // 
				driver.switchTo().window(thirdWin);
				Window2 = driver.getWindowHandle();
				System.out.println("handle of second Child Window is: " + Window2);
				if(!map.containsKey(num)) {
					map.put(num++, Window2);
				}
			}
		}
		
		System.out.println(map);
		driver.switchTo().window(map.get(1));
		driver.close();
		map.remove(1);
		//System.out.println("Is Window1 available: "+Window1);
		driver.switchTo().window(map.get(2));
		driver.close();
		map.remove(2);
		
		Set<String> s3 = driver.getWindowHandles();
		System.out.println(s3);
		System.out.println(map);
		driver.switchTo().window(map.get(0));
		
		driver.findElement(By.id("windowButton")).click();
		Set<String> s4 = driver.getWindowHandles();
		System.out.println(s4);
		String Window3=null;
		for(String forthWin : s4) {
			if(!forthWin.equalsIgnoreCase(Window0)) {
				driver.switchTo().window(forthWin);
				String txt = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(txt);
				Window3 = driver.getWindowHandle();
				System.out.println("handle of new first Child Window is: " + Window3);
				if(!map.containsKey(1)) {
					map.put(1, Window3);
				}
			}
		}
		System.out.println(s4);
		System.out.println(map);
		


		//driver.close();
		driver.quit();

	}

}
