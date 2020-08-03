package seleniumCheck;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Shopclues {
	
	WebDriver driver;
	@Test
	public void bshopclue() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.shopclues.com/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	WebElement alow = driver.findElement(By.xpath("//button[text()='Allow']"));
	alow.click();
	}
	@Test
	public void kidere () throws InterruptedException {
		Thread.sleep(5000);
	   driver.findElement(By.xpath("//a[text()='Home Cleaning']")).click();
	   Thread.sleep(5000);
	   ArrayList <String> openo = new ArrayList <String> (driver.getWindowHandles());
	    driver.switchTo().window(openo.get(1));
	    driver.findElement(By.xpath("//span[contains(text(),'Evershine')]")).click();
	    driver.switchTo().window(openo.get(2));
	    driver.findElement(By.id("add_cart")).click();
	   }

}
