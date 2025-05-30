package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.setUsername("admin@yourstore.com");
		loginPage.setPassword("admin");
		loginPage.clickLogin();
		
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		
	}
}
