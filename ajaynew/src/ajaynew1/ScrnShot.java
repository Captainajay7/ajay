package ajaynew1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrnShot{
	static WebDriver driver;
	public void screenshot() throws IOException {
		TakesScreenshot scrsht = (TakesScreenshot) driver;
		File source= scrsht.getScreenshotAs(OutputType.FILE);
		File destination = new File ("D:\\java\\ajaynew\\src\\ajaynew1.png");
		FileHandler.copy(source, destination);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		System.getProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		ScrnShot ss = new ScrnShot();
		ss.screenshot();
		Thread.sleep(2000);
		driver.quit();
	}

}
