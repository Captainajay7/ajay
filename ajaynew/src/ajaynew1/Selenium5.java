package ajaynew1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium5 {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@name='sign_up']")).click();
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("ajay");
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("dhalgade");
        driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("7588937476");
        driver.findElement(By.xpath("//*[@id=\"sex\"and@value='2']")).click();
        List<WebElement> daylist = driver.findElements(By.xpath("//*[@name='birthday_day']//option"));
        for (WebElement day:daylist) {
        	if (day.getText().equals("06"));
        	day.click();
        }
        List<WebElement> monthlist = driver.findElements(By.xpath("//*[@name='birthday_month']"));
	    for(WebElement month:monthlist) { 
	    	if (month.getText().equals("march"));
	    	month.click();
	}
	    List<WebElement> yearlist = driver.findElements(By.xpath("//*[@name='birthday_year']"));
	    for(WebElement year:yearlist) {
	    	if (year.getText().equals("1994"));
	    	year.click();
	    	}
	    Thread.sleep(2000);
	    driver.close();
}
}