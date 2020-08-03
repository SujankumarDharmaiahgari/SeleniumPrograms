package seleniumCheck;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//click From
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		ArrayList <WebElement> dropindiafrom = new ArrayList <WebElement> (driver.findElements(By.xpath("(//td[@class='mapbg'])[1]//ul/li/a")));
		for(WebElement Indiafrom:dropindiafrom) {
		String IndiaDropDownValues = Indiafrom.getText();
		System.out.println(IndiaDropDownValues);
		if(IndiaDropDownValues.equalsIgnoreCase("Chennai (MAA)")) {
		Indiafrom.click();
		break;
		}
		}


	}

}
