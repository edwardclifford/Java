
public class Exercise6 {
	
	//Takes a string and returns true if the string is "doubloon"
	public static boolean isDoubloon(String s) {
		s = s.toLowerCase();
		int[] histogram = new int[26];	//Creates an array that tracks the appearences of letters in a string
			
		for(int i=0;i<s.length();i++) {	//Tracks letters in a string
			histogram[(int)(s.charAt(i)-97)]++;
		}

		for(int j=0;j<26;j++) {		//Checks that all values in the historgram are zero or two
			if (!(histogram[j] % 2 == 0)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println(isDoubloon("Shanghaiings"));
		System.out.println(isDoubloon("Cruisers"));
	}

}
