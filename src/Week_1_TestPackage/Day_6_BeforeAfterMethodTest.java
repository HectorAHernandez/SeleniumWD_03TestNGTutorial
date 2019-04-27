package Week_1_TestPackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
/* This java class contains multiple test (@Test) and uses @BeforeMethod and @AfterMethod.
 @BeforeMethod: can be used to delete the cashe for the browser before each method execute, also to
 in API testing for for authenticate before each test because the token expiration every x minutes.
 
 Note: @BeforeMethod and @AfterMethod are at class execution level. 
       @BeforeClass and @AfterMethod are at class execution level.
       @BeforeTest and @AfterTest are at TestNG execution level.
       @BeforeSuite and @AfterSuite are at TestNG execution level.
 *  */
import org.testng.annotations.Test;

public class Day_6_BeforeAfterMethodTest {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Test     //Below the codes for one test.
	public void WebLoginHOMELoanTest() {
		System.out.println("HOME Loan WEB Login Test");
	}
	
	@AfterMethod
	public void AfterEveryMethod() {
		System.out.println("///// Execute AFTER Executing Every Method /////");
	}
	
	@BeforeMethod
	public void BeforeEveryMethod() {
		System.out.println("*** Execute before Executing Every Method ***");
	}
	
	
	@BeforeClass
	public void BeforeClassMethod() {
		System.out.println("====//=== Execute BEFORE Executing ALL Method in the class ====//===");
	}
	
	@AfterClass
	public void AfterClassMethod() {
		System.out.println("====//=== Execute AFTER Executing ALL Method in the class ====//===");
	}
	
	
	@Test   //Below the codes for another test.
	public void MobileLoginHOMELoanTest() {
		System.out.println("HOME Loan MOBILE Login Test");
	}
	
	@Test   //Below the codes for another test.
	public void APILoginHOMELoanTest() {
		System.out.println("HOME Loan API Login Test");
	}
	
	@Test   //Below the codes for another test.
	public void BROWSERLoginHOMELoanTest() {
		System.out.println("Unique Browser HOME Loan API Login Test");
	}
}
