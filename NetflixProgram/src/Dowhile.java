
//public class Dowhile {
//
//	public static void main(String[] args) {
//		int i= 1;
//		do
//		{
//			System.out.println(i);
//			i++;
//		}
//		while(i<=5);
//
//	}
//
//}


//example 2-- print all numbers from 1 to N 
//which have last digit as 3 using do-while loop.
//input:50
//output:3 13 23 33 43
//import java.util.*;
//public class Dowhile{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter 1 to N:");
//		int N = scan.nextInt();
//		int i=3;
//		do
//		{
//			System.out.println(i);
//			i +=10;
//		}
//		while(i<=N);
//		
//		
//	}
//	
//}



//example 3
//Code for Factorial and Digit Sum Calculation
//input:5
//output:120
//sum of factorial is 3

import java.util.*;
public class Dowhile{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int N = scan.nextInt();
		int fact = 1;
		int i=1;
	
		do {
			fact=fact*i;
			i++;
		}
		while(i<=N);
		System.out.println("factorial of: " + N+ "is: "+fact);
		
		int sum=0;
		int temp=fact;
		do {
			sum = temp%10+sum;
			temp= temp/10;
		}
		while(temp>0);
		System.out.println("sum of all digits of "+fact+"is: "+sum);	
		
	}
}





