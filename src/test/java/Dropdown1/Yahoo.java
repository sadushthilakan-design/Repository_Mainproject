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

public class Yahoo {
	
	WebDriver driver;
	
	@Before
		public void yahoo() {
			driver =new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
	}
	
	@Given("user navigate to the Yahoo link")
	public void user_navigate_to_the_yahoo_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Yahoo")).click();
		
	}

	@When("user can select the links")
	public void user_can_select_the_links() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("pager1")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("pager2")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("pager3")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("pager4")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("pager5")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("pager6")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("pager7")).click();
	    
	}

	@When("user can download yahoo through the link")
	public void user_can_download_yahoo_through_the_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"messenger-download\"]")).click();
	    
	        try {
	            // Locate the download link
	            WebElement link = driver.findElement(By.linkText("Download"));

	            // Check if link is displayed & enabled
	            if (link.isDisplayed() && link.isEnabled()) {
	                link.click();
	                System.out.println("✅ Link is working - Download started");
	            } else {
	                System.out.println("❌ Link is present but not clickable");
	            }

	        } catch (Exception e) {
	            System.out.println("❌ Cannot download through the link");
	            System.out.println("Reason: " + e.getMessage());
	        }
	    	}

	@When("user gets page title")
	public void user_gets_page_title() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.getTitle();
	    
	}

	@Then("title  should be {string}")
	public void title_should_be(String expectedTitle) {
	    // Write code here that turns the phrase above into concrete actions
		

		    String actualTitle = driver.getTitle();
		    System.out.println("Actual Title: " + actualTitle);

		    if (actualTitle.equals(expectedTitle)) {
		        System.out.println("✅ Title matched - Test Passed");
		    } else {
		        System.out.println("❌ Title not matched - Test Failed");
		        System.out.println("Expected: " + expectedTitle);
		        System.out.println("Actual: " + actualTitle);
		    }
		    }


		@After
		public void s() {
			
			driver.quit();
			
		}
		
}


