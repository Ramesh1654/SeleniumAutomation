package Orangehrm_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features=".//Features/HrmLoginFeature.feature",
		glue="Orangehrm_StepDefinitionFile",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:target/Report1"}
		
	)

public class LoginTestRunner {

}
