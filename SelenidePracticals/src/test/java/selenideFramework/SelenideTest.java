package selenideFramework;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.codeborne.selenide.WebDriverRunner;

public class SelenideTest {
	@Test
	public void googlesearch() {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	WebDriver driver = new ChromeDriver();
	WebDriverRunner.setWebDriver(driver);
	open("https://www.google.com/");
	$(By.name("q")).setValue("India").pressEnter();
	$(By.xpath("//span[text()='India - Wikipedia']")).shouldBe(visible).shouldHave(text("India - Wikipedia"));
	$(By.xpath("//span[text()='India - Wikipedia']")).click();
	}

}
