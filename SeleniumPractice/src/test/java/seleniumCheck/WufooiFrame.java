package seleniumCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WufooiFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wufoo.com/gallery/templates/forms/community-growth-development/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.switchTo().frame("wufooFormm1qqzphg1tk2hnp");
		driver.findElement(By.id("nextPageButton")).click();
	}

}
