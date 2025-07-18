//Enter n value: 5
//A 
//B C 
//D E F 
//G H I J 
//K L M N O 
//A B C D 
//E F G 
//H I 
//J

//import java.util.Scanner;
//
//public class Alphabets {
//
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		System.out.print("Enter n value: ");
//		int n = scan.nextInt();
//		char ch='A';
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(ch+" ");
//				ch++;
//			}
//			System.out.println();
//		}
//		ch='A';
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=2;j<=n-i+1;j++)
//			{
//				System.out.print(ch+" ");
//				ch++;
//			}
//			System.out.println();		
//		}
//		
//	}
//}




//A65 B66 C67 D68 E69 
//F70 G71 H72 I73 J74 
//K75 L76 M77 N78 O79 
//P80 Q81 R82 S83 T84 
//U85 V86 W87 X88 Y89 
//import java.util.Scanner;
//
//public class Alphabets {
//
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		System.out.print("Enter n value: ");
//		int n = scan.nextInt();
//		char ch='A';
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print(ch+""+(int)ch+" ");
//				ch++;
//			}
//			System.out.println();
//		}
//		
//	}
//}


//AZ BY CX DW EV 
//FU GT HS IR JQ 
//KP LO MN NM OL 
//PK QJ RI SH TG 
//UF VE WD XC YB 
//import java.util.Scanner;
//
//public class Alphabets {
//
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		System.out.print("Enter n value: ");
//		int n = scan.nextInt();
//		char chInc='A';
//		char chDec='Z';
//	
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print(chInc +""+chDec+" ");
//				chInc++;
//				chDec--;
//			}
//			System.out.println();
//		}
//		
//	}
//}


//A  B  C  D  E  
//F  G* H* I* J  
//K  L* M* N* O  
//P  Q* R* S* T  
//U  V  W  X  Y 

//import java.util.Scanner;
//
//public class Alphabets {
//
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		System.out.print("Enter n value: ");
//		int n = scan.nextInt();
//		char ch='A';
//	
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				if(i==1||j==1||j==n||i==n)
//				{
//					System.out.print(ch +"  ");
//					ch++;	
//				}
//				else
//				{
//					System.out.print(ch++ +""+"* ");
//				}
//			
//			}
//			System.out.println();
//		}
//		
//	}
//}








//A B C D E 
//Z Y X W V 
//F G H I J 
//U T S R Q 
//K L M N O 
import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = scan.nextInt();
		char chInc='A';
		char chDec='Z';
	
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print(chInc+" ");
					chInc++;
				}
			}
			else
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print(chDec+" ");
					chDec--;
				}
			}
				
			System.out.println();
		}
		
	}
}



