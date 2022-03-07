
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input sequence of number seperated by a comma (,) not whitespace( )");

		// -----------------------------------------------------------------------------------
		// 							Put Input into a list
		// -----------------------------------------------------------------------------------

		List<Integer> sequence = new ArrayList<>();
		String input = sc.next();

		while (!validation(input)) {
			System.out.println("Try Again");
			System.out.println("\n\nInput sequence of number seperated by a comma (,) not whitespace( )");
			input = sc.next();
		}

		String wholeNum = "";
		int index = 0;

		while (index < input.length()) {

			if (input.charAt(index) != ',')
				wholeNum = wholeNum + input.charAt(index);

			index++;

			if ((index < input.length()) && (input.charAt(index) != ','))
				continue;

			sequence.add(Integer.valueOf(wholeNum));
			wholeNum = "";

		}

		// -----------------------------------------------------------------------------------
		// 							Begin of Sequence Check
		// -----------------------------------------------------------------------------------
		
		int temp;
	
		// Sorting the sequence
		for (int i = 0; i < sequence.size() - 1; i++) {
			for (int j = 0; j < sequence.size() - i - 1; j++) {
				if (sequence.get(j) > sequence.get(j + 1)) {
					temp = sequence.get(j);
					sequence.set(j, sequence.get(j + 1));
					sequence.set(j + 1, temp);
				}
			}
		}

		boolean missing = false;
		for (int i = 0; i < sequence.size() - 1; i++) {
			if (sequence.get(i + 1) != sequence.get(i) + 1) {
				missing = true;
				index = i;
			}
		}

		if (missing) {
			System.out.println("The value " + (sequence.get(index) + 1) + " is missing from the sequence");
		} else {
			// The number missing is either the first or last value of sequence
			if (sequence.get(0) > 1) {
				System.out.println("The value which is missing is either the first or last");
				System.out.println("Which can be either " + (sequence.get(0) - 1) + " or "
						+ (sequence.get(sequence.size() - 1) + 1) + " respectively");
			} else {
				System.out.println(
						"The value " + (sequence.get(sequence.size() - 1) + 1) + " is missing from the sequence");
			}
		}
		
	}


	// -----------------------------------------------------------------------------------
	// 								Begin of Validation
	// -----------------------------------------------------------------------------------
	private static boolean validation(String input) {

		String currentElement = "";
		int index = 0;
		int count = 0;
		while (index < input.length()) {
			
			if (input.charAt(index) != ',')
				currentElement = currentElement + input.charAt(index);

			index++;

			// double checking to get all characters index
			if ((index < input.length()) && (input.charAt(index) != ','))
				continue;
			
			count ++;
			// double checking for validation
			if (index < input.length()) {
				if(input.charAt(index) == ' ') {
					System.out.println("Please do no use whitespaces");
					return false;
				}
				
				try {
					int temp = Integer.valueOf(currentElement);
				} catch (NumberFormatException e) {
					System.out.println("Please do no enter non-numeric termns(With the exception of a comma(,) )");
					return false;
				}
			
				if (Integer.valueOf(currentElement) <= 0) {
					System.out.println("Please enter positive integers only (Should be not 0 as well)");
					return false;
				}
			}

			currentElement = "";

		}
		if (count < 2) {
			System.out.println("It is not a sequence with this amount of numbers");
			return false;
		}
		return true;
	}

}
