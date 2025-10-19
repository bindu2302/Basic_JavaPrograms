import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0, temp = num;
		
        while (temp > 0) {
			int digit = temp % 10;
			sum = sum + digit;
			temp = temp / 10;
		}
        System.out.println("Sum of digits of " + num + " is: " + sum);
	}
}

//12345
//Sum of digits of 12345 is: 15