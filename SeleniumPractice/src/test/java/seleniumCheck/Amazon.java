package seleniumCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Start here.")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Test");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9876543210");
		driver.findElement(By.id("ap_password")).sendKeys("Passw0rd$123");
		driver.findElement(By.id("continue")).click();
		System.out.println("Amazon");
		

	}

}
