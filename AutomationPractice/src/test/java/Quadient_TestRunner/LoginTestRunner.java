package Quadient_TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
       (
		features=".//Features/QuadientFeature.feature",
		glue="Quadient_StepDefinitionfiles",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:target/Report2"}
		
		)

public class LoginTestRunner {
}
