// write  a java program to find and print the factors of all 
// numbers starting from 2 in fibonacci series until n, take the n
// as user input


//Enter number: 
//10
//The factors of 2 are: 1 2 
//The factors of 3 are: 1 3 
//The factors of 5 are: 1 5 
//The factors of 8 are: 1 2 4 8 
//The factors of 13 are: 1 13 
//The factors of 21 are: 1 3 7 21 
//The factors of 34 are: 1 2 17 34 

import java.util.Scanner;
public class FactorsOfFibonacci {

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
		   if(fib3>=2) {
		   printFactors(fib3);
		   }
		   
		}	
	}
	
	public static void printFactors(int num)
	{
		System.out.print("The factors of "+num+" are: ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
}
