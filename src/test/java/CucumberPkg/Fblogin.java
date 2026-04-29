package CucumberPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fblogin {

	
		WebDriver driver;
		
		
		@Given("user is navigated to the facebook login page")
		public void user_is_navigated_to_the_facebook_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			driver =new ChromeDriver();
			driver.get("https://www.facebook.com/");;
		}

		@When("user enters the email \"sadush@gmail.com")
		public void user_enters_the_email_sadush_gmail_com() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.name("email")).sendKeys("sadush@gmail.com");
		}

		@When("user enters the password\"sadu@{int}\"")
		public void user_enters_the_password_sadu(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.name("pass")).sendKeys("sadu@123");
		}

		@When("user clicks on login button")
		public void user_clicks_on_login_button() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]")).click();
		}

		@Then("user navigates into the facebook homepage")
		public void user_navigates_into_the_facebook_homepage() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println(driver.getCurrentUrl());
		}
//
//		 @After 
//		    public void test() {
//		   	 
//		   	 driver.quit();
//		    }



	}


