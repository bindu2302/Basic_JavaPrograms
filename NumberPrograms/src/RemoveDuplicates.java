
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1};
		int[] temp = new int[arr.length];
		int size = 0;
		
		for(int i=0; i<arr.length; i++) {
			boolean found = false;
			
			for(int j=0; j<size; j++) {
				if(arr[i] == temp[j]) {
					found = true;
					break;
				}
			}
			
			if(!found) {
				temp[size] = arr[i];
				size++;
			}
		}
		
		for(int i=0; i<size; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
