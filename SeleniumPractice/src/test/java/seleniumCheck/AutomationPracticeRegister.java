package seleniumCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPracticeRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		driver.findElement(By.id("reg_email")).sendKeys("july29th@yopmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("JulyPassw0rd$123adsfasdfas");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		WebElement registerButton = driver.findElement(By.name("register"));
		registerButton.click();
	}

}
