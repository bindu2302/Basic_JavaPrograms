//import java.util.*;
//public class factorial {
//	public static void main(String[] args)
//	{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a num: ");
//		int n = scan.nextInt();
//		int fact=1;
//		int num=n;
//		while(n!=0)
//		{
//			fact = fact*n;
//			n--;
//		}
//		System.out.println("factorial of num "+ num+"is: "+ fact);
//	}
//
//}

import java.util.*;
public class factorial{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = scan.nextInt();
		int temp=n;
		int factres= finfactorial(n);
		System.out.println("the factorails of " + n + "is: "+finfactorial(n));
		
	}
	static int finfactorial(int num) {
		int fact =1;
		while(num!=0) {
			fact = fact*num;
			num--;	
		}
		return fact;
	}
		
	}
	
	































