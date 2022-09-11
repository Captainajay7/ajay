package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {
		@Test (priority=1)
		public void testcase1() {
			System.out.println("ajay");
		}
		@Test(priority=2)
		public void testcase2() {
			System.out.println("dhalgade");
		}
		@Test(priority = 3)
		public void testcase3(){
			Reporter.log("Ajay Dhalgade",true);
			
		}
		
}
