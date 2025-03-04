package practicingScenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassScenario {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ; 
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement price = driver.findElement(By.linkText("Pricing"));
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(price).keyUp(Keys.CONTROL).perform();
		Set<String> allWh = driver.getWindowHandles();
		
		for(String wh : allWh) {
			driver.switchTo().window(wh);
			System.out.println("The title for the window:"+driver.getTitle());
		}
		
		driver.close();
		driver.quit();;
	}
}
