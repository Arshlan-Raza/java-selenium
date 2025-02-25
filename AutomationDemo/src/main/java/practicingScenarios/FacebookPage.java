package practicingScenarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		WebElement dateOfBirth = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select select = new Select(dateOfBirth);
		
		List<WebElement> options = select.getOptions();
		
		List<String> txt = new ArrayList<String>();
		
		for(WebElement e :options) {
			txt.add((e.getText()));
		}
		
		List<String> txt2 = new ArrayList<String>(txt);
		
		Collections.sort(txt);
		
		if(txt2.equals(txt)) {
			System.out.println("It's Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		
	}

}
