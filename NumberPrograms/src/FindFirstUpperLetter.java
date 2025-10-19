import java.util.Scanner;

public class FindFirstUpperLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		boolean found = false;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				System.out.print(ch + " ");
				found = true;
			}
		}
		if(!found) {
			System.out.println("No uppercase letter found");
		}
	}

}
