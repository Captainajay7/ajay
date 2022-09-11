package ajaynew2;

public class Java1 { 
	int a = 25;
	int b = 25;
	public static void m1 () {
		System.out.println("m1 is static method");
	}
	public static void m2 () {
		System.out.println("m2 is static method");
		m1();
		 Java1 aj = new Java1();
		 aj.m4();
		 int c = aj.a+aj.b;
		 System.out.println(c);	
	}
	public void m3() {
		System.out.println("m3 is non static method");
	}
	public void m4 () {
		System.out.println("m4 is non static method");
		m3();
	}
   public static void main(String[] args) {   
	   m2();
}
}
