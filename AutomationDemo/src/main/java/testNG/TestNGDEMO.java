package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDEMO {
	
	@Test(priority = 1)
	public void print() {
		//To print "let me see" on console, then use s.o.p(). 
		//To print on both console & report page, then use "true". 
		//To print only in report page, then use "false".
		Reporter.log("Hey this is just a example",true);
	}

}
