package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckingAssert {
	public static WebDriver driver;
	@BeforeTest 
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test 
	public void verifyurlofpage() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("check url", "https://www.facebook.com/", url);
	}
	@Test 
	public void pagenemes() {
		String pagename = driver.findElement(By.xpath("//*[@alt='Facebook']")).getText();
		Assert.assertEquals("page name", "Facebook", pagename);	
	}
	@AfterTest
	public void logout() {
		driver.quit();
	}
}
