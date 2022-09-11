package testNG;

import org.testng.annotations.Test;

public class InnovationCounts {
	@Test (invocationCount=10)
	public void login() {
		System.out.println("ajay");
	}

}
