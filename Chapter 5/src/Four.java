import java.util.Random;

public class Four {
/**
 * -Ted Clifford 1.19.18
 *
 */
	public static void checkFermat(int a, int b, int c, int n) {
		
		double x = (Math.pow(a, n) + Math.pow(b, n)); //a^n + b^n = c^n 
		boolean y = (x == Math.pow(c, n)); 
		
		if (n > 2 && y) //Checks fermats logic
			System.out.println("Holy smokes, Fermat was wrong!");
		
		else 
			System.out.println("No, that doesn't work");
		
		System.out.println(); //newline
		
		System.out.println("The values were: "); //Shows actual values
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("n = " + n);
		
	}
	public static void main(String[] args) {
		
		Random random = new Random(); //give the 4 values random numbers
        int pickle = (random.nextInt(10) + 1);
		int a = pickle;
		pickle = (random.nextInt(10) + 1);
		int b = pickle;
		pickle = (random.nextInt(10) + 1);
		int c = pickle;
		pickle = (random.nextInt(10) + 1);
		int n = pickle;
		
		checkFermat(a, b, c, n);
	}

}
