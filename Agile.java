package PROJECt;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Agile {
WebDriver driver;
	


    @Before
    public void setup() {
    	if (driver == null) {
            driver = new ChromeDriver();
//           
                ChromeOptions options = new ChromeOptions();
//
//                // Disable password popup
               options.addArguments("--incognito");
//                options.addArguments("--disable-notifications");
//                options.addArguments("--disable-infobars");
//                options.addArguments("--disable-extensions");
//
//                Map<String, Object> prefs = new HashMap<>();
//                prefs.put("credentials_enable_service", false);
//                prefs.put("profile.password_manager_enabled", false);
//
//                options.setExperimentalOption("prefs", prefs);
//
                driver = new ChromeDriver(options);  // ✅ only once
                driver.manage().window().maximize();

                driver.get("https://demo.guru99.com/test/newtours/");
////                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////                wait.until(ExpectedConditions.urlContains("manager"));
            }
    		}
    
	
	@Given("user is on Agile project page")
	public void user_is_on_agile_project_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Agile Project")).click();
	    
	}

	@When("enter username and  password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("uid")).sendKeys("1303");
	    driver.findElement(By.name("password")).sendKeys("Guru99");
	    
	}
 
	@When("user click the login button")
	public void user_click_the_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("btnLogin")).submit();
	   Thread.sleep(2000);
	   
//	   Alert alert=driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
//		Thread.sleep(2000);
//	   ChromeOptions options = new ChromeOptions();
//
//	   options.addArguments("--disable-notifications");
//	   options.addArguments("--disable-save-password-bubble");
//
//	   Map<String, Object> prefs = new HashMap<>();
//	   prefs.put("credentials_enable_service", false);
//	   prefs.put("profile.password_manager_enabled", false);
//
//	   options.setExperimentalOption("prefs", prefs);
//
//	   WebDriver driver = new ChromeDriver(options);
//	   options.addArguments("--disable-infobars");
//	   options.addArguments("--disable-extensions");
//	   options.addArguments("--disable-save-password-bubble");
	}

	@When("explore the navigated page")
	public void explore_the_navigated_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		  ChromeOptions options = new ChromeOptions();

		   options.addArguments("--disable-notifications");
		   options.addArguments("--disable-save-password-bubble");

		   Map<String, Object> prefs = new HashMap<>();
		   prefs.put("credentials_enable_service", false);
		   prefs.put("profile.password_manager_enabled", false);

		   options.setExperimentalOption("prefs", prefs);

		   WebDriver driver = new ChromeDriver(options);
		   options.addArguments("--disable-infobars");
		   options.addArguments("--disable-extensions");
		   options.addArguments("--disable-save-password-bubble");
		   Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	    //driver.findElement(By.name("accountno")).click();
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select/option[2]")).click();
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")).click();
	    driver.navigate().back();
	    driver.findElement(By.name("res")).click();
	    driver.findElement(By.linkText("Home")).click();
	    
	}

	@Then("user successfully logout")
	public void user_successfully_logout() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Log out")).click();
	    Alert alert= driver.switchTo().alert();
		   alert.accept();
	}
	@After
	public void closeBrowser() {
	    if (driver != null) {
	        driver.quit();
	        driver=null;
	    }
	}
}
