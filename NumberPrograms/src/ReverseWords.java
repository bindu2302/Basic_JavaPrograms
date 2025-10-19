//interviews conducts Softtek

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String words = "Softtek conducts interviews";
		
		String result = reverseWords(words);
		System.out.println(result);
	}
	
	public static String reverseWords(String sentence) {
//		words = words + " ";
//		String word = "";
//		String result = "";
//		
//		for(int i=0; i<words.length(); i++) {
//			char ch = words.charAt(i);
//			
//			if(ch != ' ') {
//				word = word + ch;
//			} else {
//				result = ' ' + word + result;
//				word = "";
//			}
//		}
//		
//		String finalResult = "";
//		for(int i=1; i<result.length(); i++) {
//			finalResult += result.charAt(i);
//		}
//		return finalResult;
		
		
		String[] words = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i= words.length-1; i>=0; i--) {
			sb.append(words[i]).append(" ");
		}
		return sb.toString().trim();
	}
}
