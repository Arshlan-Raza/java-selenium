package orangehrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage{
	@FindBy(className = "oxd-userdropdown-tab")
	private WebElement dropBtn;
	
	@FindBy(linkText="Logout")
	private WebElement logoutBtn ;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void dropClick() {
		dropBtn.click();
	}
	
	public void logoutClick() {
		logoutBtn.click();
	}
	
	
}