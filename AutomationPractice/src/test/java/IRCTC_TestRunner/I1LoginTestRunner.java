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
		plugin= {"pretty", "html:target/Report"}
		//tags={"@tag1 and @tag2"}
	)

public class I1LoginTestRunner {

}
