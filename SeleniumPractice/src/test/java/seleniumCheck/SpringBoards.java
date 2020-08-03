package seleniumCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpringBoards {
	WebDriver driver;
	
	@Test
	public void register() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("http://springboards.in/new/online_tool/springboardspanel/admin/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Test");
		driver.findElement(By.id("email")).sendKeys("test145678@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Passw0rd$123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Passw0rd$123");
		driver.findElement(By.id("registerbutton")).click();
		driver.findElement(By.name("username")).sendKeys("test145678@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Passw0rd$123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'All Exam')]")).click();
		driver.findElement(By.id("startQuiz")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes, start now!')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'lean')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'South-East')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'12.5')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'To gain prominence')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'54')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'page')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Truthful')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Return')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'that the air was unpolluted')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'2/36')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'The Indian Radio')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'352')]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'East')])[3]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Tiny')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'2033550')]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'conclusion II')])[1]")).click();
		
		
	}

}
