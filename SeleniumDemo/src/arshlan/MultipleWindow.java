package arshlan;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	
	static {
		System.setProperty("webdiver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		Thread.sleep(3000);
		
		String manWindowHandle = driver.getWindowHandle();
		
		
			
			driver.findElement(By.xpath("//div[@class='newtabs horizontal']//a[text()='Click Here']")).click();
			Thread.sleep(3000);
			
			Set<String> allOpenedWindow = driver.getWindowHandles();
			
			for(String currOpenedWin : allOpenedWindow) {
				if(currOpenedWin != manWindowHandle ) {
					driver.switchTo().window(manWindowHandle);
					break;
				}
					
			}
			
		
		Set<String> allWindowsOpened = driver.getWindowHandles();
		System.out.println("Number of opened window:"+allWindowsOpened.size());
		
		driver.quit() ;
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ; 
		
		MultipleWindow.myTest(driver);
		
	}

}
