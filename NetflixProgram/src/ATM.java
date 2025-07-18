import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a PIN: ");
		int userPin = scan.nextInt();
		if ( userPin==1234)
		{
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("Choose an option");
			int option = scan.nextInt();
			switch(option) 
			{
			case 1: System.out.println("enter amount to withdraw:");
			        int amount = scan.nextInt();
			        if (amount<1000) {
				    System.out.println("withdraw successfully" + amount);
			        } else {
				    System.out.println("Insufficient amount");
		            }
			        break;
			case 2: System.out.println("enter amount to deposit:");
	                int deposit = scan.nextInt();
	                System.out.println("deposited amount succesfully: " + deposit);
	                break;
			 }	
		} else {
			System.out.println("incorrect pin");
		}
	}

}
