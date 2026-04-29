package Dropdown1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDownMenu{
	WebDriver driver;
	
	
		@Before
		
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.guru99.com/test/newtours/");
	    
	
		
		
	}
	@Given("user is on selemiun menu")
	public void user_is_on_selemiun_menu() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.className("dropdown-toggle")).click();
		
		
	}

	@When("user click Tabledemo")
	public void user_click_tabledemo() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[3]/a")).click();
	    
	}

	@When("user should navigate to TableDemo page")
	public void user_should_navigate_to_table_demo_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		    String title = driver.getTitle();

		    if(title.contains("Table")) {
		        System.out.println("Navigated to Table Demo page");
		    } else {
		        System.out.println("Navigation failed");
		    }
		}
	

	@Then("user should print table")
	public void user_should_print_table() {
	    // Write code here that turns the phrase above into concrete actions
		 List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));

		    for(int i = 0; i < rows.size(); i++) {

		        List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

		        for(int j = 0; j < cols.size(); j++) {
		            System.out.print(cols.get(j).getText() + "   ");
		        }

		        System.out.println();
		    }
	}
		    
		    @After
		    public void tearDown() {
		        driver.quit(); //
	}

	


}

