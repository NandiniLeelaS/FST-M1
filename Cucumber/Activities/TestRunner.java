package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\001ZLV744\\Desktop\\FST\\Cucumber\\src\\test\\java\\Features\\Activity2_5.feature",
        glue={"StepDefinitions"},
        tags = "@activity2_5",
        plugin = {"json: json-report.json"},
        monochrome = true
)

public class TestRunner {
}