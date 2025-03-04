package practicingScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameJQueryScenario {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement destEle = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceEle, destEle).perform();
	}
}
