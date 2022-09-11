package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependsOnMethod {
	@Test (priority=1)
	public void login() {
		System.out.println("login method");
		SoftAssert sof = new SoftAssert();
		sof.assertEquals(true,true);
		sof.assertAll();
	}
	@Test (priority=2)
	public void Home () {
		System.out.println("Home");
	}
	@Test (priority=3,dependsOnMethods="login")
	public void feed () {
		System.out.println("Feed");
	}
}
