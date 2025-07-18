//import java.util.Scanner;
//public class p2 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int N = scan.nextInt();
//		for(int i=1;i<=N;i++)
//		{
//		
//			if(i%10==0)
//			{
//				break;
//			}
//			System.out.println(i);
//		}
//	
//	}
//}

//import java.util.Scanner;
//public class p2 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int N = scan.nextInt();
//		int i=1;
//		while(i<=N)
//		{
//		
//			if(i%10==0)
//			{
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
//	
//	}
//}



import java.util.Scanner;
public class p2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int N = scan.nextInt();
		int i=1;
		do
		{
			if(i%10==0)
			{
				break;
			}
			System.out.println(i);
			i++;
		} while(i<=N);
	
	}
}




