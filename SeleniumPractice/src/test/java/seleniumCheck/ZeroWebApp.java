package seleniumCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroWebApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
	    driver.findElement(By.id("signin_button")).click();
	    driver.findElement(By.id("user_login")).clear();
	    driver.findElement(By.id("user_login")).sendKeys("username");
	    driver.findElement(By.id("user_password")).click();
	    driver.findElement(By.id("user_password")).clear();
	    driver.findElement(By.id("user_password")).sendKeys("password");
	    driver.findElement(By.name("submit")).click();
	    driver.findElement(By.linkText("username")).click();
	    driver.findElement(By.id("logout_link")).click();
		driver.close();

	}

}
