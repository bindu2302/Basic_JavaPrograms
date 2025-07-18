//5
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 


package patterns;

import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int alphabet = 65;
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alphabet + j) + " ");
			}
			System.out.println();
		}
	}

}
