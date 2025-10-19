import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");
		int[] arr = new int[input.length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		for(int i=0; i<=arr.length-2; i++) {
			for(int j=0; j<=arr.length-2-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
