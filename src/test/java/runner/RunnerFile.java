package runner;

//import io.cucumber.core.cli.Main;
import io.cucumber.testng.AbstractTestNGCucumberTests; 
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resorces/First_Cucumber_testing/test.feature",

glue = { "stepDefinition" },

plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

dryRun = false,

monochrome = true

)

public class RunnerFile extends AbstractTestNGCucumberTests {

}
