import java.util.Scanner;
public class LeapYearProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a start year: ");
		int startyear = scan.nextInt();
		System.out.println("Enter a End year: ");
		int Endyear = scan.nextInt();

		for(int year=startyear; year<=Endyear; year++) {
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap year");
		}
	}
}
}
