package ajaynew1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Seleniumscreenshot {

	public static void main(String[] args) throws IOException {
		System.getProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot scrnsht= (TakesScreenshot)driver;
		File aj = scrnsht.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Java Files\\ajay.png");
		FileHandler.copy(aj,destination);

	}

}
