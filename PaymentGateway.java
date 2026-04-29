package PROJECt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentGateway {
WebDriver driver;
	


    @Before
    public void setup() {
    	if (driver == null) {
            driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/newtours/");
    	}
    }
    
	
	@When("user opens payment gateway page")
	public void user_opens_payment_gateway_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	    driver.findElement(By.linkText("Payment Gateway Project")).click();
	    
	    
	}

	@When("user clicks on Generate Card Number")
	public void user_clicks_on_generate_card_number() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a[2]")).click();
	}

	@Then("card number should be displayed")
	public void card_number_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		String parent = driver.getWindowHandle();

		for (String win : driver.getWindowHandles()) {
		    driver.switchTo().window(win);
		}

		// do something...

		driver.switchTo().window(parent); // back to main tab
	}

	@Then("user select and buy item")
	public void user_select_and_buy_item() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[4]/select/option[2]")).click();
	    driver.findElement(By.cssSelector("button special")).click();
	    
	    
	}

	@Then("user is on payment gateway")
	public void user_is_on_payment_gateway() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.className("card_nmuber")).sendKeys("4182082276307436");
	    driver.findElement(By.xpath("//*[@id=\"month\"]/option[5]")).click();
	    driver.findElement(By.xpath("//*[@id=\"year\"]/option[11]")).click();
	    driver.findElement(By.className("cvv_code")).sendKeys("397");
	    driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div[2]/div/ul/li/input"));
	    
	}


	 @After 
	 public void test() {
		 
		 driver.quit();
	 }


}
