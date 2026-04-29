package CucumberPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoCucum {
	WebDriver driver;
	WebElement element;
	
	@Given("open the browser")
	public void open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	    
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	     element = driver.findElement(By.id("APjFqb"));
	}

	@And("hits enters")
	public void hits_enters() {
	    // Write code here that turns the phrase above into concrete actions
	    element.submit();
	}
	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.getTitle());
	}


//	 @After 
//	    public void test() {
//	   	 
//	   	 driver.quit();
//	    }

}
