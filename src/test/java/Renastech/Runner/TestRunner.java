package Renastech.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        glue ="Renastech/Step_Definitions",
        tags="@Smoke or @Regression",
        dryRun=false,
        plugin = {  "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
       // publish = true,
       // monochrome = true


)

public class TestRunner {
}
