import java.util.Scanner;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					found = true;
					break;
				}
			}
		}
		
		if(!found) {
			System.out.println("None");
		}
	}
}


//5
//1 2 3 2 1
//1 2 

//5
//1 2 3 4 5
//None