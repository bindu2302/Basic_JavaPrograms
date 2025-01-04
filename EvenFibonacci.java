// write  a java program to find and print the even numebrs of
//fibonacci series until n, take the n as user input

import java.util.Scanner;
public class EvenFibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		fibonacciSeries(n);
	
	}
	
	public static void fibonacciSeries(int n)
	{
		int fib1=0;
		int fib2=1;

	   for(int i=3;i<=n;i++) 
	   {
		   int fib3 = fib1+fib2;
		   fib1=fib2;
		   fib2=fib3;
		  EvenNum(fib3);
		   
		}	
	}
	
	public static void EvenNum(int num)
	{
		if(num%2==0)
		{
			System.out.println(num);
		}
			
	}
}
