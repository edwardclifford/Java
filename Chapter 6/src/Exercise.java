
public class Exercise {
	
	
	
	public static boolean isTriangle(int a, int b, int c) {
		
		if ((a + b) > c || (a + c) > b || (c + b) > a)
			return(false);
		else
			return(true);
	}
	
	
	
	public static boolean isDivisible(int n, int m) {
		
		if ((n % m) == 0)
			return(true);
		else
			return(false);
	}
	
	
	
	public static void main(String[] args) {

	}
	
	
	
}
