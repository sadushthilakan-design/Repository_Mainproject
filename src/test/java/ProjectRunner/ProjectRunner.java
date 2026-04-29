package ProjectRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Project",glue= {"PROJECt"},
	monochrome=true,
	plugin= {"pretty","junit:target/JUnitReports/report.xml"} )

	
	public class ProjectRunner  {

	}



