package Hooks1;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class HooksTest2 {
	
	@Before("@Smoke")
	public void setup() {
		System.out.println("Launch the browser - Order 1");
	}
	
	
	@After("@Regression")
	public void tearDown() {
		System.out.println("Close the browser - Order 1");
	}
	
	@Before("@Regression")
	public void setup1() {
		System.out.println("Launch the browser - Order 2");
	}
	
	
	@After()
	public void tearDown2() {
		System.out.println("Close the browser - Order 2");
	}
	
	@BeforeStep
	public void newstep() {
		System.out.println("Before Step");
	}
	
	@AfterStep
	public void newstep1() {
		System.out.println("After Step");
	}
	

}


