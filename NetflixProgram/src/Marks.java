import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter marks: ");
	int marks = scan.nextInt();
	if (marks>100 || marks<0)
	{
		System.out.println("Invlaid marks");
	}
	else if(marks>=35)
	{
		System.out.println("Pass");	
	}
	else if(marks<35)
	{
		System.out.println("Fail");	
	}
	}

}
