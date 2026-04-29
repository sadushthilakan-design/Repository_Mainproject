package Dropdown1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;
	
	@Before
	
	public void file() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	@Given("user is on signup page")
	public void user_is_on_signup_page() {
	    // Write code here
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}
	@When("user clicks forgot password link")
	public void user_clicks_forgot_password_link() {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement forgotLink= driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
	    if (forgotLink.isDisplayed()) {
	        forgotLink.click();
	        System.out.println("Link clicked");
	    } else {
	        System.out.println("Link not found");
	    }
	}

	@When("user enter email and password")
	public void user_enter_email_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        email.sendKeys("sadu123@gmail.com");
        password.sendKeys("12345");
        
	}

	@Then("user click signup button")
	public void user_click_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
	}

	 @After 
	    public void test() {
	   	 
	   	 driver.quit();
	    }


}
