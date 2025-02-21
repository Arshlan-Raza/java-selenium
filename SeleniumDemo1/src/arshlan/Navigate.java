package arshlan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	static {
		System.setProperty("webdiver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");	
	}
	
	public static void myTest (WebDriver driver) {
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.gmail.com");
		
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		Navigate.myTest(driver);
		driver.navigate().back();
		
	}

}
