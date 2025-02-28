
package taskThree;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Myntra.com

public class ShopWebPageTwo {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	} 
	
	
	
	public void addToCart(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.shoppersstop.com//");
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
//		WebElement searchBar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='What are you looking for?']")));
//		searchBar.sendKeys("shirt");
		
		WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='MEN']")));
		input.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(1200, 1200)");
		
		// item which i want to add to cart 
		WebElement itemToAdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='JACK AND JONES']")));
		itemToAdd.click();
		
		// switching to the window 
		List<String> itemWindow = new ArrayList<>(driver.getWindowHandles());

		// Switch to the new tab (the last window in the list)
		driver.switchTo().window(itemWindow.get(itemWindow.size() - 1));
		
		//select item size 
		WebElement itemSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Large']")));
		itemSize.click();
		
		Thread.sleep(3000);
		
		//add the item to cart 
		WebElement itemAdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Add to bag']")));
		itemAdd.click();
		
		driver.navigate().back();

		//checking if the item has been added 
		WebElement itemCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='shopping-cart']")));
		itemCart.click();
		
	}
	
	public void deleteFromCart(WebDriver driver) throws InterruptedException {
		
		addToCart(driver);
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		WebElement itemCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='remove product']")));
		itemCart.click();
		
		WebElement removeConfirm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']//p[text()='submit']")));
		removeConfirm.click();
	}
	
	public void checkOut(WebDriver driver) throws InterruptedException {
		addToCart(driver);
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		WebElement placeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='PLACE ORDER']")));
		placeBtn.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		ShopWebPageTwo obj = new ShopWebPageTwo();
//		obj.addToCart(driver);
		obj.deleteFromCart(driver);
//		obj.checkOut(driver);
//		
		
	}
}
