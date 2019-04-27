package carLoan;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
/* This java class contains multiple test (@Test) and can be executed standalone as TestNG test.

 *  */
import org.testng.annotations.Test;

public class usingParameterInternalDataProvider {  // a java class can contains multiple test, identified by @Test annotation.
	
	// below is an example of using parameters as DataProvider defined internally in this class.
	// these parameters are only available to the @Test calling the dataProvider getData.
	@Test(dataProvider="getData")  //calling the dataProvider, will execute 3 times according the definition in getData.
	public void generateCreditReport(String userName, String password) {
		System.out.println("**** UserName: "+ userName + "Password: "+ password + " ****");
	}
	
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
	
	@DataProvider    //this internal DataProvider is defined as a method called getData().
	        // The @Test calling it will be executed multiple times based of the number of
	       // combination/rows defined for the object (user, in this case).
	           // the DataProvider as parameter ONLY is available for the @test calling it. this
	     // is different than the global or local parameters defined in the testNG xml file, which 
	     // are available for all the @test in the whole suite or for a particular MODULE.
	     
	public Object[][] getData() {
		//this dataProvide is created to pass parameter to a @test as 3 combinations of userName/password
		// Combination #1: userName, password -- to test when the user has Excellent Credit Score.
		// Combination #2: userName, password -- to test when the user has No credit history.
		// Combination #3: userName, password -- to test when the user has Fraudulent credit history.
		Object [][] user = new Object[3][2]; //define array of 3 rows and 2 columns (userName, password)
		// combination 1: user has Excellent Credit Score.
		user[0][0] = "firstUserName";
		user[0][1] = "firstPassword";
		// combination 2: user has No credit history.
		user[1][0] = "secondUserName";
		user[1][1] = "secondPassword";
		// combination 3 user has Fraudulent credit history
		user[2][0] = "thirdUserName";
		user[2][1] = "thirdPassword";
		
		return user;	
	}
	
}
