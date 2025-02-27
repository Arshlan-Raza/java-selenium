package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("http://www.actitime.com"); 
		Thread.sleep(4000);
		WebElement menu = driver.findElement(By.xpath("//div[@class='features__menu-item']")); 
		//Mouse hover on the menu 
		Actions actions=new Actions(driver); 
		actions.moveToElement(menu).build().perform(); 
		driver.findElement(By.partialLinkText("Leave")).click();
	}

}


