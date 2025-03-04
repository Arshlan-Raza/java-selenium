package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(id="Email")
	private WebElement userName;
	
	@FindBy(id="Password")
	private WebElement passWrd;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginBtn ;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String user) {
		userName.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		passWrd.sendKeys(pass);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}

}
