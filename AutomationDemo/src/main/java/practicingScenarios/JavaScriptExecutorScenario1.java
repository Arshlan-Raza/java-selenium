package practicingScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScenario1 {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String msg = "Happy Day";
		
		js.executeScript("alert('"+msg+"')");
	}
}
