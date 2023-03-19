package StepsDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepsDefinitions"},
plugin = {"pretty", "html:target/HtmlReports",
        "json:target/cucumber-report/cucumber.json",
        "junit:target/cucumber-report/cucumber.xml"})

public class TestRunner{
	

}
