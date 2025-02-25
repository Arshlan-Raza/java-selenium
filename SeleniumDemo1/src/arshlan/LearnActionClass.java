package arshlan;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionClass {
	
	static {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.codehelp.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='relative flex items-center justify-center py-4 transition-all duration-300']//span[text()='Explore']"))).build().perform();
		WebElement link = driver.findElement(By.linkText("/dashboard/quick-compiler"));
		builder.build().perform();
		Thread.sleep(3000);
		
		
		
		
	}

}
