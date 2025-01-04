// WAJP to print count of digits that are divisible by 3 in a number.


import java .util.Scanner;
public class Count3DivisibleDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		int digit = Count3DivisibleDigits(number);
		System.out.println(digit);
	}
	
	public static int Count3DivisibleDigits(int number)
	{
		int digitcount =0;
		while(number>0)
		{
			int digit = number % 10; // extracts the last digit
			if(digit %3 ==0)
			{
				digitcount++;
			}
			number/=10; // remove last digit
		}
		return digitcount;
	}
}






