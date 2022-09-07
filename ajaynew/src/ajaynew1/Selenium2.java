package ajaynew1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		driver.navigate().to("https://www.cricbuzz.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();
		
	}
}
