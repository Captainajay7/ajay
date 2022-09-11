package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class STCM {
	@Test
	@BeforeSuite
	public void test() {
		System.out.println("before test");
	}
	@BeforeClass
	public void classi() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void method () {
		System.out.println("before method");
	}
	@AfterMethod
	public void method1 () {
		
	}
	@AfterClass
	public void class1 () {
		System.out.println("after class");
	}
	@Test
	@AfterSuite
	public void test1 () {
		System.out.println("after test");
	}
	@AfterSuite
	public void suite1 () {
		System.out.println("after suite");
	}

}
