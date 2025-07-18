//
//public class pyramid {
//
//	public static void main(String[] args) {
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=(n-i+1);j++)
//			{
//				System.out.print("_");			
//			}
//			for(int j=1; j<=(2*i-1);j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=2;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("_");			
//			}
//			for(int j=1; j<=(2*n)-(2*i-1);j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
//
//}





//1.with spaces
package patterns;

public class pyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i+1);j++)
			{
				System.out.print(" ");			
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");			
			}
			for(int j=1; j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}



//2. with spaces 
//public class pyramid {
//    public static void main(String[] args) {
//        int n = 5; // Number of rows for the upper half
//
//        // Upper half
//        for (int i = 1; i <= n; i++) {
//            // Print spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // Print asterisks
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        // Lower half
//        for (int i = n - 1; i >= 1; i--) {
//            // Print spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // Print asterisks
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}



