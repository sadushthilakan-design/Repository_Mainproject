package Dropdown1;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteCustomer {

	WebDriver driver;
	@Before
	
	public void test() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
	}

	@When("user navigate to delete form page")
	public void user_navigate_to_delete_form_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.className("dropdown-toggle")).click();
	    driver.findElement(By.linkText("Delete Customer Form")).click();
	    
	}

	@When("enter customer ID and delete customer")
	public void enter_customer_id_and_delete_customer() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("cusid")).sendKeys("9988");
	   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	   Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.accept();
		
	}

	@When("check reset button")
	public void check_reset_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("cusid")).sendKeys("9999");  
		
		driver.findElement(By.name("res")).click();
	}

	@Then("verify the user delete valid user")
	public void verify_the_user_delete_valid_user() {
	    // Write code here that turns the phrase above into concrete actions
		

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    // ===== First Alert (Confirmation) =====
		    wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();

		    // Verify confirmation message
		    String expectedMsg = "Do you really want to delete this Customer?";
		    Assert.assertEquals(alert.getText(), expectedMsg);

		    alert.accept(); // Click OK

		    // ===== Second Alert (Success) =====
		    wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert2 = driver.switchTo().alert();

		    // Verify success message
		    String successMsg = alert2.getText();
		    Assert.assertEquals(successMsg, "Customer deleted Successfully");

		    alert2.accept(); // Close alert
		}
	
	 @After 
	    public void close() {
	   	 
	   	 driver.quit();
	    }
	}



