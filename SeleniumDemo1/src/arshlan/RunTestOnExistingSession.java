package arshlan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// step 1 : Open cmd 
// step 2 : go to the path where chrome.exe is located (C:\Program Files\Google\Chrome\Application)
// step 3: then run the script as chrome.exe --remote-debugging-port-9988 --user-data-dir-C:\SeleniumWebDriver\ChromeDriver\chromedata
//step 4 : run the below code 

public class RunTestOnExistingSession {
	
	static {
		System.setProperty("webdiver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions() ;
		opt.setExperimentalOption("debuggerAddress", "localhost:9988");
		WebDriver driver = new ChromeDriver (opt) ;
		
		driver.get("https://www.google.com");


	}

}
