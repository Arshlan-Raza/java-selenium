package taskThree;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Myntra.com

public class ShopWebPageOne {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	} 
	
	
	
	public void addToCart(WebDriver driver) {
		
		driver.get("https://www.myntra.com/");
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		//searching some items to add to cart 
		WebElement searchBar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='desktop-searchBar']")));
		searchBar.sendKeys("shoes");
		
		WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Shoes For Men']")));
		input.click();
		
		// item which i want to add to cart 
		WebElement itemToAdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='adeboy Men Colourblocked Sneakers']")));
		itemToAdd.click();
		
		// switching to the window 
		List<String> itemWindow = new ArrayList<>(driver.getWindowHandles());

		// Switch to the new tab (the last window in the list)
		driver.switchTo().window(itemWindow.get(itemWindow.size() - 1));
		
		//select item size 
		WebElement itemSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='8']")));
		itemSize.click();
		
		
		
		//add the item to cart 
		WebElement itemAdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='ADD TO BAG']")));
		itemAdd.click();

		//checking if the item has been added 
		WebElement itemCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Bag']")));
		itemCart.click();
		
	}
	
	public void deleteFromCart(WebDriver driver) {
		
		addToCart(driver);
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		WebElement removeItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='REMOVE']")));
		removeItem.click();
		
		
		WebElement removeConfirm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='inlinebuttonV2-base-actionButton ']")));
		removeConfirm.click();
	}
	
	public void checkOut(WebDriver driver) {
		addToCart(driver);
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		WebElement placeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='PLACE ORDER']")));
		placeBtn.click();
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		ShopWebPageOne obj = new ShopWebPageOne();
		obj.deleteFromCart(driver);
		obj.checkOut(driver);
		
		
	}
}
