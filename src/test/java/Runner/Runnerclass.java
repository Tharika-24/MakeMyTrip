package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature/Makemytrip.feature", glue = "Stepdefinition",publish = true,plugin = {"html:target/Reports/Report.html","json:target/Reports/Report.json"})


public class Runnerclass {
}