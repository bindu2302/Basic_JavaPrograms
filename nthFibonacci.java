import java.util.Scanner;
public class nthFibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		int fib1=0, fib2=1;
		if(n==0)
		{
			System.out.println("The Fibonacci series of 0 is: "+fib1);
			return;
		}
		else if(n==1)
		{
			System.out.println("The Fibonacci series of 1 is: "+fib2);
			return;
		}
		int fib3 =0;
		for(int i =2;i<=n;i++)
		{
			 fib3=fib1+fib2;
			 fib1=fib2;
			 fib2=fib3;
		}	
		System.out.println("The Fibonacci series of "+n + " is: "+fib3);

	}
}
