package ajaynew1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webelement.chrome.element","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		WebElement ajd = driver.findElement(By.cssSelector("input#txtUsername"));
		Actions ajds = new Actions(driver);
		Thread.sleep(1000);
		ajds.sendKeys(ajd,"Admin").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		ajds.sendKeys(Keys.CONTROL).sendKeys("c").sendKeys(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		WebElement paste = driver.findElement(By.cssSelector("input#txtPassword"));
		paste.click();
		ajds.sendKeys(Keys.CONTROL).sendKeys("v").build().perform();
	}
}
