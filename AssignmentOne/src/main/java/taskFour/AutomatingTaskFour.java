package taskFour;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//Note -> Must be Signed in 

public class AutomatingTaskFour {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	
	public static void myScenario(WebDriver driver) throws AWTException {
		
		driver.get("https://www.zomato.com/bangalore/restaurants");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		String currWindow = driver.getWindowHandle();
		

		WebElement place = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='sc-iBmynh fTEupM']//section/p[text()='Best Rooftop Places']")));
		place.click();
		
		WebElement restaurant = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Mirage")));
		restaurant.click();
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(40, 40)");
		
		WebElement bookButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Book a Table")));
		bookButton.click();
		
		WebElement guest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='2 guests']")));
		guest.click();
		
		WebElement totalGuest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='10 guests']")));
		totalGuest.click();
		
		WebElement dinnerTime = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//div[text()='8:45 PM']")));
		dinnerTime.click();
		
		WebElement selectOffer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='NO OFFER']")));
		selectOffer.click();
		
		WebElement proceedBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Proceed to cart']")));
		proceedBtn.click();
	
		
	}
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver() ;
		AutomatingTaskFour t = new AutomatingTaskFour();
		t.myScenario(driver);
		
	}

}
