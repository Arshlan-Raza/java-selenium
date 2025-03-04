package testNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider
	public Object[][] getData(){
		Object data[][] = new Object[2][2];
		data[0][0] ="UserA";
		data[0][1] = "UserA123";
		
		data[1][0] = "UserB";
		data[1][1] = "UserB123";
		
		return data;
		
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un , String pass) {
		Reporter.log("Create User:"+un+"Pass:"+pass,true);
	}

}
