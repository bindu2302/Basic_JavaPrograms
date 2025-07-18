//*****
//*---*
//*---*
//*---*
//*****

//public class p6 {
//
//	public static void main(String[] args) {
//	
//		for( int i=1;i<=5;i++)
//		{
//			for(int j=1; j<=5;j++)
//			{
//				if(i==1||i==5||j==1||j==5)
//				{
//				System.out.print("*");
//				}
//				else
//				{
//					System.out.print("-");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//
//}


//-----*    
//-----**   
//-----* *  
//-----*  * 
//-----*****

//public class p6 {
//
//	public static void main(String[] args) {
//	
//		for( int i=1;i<=5;i++)
//		{
//			
//			for(int j=1; j<=5;j++)
//			{
//				System.out.print("-");
//			}
//			for(int j=1;j<=5;j++)
//			{
//				if(j==1||i==5||i==j)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//
//}


//-----*****
//-----*  * 
//-----* *  
//-----**   
//-----*  

//public class p6 {
//
//	public static void main(String[] args) {
//	
//		for( int i=1;i<=5;i++)
//		{
//			
//			for(int j=1; j<=5;j++)
//			{
//				System.out.print("-");
//			}
//			for(int j=1;j<=5;j++)
//			{
//				if(i==1||j==1||j==5-i+1)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//
//}


//-----*****
//----*   *
//---*   *
//--*   *
//-*****

public class p6 {

	public static void main(String[] args) {
		int n=5;
	 
		for( int i=1;i<=n;i++)
		{
			for(int j=1; j<=n-i+1;j++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=n;j++)
			{
			if(i==1||i==n||j==n||j==1)
			{
				System.out.print("*");
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



