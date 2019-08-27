package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLoginStep {
	
	WebDriver driver;
	@Given("Load the facebook page")
	public void load_the_facebook_page() {
	    System.setProperty("webdriver.chrome.driver", "F:\\Selenium-cucumber\\Jenkins\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	}

	@When("We need to enter username and password")
	public void we_need_to_enter_username_and_password() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("s@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("pwd123");
	}

	@When("click login button")
	public void click_login_button() {
	    WebElement btn = driver.findElement(By.id("u_0_2"));
	    btn.click();
	}

	@Then("Once got home validate success are failure")
	public void once_got_home_validate_success_are_failure() {
	   
	}
}
