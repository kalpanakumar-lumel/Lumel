package testProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true, tags="@todo", glue={"TestProj"}, features="C:/Users/kalpana/workspace/LumelTest/src/test/resources/test.feature" )


public class TestRunner {
	

}
