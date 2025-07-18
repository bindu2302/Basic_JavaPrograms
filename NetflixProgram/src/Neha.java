// NEHA --1 outer  4 inner

//import java.util.*;
//public class Neha {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.println("Enter no.of rows: ");
//		int row = scan.nextInt();
//		
//		System.out.println("Enter no.of Columns: ");
//		int col = scan.nextInt();
//		
//		System.out.println("Enter a character: ");
//		char ch = scan.next().charAt(0);
//		
//		for(int i=0;i<row;i++)
//		{
//			// For N
//			for(int j=0;j<col;j++)
//			{
//				if(j==0 || j == col-1 || i==j)
//				{
//					System.out.print(ch);
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//		System.out.print(" ");
//		
//		// E
//		for(int j=0;j<col;j++)
//		{
//			if(j==0 || i==0 || i == row/2 || i== row-1)
//			{
//				System.out.print(ch);
//			}
//			else
//			{
//				System.out.print(" ");
//			}
//		}
//		System.out.print(" ");
//		// H
//		for(int j=0;j<col;j++)
//		{
//			if(j==0 || j==col-1 || i == row/2)
//			{
//				System.out.print(ch);
//			}
//			else
//			{
//				System.out.print(" ");
//			}
//		}
//		System.out.print(" ");
//		
//		// A
//		for(int j=0;j<col;j++)
//		{
//			if(i==0 || j==0 || j==col-1 || i == row/2)
//			{
//				System.out.print(ch);
//			}
//			else
//			{
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//	
//	}
//	
//   }
//}




//N   --4 outer 4 inner
//E
//H
//A
import java.util.*;
public class Neha {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter no.of rows: ");
		int row = scan.nextInt();
		
		System.out.println("Enter no.of Columns: ");
		int col = scan.nextInt();
		
		System.out.println("Enter a character: ");
		char ch = scan.next().charAt(0);
		
		// N
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0 || j==col-1 || i==j)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//E
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0 || i==0  || i==row-1 || i== row/2)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		
		//H
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0 || j==col-1 || i== row/2)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		
		//A
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0 || j==col-1 || i==0 || i== row/2)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
		
   }
}
