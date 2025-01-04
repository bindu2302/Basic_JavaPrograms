//import java.util.Scanner;
//public class MinimumNumber {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a number: ");
//		int num = scan.nextInt();
//		int min =num%10;
//		while(num>0)
//		{
//			int last =num%10;
//			if(last<min) {
//				min =last;
//				
//			}
//			num=num/10;
//			
//		}
//		System.out.println("Smallest digit: "+min);
//		
//
//	}
//
//}

import java.util.Scanner;
public class MinimumNumber 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		int res = minDigit(n);
		System.out.println(res);
		
	}
	
	public static int minDigit(int n)
	{
		int min = n%10;
		while(n>0)
		{
			int last = n%10;
			if(last<min)
			{
				min=last;
				
			}
			n=n/10;
		
		}
		return min;
	}
}












