
//11111
//22222
//33333
//44444
//public class numberPatterns {
//
//	public static void main(String[] args) {
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(i);			
//			}
//			System.out.println();
//		}
//
//	}
//
//}



//12345
//12345
//12345
//12345
//public class numberPatterns {
//
//	public static void main(String[] args) {
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(j);			
//			}
//			System.out.println();
//		}
//
//	}
//
//}


//1 2 3 4 5 
//6 7 8 9 10 
//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 
//import java.util.*;
//public class numberPatterns {
//
//	public static void main(String[] args) {
//	Scanner scan= new Scanner(System.in);
//	System.out.print("enter n value: ");
//	int n= scan.nextInt();
//	int count=1;
//		for(int i=1;i<=n;i++)
//		{
//		
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print(count+" ");
//				count++;
//				
//			}		
//			System.out.println();
//		}
//
//	}
//
//}


//enter n value: 6
//36 35 34 33 32 31 
//30 29 28 27 26 25 
//24 23 22 21 20 19 
//18 17 16 15 14 13 
//12 11 10 9 8 7 
//6 5 4 3 2 1 
//
//import java.util.*;
//public class numberPatterns {
//
//	public static void main(String[] args) {
//	Scanner scan= new Scanner(System.in);
//	System.out.print("enter n value: ");
//	int n= scan.nextInt();
//	int count=n*n;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print(count+" ");
//				count--;
//				
//			}		
//			System.out.println();
//		}
//
//	}
//
//}


//enter n value: 4
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//import java.util.*;
//public class numberPatterns {
//
//	public static void main(String[] args) {
//	Scanner scan= new Scanner(System.in);
//	System.out.print("enter n value: ");
//	int n= scan.nextInt();
//	int count=1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(count+" ");
//				count++;
//			}		
//			System.out.println();
//		}
//	}
//}

//option-1
//01 02 03 04 05 
//06 07 08 09 10 
//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 

//import java.util.*;
//public class numberPatterns {
//
//	public static void main(String[] args) {
//	Scanner scan= new Scanner(System.in);
//	System.out.print("enter n value: ");
//	int n= scan.nextInt();
//	int count=1;
//		for(int i=1;i<=n;i++)
//		{
//		
//			for(int j=1;j<=n;j++)
//			{
//				System.out.printf("%02d ",count);
//				count++;
//				
//			}		
//			System.out.println();
//		}
//
//	}
//
//}


//option-2
//enter n value: 5
//01 02 03 04 05 
//06 07 08 09 10 
//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 
//import java.util.*;
//public class numberPatterns {
//
//	public static void main(String[] args) {
//	Scanner scan= new Scanner(System.in);
//	System.out.print("enter n value: ");
//	int n= scan.nextInt();
//	int count=1;
//		for(int i=1;i<=n;i++)
//		{
//		
//			for(int j=1;j<=n;j++)
//			{
//				if(count<=9)
//				{
//					System.out.print("0"+count++ +" ");
//				}
//				else
//				{
//					System.out.print(count++ + " ");
//				}
//				
//			}		
//			System.out.println();
//		}
//
//	}
//
//}



//enter n value: 5
//01 03 05 07 09 
//02 04 06 08 10 
//11 11 11 11 11 
//22 24 26 28 30 
//11 11 11 11 11 
//import java.util.*;
//public class numberPatterns {
//
//	public static void main(String[] args) {
//	Scanner scan= new Scanner(System.in);
//	System.out.print("enter n value: ");
//	int n= scan.nextInt();
//	int oddcount=1;
//	int evencount=2;
//		for(int i=1;i<=n;i++)
//		{
//		
//			for(int j=1;j<=n;j++)
//			{
//				if(i%2!=0 && oddcount<=9)
//				{
//					if(oddc)
//					System.out.print("0"+oddcount+" ");
//					oddcount+=2;
//				}
//				else if(i%2!=0 && oddcount>9)
//				{
//					System.out.print(oddcount + " ");
//					evencount+=2;
//				}
//				else if(i%2==0 && evencount<=9)
//				{
//					System.out.print("0"+evencount + " ");
//					evencount+=2;
//				}
//				else
//				{
//					System.out.print(evencount + " ");
//					evencount+=2;
//				}
//				
//			}		
//			System.out.println();
//		}
//
//	}
//
//}


//enter n value: 5
//01 02 03 04 05 
//02 04 06 08 10 
//03 06 09 12 15 
//04 08 12 16 20 
//05 10 15 20 25 
//import java.util.*;
//public class numberPatterns {
//
//	public static void main(String[] args) {
//	Scanner scan= new Scanner(System.in);
//	System.out.print("enter n value: ");
//	int n= scan.nextInt();
//
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{	
//				int product=i*j;
//				if(product<10)
//				{
//					System.out.print("0"+product+" ");
//	
//				}
//				else {
//					System.out.print(product+" ");
//				}
//				
//			}		
//			System.out.println();
//		}
//
//	}
//
//}


