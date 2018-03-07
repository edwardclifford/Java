import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {
		//test values of an array using a random array
		int[] array = randomArray(100);
		//print the results
		System.out.println(indexOfMax(array));
	}
	
	public static int indexOfMax(int[] a) {	//returns the index of the largest value in an array
		
		int index = 0;
		int max = 0;
		
		for(int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				index = i;
				max = a[i];
			}
		}
		
		return index;
		
	}
	
	public static int[] randomArray(int size) {	//generates a random array
	    Random random = new Random();
	    int[] a = new int[size];
	    for (int i = 0; i < a.length; i++) {
	        a[i] = random.nextInt(100);
	    }
	    return a;
	}
	
}
