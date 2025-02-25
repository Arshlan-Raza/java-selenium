package practicing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningCheckBox {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver () ;
		driver.get("https://practice.expandtesting.com/checkboxes");
		
		List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//a[@class='my-link']"))).build().perform();
		System.out.println(allCheckBox.size());
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		for(WebElement e : allCheckBox) {
			wait.until(ExpectedConditions.elementToBeClickable(e)).click();
		}
		
		Thread.sleep(3000);
		
//		for(WebElement e : allCheckBox) {
//			wait.until(ExpectedConditions.elementToBeClickable(e)).click();
//		}
		driver.close();
	}

}
