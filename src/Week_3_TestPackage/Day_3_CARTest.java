package Week_3_TestPackage;
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

public class Day_3_CARTest {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Test     //Below the codes for one test.
	public void D3_0WebLoginCarLoanTest() {
		System.out.println("D3_1 00 CAR Loan WEB Login Test");
	}

	@Test(groups= {"Regression-1"})     //Below the codes for one test.
	public void D3_1WebTreatTest01() {
		System.out.println("Millionare D3_1 01 WebTreatTest01 Test");
	}

	@Test     //Below the codes for one test.
	public void D3_2WebContactTest02() {
		System.out.println("D3_2 02 CAR Loan WEB WebContactTest02 Test");
	}
	
	//@BeforeTest is used when we need to delete data before starting execution, or if we want to
	// Define the conditions before starting execution of all the @Test in all <class></class> included
	// in a module <test></test>, see testNGUsingBeforeAfterTest.xml, so the range of action 
	// of @BeforeTest is inside a Module (<test></test>). Note a Suite can contains multiples module, so 
	// there is another annotation @BeforeSuite for the whole suite range.
	@BeforeTest    
	public void D3_3BeforeTest() {
		System.out.println("**** This must print first D3_3BeforeTest ****");
	}
}
