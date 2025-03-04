package practicingScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassScenarios2 {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver () ;
		driver.get("https://www.actitime.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='actiTIME logo']"));
		
		Actions action = new Actions(driver);
		action.contextClick(ele).perform();
		
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_T);
		
	}
}

