// write  a java program to find and print the even numbers of
//fibonacci series until n, take the n as user input

//Enter number: 40
//0
//2
//8
//34

import java.util.Scanner;
public class EvenFibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.print("Enter number: ");
	        int n = scan.nextInt();
	        printEvenFibonacci(n);
	    }

	public static void printEvenFibonacci(int n) {
		int fib1 = 0, fib2 = 1;

        while (fib1 <= n) {
            if (fib1 % 2 == 0) {
                System.out.println(fib1);
            }
            int fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
	}
	    
	    
}
