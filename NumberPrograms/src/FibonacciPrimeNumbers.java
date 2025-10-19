// write  a java program to find and print the prime of
//fibonacci series until n, take the n as user input

//Enter number: 10
//2
//3
//5
//13

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
		   if (fib3 >= 2 && isPrime(fib3)) {
               System.out.println(fib3);
           }
       }
   }

   public static boolean isPrime(int num) {
       if (num < 2) return false;
       for (int i = 2; i <= Math.sqrt(num); i++) {
           if (num % i == 0)
               return false;
       }
       return true;
   }
}
