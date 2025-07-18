import java.util.Scanner;

public class Examples_loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N=scan.nextInt();
		int i=1;
		while(i<=N)
		{
			if(i%2==0)
			{
				System.out.println(i);

			}
			i++;
		}
	}
}
		