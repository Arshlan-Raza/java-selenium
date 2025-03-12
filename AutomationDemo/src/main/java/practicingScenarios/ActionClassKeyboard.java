package practicingScenarios;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassKeyboard {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/keyboard/");
		
		Actions	action = new Actions(driver);
		
		for(int i = 0 ; i < 10 ; i++) {
			action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		}
		
//		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
	}

}

