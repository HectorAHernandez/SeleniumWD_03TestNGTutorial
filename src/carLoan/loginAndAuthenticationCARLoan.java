package carLoan;

import org.testng.annotations.Parameters;
/* This java class contains multiple test (@Test) and can be executed standalone as TestNG test.

 *  */
import org.testng.annotations.Test;

public class loginAndAuthenticationCARLoan {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Parameters({"parmGlobalURL"})   //Use the global parameter for URL
	@Test     //Below the codes for one test.
	public void authentication(String URL) {
		System.out.println("CAR Loan Authentication Initiating with URL: " + URL);
	}
	
	@Parameters({"Token/user", "parmGlobalURL"})  // Using local and global parameter together.
	@Test
	public void CounterAuthent(String token, String URL) {
		System.out.println("CAR Using local and Global parameter together, LOCAL token: "+token
				            +"GLOBAL url: " +URL);
	}
	
	@Parameters({"parmLocalURL","Token/user"})   //Use the local parameter for URL.
	@Test
	public void Login(String URL, String token) {
		System.out.println("CAR Loan Login initiating with URL: " + URL+ " Token: "+ token);
	}
}
