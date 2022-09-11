package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependsOnMethods2 {
	@Test (priority=1)
	public void login() {
		System.out.println("login test");
		SoftAssert sof = new SoftAssert();
		sof.assertEquals(false, true);
		sof.assertAll();
	}
	@Test (priority=2)
	public void home() {
		System.out.println("home");
	}
	@Test (priority=3,dependsOnMethods="login",alwaysRun=true)
	public void feed() {
		System.err.println("feed method");
	}

}
