import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int res = digitcount(n);
		System.out.println("digit count of "+n+" are: "+res);		
		
	}

	public static int digitcount(int num)
	{
		int count =0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		return count;
	}
}

//Enter a number: 
//87654
//digit count of 87654 are: 5
