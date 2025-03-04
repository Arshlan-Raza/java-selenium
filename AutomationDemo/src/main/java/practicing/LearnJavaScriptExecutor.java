package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJavaScriptExecutor {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		
//		driver.get("https://www.google.com");
		driver.get("https://demoqa.com/");
		
        JavascriptExecutor jsEx = (JavascriptExecutor) driver;
        
//        jsEx.executeScript("alert('Hello! This is javascript executor')");
        
        WebElement ele = driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
        
        jsEx.executeScript("arguments[0].scrollIntoView(true);", ele);
        
        jsEx.executeScript("arguments[0].click();", ele);
        
        String title = (String) jsEx.executeScript("return document.title;");
        System.out.println("Page Title: " + title);

//        WebElement element = driver.findElement(By.id("elementId"));
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);


	}

}
