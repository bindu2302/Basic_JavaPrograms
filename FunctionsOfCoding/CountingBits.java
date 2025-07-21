package FunctionsOfCoding;

import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt(); // Read number
	        System.out.println(Arrays.toString(countBits(n))); // Print result array
	        scanner.close();
	    }

	    public static int[] countBits(int n) {
	        int[] result = new int[n + 1]; // size from 0 to n

	        for (int i = 0; i <= n; i++) {
	            result[i] = Integer.bitCount(i); // count 1s in binary
	        }

	        return result;
	    }
}
