package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = 	"Feature",
		glue = {"stepDefition"}
		//, dryRun = true
		)

public class Test_Runner {

	
}
