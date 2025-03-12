package arshlan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver) throws IOException {
		
		driver.get("http://www.google.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\SeleniumWebDriver\\Selenium\\google.png");
		FileUtils.copyFile(srcFile,destFile);
		driver.close();
		
		
		driver.get("");
		TakesScreenshot ts1 = (TakesScreenshot) driver ;
		File srcFile1 = ts1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, destFile);
		
	}
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver() ;
		TakeScreenShot.myTest(driver) ;
	}

}
