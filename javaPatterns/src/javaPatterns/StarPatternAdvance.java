package javaPatterns;

public class StarPatternAdvance {

	public static void main(String[] args) {
		int ajd = 0;
		for (int i =0;i<=5;i++ ) {
			
			for (int j =4; j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				    ajd= ajd+1;
				System.out.print(ajd);
			}
			System.out.println("");
		}

	}

}
