package ajaynew2;

public class Marksheet {
	int maths ;
	int chemi;

	public void m1(int math,int chem,String name) {
		int maths = math;
		int chemi = chem;
		System.out.println("Student Name: "+name);
		System.out.println("mathematic: "+math);
		System.out.println("Chemistry: "+chem);
		int c = maths + chemi;
		System.out.println("Total Marks: "+c);
		}
	public static void main(String[] args) {
		Marksheet ajd = new Marksheet();
		ajd.m1(40, 40, "AJAY DHALGADE");
	}
}
