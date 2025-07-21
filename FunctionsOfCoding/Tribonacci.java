package FunctionsOfCoding;

import java.util.Scanner;

public class Tribonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = tribonacciNum(n);
		System.out.println("Tribonacci Number of " + n + " is: " + result);
	}
	
	public static int tribonacciNum(int n) {
		if(n==0) return 0;
		
		if(n==1 || n==2) return 1;
		
		int a=0, b=1,c=1,d=0;
		
		for(int i=3; i<=n; i++) {
			d = a+b+c;
			a=b;
			b=c;
			c=d;
		}
		return d;
	}

}
