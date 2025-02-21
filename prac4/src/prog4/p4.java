package prog4;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import  org.openqa.


public class p4 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", null)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arsha\\eclipse-workspace\\Pro1\\driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver ();
		
		d.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AdF4I7459qv21a8kbCPITWGSALfeSMdKoMwkvotjYlrqw-azhymKVdoKjL1hCopLQJWSaRnSWYfTKQ&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-418665798%3A1722869526779827&ddm=0");
		
		int link = d.findElements(By.tagName("a")).size();
		
		System.out.println("Number of links are :"+link);
		
		for(int i = 0  ; i < link ; i++) {
			String r = d.findElements(By.tagName("a")).get(i).getText();
            System.out.println(r);

		}
		d.quit();

	}

}
