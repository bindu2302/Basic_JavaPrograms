//hima bindu
//Vowels: 4
//Consonants: 5

//himaa binnndu
//Vowels: 5
//Consonants: 7

import java.util.Scanner;

public class VowelConsonantCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int vowels =0,consonants=0;
		String vowelStr = "", consonantStr = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				ch = (char)(ch+32);
			}
			
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u') {
					vowels++;
					vowelStr += ch;
					
				} else {
					consonants++;
					consonantStr += ch;
				}
			}
		}

        System.out.println("Vowels: " + vowels + " -> " + vowelStr);
        System.out.println("Consonants: " + consonants + " -> " + consonantStr);
	}

}
