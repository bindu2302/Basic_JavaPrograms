// WAJP to print each digit of number  num--> 971486-->
//output: 6
//        8
//        4
//        1
//        7
//        9

//Algorithm:
//1. Read the input from the user. 
//2. Use while for repeating the task.
//3. find the mod(num).
//4. Print the digit.
//5. remove the last digit.


//1. whenever last digit has to be removed ----> divide num by 10
//2. whenever last digit has to be get --> modu num by 10
//3. whenever  num digit count has to be increased --> multiply num with 10


import java.util.Scanner;
public class DigitProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		while(num >0)
		{
			int digit =0;

			 digit = num % 10;
			 System.out.println(digit);
			 num = num/10;
		}
	}

}


//OR		
//		while(num>0)
//		{
//			int rev = 0 ;
//			int digit = num%10;
//			rev = rev*10+digit;
//			num = num/10;
//			System.out.println(rev);
//
//		}
