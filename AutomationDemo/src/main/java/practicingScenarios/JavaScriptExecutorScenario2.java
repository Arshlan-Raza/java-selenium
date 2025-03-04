package practicingScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScenario2 {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.ebay.com/sch/i.html?_nkw=books%20encyclopedias&norover=1&mkevt=1&mkrid=711-34002-13078-0&mkcid=2&mkscid=102&keyword=books%20encyclopedias&crlp=_&MT_ID=&geo_id=&rlsatarget=kwd-76759831037112:loc-90&adpos=&device=c&mktype=&loc=155620&poi=&abcId=&cmpgn=395402922&sitelnk=&adgroupid=1228154694868611&network=o&matchtype=p&msclkid=cb8020fcf1f910735c8b4739ce2d03bb");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i  = 0 ; i < 10 ; i++) {
			js.executeScript("window.scrollBy(0,500)");
		}
	}
}
