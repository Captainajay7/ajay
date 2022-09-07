package ajaynew1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		 System.getProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://www.cricbuzz.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(500);
	      JavascriptExecutor js= (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,1500)");
	      Thread.sleep(2000);
	      js.executeScript("window.scrollBy(0, -1500)");
	      Thread.sleep(2000);
	      WebElement scrolldown= driver.findElement(By.xpath("//*[@class='cb-footer-list-rt']"));
	      js.executeScript("arguments[0].scrollIntoView[0]",scrolldown);
	      scrolldown.click();

	}

}
