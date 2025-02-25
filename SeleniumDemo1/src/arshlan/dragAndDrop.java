package arshlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement sourceElement =  driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destiElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions builder = new Actions (driver) ;
		Thread.sleep(3000);
		builder.dragAndDrop(sourceElement, destiElement).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
