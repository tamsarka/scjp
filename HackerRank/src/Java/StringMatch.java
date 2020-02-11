package Java;

public class StringMatch {

	public static void main(String[] args) {
//		StringMatch.matcher("""engine", "england");
		StringMatch.matcher("engine","ravengine", "neol");
	}

	private static int matcher(String prefix, String suffix) {
		char[] preChars = prefix.toCharArray();
		String iteratedChars = "";
		int count = 0;
		int length = suffix.length();
		String matchedChar = "";
		for (char ch : preChars) {
			if (length > count) {
				iteratedChars += ch;
//				System.out.println(iteratedChars);
				String suffixSubstring = suffix.substring(length - (count + 1));
//				System.out.println("suff : "+suffixSubstring);
				if (iteratedChars.equals(suffixSubstring)) {
					matchedChar = suffixSubstring;
				}
				count++;
			}
		}
		System.out.println(matchedChar.length());
		return matchedChar.length();
	}
	
	private static int matcher(String text,String prefix, String suffix) {
		
		
		
		char[] preChars = prefix.toCharArray();
		String iteratedChars = "";
		int count = 0;
		int length = suffix.length();
		String matchedChar = "";
		for (char ch : preChars) {
			if (length > count) {
				iteratedChars += ch;
//				System.out.println(iteratedChars);
				String suffixSubstring = suffix.substring(length - (count + 1));
//				System.out.println("suff : "+suffixSubstring);
				if (iteratedChars.equals(suffixSubstring)) {
					matchedChar = suffixSubstring;
				}
				count++;
			}
		}
		System.out.println(matchedChar.length());
		return matchedChar.length();
	}
}
