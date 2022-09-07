package ajaynew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSelectDate {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(1000);
		int a = 0;
		while (a==0) {
			String text = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			if (!(text.equals("March 1994"))) 
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				else
					break;
		}
		driver.findElement(By.xpath("//*[@class='ui-state-default']")).click();
	}}
