package seleniumCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AEMSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://13.92.1.155:4502/");
		driver.findElement(By.id("username")).sendKeys("sujan.kumar");
		driver.findElement(By.id("password")).sendKeys("SiriusSujan!");
		driver.findElement(By.id("submit-button")).click();
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[text()='Sites']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("(//div[contains(text(),'Earnmore')])[2]")).click();
		driver.navigate().to("http://13.92.1.155:4502/editor.html/content/earnmore/us/en/test-pages/autotestpage.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'cq-droptarget')]")).click();
		driver.findElement(By.xpath("//div[@id='EditableToolbar']/descendant::button[1]")).click();
		driver.findElement(By.xpath("//coral-selectlist-item[text()='Text']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'cq-droptarget')])[2]")).click();
	}

}
