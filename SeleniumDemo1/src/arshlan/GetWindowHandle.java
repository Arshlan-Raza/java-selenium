package arshlan;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	
	static {
		System.setProperty("webdiver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.makemytrip.com/");
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println("Number of browsers window opened :"+allWindowHandles.size());
		
		driver.close();
	}

}
