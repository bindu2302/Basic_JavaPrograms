// WAP  to print count of even and odd digits in a number.
import java .util.Scanner;
public class Even_oddDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		int evenDigit=countEvenDigits(number);
		int oddDigit=countOddDigits(number);
		System.out.println("Even digits are: "+ evenDigit);
		System.out.println("Odd digits are: "+ oddDigit);
	}
	
	public static int countEvenDigits(int number)
	{
		int EvenCount =0;
		while(number>0)
		{
			int digit = number % 10; // extracts the last digit
			if(digit %2 ==0)
			{
				EvenCount++;
			}
			number/=10; // remove last digit
		}
		return EvenCount;	
	}
	
	public static int countOddDigits(int number)
	{
	    int OddCount =0;
		while(number>0)
		{
			int digit = number % 10; // extracts the last digit
			if(digit %2 !=0)
			{
				OddCount++;
			}
			number/=10; // remove last digit
		}
		return OddCount;

		
	}
}


