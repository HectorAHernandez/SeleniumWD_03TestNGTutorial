package Week_2_TestPackage;
import org.testng.annotations.AfterTest;
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

public class Day_2_PersonalTest {  // a java class can contains multiple test, identified by @Test annotation.
	
	@Test     //Below the codes for one test.
	public void D2_1_PERSONAL_printWelcomeBackTest() {
		System.out.println("D2-1 PERSONAL Loan Welcome Back successfully printed");
	}
	
	//@AfterTest is used when we want to execute some test or settings after completion of all the @Test
	// in all <class></class> included in a module <test></test>, see testNGUsingBeforeAfterTest.xml, so 
	// the range of action of @AfterTest is inside a Module (<test></test>). Note a Suite can contains multiples module, so 
	// there is another annotation @AfterSuite for the whole suite range.
	@AfterTest
	public void D2_4_AfterTest() {
		System.out.println("**** This must print LAST D2_4_AfterTest ****");
	}
	
	@Test   //Below the codes for another test.
	public void D2_2_PERSONAL_printGoodByeTest() {
		System.out.println("D2-2 PERSONAL Loan Good Bye successfully printed");
	}
	
	@Test(groups= {"Regression-1"})   //Below the codes for another test.
	public void D2_3_PERSONAL_IamAMillionareTest() {
		System.out.println("D2-3 Week-2 PERSONAL Loan I am a gratefull millionare!!!! ");
	}	
}
