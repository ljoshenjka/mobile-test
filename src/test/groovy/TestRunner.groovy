import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.JUnitCore
import org.junit.runner.RunWith

/**
 * Created by aleksejs.trescalins on 10/09/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@test", plugin = [
        "html:build/cucumber/html", "json:build/cucumber/json/report.json", "pretty"])
class TestRunner {
}
