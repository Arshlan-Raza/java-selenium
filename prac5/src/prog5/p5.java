package prog5;


import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class p5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arsha\\eclipse-workspace\\prog5\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("file:///C:/Users/arsha/Downloads/html.html");
		
		
		Select s = new Select(d.findElement(By.xpath("//select")));
		
		List <WebElement> options = s.getOptions();
		System.out.println("the output is :");
		System.out.println(options.size());
	}

}
