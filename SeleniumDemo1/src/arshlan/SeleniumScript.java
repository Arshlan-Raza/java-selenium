package arshlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdiver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);

		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);

		driver.findElement(By.className("orangehrm-login-button")).click();
		Thread.sleep(3000);
		
		driver.close();

		
	}

}
