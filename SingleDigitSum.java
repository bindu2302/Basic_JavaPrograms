import java.util.Scanner;
public class SingleDigitSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int res = sumOfDigits(n);
		while(res>=10)
		res = sumOfDigits(res);
		System.out.println("Original number: "+n);
		System.out.println("single digit sum:"+ res);		
	}
			public static int sumOfDigits(int n)
			{
			int sum =0;
			while(n>0)
			{
				int last = n%10;
				sum =sum+last;
				n=n/10;
			}
			return sum;
	}

}











