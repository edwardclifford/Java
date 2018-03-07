
/*
 * Ted Clifford 3.7.2018
 */
public class Exercise6 {

	public static boolean areFactors(int n, int[] a) {	//Takes a number and a list, and checks if the number is a multiple of all the numbers in a list
		
		int m = 0;
		
		for(int i = 0; i < a.length; i++) {
			if (!(a[i] % n == 0)) {
				m+=1;
			}
		}
		
		if (m>0) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		//Creates a list
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i] = i * 2;
		}
		
		//Prints the results
		System.out.println(areFactors(1, a));
	}

	
}
