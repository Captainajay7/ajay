package ajaynew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnMe {

	public static void main(String[] args) {
		System.getProperty("webelement.chrome.element","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement rightclick = driver.findElement(By.xpath("//*[contains(text(),'Double-Click Me To See Alert')]"));
        Actions action = new Actions (driver);
        action.doubleClick(rightclick).perform();
        driver.switchTo().alert().accept();
	}
}
