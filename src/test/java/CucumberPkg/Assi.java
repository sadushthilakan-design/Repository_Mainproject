package CucumberPkg;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.When;



public class Assi {
	WebDriver driver;
	@When("User enters following credentials")
	public void user_enters_credentials(DataTable table) {
	    List<Map<String, String>> data = table.asMaps();
	    for (Map<String, String> row : data) {
	        System.out.println(row.get("username"));
	        System.out.println(row.get("password"));
	    }
	}

//	 @After 
//	    public void test() {
//	   	 
//	   	 driver.quit();
//	    }
}
