package ajaynew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium6 {

	public static void main(String[] args) throws InterruptedException {
	      System.getProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://demo.automationtesting.in/Datepicker.html");
	      Thread.sleep(500);
          driver.findElement(By.xpath("//*[@id='datepicker2']")).click();
          WebElement month = driver.findElement(By.xpath("//*[@class='datepick-month-year']"));
          Select month1 = new Select (month);
          month1.selectByIndex(2);
          Thread.sleep(1000);
          driver.findElement(By.xpath("//select[@class='datepick-month-year']/option[contains( text(),'▲')]")).click();
          WebElement year = driver.findElement(By.xpath("//*[@title='Change the year']"));
          Select year1 = new Select (year);
          year1.selectByVisibleText("1994");
          Thread.sleep(1000);
          driver.findElement(By.xpath("//*[@class='dp762935400000   datepick-weekend']")).click();
          }


}
