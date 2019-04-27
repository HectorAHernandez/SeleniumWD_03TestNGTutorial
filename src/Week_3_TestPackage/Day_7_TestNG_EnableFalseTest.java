package Week_3_TestPackage;

/* This java class contains multiple test (@Test) and can be executed standalone as TestNG test.

 *  */
import org.testng.annotations.Test;

public class Day_7_TestNG_EnableFalseTest {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Test     //Below the codes for one test.
	public void WebLoginHOMELoanTest() {
		System.out.println("HOME Loan WEB Login Test");
	}
	
	@Test(enabled=false)   // this makes a skip of this test execution, this is useful when we 
                          // know that there is a bug with this functionality and want to skip it.     
	public void CounterHOMELoanTest() {
		System.out.println("Counter HOME Loan Login Test");
	}
	
	@Test(enabled=false)
	public void MobileLoginHOMELoanTest() {
		System.out.println("HOME Loan MOBILE Login Test");
	}
	
	// below make this execution depending on completion of the indicated two methods
	@Test(dependsOnMethods= {"WebLoginHOMELoanTest"})   //Below the codes for another test.
	public void APILoginHOMELoanTest() {
		System.out.println("HOME Loan API Login Test");
	}
	
	@Test   //Below the codes for another test.
	public void BROWSERLoginHOMELoanTest() {
		System.out.println("Unique Browser HOME Loan API Login Test");
	}
}
