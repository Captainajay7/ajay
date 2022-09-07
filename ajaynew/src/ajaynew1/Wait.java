package ajaynew1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {
	public static void main(String[] args) {
		System.getProperty("webelement.chrome.element", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		int a =1;
		while (a>0) {
			driver.findElement(By.xpath("(//*[@id='q']//input)["+a+"]")).click();
			a++;
		}
		
	}

}
