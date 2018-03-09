
public class Exercise7 {

	public static boolean isAnagram(String a, String b) {
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		int[] histogramA = new int[26];		//Creates arrays that track the appearences of letters in the strings
		int[] histogramB = new int[26];
		
		for(int i=0;i<a.length();i++) {
			if ((int)a.charAt(i) == 32) {
				continue;	//Exception for (space) key
			}
			else {
				histogramA[(int)(a.charAt(i)-97)]++;
			}
		}
		
		for(int k=0;k<b.length();k++) {
			if ((int)b.charAt(k) == 32) {
				continue;	
			}
			else {
				histogramB[(int)(b.charAt(k)-97)]++;
			}
		}
		
		for(int j=0;j<26;j++) {		//Checks that all values in the historgram are equal
			if (!(histogramA[j] == histogramB[j])) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {

		System.out.println(isAnagram("allen downey", "well annoyed"));
		System.out.println(isAnagram("hello", "mr oldach"));

	}

}
