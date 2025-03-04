package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(id="username")
private WebElement unTB;

@FindBy(id="password")
private WebElement pwd;

@FindBy(xpath = "//button[text() = ' Login ']")
private WebElement loginBtn ; 

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setUsername(String un) {
	unTB.sendKeys(un);
}

public void setPassword(String pass) {
	pwd.sendKeys(pass);
}

public void clickLogin() {
	loginBtn.click();
}


}
