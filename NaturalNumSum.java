import java.util.Scanner;
public class NaturalNumSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first natural numbers of: ");
		int n = scan.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i; 	
		}
		System.out.println(sum);


	}

}
