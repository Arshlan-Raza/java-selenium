package practicingScenarios;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		WebElement input = driver.findElement(By.id("input-4"));
		
		File sourceFile = new File("D:\\Placement\\EffiGO\\Cover_Pg.png");
		String path = sourceFile.getAbsolutePath();
		
		input.sendKeys(path);
		
	}

}
