import java.util.Scanner;
public class OddSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a start number");
		int n1 = scan.nextInt();
		
		System.out.println("Enter a end number");
		int n2 = scan.nextInt();
		
		int totalsum =0;

		
		for (int i =n1; i<=n2; i++)
		{
			if(i%2!=0)
			{
				totalsum=totalsum+i;
			}
		}
		System.out.println(totalsum);

	}
}