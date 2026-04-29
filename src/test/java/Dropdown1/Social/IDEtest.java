package Dropdown1.Social;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IDEtest {

	WebDriver driver;
	


    @Before
    public void setup() {
    	if (driver == null) {
            driver = new ChromeDriver();
          
    		driver.get("https://demo.guru99.com/test/newtours/");}}
    		
    	
    	@Given("user in on login page")
    	public void user_in_on_login_page() {
    	    // Write code here that turns the phrase above into concrete actions
    		driver.findElement(By.className("dropdown-toggle")).click();
    		driver.findElement(By.linkText("Selenium IDE Test")).click();
    		
    	}

    	@When("user click on forget password link")
    	public void user_click_on_forget_password_link() {
    	    // Write code here that turns the phrase above into concrete actions
    	   driver.findElement(By.linkText("Forgot your password?")).click();
    	   driver.navigate().back();
    	   
    	}

    	@When("user enters email and password")
    	public void user_enters_email_and_password() {
    	    // Write code here that turns the phrase above into concrete actions
    	   driver.findElement(By.id("email")).sendKeys("sadu@123");
    	   driver.findElement(By.id("pass")).sendKeys("123456");
    	   
    	}

    	@When("user clicks on keep me logged in")
    	public void user_clicks_on_keep_me_logged_in() {
    	    // Write code here that turns the phrase above into concrete actions
    	    driver.findElement(By.id("persist_box")).click();
    	    
    	}

    	@Then("click on login button")
    	public void click_on_login_button() {
    	    // Write code here that turns the phrase above into concrete actions
    		driver.findElement(By.id("loginbutton")).submit();
    	}

    	 @After 
    	 public void test() {
    		 
    		 driver.quit();
    	 }

    }

