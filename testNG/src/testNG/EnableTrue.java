package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EnableTrue {
	@Test (priority=1)
	public void login(){
		System.out.println("login method");
		SoftAssert sof = new SoftAssert();
		sof.assertEquals(false, true);
		sof.assertAll();
	}
	@Test (priority=2)
	public void home() {
		System.out.println("homepage");
	}
	@Test (priority=3,dependsOnMethods="login",enabled=true)
	public void feed () {
		System.out.println("feed");
	}

}
