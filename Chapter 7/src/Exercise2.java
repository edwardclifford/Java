
public class Exercise2 {
	

	public static double squareRoot(double a, double x) {	//returns the approximation of the square root
	
		return((x+a/(x))/2);
						
		}

	public static void main(String[] args) {	//Finds the square root of a number with using an apporoximation equation
		
		double a = 4.0;
		double x = a / 2;
		double y;
		
		do {
			y = x;
			x = squareRoot(a, x);
			
		} while (!(Math.abs(y - x)<.0001));
		
		
		
		System.out.println(x);
		
		
		
	}

}
