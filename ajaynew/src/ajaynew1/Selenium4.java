package ajaynew1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {
 
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createacnt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		createacnt.click();
		Thread.sleep(2000);
		List<WebElement> dayslist= driver.findElements(By.xpath("//*[@id='day']//option"));
		for(WebElement day:dayslist) {
			if (day.getText().equals("6"));
			day.click();
		}
	}
}
