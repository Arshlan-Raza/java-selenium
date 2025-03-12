package taskOne;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Note -> The code is not working fully

public class AutomatingTaskOne {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	
	public static void myScenario(WebDriver driver) throws AWTException {
		
		driver.get("https://gfsstore.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='gordon-now-chatbot']")));

		driver.switchTo().frame(iframe); 
		WebElement closeBtn = driver.findElement(By.xpath("//button[@id='close-chat-window']"));
		closeBtn.click();
		
		WebElement iframe2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='fab-dismiss']")));
		iframe2.click();
		
		driver.switchTo().defaultContent();
		
		WebElement signUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu-item-21']")));
		signUp.click();

		WebElement createAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login\"]//a[text()='Create Account']")));
		
		createAccount.click();
		
		
	}
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver() ;
		AutomatingTaskOne t = new AutomatingTaskOne();
		t.myScenario(driver);
		
	}

}
