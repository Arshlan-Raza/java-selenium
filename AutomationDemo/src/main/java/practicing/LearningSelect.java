package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelect {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		WebElement ele = driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select slct = new Select(ele);
		
		slct.selectByIndex(2);
		
		driver.get("https://practice.expandtesting.com/dropdown");
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='elementsPerPageSelect']"));
		Select slct2 = new Select(ele2);
		slct2.selectByValue("50");
		
		driver.close();
		
		
		
//		elementsPerPageSelect
	}

}
