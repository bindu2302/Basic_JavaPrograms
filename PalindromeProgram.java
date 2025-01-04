import java.util.Scanner;
public class PalindromeProgram {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = scan.nextInt();
		int k =n;
		int rev =0;
		while(n>0)
		{
			int last = n%10; // extract last digit
			rev = rev*10+last;//reverse
			n=n/10;//remove last
		}
		System.out.println("original number: "+ k);
		System.out.println("reverse number: "+ rev);
		
		if(k == rev)
		{
			System.out.println("It is a palindrome.");
		}
		else 
		{
			System.out.println("It is not a palindrome.");
		}
	}

}



