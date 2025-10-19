//Enter a num
//20
//1
//1
//3
//5
//13

import java.util.Scanner;
public class OddFibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = scan.nextInt();
		printOddFibonacci(n);
	}
	
	public static void printOddFibonacci(int n) {
		int fib1 =0, fib2 = 1;
		while(fib1 <= n) {
			if(fib1 % 2 != 0) {
				System.out.println(fib1);
			}
			int fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
	}
}
