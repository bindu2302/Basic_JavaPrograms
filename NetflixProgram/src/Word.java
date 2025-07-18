//import java.util.Scanner;
//
//public class Word {
//
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter full name");
//		String fullName=scan.nextLine();
//		System.out.println("Full name is:"+fullName);
//	}
//
//}



public class Word {
    public static void main(String[] args) {
    	int n=5;
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=n;i++)
    		{
    			if(i==3) {
    				System.out.print(" ");
	
    			}
    			else {
    				System.out.print("*");
    			}
    		}
    		System.out.println();
    	}
    	
    }
}