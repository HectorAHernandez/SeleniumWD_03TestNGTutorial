package personalLoan;

import org.testng.Assert;
import org.testng.annotations.Parameters;
/* This java class contains multiple test (@Test) and can be executed standalone as TestNG test.

 *  */
import org.testng.annotations.Test;

public class loginAndAuthenticationPERSONALLoan {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Parameters({"parmGlobalURL"})    //Use global parameter for URL
	@Test     //Below the codes for one test.
	public void authentication(String URL) {  //Receives global parameter for URL
		System.out.println("PERSONAL Loan Authentication Initiating with URL: " + URL);
	}
	
	@Test
	public void CounterAuthent() {
		System.out.println("PERSONAL Loan Counter Authentication");
		Assert.assertTrue(false);
	}
	
	@Parameters({"parmLocalURLPersonal","password"})   //Use local parameter for URL
	@Test
	public void Login(String URL, String password) { //Receives local parameter for URL
		System.out.println("PERSONAL Loan Login initiating with URL: " + URL
				       + " Local parm password: " + password);
	}
}
