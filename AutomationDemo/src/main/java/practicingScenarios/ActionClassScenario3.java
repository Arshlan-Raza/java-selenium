package practicingScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassScenario3 {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement sourceEle = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement destiEle = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(sourceEle, destiEle).perform();
	}
}

				

