import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = scan.nextInt();
	if(num==0) {
		System.out.println("Zero");
	} else if (num>0) {
		if (num%2==0) {
			System.out.println("Number is even-positive");
		} else {
			System.out.println("Number is Odd-positive");
		}	
	} else {
		if (num%2==0) {
			System.out.println("Number is even-negative");
		} else {
			System.out.println("Number is odd-negative");
		}
	}
 
	}
}
