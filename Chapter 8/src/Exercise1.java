
public class Exercise1 {

	public static void main(String[] args) {
	
		int numbers = 3;	//Amount of objects in the list (counting up from 0)
		int display = 2;	//Which object index to display
	
		double[] a = new double[numbers];
	
		//Assign values to a here:
		for(int i = 0; i < 3; i ++) {
			a[i] = i + 1;
		}
	
		a = square(a);
	
		System.out.println(a[display]);
		
		//Code after this in this main method is dedicated to part 2: creating a histogram
		
		int[] score = new int[3];	//create a new array containing students test scores
		score[0] = 87;
		score[1] = 90;
		score[2] = 90;

		int[] histogram = histogram(score);
		System.out.println(histogram[90]);	//display the amount of test scores with the current value
	}
	
	
	public static double[] square(double[] a) {	//squares each value in a[]
	

		for (int i = 0; i < a.length; i++) {
			a[i] = Math.pow(a[i], 2.0);
		}
	
		return(a);
	
	}
	
	public static int[] histogram(int[] scores) { //returns a histogram of test scores
		
		int[] counts = new int[100];
		for (int score : scores) {
		    counts[score]++;
		}
		
		return(counts);
	}
}
