//Enter a decimal number: 20
//The binary equivalent of 20 is 10100.

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
         
        // Convert decimal to binary
        StringBuilder binary = new StringBuilder();
        int temp = decimal;

        while (temp > 0) {
            int remainder = temp % 2;   // Get the remainder
            binary.append(remainder);  // Append remainder to binary string
            temp = temp / 2;           // Divide the number by 2
        }

        // Reverse the string to get the correct binary order
        binary.reverse(); 
        System.out.println("The binary equivalent of " + decimal + " is " + binary + ".");
    }
}
