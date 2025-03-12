package practicingScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Resizable.html");
		WebElement elementX = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		WebElement elementY = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']"));

		
		Actions action = new Actions(driver);
		
		action.clickAndHold(elementX).moveByOffset(200,0).release().build().perform();
		action.clickAndHold(elementY).moveByOffset(0,200).release().build().perform();

	}

}
