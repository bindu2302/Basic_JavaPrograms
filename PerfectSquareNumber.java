import java.util.Scanner;

public class PerfectSquareNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		boolean isPerfectSquare = isPerfectSquare(number);
		if(isPerfectSquare)
		{
			System.out.println(number+" is a perfect square.");
		} else {
			System.out.println(number+" is not a perfect square.");
		}
	}
	
	public static boolean isPerfectSquare(int num)
	{
		if(num<0)
			return false;
		
		int i=0;
		while(i*i <=num)
		{
			if(i*i ==num)
			{
				return true;
			}
			i++;
		}
		return false;
	}

}



