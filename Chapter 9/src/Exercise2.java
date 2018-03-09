/*
 * Ted Clifford 3.7.2018
 */
public class Exercise2 {

	public static int[] letterHist(String string) {	//Creates an histogram based on a string.
		
		int[] hist = new int[26];
		int j;
		
		for(int i=0;i<string.length();i++) {
			j = (int) string.charAt(i);
			if(j > 90 && j < 123) {
				j-=97;	//lower case letters start at 97
				System.out.println(j);
				hist[j]++;
			}
			else if (j > 65) {
				j-=65;	//uppercase letters start at 65
				System.out.println(j);
				hist[j]++;
			}
		}
		return hist;	//Returns histogram
	}
	
	public static void main(String[] args) {
		letterHist("a");
	}

}
