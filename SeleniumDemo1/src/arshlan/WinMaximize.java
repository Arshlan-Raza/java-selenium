package arshlan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinMaximize {
	
	static {
		System.setProperty("webdiver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	
	}
	
	public static void myTest (WebDriver driver) {
		
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.close() ;
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		WinMaximize.myTest(driver);
		
	}
	

}
