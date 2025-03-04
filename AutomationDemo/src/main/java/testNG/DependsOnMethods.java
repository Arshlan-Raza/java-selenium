package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test 
	public void CreateUser() {
		Reporter.log("User is created",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods="CreateUser")
	public void deleteUser() {
		Reporter.log("delete user",true);
	}
}
