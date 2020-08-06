package seleniumCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class YourLogoAddtocart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("shirts");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(3000);
		WebElement product = driver.findElement(By.xpath("(//a[contains(text(),'Faded')])[2]"));
		//Actions act = new Actions(driver);
		//act.moveToElement(product).click().build().perform();
		product.click();
		driver.findElement(By.xpath("//input[@id='quantity_wanted']/following::a[2]")).click();
		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByVisibleText("M");
		driver.findElement(By.name("Blue")).click();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
		cart.click();
		
		
	}

}
