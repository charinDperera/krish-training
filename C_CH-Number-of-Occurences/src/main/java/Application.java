import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		List<Integer> letterList = new ArrayList<>();
		
		System.out.println("Enter Word");
		String word = sc.next();
		
		char[] wordArr = new char[word.length()]; 
		
		for (int i = 0; i < word.length(); i++) {
			wordArr[i] = word.charAt(i);
		}
		
		int x, y;
		char temp;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length() - i - 1; j++) {
				x = wordArr[j];
				y = wordArr[j+1];
				if (x > y) {
					temp = wordArr[j];
					wordArr[j] = wordArr[j + 1];
					wordArr[j+1] = temp;
				}
			}
		}
		
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

}
