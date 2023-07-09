package runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features\\ChangeBackground.feature",
		glue="steps",
		//tags="Scenario",
		monochrome= true,
		dryRun= false,
		plugin= {
				"pretty",
				"html:target/reports/cucumber.html",
				"json:target/reports/json"
				
		}
		
		)

public class BackgroundRunner {

}
