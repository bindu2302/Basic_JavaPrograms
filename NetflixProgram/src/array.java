import java.util.*;
public class array {
	public static void main(String[] args) {
//		int[] marks = new int[5];
//		marks[0] = 21;
//		marks[1] = 41;
//		marks[2] = 51;
//		marks[3] = 61;
//		marks[4] = 71;
//		System.out.println(marks[4]);
		
//		int[] grades = {21,51,5,6,7,9};
//		System.out.println(grades[5]);
		
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		int i;
		for(i=0;i<marks.length;i++)
		{
			marks[i] = scan.nextInt();
		}
        System.out.println("Outputs are: " + Arrays.toString(marks));
        boolean found100 = false;
        for (int mark : marks) {
            if (mark == 100) {
                found100 = true;
                break;
            }
        }

        // Display message based on the result
        if (found100) {
            System.out.println("out off");
        } else {
            System.out.println("improve");
        }

		
	}

}
