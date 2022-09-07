package ajaynew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
	public static void main(String[] args) throws InterruptedException {
		 System.getProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://mbasic.facebook.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.cssSelector("div#signup-button")).click();
	      Thread.sleep(1000);
	      boolean ajd = driver.findElements(By.xpath("//span[contains(text(),'Male')]")).get(0).isEnabled();
	      driver.findElement(By.xpath("//span[contains(text(),'Male')]")).click();
	      System.out.println(ajd);
	}

}
