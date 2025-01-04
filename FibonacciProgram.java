import java.util.Scanner;

public class FibonacciProgram {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int maxNumber = scanner.nextInt(); 

        // Initialize the first two Fibonacci numbers
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci series up to " + maxNumber + ": ");
       
        while (num1 <= maxNumber) {
        	
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;

        }
    }
}
