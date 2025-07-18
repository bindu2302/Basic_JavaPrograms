import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter age");
		byte age=scan.nextByte();
		
		System.out.println("yop");
		short yop=scan.nextShort();
		
		System.out.println("salary");
		int salary=scan.nextInt();
		
		System.out.println("Phno");
		long Phno=scan.nextLong();
		
		System.out.println("age is:" +age);
		System.out.println("yop is:" +yop);
		System.out.println("salary is:" +salary);
		System.out.println("Pnno is:" +Phno);
		

	}

}
