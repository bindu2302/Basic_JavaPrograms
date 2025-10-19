import java.util.Scanner;
public class PositiveNegativeZeroProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		System.out.println(findPN(n));
		
	}
		
		public static String findPN(int num)
		{
			if(num>0) {
				return "Positive";
			} else if(num<0) {
				return "Negative";
			} else {
				return "Zero";
			}
				
		}

}
