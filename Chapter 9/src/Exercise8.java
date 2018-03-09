/*
 * This exercise will take the same logic used in #7, except that instead of checking if the histogram
 * arrays are equal, one's values will only need to be smaller than or equal to the other.
 */
public class Exercise8 {

public static boolean scrabble(String a, String b) {
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		int[] histogramA = new int[26];		//Creates arrays that track the appearences of letters in the strings
		int[] histogramB = new int[26];
		
		for(int i=0;i<a.length();i++) {
				histogramA[(int)(a.charAt(i)-97)]++;
		}
		
		for(int k=0;k<b.length();k++) {
			histogramB[(int)(b.charAt(k)-97)]++;
		}
		
		for(int j=0;j<26;j++) {		//Checks that the values in histogramA are less than or equal to the values in histogramB
			if (!(histogramA[j] <= histogramB[j])) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		//Check for words in a sequence using 'scrabble(word, sequence)'
		System.out.println(scrabble("jib", "quijibo"));
		System.out.println(scrabble("mark", "quijibo"));

	}

}
