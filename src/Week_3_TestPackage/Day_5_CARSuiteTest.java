package Week_3_TestPackage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
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

public class Day_5_CARSuiteTest {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Test     //Below the codes for one test.
	public void D5_0WebLoginCarLoanTest() {
		System.out.println("D5_1 00 CAR Loan WEB Login Test");
	}

	@Test     //Below the codes for one test.
	public void D5_1WebTreatTest01() {
		System.out.println("D5_1 01 WebTreatTest01 Test");
	}

	@Test     //Below the codes for one test.
	public void D5_2WebContactTest02() {
		System.out.println("D5_2 02 CAR Loan WEB WebContactTest02 Test");
	}
	
	//@BeforeSuite is used when we need to delete data before starting execution, or if we want to
	// Define the conditions before starting execution of all the @Test in all <class></class> included
	// in ALL moduleS <test></test>, see testNGUsingBeforeAfterSuite.xml, so the the range of action of
	// @BeforeSuite the whole XML, including ALL ModuleS (<test></test>). 
	@BeforeSuite    
	public void D5_3BeforeSuite() {
		System.out.println("**** This must print first D5_3BeforeSUITE ****");
	}
}
