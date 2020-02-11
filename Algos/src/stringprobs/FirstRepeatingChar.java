package stringprobs;

public class FirstRepeatingChar {
	public static void main(String[] args) {
		FirstRepeatingChar obj = new FirstRepeatingChar();

		// PROB : 1 Find the first repeating character in the given string
		obj.findFirstLeftMostRepeatedChar("abbdcc");
		
		// PROB : 2 Find the first non repeating character in the given string
		obj.findFirstLeftMostNonRepeatedChar("abbdcc");

	}

	// PROB : Find the first repeating character in the given string
	private void findFirstLeftMostRepeatedChar(String s) {
		char[] charString = s.toCharArray();

		for (char ch : charString) {
			int startingIndex = s.indexOf(ch);
			System.out.println(startingIndex);
			int lastIndex = s.lastIndexOf(ch);
			System.out.println(lastIndex);
			if (startingIndex != lastIndex) {
				System.out.println("the repeated char is :" + ch);
				break;
			}
		}

	}

	// PROB : Find the first non repeating character in the given string
	private void findFirstLeftMostNonRepeatedChar(String s) {
		char[] charString = s.toCharArray();

		for (char ch : charString) {
			int startingIndex = s.indexOf(ch);
			System.out.println(startingIndex);
			int lastIndex = s.lastIndexOf(ch);
			System.out.println(lastIndex);
			if (startingIndex == lastIndex) {
				System.out.println("the non repeated char is :" + ch);
				break;
			}
		}

	}

}
