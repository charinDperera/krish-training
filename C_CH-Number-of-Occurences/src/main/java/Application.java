import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Word");
		String word = sc.next();
		
		while(!validation(word)) {
			System.out.println("Try Again");
			
			System.out.println("\n\nEnter Word");
			word = sc.next();
		}
		
		char[] wordArr = new char[word.length()]; 
		
		// Put word into an array
		for (int i = 0; i < word.length(); i++) {
			wordArr[i] = word.charAt(i);
		}
		
		wordArr = removeCase(wordArr);
		
		// Sort the array in alphabetical order
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length() - i - 1; j++) {
				int x = wordArr[j];
				int y = wordArr[j+1];
				if (x > y) {
					char temp = wordArr[j];
					wordArr[j] = wordArr[j + 1];
					wordArr[j+1] = temp;
				}
			}
		}
		
		// Count for each letter and print
		for (int i = 0; i < word.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < word.length(); j++) {
				if (wordArr[i] == wordArr[j])
					count ++;
				
			}
			if((i == 0) || (wordArr[i - 1] != wordArr[i])) 
				System.out.println(wordArr[i] + " -> " + count);
		}
	}
	
	//Method to change all upper case (if any) to lower case
	public static char[] removeCase(char [] wordArr) {
		for (int i = 0; i < wordArr.length; i ++) {
			int x = wordArr[i];
			if (x < 97) {
				x = x + 32;
				wordArr[i] = (char)x;
			}
		}
		
		return wordArr;
	}
	
	// Validation
	public static boolean validation(String input) {
		
		// check for non-English letters
		for(int i = 0; i < input.length(); i ++) {
			int x = input.charAt(i);
			if ( !( ( (x > 65 ) && (x < 92) ) || ( (x > 97) && (x < 124) ) ) ) {
				System.out.println("Only enter a word using the Enlgish Alphabet (No numbers or special characters)");
				return false;
			}
		}
		
		return true;
	}

}
