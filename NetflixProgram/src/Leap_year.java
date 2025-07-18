import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = scan.nextInt();
		if (year>0) {
			if (year %4==0) {
				if(year %100 ==0) {
					if(year % 400==0) {
						System.out.println("leap year");
					} else {
						System.out.println("not leap year");
					}			
				} else {
					System.out.println("leap year");
				}
			} else {
				System.out.println("not leap year");
			}
		} else {
			System.out.println("Invalid");
		}
	}
}
		