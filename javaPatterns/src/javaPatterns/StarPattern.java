package javaPatterns;

public class StarPattern {

	public static void main(String[] args) {
		int co = 0;
		for (int i =0;i<=5;i++) {
			for (int j=0;j<=5;j++) {
				co = co+1;
				System.out.print(co);
			}
			System.out.println(" ");
		}

	}

}
