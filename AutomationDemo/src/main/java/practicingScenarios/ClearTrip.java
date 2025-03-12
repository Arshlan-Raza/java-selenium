package practicingScenarios;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/flights");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement from = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Where from?']")));
		from.sendKeys("bang");
		driver.findElement(By.xpath("//p[contains(text(),'BLR')]")).click(); 
		
		WebElement to = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Where to?']")));
		to.sendKeys("");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Goa')]"))).click();


		WebElement dateButton = driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']"));
		dateButton.click();
		
		WebElement todaysDate = driver.findElement(By.xpath("//div[contains(@class,'Day-grid')]//div[text() = '27']"));
		todaysDate.click();
		
		driver.findElement(By.xpath("//h4[text() = 'Search flights']")).click();
		
		List<WebElement> pricesElement = driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-700 c-neutral-900 ta-right false']"));
		Set<Integer> prices = null;
		
		for(WebElement e : pricesElement) {
			System.out.println(e.getText());
		}
		
//		for(WebElement e : pricesElement) {
//			String priceText = e.getText();
//			int price = Integer.parseInt(priceText.replaceAll("[^\\d]", ""));
//			prices.add(price);
//		}
//		
//		for(int e : prices) {
//			System.out.println(e);
//		}
		
		
		
//		driver.close();
		
	}
}
