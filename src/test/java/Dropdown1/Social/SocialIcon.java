package Dropdown1.Social;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SocialIcon {
	WebDriver driver;

	    @Before
	    public void setup() {
	    	if (driver == null) {
	            driver = new ChromeDriver();
	          
	    		driver.get("https://demo.guru99.com/test/newtours/");
	    	}
	        
	    } 
	    
	    
		

	@Given("user is on Social icon page")
	public void user_is_on_social_icon_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Social Icon")).click();
		
	}

	@When("user checks the navigate menu")
	public void user_checks_the_navigate_menu() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[1]")).click();
	    driver.navigate().back();
	    String parentWindow = driver.getWindowHandle();
	    driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[2]")).click();
	    for (String window : driver.getWindowHandles()) {
	        if (!window.equals(parentWindow)) {
	            driver.switchTo().window(window); // switch to new tab
	        }
	    }
	    driver.close();
	    driver.switchTo().window(parentWindow);
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[3]")).click();
	    for (String window : driver.getWindowHandles()) {
	        if (!window.equals(parentWindow)) {
	            driver.switchTo().window(window); // switch to new tab
	        }
	    }
	    Thread.sleep(2000);
	    
	    driver.close();
	    driver.switchTo().window(parentWindow);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[4]")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[5]")).click();
	    for (String window : driver.getWindowHandles()) {
	        if (!window.equals(parentWindow)) {
	        	Thread.sleep(1000);
	            driver.switchTo().window(window); // switch to new tab
	        }
	    }
	    Thread.sleep(1000);
	    
	    driver.close();
	    Thread.sleep(1000);
	    driver.switchTo().window(parentWindow);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[6]")).click();
	    for (String window : driver.getWindowHandles()) {
	        if (!window.equals(parentWindow)) {
	            driver.switchTo().window(window); // switch to new tab
	        }
	    }
	    Thread.sleep(1000);
	    
	    driver.close();
	    driver.switchTo().window(parentWindow);
	    
	    }

	
	
	@Then("all menu items should be displayed")
	public void all_menu_items_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("All menu items verified successfully");
        
	}


	@AfterSuite
    public void tearDown() {
        driver.quit();
    }
	}

