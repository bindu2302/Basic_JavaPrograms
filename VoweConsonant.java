import java.util.Scanner;
public class VoweConsonant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scan.next().charAt(0);
		if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println(ch+" it is a vowel.");
		} else if((ch>'a' && ch<'z') || (ch>'A' && ch<'Z')) {
			System.out.println(ch+" it is a consonant");
		} else {
			System.out.println("It is a number");
		}
	}

}
