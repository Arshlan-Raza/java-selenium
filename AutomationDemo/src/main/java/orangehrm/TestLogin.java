package orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		LoginPage lpg = new LoginPage(driver);
		lpg.setUsername("Admin");
		lpg.setPassword("admin123");
		
		lpg.clickLogin();
		
		Homepage hpg = new Homepage(driver) ;
		hpg.dropClick();
		hpg.logoutClick();
		
	}
}
