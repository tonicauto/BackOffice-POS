import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "timeline:src/timeline-report"},
        features = "src/test/resources/features/authentication"
)
public class LoginTestSuite {}
