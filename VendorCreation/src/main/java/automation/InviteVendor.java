package automation;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InviteVendor {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://thermax-dpt-qa2.effigo.in/upeg/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input[@id='userNameId']")));
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input[@id='passwordId']")));

		username.sendKeys("saroj");
		password.sendKeys("Bob@1234");
		
		WebElement signInBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input[@id='sighInId']")));
		signInBtn.click();
		
		
		WebElement vendorInvitation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Vendor Invitation")));
		js.executeScript("arguments[0].scrollIntoView();", vendorInvitation);

		vendorInvitation.click();
		
		WebElement vendorLegalName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("vendorLegalName")));
		vendorLegalName.sendKeys("Yuri");
		
		WebElement stateSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("vendorcompanyRegisterState")));
		
		Select objSelect = null;
		objSelect = new Select(stateSelection);
		objSelect.selectByVisibleText("Uttar Pradesh");
	
		WebElement panNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("vendorPanNumber")));
		panNumber.sendKeys("QWERT1234Z");

		WebElement verifyBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("verifyBtn")));
		verifyBtn.click();
		
//		WebElement  userAvailablity = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='vebdor_fssai_VEN-667']")));
//		String value = userAvailablity.getAttribute("value");
//		System.out.println(value);
		
//		if(!value.isEmpty()) {
//			js.executeAsyncScript("window.alert('user already registered please try with a new user')");
//		}
//		else {
//			WebElement createVendor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Create New Vendor']")));
//			createVendor.click();
//		}
		
		WebElement createVendor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Create New Vendor']")));
		createVendor.click();
		
		WebElement companyType = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("companyTypeId")));
		objSelect = new Select(companyType);
		objSelect.selectByContainsVisibleText("Private Limited");
		
		WebElement typeOfVendor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("typeOfVendor")));
		objSelect = new Select(typeOfVendor);
		objSelect.selectByContainsVisibleText("Agent");

		WebElement siteName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("siteName")));
		siteName.sendKeys("yuri pvt");
		
		js.executeScript("arguments[0].scrollIntoView();", siteName);
		
		WebElement regiAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='regiAddress']")));
		regiAddress.sendKeys("Melbo stree 12");
		
		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='city']")));
		city.sendKeys("kanpur");
		
		WebElement postalZip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("postalCode")));
		postalZip.sendKeys("123456");
		
		WebElement vendorEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("companyEmail")));
		vendorEmail.sendKeys("ciyise8267@exclussi.com");
		
		WebElement phonNum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("phoneNum")));
		phonNum.sendKeys("9876543210");
		
		WebElement contactPerson = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("contactPerson")));
		contactPerson.sendKeys("yuri");
		
		js.executeScript("arguments[0].scrollIntoView();", contactPerson);
		
		WebElement contactPersonDesig = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("contactPersonDesig")));
		contactPersonDesig.sendKeys("Manager");
		
		WebElement mobileNum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobileNum")));
		mobileNum.sendKeys("9876543210");
		
		WebElement loginuser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("loginuser")));
		loginuser.sendKeys("yuri");

		driver.navigate().to("https://thermax-dpt-qa2.effigo.in/portal/");
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Vendor Username: ");
		String vendorUsername = scanner.nextLine();

		System.out.print("Enter Vendor Password: ");
		String vendorPassword = scanner.nextLine();

		WebElement vendorUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userNameId")));
		
		WebElement vendorPass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordId")));
		vendorUser.sendKeys(vendorUsername);
		vendorPass.sendKeys(vendorPassword);
		
		
		
	}
}
