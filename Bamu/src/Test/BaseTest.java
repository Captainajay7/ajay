package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	@BeforeTest
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("http://bamuaresult.digitaluniversity.ac/");
		driver.manage().window().maximize();
	}
	@AfterTest
	public void finush() {
		driver.quit();
	}

}
