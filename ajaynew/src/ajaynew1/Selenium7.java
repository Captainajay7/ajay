package ajaynew1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium7 {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("ajaydhalgade7@gmail.com");
		Thread.sleep(500);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String name = driver.getTitle();
		System.out.println(name);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		List<WebElement> daylist = driver.findElements(By.xpath("//*[@id='day']//option"));
		for(WebElement day:daylist) {
			if(day.getText().equals("6"));
			day.click();
		}
		

	}

}
