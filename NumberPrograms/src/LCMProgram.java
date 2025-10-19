//import java.util.Scanner;
//public class LCMProgram {
//	public static void main(String[] args)
//	{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter num1: ");
//		int num1 = scan.nextInt();
//		System.out.println("Enter num2: ");
//		int num2 = scan.nextInt();
//		
//		int lcm = findLCM(num1,num2);
//		System.out.println("The LCM of "+num1+ " and "+num2+" is "+ lcm);
//	}
//	
//	public static int findLCM(int a, int b)
//	{
//		return(a*b)/findGCD(a,b);
//	}
//	
//	public static int findGCD(int a,int b)
//	{
//		while(b!=0)
//		{
//			int temp = b;
//			b = a % b;
//			a = temp;
//		}
//		return a;
//	}
//}





 // LCM OF 3 NUMBERS
import java.util.Scanner;
public class LCMProgram {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter num2: ");
		int num2 = scan.nextInt();
		System.out.println("Enter num3: ");
		int num3 = scan.nextInt();
		
		int lcm = findLCM(findLCM(num1,num2),num3);
		System.out.println("The LCM of "+num1+ " , "+num2+" and "+num3+" is "+ lcm);
	}
	
	public static int findLCM(int a, int b)
	{
		return(a*b)/findGCD(a,b);
	}
	
	public static int findGCD(int a,int b)
	{
		while(b!=0)
		{
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}