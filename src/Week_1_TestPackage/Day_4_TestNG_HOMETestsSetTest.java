package Week_1_TestPackage;
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

public class Day_4_TestNG_HOMETestsSetTest {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Test     //Below the codes for one test.
	public void WebLoginHOMELoanTest() {
		System.out.println("HOME Loan WEB Login Test");
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
