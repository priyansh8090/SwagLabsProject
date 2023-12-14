package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/features",glue = {"stepDefination", "Base"}, tags= "@tag", plugin = "html:targetreport/test.html") 
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
