package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SoftAssert {
	public static WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test (priority=1,groups="sanity")
	public void verifyURL() {
		SoftAssert softy = new SoftAssert();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.facebook.com/","verify url");
		System.out.println("check");
	}

}
