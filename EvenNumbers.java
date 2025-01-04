import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		System.out.println("Even numbers of "+n+" are: ");
		for(int i=1;i<=n;i++)
		{
			int even = i*2;	
			System.out.println(even);
		}
		
	}

}


//import java.util.Scanner;
//public class EvenNumbers {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.println("Enter a Starting number: ");
//		int startnum = scan.nextInt();
//		System.out.println("Enter a Ending number: ");
//		int endnum = scan.nextInt();
//		
//		for(int i=startnum;i<=endnum;i++) 
//		{
//			if(i%2==0) {
//				System.out.println(i);
//				
//			}
//			
//			
//		}
//
//		
//	}
//	
//	
//}

