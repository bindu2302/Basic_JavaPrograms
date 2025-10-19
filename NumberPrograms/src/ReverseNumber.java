import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int  num = scan.nextInt();
		
		int rev_num = reversenum(num);
		System.out.println(rev_num);
	}
		
	public static int reversenum(int num)
	{
		int rev_num=0;
		while(num> 0)
		{
			int rem= num%10;
			rev_num = rev_num*10+rem;	
			num =num/10;
		}
		return rev_num;
		
	}

}












	
	