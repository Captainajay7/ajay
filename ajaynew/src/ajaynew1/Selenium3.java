package ajaynew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
        public static void main(String[] args) {
			System.getProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		    WebDriver ajd= new ChromeDriver();
		    ajd.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		    ajd.manage().window().maximize();
		    String title = ajd.getTitle();
			String url = ajd.getCurrentUrl();
			System.out.println(title);
			System.out.println(url);
			WebElement username = ajd.findElement(By.id("txtUsername")) ;
			username.sendKeys("Admin");
			WebElement password = ajd.findElement(By.id("txtPassword"));
			password.sendKeys("admin123");
			WebElement login = ajd.findElement(By.id("btnLogin"));
			login.click();
		}
}
