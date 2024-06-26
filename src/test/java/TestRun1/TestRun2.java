package TestRun1;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class TestRun2 {
	

	@RunWith(Cucumber.class)
	@CucumberOptions
		(
		features={"Test2.feature"},
		glue={"StepDefs1","Hooks1"},
		dryRun=false,
		monochrome=true,
		tags= {"@Smoke","@Regression"},
		plugin= {"pretty","html:test-output"}
		)

	public class TestRun{
		
	}
}



