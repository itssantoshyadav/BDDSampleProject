package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//feature//GooglePageSearch.feature",
		glue = {"stepDefinitions"}
		)
public class GooglePageRunner extends AbstractTestNGCucumberTests{

}
