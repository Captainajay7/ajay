package testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTesting {
	public static WebDriver driver;
	@BeforeTest
	public void opendriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test (groups="sanity")
	public void verifyurl()  {
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.facebook.com/","https://www.facebook.com/");
	}
	@Test (groups="sanity")
	public void checktitle()  {
		String chckttle = driver.findElement(By.cssSelector("img.fb_logo")).getText();
		Assert.assertEquals("Facebook","Facebook",chckttle);
	}
	@Test (groups="functional testing")
	public void ClickOnCrtbtn() {
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_0_fD")).click();
	}
	@AfterTest
	public void quit () {
		driver.quit();
	}
}
