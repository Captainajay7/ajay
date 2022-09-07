package ajaynew1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webelement.chrome.element","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(1000);
		WebElement source = driver.findElements(By.xpath(" //*[contains(text(),' 5000 ')]")).get(0);
		WebElement ele = driver.findElement(By.xpath("  //*[@id='amt7']//li"));
		Thread.sleep(1000);
		Actions js = new Actions (driver);
		js.dragAndDrop(source, ele).build().perform();
	}

}
