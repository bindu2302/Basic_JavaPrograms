// square of a number

//Enter a number
//5
//25

//import java.util.Scanner;
//public class SumofSquares {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n = scan.nextInt();
//		int res = Squares(n);
//		System.out.println(res);
//		
//
//	}
//	
//	public static int Squares(int num)
//	{
//		return num*num;
//	}
//
//}


// squares of an interval
//Enter a start number
//10
//Enter a end number
//15
//100
//121
//144
//169
//196
//225

//import java.util.Scanner;
//public class SumofSquares {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter a start number");
//		int n1 = scan.nextInt();
//		
//		System.out.println("Enter a end number");
//		int n2 = scan.nextInt();
//		
//		for (int i =n1; i<=n2; i++)
//		{
//			int res= Squares(i);
//			System.out.println(res);
//		}
//
//	}
//	
//	public static int Squares(int num)
//	{
//		return num*num;
//	}
//
//}




//Enter a number
//20
//2870


import java.util.Scanner;
public class SumofSquares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			sum = sum+Squares(i);
		}	
		System.out.println(sum);

	}
	
	public static int Squares(int num)
	{
		return num*num;
	}

}










