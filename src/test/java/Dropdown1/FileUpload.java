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

public class FileUpload {
 
	WebDriver driver;
	
	@Before
	
	public void file() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
	}
	@Given("user is on file upload page")
	public void user_is_on_file_upload_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("dropdown-toggle")).click();
	    driver.findElement(By.linkText("File Upload")).click();
	    }

	@When("user uploads a file")
	public void user_uploads_a_file() {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement upload= driver.findElement(By.name("uploadfile_0"));
	    upload.sendKeys("C:\\Users\\Sadush\\OneDrive\\Documents\\FOR TESTING PURPOSE.docx");
	    if (upload.getAttribute("value") != null) {
            System.out.println(" File selected successfully");
        } else {
            System.out.println(" File not selected");
        }
	    
	}

	@When("user accept terms")
	public void user_accept_terms() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("terms")).click();
	    
	}

	@Then("user submit the file")
	public void user_submit_the_file() {
	    // Write code here that turns the phrase above into concrete actions
	  WebElement submit=  driver.findElement(By.id("submitbutton"));
	    if (submit.isEnabled()) {
            submit.click();
            System.out.println("✅ File submitted");
        } else {
            System.out.println("❌ Submit button disabled");
        }

        
    }
	 @After 
	    public void test() {
	   	 
	   	 driver.quit();
	    }
	



}
