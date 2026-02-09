import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VrifyBrokenLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTest\\drivers\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.manage().window().maximize();
         driver.findElement(By.linkText("Performance Dashboard")).click();
         List<WebElement> listUrls = driver.findElements(By.tagName("a"));
         System.out.println("No of links are "+ listUrls);  
         
         for(int i=0; i<listUrls.size(); i++) {
        	 WebElement url = listUrls.get(i);
        	 String link = url.getAttribute("href");
        	 verifyBrokenLink(link);
         }
         
         driver.quit();

	}

	private static void verifyBrokenLink(String link) throws IOException {
		
		URL url = new URL(link);
		
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		
		urlConnection.setConnectTimeout(5000);
		urlConnection.connect();
		
		if(urlConnection.getResponseCode()>=400) {
			System.out.println("Broken link message:"+urlConnection.getResponseMessage()+"::"+"Broken links: "+ link);
		}
		else {
			System.out.println("Working links: "+link);
		}
		
	}

}
