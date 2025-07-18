//5
//*********
// *     *
//  *   *
//   * *
//    *
//   * *
//  *   *
// *     *
//*********

package patterns;

import java.util.Scanner;

public class Hallow_Hourglass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Upper Part
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int j = 0; j < (2 * (n - i)) - 1; j++) {
                if (j == 0 || j == (2 * (n - i)) - 2 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower Part
        for (int i = 1; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int j = 0; j < (2 * i) + 1; j++) {
                if (j == 0 || j == (2 * i) || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
