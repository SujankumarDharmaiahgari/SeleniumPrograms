package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script {
WebDriver driver;
	
	@Given("^Open the chromebrowser and start application$")
	public void Open_the_chromebrowser_and_start_application() {
		System.setProperty("webdriver.chrome.driver",
				"chromedriver");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	}
	
	@When("^I enter valid credentials$")
	public void I_enter_valid_credentials() {
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
	}
	
	@Then("^User should be logged in successfully$")
	public void User_should_be_logged_in_successfully() {
		String title = driver.getTitle();
		System.out.println(title);
	}

}
