package practicing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suggestion2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement inputEle = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		inputEle.sendKeys("how to");
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));

		
		List <WebElement> suggestion = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']//div//span"));
		
		for(WebElement e : suggestion) {
			System.out.println(e.getText());
		}
		
		driver.quit();
	}
}
