package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/HomeAssignment.feature",glue="stepDefenition",publish=true)
public class RunnerHome extends AbstractTestNGCucumberTests{

}
