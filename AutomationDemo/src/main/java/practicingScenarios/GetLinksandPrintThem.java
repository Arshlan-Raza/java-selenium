package practicingScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinksandPrintThem {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count  = allLinks.size();
		for(int i = 0 ; i < 4 ;i++) {
			
			WebElement link = allLinks.get(i);
			String text = link.getText();
			String url = link.getDomProperty("href");
			System.out.println(text+"------->"+url);

	}
		driver.close();
	}
}
