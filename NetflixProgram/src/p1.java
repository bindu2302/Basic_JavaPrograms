//import java.util.Scanner;
//
//public class p1 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a Number:");
//        int N = scan.nextInt(); // Read the number input from the user
//        System.out.println("You entered: " + N); // Debug: Print the entered value of N
//            for (int i = 1; i <= N; i++) {
//                if (i % 4 == 0) {
//                    continue; // Skip numbers divisible by 4
//                }
//                System.out.println(i); // Print numbers that are not divisible by 4
//            }
//        } 
//    }



//import java.util.*;
//public class p1 {
//
//	public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int N = scan.nextInt();
//		int i=1;
//		while(i<N)
//		{
//			if(i%4==0)
//			{
//				i++;
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
//	}
//}



import java.util.*;
public class p1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int N = scan.nextInt();
		int i=1;
		do
		{
			if(i%4==0)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		} while(i<=N);
	
	}
}
