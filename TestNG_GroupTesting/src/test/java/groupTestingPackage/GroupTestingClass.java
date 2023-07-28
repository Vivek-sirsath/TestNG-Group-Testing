package groupTestingPackage;

import org.testng.annotations.Test;

@Test(groups="CompleteClassLevelTestsGroup")
public class GroupTestingClass {

	@Test(groups= {"smoke"})
	public void tc1() {
		System.out.println("This is T1 test logic");
	}
	
	@Test(groups= {"smoke", "sanity"})
	public void tc2() {
		System.out.println("This is T2 test logic");		
	}
	
	@Test(groups= {"smoke", "sanity", "regression"})
	public void tc3() {
		System.out.println("This is T3 test logic");
	}
	
	@Test(groups= {"sanity"})
	public void tc4() {
		System.out.println("This is T4 test logic");
	}
	
	@Test(groups= {"regression"})
	public void tc5() {
		System.out.println("This is T5 test logic");
	}
}
