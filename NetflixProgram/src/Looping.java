import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();

        int sum = 0;

        // Calculate the sum of natural numbers up to the given number
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        // Display the final result
        System.out.println("The sum of natural numbers up to " + number + " is: " + sum);


	}

}
