package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/DropDown/Drop2",glue= {"Dropdown1"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml"} )

public class RunnerProje {

}
