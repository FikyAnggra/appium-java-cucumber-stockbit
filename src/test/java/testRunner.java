import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-report/cucumberReport.html",
                "json:target/cucumber-report/cucumber.json"
        }
)
public class testRunner {
}
