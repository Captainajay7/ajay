package javaPatterns;

public class StarPattern5 {

	public static void main(String[] args) {
          
		int count = 0;
		for (int i=1;i<=4;i++) {
			for (int j =3;j>=i;j--) {
				System.out.print(" ");
			} 	for (int k =1;k<=i;k++) {
				count = count +1;
				System.out.print(count);
			}
		
			System.out.println(" ");
		}

	}

}
