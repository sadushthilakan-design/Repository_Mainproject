package PROJECt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Selenium {
	
	WebDriver driver;
	@Before
	
	public void setup() {
	
	driver =new ChromeDriver();
    driver.get("https://demo.guru99.com/test/newtours/");
    driver.manage().window().maximize();
	}
    
	
	@Given("user is on Guru99 Demo site")
	public void user_is_on_guru99_demo_site() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    
	}

	@When("user hovers on selenium menu")
	public void user_hovers_on_selenium_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
	    
	}

	@When("user click on Flash movie demo")
	public void user_click_on_flash_movie_demo() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[1]/a")).click();
	    
	}

	@Then("user should navigate to flash movie demo")
	public void user_should_navigate_to_flash_movie_demo() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.getTitle();
	    
	}
	
	@Then("buttons are clickable")
	public void buttons_are_clickable() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("Play")).click();
	    }

	
	

 
	@When("user hovers and click on selenium menu")
	public void user_hovers_and_click_on_selenium_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.className("dropdown-toggle")).click();
	}

	@When("user click on Radio & Check box demo")
	public void user_click_on_radio_check_box_demo() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a")).click();
	}

	@Then("user should navigate to Radio &Check box menu")
	public void user_should_navigate_to_radio_check_box_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.getCurrentUrl();
	    
	}
	
	@Then("user select option2")
	public void user_select_option2() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
	}

	@Then("user click on checkbox1")
	public void user_click_on_checkbox1() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"vfb-6-0\"]")).click();
	}

	
	//Insurance 

	
	
	@Given("user is on insurance registration page")
	public void user_is_on_insurance_registration_page() {
	 
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[3]/a")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/a")).click();
	   
	}

	@When("user enters all required datas")
	public void user_enters_all_required_datas() {
	    // Write code here that turns the phrase above into concrete actions
	    //title dropdown
		
		Select dropdown= new Select(driver.findElement(By.name("title")));
		dropdown.selectByIndex(0);
		
		// NAME
		driver.findElement(By.id("user_firstname")).sendKeys("Sadush");
		driver.findElement(By.id("user_surname")).sendKeys("NT");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		
		// DATE OF BIRTH
		Select year= new Select(driver.findElement(By.name("year")));
		year.selectByVisibleText("1995");
		
		
		Select month=new Select(driver.findElement(By.name("month")));
		month.selectByVisibleText("November");
		
		
		Select date =new Select(driver.findElement(By.name("date")));
		date.selectByVisibleText("29");
		
		driver.findElement(By.name("licencetype")).submit();
		
		Select period=new Select(driver.findElement(By.name("licenceperiod")));
		period.selectByVisibleText("2");
		
		//OCCUPATION
		
		Select occupation=new Select(driver.findElement(By.name("occupation")));
		occupation.selectByValue("7");
		
		driver.findElement(By.name("street")).sendKeys("Cheeral");
		driver.findElement(By.name("city")).sendKeys("Sulthan bathery");
		driver.findElement(By.name("county")).sendKeys("India");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("675676");
		driver.findElement(By.name("email")).sendKeys("sadush@123");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("sad123");
		driver.findElement(By.name("c_password")).sendKeys("sad123");
		
	
		
			
			
			
		
	}

	@When("user submit regstration form")
	public void user_submit_regstration_form() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]")).submit();
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.getCurrentUrl();
	}


	
	// LOGIN PAGE
	
	@Given("user is on Guru99 insurance login page")
	public void user_is_on_guru99_insurance_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[3]/a")).click();
	}

	@When("user enter Email and Password")
	public void user_enter_email_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("email")).sendKeys("sadush@123");
	    driver.findElement(By.name("password")).sendKeys("sad123");
	    
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();
	    
	}

	@Then("user should navigate to insurance page")
	public void user_should_navigate_to_insurance_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    
	    //LOGOUT
	   driver.findElement(By.xpath("/html/body/div[3]/form/input")).submit();
	
	}

	 @After
	 public void tearDown() {
	      driver.quit();
	 
	        
	 }   

	 }

