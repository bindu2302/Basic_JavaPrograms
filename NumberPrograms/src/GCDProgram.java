import java.util.Scanner;

public class GCDProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter num2: ");
		int num2 = scan.nextInt();
		
		int gcd=findGCD(num1,num2);
		System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);

	}
	
	
	public static int findGCD(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}












