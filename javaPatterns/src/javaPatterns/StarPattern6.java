package javaPatterns;

public class StarPattern6 {

	public static void main(String[] args) {
		for (int i =0 ;i<=4;i++) {
			for (int j=i ; j<=4;j++) {
				System.out.print(" x ");
			} 
			System.out.println(" ");
		}for (int i =0 ;i<=4;i++) {
		for (int k =0;k<=i;k++) {
			System.out.print(" x ");
		}System.out.println(" ");
		}
	}

}