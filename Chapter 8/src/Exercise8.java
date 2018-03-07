
public class Exercise8 {
	
	/*
	 * Ted Clifford 3.7.2018
	 */
	
	public static int maxInRange(int[] range, int lowIndex, int highIndex) {	//Finds the max value between two indeces in an array
		
		if (lowIndex == highIndex) {
			return range[lowIndex];
		}
		else
			return maxInRange(range, lowIndex + 1, highIndex);
		
	}
	
	public static int max(int[] range) {	//Finds the max value in an array
		
		return maxInRange(range, 0 , range.length - 1);
		
	}
	
	public static void main(String[] args) {
		

	}

}
