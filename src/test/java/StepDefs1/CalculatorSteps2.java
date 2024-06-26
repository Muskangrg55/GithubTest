package StepDefs1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps2 {
	

int result;
	
	int res1;
	
	
	@Given ("I open calculator")
	
	public void i_open_calculator() {
		
		System.out.println("Open Calculator");
	}
		
	@When ("I div {int} by {int}")
	
	public void i_div_and(int i, int j) {
		
		result=i/j;
		
		System.out.println("Division");	
		
	}
	
	@Then (" I should get div result {int}")
	
	public void i_should_get_div_result (int r) {
	
	System.out.println("Assertion");
	}
	
}		


