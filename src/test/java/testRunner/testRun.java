package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//featureFiles//Login_Actitime03.feature" , ".//featureFiles//Login_Actitime.feature" },
glue={"cucumber"},
//tags="@Regression",
monochrome=true,
plugin= {"pretty", "html:test-output"}
)


public class testRun {

}
