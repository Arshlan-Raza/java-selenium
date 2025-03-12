package practicingScenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreensht {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com");
		
		TakesScreenshot ts = (TakesScreenshot) driver ; 
		
		File srcFile  = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\arsha\\OneDrive\\Pictures\\Ryujinx\\google.png");
		
		
		FileUtils.copyFile(srcFile,dest);
		
	}

}
