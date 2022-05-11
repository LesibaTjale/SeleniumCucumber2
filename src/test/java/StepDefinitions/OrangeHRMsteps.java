package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMsteps {

    WebDriver driver;


    @Given("I launch chrome browser")
    public void i_launch_chrome_browser(){
       System.setProperty("webdriver.chrome.driver","C://Users//Mama Shongi//Documents//SeleniumDrivers//chromedriver_win32//chromedriver.exe");
       driver = new ChromeDriver();
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage(){
     driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("I verify that the logo is present on the page")
    public void I_verify_that_the_logo_is_present_on_the_page(){

      boolean status =  driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @And("close browser")
    public void close_browser(){

        driver.quit();
    }
}
