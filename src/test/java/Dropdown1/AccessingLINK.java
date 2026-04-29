package Dropdown1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccessingLINK {
	WebDriver driver;
	@Before
	
	public void link() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	}

	@Given("user in on selenium menu")
	public void user_in_on_selenium_menu() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.className("dropdown-toggle")).click();
	}

	@When("user click Accessing link")
	public void user_click_accessing_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Accessing Link")).click();
	    
	}

	@When("user click the link")
	public void user_click_the_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("click here")).click();
	    
	    driver.navigate().back();
	    driver.findElement(By.linkText("click here")).click();
	    
	}

	@Then("user get the navigate URL")
	public void user_get_the_navigate_url() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.getCurrentUrl();
	   
	}
	 @After 
	    public void test() {
	   	 
	   	 driver.quit();
	    }



}
