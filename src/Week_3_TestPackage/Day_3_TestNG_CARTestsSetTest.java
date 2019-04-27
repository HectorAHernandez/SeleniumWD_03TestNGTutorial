package Week_3_TestPackage;
/* This java class contains multiple test (@Test) and can be executed standalone as TestNG test.
 * We can run multiple java class together from one or more TestPackge (Week_1_TestPackage), for this
 * we need to CONVERT the project (TestNGTutorial) to TestNG, this will create an XML file that we will
 * be used for running all java class. To convert, the following steps:
 * 	1- Right click on the project's name.
 * 	2- Click on TestNG option.
 * 	3- Click on Convert to TestNG.
 * 	4- Update the Suite name: Example, WeeklyTestSuite.
 * 	5- Update the Test Name: Example, Week1Test.
 *  6- Click on Finish. 
 *  
 *  A new project's folder will be created name TestNG with contains the testng.xml file with all the
 *  java class (Day_1_TestNG_TestsSetTest, Day_2_TestNG_TestsSet) to be executed.
 *  
 *  To execute all the test together, right click on the XML file (testng.xml) and click on the 
 *  Run As --> TestNG Suite option.
 *  */
import org.testng.annotations.Test;

public class Day_3_TestNG_CARTestsSetTest {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Test     //Below the codes for one test.
	public void WebLoginCarLoanTest() {
		System.out.println("00 CAR Loan WEB Login Test");
	}

	@Test     //Below the codes for one test.
	public void WebTreatTest01() {
		System.out.println("01 WebTreatTest01 Test");
	}

	@Test     //Below the codes for one test.
	public void WebContactTest02() {
		System.out.println("02 CAR Loan WEB WebContactTest02 Test");
	}

	@Test     //Below the codes for one test.
	public void WebFrontierTest03() {
		System.out.println("03 WebFrontierTest03 Test");
	}

	@Test   //Below the codes for another test.
	public void MobileLoginCarLoanTest() {
		System.out.println("CAR Loan MOBILE Login Test");
	}
	
	@Test   //Below the codes for another test.
	public void MobileLump01() {
		System.out.println("01 CAR Loan MOBILE Login Test");
	}
	
	@Test   //Below the codes for another test.
	public void MobilePacificCarLoanTest02() {
		System.out.println("02 MobileLump01 Test");
	}
	
	@Test   //Below the codes for another test.
	public void MobileInternationalTest03() {
		System.out.println("03 MobileInternationalTest03 Test");
	}
	
	@Test   //Below the codes for another test.
	public void MobileCatTest04() {
		System.out.println("04 MobileCatTest04 Test");
	}
	
	@Test   //Below the codes for another test.
	public void MobileCarTest05() {
		System.out.println("05 MobileCarTest05 Test");
	}
	
	@Test   //Below the codes for another test.
	public void APILoginCarLoanTest() {
		System.out.println("CAR Loan API Login Test");
	}
}
