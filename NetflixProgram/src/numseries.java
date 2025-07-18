import java.util.Scanner;

public class numseries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum=0;
		while (num!=0)
		{
			int digit = num%10;
			num=num/10;
//			System.out.println(digit);
			sum=sum+digit;
			
		}
		System.out.println(sum);
	
	

	}

}
