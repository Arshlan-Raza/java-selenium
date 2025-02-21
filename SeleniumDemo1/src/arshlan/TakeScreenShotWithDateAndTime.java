package arshlan;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotWithDateAndTime {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void myTest(WebDriver driver) throws IOException {
		
		driver.get("http://www.google.com");
		
		Date d = new Date() ;
		String v = d.toString();
		String v2 = v.replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		String path = "C:\\SeleniumWebDriver\\Selenium\\photo"+v2+".png";
		
		System.out.println(path);
		
		
		File destFile = new File(path);
		FileUtils.copyFile(srcFile,destFile);
		driver.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver() ;
		TakeScreenShotWithDateAndTime.myTest(driver);
	}

}
