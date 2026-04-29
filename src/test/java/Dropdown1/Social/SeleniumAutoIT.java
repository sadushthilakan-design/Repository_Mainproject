package Dropdown1.Social;

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


public class SeleniumAutoIT {
	WebDriver driver;
	SeleniumAutoIT page;


    @Before
    public void setup() {
    	if (driver == null) {
            driver = new ChromeDriver();
          
    		driver.get("https://demo.guru99.com/test/newtours/");
    		
    	}
        
    } 
	
	
	
	@Given("user in on Selenium Auto IT page")
	public void user_in_on_selenium_auto_it_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Selenium Auto IT")).click();
	
		}

	@Then("verify page title")
	public void verify_page_title() {
	}
	
	    // Write code here that turns the phrase above into concrete actions
		public boolean isTitleDisplayed() {
		    return driver.findElement(
		        By.xpath("//h1[contains(text(),'Selenium Auto IT')]")
		    ).isDisplayed();
		}
	
	@When("user click on Create a  course button")
	public void user_click_on_create_a_course_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("getjob")).click();
	    
	}

	@When("user click on Create an Article button")
	public void user_click_on_create_an_article_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("postjob")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("/html/body/form/div/ul/li[2]/div/input")).sendKeys("sadu");
	    driver.findElement(By.xpath("//*[@id=\"label_4\"]")).sendKeys("Sadu@123");
	    driver.findElement(By.className("qq-upload-button")).click();
	    WebElement upload= driver.findElement(By.name("uploadfile_0"));
	    upload.sendKeys("C:\\Users\\Sadush\\OneDrive\\Documents\\FOR TESTING PURPOSE.docx");
	    if (upload.getAttribute("value") != null) {
            System.out.println(" File selected successfully");
        } else {
            System.out.println(" File not selected");
            driver.findElement(By.name("q6_typeA6")).sendKeys("Testing");
            Thread.sleep(2000);
        }
	}

	@Then("user submit button click")
	public void user_submit_button_click() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//*[@id=\"input_2\"]")).submit();
	   
	}

	 @After 
	 public void test() {
		 
		 driver.quit();
	 }


}
