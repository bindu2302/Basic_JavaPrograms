import java.util.Scanner;
public class FactorialProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		System.out.println("Fcatorial of "+n+ " is: "+ fact);

	}

}
