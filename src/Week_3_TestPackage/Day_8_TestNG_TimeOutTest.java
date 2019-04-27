package Week_3_TestPackage;
/* This java class contains timeOut definition before cancelling execution.
 *  */
import org.testng.annotations.Test;

public class Day_8_TestNG_TimeOutTest {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Test     //Below the codes for one test.
	public void WebLoginHOMELoanTest() {
		System.out.println("HOME Loan WEB Login Test");
	}
	
	@Test(timeOut=4000)   // this gives a timeout, for the an slow test to continue execution up until 
                          // 4000 miliseconds before cancelling.     
	public void CounterHOMELoanTest() {
		System.out.println("Counter HOME Loan Login Test");
	}
	
	@Test
	public void MobileLoginHOMELoanTest() {
		System.out.println("HOME Loan MOBILE Login Test");
	}
	
	@Test
	public void APILoginHOMELoanTest() {
		System.out.println("HOME Loan API Login Test");
	}
	
	@Test   //Below the codes for another test.
	public void BROWSERLoginHOMELoanTest() {
		System.out.println("Unique Browser HOME Loan API Login Test");
	}
}



