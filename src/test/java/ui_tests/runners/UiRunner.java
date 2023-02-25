package ui_tests.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/uiFeatures",
        glue = "ui_test/stepDefinitions",
        tags = "@task1",
        dryRun = true,
        plugin={"pretty","json:target/uiReport.json","html:target/uiReport.html","rerun:target/uiFailedTests.txt"})
public class UiRunner {

}
