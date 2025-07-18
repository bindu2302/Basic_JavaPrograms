//Write a java program to print all the even numbers
//in between m and n.
//where(m>n) if (m>=n),print "invalid numbers"


import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m = scan.nextInt();
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		if(m>=n)
		{
			System.out.println("Invalid numbers");	
		}
		else
		{
			for(int i=m; i<=n ; i++)
			{
				if(i%3==0 && i%5==0) {
					System.out.println(i);
				}
			}	
		}
	}

}
