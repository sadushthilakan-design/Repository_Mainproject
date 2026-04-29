package CucumberPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assign {

	
		WebDriver driver;
		
		
		
		
		@Given("user is on login page")
		public void user_is_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		}

		@When("user enters valid username and password")
		public void user_enters_valid_username_and_password() throws InterruptedException {
		   driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]")).sendKeys("Sadush1123");
		   driver.findElement(By.name("pass")).sendKeys("sadu123");
		    Thread.sleep(2000);
		    
		}

		@When("clicks on login button")
		public void clicks_on_login_button() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]")).click();
		    Thread.sleep(2000);
		}

		@Then("user should be redirected to homepage")
		public void user_should_be_redirected_to_homepage() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.get("https://www.facebook.com/");
		}

//		 @After 
//		    public void test() {
//		   	 
//		   	 driver.quit();
//		    }


	}


