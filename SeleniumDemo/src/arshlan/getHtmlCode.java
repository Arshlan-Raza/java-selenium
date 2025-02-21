package arshlan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getHtmlCode {
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver) {
		driver.navigate().to("https://www.google.com");
//		driver.get("https://www.google.com");
		String ps = driver.getPageSource();
		System.out.println(ps);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		getHtmlCode.myTest(driver);
		driver.quit() ;
	}
}
