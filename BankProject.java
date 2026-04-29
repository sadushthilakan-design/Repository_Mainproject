package PROJECt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankProject {

    public static WebDriver driver;

    // ✅ Runs ONLY ONCE
    @BeforeAll
    public static void setup() {

        driver = new ChromeDriver();   // ✅ MUST create driver
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
    }

    @Given("user is on Gptl Bank")
    public void user_is_on_gptl_bank() {
        driver.findElement(By.linkText("Bank Project")).click();
    }

    @Given("find the username and password")
    public void find_the_username_and_password() {
        driver.findElement(By.linkText("here")).click();
        driver.findElement(By.name("emailid")).sendKeys("sadushthilakan@gmail.com");
        driver.findElement(By.name("btnLogin")).click(); // ✅ fixed
        driver.navigate().back();
        driver.navigate().back();
    }

    @Then("login with valid credentials")
    public void login_with_valid_credentials() {
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr659239");
        driver.findElement(By.name("password")).sendKeys("umEgyba");
        driver.findElement(By.name("btnLogin")).click(); // ✅ fixed
    }

    @When("user explore the optians")
    public void user_explore_the_optians() {

        driver.findElement(By.linkText("New Customer")).click();
        driver.findElement(By.name("name")).sendKeys("sadush");
        driver.findElement(By.name("rad1")).click();

        driver.findElement(By.name("addr")).sendKeys("Bathery");
        driver.findElement(By.name("city")).sendKeys("wayanad");
        driver.findElement(By.name("state")).sendKeys("kerala");
        driver.findElement(By.name("pinno")).sendKeys("987654");
        driver.findElement(By.name("telephoneno")).sendKeys("9876551232");
        driver.findElement(By.name("emailid")).sendKeys("sadu@gmail.com");

        driver.findElement(By.name("sub")).click(); // ✅ FIXED

        driver.navigate().back();
        driver.navigate().back();

        driver.findElement(By.linkText("Edit Customer")).click();
        driver.findElement(By.name("cusid")).sendKeys("987651");
        driver.findElement(By.name("AccSubmit")).click();
        driver.navigate().back();
    }

//    @AfterAll
//    public static void tearDown() {
//        if (driver != null) {
//            driver.quit();   // ✅ closes only once
//        }
//    }

    @Then("user click logout")
    public void user_click_logout() {
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
       
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}