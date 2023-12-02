package IRCTC_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features=".//Features/LoginFeature.feature",
		glue="IRCTC_StepDefinitionFile",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:/target/Report"}
	)

public class I1LoginTestRunner {

}
