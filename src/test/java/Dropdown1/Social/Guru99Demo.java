package Dropdown1.Social;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Guru99Demo {
public static WebDriver driver;
	


    @Before
    public void setup() {
    	if (driver == null) {
            driver = new ChromeDriver();
            
          
    		driver.get("https://demo.guru99.com/test/newtours/");
    		}
    	}
    @Given("user is on Guru99 demo page")
    public void user_is_on_guru99_demo_page() {
        // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.className("dropdown-toggle")).click();
    	driver.findElement(By.linkText("Guru99 Demo Page")).click();
    	}

    @When("user click on demo video")
    public void user_click_on_demo_video() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"player-controls\"]/ytm-custom-control/ytm-watch-player-controls/cued-overlay/button/c3-icon/span/div")).click();
        
    }

    @When("user click menu and navigate")
    public void user_click_menu_and_navigate() {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div/h4/a")).click();
       driver.navigate().back();
       driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div[1]/div/div/h4/a")).click();
       driver.navigate().back();
       driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[1]/div[3]/div/div/div/div/div[1]/div/div/h4/a")).click();
       driver.navigate().back();
    }

    @Then("user get the URL")
    public void user_get_the_url() {
        // Write code here that turns the phrase above into concrete actions
        driver.getCurrentUrl();
        driver.getTitle();
        
    }


    @After 
    public void tearDown() {
   	 
   	 driver.quit();
   	 driver=null;
    }


}
