import java.util.Scanner;
public class nthTermOfSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int res = printSeries(n);
		System.out.println("The "+n+"th term of the series is "+res+".");
		
	}
		public static int printSeries(int n)
		{
			int seriesTerm =0;
			int count = 1;
			for(int i=1;i<=n;i++)
			{
				seriesTerm = seriesTerm+count;
				count++;
			}
			return seriesTerm;		
		}
}

// using formula : n*(n+1)/2

//import java.util.Scanner;
//public class nthTermOfSeries {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int n = scan.nextInt();
//		
//		int res = n*(n+1)/2;
//		System.out.println(res);
//	}
//}
