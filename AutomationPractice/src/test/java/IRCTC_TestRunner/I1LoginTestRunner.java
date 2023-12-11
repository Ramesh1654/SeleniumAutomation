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
		tags="@tag1",//"Scenarios under @tag1 will be Executed"
		//plugin= {"pretty", "html:target/Report"}
       // plugin = {"json:target/cucumber.json"}
        plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)

public class I1LoginTestRunner {

}
