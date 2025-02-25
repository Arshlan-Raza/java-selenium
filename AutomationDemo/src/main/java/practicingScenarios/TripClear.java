package practicingScenarios;



import java.util.concurrent.TimeUnit; 
import java.util.List; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions; 
public class TripClear { 
	static {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	}
	
public static void main(String[] args) { 
ChromeOptions chromeOptions=new ChromeOptions(); 
chromeOptions.addArguments("--disable-notifications"); 
WebDriver driver=new ChromeDriver(chromeOptions); 
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
driver.get("http://www.cleartrip.com"); 
driver.findElement(By.id("FromTag")).sendKeys("bang"); 
driver.findElement(By.xpath("//p[contains(text(),'BLR')]")).click(); 
driver.findElement(By.id("ToTag")).sendKeys("goa"); 
driver.findElement(By.xpath("//p[contains(text(),'GOI')]")).click(); 
driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click(); 
driver.findElement(By.id("SearchBtn")).click(); 
List<WebElement> 
price=driver.findElements(By.xpath("//th[@class='price']")); 
System.out.println("Total number of flight is "+price.size()); 
for(int i=1;i<price.size();i++){ 
String a = price.get(i-1).getText().substring(1).replaceAll(",",""); 
int a1 = Integer.parseInt(a); 
String b = price.get(i).getText().substring(1).replaceAll(",",""); 
int b1 = Integer.parseInt(b); 
System.out.println("Comparing "+a1+" with "+b1); 
if(a1<=b1){ 
System.out.println("Pass.."); 
} 
else{ 
System.out.println("Fail.."); 
}}}} 