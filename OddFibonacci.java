import java.util.Scanner;
public class OddFibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = scan.nextInt();
		Fibonacci(n);
	}
	public static void Fibonacci(int n)
	{
		int fib1 = 0;
		int fib2 = 1;
		
		for(int i=3;i<=n;i++) {
			
		int fib3 = fib1+fib2;
		fib1=fib2;
		fib2=fib3;
		
		printOdd(fib3);
	}
}
	
	static void printOdd(int num) {
		
		if(num%2!=0) {
			System.out.println(num);
		}
	
}

}
