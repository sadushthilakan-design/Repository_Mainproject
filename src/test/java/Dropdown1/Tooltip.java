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

public class Tooltip {
	private static WebDriver driver;
	@Before
	public void tool() {
		
				driver =new ChromeDriver();
				driver.get("https://demo.guru99.com/test/newtours/");
		
	}
	@Given("user is on tooltip page")
	public void user_is_on_tooltip_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Tooltip")).click();
	}

	@When("user checks UI elements")
	public void user_checks_ui_elements() {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();

        // UI Check - Title
        if (title.contains("Tooltip")) {
            System.out.println(" Title is correct");
        } else {
            System.out.println(" Title is incorrect");
        }

        // UI Check - Heading
        WebElement heading = driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/h1"));
        if (heading.isDisplayed()) {
            System.out.println(" Heading is displayed");
        } else {
            System.out.println(" Heading not displayed");
        }

      
        
    }
	

	@Then("verify download button functionality using if condition")
	public void verify_download_button_functionality_using_if_condition() {
	    // Write code here that turns the phrase above into concrete actions
		  // UI Check - Button
        WebElement button = driver.findElement(By.id("download_now"));
        if (button.isDisplayed() && button.isEnabled()) {
            System.out.println(" Download button is visible");
        } else {
            System.out.println(" Button not visible");
	}



	}
	
	 @After 
	    public void test() {
	   	 
	   	 driver.quit();
	    }
}
