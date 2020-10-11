package seleniumCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SuccessAPI {
	
	WebDriver driver;
	Actions act;

	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("http://successkpi-new-dev.s3-website-us-east-1.amazonaws.com/#/login");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void b_login() throws InterruptedException {
		driver.findElement(By.xpath("//label[contains(text(),'Email')]/following::input[1]")).sendKeys("winfred151996@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Email')]/following::input[2]")).sendKeys("rubyruby");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(20000);
	}
	
	@Test
	public void c_error() {
		act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	@Test
	public void d_links() throws InterruptedException {
		Thread.sleep(2000);
		for(int i=1;i<=5;i++) {
			act.sendKeys(Keys.TAB).build().perform();
		}
		for(int i=1;i<=3;i++) {
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		}
	}
	
	
	}
