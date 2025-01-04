//Write a java program to print squares of all the numbers
//in fibonacci series until n.

import java.util.Scanner;
public class SquaresOfFibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n = scan.nextInt();
		PrintFibonacciSeries(n);	
	}
	
	public static void PrintFibonacciSeries(int n)
	{
		int fib1 =0;
		int fib2 =1;
		System.out.print((fib1*fib1)+" "+(fib2*fib2)+" ");
		for(int i=1;i<=n;i++) 
		{
			int fib3 = fib1+fib2;
			System.out.print(findSquare(fib3)+" ");
			fib1=fib2;
			fib2= fib3;
		}
		
	}
	static int findSquare(int num) 
	{
		return num*num;
	}


}
