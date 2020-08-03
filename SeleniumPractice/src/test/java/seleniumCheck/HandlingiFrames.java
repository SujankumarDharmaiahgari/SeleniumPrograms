package seleniumCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingiFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
		int iFramescount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iFramescount);
		driver.switchTo().frame("oddcouple");
		String iFrametext1 = driver.findElement(By.xpath("//div[contains(text(),'A television show')]")).getText();
		System.out.println(iFrametext1);
		WebElement iframeele = driver.findElement(By.xpath("(//iframe[@name='html_references'])[1]"));
		driver.switchTo().frame(iframeele);
		String iFrametext2 = driver.findElement(By.xpath("//a[contains(text(),'Cross')]")).getText();
		System.out.println(iFrametext2);
		

	}

}
