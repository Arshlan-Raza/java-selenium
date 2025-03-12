package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// there are various ways you can use to switch to a frame,
//such as using index,name,webElement and more 
//driver.switchTo.frame()

public class HandlingFrames {
	
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		
		driver.switchTo().frame(frame3);
		driver.switchTo().frame(0);
		
//		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Hey you are here!");
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
//		js.executeScript("window.scrollTo(0,500)");
		
		driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
		

	}

}
