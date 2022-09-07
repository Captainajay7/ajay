package ajaynew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFacebook {
         public static void main(String[] args) throws InterruptedException {
        	 System.getProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
     		WebDriver driver= new ChromeDriver();
     		driver.get("https://mbasic.facebook.com/");
     		driver.findElement(By.xpath("//*[@name='sign_up']")).click();
     		Thread.sleep(500);
     		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
     		Select day1 = new Select(day);
     		day1.selectByIndex(5);
     		WebElement month = driver.findElement(By.id("month"));
     		Select month1 = new Select(month);
     		month1.selectByIndex(2);
     		WebElement year = driver.findElement(By.id("year"));
     		Select year1 = new Select(year);
     		year1.selectByVisibleText("1994");
     		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
     		firstname.sendKeys("Ajay");
     		WebElement lname= driver.findElement(By.xpath("//*[@name='lastname']"));
     		lname.sendKeys("Dhalgade");
     		WebElement mail= driver.findElement(By.xpath("//*[@name='reg_email__']"));
     		mail.sendKeys("ajaydhalgade7@gmail.com");
     		driver.findElement(By.xpath("//*[text()='Male']")).click();
		}
}
