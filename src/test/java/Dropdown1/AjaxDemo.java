package Dropdown1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjaxDemo {
	WebDriver driver;
	
	@Before
	public void Drop() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
	}
	@Given("user on selenium menu")
	public void user_on_selenium_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		
	}

	@When("user is navigate to Ajax demo")
	public void user_is_navigate_to_ajax_demo() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Ajax Demo")).click();
		
	
	}

	@When("user can select options")
	public void user_can_select_options() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("yes")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("no")).click();
	    
	}

	@When("user can click buttons and validate")
	public void user_can_click_buttons_and_validate() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("buttoncheck")).click();
	    
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("/html/body/div[2]/form/p[2]/input[1]")).click();
	}

	@Then("check page UI")
	public void check_page_ui() {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement message = driver.findElement(By.className("radiobutton"));
	        String actualText = message.getText();

	        String expectedText = "Radio button is checked and it's value is No";
	        Assert.assertEquals(expectedText, actualText);
	}

	@After
	public void Close() {
		driver.quit();
		
	}


}
