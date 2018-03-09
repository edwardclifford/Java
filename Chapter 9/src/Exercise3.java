
public class Exercise3 {

	public static int equalParenthesis(String s, char char1, char char2) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == char1) {
				count++;
			} 
			else if (c == char2) {
				count--;
			}
		}
		return count;
	}
		
	public static void main(String[] args) {
		System.out.println(equalParenthesis("(Hello there my darling)", '(', ')'));
	}
	
}
