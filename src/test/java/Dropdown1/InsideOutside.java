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

public class InsideOutside {
	WebDriver driver;
	
	@Before
	
	public void inside() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
	}

	@Given("user is on selenium menu")
	public void user_is_on_selenium_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
	}

	@When("select inside & outside block level tag link and navigate")
	public void select_inside_outside_block_level_tag_link_and_navigate() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Inside & Outside Block Level Tag")).click();
	    
	}

	@When("check the links and inspect site")
	public void check_the_links_and_inspect_site() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("/html/body/p[1]/a")).click();
	    driver.findElement(By.linkText("About")).click();
	    driver.navigate().back();
	    
	    driver.findElement(By.linkText("Store")).click();
	    driver.findElement(By.className("A50Rne")).click();
	   
	    driver.navigate().back();
	    driver.navigate().back();
	    driver.navigate().back();
	    
	    driver.findElement(By.xpath("/html/body/a/div/span")).click();
	    
	}

	@Then("Page UI check")
	public void page_ui_check() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement email = driver.findElement(By.name("email"));
	    Assert.assertTrue(email.isDisplayed());
	    Assert.assertTrue(email.isEnabled());
	    
	    WebElement password = driver.findElement(By.name("pass"));
	    Assert.assertTrue(password.isDisplayed());
	    Assert.assertTrue(password.isEnabled());
	    
	    WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div"));
	    Assert.assertTrue(loginBtn.isDisplayed());
	    Assert.assertTrue(loginBtn.isEnabled());
	}


	@After
	public void In() {

	driver.quit();
}

}