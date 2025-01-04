// write  a java program to find and print the prime of
//fibonacci series until n, take the n as user input

import java.util.Scanner;
public class FibonacciPrimeNumbers {

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
		   if(fib3>=2)
		   {
		   isPrime(fib3);
		   }
		   
		}	
	}
	
	public static void isPrime(int num)
	{
		int count =0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) {
				count++;	
			}	
		}
		if(count==2) {
			System.out.println(num);
		}
	}
}
